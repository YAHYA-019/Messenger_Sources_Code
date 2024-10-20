package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.3Sn, reason: invalid class name */
/* loaded from: 3Sn.class */
public final class C3Sn {
    public static final Comparator A02 = new G6c(16);
    public 0Gy A00;
    public File A01;

    public static File A00(C3Sn c3Sn) {
        File file = c3Sn.A01;
        if (file == null) {
            0Gy r303 = c3Sn.A00;
            if (r303 == null) {
                r303 = 0Gw.A00().A03;
                c3Sn.A00 = r303;
            }
            if (r303 == null) {
                return null;
            }
            file = r303.A03;
            if (!file.isDirectory() && !file.mkdirs()) {
                return null;
            }
            c3Sn.A01 = file;
        }
        return file;
    }
}
