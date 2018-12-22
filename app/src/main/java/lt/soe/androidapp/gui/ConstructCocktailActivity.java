package lt.soe.androidapp.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lt.soe.androidapp.R;
import lt.soe.androidapp.cocktail.Cocktail;
import lt.soe.androidapp.server.JavaServer;

public class ConstructCocktailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.construct_cocktail_activity);

        Cocktail cocktail = Cocktail.TEST_COCKTAIL("Jimmy");
        new JavaServer().constructCocktail(cocktail);
    }
}