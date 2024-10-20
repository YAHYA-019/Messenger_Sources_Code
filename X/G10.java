package X;

import com.facebook.ui.search.SearchEditText;

/* loaded from: G10.class */
public final class G10 implements Runnable {
    public static final String __redex_internal_original_name = "SearchEditText$1";
    public final /* synthetic */ SearchEditText A00;

    public G10(SearchEditText searchEditText) {
        this.A00 = searchEditText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.clearFocus();
    }
}
