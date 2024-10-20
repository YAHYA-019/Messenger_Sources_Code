package X;

/* loaded from: Fsw.class */
public final class Fsw implements GIl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FET A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Fsw(FET fet, String str, String str2, String str3, int i) {
        this.A01 = fet;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    @Override // X.GIl
    public void BxV() {
        FET.A00(this.A01, this.A03, this.A04, (String) null, this.A02, this.A00, (short) 3);
        0fH.A0j("MessengerZeroOptinController", "onFailure()");
    }

    @Override // X.GIl
    public void onSuccess(String str) {
        FET fet = this.A01;
        ((2BR) 1Br.A0B(fet.A00)).A0J("optin");
        FET.A00(fet, this.A03, this.A04, str, this.A02, this.A00, (short) 2);
        0fH.A0j("MessengerZeroOptinController", 0Pz.A0W("optin success result: ", str));
    }
}
