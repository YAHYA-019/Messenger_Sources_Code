package X;

import java.util.Random;

/* renamed from: X.082, reason: invalid class name */
/* loaded from: 082.class */
public abstract class AnonymousClass082 extends C07y {
    @Override // X.C07y
    public double A00() {
        return A0C().nextDouble();
    }

    @Override // X.C07y
    public float A02() {
        return A0C().nextFloat();
    }

    @Override // X.C07y
    public int A03() {
        return A0C().nextInt();
    }

    @Override // X.C07y
    public int A04(int i) {
        return (A0C().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // X.C07y
    public int A05(int i) {
        return A0C().nextInt(i);
    }

    @Override // X.C07y
    public long A07() {
        return A0C().nextLong();
    }

    @Override // X.C07y
    public boolean A0A() {
        return A0C().nextBoolean();
    }

    @Override // X.C07y
    public byte[] A0B(byte[] bArr) {
        A0C().nextBytes(bArr);
        return bArr;
    }

    public abstract Random A0C();
}
