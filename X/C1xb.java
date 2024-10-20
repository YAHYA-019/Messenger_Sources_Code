package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.accountswitch.SwitchAccountActivity;
import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;

/* renamed from: X.1xb, reason: invalid class name */
/* loaded from: 1xb.class */
public final class C1xb implements 1wP {
    public final C00i A00 = new 1BQ(16386);
    public final C15h A01 = new 3jD(this, 21);
    public final C15h A02 = new 3jD(this, 22);

    private boolean A00() {
        boolean z = false;
        if (((2yD) this.A00.get()).AZk(18299249331215160L) && 1BL.A1a(this.A01) && this.A02.get() != null) {
            z = true;
        }
        return z;
    }

    public Integer AZS() {
        return 0S2.A1G;
    }

    public Intent Arg(Activity activity) {
        1G2 r0 = SwitchAccountActivity.A0I;
        return new Intent(activity, (Class<?>) SwitchAccountActivity.class).putExtra(AbstractC00603o4.A00(59), 4IA.A0U.sourceName).putExtra(AbstractC00603o4.A00(60), ((ViewerContext) this.A02.get()).mUserId);
    }

    public boolean BQx(Context context, FbUserSession fbUserSession) {
        return A00();
    }

    public boolean Cxc() {
        return false;
    }

    public boolean Cxq(Activity activity) {
        if ((activity instanceof SwitchAccountActivity) || (activity instanceof PageAccountSwitchActivity)) {
            return false;
        }
        return A00();
    }
}
