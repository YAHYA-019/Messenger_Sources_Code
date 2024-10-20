package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: L0o.class */
public final class L0o {
    public 1Gs A00;
    public final JWW A03;
    public final AnonymousClass540 A04;
    public final boolean A07;
    public final /* synthetic */ LVe A08;
    public final Object A05 = AnonymousClass001.A0R();
    public Kkv A02 = null;
    public Kkv A01 = null;
    public final boolean A06 = true;

    public L0o(Looper looper, LVe lVe, AnonymousClass540 anonymousClass540, boolean z) {
        this.A08 = lVe;
        this.A04 = anonymousClass540;
        this.A03 = new JWW(looper, this);
        this.A07 = z;
    }

    public static void A00(L0o l0o, int i, long j) {
        ArrayList A0t;
        int i2;
        AnonymousClass540 anonymousClass540 = l0o.A04;
        AnonymousClass540.A00(anonymousClass540);
        int i3 = anonymousClass540.A02;
        LVe lVe = l0o.A08;
        C00j.A05("FrameRateLogger.logFrameInfo", 1442646011);
        try {
            int min = Math.min(Math.max(GOn.A04(i, i3) - 1, 0), 100);
            LVe.A01(lVe.A0J, min, i3);
            LVe.A01(lVe.A0I, min, i3);
            L2c l2c = lVe.A0D;
            synchronized (l2c.A03) {
                Set<KaS> set = l2c.A07;
                A0t = AnonymousClass001.A0t(set.size() / 2);
                for (KaS kaS : set) {
                    long j2 = 1 << 0;
                    if ((j & j2) == j2) {
                        A0t.add(kaS);
                    }
                }
            }
            int i4 = 0;
            if (min <= 0) {
                while (true) {
                    if (i4 >= A0t.size()) {
                        break;
                    }
                    LVe.A02((KaS) A0t.get(i4), lVe.A09, 1);
                    i4++;
                }
            } else {
                KaS kaS2 = null;
                while (true) {
                    if (i2 >= A0t.size()) {
                        break;
                    }
                    KaS kaS3 = (KaS) A0t.get(i2);
                    if (kaS2 != null) {
                        KNC knc = KNC.GARBAGE_COLLECTION;
                        i2 = knc.compareTo(knc) >= 0 ? i2 + 1 : 0;
                    }
                    kaS2 = kaS3;
                }
                if (kaS2 != null) {
                    LVe.A02(kaS2, lVe.A07, min);
                    if (min >= 4) {
                        LVe.A02(kaS2, lVe.A06, min);
                    }
                    int i5 = min + 1;
                    while (true) {
                        if (i4 >= A0t.size()) {
                            break;
                        }
                        KaS kaS4 = (KaS) A0t.get(i4);
                        LVe.A02(kaS4, lVe.A08, min);
                        if (min >= 4) {
                            LVe.A02(kaS4, lVe.A05, min);
                        }
                        LVe.A02(kaS4, lVe.A09, i5);
                        i4++;
                    }
                } else {
                    C00j.A05("FrameRateLogger.updateBlameMarker.notBlamed", -1204053313);
                    C00j.A01(-794248737);
                }
            }
            C00j.A01(902142766);
        } catch (Throwable th) {
            C00j.A01(-1054375276);
            throw th;
        }
    }
}
