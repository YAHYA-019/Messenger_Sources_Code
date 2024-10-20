package X;

import com.facebook.graphql.enums.GraphQLXFBMessengerGenAICardCategory;
import com.facebook.graphql.enums.GraphQLXFBMessengerGenAISuggestedActionType;
import com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsImpressionEvent;

/* renamed from: X.9ls, reason: invalid class name */
/* loaded from: 9ls.class */
public final class C9ls {
    public static final C9ls A00 = new Object();

    public static final 98J A00(GraphQLXFBMessengerGenAISuggestedActionType graphQLXFBMessengerGenAISuggestedActionType) {
        switch (7zR.A04(graphQLXFBMessengerGenAISuggestedActionType)) {
            case 1:
                return 98J.A01;
            case 2:
                return 98J.A02;
            case 3:
                return 98J.A03;
            case 4:
                return 98J.A04;
            case 5:
            default:
                return null;
            case 6:
                return 98J.A05;
            case 7:
                return 98J.A06;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent A01(X.AnonymousClass983 r301, X.8KO r302, X.8Jv r303, java.lang.Integer r304, java.lang.Long r305, java.lang.String r306) {
        /*
            r0 = 0
            r307 = r0
            r0 = r302
            if (r0 == 0) goto Lbb
            r0 = r302
            java.lang.String r0 = r0.A08
            r308 = r0
            r0 = r302
            com.facebook.graphql.enums.GraphQLXFBMessengerGenAICardCategory r0 = r0.A01
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lbe
            r0 = r309
            int r0 = r0.ordinal()
            r310 = r0
        L1f:
            r0 = 1
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = r310
            r1 = r311
            if (r0 == r1) goto Lb3
            r0 = 2
            r311 = r0
            r0 = r310
            r1 = r311
            if (r0 == r1) goto Lab
            r0 = 4
            r311 = r0
            r0 = r310
            r1 = r311
            if (r0 == r1) goto La3
            r0 = 5
            r311 = r0
            r0 = r310
            r1 = r311
            if (r0 != r1) goto L4f
            X.98C r0 = X.98C.A04
            r312 = r0
        L4f:
            r0 = r304
            if (r0 == 0) goto L9d
            r0 = r304
            java.lang.Long r0 = X.7zP.A0g(r0)
            r313 = r0
        L59:
            r0 = r302
            if (r0 == 0) goto L97
            r0 = r302
            java.lang.String r0 = r0.A06
            r314 = r0
        L63:
            r0 = r303
            if (r0 == 0) goto L6d
            r0 = r303
            com.facebook.graphql.enums.GraphQLXFBMessengerGenAISuggestedActionType r0 = r0.A00
            r307 = r0
        L6d:
            r0 = r307
            X.98J r0 = A00(r0)
            r315 = r0
            com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent r0 = new com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent
            r316 = r0
            r0 = r301
            r317 = r0
            r0 = r306
            r301 = r0
            r0 = r316
            r1 = r312
            r2 = r317
            r3 = r315
            r4 = r313
            r5 = r305
            r6 = r308
            r7 = r314
            r8 = r306
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r316
            return r0
        L97:
            r0 = 0
            r314 = r0
            goto L63
        L9d:
            r0 = 0
            r313 = r0
            goto L59
        La3:
            X.98C r0 = X.98C.A03
            r312 = r0
            goto L4f
        Lab:
            X.98C r0 = X.98C.A02
            r312 = r0
            goto L4f
        Lb3:
            X.98C r0 = X.98C.A01
            r312 = r0
            goto L4f
        Lbb:
            r0 = 0
            r308 = r0
        Lbe:
            r0 = -1
            r310 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ls.A01(X.983, X.8KO, X.8Jv, java.lang.Integer, java.lang.Long, java.lang.String):com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent");
    }

    public final OnAiNullStateCardsImpressionEvent A02(8KO r302, 8Jv r303, Long l, int i) {
        String str = r302.A08;
        GraphQLXFBMessengerGenAISuggestedActionType graphQLXFBMessengerGenAISuggestedActionType = null;
        if (str == null) {
            return null;
        }
        String str2 = r303 != null ? "pill" : null;
        GraphQLXFBMessengerGenAICardCategory graphQLXFBMessengerGenAICardCategory = r302.A01;
        98C.valueOf(graphQLXFBMessengerGenAICardCategory.name());
        int ordinal = graphQLXFBMessengerGenAICardCategory.ordinal();
        98C r313 = null;
        if (ordinal == 1) {
            r313 = 98C.A01;
        } else if (ordinal == 2) {
            r313 = 98C.A02;
        } else if (ordinal == 4) {
            r313 = 98C.A03;
        } else if (ordinal == 5) {
            r313 = 98C.A04;
        }
        long j = i;
        String str3 = r302.A06;
        if (r303 != null) {
            graphQLXFBMessengerGenAISuggestedActionType = r303.A00;
        }
        return new OnAiNullStateCardsImpressionEvent(r313, A00(graphQLXFBMessengerGenAISuggestedActionType), l, str, str3, str2, j);
    }
}
