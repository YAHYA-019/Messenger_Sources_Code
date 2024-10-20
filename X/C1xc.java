package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.zombification.MessengerOnlyPhoneReconfirmationActivity;

/* renamed from: X.1xc, reason: invalid class name */
/* loaded from: 1xc.class */
public final class C1xc implements 1wP {
    public final 1Ex A00;
    public final C15h A01;

    public C1xc() {
        3jD r0 = new 3jD(this, 43);
        1Ex r02 = (1Ex) 1Bi.A03(83426);
        this.A01 = r0;
        this.A00 = r02;
    }

    public Integer AZS() {
        return 0S2.A0Y;
    }

    public Intent Arg(Activity activity) {
        return new Intent(activity, (Class<?>) MessengerOnlyPhoneReconfirmationActivity.class);
    }

    public boolean BQx(Context context, FbUserSession fbUserSession) {
        if (this.A00.BTw()) {
            return ((Boolean) this.A01.get()).booleanValue();
        }
        return false;
    }

    public boolean Cxc() {
        return false;
    }

    public boolean Cxq(Activity activity) {
        boolean z = false;
        if (!(activity instanceof C1io)) {
            11T.A0F(activity, 0);
            if (!InterfaceC03733yw.class.isAssignableFrom(activity.getClass())) {
                z = true;
            }
        }
        return z;
    }
}
