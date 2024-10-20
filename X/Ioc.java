package X;

/* loaded from: Ioc.class */
public final class Ioc implements Runnable {
    public static final String __redex_internal_original_name = "CaptureProcessingCoordinator$2";
    public final /* synthetic */ INY A00;

    public Ioc(INY iny) {
        this.A00 = iny;
    }

    @Override // java.lang.Runnable
    public void run() {
        INY iny = this.A00;
        IOm iOm = iny.A08.A00.A00.A0b;
        if (iOm != null) {
            IOm.A00(iOm, 1BK.A0d(), 27);
        }
        iny.A06.A00(HAJ.A05);
        iny.A0J = false;
        iny.A04.postDelayed(iny.A0D, 2000L);
    }
}
