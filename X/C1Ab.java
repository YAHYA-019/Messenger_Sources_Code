package X;

import java.io.File;

/* renamed from: X.1Ab, reason: invalid class name */
/* loaded from: 1Ab.class */
public final class C1Ab extends 0gS {
    public C0qh A00(C0gq c0gq) {
        C0qh A00 = C0qh.A00();
        A00.A05(C0g6.A4x, "anr");
        A00.A05(C0g6.A6w, 0Pz.A0j("android_", c0gq.prefix, "anr"));
        return A00;
    }

    public 0iP A01() {
        return 0iP.A04;
    }

    public Integer A02() {
        return 0S2.A00;
    }

    public void A03(C0gq c0gq, File file, File file2) {
        if (file2 != null) {
            File file3 = new File(file2, "critical_anr_prop.txt");
            if (file3.exists()) {
                file3.renameTo(new File(file3.getParentFile(), "critical_suppl_anr_extra_prop.txt"));
            }
        }
        super.A03(c0gq, file, file2);
    }

    public void A04(C0gq c0gq, File file, File file2, String str) {
        if (C0gp.A01 != 1 || str.equals(0iP.A04.mName)) {
            A03(c0gq, file, file2);
        }
    }
}
