package com.example.labo2ejer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout panel1;
    private LinearLayout panel2;
    private LinearLayout panel3;

    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {




            switch (v.getId()){

                case R.id.panel1:
                    cont1++;
                    switch (cont1){

                        case 1:  panel1.setBackgroundColor(getResources().getColor(R.color.color1Panel1));
                            break;
                        case 2:  panel1.setBackgroundColor(getResources().getColor(R.color.color2Panel1));
                            break;
                        case 3:  panel1.setBackgroundColor(getResources().getColor(R.color.color3Panel1));
                            break;
                        case 4:  panel1.setBackgroundColor(getResources().getColor(R.color.color4Panel1));
                            break;
                        case 5:  panel1.setBackgroundColor(getResources().getColor(R.color.color5Panel1));
                            break;
                        case 6:  panel1.setBackgroundColor(getResources().getColor(R.color.color6Panel1));
                            break;
                        case 7:  panel1.setBackgroundColor(getResources().getColor(R.color.color6Panel1));
                        cont1=0;
                            break;

                    }

                    break;

                case R.id.panel2:
                    cont2++;
                    switch (cont2){
                        case 1:  panel2.setBackgroundColor(getResources().getColor(R.color.color1Panel2));
                            break;
                        case 2:  panel2.setBackgroundColor(getResources().getColor(R.color.color2Panel2));
                            break;
                        case 3:  panel2.setBackgroundColor(getResources().getColor(R.color.color3Panel2));
                            break;
                        case 4:  panel2.setBackgroundColor(getResources().getColor(R.color.color4Panel2));
                            break;
                        case 5:  panel2.setBackgroundColor(getResources().getColor(R.color.color5Panel2));
                            break;
                        case 6:  panel2.setBackgroundColor(getResources().getColor(R.color.color6Panel2));
                            break;

                        case 7:  panel2.setBackgroundColor(getResources().getColor(R.color.color6Panel2));
                            cont2=0;
                            break;
                    }
                    break;

                case R.id.panel3:

                    cont3++;
                    switch (cont3){
                        case 1:  panel3.setBackgroundColor(getResources().getColor(R.color.color1Panel3));
                            break;
                        case 2:  panel3.setBackgroundColor(getResources().getColor(R.color.color2Panel3));
                            break;
                        case 3:  panel3.setBackgroundColor(getResources().getColor(R.color.color3Panel3));
                            break;
                        case 4:  panel3.setBackgroundColor(getResources().getColor(R.color.color4Panel3));
                            break;
                        case 5:  panel3.setBackgroundColor(getResources().getColor(R.color.color5Panel3));
                            break;
                        case 6:  panel3.setBackgroundColor(getResources().getColor(R.color.color6Panel3));
                            break;
                        case 7:  panel3.setBackgroundColor(getResources().getColor(R.color.color6Panel3));
                            cont3=0;
                            break;
                    }
                    break;



            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel1 = (LinearLayout) findViewById(R.id.panel1);
        panel1.setOnClickListener(clickListener);
        panel2 = (LinearLayout) findViewById(R.id.panel2);
        panel2.setOnClickListener(clickListener);
        panel3 = (LinearLayout) findViewById(R.id.panel3);
        panel3.setOnClickListener(clickListener);


    }
}
