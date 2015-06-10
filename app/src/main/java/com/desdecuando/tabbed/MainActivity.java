package com.desdecuando.tabbed;

import android.app.Activity;
import android.os.Bundle;

public interface Tabs {

    public void moveToTab1();
    public void moveToTab2();
    public void moveToTab3();
    public void moveToTab4();
}
public class MainActivity extends Activity implements Tabs {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    @Override
    public void moveToTab1() {
        startActivity();
        finish();
    }

    @Override
    public void moveToTab2() {

    }

    @Override
    public void moveToTab3() {

    }

    @Override
    public void moveToTab4() {

    }
}
