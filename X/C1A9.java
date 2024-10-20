package X;

import java.util.Arrays;

/* renamed from: X.1A9, reason: invalid class name */
/* loaded from: 1A9.class */
public abstract class C1A9 extends C0ru {
    public static final void A0G(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        11T.A0F(iArr, 0);
        11T.A0F(iArr2, 1);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void A0H(Object[] objArr, int i, int i2) {
        11T.A0F(objArr, 0);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static final void A0I(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        11T.A0F(objArr, 0);
        11T.A0F(objArr2, 1);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final byte[] A0J(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            11T.A0A(copyOfRange);
            return copyOfRange;
        }
        StringBuilder A1D = 0Pz.A1D("toIndex (", ") is greater than size (", i2);
        A1D.append(length);
        throw new IndexOutOfBoundsException(AnonymousClass001.A0d(").", A1D));
    }

    public static final byte[] A0K(byte[] bArr, byte[] bArr2) {
        11T.A0F(bArr, 0);
        11T.A0F(bArr2, 1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        11T.A0D(copyOf);
        return copyOf;
    }

    public static final Object[] A0L(Object[] objArr, int i, int i2) {
        11T.A0F(objArr, 0);
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            11T.A0A(copyOfRange);
            return copyOfRange;
        }
        StringBuilder A1D = 0Pz.A1D("toIndex (", ") is greater than size (", i2);
        A1D.append(length);
        throw new IndexOutOfBoundsException(AnonymousClass001.A0d(").", A1D));
    }

    public static final Object[] A0M(Object[] objArr, Object[] objArr2) {
        11T.A0F(objArr, 0);
        11T.A0F(objArr2, 1);
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        11T.A0D(copyOf);
        return copyOf;
    }
}
