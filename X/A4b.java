package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A4b.class */
public final class A4b implements 7H9 {
    public final View A00;
    public final ThreadKey A01;

    public A4b(View view, ThreadKey threadKey) {
        this.A00 = view;
        this.A01 = threadKey;
    }

    public void BLW(Context context, C5vw c5vw) {
        11T.A0F(c5vw, 1);
        if ((c5vw instanceof 8NV) && ((8NV) c5vw).A00 == 1) {
            ThreadKey threadKey = this.A01;
            View view = this.A00;
            if (view != null) {
                1Bn.A0A(147531);
                1pI A00 = 1vD.A00(view);
                if (A00.BVa()) {
                    CAf.A00(A00, threadKey, "thread details");
                }
            }
        }
    }
}
