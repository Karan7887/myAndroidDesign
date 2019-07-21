package com.example.lenovo.weatherreport;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuItemImpl;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;

public class SpinnerActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_s);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;

        setSupportActionBar(toolbar);



        MenuItem.OnActionExpandListener expandListener = new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                return true;
            }
        };








        Spinner spinner1 = (Spinner) findViewById(R.id.spinneri1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Batch,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.Spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Category,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) findViewById(R.id.Spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.Department,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
    }
}
