package X;

import android.content.DialogInterface;
import com.facebook.messaging.encryptedbackups.passkey.ui.setup.EbPasskeySetupFragment;

/* renamed from: X.9nf, reason: invalid class name */
/* loaded from: 9nf.class */
public final class C9nf implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C9nf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 == 0) {
            EbPasskeySetupFragment.A0B((EbPasskeySetupFragment) this.A01);
            return;
        }
        7UA r0 = (7UA) this.A01;
        9gJ r02 = r0.A01;
        if (r02 == null) {
            throw 1BK.A0h();
        }
        9gJ.A00(C98R.A02, r02);
        r0.A00 = null;
    }
}
