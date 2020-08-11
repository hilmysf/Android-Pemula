package com.dicoding.picodiploma.laligasantander

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewClubAdapter(private val listClub: ArrayList<Club>) : RecyclerView.Adapter<CardViewClubAdapter.CardViewViewHolder>() {

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName : TextView = itemView.findViewById((R.id.tv_item_name))
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_club, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listClub.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val (name, detail, photo, ground, coach)  = listClub[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context
        holder.btnDetail.setOnClickListener{Toast.makeText(holder.itemView.context, "Kamu memilih " + listClub[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL, detail)
            moveDetail.putExtra(DetailActivity.EXTRA_LOGO, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_GROUND, ground)
            moveDetail.putExtra(DetailActivity.EXTRA_COACH, coach)
            mContext.startActivity(moveDetail)
        }
    }
}