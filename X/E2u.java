package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: E2u.class */
public final class E2u extends 9Ae {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ DLQ A01;
    public final /* synthetic */ GJj A02;

    public E2u(FyG fyG, DLQ dlq, GJj gJj) {
        this.A00 = fyG;
        this.A01 = dlq;
        this.A02 = gJj;
    }

    public void A00(EditText editText, String str) {
        if (str == null || str.length() != 6) {
            return;
        }
        FyG fyG = this.A00;
        InputMethodManager A06 = AbI.A06(fyG.A00);
        if (A06 != null && A06.isAcceptingText()) {
            7zR.A12(editText, A06);
        }
        FAv.A01(this.A01, fyG, DKM.A08(str), this.A02);
    }
}
