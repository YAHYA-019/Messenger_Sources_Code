package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D1k.class */
public final class D1k implements 7H9 {
    public final 1pK A00;
    public final ThreadKey A01;

    public D1k(1pK r302, ThreadKey threadKey) {
        this.A00 = r302;
        this.A01 = threadKey;
    }

    public void BLW(Context context, C5vw c5vw) {
        11T.A0F(c5vw, 1);
        if (AnonymousClass868.A00(5, c5vw)) {
            ((82O) 1Bn.A0A(793)).A0L(this.A00.getContext(), this.A01).A02(BNV.A1P, "admin_msg");
        }
    }
}
