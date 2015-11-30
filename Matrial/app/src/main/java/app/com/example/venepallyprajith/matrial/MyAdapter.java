package app.com.example.venepallyprajith.matrial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Venepally Prajith on 16-11-2015.
 */
public class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private ArrayList<String> mData;
    public static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        public TextView pos;

        ViewHolder(View itemView) {
            super(itemView);

            pos = (TextView)itemView.findViewById(R.id.day);

        }
    }

    public MyAdapter(ArrayList<String> myData) {
        mData=myData;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final String name = mData.get(position);
        holder.pos.setText(mData.get(position));

    }
    @Override
    public int getItemCount() {
        return mData.size();
    }


}
