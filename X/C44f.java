package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.44f, reason: invalid class name */
/* loaded from: 44f.class */
public class C44f {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C44f.class, "_size$volatile");
    public C44n[] A00;
    public volatile /* synthetic */ int _size$volatile;

    public static int A00(C44n[] c44nArr, int i, int i2) {
        C44n c44n = c44nArr[i];
        11T.A0D(c44n);
        Comparable comparable = (Comparable) c44n;
        C44n c44n2 = c44nArr[i2];
        11T.A0D(c44n2);
        return comparable.compareTo(c44n2);
    }

    private final void A01(int i, int i2) {
        C44n[] c44nArr = this.A00;
        11T.A0D(c44nArr);
        C44n c44n = c44nArr[i2];
        11T.A0D(c44n);
        C44n c44n2 = c44nArr[i];
        11T.A0D(c44n2);
        c44nArr[i] = c44n;
        c44nArr[i2] = c44n2;
        ((C44m) c44n).A00 = i;
        ((C44m) c44n2).A00 = i2;
    }

    public static final void A02(C44f c44f, int i) {
        while (i > 0) {
            C44n[] c44nArr = c44f.A00;
            11T.A0D(c44nArr);
            int i2 = (i - 1) / 2;
            if (A00(c44nArr, i2, i) <= 0) {
                return;
            }
            c44f.A01(i, i2);
            i = i2;
        }
    }

    public final C44n A03(int i) {
        C44n[] c44nArr = this.A00;
        11T.A0D(c44nArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            A01(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || A00(c44nArr, i, i2) >= 0) {
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    C44n[] c44nArr2 = this.A00;
                    11T.A0D(c44nArr2);
                    int i4 = i3 + 1;
                    if (i4 < atomicIntegerFieldUpdater.get(this) && A00(c44nArr2, i4, i3) < 0) {
                        i3 = i4;
                    }
                    if (A00(c44nArr2, i, i3) <= 0) {
                        break;
                    }
                    A01(i, i3);
                    i = i3;
                }
            } else {
                A01(i, i2);
                A02(this, i2);
            }
        }
        C44n c44n = c44nArr[atomicIntegerFieldUpdater.get(this)];
        11T.A0D(c44n);
        C44m c44m = (C44m) c44n;
        if (c44m._heap == C44g.A01) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(13));
        }
        c44m._heap = null;
        c44m.A00 = -1;
        c44nArr[atomicIntegerFieldUpdater.get(this)] = null;
        return c44n;
    }
}
