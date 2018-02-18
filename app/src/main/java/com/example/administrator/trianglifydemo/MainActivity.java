package com.example.administrator.trianglifydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sdsmdg.kd.trianglify.models.Palette;
import com.sdsmdg.kd.trianglify.views.TrianglifyView;

public class MainActivity extends AppCompatActivity {

    public TrianglifyView trianglifyView;
    public TrianglifyView trianglifyView2;
    public TrianglifyView trianglifyView3;
    public TrianglifyView trianglifyView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        trianglifyView = findViewById(R.id.trianglify_main_view);
        trianglifyView.setPalette(Palette.getPalette(1));

        trianglifyView2 = findViewById(R.id.trianglify_main_view2);
        trianglifyView2.setPalette(Palette.getPalette(23));

        trianglifyView3 = findViewById(R.id.trianglify_main_view3);
        trianglifyView3.setPalette(Palette.getPalette(3));

        trianglifyView4 = findViewById(R.id.trianglify_main_view4);
        trianglifyView4.setPalette(Palette.getPalette(16));
    }
}
