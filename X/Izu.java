package X;

/* loaded from: Izu.class */
public final class Izu implements Runnable {
    public static final String __redex_internal_original_name = "RemoteEffectSharedStateImpl$scheduleEffectDownload$1";
    public final /* synthetic */ ICN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Izu(ICN icn, String str, String str2) {
        this.A00 = icn;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ICN icn = this.A00;
        ((F88) 1Br.A0B(icn.A0D)).A00(icn.A00, new IRY(icn), this.A01, null, false);
        icn.A0J.remove(this.A02);
    }
}
