package X;

import android.content.DialogInterface;

/* renamed from: X.3Tu, reason: invalid class name */
/* loaded from: 3Tu.class */
public final class C3Tu implements DialogInterface.OnCancelListener {
    public final /* synthetic */ 2Pg A00;

    public C3Tu(2Pg r302) {
        this.A00 = r302;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        2Pg.A09(this.A00, "Cancel on mute dialog");
    }
}
