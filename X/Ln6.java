package X;

import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$FacebookAutofillOptOutCallbackHandler;

/* loaded from: Ln6.class */
public final class Ln6 implements Runnable {
    public static final String __redex_internal_original_name = "AutofillController$FacebookAutofillOptOutCallbackHandler$2";
    public final /* synthetic */ AutofillController$FacebookAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ String A01;

    public Ln6(AutofillController$FacebookAutofillOptOutCallbackHandler autofillController$FacebookAutofillOptOutCallbackHandler, String str) {
        this.A00 = autofillController$FacebookAutofillOptOutCallbackHandler;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.A01;
        AutofillController$FacebookAutofillOptOutCallbackHandler autofillController$FacebookAutofillOptOutCallbackHandler = this.A00;
        AbstractC3252Jnp abstractC3252Jnp = autofillController$FacebookAutofillOptOutCallbackHandler.A02;
        if (TextUtils.equals(str, LDu.A01(abstractC3252Jnp.A08()))) {
            autofillController$FacebookAutofillOptOutCallbackHandler.A01.A0H(abstractC3252Jnp);
        }
    }
}
