package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.7ok, reason: invalid class name */
/* loaded from: 7ok.class */
public final class C7ok {
    public final 1tQ A00;

    public C7ok(1sO r302, File file, String str) {
        String absolutePath;
        1BK.A1J(str, 1, r302);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        this.A00 = r302.A01(str, absolutePath, "stash_extras");
    }
}
