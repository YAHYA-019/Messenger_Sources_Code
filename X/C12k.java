package X;

import java.io.OutputStream;
import java.util.zip.CRC32;

/* renamed from: X.12k, reason: invalid class name */
/* loaded from: 12k.class */
public abstract class C12k {
    public static void A00(long j, OutputStream outputStream) {
        while (j >= 128) {
            outputStream.write((byte) (128 | j));
            j >>>= 7;
        }
        outputStream.write((byte) j);
    }

    public static void A01(OutputStream outputStream, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        int i = 0;
        do {
            outputStream.write((byte) (value >>> (i * 8)));
            i++;
        } while (i < 4);
    }
}
