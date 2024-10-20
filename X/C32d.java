package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.32d, reason: invalid class name */
/* loaded from: 32d.class */
public final class C32d extends DialogFragment {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog == null) {
            setShowsDialog(false);
            dialog = this.A02;
            if (dialog == null) {
                Activity activity = getActivity();
                AbstractC00481b7.A02(activity);
                dialog = new AlertDialog.Builder(activity).create();
                this.A02 = dialog;
            }
        }
        return dialog;
    }
}
