package X;

import java.io.File;

/* renamed from: X.0w9, reason: invalid class name */
/* loaded from: 0w9.class */
public final class C0w9 extends 0gS {
    public C0qh A00(C0gq c0gq) {
        C0qh A00 = C0qh.A00();
        A00.A05(C0g6.A6w, 0Pz.A0j("android_", c0gq.prefix, "java"));
        return A00;
    }

    public 0iP A01() {
        return 0iP.A0E;
    }

    public Integer A02() {
        return 0S2.A00;
    }

    public File[] A05(C0gq c0gq, File file) {
        if (c0gq == C0gq.LARGE_REPORT) {
            return new File[]{AnonymousClass001.A0D(file, "critical_java_app_death_early_prop.txt")};
        }
        return null;
    }
}
