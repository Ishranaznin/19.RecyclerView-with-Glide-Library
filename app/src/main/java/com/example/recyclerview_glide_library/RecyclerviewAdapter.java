package com.example.recyclerview_glide_library;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static java.lang.System.load;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    private static final String TAG="RecyclerviewAdapter";
    private ArrayList<String>mImageName;
    private ArrayList<String>mImage;
    private Context mContext;
    public RecyclerviewAdapter(Context mContext,ArrayList<String>mImage, ArrayList<String>mImageName  ) {
        this.mContext = mContext;
        this.mImage = mImage;
        this.mImageName = mImageName;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.second,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    Log.d(TAG,"onBindViewHolder:called");
        viewHolder.imageName.setText(mImageName.get(i));
        Glide.with(mContext)
            .asBitmap()
            .load(mImage.get(i))
                .into(viewHolder.image);

    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
       CircleImageView image;
       TextView imageName;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           image=itemView.findViewById(R.id.image);
           imageName=itemView.findViewById(R.id.imagename);
       }
   }

}
