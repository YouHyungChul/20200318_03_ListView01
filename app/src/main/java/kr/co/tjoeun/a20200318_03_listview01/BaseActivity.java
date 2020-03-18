package kr.co.tjoeun.a20200318_03_listview01;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

//abstract 메쏘드를 가지는 클래스는 반드시 abstract class 로 만들어야 함.
public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;
    public abstract void setupEvents();
    public abstract void setValues();

}
