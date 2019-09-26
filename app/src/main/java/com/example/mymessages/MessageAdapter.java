package com.example.mymessages;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<Message> messageList;

    public MessageAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }


    @NonNull
    @Override
    public MessageAdapter.MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.message_item,
                parent,
                false
        );
        return new MessageViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.MessageViewHolder holder, int position) {
        Message message = messageList.get(position);

        String name = message.getName();
        holder.Name.setText(name);

        String description = message.getDescription();
        holder.Description.setText(description);

        String time = message.getTime();
        holder.Time.setText(time);



    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    class MessageViewHolder extends RecyclerView.ViewHolder {

        TextView Name;
        TextView Description;
        TextView Time;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.tv_name);
            Description = itemView.findViewById(R.id.tv_description);
            Time = itemView.findViewById(R.id.tv_time);
        }
    }
}