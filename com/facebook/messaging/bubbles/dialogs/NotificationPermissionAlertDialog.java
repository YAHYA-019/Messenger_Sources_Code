package com.facebook.messaging.bubbles.dialogs;

import X.0FI;
import X.11T;
import X.1BJ;
import android.os.Bundle;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.dialog.ConfirmActionParams;

/* loaded from: NotificationPermissionAlertDialog.class */
public final class NotificationPermissionAlertDialog extends ConfirmActionDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1335386620);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        11T.A0D(bundle2);
        ConfirmActionParams confirmActionParams = (ConfirmActionParams) bundle2.getParcelable(1BJ.A00(1197));
        11T.A0D(confirmActionParams);
        this.A00 = confirmActionParams;
        0FI.A08(-182937562, A02);
    }
}
