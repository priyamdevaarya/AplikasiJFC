package com.example.jfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AktivitasDetail extends AppCompatActivity {
    ImageView imageView;
    TextView name, role;
    String playername,playerrole;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_aktivitas);
        imageView=findViewById(R.id.image);
        name=findViewById(R.id.name);
        role=findViewById(R.id.role);

        playername=getIntent().getStringExtra("name");
        playerrole=getIntent().getStringExtra("role");
        image=getIntent().getIntExtra("image",0);

        name.setText(playername);
        role.setText(playerrole);
        imageView.setImageResource(image);
    }
}