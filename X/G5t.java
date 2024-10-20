package X;

/* loaded from: G5t.class */
public final class G5t implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$4";
    public final /* synthetic */ F6O A00;
    public final /* synthetic */ RHj A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Throwable A04;

    public G5t(F6O f6o, RHj rHj, Object obj, String str, Throwable th) {
        this.A00 = f6o;
        this.A01 = rHj;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        RHj rHj = this.A01;
        Object obj = this.A02;
        Throwable th = this.A04;
        Qmb qmb = rHj.A00;
        KjJ A00 = obj != null ? EYJ.A00(new RKS(obj, th)) : new KjJ((EnumC08284mf) null, (Object) null, th);
        qmb.A03.set(A00);
        ((FvG) qmb).A00.notifyObservers(A00);
    }
}
