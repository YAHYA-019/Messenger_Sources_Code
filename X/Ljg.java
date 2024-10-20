package X;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: Ljg.class */
public final class Ljg implements Runnable {
    public static final String __redex_internal_original_name = "SearchView$SearchAutoComplete$1";
    public final /* synthetic */ SearchView.SearchAutoComplete A00;

    public Ljg(SearchView.SearchAutoComplete searchAutoComplete) {
        this.A00 = searchAutoComplete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.SearchView$SearchAutoComplete, android.view.View] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = this.A00;
        if (r0.A01) {
            ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(r0, 0);
            r0.A01 = false;
        }
    }
}
