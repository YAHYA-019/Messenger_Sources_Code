package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: L1x.class */
public final class L1x {
    public final /* synthetic */ L4G A00;
    public final /* synthetic */ 1xH A01;

    public L1x(L4G l4g, 1xH r303) {
        this.A00 = l4g;
        this.A01 = r303;
    }

    public static void A00(KO9 ko9, KNA kna, L1x l1x, Throwable th) {
        l1x.A01(new KQh(ko9, kna, th));
    }

    public void A01(KQh kQh) {
        KOL kol;
        0fH.A0j("VestaRegistrationClient", "Vesta registration failed");
        L4G l4g = this.A00;
        String message = kQh.getMessage();
        if (message == null) {
            message = "Unknown Vesta registration failure";
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = l4g.A02;
        int i = l4g.A00;
        int i2 = l4g.A01;
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "vesta_registration_failed");
        JQx.A1G(lightweightQuickPerformanceLogger, "vesta_registration_error", message, i, i2);
        1xH r0 = this.A01;
        KNA kna = kQh.exceptionType;
        if (kna == KNA.A08) {
            KO9 ko9 = kQh.vestaServiceErrorCode;
            if (ko9 != null) {
                int ordinal = ko9.ordinal();
                if (ordinal == 2) {
                    kol = KOL.A09;
                } else if (ordinal == 3) {
                    kol = KOL.A06;
                } else if (ordinal == 10) {
                    kol = KOL.A03;
                } else if (ordinal == 11) {
                    kol = KOL.A07;
                }
            }
            kol = KOL.A05;
        } else {
            if (kna == KNA.A06) {
                kol = KOL.A0C;
            }
            kol = KOL.A05;
        }
        r0.A04(new JkF(kol));
    }
}
