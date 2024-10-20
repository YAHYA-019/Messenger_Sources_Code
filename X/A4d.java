package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A4d.class */
public final class A4d implements 7H9 {
    public final 1pK A00;
    public final ThreadKey A01;
    public final 6tF A02;

    public A4d(1pK r302, ThreadKey threadKey, 6tF r304) {
        this.A00 = r302;
        this.A01 = threadKey;
        this.A02 = r304;
    }

    public void BLW(Context context, C5vw c5vw) {
        11T.A0F(c5vw, 1);
        if ((c5vw instanceof 8NV) && ((8NV) c5vw).A00 == 0) {
            this.A02.BY5(this.A00, this.A01, 1025, true);
        }
    }
}
