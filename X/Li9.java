package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: Li9.class */
public final /* synthetic */ class Li9 implements FileFilter {
    public static final /* synthetic */ Li9 A00 = new Object();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
