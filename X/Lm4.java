package X;

import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Lm4.class */
public final class Lm4 implements Runnable {
    public static final String __redex_internal_original_name = "TextInputLayout$3";
    public final /* synthetic */ TextInputLayout A00;

    public Lm4(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A0V.requestLayout();
    }
}
