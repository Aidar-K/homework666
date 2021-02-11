package Title;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.geektech.homework666.R;

import java.util.ArrayList;

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.MainViewHolder> {


    ArrayList<Item> list;

    public ExchangeAdapter(Exchange exchange) {
        ArrayList<Item> list = new ArrayList<>();
        this.list = list;
    }

    public void addText(ArrayList<Item> label) {
        list = label;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ExchangeAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageView imageView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView3);
            textView3 = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
        }

        public void onBind(Item list) {
            textView.setText(list.num1);
            textView2.setText(list.num2);
            textView3.setText(String.valueOf(list.num3));

        }

    }

}