package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5jk, reason: invalid class name */
/* loaded from: 5jk.class */
public final class C5jk {
    public final 1Br A00 = 1Bq.A00(16385);

    public boolean A00(ThreadKey threadKey) {
        2yD r305;
        long j;
        boolean z = false;
        if (!threadKey.A0z()) {
            if (threadKey.A1K() || threadKey.A1F() || threadKey.A1D() || threadKey.A1B()) {
                r305 = (2yD) this.A00.A00.get();
                j = 36320859091451655L;
            }
            return z;
        }
        r305 = (2yD) this.A00.A00.get();
        j = 36320859091189507L;
        z = r305.AZk(j);
        return z;
    }

    public boolean A01(ThreadKey threadKey) {
        2yD r306;
        long j;
        boolean z = false;
        if (!threadKey.A0z()) {
            if (threadKey.A1K() || threadKey.A1F() || threadKey.A1D() || threadKey.A1B()) {
                r306 = (2yD) this.A00.A00.get();
                j = 36320859091451655L;
            }
            return z;
        }
        r306 = (2yD) this.A00.A00.get();
        j = 36320859091189507L;
        z = r306.AZr(1GD.A07, j);
        return z;
    }

    public boolean A02(ThreadKey threadKey) {
        if (!threadKey.A0z()) {
            return false;
        }
        return ((2yD) this.A00.A00.get()).AZk(threadKey.A0w() ? 36320859091058434L : 36320859090992897L);
    }

    public boolean A03(ThreadKey threadKey) {
        2yD A07;
        long j;
        if (threadKey.A1L()) {
            A07 = (2yD) this.A00.A00.get();
            j = 36320859090861823L;
        } else if (threadKey.A1D()) {
            A07 = 1Br.A07(this.A00);
            j = 36320859090927360L;
        } else {
            if (!threadKey.A1B()) {
                return false;
            }
            A07 = 1Br.A07(this.A00);
            j = 36320859090468605L;
        }
        return A07.AZk(j);
    }
}
