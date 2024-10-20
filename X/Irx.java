package X;

/* loaded from: Irx.class */
public final class Irx implements Runnable {
    public static final String __redex_internal_original_name = "ModeratorControlsStateSyncTopicManager$handleIssuedActions$1";
    public final /* synthetic */ IDd A00;

    public Irx(IDd iDd) {
        this.A00 = iDd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IDd iDd = this.A00;
        GOp.A0s(iDd.A04).A07.A02(true);
        ((JOJ) iDd.A09.get()).Bbn("TOGGLE_MUTE", (java.util.Map) null, true);
    }
}
