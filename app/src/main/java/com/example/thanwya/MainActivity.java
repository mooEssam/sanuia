package com.example.thanwya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase fd=FirebaseDatabase.getInstance();
        DatabaseReference dbr= fd.getReference();
        dbr.child("users");
        dbr.push().setValue("mohamed");

        TextView araby=findViewById(R.id.araby);
        araby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arabic=new Intent(MainActivity.this,data.class);
                arabic.putExtra("book","https://forums.exam-eg.com/threads/19727/");
                arabic.putExtra("explain","https://www.youtube.com/watch?v=4nJXQ04CKgw&list=PLdqVMYpRqXPtdCweuD_bKPQeW2q1VoIj_");
                arabic.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(arabic);
            }
        });
        final TextView english,frensh,german,math,chim,phys,bio,giol,statics,meka,tfadl;
        frensh=findViewById(R.id.frensh);
        frensh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frensh=new Intent(MainActivity.this,data.class);
       frensh.putExtra("book","https://drive.google.com/file/d/0B6YzqAIcCIyZZGlvUF9SYy15ZWs/view");
      frensh.putExtra("explain","https://www.youtube.com/watch?v=TukNDpIfx0Q&list=PLdqVMYpRqXPumWv45BbzgVJyUpscc9hSh");
      frensh.putExtra("Exams","http://elearning1.moe.gov.eg/sec/semester2/Grade3/last_years_Exams/2018/1/french/french_first_language_3sec_A_2018.pdf");
            startActivity(frensh);
            }
        });
        german=findViewById(R.id.germany);
        german.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Jerman=new Intent(MainActivity.this,data.class);
          Jerman.putExtra("book","https://forums.exam-eg.com/threads/19725/");
          Jerman.putExtra("explain","https://www.youtube.com/watch?v=om5PUf_b-jE&list=PLdqVMYpRqXPsgDLpgs6UvB4FuBs4gVsIT");
          Jerman.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(Jerman);
            }
        });
        math=findViewById(R.id.math);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math=new Intent(MainActivity.this,data.class);
                math.putExtra("book","https://forums.exam-eg.com/threads/19719/");
                math.putExtra("explain","https://www.youtube.com/watch?v=ZrwEFln7SWw&list=PLdqVMYpRqXPu_m02CxiPhnBvOjf-CW3xf");
                math.putExtra("Exams","http://elearning1.moe.gov.eg/sec/semester2/Grade3/last_years_Exams/2018/1/german/german_first_language_3sec_A_2018.pdf");
                startActivity(math);
            }
        });
        chim=findViewById(R.id.chim);
        chim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chim=new Intent(MainActivity.this,data.class);
                chim.putExtra("book","https://forums.exam-eg.com/threads/19720/");
                chim.putExtra("explain","https://www.youtube.com/watch?v=FZVng8F2ATA&list=PLdqVMYpRqXPvF0AzcGDkzH_FxjBdmA74V");
                chim.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQWjcxWThjMnROblk/view");
                startActivity(chim);

            }
        });
        phys=findViewById(R.id.physics);
        phys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent physic=new Intent(MainActivity.this,data.class);
           physic.putExtra("book","https://forums.exam-eg.com/threads/19721/");
            physic.putExtra("explain","https://www.youtube.com/watch?v=TnsV_yzgJXk&list=PLdqVMYpRqXPsNmgyFWm7CNEnrwq4XFRP3");
           physic.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");

                startActivity(physic);
            }
        });
        bio=findViewById(R.id.biology);
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bio=new Intent(MainActivity.this,data.class);
                bio.putExtra("book","https://forums.exam-eg.com/threads/19722/");
                bio.putExtra("explain","https://www.youtube.com/watch?v=hjDuukp6FZM&list=PLdqVMYpRqXPtQtHR4xYRoiagFrvL9BwK4");
                bio.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(bio);
            }
        });
        giol=findViewById(R.id.jiology);
        giol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jio=new Intent(MainActivity.this,data.class);
               jio.putExtra("book","https://forums.exam-eg.com/threads/19723/");
            jio.putExtra("explain","https://www.youtube.com/watch?v=pYDcP5uFgss&list=PLdqVMYpRqXPumd_UtPmIfdpJZ7iMYoFfR");
               jio.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(jio);
            }
        });
        statics=findViewById(R.id.statics);
        statics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stat=new Intent(MainActivity.this,data.class);
                stat.putExtra("book","https://forums.exam-eg.com/threads/19731/");
                stat.putExtra("explain","https://www.youtube.com/watch?v=_pZddBLHxe0&list=PLdqVMYpRqXPvop_QJVNLcrqQSE2SbWsd5&index=2\"");
                stat.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(stat);
            }
        });


        english=findViewById(R.id.eng);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eng =new Intent(MainActivity.this,data.class);
               eng.putExtra("book","https://forums.exam-eg.com/threads/19727/");
                eng.putExtra("explain","https://www.youtube.com/watch?v=_pZddBLHxe0&list=PLdqVMYpRqXPvop_QJVNLcrqQSE2SbWsd5&index=2");
                eng.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(eng);
            }
        });
        meka=findViewById(R.id.meka);
        meka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meka =new Intent(MainActivity.this,data.class);
                meka.putExtra("book","https://forums.exam-eg.com/threads/19711/");
                meka.putExtra("explain","https://www.youtube.com/watch?v=5nNF0gd0r8k&list=PLdqVMYpRqXPuZlpzUkBHJPvUzVNIl5uHs");
                meka.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(meka);

            }
        });
        tfadl=findViewById(R.id.tfadl);
        meka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tf =new Intent(MainActivity.this,data.class);
                tf.putExtra("book","https://forums.exam-eg.com/threads/21972/");
                tf.putExtra("explain","https://www.youtube.com/watch?v=JY1Bfl_vC3g&list=PLdqVMYpRqXPvXcZbOsq8El9lJDJH1346p");
                tf.putExtra("Exams","https://drive.google.com/file/d/0B3DnElbMl0yQa21pR2FDbHVSdW8/view");
                startActivity(tf);

            }
        });

    }



}
