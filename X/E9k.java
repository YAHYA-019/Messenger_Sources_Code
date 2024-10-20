package X;

import com.facebook.fbui.popover.PopoverViewFlipper;

/* loaded from: E9k.class */
public final class E9k extends C66m {
    public final /* synthetic */ PopoverViewFlipper A00;

    public E9k(PopoverViewFlipper popoverViewFlipper) {
        this.A00 = popoverViewFlipper;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        PopoverViewFlipper popoverViewFlipper = this.A00;
        ((Kr5) popoverViewFlipper.A05.get()).A01(popoverViewFlipper);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        PopoverViewFlipper popoverViewFlipper = this.A00;
        ((Kr5) popoverViewFlipper.A05.get()).A00(popoverViewFlipper);
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        C66j c66j = c66i.A09;
        float f = (float) c66j.A00;
        PopoverViewFlipper popoverViewFlipper = this.A00;
        popoverViewFlipper.setAlpha((float) Math.min(Math.max(f, 0.0d), 1.0d));
        popoverViewFlipper.setScaleX(f);
        popoverViewFlipper.setScaleY(f);
        if (Math.abs(c66j.A00 - 0.0d) > c66i.A00 || c66i.A01 != 0.0d) {
            return;
        }
        c66i.A02();
    }
}
