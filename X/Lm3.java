package X;

import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Lm3.class */
public final class Lm3 implements Runnable {
    public static final String __redex_internal_original_name = "TextInputLayout$2";
    public final /* synthetic */ TextInputLayout A00;

    public Lm3(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        DQB dqb = this.A00.A1B;
        dqb.performClick();
        dqb.jumpDrawablesToCurrentState();
    }
}
