package X;

import android.text.method.PasswordTransformationMethod;
import com.facebook.widget.FbImageView;
import com.facebook.widget.text.BetterEditTextView;

/* loaded from: Et1.class */
public final class Et1 {
    public boolean A00;
    public final C00i A01 = AbH.A0Q();

    /* JADX WARN: Multi-variable type inference failed */
    public void A00(FbImageView fbImageView, BetterEditTextView betterEditTextView) {
        betterEditTextView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        fbImageView.setImageResource(((C1u2) this.A01.get()).A03(C1u3.A2d));
        this.A00 = true;
        fbImageView.setOnClickListener(new FXt(17, betterEditTextView, this, fbImageView));
        betterEditTextView.setOnFocusChangeListener(new FXw(1, betterEditTextView, this, fbImageView));
    }
}
