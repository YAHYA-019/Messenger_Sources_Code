package com.facebook.graphql.error;

import X.C4Qa;
import X.DpH;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;

/* loaded from: GraphServicesExceptionMigrationAdapter.class */
public class GraphServicesExceptionMigrationAdapter {
    public static boolean isGraphServicesExceptionEnabled;

    public static GraphQLError getGraphQLErrorFromException(Throwable th) {
        if (th instanceof DpH) {
            return ((DpH) th).error;
        }
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mError;
        }
        return null;
    }

    public static Summary getSummaryFromException(Throwable th) {
        if (th instanceof DpH) {
            return ((DpH) th).summary;
        }
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mSummary;
        }
        if (th instanceof C4Qa) {
            return ((C4Qa) th).summary;
        }
        return null;
    }

    public static TigonError getTigonErrorFromException(Throwable th) {
        if ((th instanceof TigonErrorException) || (th instanceof C4Qa)) {
            return ((TigonErrorException) th).tigonError;
        }
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mTigonError;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if ((r301 instanceof X.DpH) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isGraphServicesError(java.lang.Throwable r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.graphql.error.GraphServicesException
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0 instanceof X.DpH
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter.isGraphServicesError(java.lang.Throwable):boolean");
    }

    public static boolean isGraphServicesExceptionEnabled() {
        return isGraphServicesExceptionEnabled;
    }

    public static boolean isNetworkError(Throwable th) {
        boolean z = false;
        if (!(th instanceof GraphServicesException) && (th instanceof TigonErrorException)) {
            z = true;
        }
        return z;
    }

    public static void setIsGraphServicesExceptionEnabled(boolean z) {
        isGraphServicesExceptionEnabled = z;
    }
}
