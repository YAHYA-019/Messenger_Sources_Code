package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A3u.class */
public final class A3u implements AYf {
    public final ThreadKey A00;

    public A3u(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        4YV.A1N(r302, r305);
        8Nt AxW = ((5vV) r305).A00.AxW(C5kq.A00);
        if (AxW != null) {
            long j = AxW.A00;
            Context context = r302.A0D;
            ((C9iB) 7zN.A0k(context, 68342)).A02(1Fw.A01(context), this.A00.A04, j);
        }
    }
}
