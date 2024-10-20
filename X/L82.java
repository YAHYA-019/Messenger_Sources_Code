package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* loaded from: L82.class */
public abstract class L82 {
    public int[] A00;
    public final int A01;

    public L82(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.A00 = LCf.A03(bArr);
        this.A01 = i;
    }

    public static void A00(L82 l82, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        int length = bArr.length;
        int i = l82 instanceof KBk ? 24 : 12;
        if (length != i) {
            throw JQy.A0z("The nonce length (in bytes) must be ", i);
        }
        int remaining = byteBuffer2.remaining();
        int i2 = (remaining / 64) + 1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return;
            }
            ByteBuffer A02 = l82.A02(bArr, l82.A01 + i4);
            int i5 = 64;
            if (i4 == i2 - 1) {
                i5 = remaining % 64;
            }
            A01(byteBuffer, byteBuffer2, A02, i5);
            i3 = i4 + 1;
        }
    }

    public static final void A01(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw AnonymousClass001.A0L("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return;
            }
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            i2 = i3 + 1;
        }
    }

    public ByteBuffer A02(byte[] bArr, int i) {
        int i2;
        int[] iArr;
        int[] A03 = LCf.A03(bArr);
        if (this instanceof KBk) {
            int length = A03.length;
            if (length != 6) {
                throw 1BK.A0f("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", AnonymousClass001.A1a(length * 32));
            }
            i2 = 16;
            iArr = new int[16];
            LCf.A02(iArr, LCf.A04(this.A00, A03));
            iArr[12] = i;
            iArr[13] = 0;
            iArr[14] = A03[4];
            iArr[15] = A03[5];
        } else {
            int length2 = A03.length;
            if (length2 != 3) {
                throw 1BK.A0f("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", AnonymousClass001.A1a(length2 * 32));
            }
            i2 = 16;
            iArr = new int[16];
            LCf.A02(iArr, this.A00);
            iArr[12] = i;
            System.arraycopy(A03, 0, iArr, 13, length2);
        }
        int[] iArr2 = (int[]) iArr.clone();
        LCf.A00(iArr2);
        int i3 = 0;
        do {
            iArr[i3] = iArr[i3] + iArr2[i3];
            i3++;
        } while (i3 < i2);
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, i2);
        return order;
    }
}
