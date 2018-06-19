package cn.xiaolong.ticketsystem.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import cn.xiaolong.ticketsystem.R;
import cn.xiaolong.ticketsystem.base.BaseActivity;
import cn.xiaolong.ticketsystem.ui.MainActivity;

/**
 * Created by pang on 18/6/18.
 */

public class LoginActivity extends BaseActivity{

    Button btn_login;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        btn_login=(Button) findViewById(R.id.btn_login);
    }

    @Override
    protected void setListener() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}
