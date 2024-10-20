package X;

/* loaded from: D8x.class */
public final class D8x implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomThreadRepository$notifyObservers$1$1";
    public final /* synthetic */ DEy A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public D8x(DEy dEy, String str, String str2) {
        this.A00 = dEy;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.C3g(this.A01, this.A02);
    }
}
