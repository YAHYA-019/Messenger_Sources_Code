package com.facebook.graphql.error;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: GraphQLErrorSerializer.class */
public class GraphQLErrorSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), GraphQLError.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        GraphQLError graphQLError = (GraphQLError) obj;
        if (graphQLError == null) {
            r302.A0Z();
        }
        r302.A0b();
        int i = graphQLError.code;
        r302.A0o("code");
        r302.A0f(i);
        int i2 = graphQLError.apiErrorCode;
        r302.A0o("api_error_code");
        r302.A0f(i2);
        AbstractC11224vw.A0D(r302, "summary", graphQLError.summary);
        AbstractC11224vw.A0D(r302, "description", graphQLError.description);
        boolean z = graphQLError.isSilent;
        r302.A0o("is_silent");
        r302.A0v(z);
        boolean z2 = graphQLError.isTransient;
        r302.A0o("is_transient");
        r302.A0v(z2);
        AbstractC11224vw.A0D(r302, "fb_request_id", graphQLError.fbRequestId);
        boolean z3 = graphQLError.requiresReauth;
        r302.A0o("requires_reauth");
        r302.A0v(z3);
        AbstractC11224vw.A0D(r302, "debug_info", graphQLError.debugInfo);
        AbstractC11224vw.A0D(r302, "query_path", graphQLError.queryPath);
        AbstractC11224vw.A05(r302, c26c, graphQLError.sentryBlockUserInfo, "sentry_block_user_info");
        AbstractC11224vw.A0D(r302, "severity", graphQLError.severity);
        long j = graphQLError.helpCenterId;
        r302.A0o("help_center_id");
        r302.A0g(j);
        r302.A0Y();
    }
}
