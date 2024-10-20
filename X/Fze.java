package X;

/* loaded from: Fze.class */
public final class Fze implements Runnable {
    public static final String __redex_internal_original_name = "BugReportSender$5";
    public final /* synthetic */ Evi A00;

    public Fze(Evi evi) {
        this.A00 = evi;
    }

    @Override // java.lang.Runnable
    public void run() {
        F8q.A00(new FEd("failed to finalize bug report"), AbF.A0v(this.A00.A0I), true);
    }
}
