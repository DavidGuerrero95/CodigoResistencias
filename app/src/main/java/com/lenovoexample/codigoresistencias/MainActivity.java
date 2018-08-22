package com.lenovoexample.codigoresistencias;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView cafe1, rojo1, naranja1, amarillo1, verde1, azul1, violeta1, gris1, blanco1;
    private ImageView negro2, cafe2, rojo2, naranja2, amarillo2, verde2, azul2, violeta2, gris2, blanco2;
    private ImageView negro3, cafe3, rojo3, naranja3, amarillo3, verde3, azul3, dorado3, plateado3;
    private ImageView cafe4, rojo4, dorado4, plateado4;
    private ImageView color1, color2, mult, toler;
    private TextView tValor;
    int total, banda1 = 10, banda2=0, multiplicador = 1;
    double multiplicador1=1, total1;
    String toletancia = "1%";
    String ohm = Character.toString((char)253);
    String sig = Character.toString((char)241);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color1 = findViewById(R.id.color1);
        color2 = findViewById(R.id.color2);
        mult = findViewById(R.id.mult);
        toler = findViewById(R.id.toler);

        cafe1 = findViewById(R.id.cafe1);
        rojo1 = findViewById(R.id.rojo1);
        naranja1 = findViewById(R.id.naranja1);
        amarillo1 = findViewById(R.id.amarillo1);
        verde1 = findViewById(R.id.verde1);
        azul1 = findViewById(R.id.azul1);
        violeta1 = findViewById(R.id.violeta1);
        gris1 = findViewById(R.id.gris1);
        blanco1 = findViewById(R.id.blanco1);

        negro2 = findViewById(R.id.negro2);
        cafe2 = findViewById(R.id.cafe2);
        rojo2 = findViewById(R.id.rojo2);
        naranja2 = findViewById(R.id.naranja2);
        amarillo2 = findViewById(R.id.amarillo2);
        verde2 = findViewById(R.id.verde2);
        azul2 = findViewById(R.id.azul2);
        violeta2 = findViewById(R.id.violeta2);
        gris2 = findViewById(R.id.gris2);
        blanco2 = findViewById(R.id.blanco2);
        negro3 = findViewById(R.id.negro3);

        cafe3 = findViewById(R.id.cafe3);
        rojo3 = findViewById(R.id.rojo3);
        naranja3 = findViewById(R.id.naranja3);
        amarillo3 = findViewById(R.id.amarillo3);
        verde3 = findViewById(R.id.verde3);
        azul3 = findViewById(R.id.azul3);
        dorado3 = findViewById(R.id.dorado3);
        plateado3 = findViewById(R.id.plateado3);

        cafe4 = findViewById(R.id.cafe4);
        rojo4 = findViewById(R.id.rojo4);
        dorado4 = findViewById(R.id.dorado4);
        plateado4 = findViewById(R.id.plateado4);
        tValor = findViewById(R.id.tValor);
        tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);
        cafe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkgoldenrod),getResources().getColor(R.color.darkgoldenrod)));
                banda1 = 10;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                        break;
                        default:
                            tValor.setText("Error de multiplicidad");
                            break;
                }
            }
        });
        rojo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkred),getResources().getColor(R.color.darkred)));
                banda1 = 20;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        naranja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkorange),getResources().getColor(R.color.darkorange)));
                banda1 = 30;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        amarillo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.yellow),getResources().getColor(R.color.yellow)));
                banda1 = 40;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        verde1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.green),getResources().getColor(R.color.green)));
                banda1 = 50;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        azul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.blue),getResources().getColor(R.color.blue)));
                banda1 = 60;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        violeta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.purple),getResources().getColor(R.color.purple)));
                banda1 = 70;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        gris1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.gray),getResources().getColor(R.color.gray)));
                banda1 = 80;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        blanco1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color1.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.cornsilk),getResources().getColor(R.color.cornsilk)));
                banda1 = 90;
                switch (banda2){
                    case 0:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                        break;
                    case 1:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                        break;
                    case 2:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                        break;
                    case 3:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                        break;
                    case 4:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                        break;
                    case 5:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                        break;
                    case 6:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                        break;
                    case 7:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                        break;
                    case 8:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                        break;
                    case 9:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });

        negro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.black),getResources().getColor(R.color.black)));
                banda2 = 0;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        cafe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkgoldenrod),getResources().getColor(R.color.darkgoldenrod)));
                banda2 = 1;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        rojo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.red),getResources().getColor(R.color.red)));
                banda2 = 2;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        naranja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banda2 = 3;
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkorange),getResources().getColor(R.color.darkorange)));
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        amarillo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.yellow),getResources().getColor(R.color.yellow)));
                banda2 = 4;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        verde2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.green),getResources().getColor(R.color.green)));
                banda2 = 5;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        azul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.blue),getResources().getColor(R.color.blue)));
                banda2 = 6;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        violeta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.violet),getResources().getColor(R.color.violet)));
                banda2 = 7;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        gris2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.gray),getResources().getColor(R.color.gray)));
                banda2 = 8;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        blanco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color2.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.cornsilk),getResources().getColor(R.color.cornsilk)));
                banda2 = 9;
                switch (banda1){
                    case 10:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                        break;
                    case 20:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                        break;
                    case 30:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                        break;
                    case 40:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                        break;
                    case 50:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                        break;
                    case 60:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                        break;
                    case 70:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                        break;
                    case 80:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                        break;
                    case 90:
                        if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                        else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                        else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                        else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                        else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                        else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                        else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                        else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });

        negro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.black),getResources().getColor(R.color.black)));
                multiplicador = 1;
                multiplicador1 = 1;
                total = (banda1+banda2)*multiplicador;
                tValor.setText(String.valueOf(total)+"ohm +/-"+toletancia);
            }
        });
        cafe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkgoldenrod),getResources().getColor(R.color.darkgoldenrod)));
                multiplicador = 10;
                multiplicador1 = 1;
                total = (banda1+banda2)*multiplicador;
                tValor.setText(String.valueOf(total)+"ohm +/-"+toletancia);
            }
        });
        rojo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.red),getResources().getColor(R.color.red)));
                multiplicador = 100;
                multiplicador1 = 1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("1Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("1.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("1.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("1.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("1.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("1.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("1.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("1.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("1.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("1.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("2Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("2.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("2.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("2.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("2.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("2.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("2.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("2.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("2.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("2.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("3Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("3.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("3.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("3.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("3.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("3.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("3.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("3.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("3.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("3.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("4Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("4.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("4.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("4.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("4.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("4.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("4.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("4.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("4.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("4.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("5Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("5.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("5.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("5.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("5.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("5.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("5.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("5.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("5.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("5.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("6Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("6.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("6.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("6.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("6.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("6.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("6.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("6.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("6.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("6.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("7Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("7.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("7.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("7.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("7.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("7.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("7.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("7.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("7.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("7.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("8Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("8.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("8.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("8.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("8.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("8.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("8.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("8.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("8.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("8.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("9Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("9.1Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("9.2Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("9.3Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("9.4Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("9.5Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("9.6Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("9.7Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("9.8Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("9.9Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                        default:
                            tValor.setText("Error de multiplicidad");
                            break;
                }
            }
        });

        naranja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkorange),getResources().getColor(R.color.darkorange)));
                multiplicador = 1000;
                multiplicador1 = 1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("10Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("11Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("12Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("13Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("14Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("15Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("16Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("17Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("18Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("19Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("20Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("21Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("22Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("23Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("24Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("25Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("26Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("27Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("28Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("29Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("30Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("31Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("32Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("33Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("34Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("35Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("36Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("37Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("38Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("39Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("40Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("41Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("42Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("43Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("44Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("45Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("46Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("47Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("48Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("49Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("50Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("51Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("52Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("53Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("54Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("55Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("56Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("57Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("58Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("59Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("60Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("61Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("62Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("63Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("64Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("65Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("66Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("67Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("68Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("69Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("70Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("71Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("72Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("73Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("74Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("75Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("76Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("77Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("78Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("79Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("80Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("81Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("82Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("83Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("84Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("85Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("86Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("87Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("88Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("89Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("90Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("91Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("92Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("93Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("94Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("95Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("96Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("97Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("98Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("99Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        amarillo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.yellow),getResources().getColor(R.color.yellow)));
                multiplicador = 10000;
                multiplicador1 = 1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("100Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("110Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("120Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("130Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("140Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("150Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("160Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("170Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("180Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("190Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("200Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("210Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("220Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("230Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("240Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("250Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("260Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("270Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("280Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("290Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("300Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("310Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("320Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("330Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("340Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("350Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("360Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("370Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("380Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("390Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("400Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("410Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("420Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("430Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("440Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("450Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("460Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("470Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("480Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("490Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("500Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("510Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("520Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("530Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("540Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("550Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("560Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("570Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("580Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("590Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("600Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("610Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("620Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("630Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("640Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("650Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("660Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("670Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("680Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("690Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("700Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("710Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("720Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("730Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("740Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("750Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("760Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("770Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("780Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("790Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("800Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("810Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("820Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("830Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("840Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("850Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("860Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("870Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("880Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("890Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("900Kohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("910Kohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("920Kohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("930Kohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("940Kohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("950Kohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("960Kohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("970Kohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("980Kohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("990Kohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });

        verde3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.green),getResources().getColor(R.color.green)));
                multiplicador = 100000;
                multiplicador1 = 1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("1Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("1.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("1.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("1.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("1.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("1.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("1.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("1.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("1.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("1.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("2Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("2.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("2.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("2.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("2.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("2.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("2.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("2.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("2.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("2.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("3Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("3.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("3.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("3.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("3.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("3.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("3.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("3.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("3.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("3.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("4Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("4.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("4.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("4.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("4.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("4.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("4.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("4.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("4.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("4.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("5Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("5.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("5.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("5.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("5.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("5.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("5.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("5.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("5.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("5.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("6Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("6.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("6.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("6.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("6.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("6.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("6.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("6.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("6.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("6.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("7Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("7.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("7.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("7.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("7.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("7.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("7.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("7.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("7.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("7.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("8Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("8.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("8.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("8.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("8.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("8.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("8.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("8.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("8.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("8.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("9Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("9.1Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("9.2Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("9.3Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("9.4Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("9.5Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("9.6Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("9.7Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("9.8Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("9.9Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });

        azul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.blue),getResources().getColor(R.color.blue)));
                multiplicador = 1000000;
                multiplicador1 = 1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("10Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("11Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("12Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("13Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("14Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("15Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("16Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("17Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("18Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("19Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("20Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("21Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("22Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("23Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("24Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("25Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("26Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("27Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("28Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("29Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("30Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("31Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("32Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("33Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("34Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("35Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("36Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("37Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("38Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("39Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("40Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("41Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("42Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("43Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("44Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("45Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("46Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("47Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("48Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("49Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("50Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("51Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("52Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("53Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("54Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("55Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("56Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("57Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("58Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("59Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("60Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("61Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("62Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("63Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("64Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("65Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("66Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("67Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("68Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("69Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("70Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("71Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("72Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("73Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("74Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("75Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("76Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("77Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("78Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("79Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("80Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("81Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("82Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("83Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("84Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("85Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("86Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("87Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("88Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("89Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("90Mohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("91Mohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("92Mohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("93Mohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("94Mohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("95Mohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("96Mohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("97Mohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("98Mohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("99Mohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }

            }
        });
        dorado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.gold),getResources().getColor(R.color.goldenrod)));
                multiplicador1 = 0.1;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("1ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("1.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("1.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("1.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("1.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("1.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("1.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("1.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("1.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("1.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("2ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("2.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("2.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("2.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("2.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("2.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("2.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("2.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("2.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("2.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("3ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("3.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("3.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("3.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("3.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("3.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("3.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("3.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("3.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("3.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("4ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("4.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("4.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("4.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("4.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("4.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("4.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("4.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("4.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("4.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("5ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("5.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("5.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("5.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("5.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("5.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("5.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("5.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("5.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("5.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("6ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("6.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("6.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("6.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("6.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("6.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("6.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("6.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("6.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("6.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("7ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("7.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("7.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("7.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("7.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("7.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("7.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("7.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("7.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("7.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("8ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("8.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("8.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("8.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("8.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("8.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("8.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("8.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("8.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("8.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("9ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("9.1ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("9.2ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("9.3ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("9.4ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("9.5ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("9.6ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("9.7ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("9.8ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("9.9ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        plateado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.silver),getResources().getColor(R.color.silver)));
                multiplicador1 = 0.01;
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.10ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.11ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.12ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.13ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.14ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.15ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.16ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.17ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.18ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.19ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.20ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.21ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.22ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.23ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.24ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.25ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.26ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.27ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.28ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.29ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.30ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.31ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.32ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.33ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.34ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.35ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.36ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.37ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.38ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.39ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.40ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.41ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.42ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.43ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.44ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.45ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.46ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.47ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.48ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.49ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.50ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.51ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.52ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.53ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.54ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.55ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.56ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.57ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.58ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.59ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.60ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.61ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.62ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.63ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.64ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.65ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.66ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.67ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.68ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.69ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.70ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.71ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.72ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.73ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.74ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.75ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.76ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.77ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.78ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.79ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.80ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.81ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.82ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.83ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.84ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.85ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.86ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.87ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.88ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.89ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                tValor.setText("0.90ohm  +/-"+toletancia);
                                break;
                            case 1:
                                tValor.setText("0.91ohm  +/-"+toletancia);
                                break;
                            case 2:
                                tValor.setText("0.92ohm  +/-"+toletancia);
                                break;
                            case 3:
                                tValor.setText("0.93ohm  +/-"+toletancia);
                                break;
                            case 4:
                                tValor.setText("0.94ohm  +/-"+toletancia);
                                break;
                            case 5:
                                tValor.setText("0.95ohm  +/-"+toletancia);
                                break;
                            case 6:
                                tValor.setText("0.96ohm  +/-"+toletancia);
                                break;
                            case 7:
                                tValor.setText("0.97ohm  +/-"+toletancia);
                                break;
                            case 8:
                                tValor.setText("0.98ohm  +/-"+toletancia);
                                break;
                            case 9:
                                tValor.setText("0.99ohm  +/-"+toletancia);
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });

        cafe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toler.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.darkgoldenrod),getResources().getColor(R.color.darkgoldenrod)));
                toletancia = "1%";
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                        default:
                            tValor.setText("Error de multiplicidad");
                            break;
                }
            }
        });
        rojo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toler.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.red),getResources().getColor(R.color.red)));
                toletancia = "2%";
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        dorado4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toler.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.gold),getResources().getColor(R.color.gold)));
                toletancia = "5%";
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
        plateado4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toler.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.silver),getResources().getColor(R.color.silver)));
                toletancia = "10%";
                switch (banda1){
                    case 10:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("10Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("100Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("10Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.1ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("11Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("110Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("11Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.11ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("12Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("120Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("12Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.12ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("13Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("130Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("13Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.13ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("14Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("140Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("14Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.14ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("15Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("150Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("15Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.15ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("16Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("160Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("16Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.16ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("17Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("170Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("17Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.17ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("18Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("180Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("18Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.18ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("1.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("19Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("190Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("1.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("19Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("1.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.19ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 20:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("20Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("200Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("20Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.2ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("21Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("210Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("21Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.21ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("22Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("220Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("22Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.22ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("23Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("230Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("23Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.23ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("24Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("240Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("24Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.24ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("25Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("250Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("25Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.25ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("26Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("260Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("26Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.26ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("27Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("270Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("27Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.27ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("28Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("280Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("28Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.28ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("2.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("29Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("290Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("2.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("29Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("2.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.29ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 30:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("30Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("300Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("30Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.3ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("31Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("310Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("31Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.31ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("32Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("320Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("32Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.32ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("33Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("330Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("33Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.33ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("34Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("340Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("34Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.34ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("35Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("350Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("35Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.35ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("36Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("360Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("36Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.36ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("37Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("370Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("37Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.37ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("38Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("380Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("38Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.38ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("3.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("39Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("390Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("3.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("39Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("3.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.39ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 40:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("40Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("400Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("40Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.4ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("41Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("410Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("41Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.41ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("42Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("420Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("42Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.42ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("43Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("430Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("43Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.43ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("44Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("440Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("44Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.44ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("45Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("450Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("45Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.45ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("46Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("460Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("46Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.46ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("47Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("470Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("47Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.47ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("48Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("480Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("48Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.48ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("4.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("49Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("490Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("4.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("49Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("4.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.49ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 50:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("50Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("500Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("50Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.5ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("51Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("510Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("51Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.51ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("52Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("520Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("52Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.52ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("53Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("530Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("53Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.53ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("54Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("540Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("54Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.54ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("55Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("550Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("55Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.55ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("56Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("560Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("56Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.56ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("57Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("570Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("57Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.57ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("58Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("580Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("58Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.58ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("5.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("59Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("590Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("5.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("59Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("5.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.59ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 60:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("60Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("600Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("60Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.6ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("61Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("610Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("61Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.61ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("62Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("620Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("62Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.62ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("63Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("630Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("63Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.63ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("64Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("640Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("64Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.64ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("65Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("650Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("65Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.65ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("66Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("660Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("66Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.66ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("67Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("670Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("67Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.67ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("68Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("680Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("68Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.68ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("6.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("69Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("690Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("6.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("69Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("6.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.69ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 70:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("70Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("700Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("70Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.7ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("71Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("710Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("71Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.71ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("72Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("720Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("72Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.72ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("73Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("730Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("73Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.73ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("74Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("740Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("74Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.74ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("75Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("750Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("75Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.75ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("76Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("760Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("76Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.76ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("77Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("770Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("77Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.77ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("78Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("780Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("78Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.78ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("7.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("79Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("790Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("7.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("79Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("7.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.79ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 80:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("80Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("800Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("80Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.8ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("81Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("810Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("81Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.81ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("82Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("820Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("82Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.82ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("83Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("830Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("83Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.83ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("84Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("840Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("84Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.84ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("85Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("850Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("85Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.85ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("86Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("860Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("86Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.86ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("87Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("870Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("87Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.87ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("88Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("880Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("88Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.88ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("8.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("89Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("890Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("8.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("89Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("8.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.89ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    case 90:
                        switch (banda2){
                            case 0:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("90Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("900Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("90Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.9ohm +/-"+toletancia);}
                                break;
                            case 1:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.1Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("91Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("910Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.1Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("91Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.1ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.91ohm +/-"+toletancia);}
                                break;
                            case 2:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.2Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("92Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("920Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.2Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("92Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.2ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.92ohm +/-"+toletancia);}
                                break;
                            case 3:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.3Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("93Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("930Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.3Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("93Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.3ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.93ohm +/-"+toletancia);}
                                break;
                            case 4:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.4Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("94Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("940Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.4Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("94Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.4ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.94ohm +/-"+toletancia);}
                                break;
                            case 5:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.5Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("95Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("950Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.5Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("95Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.5ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.95ohm +/-"+toletancia);}
                                break;
                            case 6:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.6Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("96Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("960Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.6Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("96Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.6ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.96ohm +/-"+toletancia);}
                                break;
                            case 7:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.7Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("97Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("970Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.7Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("97Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.7ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.97ohm +/-"+toletancia);}
                                break;
                            case 8:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.8Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("98Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("980Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.8Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("98Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.8ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.98ohm +/-"+toletancia);}
                                break;
                            case 9:
                                if(multiplicador == 1 || multiplicador == 10 && multiplicador1 ==1){tValor.setText(String.valueOf((banda1+banda2)*multiplicador)+"ohm +/-"+toletancia);}
                                else if(multiplicador == 100 && multiplicador1 == 1){tValor.setText("9.9Kohm  +/-"+toletancia);}
                                else if(multiplicador == 1000 && multiplicador1 == 1){tValor.setText("99Kohm  +/-"+toletancia);}
                                else if(multiplicador == 10000 && multiplicador1 == 1){tValor.setText("990Kohm  +/-"+toletancia);}
                                else if(multiplicador == 100000 && multiplicador1 == 1){tValor.setText("9.9Mohm  +/-"+toletancia);}
                                else if(multiplicador == 1000000 && multiplicador1 == 1){tValor.setText("99Mohm  +/-"+toletancia);}
                                else if(multiplicador1 == 0.1){tValor.setText("9.9ohm +/-"+toletancia);}
                                else if(multiplicador1 == 0.01){tValor.setText("0.99ohm +/-"+toletancia);}
                                break;
                            default:
                                tValor.setText("Error de multiplicidad");
                                break;
                        }
                        break;
                    default:
                        tValor.setText("Error de multiplicidad");
                        break;
                }
            }
        });
    }
}
