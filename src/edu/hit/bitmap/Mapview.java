package edu.hit.bitmap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Mapview extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mapview);
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_mapview, menu);
        return true;
    }
}
