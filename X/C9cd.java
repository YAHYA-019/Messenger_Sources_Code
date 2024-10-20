package X;

/* renamed from: X.9cd, reason: invalid class name */
/* loaded from: 9cd.class */
public final class C9cd {
    public final C96p A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C9cd(C96p c96p, Integer num, Long l, String str, String str2, String str3) {
        7zP.A1L(str, 2, num);
        this.A02 = l;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = c96p;
        this.A03 = str3;
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cd)) {
                return false;
            }
            C9cd c9cd = (C9cd) obj;
            if (!11T.A0O(this.A02, c9cd.A02) || !11T.A0O(this.A05, c9cd.A05) || !11T.A0O(this.A04, c9cd.A04) || this.A00 != c9cd.A00 || !11T.A0O(this.A03, c9cd.A03) || this.A01 != c9cd.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = (AnonymousClass002.A05(this.A00, (AnonymousClass002.A07(this.A05, AnonymousClass001.A02(this.A02) * 31) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A03)) * 31;
        Integer num = this.A01;
        return A05 + 7zU.A02(num, 9At.A00(num));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VirtualDeviceMetadata(creationTimeSeconds=");
        A0k.append(this.A02);
        A0k.append(", id=");
        A0k.append(this.A05);
        A0k.append(", createdOn=");
        A0k.append(this.A04);
        A0k.append(", type=");
        A0k.append(this.A00);
        A0k.append(", cloudAccount=");
        A0k.append(this.A03);
        A0k.append(", migrationStatus=");
        A0k.append(9At.A00(this.A01));
        return 4YV.A0x(A0k);
    }
}
