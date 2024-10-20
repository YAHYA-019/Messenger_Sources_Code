package X;

/* loaded from: J0u.class */
public final class J0u implements Runnable {
    public static final String __redex_internal_original_name = "RecordingThreadController$15";
    public final /* synthetic */ long A00;
    public final /* synthetic */ JLr A01;
    public final /* synthetic */ I9S A02;

    public J0u(JLr jLr, I9S i9s, long j) {
        this.A02 = i9s;
        this.A01 = jLr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.BnS(this.A00);
    }
}
