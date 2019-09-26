package com.example.mymessages;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMessages;
    private MessageAdapter messageAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMessages = findViewById(R.id.rv_messages);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvMessages.setLayoutManager(layoutManager);
        rvMessages.setHasFixedSize(true);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvMessages.getContext(),layoutManager.getOrientation());

        rvMessages.addItemDecoration(dividerItemDecoration);
        messageAdapter = new MessageAdapter(Utils.getList());
        rvMessages.setAdapter(messageAdapter);
    }
}
