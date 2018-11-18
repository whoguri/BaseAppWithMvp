package com.whoguri.learnmvp.ui.home;

// whoGuri 3/11/18

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whoguri.learnmvp.R;
import com.whoguri.learnmvp.javaBase.BaseFragment;
import com.whoguri.learnmvp.javaBase.findView.FindView;
import com.whoguri.learnmvp.javaBase.findView.Finder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeFragment extends BaseFragment implements HomeView {
    @FindView(viewId = R.id.homeButton)
    Button homeButton;

    HomePresenter presenter=new HomePresenter(this);
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Finder.startFinder(this,view);
        activityListener.showToast("yoo");
        presenter.getPost();
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             activityListener.showToast("reflection is working");
            }
        });
    }

    @Override
    public void exit() {

    }

    @Override
    public void showSearch() {

    }

    @Override
    public void showPost(@NotNull ArrayList<String> list) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}
