package X;

/* loaded from: Lmj.class */
public final class Lmj implements Runnable {
    public static final String __redex_internal_original_name = "WorkTimer$WorkTimerRunnable";
    public final C4Ki A00;
    public final L2L A01;

    public Lmj(C4Ki c4Ki, L2L l2l) {
        this.A01 = l2l;
        this.A00 = c4Ki;
    }

    @Override // java.lang.Runnable
    public void run() {
        L2L l2l = this.A01;
        synchronized (l2l.A01) {
            java.util.Map map = l2l.A03;
            C4Ki c4Ki = this.A00;
            if (((Lmj) map.remove(c4Ki)) != null) {
                LRo lRo = (MC2) l2l.A02.remove(c4Ki);
                if (lRo != null) {
                    LRo lRo2 = lRo;
                    4IS.A00().A02(LRo.A0E, AnonymousClass001.A0Z(c4Ki, "Exceeded time limits on execution for ", AnonymousClass001.A0k()));
                    lRo2.A0A.execute(new Lk1(lRo2));
                }
            } else {
                4IS.A00().A02("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", c4Ki));
            }
        }
    }
}
