package X;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.SimpleFileVisitor;

/* loaded from: Ly2.class */
public abstract class Ly2 extends SimpleFileVisitor implements FileVisitor {
    public final KgD A00 = new KgD(this);

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return super.visitFileFailed(obj, iOException);
    }
}
