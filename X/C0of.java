package X;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/* renamed from: X.0of, reason: invalid class name */
/* loaded from: 0of.class */
public final class C0of implements FileFilter {
    public final int A00;
    public final String A01;

    public C0of(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean endsWith;
        switch (this.A00) {
            case 0:
                String str = this.A01;
                List list = C0h9.A05;
                C0k4.A00(file);
                return file.getName().startsWith(str);
            case 1:
                String str2 = this.A01;
                if (file == null) {
                    return false;
                }
                endsWith = file.getName().endsWith(str2);
                break;
            default:
                String str3 = this.A01;
                if (file == null || !file.isDirectory()) {
                    return false;
                }
                if (!file.getName().startsWith(0Pz.A0j("session_", str3, "_"))) {
                    endsWith = file.getName().startsWith(0Pz.A0j("sess_", str3, "_"));
                    break;
                } else {
                    return true;
                }
                break;
        }
        return endsWith;
    }
}
