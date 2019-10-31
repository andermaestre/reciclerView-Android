package com.example.recilerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<AndroidVersion> lista= new ArrayList<>();
    int []apis;
    int []years;
    RecyclerView rv;
    int drawableId;
    String[] fotoNombres;
    String []names;
    String []versions;
    RecyclerView.LayoutManager lm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.reciview);


        lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);
        apis = getResources().getIntArray(R.array.apis);
        years = getResources().getIntArray(R.array.periodos);
        //drawableId = getResources().getIntArray(R.array.drawableIds);
        names = getResources().getStringArray(R.array.nombres);
        versions = getResources().getStringArray(R.array.versiones);
        fotoNombres=getResources().getStringArray(R.array.drawableIds);


        for (int i=0;i<apis.length-1;i++) {
            drawableId=getResources().getIdentifier(fotoNombres[i],"drawable",this.getPackageName());
            lista.add(new AndroidVersion(names[i],versions[i],apis[i],years[i],drawableId));
        }
        RecyclerVersionArrayAdapter adp = new RecyclerVersionArrayAdapter(this,R.layout.reciclerbox, lista);

        rv.setAdapter(adp);

    }
}
