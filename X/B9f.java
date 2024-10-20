package X;

/* loaded from: B9f.class */
public final class B9f extends CP4 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007f, code lost:
    
        if (r308 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture handleRequest(android.content.Context r302, X.Bwy r303, org.json.JSONObject r304, com.facebook.auth.usersession.FbUserSession r305) {
        /*
            r301 = this;
            java.lang.String r0 = "Invalid request"
            r306 = r0
            r0 = 7
            r307 = r0
            r0 = r304
            r308 = r0
            r0 = r304
            if (r0 == 0) goto Lc6
            r0 = 49665(0xc201, float:6.9595E-41)
            r309 = r0
            r0 = r305
            r310 = r0
            r0 = r302
            r1 = r305
            r2 = 0
            r3 = r309
            java.lang.Object r0 = X.1Lo.A04(r0, r1, r2, r3)
            X.5I5 r0 = (X.5I5) r0
            r311 = r0
            r0 = r304
            java.lang.String r1 = "is_group_thread"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            r312 = r0
            r0 = r304
            java.lang.String r1 = "thread_id"
            java.lang.String r0 = r0.optString(r1)
            r313 = r0
            java.lang.String r0 = "message_timestamp"
            r314 = r0
            r0 = 0
            r315 = r0
            r0 = r304
            r1 = r314
            r2 = r315
            long r0 = r0.optLong(r1, r2)
            r317 = r0
            r0 = 1
            r319 = r0
            r0 = r313
            r1 = r319
            com.facebook.messaging.model.threadkey.ThreadKey r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0K(r0, r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L82
            java.lang.String r0 = "MarkThreadReadRequestHandler"
            java.lang.String r1 = "Failed to parse threadKey from threadId. Getting fallback back ThreadKey."
            X.0fH.A0j(r0, r1)
            r0 = 83487(0x1461f, float:1.1699E-40)
            r309 = r0
            r0 = r302
            r1 = r305
            r2 = 0
            r3 = r309
            java.lang.Object r0 = X.1Lo.A04(r0, r1, r2, r3)
            X.CbW r0 = (X.CbW) r0
            r314 = r0
            r0 = r314
            r1 = r302
            r2 = r313
            r3 = r312
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A02(r1, r2, r3)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lc6
        L82:
            r0 = r317
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 <= 0) goto Lc6
            r0 = r311
            X.00i r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.2fE r0 = (X.2fE) r0
            r314 = r0
            r0 = r314
            r1 = r308
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A06(r1)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto Lba
            r0 = r310
            r1 = r311
            r2 = r317
            r3 = r319
            r4 = r319
            r5 = r319
            X.5I5.A02(r0, r1, r2, r3, r4, r5)
        Lba:
            r0 = 0
            java.lang.String r0 = X.CP4.success(r0)
            r314 = r0
        Lc0:
            r0 = r314
            com.google.common.util.concurrent.ListenableFuture r0 = X.1Kd.A0A(r0)
            return r0
        Lc6:
            r0 = r307
            r1 = r306
            java.lang.String r0 = X.CP4.error(r0, r1)
            r314 = r0
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B9f.handleRequest(android.content.Context, X.Bwy, org.json.JSONObject, com.facebook.auth.usersession.FbUserSession):com.google.common.util.concurrent.ListenableFuture");
    }
}
