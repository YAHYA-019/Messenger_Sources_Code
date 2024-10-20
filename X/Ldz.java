package X;

/* loaded from: Ldz.class */
public final class Ldz implements C4F2 {
    public final /* synthetic */ RQY A00;
    public final /* synthetic */ String A01;

    public Ldz(RQY rqy, String str) {
        this.A00 = rqy;
        this.A01 = str;
    }

    @Override // X.C4F2
    public final void onFailure(Exception exc) {
        11T.A0F(exc, 0);
        0fH.A0G(R3U.class, "SafetyNet request failure", exc);
        RQY rqy = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("API_ERROR: ");
        A0k.append(exc.getClass());
        A0k.append(':');
        A0k.append(exc.getMessage());
        A0k.toString();
        String str = this.A01;
        11T.A0D(str);
        rqy.A00(str);
    }
}
