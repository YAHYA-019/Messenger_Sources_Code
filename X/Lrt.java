package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: Lrt.class */
public abstract class Lrt implements FileVisitor, MRa {
    public final FileVisitResult onAccept;
    public final FileVisitResult onReject;

    public Lrt() {
        this(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    public Lrt(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.onAccept = fileVisitResult;
        this.onReject = fileVisitResult2;
    }

    @Override // java.nio.file.FileVisitor
    /* renamed from: A3h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return Files.isSymbolicLink(path) ? this.onAccept : this.onReject;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Files.isSymbolicLink(file.toPath());
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        C6f2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        return accept(AnonymousClass001.A0D(file, str));
    }

    @Override // java.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return 1BK.A1V(preVisitDirectory(path, null), FileVisitResult.TERMINATE);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }

    public String toString() {
        return AnonymousClass001.A0X(this);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }
}
