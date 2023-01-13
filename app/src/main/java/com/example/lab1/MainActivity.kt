package com.example.lab1

import android.widget.ListView
import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {
    ListView listViewMonths;
    String[] months;
    ArrayAdapter<String> monthAdapter;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewMonths = findVieNBvId(R.id.ListViewMonths)
        months = new DateFormatSymbols0). getMonths()
        monthAdapter = new ArrayAdapter<>( context this, android.R.layout.simple_list_item_1,months);
        // monthAdapter = new ArrayAdapter<>(this, R.layout.List_item, months);
        ListViewMonths.setAdapter(monthAdapter);
        ListViewMonths.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedMonth = parent . getItemAtPosition (position).tostring();
                Toast.makeText(
                    getApplicationContext(),
                    text selectedMonth +" selected!",
                    Toast.LENGTH_SHORT
                ) , show ();
            }
            });
    }
}
