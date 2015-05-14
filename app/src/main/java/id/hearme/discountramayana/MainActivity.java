package id.hearme.discountramayana;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void HitungDiscount(View view)
    {

        EditText hargaTxt = (EditText)findViewById(R.id.hargaText);
        EditText discountTxt = (EditText)findViewById(R.id.discountText);
        TextView hargaAkhir = (TextView)findViewById(R.id.hasilTxtView);

        float harga = Float.parseFloat(hargaTxt.getText().toString());
        float discount = Float.parseFloat(discountTxt.getText().toString());

        float hasil = harga*(100-discount)/100;

        hargaAkhir.setText(String.valueOf(hasil));


    }
}
