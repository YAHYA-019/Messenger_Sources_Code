package X;

import android.view.View;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment;

/* loaded from: AEk.class */
public final class AEk implements Runnable {
    public static final String __redex_internal_original_name = "HsmPinCodeRestoreFragment$showSoftKeyboard$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ HsmPinCodeRestoreFragment A01;

    public AEk(View view, HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment) {
        this.A00 = view;
        this.A01 = hsmPinCodeRestoreFragment;
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
