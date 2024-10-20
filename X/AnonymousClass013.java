package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.013, reason: invalid class name */
/* loaded from: 013.class */
public abstract class AnonymousClass013 implements AnonymousClass014 {
    public AnonymousClass011 A00;
    public final AnonymousClass010 A01;

    public AnonymousClass013(AnonymousClass010 anonymousClass010) {
        this.A01 = anonymousClass010;
    }

    public AnonymousClass010 A05(Class cls) {
        AnonymousClass010 anonymousClass010 = this.A01;
        if (!cls.isInstance(anonymousClass010)) {
            anonymousClass010 = null;
        }
        return anonymousClass010;
    }

    public AnonymousClass046 A06() {
        AnonymousClass011 anonymousClass011 = this.A00;
        if (anonymousClass011 == null) {
            return null;
        }
        return (AnonymousClass046) anonymousClass011.A01.get();
    }

    public void A07() {
        AnonymousClass011 anonymousClass011 = this.A00;
        if (anonymousClass011 == null || anonymousClass011.A00.get() == null) {
            return;
        }
        AnonymousClass011 anonymousClass0112 = this.A00;
        (anonymousClass0112 == null ? null : (LightweightQuickPerformanceLogger) anonymousClass0112.A00.get()).markerAnnotate(157825012, 0Pz.A0W(getName(), "_enabled"), true);
    }

    public void A08(String str) {
        AnonymousClass011 anonymousClass011 = this.A00;
        if (anonymousClass011 == null || anonymousClass011.A00.get() == null) {
            return;
        }
        AnonymousClass011 anonymousClass0112 = this.A00;
        (anonymousClass0112 == null ? null : (LightweightQuickPerformanceLogger) anonymousClass0112.A00.get()).markerAnnotate(157825012, 0Pz.A0W(getName(), "_disabled"), str);
    }

    public void A09(String str) {
        String name = getName();
        0fH.A0d(name, str, "Fixie", "[%s] Error message: %s");
        if (A06() != null) {
            A06().ACu(name, 817901561);
            AnonymousClass047 ACu = A06() == null ? null : A06().ACu(name, 817901561);
            ACu.A8K("message", str);
            ACu.report();
        }
    }

    public void A0A(Throwable th) {
        String name = getName();
        0fH.A0d(name, th.getMessage(), "Fixie", "[%s] Error message: %s");
        if (A06() != null) {
            AnonymousClass047 ACv = A06().ACv(AnonymousClass001.A0K(), name, 817901561);
            ACv.Cmr(th);
            ACv.report();
        }
    }
}
