package X;

import android.content.Context;
import androidx.biometric.FingerprintDialogFragment;

/* loaded from: Ljo.class */
public final class Ljo implements Runnable {
    public static final String __redex_internal_original_name = "FingerprintDialogFragment$1";
    public final /* synthetic */ FingerprintDialogFragment A00;

    public Ljo(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.biometric.FingerprintDialogFragment, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (context == null) {
            android.util.Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            r0.A04.A02(1);
            r0.A04.A03(context.getString(2131956945));
        }
    }
}
