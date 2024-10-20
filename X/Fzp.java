package X;

import com.facebook.dialtone.switcher.DialtoneManualSwitcher;

/* loaded from: Fzp.class */
public final class Fzp implements Runnable {
    public static final String __redex_internal_original_name = "DialtoneManualSwitcher$14";
    public final /* synthetic */ DialtoneManualSwitcher A00;

    public Fzp(DialtoneManualSwitcher dialtoneManualSwitcher) {
        this.A00 = dialtoneManualSwitcher;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A0K.setClickable(true);
    }
}
