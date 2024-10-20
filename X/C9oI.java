package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.facebook.messaging.encryptedbackups.hsm.reminder.fragment.PinReminderFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* renamed from: X.9oI, reason: invalid class name */
/* loaded from: 9oI.class */
public final class C9oI implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public C9oI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (this.A00 != 0) {
            11T.A0F(keyEvent, 2);
            return i == 4 && keyEvent.getAction() == 1 && ((2Ov) this.A01).Bkd();
        }
        if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return false;
        }
        PinReminderFragment pinReminderFragment = (PinReminderFragment) this.A01;
        94S r0 = MigBottomSheetDialogFragment.A01;
        C9ga c9ga = pinReminderFragment.A00;
        if (c9ga == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        ((9hC) 1Br.A0B(c9ga.A05)).A01("BACK_CLICK");
        return false;
    }
}
