package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Jhy.class */
public final class Jhy extends 2O4 {
    public void A07(RecyclerView recyclerView, int i, int i2) {
        11T.A0F(recyclerView, 0);
        int childCount = recyclerView.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (recyclerView.getChildAt(i4) instanceof ViewGroup) {
                C06014fk.A0I();
                throw null;
            }
            if (i4 == childCount) {
                return;
            } else {
                i3 = i4 + 1;
            }
        }
    }
}
