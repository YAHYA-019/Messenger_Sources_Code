package X;

import android.content.DialogInterface;

/* renamed from: X.9nx, reason: invalid class name */
/* loaded from: 9nx.class */
public final class C9nx implements DialogInterface.OnClickListener {
    public static final C9nx A00 = new C9nx();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
