package X;

import java.io.File;
import java.util.Comparator;

/* loaded from: J4f.class */
public final class J4f implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        long lastModified = ((File) obj2).lastModified() - ((File) obj).lastModified();
        if (lastModified == 0) {
            i = 0;
        } else {
            i = -1;
            if (lastModified > 0) {
                return 1;
            }
        }
        return i;
    }
}
