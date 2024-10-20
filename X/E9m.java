package X;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.fbui.popover.PopoverViewFlipper;

/* loaded from: E9m.class */
public final class E9m extends C66m {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public final /* synthetic */ PopoverViewFlipper A06;

    public E9m(PopoverViewFlipper popoverViewFlipper) {
        this.A06 = popoverViewFlipper;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        PopoverViewFlipper popoverViewFlipper = this.A06;
        ((Kr5) popoverViewFlipper.A05.get()).A01(popoverViewFlipper);
        View view = this.A05;
        if (view == null || this.A04 == null) {
            return;
        }
        view.setVisibility(0);
        this.A04.setVisibility(0);
        DisplayMetrics A09 = DKD.A09(popoverViewFlipper);
        int i = A09.widthPixels;
        int i2 = (-1) << (-1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A09.heightPixels, i2);
        this.A05.measure(makeMeasureSpec, makeMeasureSpec2);
        this.A04.measure(makeMeasureSpec, makeMeasureSpec2);
        int A07 = DKE.A07(popoverViewFlipper);
        this.A03 = this.A05.getMeasuredWidth() + A07;
        this.A01 = this.A04.getMeasuredWidth() + A07;
        int paddingTop = popoverViewFlipper.getPaddingTop() + popoverViewFlipper.getPaddingBottom();
        this.A02 = this.A05.getMeasuredHeight() + paddingTop;
        this.A00 = this.A04.getMeasuredHeight() + paddingTop;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        PopoverViewFlipper popoverViewFlipper = this.A06;
        ((Kr5) popoverViewFlipper.A05.get()).A00(popoverViewFlipper);
        View view = this.A05;
        if (view == null || this.A04 == null) {
            return;
        }
        view.setVisibility(8);
        this.A04.setVisibility(0);
        this.A05 = null;
        this.A04 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    @Override // X.C66m, X.C66n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CMV(X.C66i r302) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9m.CMV(X.66i):void");
    }
}
