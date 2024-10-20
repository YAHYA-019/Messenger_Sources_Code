package X;

import android.app.Dialog;

/* loaded from: K2j.class */
public final class K2j extends 3Fo {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ LoY A01;

    public K2j(Dialog dialog, LoY loY) {
        this.A01 = loY;
        this.A00 = dialog;
    }

    public final void A00() {
        AbstractDialogInterfaceOnCancelListenerC01053pk abstractDialogInterfaceOnCancelListenerC01053pk = this.A01.A01;
        abstractDialogInterfaceOnCancelListenerC01053pk.A01.set(null);
        abstractDialogInterfaceOnCancelListenerC01053pk.A09();
        Dialog dialog = this.A00;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
