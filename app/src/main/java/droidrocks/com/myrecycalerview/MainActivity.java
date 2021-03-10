package droidrocks.com.myrecycalerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String S1[],S2[];
    RecyclerView recyclerView;

    int images [] = {R.drawable.psd1,R.drawable.ai2,R.drawable.mp33,R.drawable.mp44,
            R.drawable.svg5,R.drawable.gif6,R.drawable.converter7,R.drawable.upload8,R.drawable.download9,R.drawable.folder10,R.drawable.document11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.recycalerView);

        S1 = getResources().getStringArray(R.array.file_names);
        S2 = getResources().getStringArray(R.array.desciptions);

        MyAdapter myAdapter = new MyAdapter(this,S1,S2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }
}