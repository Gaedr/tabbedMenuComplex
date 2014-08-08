package es.gaedrspace.tabmenucomplex;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Samuel on 08/08/2014.
 */
public class TranslateFragment extends ListFragment {
    private String[] japanish = {"こんにちわ", "さようなら", "よろしく", "食べる", "飲む", "行く", "見る", "聞こえる"};
    private String[] spanish = {"Hola", "Adiós", "Encantado de conocerte", "Comer", "Beber", "Ir", "Ver", "Oir"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, japanish));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(getActivity(), "スペイン語: " + spanish[position], Toast.LENGTH_SHORT).show();
    }
}
