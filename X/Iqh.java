package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Iqh.class */
public final class Iqh implements Runnable {
    public static final String __redex_internal_original_name = "CircularArtPickerSnapController$2";
    public final /* synthetic */ IF2 A00;

    public Iqh(IF2 if2) {
        this.A00 = if2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IF2 if2 = this.A00;
        RecyclerView recyclerView = if2.A0A;
        recyclerView.setVisibility(0);
        float childCount = (recyclerView.getChildCount() - 1) / 2.0f;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            double d = childCount;
            int floor = ((int) Math.floor(d)) - i;
            int A02 = GOn.A02(d) + i;
            View childAt = recyclerView.getChildAt(floor);
            View childAt2 = recyclerView.getChildAt(A02);
            I3t i3t = if2.A0D.A0H;
            float f = 1.0f;
            if ((i3t != null ? i3t.A00 : null) == HAD.A04) {
                f = IF2.A02(childAt, if2);
            } else if (floor == A02) {
                f = 1.0f + if2.A06;
            }
            if (childAt != null) {
                childAt.setScaleX(0.0f);
                childAt.setScaleY(0.0f);
            }
            if (childAt2 != null) {
                childAt2.setScaleX(0.0f);
                childAt2.setScaleY(0.0f);
            }
            if (childAt != null || childAt2 != null) {
                recyclerView.postDelayed(new J4T(childAt, childAt2, this, f), i * 40);
            }
        }
    }
}
