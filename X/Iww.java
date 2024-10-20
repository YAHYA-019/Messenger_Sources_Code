package X;

/* loaded from: Iww.class */
public final class Iww implements Runnable {
    public static final String __redex_internal_original_name = "ModeratorControlsStateSyncTopicManager$onNewState$1";
    public final /* synthetic */ IDd A00;
    public final /* synthetic */ Boolean A01;

    public Iww(IDd iDd, Boolean bool) {
        this.A01 = bool;
        this.A00 = iDd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01.booleanValue()) {
            return;
        }
        IDd iDd = this.A00;
        8LW A01 = iDd.A0H.A01();
        if (A01 == null || !GOo.A1X(A01)) {
            return;
        }
        ((IED) iDd.A0B.get()).A07(0S2.A0j);
    }
}
