package X;

import android.app.Dialog;

/* loaded from: E3d.class */
public final class E3d extends FIJ {
    public final GL7 A00;

    public E3d(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        11T.A0F(fyG, 0);
        GL7 gl7 = this.A00;
        String A06 = GL7.A06(gl7);
        if (A06 == null) {
            FAo.A01(fyG, AnonymousClass001.A0N("The Close BottomSheet Action has no target id."));
            return;
        }
        Dialog A00 = RgF.A00(A06);
        if (A00 == null || !A00.isShowing()) {
            return;
        }
        A00.dismiss();
        FJ9.A0B(gl7, fyG, 38);
    }
}
