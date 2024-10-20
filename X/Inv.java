package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: Inv.class */
public final class Inv implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !".nomedia".equals(str);
    }
}
