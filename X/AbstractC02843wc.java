package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wc.class */
public abstract class AbstractC02843wc {
    public int A00 = -1;
    public View A01;
    public 2XA A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C02853wd A07;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.3wd, java.lang.Object] */
    public AbstractC02843wc() {
        ?? obj = new Object();
        obj.A04 = -1;
        obj.A06 = false;
        obj.A00 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        obj.A01 = (-1) << (-1);
        obj.A05 = null;
        this.A07 = obj;
    }

    public PointF A01(int i) {
        2XB r0 = this.A02;
        if (r0 instanceof 2XB) {
            return r0.AHD(i);
        }
        android.util.Log.w("RecyclerView", 0Pz.A0W("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", 2XB.class.getCanonicalName()));
        return null;
    }

    public void A02() {
    }

    public final void A03() {
        if (this.A05) {
            this.A05 = false;
            A05();
            this.A03.mState.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            2XA r0 = this.A02;
            if (r0.A06 == this) {
                r0.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02843wc.A04(int, int):void");
    }

    public abstract void A05();

    public abstract void A06(View view, C02853wd c02853wd, 2NQ r3);
}
