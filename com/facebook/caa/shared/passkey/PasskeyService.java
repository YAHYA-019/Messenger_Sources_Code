package com.facebook.caa.shared.passkey;

import X.02H;
import X.0DE;
import X.0DR;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.2Zo;
import X.2Zy;
import X.2aK;
import X.AJj;
import X.AnonymousClass001;
import X.C03r;
import X.C2az;
import X.C2b0;
import X.C2b5;
import X.C87v;
import X.C98i;
import X.DKB;
import X.DKC;
import X.DKM;
import X.DKc;
import X.FHh;
import X.GJj;
import X.JR0;
import X.JR1;
import X.JfA;
import X.JfC;
import X.JfF;
import X.JfK;
import X.JfL;
import X.JfM;
import X.JjV;
import X.Jsz;
import X.Jt2;
import X.KN8;
import X.KNV;
import X.KNY;
import X.KQl;
import X.KQm;
import X.KVT;
import X.KWJ;
import X.KrD;
import X.KsV;
import X.Kyq;
import X.L20;
import X.LQU;
import X.Qme;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.credentials.CredentialManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PasskeyService.class */
public final class PasskeyService {
    public static final Jt2 A08;
    public final Context A00;
    public final CredentialManager A01;
    public final FHh A02;
    public final GJj A03;
    public final GJj A04;
    public final GJj A05;
    public final Map A06;
    public final GJj A07;

    static {
        Jt2 A00 = KWJ.A00(DKC.A1B(DKC.A1a("do_not_use_for_real_derivation", C03r.A05), 0));
        if (A00 == null) {
            throw 1BK.A0h();
        }
        A08 = A00;
    }

    public PasskeyService(Context context, FHh fHh, GJj gJj, GJj gJj2, GJj gJj3, GJj gJj4, Map map) {
        11T.A0F(map, 7);
        this.A00 = context;
        this.A02 = fHh;
        this.A05 = gJj;
        this.A07 = gJj2;
        this.A03 = gJj3;
        this.A04 = gJj4;
        this.A06 = map;
        this.A01 = new LQU(context);
    }

