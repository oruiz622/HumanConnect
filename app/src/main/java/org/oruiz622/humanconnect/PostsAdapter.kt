package org.oruiz622.humanconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = 20

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

    }

}