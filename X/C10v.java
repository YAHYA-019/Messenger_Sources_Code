package X;

import java.util.Random;

/* renamed from: X.10v, reason: invalid class name */
/* loaded from: 10v.class */
public final class C10v extends Random {
    public static final long serialVersionUID = 0;
    public final C07y impl;
    public boolean seedInitialized;

    public C10v(C07y c07y) {
        this.impl = c07y;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.impl.A04(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.A0A();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        11T.A0F(bArr, 0);
        this.impl.A0B(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.A00();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.A02();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.A03();
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.impl.A05(i);
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.A07();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.seedInitialized) {
            throw AnonymousClass001.A0q("Setting seed is not supported.");
        }
        this.seedInitialized = true;
    }
}
