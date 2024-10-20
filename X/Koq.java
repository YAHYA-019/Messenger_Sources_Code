package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: Koq.class */
public final class Koq {
    public final /* synthetic */ LE4 A00;

    public Koq(LE4 le4) {
        this.A00 = le4;
    }

    public View A00(ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }
}
