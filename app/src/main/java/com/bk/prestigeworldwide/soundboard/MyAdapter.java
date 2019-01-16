package com.bk.prestigeworldwide.soundboard;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abdalla on 1/12/18.
 */

public class MyAdapter extends RecyclerView.Adapter<SoundViewHolder> {

    private Context mContext;
    private List<SoundData> mSoundList;

    MyAdapter(Context mContext, List<SoundData> mSoundList) {
        this.mContext = mContext;
        this.mSoundList = mSoundList;
    }

    @Override
    public SoundViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row_item, parent, false);
        return new SoundViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final SoundViewHolder holder, final int position) {
        holder.mImage.setImageResource(mSoundList.get(position).getSoundImage());
        holder.mTitle.setText(mSoundList.get(position).getSoundName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent mIntent = new Intent(mContext, DetailActivity.class);
////                mIntent.putExtra("Title", mSoundList.get(holder.getAdapterPosition()).getSoundName());
////                mIntent.putExtra("Description", mSoundList.get(holder.getAdapterPosition()).getSoundDescription());
////                mIntent.putExtra("Image", mSoundList.get(holder.getAdapterPosition()).getSoundImage());
////                mContext.startActivity(mIntent);

                playAudio(mSoundList.get(position).getAudioFile());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSoundList.size();
    }

    public void playAudio(int audioFile) {
        final MediaPlayer mp = MediaPlayer.create(mContext, audioFile);
        mp.start();
    }
}

class SoundViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    CardView mCardView;

    SoundViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}
