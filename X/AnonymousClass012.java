package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.012, reason: invalid class name */
/* loaded from: 012.class */
public abstract class AnonymousClass012 {
    public AnonymousClass010 A00;
    public AnonymousClass011 A01;
    public boolean A02;

    public static LightweightQuickPerformanceLogger A00(AnonymousClass012 anonymousClass012) {
        AnonymousClass011 anonymousClass011 = anonymousClass012.A01;
        if (anonymousClass011 == null) {
            return null;
        }
        return (LightweightQuickPerformanceLogger) anonymousClass011.A00.get();
    }

    private void A01(String str) {
        if (!this.A02 || A00(this) == null) {
            return;
        }
        A00(this).markerPoint(157825012, str);
    }

    private void A02(Throwable th) {
        0fH.A0u("Fixie", "exception in FixieInitializer", th);
        AnonymousClass011 anonymousClass011 = this.A01;
        if (anonymousClass011 == null || anonymousClass011.A01.get() == null) {
            return;
        }
        AnonymousClass011 anonymousClass0112 = this.A01;
        AnonymousClass047 ACv = (anonymousClass0112 == null ? null : (AnonymousClass046) anonymousClass0112.A01.get()).ACv(AnonymousClass001.A0K(), "FixieInitializer", 817901561);
        ACv.Cmr(th);
        ACv.report();
    }

    public abstract List A03(AnonymousClass010 anonymousClass010, Integer num);

    public final void A04(AnonymousClass014 anonymousClass014) {
        try {
            String name = anonymousClass014.getName();
            A01(0Pz.A0W(name, "_start"));
            AnonymousClass011 anonymousClass011 = this.A01;
            if (anonymousClass011 != null) {
                ((AnonymousClass013) anonymousClass014).A00 = anonymousClass011;
            }
            anonymousClass014.init();
            A01(0Pz.A0W(name, "_end"));
        } catch (Throwable th) {
            A02(th);
        }
    }

    public final void A05(Integer num) {
        try {
            if (!this.A02) {
                this.A02 = true;
                if (A00(this) != null) {
                    A00(this).markerStart(157825012, 0, C0ft.A00(), TimeUnit.MILLISECONDS);
                }
            }
            List<AnonymousClass014> A03 = A03(this.A00, num);
            if (A03 != null) {
                String str = num.intValue() != 0 ? "POST_APP_START" : "ASAP";
                A01(0Pz.A0W(str, "_start"));
                for (AnonymousClass014 anonymousClass014 : A03) {
                    if (anonymousClass014 != null) {
                        A04(anonymousClass014);
                    }
                }
                A01(0Pz.A0W(str, "_end"));
            }
        } catch (Throwable th) {
            A02(th);
        }
    }
}
