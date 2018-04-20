package me.kungfucat.pagetransformerslibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class ViewPagerFragment extends Fragment {


    public ViewPagerFragment() {
        // Required empty public constructor
    }

    public static ViewPagerFragment newInstance(Integer color, int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putInt("color", color);
        ViewPagerFragment fragment = new ViewPagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle bundle = getArguments();
        int color = bundle.getInt("color"), position = bundle.getInt("position");


        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        FrameLayout layout = view.findViewById(R.id.rootLayout);
        TextView textView = view.findViewById(R.id.textView);

        textView.setText(String.valueOf(position));
        layout.setBackgroundColor(color);

        return view;

    }

}
