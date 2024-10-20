package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: F66.class */
public final class F66 {
    public final C47l A00;
    public final C47n A01;
    public final 3zW A02;
    public final 45R A03;
    public final QuickPerformanceLogger A04;

    public F66(QuickPerformanceLogger quickPerformanceLogger) {
        FaI faI = new FaI();
        this.A04 = quickPerformanceLogger;
        this.A02 = faI;
        this.A03 = 45R.A05.A00();
        this.A01 = new FaH();
        this.A00 = FaG.A00;
    }

    public static C47s A00(F66 f66, int i, int i2, long j) {
        boolean z;
        boolean z2;
        long j2 = j;
        C47l c47l = f66.A00;
        long now = c47l.now();
        3zW r0 = f66.A02;
        long A01 = C47u.A01(now, r0.BGa(), r0.BGa());
        if (A01 != -1) {
            j2 = A01;
            z = false;
        } else {
            if (now - j > 5000) {
                j2 = now - 5000;
                z = true;
                z2 = true;
                QuickPerformanceLogger quickPerformanceLogger = f66.A04;
                11T.A0D(quickPerformanceLogger);
                45R r02 = f66.A03;
                C47s c47s = new C47s(c47l, f66.A01, r02, quickPerformanceLogger, r0.BGZ(), i, i2, now, j2, true, true);
                c47s.Bci("using_backup_start_time", z);
                c47s.Bci("using_capped_backup_start_time", z2);
                r02.A03(c47s);
                return c47s;
            }
            z = true;
        }
        z2 = false;
        QuickPerformanceLogger quickPerformanceLogger2 = f66.A04;
        11T.A0D(quickPerformanceLogger2);
        45R r022 = f66.A03;
        C47s c47s2 = new C47s(c47l, f66.A01, r022, quickPerformanceLogger2, r0.BGZ(), i, i2, now, j2, true, true);
        c47s2.Bci("using_backup_start_time", z);
        c47s2.Bci("using_capped_backup_start_time", z2);
        r022.A03(c47s2);
        return c47s2;
    }
}
