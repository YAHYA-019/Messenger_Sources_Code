package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.C1fa;
import X.DKD;
import X.JQx;
import X.KYE;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzak.class */
public final class zzak extends AbstractSafeParcelable {
    public final byte[][] A00;
    public static final Parcelable.Creator CREATOR = LGn.A00(94);
    public static final byte[] A01 = "WebAuthn PRF��".getBytes(StandardCharsets.UTF_8);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r302[r308] != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzak(byte[][] r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 1
            r303 = r0
            r0 = r302
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.AbstractC00481b7.A07(r0)
            r0 = r302
            int r0 = r0.length
            r304 = r0
            r0 = r304
            r1 = 1
            r0 = r0 & r1
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L26
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L26:
            r0 = r306
            X.AbstractC00481b7.A07(r0)
            r0 = 0
            r308 = r0
        L2e:
            r0 = r308
            r1 = r304
            if (r0 >= r1) goto L97
            r0 = r308
            if (r0 == 0) goto L4a
            r0 = r302
            r1 = r308
            r0 = r0[r1]
            r309 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r309
            if (r0 == 0) goto L4d
        L4a:
            r0 = 1
            r306 = r0
        L4d:
            r0 = r306
            X.AbstractC00481b7.A07(r0)
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            r0 = r302
            r1 = r305
            r0 = r0[r1]
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.AbstractC00481b7.A07(r0)
            r0 = r302
            r1 = r305
            r0 = r0[r1]
            r307 = r0
            r0 = r307
            int r0 = r0.length
            r303 = r0
            r0 = 32
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto L86
            r0 = 64
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L89
        L86:
            r0 = 1
            r306 = r0
        L89:
            r0 = r306
            X.AbstractC00481b7.A07(r0)
            r0 = r308
            r1 = 2
            int r0 = r0 + r1
            r308 = r0
            goto L2e
        L97:
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.<init>(byte[][]):void");
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v90, types: [byte[], byte[][]] */
    public static zzak A00(JSONObject jSONObject, boolean z) {
        byte[] A04;
        byte[] A03;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            if (jSONObject.has("eval")) {
                A0s.add(null);
                if (z) {
                    A03 = A03(jSONObject.getJSONObject("eval"));
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("eval");
                    A03 = A04(A02("first", jSONObject2));
                    if (jSONObject2.has("second")) {
                        A03 = KYE.A00((byte[][]) new byte[]{A03, A04(A02("second", jSONObject2))});
                    }
                }
                A0s.add(A03);
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String A0i = AnonymousClass001.A0i(keys);
                    A0s.add(A0i == null ? null : Base64.decode(A0i, 11));
                    if (z) {
                        A04 = A03(jSONObject3.getJSONObject(A0i));
                    } else {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(A0i);
                        A04 = A04(A02("first", jSONObject4));
                        if (jSONObject4.has("second")) {
                            A04 = KYE.A00((byte[][]) new byte[]{A04, A04(A02("second", jSONObject4))});
                        }
                    }
                    A0s.add(A04);
                }
            }
            return new zzak((byte[][]) A0s.toArray((Object[]) new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject A01(byte[] bArr) {
        JSONObject A12 = AnonymousClass001.A12();
        if (bArr.length == 32) {
            A12.put("first", Base64.encodeToString(bArr, 11));
            return A12;
        }
        A12.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        A12.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return A12;
    }

    public static byte[] A02(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (string == null) {
            return null;
        }
        return Base64.decode(string, 11);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [byte[], byte[][]] */
    public static byte[] A03(JSONObject jSONObject) {
        byte[] A02 = A02("first", jSONObject);
        if (A02.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (jSONObject.has("second")) {
            byte[] A022 = A02("second", jSONObject);
            if (A022.length != 32) {
                throw new JSONException("hashed PRF value with wrong length");
            }
            A02 = KYE.A00((byte[][]) new byte[]{A02, A022});
        }
        return A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.security.MessageDigest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A04(byte[] r301) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.A04(byte[]):byte[]");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.A00, ((zzak) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.A00) {
            if (bArr != null) {
                i ^= DKD.A04(bArr);
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    public final String toString() {
        ?? r0 = "}";
        try {
            JSONObject A12 = AnonymousClass001.A12();
            int i = 0;
            JSONObject jSONObject = null;
            while (true) {
                byte[][] bArr = this.A00;
                if (i >= bArr.length) {
                    r0 = 0Pz.A0j("PrfExtension{", A12.toString(), "}");
                    return r0;
                }
                if (bArr[i] == null) {
                    A12.put("eval", A01(bArr[i + 1]));
                } else {
                    if (jSONObject == null) {
                        jSONObject = AnonymousClass001.A12();
                        A12.put("evalByCredential", jSONObject);
                    }
                    jSONObject.put(C1fa.A00(bArr[i]), A01(bArr[i + 1]));
                }
                i += 2;
            }
        } catch (JSONException unused) {
            return 0Pz.A0j("PrfExtension{Exception:", r0.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.A00;
        int A0E = JQx.A0E(parcel);
        if (bArr != null) {
            int A012 = AbstractC01153q8.A01(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            AbstractC01153q8.A03(parcel, A012);
        }
        AbstractC01153q8.A03(parcel, A0E);
    }
}
