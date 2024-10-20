package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.messaging.dialog.MenuDialogFragment;
import com.facebook.messaging.dialog.MenuDialogParams;

/* loaded from: C0k.class */
public final class C0k {
    public DH0 A00;

    public void A00(Context context, 06Z r303) {
        Resources resources = context.getResources();
        7Z3 r0 = new 7Z3();
        r0.A00 = 2131964389;
        C9g5 A0c = AbF.A0c();
        A0c.A02 = 0;
        A0c.A03 = 2131964387;
        r0.A02(AbG.A0i(A0c, "report to admins"));
        C9g5 A0c2 = AbF.A0c();
        A0c2.A02 = 1;
        A0c2.A05 = 4YU.A0u(resources, AbH.A16(resources), 2131964388);
        r0.A02(AbG.A0i(A0c2, "report to Facebook"));
        MenuDialogFragment A05 = MenuDialogFragment.A05(new MenuDialogParams(r0));
        A05.A02 = new CkJ(this, 1);
        A05.A0m(r303, "FeedbackAndReportToGroupAdminHandler");
    }
}
