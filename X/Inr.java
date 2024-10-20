package X;

import java.io.Closeable;
import java.io.DataInputStream;

/* loaded from: Inr.class */
public final class Inr implements Closeable {
    public boolean A00;
    public String[] A01;
    public final DataInputStream A02;
    public final java.util.Map A03;

    public Inr(DataInputStream dataInputStream, java.util.Map map) {
        this.A02 = dataInputStream;
        this.A03 = map;
    }

    public static N0x A00(Inr inr) {
        N0x A00;
        N0x n0x;
        DataInputStream dataInputStream = inr.A02;
        byte readByte = dataInputStream.readByte();
        String str = null;
        switch (readByte) {
            case 12:
                n0x = null;
                str = inr.A01[dataInputStream.readShort()];
                A00 = null;
                break;
            case 13:
            case 14:
            case 15:
                A00 = A00(inr);
                if (readByte != 13) {
                    n0x = null;
                    break;
                } else {
                    n0x = A00(inr);
                    break;
                }
            default:
                A00 = null;
                n0x = null;
                break;
        }
        return new N0x(A00, n0x, str, readByte);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }
}
