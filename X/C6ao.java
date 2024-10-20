package X;

import java.util.Arrays;

/* renamed from: X.6ao, reason: invalid class name */
/* loaded from: 6ao.class */
public final class C6ao {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C6ao(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6ao c6ao = (C6ao) obj;
            if (this.A01 != c6ao.A01 || this.A02 != c6ao.A02 || this.A00 != c6ao.A00 || !Arrays.equals(this.A03, c6ao.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }
}
