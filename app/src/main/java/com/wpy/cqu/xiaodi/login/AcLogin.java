package com.wpy.cqu.xiaodi.login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.wpy.cqu.xiaodi.R;
import com.wpy.cqu.xiaodi.base_activity.StatusBarAppComptActivity;
import com.wpy.cqu.xiaodi.register.AcRegisterVertifyCode;

public class AcLogin extends StatusBarAppComptActivity {

    private static final int StatusColor = Color.parseColor("#3d6f52");

    private EditText metAccount;

    private EditText metPass;

    private Button mbtnLogin;

    private TextView mtvForgetPass;

    private TextView mtvRegister;

    private ImageView mivQQLogin;

    private ImageView mivWeiboLogin;

    private ImageView mivWeixinLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = new Bundle();
        bundle.putInt(StatusBarAppComptActivity.STATUS_COLOR_STR,StatusColor);
        super.onCreate(bundle);
        setContentView(R.layout.ac_login);
        initView();
        initEvent();
    }

    private void login(View v){

    }

    private void forgetPass(View v){


    }

    private void register(View v){
        Logger.d(v);
        toNextAc(AcRegisterVertifyCode.class);
    }

    private void qqLogin(View v){

    }

    private void weiboLogin(View v){

    }

    private void weixinLogin(View v){

    }

    private void initView(){
        metAccount = (EditText) findViewById(R.id.id_ac_login_et_username);
        metPass = (EditText) findViewById(R.id.id_ac_login_et_password);
        mbtnLogin = (Button) findViewById(R.id.id_ac_login_btn_login);
        mtvForgetPass = (TextView) findViewById(R.id.id_ac_login_tv_forget_password);
        mtvRegister = (TextView) findViewById(R.id.id_ac_login_tv_registor);
        mivQQLogin = (ImageView) findViewById(R.id.id_ac_login_iv_qq);
        mivWeiboLogin = (ImageView) findViewById(R.id.id_ac_login_iv_weibo);
        mivWeixinLogin = (ImageView) findViewById(R.id.id_ac_login_iv_wechat);
    }

    private void initEvent(){
        mbtnLogin.setOnClickListener(this::login);
        mtvForgetPass.setOnClickListener(this::forgetPass);
        mtvRegister.setOnClickListener(this::register);
        mivQQLogin.setOnClickListener(this::qqLogin);
        mivWeiboLogin.setOnClickListener(this::weiboLogin);
        mivWeixinLogin.setOnClickListener(this::weixinLogin);
    }

    private void toNextAc(Class<?> nextAc) {
        Intent intent = new Intent(this, nextAc);
        startActivity(intent);
    }
}
