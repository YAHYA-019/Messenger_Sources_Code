package com.facebook.messaging.model.messages;

import X.1BJ;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AnonymousClass001;
import X.BNL;
import X.DJg;
import X.DKC;
import X.FKg;
import X.RNk;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InstantGameInfoProperties.class */
public final class InstantGameInfoProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new FKg(2);
    public final BNL A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public InstantGameInfoProperties(BNL bnl, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0C = str5;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A03 = str6;
        this.A07 = str7;
        this.A06 = str8;
        this.A04 = str9;
        this.A05 = str10;
        this.A00 = bnl;
        this.A0D = str11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.messaging.model.messages.InstantGameInfoProperties A00(java.lang.String r301, java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, java.lang.String r311, java.lang.String r312, java.lang.String r313, java.lang.String r314) {
        /*
            r0 = r306
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r315 = r0
            r0 = 0
            r316 = r0
            r0 = r315
            if (r0 != 0) goto L26
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L25
            r317 = r0
            r0 = r317
            r1 = r306
            r0.<init>(r1)     // Catch: org.json.JSONException -> L25
            r0 = r317
            com.google.common.collect.ImmutableList r0 = A02(r0)     // Catch: org.json.JSONException -> L25
            r318 = r0
            goto L29
        L25:
        L26:
            r0 = 0
            r318 = r0
        L29:
            r0 = r307
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r315 = r0
            r0 = r315
            if (r0 != 0) goto L48
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb3
            r317 = r0
            r0 = r317
            r1 = r307
            r0.<init>(r1)     // Catch: org.json.JSONException -> Lb3
            r0 = r317
            com.google.common.collect.ImmutableList r0 = A02(r0)     // Catch: org.json.JSONException -> Lb3
            r316 = r0
        L48:
            r0 = r313
            X.BNL r0 = X.BNL.A00(r0)
            r319 = r0
            r0 = r301
            r320 = r0
            r0 = r301
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r315 = r0
            r0 = r315
            if (r0 != 0) goto Lb1
            r0 = r302
            r321 = r0
            r0 = r302
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r315 = r0
            r0 = r315
            if (r0 != 0) goto Lb1
            com.facebook.messaging.model.messages.InstantGameInfoProperties r0 = new com.facebook.messaging.model.messages.InstantGameInfoProperties
            r317 = r0
            r0 = r314
            r307 = r0
            r0 = r303
            r322 = r0
            r0 = r304
            r323 = r0
            r0 = r305
            r301 = r0
            r0 = r308
            r302 = r0
            r0 = r309
            r303 = r0
            r0 = r310
            r304 = r0
            r0 = r311
            r305 = r0
            r0 = r312
            r306 = r0
            r0 = r317
            r1 = r319
            r2 = r318
            r3 = r316
            r4 = r320
            r5 = r321
            r6 = r322
            r7 = r323
            r8 = r301
            r9 = r308
            r10 = r309
            r11 = r310
            r12 = r311
            r13 = r312
            r14 = r314
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r317
            return r0
        Lb1:
            r0 = 0
            return r0
        Lb3:
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.InstantGameInfoProperties.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.facebook.messaging.model.messages.InstantGameInfoProperties");
    }

    public static ImmutableList A01(String str) {
        if (Platform.stringIsNullOrEmpty(str)) {
            return null;
        }
        try {
            return A02(DKC.A1F(str).getJSONArray("scores"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ImmutableList A02(JSONArray jSONArray) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArray.length()) {
                return builder.build();
            }
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("score_str");
                if (Platform.stringIsNullOrEmpty(string)) {
                    string = jSONObject.getString("score");
                }
                String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String optString = jSONObject.optString("rank");
                String optString2 = jSONObject.optString("country_flag_emoji");
                if (!Platform.stringIsNullOrEmpty(string2) && !Platform.stringIsNullOrEmpty(string)) {
                    builder.m11011add((Object) new RNk(string2, string3, string, optString, optString2));
                }
            } catch (JSONException unused) {
            }
            i = i2 + 1;
        }
    }

    public static JSONArray A03(ImmutableList immutableList) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (immutableList == null) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                RNk rNk = (RNk) it.next();
                try {
                    jSONObject = AnonymousClass001.A12();
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, rNk.A01);
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, rNk.A02);
                    jSONObject.put("score_str", rNk.A04);
                    jSONObject.put("rank", rNk.A03);
                    jSONObject.put("country_flag_emoji", rNk.A00);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public String A08() {
        return 1BJ.A00(ActionId.MQTT_CONNECTED);
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public JSONObject A09() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("game_id", this.A0A);
            A12.put("update_type", this.A0B);
            A12.put("game_name", this.A09);
            A12.put("game_icon", this.A08);
            A12.put("score", this.A0C);
            A12.put("leaderboard", A03(this.A01));
            A12.put("leaderboard_json", A03(this.A02));
            A12.put("collapsed_text", this.A03);
            A12.put("expanded_text", this.A07);
            A12.put("custom_image_url", this.A06);
            A12.put("cta_title", this.A04);
            A12.put("cta_url", this.A05);
            A12.put("leaderboard_moment", this.A00.name());
            A12.put("template_id", this.A0D);
        } catch (JSONException unused) {
        }
        return A12;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof InstantGameInfoProperties)) {
            InstantGameInfoProperties instantGameInfoProperties = (InstantGameInfoProperties) obj;
            if (Objects.equal(this.A0A, instantGameInfoProperties.A0A) && Objects.equal(this.A0B, instantGameInfoProperties.A0B) && Objects.equal(this.A09, instantGameInfoProperties.A09) && Objects.equal(this.A08, instantGameInfoProperties.A08) && Objects.equal(this.A0C, instantGameInfoProperties.A0C) && Objects.equal(this.A01, instantGameInfoProperties.A01) && Objects.equal(this.A02, instantGameInfoProperties.A02) && Objects.equal(this.A03, instantGameInfoProperties.A03) && Objects.equal(this.A07, instantGameInfoProperties.A07) && Objects.equal(this.A06, instantGameInfoProperties.A06) && Objects.equal(this.A04, instantGameInfoProperties.A04) && Objects.equal(this.A05, instantGameInfoProperties.A05)) {
                z = 4YV.A1Z(this.A00, instantGameInfoProperties.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0A, this.A0B, this.A09, this.A08, this.A0C, this.A01, this.A02, this.A03, this.A07, this.A06, this.A04, this.A05, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        JSONArray A03 = A03(this.A01);
        String str = null;
        parcel.writeString(A03 != null ? A03.toString() : null);
        JSONArray A032 = A03(this.A02);
        if (A032 != null) {
            str = A032.toString();
        }
        parcel.writeString(str);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A0D);
    }
}
