package X;

import android.content.DialogInterface;

/* renamed from: X.3Tz, reason: invalid class name */
/* loaded from: 3Tz.class */
public final class C3Tz implements DialogInterface.OnClickListener {
    public static final C3Tz A00 = new C3Tz();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.cancel();
        }
    }
}
