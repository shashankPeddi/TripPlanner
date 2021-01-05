package com.example.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CityBased extends AppCompatActivity {
String f;
ImageView iv1,iv2,iv3,iv4,iv5;
TextView tv1,tv2,tv3,tv4,tv5;
TextView place;
String c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_city_based);
        Intent intent=getIntent();
        place =findViewById(R.id.place);
        iv1=findViewById(R.id.iv1);tv1=findViewById(R.id.tv1);
        iv2=findViewById(R.id.iv2);tv2=findViewById(R.id.tv2);
        iv3=findViewById(R.id.iv3);tv3=findViewById(R.id.tv3);
        iv4=findViewById(R.id.iv4);tv4=findViewById(R.id.tv4);
        iv5=findViewById(R.id.iv5);tv5=findViewById(R.id.tv5);
        f=intent.getStringExtra("loc");
        if(f.equalsIgnoreCase("l1"))
        {
            place.setText("Places in New Delhi");
            tv1.setText("Akshardham temple");
            iv1.setImageResource(R.drawable.ak);
            tv2.setText("Lotus Temple");
            iv2.setImageResource(R.drawable.lotus);
            tv3.setText("India Gate");
            iv3.setImageResource(R.drawable.gate);
            tv4.setText("Qutab Minar");
            iv4.setImageResource(R.drawable.minar);
            tv5.setText("Red fort");
            iv5.setImageResource(R.drawable.redfort);
        }
