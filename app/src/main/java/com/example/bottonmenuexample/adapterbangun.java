package com.example.bottonmenuexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapterbangun extends RecyclerView.Adapter<adapterbangun.ViewHolder>{

    List<item> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    public adapterbangun(Context context, List<item> listData){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public adapterbangun.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterbangun.ViewHolder holder, int position) {
        item item = listData.get(position);
        holder.tvTitle.setText(item.getNamaBangunn());
        holder.tvDesc.setText(item.getDescBangunn());
        Glide.with(holder.itemView.getContext()).load(item.getImageBangun()).into(holder.ivBangun);
    }

    @Override
    public int getItemCount() {return listData.size();}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvTitle,tvDesc;
        ImageView ivBangun;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.Tvtitle);
            tvDesc = itemView.findViewById(R.id.Tvdescription);
            ivBangun = itemView.findViewById(R.id.Ivimage);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public item getItem(int id) {
        return listData.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
