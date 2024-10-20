package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yh.class */
public final class C12034yh {
    public final C12044yi A02 = (C12044yi) 1Bi.A03(49412);
    public final 1Br A00 = 1Bq.A00(99390);
    public final 1Br A01 = 1Bq.A00(16385);

    public final boolean A00(ThreadKey threadKey) {
        boolean z = false;
        if (threadKey != null) {
            String A0u = threadKey.A0u();
            11T.A0A(A0u);
            C12044yi c12044yi = this.A02;
            int A03 = c12044yi.A03("chat_head_mute_state", A0u);
            C00i c00i = this.A01.A00;
            boolean z2 = false;
            if (A03 >= ((2yD) c00i.get()).Auy(36604180903041545L)) {
                z2 = true;
            }
            boolean z3 = false;
            if (((C0dp) this.A00.A00.get()).now() - c12044yi.A04("chat_head_mute_state", A0u) < ((2yD) c00i.get()).Auy(36604180902976008L) * 3600000) {
                z3 = true;
            }
            if (z2 && z3) {
                z = true;
            }
        }
        return z;
    }
}
