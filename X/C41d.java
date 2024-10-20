package X;

/* renamed from: X.41d, reason: invalid class name */
/* loaded from: 41d.class */
public final class C41d {
    public long A00;
    public long A01;
    public long A02;
    public String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C41d(String str, String str2, String str3, String str4, long j, long j2, long j3) {
        this.A04 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public String A00() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("nid=");
        A0k.append(this.A04);
        A0k.append(";uid=");
        A0k.append(this.A06);
        A0k.append(";tid=");
        A0k.append(this.A05);
        A0k.append(";nc=");
        A0k.append(this.A02);
        A0k.append(";fc=");
        A0k.append(this.A01);
        A0k.append(";bc=");
        A0k.append(this.A00);
        A0k.append(";cid=");
        A0k.append(this.A03);
        if (!"".isEmpty()) {
            A0k.append("");
        }
        return A0k.toString();
    }
}
