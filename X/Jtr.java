package X;

import java.util.Arrays;

/* loaded from: Jtr.class */
public final class Jtr extends C04v implements MIg {
    public final byte[] A00;

    public Jtr(byte[] bArr) {
        this.A00 = bArr;
    }

    @Override // X.MIg
    public byte[] BIn() {
        return this.A00;
    }

    @Override // X.MIg
    public String BIo() {
        return JQz.A0t(this.A00);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jtr) && 11T.A0O(this.A00, ((Jtr) obj).A00));
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        return JQz.A0q("ByteArray(value=", Arrays.toString(this.A00));
    }
}
