package com.gajju.testing;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void amit(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.airtel.in/"));
        startActivity(webIntent);
    }

    public void amit_saurab(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ideacellular.com/"));
        startActivity(webIntent);
    }

    public void amit_boss(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ideacellular.com/"));
        startActivity(webIntent);
    }

    public void amit_jio(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jio.com/"));
        startActivity(webIntent);
    }
    public void amit_voda(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vodafone.in/"));
        startActivity(webIntent);
    }
    public void amit_rel(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ril.com/"));
        startActivity(webIntent);
    }
    public void amit_tata(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tatadocomo.com/"));
        startActivity(webIntent);
    }
    public void amit_air(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aircel.com/"));
        startActivity(webIntent);
    }
    public void amit_mtnl(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mtnl.net.in/"));
        startActivity(webIntent);
    }
    public void amit_mts(View v) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mtsgsm.com/about/"));
        startActivity(webIntent);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

}