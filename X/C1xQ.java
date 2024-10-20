package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.lockchat.AuthLockChatActivity;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;

/* renamed from: X.1xQ, reason: invalid class name */
/* loaded from: 1xQ.class */
public final class C1xQ implements 1wP {
    public final 1Br A00 = 1Bq.A00(83479);
    public final 1Br A01 = 1Bq.A00(16385);

    public Integer AZS() {
        return 0S2.A02;
    }

    public Intent Arg(Activity activity) {
        11T.A0F(activity, 0);
        return new Intent(activity, (Class<?>) AuthLockChatActivity.class);
    }

    public boolean BQx(Context context, FbUserSession fbUserSession) {
        boolean z = false;
        if (((AuthLockChatState) this.A00.A00.get()).A02.get() == 1xS.A03) {
            z = true;
        }
        return z;
    }

    public boolean Cxc() {
        return false;
    }

    public boolean Cxq(Activity activity) {
        if (!1Br.A07(this.A01).AZk(36324063135681945L)) {
            return false;
        }
        C00i c00i = this.A00.A00;
        if (((AuthLockChatState) c00i.get()).A02.get() != 1xS.A03) {
            return false;
        }
        0fH.A0j("AuthLockChatBlockingFlowLauncher", "Should intercept activity");
        AuthLockChatState authLockChatState = (AuthLockChatState) c00i.get();
        authLockChatState.A02.set(1xS.A02);
        return true;
    }
}
