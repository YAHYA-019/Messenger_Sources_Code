package X;

import com.encryptedbackups.statemanager.model.WrongRecoveryCodeException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* renamed from: X.9X4, reason: invalid class name */
/* loaded from: 9X4.class */
public final class C9X4 {
    public final 9IN A00;

    public C9X4(9IN r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final 99K A00(Exception exc, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        C9uq c9uq;
        String str;
        String message;
        11T.A0F(exc, 0);
        if (exc instanceof UserRecoverableAuthException) {
            return new C8rp(((UserRecoverableAuthException) exc).A00());
        }
        if ((exc instanceof C98y) || (exc instanceof WrongRecoveryCodeException)) {
            i = 2131957216;
            i2 = 2131957215;
        } else if (exc instanceof IOException) {
            String message2 = exc.getMessage();
            if (message2 != null && 0CU.A0T(message2, "storageQuotaExceeded", false)) {
                this.A00.A00.A08("SETUP_WITH_GDRIVE_STORAGE_EXCEEDED_ERROR");
                if (!z2) {
                    return new C8rq();
                }
                i3 = 2131957182;
                i4 = 2131957181;
                return new C8rr(i3, i4);
            }
            String message3 = exc.getMessage();
            if (message3 == null || !0CU.A0T(message3, "rateLimitExceeded", false)) {
                String message4 = exc.getMessage();
                if (message4 != null && 0CU.A0T(message4, "dailyLimitExceeded", false)) {
                    c9uq = this.A00.A00;
                    str = "SETUP_WITH_GDRIVE_DAILY_LIMIT_EXCEEDED_ERROR";
                }
                message = exc.getMessage();
                if (message != null && 0CU.A0T(message, "Bad request: 403", false)) {
                    this.A00.A00.A08("SETUP_WITH_GDRIVE_NO_PERMISSION_ERROR");
                    return new C8ro(95D.A03);
                }
                i = 2131957197;
                i2 = 2131957196;
            } else {
                c9uq = this.A00.A00;
                str = "SETUP_WITH_GDRIVE_RATE_LIMIT_EXCEEDED_ERROR";
            }
            c9uq.A08(str);
            message = exc.getMessage();
            if (message != null) {
                this.A00.A00.A08("SETUP_WITH_GDRIVE_NO_PERMISSION_ERROR");
                return new C8ro(95D.A03);
            }
            i = 2131957197;
            i2 = 2131957196;
        } else {
            if (z2 && z) {
                i3 = 2131957180;
                i4 = 2131957179;
                return new C8rr(i3, i4);
            }
            i = 2131957197;
            i2 = 2131957196;
        }
        return new C8rs(i, i2);
    }
}
