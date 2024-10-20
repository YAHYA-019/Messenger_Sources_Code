package X;

/* loaded from: Ipd.class */
public final class Ipd implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomPresenceManager$onUpdatePresence$2";
    public final /* synthetic */ IRt A00;

    public Ipd(IRt iRt) {
        this.A00 = iRt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        7zS.A1H(this.A00.A03.A00.A0D);
        0fH.A0n("LivingRoomEntityPresenceManager", "Presence subscription / polling didn't return viewer in result");
    }
}
