package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.10G, reason: invalid class name */
/* loaded from: 10G.class */
public abstract class C10G {
    public final Integer A00;

    public C10G(Integer num) {
        this.A00 = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C10G A00(android.net.Uri r301) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10G.A00(android.net.Uri):X.10G");
    }

    public File A01(Context context, C0zj c0zj, String str, String str2) {
        String str3;
        10D A00 = C1AJ.A00(context);
        if (c0zj == null) {
            c0zj = C0zj.A03;
        }
        0OS A02 = 10D.A02(A00, c0zj);
        switch (this.A00.intValue()) {
            case 0:
                str3 = "any_app";
                break;
            case 1:
                str3 = "third_party";
                break;
            default:
                str3 = "family";
                break;
        }
        String A0W = 0Pz.A0W("__SFP_SCOPE__/", str3);
        if (A0W != null && !A0W.isEmpty()) {
            HashMap hashMap = A02.A02;
            if (hashMap.containsKey(A0W)) {
                A02 = (0OS) hashMap.get(A0W);
            } else {
                A02 = new 0OS(A02.A00, AnonymousClass001.A0D(A02.A01, A0W));
                hashMap.put(A0W, A02);
            }
        }
        if (str2 != null && !str2.startsWith(".")) {
            str2 = 0Pz.A0W(".", str2);
        }
        return File.createTempFile(str, str2, A02.A00());
    }

    public abstract Boolean A02(Context context);
}
