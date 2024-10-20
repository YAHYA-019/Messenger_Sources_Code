package X;

/* renamed from: X.AsN, reason: case insensitive filesystem */
/* loaded from: AsN.class */
public final class C1789AsN extends C04v {
    public long A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04 = 1;

    public C1789AsN(C1790AsO c1790AsO, String str, String str2, long j) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A00 = j;
        this.A03 = str2;
        this.A01 = c1790AsO;
    }

    public C1789AsN(Integer num, long j) {
        11T.A0F(num, 2);
        this.A00 = j;
        this.A01 = num;
        this.A03 = null;
        this.A02 = null;
    }

    public C1789AsN(Long l, String str, String str2, long j) {
        this.A00 = j;
        this.A01 = l;
        this.A03 = str;
        this.A02 = str2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "THUMBS_UP";
            case 2:
                return "THUMBS_DOWN";
            case 3:
                return "DISMISSED";
            default:
                return "NO_OP";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1789AsN.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A07;
        int hashCode;
        switch (this.A04) {
            case 0:
                A07 = AnonymousClass002.A07(this.A03, (7zQ.A02(this.A00) + AnonymousClass001.A02(this.A01)) * 31);
                hashCode = this.A02.hashCode();
                break;
            case 1:
                A07 = (AnonymousClass002.A02(this.A00, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31;
                hashCode = this.A01.hashCode();
                break;
            default:
                int A02 = 7zQ.A02(this.A00);
                Integer num = (Integer) this.A01;
                hashCode = (7zV.A03(num, A00(num), A02) + 1BL.A05(this.A03)) * 31;
                A07 = 7zN.A05(this.A02);
                break;
        }
        return hashCode + A07;
    }

    public String toString() {
        if (2 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmployeeSurveyInteraction(timestampSeconds=");
        A0k.append(this.A00);
        A0k.append(", interactionType=");
        Integer num = (Integer) this.A01;
        A0k.append(num != null ? A00(num) : "null");
        A0k.append(", selectedOptions=");
        A0k.append(this.A03);
        A0k.append(", additionalFeedback=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }
}
