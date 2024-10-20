package X;

import android.widget.ListView;

/* loaded from: G17.class */
public final class G17 implements Runnable {
    public static final String __redex_internal_original_name = "FbPreferenceFragment$1";
    public final /* synthetic */ DZJ A00;

    public G17(DZJ dzj) {
        this.A00 = dzj;
    }

    @Override // java.lang.Runnable
    public void run() {
        ListView listView = this.A00.A02;
        listView.focusableViewAvailable(listView);
    }
}
