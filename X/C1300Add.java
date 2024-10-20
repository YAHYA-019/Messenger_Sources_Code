package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Add, reason: case insensitive filesystem */
/* loaded from: Add.class */
public final class C1300Add {
    public final C00i A00 = AbH.A0S();

    public int A00(ThreadKey threadKey) {
        if (ThreadKey.A0a(threadKey)) {
            threadKey = ThreadKey.A08(threadKey.A04);
        }
        1G2 r0 = 1NK.A06;
        1G2 A05 = AbstractC03303xn.A05(threadKey);
        C00i c00i = this.A00;
        if (1BK.A0R(c00i).BNM(A05)) {
            return 1BK.A0R(c00i).ArU(A05, 0);
        }
        return 0;
    }
}
