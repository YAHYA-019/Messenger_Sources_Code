package X;

import java.util.HashMap;

/* renamed from: X.3Og, reason: invalid class name */
/* loaded from: 3Og.class */
public final class C3Og {
    public final HashMap A00;
    public final boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (new org.json.JSONObject(r0.A0H()).getString("ei") != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        r305 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (new org.json.JSONObject(r0.A0H()).getString("ei") != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3Og(java.util.HashMap r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            java.lang.String r0 = "tracking"
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            X.3OU r0 = (X.3OU) r0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto Lbc
            r0 = r304
            java.lang.String r0 = r0.A00
            r306 = r0
            r0 = r303
            r1 = r306
            boolean r0 = r0.equalsIgnoreCase(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lbc
            r0 = r304
            java.lang.Object r0 = r0.A00()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lbc
            r0 = r303
            X.24X r0 = (X.24X) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lbc
            r0 = r303
            int r0 = r0.A05()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lbc
            r0 = r303
            r1 = 0
            X.24X r0 = r0.A0B(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7e
            r0 = r306
            java.lang.String r0 = r0.A0H()     // Catch: org.json.JSONException -> L7d
            r306 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d
            r304 = r0
            r0 = r304
            r1 = r306
            r0.<init>(r1)     // Catch: org.json.JSONException -> L7d
            java.lang.String r0 = "ei"
            r306 = r0
            r0 = r304
            r1 = r306
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L7d
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7e
            goto Lb9
        L7d:
        L7e:
            r0 = 1
            r308 = r0
            r0 = r303
            int r0 = r0.A05()
            r1 = r308
            int r0 = r0 - r1
            r307 = r0
            r0 = r303
            r1 = r307
            X.24X r0 = r0.A0B(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lbc
            r0 = r306
            java.lang.String r0 = r0.A0H()     // Catch: org.json.JSONException -> Lc3
            r306 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc3
            r304 = r0
            r0 = r304
            r1 = r306
            r0.<init>(r1)     // Catch: org.json.JSONException -> Lc3
            java.lang.String r0 = "ei"
            r306 = r0
            r0 = r304
            r1 = r306
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> Lc3
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lbc
        Lb9:
            r0 = 1
            r305 = r0
        Lbc:
            r0 = r301
            r1 = r305
            r0.A01 = r1
            return
        Lc3:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Og.<init>(java.util.HashMap):void");
    }

    public final 24X A00(String str) {
        24X r304 = null;
        3OU r0 = (3OU) this.A00.get(str);
        if (r0 instanceof C33a) {
            r304 = ((C33a) r0).A00;
        }
        return r304;
    }

    public final Boolean A01(String str) {
        Boolean bool = null;
        if (((3OU) this.A00.get(str)) instanceof 33Y) {
            bool = true;
        }
        return bool;
    }

    public final Long A02() {
        33Z r0 = (3OU) this.A00.get("log_context_hash");
        if (!(r0 instanceof 33Z)) {
            return null;
        }
        int i = r0.A00;
        if (Integer.valueOf(i) != null) {
            return 1BK.A0l(i);
        }
        return null;
    }

    public final String A03(String str) {
        String str2 = null;
        3OU r0 = (3OU) this.A00.get(str);
        if (r0 instanceof C33c) {
            str2 = ((C33c) r0).A00;
        }
        return str2;
    }

    public final void A04(String str) {
        11T.A0F(str, 0);
        this.A00.put("event_trace_id", new C33c("event_trace_id", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r1 = "is_from_wrapper_handler"
            java.lang.Boolean r0 = r0.A01(r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            boolean r0 = r0.booleanValue()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1a
        L16:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Og.A05():boolean");
    }
}
