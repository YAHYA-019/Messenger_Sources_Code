package X;

/* loaded from: Izr.class */
public final class Izr implements Runnable {
    public static final String __redex_internal_original_name = "EffectInstructionSharedStateImpl$addListener$1$1";
    public final /* synthetic */ JJm A00;
    public final /* synthetic */ IP4 A01;
    public final /* synthetic */ String A02;

    public Izr(JJm jJm, IP4 ip4, String str) {
        this.A01 = ip4;
        this.A02 = str;
        this.A00 = jJm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IP4.A00(this.A00, this.A01, this.A02);
    }
}
