package com.facebook.messaging.aibot.aidialog.dialogs;

import X.1BM;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AiBotFabDialogFragment.class */
public final class AiBotFabDialogFragment extends BaseAiBotDialogFragment {
    public FbUserSession A00;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        this.A00 = 1BM.A01(this);
        A0n.setCanceledOnTouchOutside(true);
        return A0n;
    }
}
