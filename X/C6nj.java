package X;

/* renamed from: X.6nj, reason: invalid class name */
/* loaded from: 6nj.class */
public final class C6nj {
    public static final int A00(C26z c26z) {
        switch (c26z) {
            case LEFT:
            case START:
                return 0;
            case TOP:
                return 1;
            case RIGHT:
            case END:
                return 2;
            case BOTTOM:
                return 3;
            default:
                throw 0Pz.A05("Given unsupported edge ", c26z.name());
        }
    }

    public final int A01(C26z c26z, int[] iArr) {
        11T.A0F(iArr, 0);
        return iArr[A00(c26z)];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    public final void A02(C26z c26z, int[] iArr, int i) {
        int A00;
        int i2 = 0;
        switch (c26z) {
            case LEFT:
            case TOP:
            case RIGHT:
            case BOTTOM:
            case START:
            case END:
                A00 = A00(c26z);
                iArr[A00] = i;
                return;
            case HORIZONTAL:
                iArr[0] = i;
                A00 = 2;
                iArr[A00] = i;
                return;
            case VERTICAL:
                iArr[1] = i;
                A00 = 3;
                iArr[A00] = i;
                return;
            case ALL:
                do {
                    iArr[i2] = i;
                    i2++;
                } while (i2 < 4);
                return;
            default:
                return;
        }
    }
}
