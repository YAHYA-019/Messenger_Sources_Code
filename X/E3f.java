package X;

import android.app.Dialog;

/* loaded from: E3f.class */
public final class E3f extends FIJ {
    public final GL7 A00;

    public E3f(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        String str;
        String A06 = GL7.A06(this.A00);
        if (A06 == null) {
            str = "Can't find targetId of dialog to dismiss";
        } else {
            Dialog A00 = RgF.A00(A06);
            if (A00 != null && A00.isShowing()) {
                A00.dismiss();
                return;
            }
            str = "Can't find dialog";
        }
        0fH.A0n("FBDismissDialogAction", str);
    }
}
