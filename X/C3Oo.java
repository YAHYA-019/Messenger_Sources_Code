package X;

import android.os.Bundle;
import com.facebook.http.protocol.ApiErrorResult;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: X.3Oo, reason: invalid class name */
/* loaded from: 3Oo.class */
public abstract class C3Oo {
    public static Bundle A00(Throwable th) {
        Bundle A05 = 1BK.A05();
        A05.putString("originalExceptionMessage", 0Pz.A0j(AnonymousClass001.A0X(th), ":", th.getMessage()));
        A05.putString("originalExceptionStack", android.util.Log.getStackTraceString(th));
        if (th instanceof 2L2) {
            A05.putParcelable("result", ((2L2) th).AlM());
        }
        return A05;
    }

    public static 29B A01(Throwable th) {
        if (C3RN.A02(th)) {
            return 29B.A07;
        }
        if (C3RN.A00(th)) {
            return 29B.A08;
        }
        if (C3RN.A01(th)) {
            return 29B.A09;
        }
        if (th instanceof 2L0) {
            ApiErrorResult apiErrorResult = ((2L0) th).result;
            int i = apiErrorResult.mErrorSubCode;
            29B r304 = 29B.A0A;
            if (i != r304.mAsInt) {
                int A00 = apiErrorResult.A00();
                r304 = 29B.A01;
                if (A00 != r304.mAsInt) {
                    return 29B.A02;
                }
            }
            return r304;
        }
        Throwable th2 = th;
        while (true) {
            Throwable th3 = th2;
            if (th3 == null) {
                Throwable th4 = th;
                while (true) {
                    Throwable th5 = th4;
                    if (th5 == null) {
                        return ((th instanceof CancellationException) || (th instanceof InterruptedException)) ? 29B.A04 : 29B.A0H;
                    }
                    if (OutOfMemoryError.class.isInstance(th5)) {
                        return 29B.A0I;
                    }
                    th4 = th5.getCause();
                }
            } else {
                if (IOException.class.isInstance(th3)) {
                    if (th != null) {
                        if (th.getMessage() != null && th.getMessage().contains("Could not validate certificate")) {
                            return 29B.A06;
                        }
                        if (th.getMessage() != null && th.getMessage().contains("GraphQLException: [code] 1610003")) {
                            return 29B.A0M;
                        }
                        if (th.getCause() != null && th.getCause().getMessage() != null && th.getCause().getMessage().contains("StaleWebDataException")) {
                            return 29B.A0G;
                        }
                    }
                    return 29B.A05;
                }
                th2 = th3.getCause();
            }
        }
    }
}
