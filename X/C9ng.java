package X;

import android.content.DialogInterface;

/* renamed from: X.9ng, reason: invalid class name */
/* loaded from: 9ng.class */
public final class C9ng implements DialogInterface.OnClickListener {
    public final int A00;

    public C9ng(int i) {
        this.A00 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                11T.A0F(dialogInterface, 0);
                break;
            case 1:
            case 5:
            case 6:
                break;
            case 2:
            case 3:
            default:
                return;
            case 4:
                dialogInterface.cancel();
                return;
        }
        dialogInterface.dismiss();
    }
}
