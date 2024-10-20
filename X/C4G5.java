package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* renamed from: X.4G5, reason: invalid class name */
/* loaded from: 4G5.class */
public abstract class C4G5 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.0DR r301, X.C00m r302, X.4GE r303) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G5.A00(X.0DR, X.00m, X.4GE):java.lang.Object");
    }

    public static final 4GD A01(Integer num, Integer num2, 0DE r303, Function2 function2, 2aI r305, int i) {
        int i2;
        C4G7 c4yd;
        if (i == -2) {
            if (num == 0S2.A00) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4G6.A05;
                4GA r0 = C4G7.A00;
                i2 = 4GA.A00;
                c4yd = new C4G6(i2);
            }
            c4yd = new C4YD(num, 1);
        } else if (i != -1) {
            if (i != 0) {
                i2 = (-1) >>> 1;
                if (i != i2) {
                    c4yd = num == 0S2.A00 ? new C4G6(i) : new C4YD(num, i);
                }
                c4yd = new C4G6(i2);
            } else {
                if (num == 0S2.A00) {
                    c4yd = new C4G6(0);
                }
                c4yd = new C4YD(num, 1);
            }
        } else {
            if (num != 0S2.A00) {
                throw AnonymousClass001.A0L("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            c4yd = new C4YD(0S2.A01, 1);
        }
        4GD r02 = new 4GD(2aL.A02(r303, r305), c4yd);
        r02.A0Q(num2, r02, function2);
        return r02;
    }

    public static final 4GD A03(0DE r301, Function2 function2, 2aI r303, int i) {
        Integer num = 0S2.A00;
        return A01(num, num, r301, function2, r303, i);
    }
}
