package X;

/* renamed from: X.23X, reason: invalid class name */
/* loaded from: 23X.class */
public final class C23X {
    public static final C23X A00 = new Object();

    public final long A00(int i, int i2, int i3, int i4) {
        23V r308 = i == i2 ? 23V.A00 : i == 0 ? C2jg.A00 : C39x.A00;
        23V r311 = i3 == i4 ? 23V.A00 : i3 == 0 ? C2jg.A00 : C39x.A00;
        07E r0 = ((23W) r308).A01;
        int i5 = ((07F) r0).A00;
        int i6 = ((07F) r0).A01;
        07E r02 = ((23W) r311).A01;
        int i7 = ((07F) r02).A00;
        int i8 = ((07F) r02).A01;
        if (i < 0) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("minWidth must be >= 0, but was: ");
            A0k.append(i);
            1BL.A1L(". minWidth=", ", maxWidth=", A0k, i, i2);
            1BL.A1L(", minHeight=", ", maxHeight=", A0k, i3, i4);
            throw 1BL.A0d(A0k);
        }
        if (i3 < 0) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            1BL.A1L("minHeight must be >= 0, but was: ", ". minWidth=", A0k2, i3, i);
            1BL.A1L(", maxWidth=", ", minHeight=", A0k2, i2, i3);
            throw AnonymousClass001.A0L(AnonymousClass001.A0e(", maxHeight=", A0k2, i4));
        }
        int i9 = (-1) >>> 1;
        if (i > i5 && i != i9) {
            StringBuilder A0k3 = AnonymousClass001.A0k();
            1BL.A1L("minWidth must be <= ", ", but was: ", A0k3, i5, i);
            1BL.A1L(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0k3, i, i2);
            1BL.A1L(", minHeight=", ", maxHeight=", A0k3, i3, i4);
            throw 1BL.A0d(A0k3);
        }
        if (i2 > i6 && i2 != i9) {
            StringBuilder A0k4 = AnonymousClass001.A0k();
            1BL.A1L("maxWidth must be <= ", ", but was: ", A0k4, i6, i2);
            1BL.A1L(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0k4, i, i2);
            1BL.A1L(", minHeight=", ", maxHeight=", A0k4, i3, i4);
            throw 1BL.A0d(A0k4);
        }
        if (i3 > i7 && i3 != i9) {
            StringBuilder A0k5 = AnonymousClass001.A0k();
            1BL.A1L("minHeight must be <= ", ", but was: ", A0k5, i7, i3);
            1BL.A1L(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0k5, i, i2);
            1BL.A1L(", minHeight=", ", maxHeight=", A0k5, i3, i4);
            throw 1BL.A0d(A0k5);
        }
        if (i4 > i8 && i4 != i9) {
            StringBuilder A0k6 = AnonymousClass001.A0k();
            1BL.A1L("maxHeight must be <= ", ", but was: ", A0k6, i8, i4);
            1BL.A1L(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A0k6, i, i2);
            1BL.A1L(", minHeight=", ", maxHeight=", A0k6, i3, i4);
            throw 1BL.A0d(A0k6);
        }
        if (i <= i2) {
            if (i3 <= i4) {
                return (r308.A04(i, i2) << 32) | r311.A04(i3, i4);
            }
            StringBuilder A0k7 = AnonymousClass001.A0k();
            A0k7.append("maxHeight must be >= minHeight, but was: maxHeight=");
            A0k7.append(i4);
            1BL.A1L("; minHeight=", ". minWidth=", A0k7, i3, i);
            1BL.A1L(", maxWidth=", ", minHeight=", A0k7, i2, i3);
            throw AnonymousClass001.A0L(AnonymousClass001.A0e(", maxHeight=", A0k7, i4));
        }
        StringBuilder A0k8 = AnonymousClass001.A0k();
        A0k8.append("maxWidth must be >= minWidth, but was: maxWidth=");
        A0k8.append(i2);
        A0k8.append("; minWidth=");
        A0k8.append(i);
        1BL.A1L(". minWidth=", ", maxWidth=", A0k8, i, i2);
        1BL.A1L(", minHeight=", ", maxHeight=", A0k8, i3, i4);
        throw 1BL.A0d(A0k8);
    }
}
