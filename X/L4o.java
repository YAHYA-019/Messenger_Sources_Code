package X;

import java.util.Arrays;

/* loaded from: L4o.class */
public final class L4o {
    public final byte[] A00;

    public L4o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static L4o A00(byte[] bArr) {
        if (bArr != null) {
            return new L4o(bArr, bArr.length);
        }
        throw AnonymousClass001.A0Q("data must be non-null");
    }

    public byte[] A01() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof L4o) {
            return Arrays.equals(((L4o) obj).A00, this.A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        return 0Pz.A0j("Bytes(", Kwf.A00(this.A00), ")");
    }
}
