package X;

import android.widget.EditText;

/* loaded from: E2t.class */
public final class E2t extends 9Ae {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ DLQ A01;

    public E2t(FyG fyG, DLQ dlq) {
        this.A01 = dlq;
        this.A00 = fyG;
    }

    public void A00(EditText editText, String str) {
        DLQ dlq = this.A01;
        GJj A0u = DKC.A0u(dlq);
        if (A0u != null) {
            FAv.A01(dlq, this.A00, DKM.A06(DKM.A02(dlq), str), A0u);
        }
    }
}
