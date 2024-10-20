package X;

import java.io.IOException;

/* loaded from: Lal.class */
public final class Lal implements MFv {
    public final 6W4 A00;
    public final 6Vz A01;
    public final boolean A02;
    public final Object A03;

    public Lal(6W4 r302, 6Vz r303, Object obj, boolean z) {
        this.A01 = r303;
        this.A00 = r302;
        this.A03 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.6bI, X.Lan] */
    @Override // X.MFv
    public 6bI AIz(Kl8 kl8) {
        C6b1 c6b1 = kl8.A04;
        c6b1.getClass();
        String str = c6b1.A03;
        6bI r0 = null;
        try {
            C5ho c5ho = C5ho.A06;
            boolean z = this.A02;
            6bI A01 = c5ho.A01(this.A00.A00, this.A01, 0S2.A01, str, z);
            5LG.A01(4YT.A00(1009));
            A01.AHL(kl8.A00, kl8.A01, kl8.A02, this.A03, 0);
            5LG.A00();
            5LG.A01("startCodec");
            A01.start();
            5LG.A00();
            ?? obj = new Object();
            obj.A00 = A01;
            obj.A02 = str;
            obj.A01 = this;
            return obj;
        } catch (KQe e) {
            if (0 != 0) {
                r0.release();
            }
            e = new IOException((Throwable) e);
            throw e;
        } catch (Exception e2) {
            e = e2;
            if (0 != 0) {
                r0.release();
                throw e;
            }
            throw e;
        }
    }
}
