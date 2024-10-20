package X;

import com.google.common.base.Preconditions;
import java.io.Serializable;

/* renamed from: X.1U8, reason: invalid class name */
/* loaded from: 1U8.class */
public final class C1U8 extends 1U9 implements Serializable {
    public static final long serialVersionUID = 0;
    public final byte[] bytes;

    public C1U8(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    public long A02() {
        int length = this.bytes.length;
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        Preconditions.checkState(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        byte[] bArr = this.bytes;
        long j = bArr[0] & 255;
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= Math.min(bArr.length, 8)) {
                return j;
            }
            j |= (bArr[i2] & 255) << (i2 * 8);
            i = i2 + 1;
        }
    }

    public byte[] A04() {
        return this.bytes;
    }

    public byte[] A05() {
        return (byte[]) this.bytes.clone();
    }
}
