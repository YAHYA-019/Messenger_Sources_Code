package X;

/* renamed from: X.3O3, reason: invalid class name */
/* loaded from: 3O3.class */
public final class C3O3 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C3O3(String str, String str2, String str3, int i) {
        1BK.A1K(str2, 2, str3);
        this.A03 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VisitationData{mSurfaceLinkId='");
        A0k.append(this.A03);
        A0k.append("', mSessionId='");
        A0k.append(this.A01);
        A0k.append("', mSubsessionId=");
        A0k.append(this.A00);
        A0k.append("', mSubsessionTimestamp=");
        A0k.append(this.A02);
        return AnonymousClass001.A0f(A0k);
    }
}
