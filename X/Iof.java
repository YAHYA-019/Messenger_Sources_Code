package X;

/* loaded from: Iof.class */
public final class Iof implements Runnable {
    public static final String __redex_internal_original_name = "CaptureProcessingCoordinator$5";
    public final /* synthetic */ INY A00;

    public Iof(INY iny) {
        this.A00 = iny;
    }

    @Override // java.lang.Runnable
    public void run() {
        INY iny = this.A00;
        if (iny.A0I || !iny.A0H) {
            return;
        }
        iny.A0H = false;
        Exception qqu = new QQU();
        JHn jHn = iny.A05.A02;
        RUP rup = iny.A06;
        rup.A01(HAJ.A05, qqu);
        iny.A0J = false;
        jHn.BwX(qqu, 0S2.A00, iny.A0H);
        rup.A01(HAJ.A03, qqu);
        jHn.BwX(qqu, 0S2.A01, iny.A0H);
        INY.A01(iny);
    }
}
