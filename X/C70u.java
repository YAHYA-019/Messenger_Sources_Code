package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.70u, reason: invalid class name */
/* loaded from: 70u.class */
public final class C70u {
    public final 1Br A00 = 1Bq.A00(16387);

    public final int A00() {
        return (int) ((2yD) this.A00.A00.get()).Av9(1GD.A07, 72620964898341041L);
    }

    public final boolean A01() {
        return ((2yD) this.A00.A00.get()).AZr(1GD.A07, 72339489922221316L);
    }

    public final boolean A02(ThreadKey threadKey) {
        2yD r303;
        long j;
        11T.A0F(threadKey, 0);
        if (threadKey.A0z()) {
            r303 = (2yD) this.A00.A00.get();
            j = 72339489921500414L;
        } else if (threadKey.A0y()) {
            r303 = (2yD) this.A00.A00.get();
            j = 72339489922352390L;
        } else {
            if (!threadKey.A1N()) {
                return false;
            }
            r303 = (2yD) this.A00.A00.get();
            j = 72339489922090243L;
        }
        return r303.AZk(j);
    }
}
