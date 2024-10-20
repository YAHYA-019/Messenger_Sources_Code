package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;

/* loaded from: AEl.class */
public final class AEl implements Runnable {
    public static final String __redex_internal_original_name = "HsmPinCodeSetupBaseFragment$hideSoftKeyboard$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ HsmPinCodeSetupBaseFragment A01;

    public AEl(View view, HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment) {
        this.A01 = hsmPinCodeSetupBaseFragment;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment = this.A01;
        if (hsmPinCodeSetupBaseFragment.A1V()) {
            InputMethodManager inputMethodManager = hsmPinCodeSetupBaseFragment.A00;
            if (inputMethodManager == null) {
                11T.A0L("inputMethodManager");
                throw 0Q8.createAndThrow();
            }
            inputMethodManager.hideSoftInputFromWindow(this.A00.getWindowToken(), 2);
        }
    }
}
