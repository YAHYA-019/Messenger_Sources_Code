package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: Lji.class */
public final class Lji implements Runnable {
    public static final String __redex_internal_original_name = "Toolbar$2";
    public final /* synthetic */ Toolbar A00;

    public Lji(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    @Override // java.lang.Runnable
    public void run() {
        LLc lLc;
        ActionMenuView actionMenuView = this.A00.A0F;
        if (actionMenuView == null || (lLc = actionMenuView.A06) == null) {
            return;
        }
        lLc.A03();
    }
}
