package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.r2l.ui.Rooms2LiveDialogFragment;
import com.facebook.messaging.r2l.ui.Rooms2LiveOptInDialogFragment;

/* loaded from: I91.class */
public final class I91 {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 114982);
    public final C00i A02 = 1BV.A01((1BY) null, 16980);

    public I91(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static 0D2 A00(I91 i91, String str) {
        0D2 A00 = ((HuL) i91.A01.get()).A00(str);
        if (A00 == null || A00.mRemoving || !A00.isAdded() || A00.mDetached) {
            return null;
        }
        return A00;
    }

    public static void A01(I91 i91, Class cls, String str) {
        0D2 r305;
        C00i c00i = i91.A01;
        if (((HuL) c00i.get()).A00(str) != null) {
            r305 = (0D2) ((HuL) c00i.get()).A00(str);
        } else {
            try {
                r305 = (0D2) cls.newInstance();
            } catch (Exception unused) {
                return;
            }
        }
        if (r305 != null) {
            if (!r305.isAdded()) {
                ((HuL) c00i.get()).A01(r305, str);
                return;
            }
            Dialog dialog = r305.A01;
            if (dialog == null || !str.equals("R2L_OPT_IN_DIALOG_FRAGMENT_TAG")) {
                return;
            }
            dialog.show();
        }
    }

    public void A02() {
        EAX eax;
        0D2 A00 = A00(this, 7zK.A00(70));
        if (A00 != null) {
            A00.onDestroyView();
        }
        0D2 A002 = A00(this, 7zK.A00(192));
        if (A002 != null) {
            A002.A0o();
        }
        A04(false);
        Rooms2LiveDialogFragment A003 = A00(this, "R2L_WAITING_DIALOG_FRAGMENT_TAG");
        if (A003 == null || (eax = A003.A00) == null) {
            return;
        }
        eax.A05();
    }

    public void A03(FbUserSession fbUserSession) {
        if (((IRF) 1Lo.A04((Context) null, fbUserSession, this.A00, 99979)).A0z()) {
            A01(this, Rooms2LiveOptInDialogFragment.class, "R2L_OPT_IN_DIALOG_FRAGMENT_TAG");
        }
    }

    public void A04(boolean z) {
        0D2 A00 = A00(this, "R2L_OPT_IN_DIALOG_FRAGMENT_TAG");
        if (A00 != null) {
            0D2 r0 = (Rooms2LiveDialogFragment) A00;
            if (z) {
                IGZ igz = new IGZ(this, 10);
                EAX eax = r0.A00;
                if (eax != null) {
                    eax.A07 = new RoF(igz, r0);
                }
                r0.A0o();
                r0.onDestroyView();
                return;
            }
            Dialog dialog = r0.A01;
            if (dialog != null) {
                dialog.hide();
            }
            EAX eax2 = r0.A00;
            if (eax2 != null) {
                eax2.A05();
            }
        }
    }
}
