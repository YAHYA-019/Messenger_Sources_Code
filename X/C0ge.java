package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0ge, reason: invalid class name */
/* loaded from: 0ge.class */
public class C0ge extends 1AE {
    public final File A00;
    public final String A01;

    public C0ge(Context context, File file, File file2, String str) {
        super(context, file, true);
        this.A00 = file2;
        this.A01 = str;
    }

    public C0ge(Context context, File file, String str, String str2) {
        super(context, str, true);
        this.A00 = file;
        this.A01 = str2;
    }

    public String A07() {
        return "ExtractFromZipSoSource";
    }

    public C0h1 A0B() {
        return new C0l4(this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String name;
        String A07 = A07();
        File file = this.A00;
        try {
            name = file.getCanonicalPath();
        } catch (IOException unused) {
            name = file.getName();
        }
        return 0Pz.A0v(A07, "[", name, "]");
    }
}