    public static final DKc A00(PasskeyService passkeyService, String str) {
        String str2;
        try {
            str2 = DKC.A1F(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
        } catch (JSONException e) {
            0fH.A0s("PasskeyService", "extractCredentialId: Failed to parse json", e);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        11T.A0F(str, 0);
        try {
            JSONObject A1F = DKC.A1F(str);
            JSONObject optJSONObject = A1F.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS);
            if (optJSONObject != null) {
                optJSONObject.remove("prf");
            }
            String obj = A1F.toString();
            if (obj == null) {
                return null;
            }
            Charset charset = C03r.A05;
            String A1B = DKC.A1B(DKC.A1a(obj, charset), 11);
            DKM dkm = new DKM();
            dkm.A0J(str2, 0);
            dkm.A0I(A1B);
            dkm.A0J("noop", 2);
            JSONObject A12 = AnonymousClass001.A12();
            Iterator A0y = AnonymousClass001.A0y(passkeyService.A06);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Object key = A0z.getKey();
                boolean A1V = AnonymousClass001.A1V(A0z.getValue());
                if (11T.A0O(key, DKB.A00(93)) && A1V) {
                    Qme qme = new Qme("autofill_key");
                    JSONArray jSONArray = new JSONArray();
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put("pub", qme.A00());
                    A122.put("sig", qme.A02(DKC.A1a(obj, charset)));
                    jSONArray.put(A122);
                    Qme qme2 = new Qme(1BL.A0E().A02);
                    JSONObject A123 = AnonymousClass001.A12();
                    A123.put("pub", qme2.A00());
                    A123.put("sig", qme2.A02(DKC.A1a(obj, charset)));
                    jSONArray.put(A123);
                    A12.put("device_key_signature_ext", jSONArray);
                }
            }
            dkm.A0J(DKC.A1B(DKC.A1a(11T.A02(A12), charset), 11), 3);
            return dkm.A0G();
        } catch (JSONException e2) {
            0fH.A0s("PasskeyUtil", "toJSONObject: Failed to parse json", e2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(2:9|(3:11|12|13)(2:15|16))(8:17|18|19|20|21|(2:23|24)|25|26)))|49|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        r309 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        X.0fH.A0s("PasskeyService", "handleCredentialException", r309);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if ((r309 instanceof X.JfM) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        r310 = r301.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r310 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        A02(r301, new X.DKM().A0G(), r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        r309 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        if ((r309 instanceof X.JfC) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        r307 = r309 instanceof X.KQm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        if (r307 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        r0 = X.DKB.A00(499);
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        if (r0.containsKey(r0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        r308 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
    
        if (X.1BK.A1X(r0.get(r0), true) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r308 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        r310 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015a, code lost:
    
        r308 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0163, code lost:
    
        A03(r301, r309);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(com.facebook.caa.shared.passkey.PasskeyService r301, X.0DR r302, kotlin.jvm.functions.Function1 r303) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A01(com.facebook.caa.shared.passkey.PasskeyService, X.0DR, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void A02(PasskeyService passkeyService, DKc dKc, GJj gJj) {
        if (gJj != null) {
            2aK.A03((Integer) null, (0DE) null, new AJj(dKc, passkeyService, gJj, (0DR) null, 19), 2Zy.A01(2Zo.A04(false)), 3);
        }
    }

    public static final void A03(PasskeyService passkeyService, Exception exc) {
        long j;
        DKM dkm = new DKM();
        switch ((exc instanceof JfC ? 0S2.A01 : exc instanceof JfF ? 0S2.A0C : exc instanceof JfA ? 0S2.A1J : exc instanceof KQl ? 0S2.A0N : exc instanceof JfK ? 0S2.A0Y : exc instanceof JfL ? 0S2.A0j : exc instanceof JfM ? 0S2.A0u : exc instanceof KQm ? 0S2.A15 : exc instanceof C98i ? 0S2.A1G : 0S2.A00).intValue()) {
            case 0:
                j = 0;
                break;
            case 1:
                j = 1;
                break;
            case 2:
                j = 2;
                break;
            case 3:
                j = 3;
                break;
            case 4:
                j = 4;
                break;
            case 5:
                j = 5;
                break;
            case 6:
                j = 6;
                break;
            case 7:
                j = 7;
                break;
            case 8:
                j = 8;
                break;
            default:
                j = 9;
                break;
        }
        dkm.A0H(Long.valueOf(j));
        dkm.A0I(0Pz.A1B("Passkey Service Exception: ", exc));
        A02(passkeyService, dkm.A0G(), passkeyService.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A04(C87v c87v, String str, boolean z) {
        L20 l20;
        byte b;
        JjV A0a;
        Object obj;
        JSONObject jSONObject;
        String str2 = 1BL.A0E().A02;
        try {
            String string = DKC.A1F(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
            if (string == null || (l20 = (L20) 1Bi.A03(82300)) == null) {
                return;
            }
            if (11T.A0O(String.valueOf(c87v != null ? c87v.A00 : null), A08.toString())) {
                return;
            }
            SharedPreferences sharedPreferences = l20.A00;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            11T.A0D(edit);
            Map A00 = L20.A00(l20);
            boolean A1X = 1BL.A1X(edit, A00);
            LinkedHashMap A1C = 1BK.A1C();
            Iterator A0y = AnonymousClass001.A0y(A00);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Jsz jsz = (Jsz) A0z.getKey();
                if (11T.A0O(jsz.A03, str2) && 11T.A0O(jsz.A02, string)) {
                    1BL.A1O(A1C, A0z);
                }
            }
            Iterator A19 = 1BK.A19(A1C);
            while (A19.hasNext()) {
                edit.remove(((Jsz) A19.next()).A00());
            }
            edit.apply();
            if (z) {
                11T.A0F(str, 0);
                b = true;
            } else {
                b = false;
                11T.A0F(str, 0);
            }
            C2b0 c2b0 = new C2b0();
            try {
                try {
                    JSONObject optJSONObject = DKC.A1F(str).optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS);
                    jSONObject = null;
                    if (optJSONObject != null) {
                        jSONObject = optJSONObject.optJSONObject("prf");
                    }
                } catch (Throwable th) {
                    KVT.A00(th);
                    c2b0.Cal(KN8.A03);
                }
            } catch (C2az e) {
                A0a = JR1.A0a(c2b0, e);
            } catch (Throwable th2) {
                c2b0.A00();
                KVT.A00(th2);
                throw th2;
            }
            if (jSONObject == null) {
                0fH.A0l("PasskeyUtil", "parseRegResponse: PRF field not found");
                c2b0.Cal(KN8.A04);
            } else if (!b == true || jSONObject.optBoolean("enabled")) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("results");
                if (optJSONObject2 != null && optJSONObject2.has("first")) {
                    String string2 = optJSONObject2.getString("first");
                    if (string2 != null) {
                        try {
                            byte[] decode = Base64.decode(string2, 11);
                            if (decode != null) {
                                Jt2 jt2 = new Jt2(decode);
                                if (jt2.A00.length == 32) {
                                    A0a = JR0.A0c(c2b0, new KrD(jt2));
                                    if (A0a instanceof JjV) {
                                        obj = A0a.A00;
                                    } else {
                                        if (!(A0a instanceof C2b5)) {
                                            throw 1BK.A1F();
                                        }
                                        obj = null;
                                    }
                                    KrD krD = (KrD) obj;
                                    if (c87v == null || krD == null) {
                                        return;
                                    }
                                    Jsz jsz2 = new Jsz(KNV.A02, c87v, str2, string);
                                    Set A02 = 02H.A02(new KNY[]{KNY.A03, KNY.A02});
                                    11T.A0F(A02, A1X ? 1 : 0);
                                    String str3 = jsz2.A03;
                                    KNV knv = jsz2.A00;
                                    11T.A0F(str3, A1X ? 1 : 0);
                                    11T.A0F(knv, 2);
                                    Jt2 jt22 = new Jt2(Kyq.A00);
                                    Charset charset = C03r.A05;
                                    Jt2 jt23 = new Jt2(DKC.A1a("v=1", charset));
                                    Jt2 jt24 = new Jt2(DKC.A1a(0Pz.A0v("type=", knv.typeName, ";uid=", str3), charset));
                                    try {
                                        KsV A002 = new KsV(krD.A00.A00).A00(jt22.A00).A00(jt23.A00).A00(jt24.A00);
                                        11T.A0F(A002, A1X ? 1 : 0);
                                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                        11T.A0A(edit2);
                                        long now = l20.A01.now();
                                        String A003 = jsz2.A00();
                                        JSONObject A12 = AnonymousClass001.A12();
                                        A12.put("created_time", now);
                                        JSONObject A122 = AnonymousClass001.A12();
                                        A122.put("root_scope", jt22.toString());
                                        A122.put("root_rotatable_scope", jt23.toString());
                                        A122.put("root_stored_scope", jt24.toString());
                                        JSONObject A123 = AnonymousClass001.A12();
                                        A123.put("secret", Base64.encodeToString(A002.A00, 0));
                                        A122.put("derivable_secret", A123);
                                        A12.put("secret", A122);
                                        Iterator it = A02.iterator();
                                        while (it.hasNext()) {
                                            A12.accumulate("allowed_operations", ((KNY) it.next()).value);
                                        }
                                        SharedPreferences.Editor putString = edit2.putString(A003, 11T.A02(A12));
                                        11T.A0A(putString);
                                        putString.apply();
                                        return;
                                    } catch (Exception e2) {
                                        0fH.A0r("PasskeyBackupKeyDeriver", "Failed to derive account-level encryption key", e2);
                                        return;
                                    }
                                }
                                c2b0.Cal(KN8.A07);
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                        c2b0.Cal(KN8.A06);
                    }
                }
                0fH.A0l("PasskeyUtil", "parseRegResponse: results->first not found");
                c2b0.Cal(KN8.A02);
            } else {
                0fH.A0l("PasskeyUtil", "parseRegResponse: PRF extension is not enabled");
                c2b0.Cal(KN8.A05);
            }
            throw 0Q8.createAndThrow();
        } catch (JSONException e3) {
            0fH.A0s("PasskeyService", "extractCredentialId: Failed to parse json", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (X.1BK.A1X(r0.get(r0), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A05(android.content.Context r302, java.lang.String r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A05(android.content.Context, java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
