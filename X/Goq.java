package X;

import android.view.View;
import com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* loaded from: Goq.class */
public final class Goq extends HFq {
    public int A00 = -1;
    public final /* synthetic */ Hsk A01;

    public Goq(Hsk hsk) {
        this.A01 = hsk;
    }

    public static void A00(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        float A00 = (float) HLD.A00(0.0d, 0.0d, 1.0d, 0.5d, 1.0d);
        float A002 = (float) HLD.A00(0.0d, 0.0d, 1.0d, 0.9285714030265808d, 1.0d);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= reboundHorizontalScrollView.getChildCount()) {
                return;
            }
            View childAt = reboundHorizontalScrollView.getChildAt(i4);
            if ((i4 < i || i4 > i2) && childAt.getAlpha() != A00) {
                childAt.setAlpha(A00);
                childAt.setScaleX(A002);
                childAt.setScaleY(A002);
            }
            i3 = i4 + 1;
        }
    }
}
