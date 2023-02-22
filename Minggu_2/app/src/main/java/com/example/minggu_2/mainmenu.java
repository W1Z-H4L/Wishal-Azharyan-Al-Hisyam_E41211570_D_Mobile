package com.example.minggu_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.view.View;

public class mainmenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
}
    public void menu(View view){
        Intent intent = new Intent(mainmenu.this,linearlayout.class);

        startActivity(intent);
    }
    public void menu2(View view){
        Intent intent = new Intent(mainmenu.this,relativelayout.class);

        startActivity(intent);
    }
    public void menu3(View view){
        Intent intent = new Intent(mainmenu.this,customize.class);

        startActivity(intent);
    }

    public void menu4(View view){
        Intent intent = new Intent(mainmenu.this,framelayout.class);

        startActivity(intent);
    }

    public void menu5(View view){
        Intent intent = new Intent(mainmenu.this,tabellayout.class);

        startActivity(intent);
    }
    public void menu6(View view){
        Intent intent = new Intent(mainmenu.this,materialdesign.class);

        startActivity(intent);
    }
    public void menu7(View view){
        Intent intent = new Intent(mainmenu.this,horizontallscroll.class);

        startActivity(intent);
    }
    public void menu8(View view){
        Intent intent = new Intent(mainmenu.this,verticalscroll.class);

        startActivity(intent);
    }


}

