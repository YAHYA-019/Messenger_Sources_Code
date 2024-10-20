package X;

import java.util.HashMap;

/* loaded from: AFn.class */
public final class AFn implements Runnable {
    public static final String __redex_internal_original_name = "MSGBloksCaaNativeAccountFetchImplementation$evaluateAccountListCallback$1$1";
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ GJj A01;
    public final /* synthetic */ HashMap A02;

    public AFn(FHh fHh, GJj gJj, HashMap hashMap) {
        this.A01 = gJj;
        this.A02 = hashMap;
        this.A00 = fHh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GJj gJj = this.A01;
        DKM dkm = new DKM();
        dkm.A0H(this.A02);
        FEK.A00(this.A00, new DKc(dkm.A00), gJj);
    }
}
