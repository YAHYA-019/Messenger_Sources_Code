package X;

import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import java.io.IOException;

/* renamed from: X.31i, reason: invalid class name */
/* loaded from: 31i.class */
public final class C31i {
    public static final TigonError A00(Throwable th) {
        TigonError tigonError;
        while (true) {
            tigonError = null;
            if (!(th instanceof IOException)) {
                break;
            }
            if (th instanceof TigonErrorException) {
                TigonErrorException tigonErrorException = (TigonErrorException) th;
                if (tigonErrorException != null) {
                    tigonError = tigonErrorException.tigonError;
                }
            } else {
                th = th.getCause();
            }
        }
        return tigonError;
    }

    public static final String A01(TigonError tigonError) {
        11T.A0F(tigonError, 0);
        int ordinal = tigonError.category.ordinal();
        return ordinal != 1 ? ordinal != 0 ? "error" : "done" : "cancelled";
    }

    public static final String A02(TigonError tigonError, String str) {
        11T.A0H(tigonError, str);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TigonError(");
        A0k.append("error=");
        1BK.A1R(A0k, tigonError.category);
        A0k.append(", ");
        A0k.append("errorDomain=");
        A0k.append(tigonError.errorDomain);
        A0k.append(", ");
        A0k.append("domainErrorCode=");
        A0k.append(tigonError.domainErrorCode);
        if (str.length() != 0) {
            A0k.append(", tigonErrorClassname=");
            A0k.append(str);
        }
        String str2 = tigonError.analyticsDetail;
        if (str2.length() != 0) {
            A0k.append(", analyticsDetail=\"");
            A0k.append(str2);
            A0k.append("\"");
        }
        String A0d = AnonymousClass001.A0d(")", A0k);
        11T.A0A(A0d);
        return A0d;
    }
}
