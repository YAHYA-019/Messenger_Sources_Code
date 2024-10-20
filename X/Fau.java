package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: Fau.class */
public final class Fau implements 4cS {
    public final byte[] A00;

    public Fau(byte[] bArr) {
        this.A00 = bArr;
    }

    public InputStream CWH() {
        return new ByteArrayInputStream(this.A00);
    }

    public long size() {
        return this.A00.length;
    }
}
