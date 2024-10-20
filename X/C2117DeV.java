package X;

import android.view.WindowManager;

/* renamed from: X.DeV, reason: case insensitive filesystem */
/* loaded from: DeV.class */
public final class C2117DeV extends EAX {
    public C01s A00;
    public 67O A01;

    public void dismiss() {
        67O r0 = this.A01;
        if (r0 != null) {
            r0.Bml((Object) null);
        }
        super.dismiss();
    }

    public void show() {
        try {
            A0G(false, false);
        } catch (WindowManager.BadTokenException e) {
            67O r0 = this.A01;
            if (r0 != null) {
                r0.BqY((Object) null);
            }
            this.A00.D0u(DKF.A0I("ZeroNativeTemplateBottomsheetDialog", "ZeroNativeTemplateBottomsheetDialog throw BadTokenException", e));
        }
    }
}