else if(f.equalsIgnoreCase("l2")){
            place.setText("Places in Kolkata");
    tv1.setText("Dakshineshwar temple");
            iv1.setImageResource(R.drawable.dk);
            tv2.setText("Howra Bridge");
            iv2.setImageResource(R.drawable.bridge_howra);
            tv3.setText("Science City");
            iv3.setImageResource(R.drawable.science);
            tv4.setText("Tagore House");
            iv4.setImageResource(R.drawable.tagore);
            tv5.setText("Victoria Memorial");
            iv5.setImageResource(R.drawable.victoria);
        }
        else if(f.equalsIgnoreCase("l3")){
            place.setText("Places in Hyderabad");
            tv1.setText("Birla Mandir");
            iv1.setImageResource(R.drawable.birla);
            tv2.setText("Charminar");
            iv2.setImageResource(R.drawable.charminar);
            tv3.setText("Hussain Sagar");
            iv3.setImageResource(R.drawable.tankbund);
            tv4.setText("Golconda Fort");
            iv4.setImageResource(R.drawable.gfort);
            tv5.setText("Ramoji Film City");
            iv5.setImageResource(R.drawable.ramoji);
        }
        else if(f.equalsIgnoreCase("l4")){
            place.setText("Places in Chennai");
            tv1.setText("Birla planitorium");
            iv1.setImageResource(R.drawable.planitorium);
            tv2.setText("Public Library");
            iv2.setImageResource(R.drawable.library);
            tv3.setText("Fort St.George");
            iv3.setImageResource(R.drawable.george);
            tv4.setText("Marina Beach");
            iv4.setImageResource(R.drawable.marina);
            tv5.setText("Vellankani Shrine");
            iv5.setImageResource(R.drawable.vellankani);
        }
        else if(f.equalsIgnoreCase("l5")){
            place.setText("Places in Mumbai");
            tv1.setText("Gateway of India");
            iv1.setImageResource(R.drawable.gateway);
            tv2.setText("Haji Ali");
            iv2.setImageResource(R.drawable.haji);
            tv3.setText("Juhu Beach");
            iv3.setImageResource(R.drawable.juhu);
            tv4.setText("Marine Drive");
            iv4.setImageResource(R.drawable.marinedrive);
            tv5.setText("Worli Seaface");
            iv5.setImageResource(R.drawable.worli);
        }

        }



    public void img1(View view)
    {
        if(f.equalsIgnoreCase("l1")){
            if(tv1.getText().toString().equalsIgnoreCase("Akshardham temple"))
            c="Akshardham temple";//else if()
        }

        else if(f.equalsIgnoreCase("l2")){
            if(tv1.getText().toString().equalsIgnoreCase("Dakshineshwar temple"))
            c="Dakshineshwar temple";}
        else if(f.equalsIgnoreCase("l3")){
            if(tv1.getText().toString().equalsIgnoreCase("Birla Mandir"))
                c="Birla Mandir";}

        else if(f.equalsIgnoreCase("l4")){
            if(tv1.getText().toString().equalsIgnoreCase("Birla planitorium"))
                c="Birla planitorium";}

        else if(f.equalsIgnoreCase("l5")){
            if(tv1.getText().toString().equalsIgnoreCase("Gateway of India"))
                c="Gateway of India";}

        Intent intent = new Intent(CityBased.this,Details.class);
        intent.putExtra("image",c);
        startActivity(intent);
    }

    public void img2(View view) {
        if(f.equalsIgnoreCase("l1")){
            if(tv2.getText().toString().equalsIgnoreCase("Lotus Temple"))
                c="Lotus Temple";//else if()
        }

        else if(f.equalsIgnoreCase("l2")){
            if(tv2.getText().toString().equalsIgnoreCase("Howra Bridge"))
                c="Howra Bridge";}
        else if(f.equalsIgnoreCase("l3")){
            if(tv2.getText().toString().equalsIgnoreCase("Charminar"))
                c="Charminar";}

        else if(f.equalsIgnoreCase("l4")){
            if(tv2.getText().toString().equalsIgnoreCase("Public Library"))
                c="Public Library";}

        else if(f.equalsIgnoreCase("l5")){
            if(tv2.getText().toString().equalsIgnoreCase("Haji Ali"))
                c="Haji Ali";}

        Intent intent = new Intent(CityBased.this,Details.class);
        intent.putExtra("image",c);
        startActivity(intent);
    }

    public void img3(View view) {
        if(f.equalsIgnoreCase("l1")){
            if(tv3.getText().toString().equalsIgnoreCase("India Gate"))
                c="India Gate";//else if()
        }

        else if(f.equalsIgnoreCase("l2")){
            if(tv3.getText().toString().equalsIgnoreCase("Science City"))
                c="Science City";}
        else if(f.equalsIgnoreCase("l3")){
            if(tv3.getText().toString().equalsIgnoreCase("Hussain Sagar"))
                c="Hussain Sagar";}

        else if(f.equalsIgnoreCase("l4")){
            if(tv3.getText().toString().equalsIgnoreCase("Fort St.George"))
                c="Fort St.George";}

        else if(f.equalsIgnoreCase("l5")){
            if(tv3.getText().toString().equalsIgnoreCase("Juhu Beach"))
                c="Juhu Beach";}

        Intent intent = new Intent(CityBased.this,Details.class);
        intent.putExtra("image",c);
        startActivity(intent);
    }

    public void img4(View view) {

        if(f.equalsIgnoreCase("l1")){
            if(tv4.getText().toString().equalsIgnoreCase("Qutab Minar"))
                c="Qutab Minar";//else if()
        }

        else if(f.equalsIgnoreCase("l2")){
            if(tv4.getText().toString().equalsIgnoreCase("Tagore House"))
                c="Tagore House";}
        else if(f.equalsIgnoreCase("l3")){
            if(tv4.getText().toString().equalsIgnoreCase("Golconda Fort"))
                c="Golconda Fort";}

        else if(f.equalsIgnoreCase("l4")){
            if(tv4.getText().toString().equalsIgnoreCase("Marina Beach"))
                c="Marina Beach";}

        else if(f.equalsIgnoreCase("l5")){
            if(tv4.getText().toString().equalsIgnoreCase("Marine Drive"))
                c="Marine Drive";}

        Intent intent = new Intent(CityBased.this,Details.class);
        intent.putExtra("image",c);
        startActivity(intent);
    }

    public void img5(View view) {

        if(f.equalsIgnoreCase("l1")){
            if(tv5.getText().toString().equalsIgnoreCase("Red fort"))
                c="Red fort";//else if()
        }

        else if(f.equalsIgnoreCase("l2")){
            if(tv5.getText().toString().equalsIgnoreCase("Victoria Memorial"))
                c="Victoria Memorial";}
        else if(f.equalsIgnoreCase("l3")){
            if(tv5.getText().toString().equalsIgnoreCase("Ramoji Film City"))
                c="Ramoji Film City";}

        else if(f.equalsIgnoreCase("l4")){
            if(tv5.getText().toString().equalsIgnoreCase("Vellankani Shrine"))
                c="Vellankani Shrine";}

        else if(f.equalsIgnoreCase("l5")){
            if(tv5.getText().toString().equalsIgnoreCase("Worli Seaface"))
                c="Worli Seaface";}

        Intent intent = new Intent(CityBased.this,Details.class);
        intent.putExtra("image",c);
        startActivity(intent);
    }
}
