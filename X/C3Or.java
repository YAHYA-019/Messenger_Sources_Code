package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.bubbles.dialogs.BubblePermissionAlertDialog;
import com.facebook.messaging.dialog.ConfirmActionParams;

/* renamed from: X.3Or, reason: invalid class name */
/* loaded from: 3Or.class */
public final class C3Or {
    public static final void A00(Context context, 06Z r302) {
        BxS bxS = new BxS(context.getString(2131953542), context.getString(2131953540));
        bxS.A03 = context.getString(2131953539);
        ConfirmActionParams confirmActionParams = new ConfirmActionParams(bxS);
        BubblePermissionAlertDialog bubblePermissionAlertDialog = new BubblePermissionAlertDialog();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("confirmActionParams", confirmActionParams);
        bubblePermissionAlertDialog.setArguments(A05);
        bubblePermissionAlertDialog.A0m(r302, (String) null);
    }
}
