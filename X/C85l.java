package X;

/* renamed from: X.85l, reason: invalid class name */
/* loaded from: 85l.class */
public final class C85l implements C70l {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (((r0 == null || (r0 = r0.A00) == null) ? null : r0.A06(X.C84w.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "message_type")) != X.C84w.MENTION) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.C5fu r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            boolean r0 = r0 instanceof X.5gC
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L46
            X.83v r0 = X.C83v.A00
            r302 = r0
            r0 = r301
            X.5fu r0 = (X.C5fu) r0
            r1 = r302
            X.5PP r0 = r0.AxW(r1)
            com.facebook.xapp.messaging.threadview.model.note.NoteMetadata r0 = (com.facebook.xapp.messaging.threadview.model.note.NoteMetadata) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4c
            r0 = r302
            X.7dW r0 = r0.A00
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L4c
            X.84w r0 = X.C84w.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r304 = r0
            java.lang.String r0 = "message_type"
            r302 = r0
            r0 = r301
            r1 = r304
            r2 = r302
            java.lang.Enum r0 = r0.A06(r1, r2)
            r301 = r0
        L3b:
            X.84w r0 = X.C84w.MENTION
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r304
            if (r0 == r1) goto L4a
        L46:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L4a:
            r0 = r303
            return r0
        L4c:
            r0 = 0
            r301 = r0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85l.A00(X.5fu):boolean");
    }

    @Override // X.C70l
    public /* bridge */ /* synthetic */ boolean BUT(C5fv c5fv) {
        return A00((C5fu) c5fv);
    }
}
