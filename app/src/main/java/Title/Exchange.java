package Title;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.geektech.homework666.R;

import java.util.ArrayList;


public class Exchange extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Item> list;
    ExchangeAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exchange, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new ExchangeAdapter(this);
        recyclerView.setAdapter(adapter);

        list = new ArrayList<>();
        list.add(0, new Item("EUROPA", "EUR", 1));
        list.add(1, new Item("USA", "USD", 2));
        list.add(2, new Item("RUSSIAN", "RUB", 3));
        list.add(3, new Item("AUSTRALIA", "AUD", 4));
        list.add(4, new Item("CNINA", "CH", 5));
        list.add(5, new Item("KAZAKSTAN", "KZT", 6));
        list.add(6, new Item("KYRGYSTAN", "KGS", 7));
        list.add(7, new Item("JAPAN", "JAP", 8));
        list.add(8, new Item("COLUMBIA", "COP", 9));
        list.add(9, new Item("GERMANY", "GRM", 10));
        list.add(10, new Item("ITALIA", "SRI", 11));
        list.add(11, new Item("FRANCE", "FRC", 12));

        adapter.addText(list);
    }
}