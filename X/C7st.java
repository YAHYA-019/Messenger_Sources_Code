package X;

/* renamed from: X.7st, reason: invalid class name */
/* loaded from: 7st.class */
public abstract class C7st {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r302.canBubble() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(android.app.Notification r301, android.app.NotificationChannel r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r301
            java.lang.String r0 = r0.getShortcutId()
            r301 = r0
            r0 = r302
            java.lang.String r0 = r0.getConversationId()
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r302
            boolean r0 = r0.canBubble()
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r304 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7st.A00(android.app.Notification, android.app.NotificationChannel):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r302.canBubble() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(android.app.Notification r301, android.app.NotificationChannel r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L25
            r0 = r301
            java.lang.String r0 = r0.getShortcutId()
            r301 = r0
            r0 = r302
            java.lang.String r0 = r0.getConversationId()
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L25
            r0 = r302
            boolean r0 = r0.canBubble()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L29
        L25:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L29:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7st.A01(android.app.Notification, android.app.NotificationChannel):boolean");
    }
}
