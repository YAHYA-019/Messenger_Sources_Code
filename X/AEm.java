package X;

import android.view.View;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;

/* loaded from: AEm.class */
public final class AEm implements Runnable {
    public static final String __redex_internal_original_name = "HsmPinCodeSetupBaseFragment$showSoftKeyboard$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ HsmPinCodeSetupBaseFragment A01;

    public AEm(View view, HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment) {
        this.A00 = view;
        this.A01 = hsmPinCodeSetupBaseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view.requestFocus()) {
            1pK r0 = this.A01;
            if (r0.A1V()) {
                new C0T2(view, r0.requireActivity().getWindow()).A00.A02(8);
            }
        }
    }
}
