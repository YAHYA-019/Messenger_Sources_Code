package X;

/* loaded from: Iy2.class */
public final class Iy2 implements Runnable {
    public static final String __redex_internal_original_name = "RtcCameraState$initCameraIds$1$1";
    public final /* synthetic */ Hbx A00;
    public final /* synthetic */ HsO A01;

    public Iy2(Hbx hbx, HsO hsO) {
        this.A01 = hsO;
        this.A00 = hbx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HsO hsO = this.A01;
        hsO.A02 = false;
        hsO.A00 = this.A00;
        1Du it = ((2QZ) hsO.A04.A00.A0Z.get()).A00().iterator();
        while (it.hasNext()) {
            ((2Qe) AbH.A15(it)).A01();
        }
    }
}
