package X;

/* renamed from: X.Gjf, reason: case insensitive filesystem */
/* loaded from: Gjf.class */
public final class C2630Gjf extends C04v {
    public int A00;
    public int A01;
    public final int A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2630Gjf() {
        this(0, 0, 6);
        this.A02 = 6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2630Gjf(int i) {
        this(0, 0, 6);
        this.A02 = i;
        this.A02 = 6;
    }

    public C2630Gjf(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
                this.A01 = i;
                this.A00 = i2;
                return;
            case 4:
            case 5:
            case 8:
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2630Gjf.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
                i = this.A01 * 31;
                i2 = this.A00;
                break;
            case 4:
            case 5:
            case 8:
                i = this.A00 * 31;
                i2 = this.A01;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder A0k;
        String str;
        switch (this.A02) {
            case 0:
                A0k = AnonymousClass001.A0k();
                str = "Size(width=";
                break;
            case 6:
                A0k = AnonymousClass001.A0k();
                str = "GridAspectRatio(width=";
                break;
            default:
                return super.toString();
        }
        A0k.append(str);
        A0k.append(this.A01);
        A0k.append(", height=");
        return DKH.A0p(A0k, this.A00);
    }
}
