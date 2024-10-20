package X;

/* renamed from: X.Amu, reason: case insensitive filesystem */
/* loaded from: Amu.class */
public final class C1613Amu extends 1RM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DHE A01;
    public final /* synthetic */ CNh A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C1613Amu(DHE dhe, CNh cNh, String str, String str2, long j) {
        this.A02 = cNh;
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = dhe;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        7Ql r0 = (7Ql) obj;
        if (!0S2.A0N.equals(r0.A03)) {
            this.A01.onFailure(AbF.A1D("Upload not successful"));
            return;
        }
        CNh cNh = this.A02;
        long j = this.A00;
        String str = this.A04;
        String str2 = this.A03;
        String str3 = r0.A05;
        CNh.A01(cNh.A04, this.A01, cNh, str, str2, str3, j);
    }

    public void A03(Throwable th) {
        this.A01.onFailure(th);
    }
}
