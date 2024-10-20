package X;

/* loaded from: J02.class */
public final class J02 implements Runnable {
    public static final String __redex_internal_original_name = "LiveLocationSessionRepositoryProxy$4";
    public final /* synthetic */ JOe A00;
    public final /* synthetic */ 5fR A01;
    public final /* synthetic */ String A02;

    public J02(JOe jOe, 5fR r303, String str) {
        this.A01 = r303;
        this.A02 = str;
        this.A00 = jOe;
    }

    @Override // java.lang.Runnable
    public void run() {
        5fR r0 = this.A01;
        r0.A00.AMj(new RlR(this.A00, r0.A01), this.A02);
    }
}
