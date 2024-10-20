package X;

import java.io.File;

/* loaded from: Hkm.class */
public final class Hkm {
    public boolean A00(File file) {
        boolean z;
        File parentFile;
        String[] list;
        if (!file.exists() || (!((parentFile = file.getParentFile()) == null || parentFile.canWrite()) || (file.isDirectory() && (list = file.list()) != null && list.length > 0))) {
            z = false;
        } else {
            try {
                z = true;
                if (!file.delete()) {
                    return false;
                }
            } catch (SecurityException unused) {
                return false;
            }
        }
        return z;
    }
}
