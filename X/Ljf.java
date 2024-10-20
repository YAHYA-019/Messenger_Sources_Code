package X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* loaded from: Ljf.class */
public final class Ljf implements Runnable {
    public static final String __redex_internal_original_name = "SearchView$2";
    public final /* synthetic */ SearchView A00;

    public Ljf(SearchView searchView) {
        this.A00 = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        JYX jyx = this.A00.mSuggestionsAdapter;
        if (jyx instanceof ViewOnClickListenerC3007Jg0) {
            jyx.AEY((Cursor) null);
        }
    }
}
