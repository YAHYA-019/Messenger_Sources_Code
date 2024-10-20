package X;

import android.net.Uri;
import java.io.FileNotFoundException;

/* loaded from: I6J.class */
public abstract class I6J {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long A00(X.Hqj r301, X.HfH r302, java.lang.Double r303, java.lang.Double r304) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6J.A00(X.Hqj, X.HfH, java.lang.Double, java.lang.Double):long");
    }

    public static final long A01(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue >= 0.0d) {
                return (long) (doubleValue * 1000.0d);
            }
        }
        return -1;
    }

    public static final Uri A02(String str) {
        11T.A0F(str, 0);
        Uri A0C = 7zU.A0C(str);
        String scheme = A0C.getScheme();
        if (!11T.A0O(scheme, "file")) {
            throw 0Pz.A05("Transcoder only support local files as input (file://). Invalid input file URI scheme: ", scheme);
        }
        String path = A0C.getPath();
        if (path == null || path.length() == 0) {
            throw 0Pz.A05("Invalid input file URI passed to the transcoder: ", str);
        }
        if (AnonymousClass001.A1X(path)) {
            return A0C;
        }
        throw new FileNotFoundException(0Pz.A0W("Input file to the transcoder is not found: ", str));
    }
}
