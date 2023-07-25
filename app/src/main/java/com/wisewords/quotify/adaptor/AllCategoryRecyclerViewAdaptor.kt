package com.wisewords.quotify.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.wisewords.quotify.R
import com.wisewords.quotify.repository.all.AllCategoryItem

class AllCategoryRecyclerViewAdaptor(private val allCategoryQuoteList: List<AllCategoryItem>?, val context: Context) : RecyclerView.Adapter<MyViewHolderSearch>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderSearch {
        val layoutInflator = LayoutInflater.from(parent.context)
        val listItem = layoutInflator.inflate(R.layout.quote_card_view, parent, false)
        return MyViewHolderSearch(listItem)
    }

    override fun getItemCount(): Int {
        return allCategoryQuoteList!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolderSearch, position: Int) {
        var index_element = allCategoryQuoteList!![position]
        holder.quoteText.text = index_element.text
        holder.quoteAuthor.text = "- "+index_element.author
    }
}

class MyViewHolderSearch(val view: View): RecyclerView.ViewHolder(view){
    val quoteText = view.findViewById<TextView>(R.id.quoteText)
    val quoteAuthor = view.findViewById<TextView>(R.id.quoteAuthor)
    val btnShare = view.findViewById<FloatingActionButton>(R.id.btnShare)
}

