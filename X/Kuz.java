package X;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: Kuz.class */
public abstract class Kuz {
    public static void A00(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void A01(SearchView.SearchAutoComplete searchAutoComplete) {
        searchAutoComplete.setInputMethodMode(1);
    }
}
