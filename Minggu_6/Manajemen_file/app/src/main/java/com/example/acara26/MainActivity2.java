package com.example.acara26;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class MainActivity2 extends AppCompatActivity {
    TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showText = (TextView) findViewById(R.id.getText);
    }
    public void back(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
    public void getPublic(View view) {
       File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
       File myfile = new File(folder, "myData1.txt");
       String text = getData(myfile);
       if (text != null) {
           showText.setText(text);
       }else{
           showText.setText("No Data");
       }
    }
    public void getPrivate(View view){

        File folder = getExternalFilesDir("wishal");
        File myfile = new File(folder, "myData2.txt");
        String text = getData(myfile);
        if (text != null) {
            showText.setText(text);
        }else {
            showText.setText("No Data");
        }
    }

    private String getData(File myfile) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myfile);
            int i = -1;
            StringBuffer buffer = new StringBuffer();
            while ((i = fileInputStream.read()) != -1) {
                buffer.append((char) i);
            }
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

