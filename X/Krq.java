package X;

import android.view.View;
import com.facebook.litho.ComponentTree;

/* loaded from: Krq.class */
public final class Krq {
    public C2hl A00;
    public ComponentTree A02;
    public final /* synthetic */ LBI A04;
    public final int A03 = LBI.A09.getAndIncrement();
    public boolean A01 = true;

    public Krq(LBI lbi) {
        this.A04 = lbi;
    }

    public ComponentTree A00() {
        1sP.A00();
        ComponentTree componentTree = this.A02;
        if (componentTree == null) {
            LBI lbi = this.A04;
            C1s0 A01 = ComponentTree.A01(this.A00.A00, lbi.A04, null);
            A01.A01(lbi.A07);
            A01.A03 = null;
            componentTree = A01.A00();
            this.A02 = componentTree;
            this.A01 = false;
        }
        return componentTree;
    }

    public void A01() {
        ComponentTree A00 = A00();
        LBI lbi = this.A04;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lbi.A02, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(lbi.A01, 1073741824);
        if (!this.A01) {
            A00.A0M(makeMeasureSpec, makeMeasureSpec2);
        } else {
            ComponentTree.A05(this.A00.A00, A00, null, null, makeMeasureSpec, makeMeasureSpec2, 1, -1, true);
            this.A01 = false;
        }
    }
}
