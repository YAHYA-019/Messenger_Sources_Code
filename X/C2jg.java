package X;

/* renamed from: X.2jg, reason: invalid class name */
/* loaded from: 2jg.class */
public final class C2jg extends 23W {
    public static final C2jg A00 = new C2jg();

    public C2jg() {
        super(new 07E(0, 1073741822), 1);
    }

    public int A00(long j) {
        int i = ((int) j) & ((-1) >>> 2);
        int i2 = i - 1;
        if (i == 0) {
            i2 = (-1) >>> 1;
        }
        return i2;
    }

    public int A01(long j) {
        int i = ((int) (j >>> 32)) & ((-1) >>> 2);
        int i2 = i - 1;
        if (i == 0) {
            i2 = (-1) >>> 1;
        }
        return i2;
    }

    public int A02(long j) {
        return 0;
    }

    public int A03(long j) {
        return 0;
    }

    public long A04(int i, int i2) {
        int i3 = i2 + 1;
        if (i2 == ((-1) >>> 1)) {
            i3 = 0;
        }
        return ((i3 & ((-1) >>> 2)) | (((23W) this).A00 << 30)) & 4294967295L;
    }
}
