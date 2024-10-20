package X;

import java.nio.ByteBuffer;

/* loaded from: L5w.class */
public abstract class L5w {
    public static int A00(ByteBuffer byteBuffer, int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = (i + 7) >> 3;
        int i3 = i % 8;
        int i4 = i2 - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += Integer.bitCount(255 & byteBuffer.get(i6));
        }
        byte b = byteBuffer.get(i4);
        if (i3 != 0) {
            b = (byte) (b | ((byte) (255 << i3)));
        }
        return (i2 * 8) - (i5 + Integer.bitCount(b & 255));
    }

    public static void A01(int i, ByteBuffer byteBuffer) {
        int i2 = i >> 3;
        byte b = byteBuffer.get(i2);
        byteBuffer.position(i2);
        byteBuffer.put((byte) (b - (((byte) (1 << (i & 7))) & b)));
    }

    public static void A02(int i, ByteBuffer byteBuffer) {
        int i2 = i >> 3;
        byte b = byteBuffer.get(i2);
        byteBuffer.position(i2);
        byteBuffer.put((byte) (((byte) (1 << (i & 7))) | b));
    }
}
