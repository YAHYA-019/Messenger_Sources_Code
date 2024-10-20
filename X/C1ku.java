package X;

import com.facebook.analytics.DeprecatedAnalyticsLogger;

/* renamed from: X.1ku, reason: invalid class name */
/* loaded from: 1ku.class */
public final class C1ku implements C1kv {
    public final DeprecatedAnalyticsLogger A00;
    public final 1RX A01;

    public C1ku(DeprecatedAnalyticsLogger deprecatedAnalyticsLogger, 1RX r303) {
        11T.A0F(deprecatedAnalyticsLogger, 1);
        11T.A0F(r303, 2);
        this.A00 = deprecatedAnalyticsLogger;
        this.A01 = r303;
    }

    @Override // X.C1kv
    public AbstractC01593ro A3u(String str, boolean z) {
        11T.A0F(str, 0);
        DeprecatedAnalyticsLogger deprecatedAnalyticsLogger = this.A00;
        return new C01583rn(1RX.A01((1RX) deprecatedAnalyticsLogger.A02.get(), 0S2.A00, (String) null, str, false), ((1JE) deprecatedAnalyticsLogger.A00.get()).A01(str).A00);
    }

    @Override // X.C1kv
    public 1Rf A3y(C2fa c2fa) {
        11T.A0F(c2fa, 0);
        1Rf A05 = this.A01.A05(c2fa);
        11T.A0A(A05);
        return A05;
    }

    @Override // X.C1kv
    public 1Rf A3z(String str, boolean z, boolean z2) {
        1Rf A01 = 1RX.A01(this.A01, 0S2.A00, (String) null, str, false);
        11T.A0A(A01);
        return A01;
    }

    @Override // X.C1kv
    public void BZZ(2Jy r302) {
        DeprecatedAnalyticsLogger deprecatedAnalyticsLogger = this.A00;
        if (r302.A07) {
            deprecatedAnalyticsLogger.A02(r302);
        } else {
            deprecatedAnalyticsLogger.A03(r302);
        }
    }

    @Override // X.C1kv
    public void BZq(2Jy r302) {
        this.A00.A03(r302);
    }

    @Override // X.C1kv
    public void Ba5(2Jy r302) {
        DeprecatedAnalyticsLogger deprecatedAnalyticsLogger = this.A00;
        if (r302 != null) {
            String str = r302.A04;
            if (DeprecatedAnalyticsLogger.A01(deprecatedAnalyticsLogger, str)) {
                1Rf A01 = 1RX.A01((1RX) deprecatedAnalyticsLogger.A02.get(), 0S2.A00, (String) null, str, r302.A0G());
                if (A01.A0D()) {
                    DeprecatedAnalyticsLogger.A00(r302, A01);
                }
            }
        }
    }

    @Override // X.C1kv
    public void Ba8(2Jy r302) {
        DeprecatedAnalyticsLogger deprecatedAnalyticsLogger = this.A00;
        if (r302 != null) {
            String str = r302.A04;
            if (DeprecatedAnalyticsLogger.A01(deprecatedAnalyticsLogger, str)) {
                DeprecatedAnalyticsLogger.A00(r302, ((1RX) deprecatedAnalyticsLogger.A02.get()).A06(0S2.A00, str, r302.A0G()));
            }
        }
    }

    @Override // X.C1kv
    public void Bb1(2Jy r302) {
        this.A00.A02(r302);
    }
}
