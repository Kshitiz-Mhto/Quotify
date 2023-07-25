package com.wisewords.quotify.adaptor

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.wisewords.quotify.R
import com.wisewords.quotify.repository.exceptall.ExceptAllCategoryItem

class ExceptAllCategoryRecyclerViewAdaptor(private val exceptAllCategoryQuoteList: List<ExceptAllCategoryItem>?, val context: Context) : RecyclerView.Adapter<MyViewHolderSearch>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderSearch {
        val layoutInflator = LayoutInflater.from(parent.context)
        val listItem = layoutInflator.inflate(R.layout.quote_card_view, parent, false)
        return MyViewHolderSearch(listItem)
    }

    override fun getItemCount(): Int {
        return exceptAllCategoryQuoteList!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolderSearch, position: Int) {
        var index_element = exceptAllCategoryQuoteList!![position]
        holder.quoteText.text = index_element.text
        holder.quoteAuthor.text = "- " +index_element.author
    }
}