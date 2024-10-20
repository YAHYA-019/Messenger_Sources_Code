package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.5ek, reason: invalid class name */
/* loaded from: 5ek.class */
public final class C5ek {
    public final int A00;
    public final int A01;
    public final File A02;
    public final InputStream A03;

    public C5ek(File file, int i, int i2) {
        this.A02 = file;
        this.A03 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public C5ek(InputStream inputStream) {
        this.A02 = null;
        this.A03 = inputStream;
        this.A01 = 0;
        this.A00 = -1;
    }
}
