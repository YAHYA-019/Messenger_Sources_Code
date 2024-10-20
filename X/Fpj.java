package X;

/* loaded from: Fpj.class */
public final class Fpj implements DGN {
    public final /* synthetic */ FpI A00;

    public Fpj(FpI fpI) {
        this.A00 = fpI;
    }

    public void CGq(boolean z) {
        String str;
        String str2;
        FpI fpI = this.A00;
        GKb gKb = fpI.A03;
        String str3 = fpI.A04;
        if (z) {
            str = "user dismissed dialog";
            str2 = "USER_INPUT";
        } else {
            str = "dismiss bot subscription query failed";
            str2 = "NETWORK_FAILURE";
        }
        gKb.Ccf(str3, str, str2);
    }
}
