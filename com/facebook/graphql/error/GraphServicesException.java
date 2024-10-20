package com.facebook.graphql.error;

import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import java.io.IOException;

/* loaded from: GraphServicesException.class */
public class GraphServicesException extends IOException {
    public final GraphQLError mError;
    public String mErrorMsg;
    public final Summary mSummary;
    public final TigonError mTigonError;

    public GraphServicesException(TigonError tigonError, Summary summary) {
        super("GraphServicesError ( empty )");
        this.mTigonError = tigonError;
        this.mSummary = summary;
        this.mError = toGraphQLError();
        this.mErrorMsg = toMessageString();
    }

    public GraphServicesException(TigonErrorException tigonErrorException, Summary summary) {
        this(tigonErrorException == null ? null : tigonErrorException.tigonError, summary);
    }

    private GraphQLError toGraphQLError() {
        String str;
        Summary summary = this.mSummary;
        if (summary == null || (str = summary.summary) == null || str.isEmpty()) {
            return null;
        }
        int i = summary.apiErrorCode;
        int i2 = summary.code;
        String str2 = summary.debugInfo;
        return new GraphQLError(null, str, summary.description, summary.fbRequestId, str2, null, i2, i, 0L, summary.isSilent, summary.isTransient, summary.requiresReauth);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        if (r304 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        r304 = "GraphServicesError (empty)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        return r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        if (r303 != null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r303v3 */
    /* JADX WARN: Type inference failed for: r303v6 */
    /* JADX WARN: Type inference failed for: r303v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String toMessageString() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesException.toMessageString():java.lang.String");
    }

    public GraphQLError getGraphQLError() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mErrorMsg;
    }

    public Summary getSummary() {
        return this.mSummary;
    }

    public TigonError getTigonError() {
        return this.mTigonError;
    }
}
