package X;

/* loaded from: Loz.class */
public final class Loz implements Runnable {
    public static final String __redex_internal_original_name = "zzf";
    public final /* synthetic */ KqA A00;
    public final /* synthetic */ JVq A01;

    public Loz(KqA kqA, JVq jVq) {
        this.A01 = jVq;
        this.A00 = kqA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (JQx.A1W("EnhancedIntentService")) {
            android.util.Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        C4r2 c4r2 = this.A01.A00;
        KqA kqA = this.A00;
        c4r2.A05(kqA.A01);
        kqA.A00();
    }
}
