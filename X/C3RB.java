package X;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.3RB, reason: invalid class name */
/* loaded from: 3RB.class */
public abstract class C3RB {
    public 1Mw A00;
    public final 1Mi A01;

    public C3RB(1Mi r302, 1Mw r303) {
        this.A01 = r302;
        this.A00 = r303;
    }

    public static File A00(1Mi r301, String str) {
        if (TextUtils.isEmpty("android_link_parser")) {
            throw AnonymousClass001.A0N("Empty label");
        }
        1ZA A01 = 1Yr.A01(2041904105);
        3A7 r0 = new 3A7((int) (A01 == null ? 0L : A01.A00 / 86400));
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(r0.A01(), r0);
        File A0D = AnonymousClass001.A0D(r301.AUq(new 2Jm((1Zj) null, (File) null, (java.util.Map) null, A0u), 2041904105), str);
        if (A0D.exists()) {
            A0D.setLastModified(System.currentTimeMillis());
        }
        return A0D;
    }

    public File A01(String str, int i) {
        1Mi r0 = this.A01;
        if (TextUtils.isEmpty(1Yr.A04(i))) {
            throw AnonymousClass001.A0N("Empty label");
        }
        1ZA A01 = 1Yr.A01(i);
        3A7 r02 = new 3A7((int) (A01 == null ? 0L : A01.A00 / 86400));
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(r02.A01(), r02);
        File A0D = AnonymousClass001.A0D(r0.AUq(new 2Jm((1Zj) null, (File) null, (java.util.Map) null, A0u), i), str);
        if (A0D.exists()) {
            A0D.setLastModified(System.currentTimeMillis());
        }
        return A0D;
    }

    public File A02(String str, int i) {
        return A01(0Pz.A0W(UUID.randomUUID().toString(), str), i);
    }
}
