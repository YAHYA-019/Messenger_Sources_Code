package X;

/* renamed from: X.84j, reason: invalid class name */
/* loaded from: 84j.class */
public final class C84j extends C04v {
    public String A00;
    public String A01;
    public final int A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C84j(int i) {
        this(null, null, 5);
        this.A02 = i;
        this.A02 = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C84j(String str, int i) {
        this((i & 1) != 0 ? null : str, null, 5);
        this.A02 = 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C84j(String str, String str2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 3:
                11T.A0F(str, 1);
                break;
            case 1:
            case 10:
                1BL.A1F(str, str2);
                break;
            case 2:
            case 4:
                this.A01 = str;
                this.A00 = str2;
                return;
            case 5:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                1BL.A1F(str, str2);
                this.A01 = str;
                this.A00 = str2;
                return;
        }
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84j.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A05;
        int A052;
        String str;
        switch (this.A02) {
            case 0:
            case 3:
                A052 = 4YV.A02(this.A00);
                str = this.A01;
                if (str == null) {
                    A05 = 0;
                    return A052 + A05;
                }
                A05 = str.hashCode();
                return A052 + A05;
            case 1:
            case 10:
                A052 = 4YV.A02(this.A00);
                str = this.A01;
                A05 = str.hashCode();
                return A052 + A05;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
                A052 = 4YV.A02(this.A01);
                str = this.A00;
                A05 = str.hashCode();
                return A052 + A05;
            case 5:
                A05 = 1BL.A05(this.A00) * 31;
                A052 = 7zN.A05(this.A01);
                return A052 + A05;
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        StringBuilder A0k;
        String str;
        switch (this.A02) {
            case 3:
                A0k = AnonymousClass001.A0k();
                A0k.append("ParticipantInfo(id=");
                A0k.append(this.A00);
                A0k.append(", name=");
                str = this.A01;
                break;
            case 6:
                A0k = AnonymousClass001.A0k();
                A0k.append("GraphQLSubscriptionOffer(offerId=");
                A0k.append(this.A01);
                A0k.append(", externalOfferId=");
                str = this.A00;
                break;
            default:
                return super.toString();
        }
        A0k.append(str);
        return 4YV.A0x(A0k);
    }
}
