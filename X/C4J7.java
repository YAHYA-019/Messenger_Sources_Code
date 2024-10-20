package X;

/* renamed from: X.4J7, reason: invalid class name */
/* loaded from: 4J7.class */
public final class C4J7 {
    public boolean A00;
    public final long[] A01 = new long[7];
    public final boolean[] A03 = new boolean[7];
    public final int[] A02 = new int[7];

    public final int[] A00() {
        int[] iArr;
        synchronized (this) {
            if (this.A00) {
                long[] jArr = this.A01;
                int i = 0;
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i >= 7) {
                        break;
                    }
                    long j = jArr[i];
                    int i4 = i3 + 1;
                    int i5 = 1;
                    boolean z = false;
                    if (j > 0) {
                        z = true;
                    }
                    boolean[] zArr = this.A03;
                    if (z != zArr[i3]) {
                        int[] iArr2 = this.A02;
                        if (!z) {
                            i5 = 2;
                        }
                        iArr2[i3] = i5;
                    } else {
                        this.A02[i3] = 0;
                    }
                    zArr[i3] = z;
                    i++;
                    i2 = i4;
                }
                this.A00 = false;
                iArr = (int[]) this.A02.clone();
            } else {
                iArr = null;
            }
        }
        return iArr;
    }
}
