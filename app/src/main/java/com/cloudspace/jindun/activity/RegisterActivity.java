package com.cloudspace.jindun.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cloudspace.jindun.R;
import com.cloudspace.jindun.view.CircleImageView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.register_loge)
    CircleImageView mRegisterLoge;
    @Bind(R.id.register_et_id)
    EditText mRegisterEtId;
    @Bind(R.id.register_et_prass)
    EditText mRegisterEtPrass;
    @Bind(R.id.register_bt_showpass)
    Button mRegisterBtShowpass;
    @Bind(R.id.register_bt_showpass_up)
    Button mRegisterBtShowpassUp;
    @Bind(R.id.register_tv_forgetpass)
    TextView mRegisterTvForgetpass;
    private boolean isshow=true;
    private String idEtText="1";
    private String passEtText="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }



    @OnClick({R.id.register_loge, R.id.register_bt_showpass, R.id.register_bt_showpass_up, R.id.register_tv_forgetpass})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register_loge:

                break;
            case R.id.register_bt_showpass:

                //inputType
                if (isshow){
                    mRegisterEtPrass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    mRegisterBtShowpass.setText("隐藏密码");
                    isshow=false;
                }else {
                    mRegisterEtPrass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    mRegisterBtShowpass.setText("显示密码");
                    isshow=true;
                }

                break;
            case R.id.register_bt_showpass_up:
                idEtText=mRegisterEtId.getText().toString();
                passEtText=mRegisterEtPrass.getText().toString();

                Intent intent = new Intent();
                intent.setClass(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.register_tv_forgetpass:

                Intent intent2 = new Intent();
                intent2.setClass(RegisterActivity.this, ForgetpassActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
