package X;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: Kyh.class */
public abstract class Kyh {
    public static final OpenOption[] A01;
    public static final OpenOption[] A02 = {StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
    public static final LinkOption[] A00 = new LinkOption[0];

    static {
        new LinkOption[1][0] = LinkOption.NOFOLLOW_LINKS;
        A01 = new OpenOption[0];
    }

    public static void A00(Path path, LinkOption... linkOptionArr) {
        try {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
            if (dosFileAttributeView != null) {
                dosFileAttributeView.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        Path parent = path == null ? null : path.getParent();
        LinkOption[] linkOptionArr2 = linkOptionArr;
        C6f2.A00("path", parent);
        if (linkOptionArr == null) {
            linkOptionArr2 = new LinkOption[0];
        }
        if (Files.exists(parent, linkOptionArr2)) {
            BasicFileAttributes basicFileAttributes = null;
            if (parent != null) {
                try {
                    basicFileAttributes = Files.readAttributes(parent, (Class<BasicFileAttributes>) PosixFileAttributes.class, linkOptionArr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
                if (basicFileAttributes != null) {
                    List asList = Arrays.asList(PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE);
                    Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(parent, linkOptionArr);
                    posixFilePermissions.addAll(asList);
                    Files.setPosixFilePermissions(parent, posixFilePermissions);
                    return;
                }
            }
        }
        throw AnonymousClass001.A0G(String.format("DOS or POSIX file operations not available for '%s' %s", path, Arrays.toString(linkOptionArr)));
    }
}
