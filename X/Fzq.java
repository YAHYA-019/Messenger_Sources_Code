package X;

import com.facebook.dialtone.switcher.DialtoneManualSwitcher;

/* loaded from: Fzq.class */
public final class Fzq implements Runnable {
    public static final String __redex_internal_original_name = "DialtoneManualSwitcher$15";
    public final /* synthetic */ DialtoneManualSwitcher A00;

    public Fzq(DialtoneManualSwitcher dialtoneManualSwitcher) {
        this.A00 = dialtoneManualSwitcher;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A0F.setClickable(true);
    }
}
