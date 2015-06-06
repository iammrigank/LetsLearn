package com.example.mriganka.letslearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by mriganka on 6/2/15.
 */
public abstract class _CommonGridImageAdapter extends BaseAdapter {
    private Context currentContext;

    public _CommonGridImageAdapter(Context context) {
        currentContext = context;
    }

    protected abstract int getCountForTotalObjects();
    protected abstract String getImageResourceURI(int position);

    @Override
    public int getCount() {
        return getCountForTotalObjects();
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(currentContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85)); // Height and Breadth of each image
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(getImageResourceId(position));
        return imageView;
    }

    private int getImageResourceId(int position) {
        return  currentContext.getResources().getIdentifier(
                    getImageResourceURI(position),
                    "drawable",
                    currentContext.getPackageName()
                );
    }

    // Not needed: Hence no implementation
    @Override
    public Object getItem(int position) {
        return null;
    }

    // Not needed: Hence no implementation
    @Override
    public long getItemId(int position) {
        return 0;
    }
}
