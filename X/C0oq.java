package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.0oq, reason: invalid class name */
/* loaded from: 0oq.class */
public final class C0oq implements FilenameFilter {
    public final int A00;

    public C0oq(int i) {
        this.A00 = i;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                if (!str.startsWith("override-")) {
                    if (!str.endsWith(".log") && !str.endsWith(".zip")) {
                        str2 = ".tmp";
                        break;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (!str.startsWith("override-")) {
                    return false;
                }
                str2 = ".log";
                break;
            default:
                return false;
        }
        return str.endsWith(str2);
    }
}
