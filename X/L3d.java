package X;

/* loaded from: L3d.class */
public abstract class L3d {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof L3d) {
            byte[] bArr = ((K6J) this).zza;
            int length = bArr.length;
            int i = length * 8;
            byte[] bArr2 = ((L3d) obj).zza;
            int length2 = bArr2.length;
            if (i == length2 * 8 && length == length2) {
                boolean z2 = true;
                for (int i2 = 0; i2 < length; i2++) {
                    z2 &= AnonymousClass001.A1Q(bArr[i2], bArr2[i2]);
                }
                if (z2) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        int i;
        byte[] bArr = ((K6J) this).zza;
        int length = bArr.length;
        if (length * 8 < 32) {
            i = bArr[0] & 255;
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                i |= (bArr[i3] & 255) << (i3 * 8);
                i2 = i3 + 1;
            }
        } else {
            if (length < 4) {
                throw AnonymousClass001.A0N(KYC.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", AnonymousClass001.A1a(length)));
            }
            int i4 = bArr[0] & 255;
            int i5 = bArr[1] & 255;
            int i6 = bArr[2] & 255;
            int i7 = bArr[3] & 255;
            i = (i7 << 24) | i4 | (i5 << 8) | (i6 << 16);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((K6J) this).zza;
        int length = bArr.length;
        StringBuilder A0l = AnonymousClass001.A0l(length + length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0l.toString();
            }
            byte b = bArr[i2];
            int i3 = b >> 4;
            char[] cArr = A00;
            A0l.append(cArr[i3 & 15]);
            A0l.append(cArr[b & 15]);
            i = i2 + 1;
        }
    }
}
