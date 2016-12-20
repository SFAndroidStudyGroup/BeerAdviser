package beeradviser.hfad.com.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // onClickFindBeer method
    public void onClickFindBeer(View view) {

        TextView brand = (TextView) findViewById(R.id.brand);

        Spinner color = (Spinner) findViewById(R.id.color);

        BeerExpert beerExpert = new BeerExpert();
        List<String> colorList = beerExpert.getBrands(String.valueOf(color.getSelectedItem()));

        brand.setText(colorList.toString());
    }
}
