package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.0xz, reason: invalid class name */
/* loaded from: 0xz.class */
public final class C0xz implements 0Ql {
    public final String A00;
    public final HashMap A01 = AnonymousClass001.A0u();

    public C0xz(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r301.startsWith(X.0Pz.A0J(r302, '/')) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.String r301, java.lang.String r302) {
        /*
            java.util.HashMap r0 = androidx.core.content.FileProvider.A05
            r303 = r0
            r0 = r301
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L2a
            r0 = r304
            r1 = -1
            int r0 = r0 + r1
            r305 = r0
            r0 = r301
            r1 = r305
            char r0 = r0.charAt(r1)
            r306 = r0
            r0 = 47
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 != r1) goto L2a
            r0 = r301
            r1 = r305
            java.lang.String r0 = X.AnonymousClass001.A0c(r0, r1)
            r301 = r0
        L2a:
            r0 = r302
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L50
            r0 = r304
            r1 = -1
            int r0 = r0 + r1
            r305 = r0
            r0 = r302
            r1 = r305
            char r0 = r0.charAt(r1)
            r306 = r0
            r0 = 47
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 != r1) goto L50
            r0 = r302
            r1 = r305
            java.lang.String r0 = X.AnonymousClass001.A0c(r0, r1)
            r302 = r0
        L50:
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L71
            r0 = r302
            r1 = 47
            java.lang.String r0 = X.0Pz.A0J(r0, r1)
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L73
        L71:
            r0 = 1
            r304 = r0
        L73:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0xz.A00(java.lang.String, java.lang.String):boolean");
    }

    public File AmP(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(AnonymousClass001.A0W(indexOf, encodedPath));
        File file = (File) this.A01.get(decode);
        if (file == null) {
            throw AnonymousClass002.A0C(uri, "Unable to find configured root for ", AnonymousClass001.A0k());
        }
        File A0D = AnonymousClass001.A0D(file, decode2);
        try {
            File canonicalFile = A0D.getCanonicalFile();
            if (A00(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw AnonymousClass001.A0V("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw AnonymousClass002.A0C(A0D, "Failed to resolve canonical path for ", AnonymousClass001.A0k());
        }
    }
}
