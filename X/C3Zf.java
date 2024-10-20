package X;

import android.app.Dialog;
import android.view.Window;
import com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment;

/* renamed from: X.3Zf, reason: invalid class name */
/* loaded from: 3Zf.class */
public final class C3Zf implements AZS {
    public final /* synthetic */ AiBotBottomSheetDialogFragment A00;

    public C3Zf(AiBotBottomSheetDialogFragment aiBotBottomSheetDialogFragment) {
        this.A00 = aiBotBottomSheetDialogFragment;
    }

    public static final void A00(Window window, float f) {
        1tS.A00(window, 1tG.A05(window.getNavigationBarColor(), (int) (f * 255.0f)));
    }

    @Override // X.AZS
    public void ARZ() {
        DR7 dr7 = ((0D2) this.A00).A01;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, DKB.A00(4));
            DR7 dr72 = dr7;
            dr72.A05().A0B(3);
            dr72.A05().A0W = true;
        }
    }

    @Override // X.AZS
    public void CrX(float f) {
        Window window;
        Dialog dialog = ((0D2) this.A00).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        A00(window, f);
    }
}
