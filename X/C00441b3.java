package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b3.class */
public final class C00441b3 {
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public final Context A00;
    public final String A01;

    static {
        String str = File.separator;
        A04 = 0Pz.A0W(str, "locagg");
        A02 = 0Pz.A0W(str, "active");
        A03 = 0Pz.A0W(str, "stash");
    }

    public C00441b3(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public static String A00(C00441b3 c00441b3, String str) {
        String str2 = c00441b3.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(c00441b3.A00.getDir("qpl", 0).getPath());
        String str3 = A04;
        if (str2 != null) {
            A0k.append(str3);
            A0k.append("_");
            A0k.append(str2);
        } else {
            A0k.append(str3);
        }
        return AnonymousClass001.A0d(str, A0k);
    }

    public void A01() {
        File A0E = AnonymousClass001.A0E(A00(this, A03));
        if (A0E.exists()) {
            File[] listFiles = A0E.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    listFiles[i2].delete();
                    i = i2 + 1;
                }
            }
            A0E.delete();
        }
    }
}
