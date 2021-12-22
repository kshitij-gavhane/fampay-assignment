package com.kshitijgavhane.fampay.ui.views

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.kshitijgavhane.fampay.R
import com.kshitijgavhane.fampay.data.api.ApiHelper
import com.kshitijgavhane.fampay.data.api.ApiServiceImpl
import com.kshitijgavhane.fampay.ui.adapters.ContextualCardsAdapter
import com.kshitijgavhane.fampay.ui.adapters.ContextualCardsAdapter.OnItemRemoveListener
import com.kshitijgavhane.fampay.ui.viewmodels.CardGroupViewModel
import com.kshitijgavhane.fampay.ui.viewmodels.ViewModelFactory
import com.kshitijgavhane.fampay.utils.Status
import java.util.*

class MainActivity : AppCompatActivity(), OnItemRemoveListener {
    private lateinit var contextualCardsAdapter: ContextualCardsAdapter
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var cardGroupViewModel: CardGroupViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Objects.requireNonNull(supportActionBar)!!.title = getString(R.string.fampay)
        setupUI()
        setupViewModel()
        setupObserver()
    }

    private fun setupUI() {
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setCustomView(R.layout.action_bar)
        supportActionBar?.setBackgroundDrawable( ColorDrawable(resources.getColor(R.color.white)))
        recyclerView = findViewById(R.id.contextual_cards_rv)
        contextualCardsAdapter = ContextualCardsAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contextualCardsAdapter
        contextualCardsAdapter.setOnItemRemoveListener(this)
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)
        swipeRefreshLayout.setOnRefreshListener { refreshList() }
    }

    private fun setupObserver() {
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        cardGroupViewModel.getCards().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    it.data?.let { cards ->
                        contextualCardsAdapter.setCardGroupList(cards.cardGroupList!!.toMutableList())
                    }
                    if(recyclerView.visibility==View.GONE)
                        recyclerView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                }
                Status.ERROR -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun setupViewModel() {
        cardGroupViewModel = ViewModelProviders.of(this, ViewModelFactory(ApiHelper(ApiServiceImpl()))).get(CardGroupViewModel::class.java)
        cardGroupViewModel.init()
    }

    private fun refreshList() {
        cardGroupViewModel.fetchCardGroupList()
        contextualCardsAdapter = ContextualCardsAdapter()
        contextualCardsAdapter.notifyDataSetChanged()
        swipeRefreshLayout.isRefreshing = false
    }

    override fun onItemRemoved(position: Int) {
        Toast.makeText(applicationContext, "Item removed", Toast.LENGTH_SHORT).show()
    }
}