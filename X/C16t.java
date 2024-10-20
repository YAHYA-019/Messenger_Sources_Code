package X;

import org.json.JSONObject;

/* renamed from: X.16t, reason: invalid class name */
/* loaded from: 16t.class */
public abstract class C16t {
    public static JSONObject A00(C16w c16w, C1Au c1Au, C1At c1At, C1As c1As, C1Ar c1Ar, C1Aq c1Aq, C1Ap c1Ap, C1Ao c1Ao, boolean z, boolean z2) {
        JSONObject A12 = AnonymousClass001.A12();
        A12.putOpt(c1As.A00, c1As.A02(z2, z));
        if (c1Aq != null) {
            A12.putOpt(c1Aq.A00, c1Aq.A02(z2, z));
        }
        if (c1Au != null) {
            A12.putOpt(c1Au.A00, c1Au.A02(z2, z));
        }
        if (c1Ar != null) {
            A12.putOpt(c1Ar.A00, c1Ar.A02(z2, z));
        }
        if (c16w != null) {
            JSONObject A122 = AnonymousClass001.A12();
            A122.putOpt("ssr", c16w.A03);
            A122.putOpt("mcd", Long.valueOf(c16w.A00));
            A122.putOpt("mfcl", Long.valueOf(c16w.A02));
            A122.putOpt("mcg", Long.valueOf(c16w.A01));
            A12.putOpt("ss", A122);
        }
        if (c1At != null) {
            A12.putOpt(((16H) c1At).A03, c1At.A02(z));
        }
        if (c1Ao != null) {
            A12.putOpt(((16H) c1Ao).A03, c1Ao.A02(z));
        }
        if (c1Ap != null) {
            A12.putOpt(((16H) c1Ap).A03, c1Ap.A02(z));
        }
        return A12;
    }
}
