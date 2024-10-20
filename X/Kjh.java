package X;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Kjh.class */
public abstract class Kjh {
    public Context A00;
    public CheckableImageButton A01;
    public TextInputLayout A02;

    public Kjh(TextInputLayout textInputLayout) {
        this.A02 = textInputLayout;
        this.A00 = textInputLayout.getContext();
        this.A01 = textInputLayout.A1B;
    }
}
