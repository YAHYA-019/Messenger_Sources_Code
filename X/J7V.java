package X;

import java.util.TimerTask;

/* loaded from: J7V.class */
public final class J7V extends TimerTask {
    public static final String __redex_internal_original_name = "FrontFlashController$4";
    public final /* synthetic */ IAe A00;

    public J7V(IAe iAe) {
        this.A00 = iAe;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.A00.A02();
    }
}
