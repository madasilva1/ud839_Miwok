import android.content.Context;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.android.miwok.Word;


public class WordAdapter extends ArrayAdapter<Word>{

        public WordAdapter(@NonNull Context context, int resource) {
            super(context, resource);
        }

        @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

    }
   // private ArrayList<Word>wordArrayList;
  //private Layoutinflater thisinflater;

}

