package X;

import com.facebook.widget.tokenizedtypeahead.TokenizedAutoCompleteTextView;

/* loaded from: G19.class */
public final class G19 implements Runnable {
    public static final String __redex_internal_original_name = "TokenizedAutoCompleteTextView$1";
    public final /* synthetic */ TokenizedAutoCompleteTextView A00;

    public G19(TokenizedAutoCompleteTextView tokenizedAutoCompleteTextView) {
        this.A00 = tokenizedAutoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.requestLayout();
    }
}
