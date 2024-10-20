package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: L32.class */
public final class L32 {
    public Object A00;
    public final AtomicReference A02 = GOn.A1L(KZU.A00);
    public final Object A01 = AnonymousClass001.A0R();

    public static Snapshot A00() {
        return (Snapshot) LEY.A05.A01();
    }

    public final Object A01() {
        long A0Q = JR0.A0Q();
        if (A0Q == Kbb.A00) {
            return this.A00;
        }
        L00 l00 = (L00) this.A02.get();
        int A00 = L00.A00(l00, A0Q);
        if (A00 >= 0) {
            return l00.A02[A00];
        }
        return null;
    }

    public final void A02(Object obj) {
        long A0Q = JR0.A0Q();
        if (A0Q == Kbb.A00) {
            this.A00 = obj;
            return;
        }
        synchronized (this.A01) {
            AtomicReference atomicReference = this.A02;
            L00 l00 = (L00) atomicReference.get();
            int A00 = L00.A00(l00, A0Q);
            if (A00 < 0) {
                int i = l00.A00;
                Object[] objArr = l00.A02;
                int i2 = 0;
                int i3 = 0;
                for (Object obj2 : objArr) {
                    if (obj2 != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr2 = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            break;
                        }
                        long j = l00.A01[i5];
                        Object obj3 = objArr[i5];
                        if (j > A0Q) {
                            jArr[i2] = A0Q;
                            objArr2[i2] = obj;
                            i2++;
                            break;
                        } else {
                            if (obj3 != null) {
                                jArr[i2] = j;
                                objArr2[i2] = obj3;
                                i2++;
                            }
                            i5++;
                            if (i2 >= i4) {
                                break;
                            }
                        }
                    }
                    if (i5 == i) {
                        i2 = i4 - 1;
                    } else {
                        while (i2 < i4) {
                            long j2 = l00.A01[i5];
                            Object obj4 = objArr[i5];
                            if (obj4 != null) {
                                jArr[i2] = j2;
                                objArr2[i2] = obj4;
                                i2++;
                            }
                            i5++;
                        }
                        atomicReference.set(new L00(jArr, objArr2, i4));
                    }
                }
                jArr[i2] = A0Q;
                objArr2[i2] = obj;
                atomicReference.set(new L00(jArr, objArr2, i4));
            } else {
                l00.A02[A00] = obj;
            }
        }
    }
}
