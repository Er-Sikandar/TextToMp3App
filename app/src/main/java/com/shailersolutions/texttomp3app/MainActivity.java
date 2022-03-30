package com.shailersolutions.texttomp3app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private EditText et_txt;
private Button btn_convert;
TextToSpeech tts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    et_txt=findViewById(R.id.et_txt);
    btn_convert=findViewById(R.id.btn_convert);
    btn_convert.setOnClickListener(view -> {
    tts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int i) {
       if (i==TextToSpeech.SUCCESS){
    tts.setLanguage(Locale.ENGLISH);
   tts.setSpeechRate(1.0f);
   tts.speak(et_txt.getText().toString().trim(),TextToSpeech.QUEUE_ADD,null);


       }


        }
    });
    });


    }
}