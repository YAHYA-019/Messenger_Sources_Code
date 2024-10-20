package X;

import android.view.View;

/* renamed from: X.6c7, reason: invalid class name */
/* loaded from: 6c7.class */
public final class C6c7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final View A06;
    public boolean A05 = true;
    public boolean A04 = true;

    public C6c7(View view) {
        this.A06 = view;
    }

    public void A00() {
        View view = this.A06;
        view.offsetTopAndBottom(this.A03 - (view.getTop() - this.A01));
        view.offsetLeftAndRight(this.A02 - (view.getLeft() - this.A00));
    }
}
