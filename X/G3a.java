package X;

/* loaded from: G3a.class */
public final class G3a implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksActionFxFetchDebugDataImpl$fetchSsoCache$1$1$onSuccess$1";
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ GJj A01;
    public final /* synthetic */ String A02;

    public G3a(FHh fHh, GJj gJj, String str) {
        this.A00 = fHh;
        this.A01 = gJj;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FHh fHh = this.A00;
        GJj gJj = this.A01;
        DKM A00 = DKM.A00();
        A00.A0H(this.A02);
        DKM.A0E(fHh, A00, gJj);
    }
}
