package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1dH, reason: invalid class name */
/* loaded from: 1dH.class */
public final class C1dH extends 1Km {
    public final 1Br A00 = 1Bq.A00(85048);
    public final 1Br A03 = 1Bq.A00(66435);
    public final 1Br A04 = 1Bq.A00(66326);
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(66424);

    public C02S Au6() {
        if (!0F3.A01(5505027) && !0F3.A01(544416960) && !((2yD) this.A02.A00.get()).AZk(36314820366180601L)) {
            MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) this.A01.A00.get();
            if (!messagingStateChangePerformanceLogger.A0J || !messagingStateChangePerformanceLogger.A0K) {
                C02S c02s = C02S.A03;
                11T.A0B(c02s);
                return c02s;
            }
        }
        return new C02S(new int[]{53084161}, null);
    }

    public void C5e(AnonymousClass045 anonymousClass045, C03b c03b, String str, int i, long j, long j2, boolean z) {
        11T.A0F(str, 1);
        MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) this.A00.A00.get();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        11T.A0A(lowerCase);
        String A0W = 0Pz.A0W("msys_bootstrap_", lowerCase);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        messagingPerformanceLogger.A0n(A0W, timeUnit, j2);
        1SG r0 = (1SG) this.A03.A00.get();
        String lowerCase2 = str.toLowerCase(locale);
        11T.A0A(lowerCase2);
        r0.A0b(0Pz.A0W("msys_bootstrap_", lowerCase2), timeUnit, j2);
        ((1SG) this.A04.A00.get()).A0b(0Pz.A0W("msys_bootstrap_", lowerCase2), timeUnit, j2);
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) this.A00.A00.get();
        long AtB = c03b.AtB();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        messagingPerformanceLogger.A0n("msys_bootstrap_stop", timeUnit, AtB);
        ((MessagingStateChangePerformanceLogger) this.A01.A00.get()).A0D("msys_bootstrap_stop", timeUnit, c03b.AyG());
        ((1SG) this.A03.A00.get()).A0b("msys_bootstrap_stop", timeUnit, c03b.AtB());
        ((1SG) this.A04.A00.get()).A0b("msys_bootstrap_stop", timeUnit, c03b.AtB());
    }

    public String getName() {
        return "messenger_msys_bootstrap_listener";
    }
}
