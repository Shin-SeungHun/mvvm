package com.ssh.mvvm;

import android.app.Activity;
import android.widget.TextView;

import com.ssh.mvvm.data.Model;

public class ViewModel {
    private Activity activity;
    private Model model;
    private TextView textView;

    ViewModel(Activity activity){
        this.activity = activity;
        this.model = new Model();
        initView();
    }

    private void initView(){

        //View의 표현과 Model과의 상호작용
        textView = activity.findViewById(R.id.text_view);
        textView.setOnClickListener(view -> {
            textView.setText(model.clikedButton());
        });
    }
}
