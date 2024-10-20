package X;

import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$FacebookAutofillOptOutCallbackHandler;

/* loaded from: Ln5.class */
public final class Ln5 implements Runnable {
    public static final String __redex_internal_original_name = "AutofillController$FacebookAutofillOptOutCallbackHandler$1";
    public final /* synthetic */ AutofillController$FacebookAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ boolean A01;

    public Ln5(AutofillController$FacebookAutofillOptOutCallbackHandler autofillController$FacebookAutofillOptOutCallbackHandler, boolean z) {
        this.A00 = autofillController$FacebookAutofillOptOutCallbackHandler;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        DKC.A1I(this.A00.A00, 0Pz.A1C("Autofill Opt Out: ", this.A01), 0);
    }
}
