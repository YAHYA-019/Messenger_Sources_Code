package X;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: Lia.class */
public final class Lia implements Serializable, MRa {
    public static final MRa A00;
    public static final MRa A01;
    public static final String A02 = Boolean.TRUE.toString();
    public static final long serialVersionUID = 8782512160909720199L;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.MRa, java.lang.Object] */
    static {
        ?? obj = new Object();
        A01 = obj;
        A00 = obj;
    }

    @Override // X.MHa
    public FileVisitResult A3h(Path path, BasicFileAttributes basicFileAttributes) {
        return FileVisitResult.CONTINUE;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // java.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return true;
    }

    public String toString() {
        return A02;
    }
}
