package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Locale;

/* loaded from: LZw.class */
public final class LZw implements GKt {
    public final Kfr A00;

    public LZw(Kfr kfr) {
        this.A00 = kfr;
    }

    public static 04J A00(0DA r301, LZw lZw, String str, String str2) {
        r301.A07(str, str2);
        return lZw.A00.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkb, X.0DA] */
    public static C3140Jkb A01(Long l, String str, String str2) {
        ?? r0 = new 0DA();
        r0.A07("contact_type", str);
        if (l != null) {
            r0.A06("contact_id", l);
        }
        if (str2 != null) {
            JQz.A1D((0DA) r0, str2);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jl3, X.0DA] */
    public static C3166Jl3 A02(Long l) {
        ?? r0 = new 0DA();
        r0.A01(EnumC3496Mfr.A03, "credential_type");
        r0.A06("credential_id", l);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jl3, X.0DA] */
    public static C3166Jl3 A03(Long l) {
        ?? r0 = new 0DA();
        r0.A09();
        r0.A06("credential_id", l);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jl3, X.0DA] */
    public static C3166Jl3 A04(Long l, String str, String str2, String str3) {
        ?? r0 = new 0DA();
        r0.A01(EnumC3496Mfr.valueOf(str.toUpperCase(Locale.US)), "credential_type");
        if (l != null) {
            r0.A06("credential_id", l);
        }
        if (str2 != null) {
            JQz.A1D((0DA) r0, str2);
        }
        if (str3 != null) {
            r0.A07("view_name", str3);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkf, X.0DA] */
    public static C3144Jkf A05(Long l) {
        ?? r0 = new 0DA();
        r0.A06("credential_id", l);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Jkm, X.0DA] */
    public static C3151Jkm A06(String str) {
        ?? r0 = new 0DA();
        EQ3 A00 = C0e1.A00(EQ3.class, str);
        A00.getClass();
        r0.A01(A00, "legal_info_type");
        return r0;
    }

    public static 8Fk A07(java.util.Map map) {
        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        obj.getClass();
        Long l = (Long) obj;
        0DA r0 = new 0DA();
        r0.A06("shipping_address_id", l);
        return r0;
    }

    public static Long A08(Object obj, java.util.Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (Long) obj2;
    }

    public static String A09(Object obj, java.util.Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (String) obj2;
    }

    public static String A0A(String str) {
        Object obj;
        switch (str.hashCode()) {
            case -2025722585:
                obj = "edit_email";
                break;
            case 330394238:
                obj = "add_email";
                break;
            default:
                return "phone";
        }
        return str.equals(obj) ? "email" : "phone";
    }

    public static String A0B(String str, java.util.Map map) {
        return (String) AbstractC11504wo.A00(str, map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x04e1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0f6d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x1972  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1ae8  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1b45  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x1c0b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x11bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x1f05  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x14f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x129a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x116f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r307v32, types: [X.Jl3, X.0DA] */
    /* JADX WARN: Type inference failed for: r311v106, types: [X.Jl3, X.0DA] */
    /* JADX WARN: Type inference failed for: r311v2, types: [X.Jl3, X.0DA] */
    @Override // X.GKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BZT(java.lang.String r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 11981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZw.BZT(java.lang.String, java.util.Map):void");
    }
}
