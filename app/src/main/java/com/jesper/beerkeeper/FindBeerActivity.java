package com.jesper.beerkeeper;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import org.w3c.dom.Text;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    private BeerExpert expert = new BeerExpert();

    public void onClickFindBeer (View view){
        //Получение ссылки на TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Получиение ссылки на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Получение варианта, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
