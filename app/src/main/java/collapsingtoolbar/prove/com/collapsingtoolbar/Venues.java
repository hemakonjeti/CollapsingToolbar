package collapsingtoolbar.prove.com.collapsingtoolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class Venues extends AppCompatActivity {
    ListView list_Vans;
    CharSequence[] values =
            {
                    " Function halls ", " Banquet halls ", " Convention halls "
            };
    AlertDialog alertDialog1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venues);
    }
    public void CreateAlertDialogWithRadioButtonGroup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Venues.this);

        builder.setTitle("Select Your Venues: ");

        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch(item)
                {
                    case 0:
//                        startActivity(new Intent(Venues.this,Funcation.class));
                        Toast.makeText(Venues.this, "Function halls Clicked", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
//                        startActivity(new Intent(Venues.this,Banquethalls.class));
                        Toast.makeText(Venues.this, "Banquet halls Clicked", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
//                        startActivity(new Intent(Venues.this,Photographer.class));
                        //Photographer means Convention hall
                        Toast.makeText(Venues.this, "Convention halls Clicked", Toast.LENGTH_LONG).show();
                        break;
                }
                alertDialog1.dismiss();
            }
        });
        alertDialog1 = builder.create();
        alertDialog1.show();


}
}
