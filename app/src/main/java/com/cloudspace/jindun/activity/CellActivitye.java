package com.cloudspace.jindun.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cloudspace.jindun.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CellActivitye extends AppCompatActivity {

    @Bind(R.id.back)
    ImageView mBack;
    @Bind(R.id.call_text_title)
    TextView mCallTextTitle;
    @Bind(R.id.call_et)
    EditText mCallEt;
    @Bind(R.id.call_bt)
    Button mCallBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cell_activitye);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.back, R.id.call_bt})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.call_bt:
                Intent intent = new Intent();
                String call = mCallEt.getText().toString();
                intent.setClass(CellActivitye.this, WdActivity.class);

                startActivity(intent);
                break;
        }
    }
}
