package com.facebook.tigon;

import X.0CV;
import X.0Pz;
import X.11T;
import X.AnonymousClass001;
import X.C31i;
import java.io.IOException;

/* loaded from: TigonErrorException.class */
public class TigonErrorException extends IOException {
    public static final C31i Companion = new Object();
    public final TigonError tigonError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError) {
        super(C31i.A02(tigonError, ""));
        11T.A0F(tigonError, 1);
        this.tigonError = tigonError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError, String str) {
        super(C31i.A02(tigonError, str));
        11T.A0F(tigonError, 1);
        11T.A0F(str, 2);
        this.tigonError = tigonError;
    }

    public static final String convertErrorToRequestStatus(TigonError tigonError) {
        return C31i.A01(tigonError);
    }

    public static final String convertExceptionToRequestStatus(IOException iOException) {
        if (iOException == null) {
            return "done";
        }
        TigonError A00 = C31i.A00(iOException);
        return A00 == null ? "error" : C31i.A01(A00);
    }

    public static final String formatTigonError(TigonError tigonError, String str) {
        return C31i.A02(tigonError, str);
    }

    public static final String formatTigonException(IOException iOException) {
        String str = null;
        if (iOException != null) {
            TigonError A00 = C31i.A00(iOException);
            if (A00 != null) {
                String str2 = A00.errorDomain;
                if (0CV.A0b(str2, "Tigon", false) && 0CV.A0Z(str2, "Domain", false)) {
                    str2 = str2.substring(5, str2.length() - 6);
                    11T.A0A(str2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(A00.category);
                sb.append(':');
                sb.append(str2);
                sb.append(':');
                sb.append(A00.domainErrorCode);
                str = sb.toString();
            } else {
                str = iOException.getClass().getSimpleName();
                Throwable cause = iOException.getCause();
                if (cause != null) {
                    return 0Pz.A0Y(str, AnonymousClass001.A0X(cause), '|');
                }
            }
        }
        return str;
    }

    public static final TigonError getUnderlyingTigonError(Throwable th) {
        return C31i.A00(th);
    }
}
