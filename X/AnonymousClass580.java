package X;

import java.util.Arrays;

/* renamed from: X.580, reason: invalid class name */
/* loaded from: 580.class */
public final class AnonymousClass580 implements 55H {
    public final int A00;
    public final float[] A01;
    public final int[] A02;

    public /* synthetic */ AnonymousClass580(int i, float f, float f2) {
        this(new int[]{0, 0, 0, 0}, f, f2, i);
    }

    public AnonymousClass580(int[] iArr, float f, float f2, int i) {
        this.A00 = i;
        this.A01 = new float[]{f, f, f, f, f2, f2, f2, f2};
        this.A02 = new int[]{iArr[0], iArr[1], iArr[2], iArr[3]};
    }

    public boolean BVe(55H r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), AnonymousClass580.class)) {
            return false;
        }
        AnonymousClass580 anonymousClass580 = (AnonymousClass580) r302;
        if (this.A00 == anonymousClass580.A00 && Arrays.equals(this.A01, anonymousClass580.A01)) {
            z = true;
        }
        return z;
    }
}
