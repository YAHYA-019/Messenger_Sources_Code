package X;

import android.widget.AbsListView;

/* loaded from: Kux.class */
public abstract class Kux {
    public static void A00(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }

    public static boolean A01(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }
}
