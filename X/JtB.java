package X;

/* loaded from: JtB.class */
public final class JtB extends C04v {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JtB(int i) {
        this(null, null, null, null, null, 0);
        this.A00 = i;
        this.A00 = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public JtB(String str, String str2, String str3, String str4, String str5, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = str;
                this.A02 = str2;
                this.A04 = str3;
                this.A05 = str4;
                this.A03 = str5;
                return;
            case 1:
                7zT.A1W(str, str2, str3, str4);
                11T.A0F(str5, 5);
                this.A02 = str;
                this.A03 = str2;
                this.A05 = str3;
                this.A01 = str4;
                this.A04 = str5;
                return;
            case 2:
                1BL.A1H(str, str2, str3);
                11T.A0F(str5, 5);
                this.A01 = str;
                this.A05 = str2;
                this.A04 = str3;
                this.A03 = str4;
                this.A02 = str5;
                return;
            default:
                1BL.A1F(str, str2);
                this.A01 = str;
                this.A05 = str2;
                this.A03 = str3;
                this.A04 = str4;
                this.A02 = str5;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JtB.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A07;
        String str;
        int A072;
        String str2;
        switch (this.A00) {
            case 0:
                A07 = ((((((1BL.A05(this.A01) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31;
                str = this.A03;
                return A07 + 7zN.A05(str);
            case 1:
                A072 = AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A05, AnonymousClass002.A07(this.A03, 4YV.A02(this.A02))));
                str2 = this.A04;
                return 7zM.A05(str2, A072);
            case 2:
                A072 = (AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A05, 4YV.A02(this.A01))) + 1BL.A05(this.A03)) * 31;
                str2 = this.A02;
                return 7zM.A05(str2, A072);
            case 3:
                A07 = (((AnonymousClass002.A07(this.A05, 4YV.A02(this.A01)) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31;
                str = this.A02;
                return A07 + 7zN.A05(str);
            default:
                return super.hashCode();
        }
    }
}
