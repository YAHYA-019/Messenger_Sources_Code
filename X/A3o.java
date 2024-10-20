package X;

import android.app.Dialog;
import java.lang.ref.WeakReference;

/* loaded from: A3o.class */
public final class A3o implements AYe {
    public WeakReference A00 = 7zL.A14((Object) null);

    @Override // X.AYe
    public void onDismiss() {
        Dialog dialog = (Dialog) this.A00.get();
        if (dialog != null) {
            dialog.dismiss();
            this.A00.clear();
        }
    }
}
