package X;

import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* loaded from: DPt.class */
public final class DPt extends FrameLayout {
    public final LithoView A00;

    public DPt(1LI r302, 1Iw r303) {
        super(r303.A0D, null);
        LithoView lithoView = new LithoView(r303);
        this.A00 = lithoView;
        C1s0 A01 = ComponentTree.A01(r302, r303, null);
        A01.A01(false);
        7zQ.A1I(A01, lithoView);
        addView(lithoView);
    }
}
