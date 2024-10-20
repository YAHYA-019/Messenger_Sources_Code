package X;

/* loaded from: JuS.class */
public final class JuS extends C1iw {
    public static final String __redex_internal_original_name = "TigonNetworkSessionListenerManager$6$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ LW7 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuS(LW7 lw7, long j, long j2) {
        super("TigonNetworkSessionListenerManager.UploadProgress");
        this.A02 = lw7;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("HTTP.handleDataTask.callback", 1255172211);
        LW7 lw7 = this.A02;
        lw7.A04.updateDataTaskUploadProgress(lw7.A05, this.A00, this.A01, lw7.A01);
        C00j.A01(-1374882100);
    }
}
