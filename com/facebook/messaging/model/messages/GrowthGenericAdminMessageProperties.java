package com.facebook.messaging.model.messages;

import X.1Du;
import X.4YT;
import X.AnonymousClass001;
import X.DJg;
import X.LGs;
import android.os.Parcel;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GrowthGenericAdminMessageProperties.class */
public final class GrowthGenericAdminMessageProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new LGs(1);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public GrowthGenericAdminMessageProperties(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A02 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A01 = immutableList;
        this.A03 = str6;
        this.A04 = str7;
        this.A09 = z;
        this.A00 = immutableList2;
    }

    public static ImmutableList A00(String str) {
        if (Platform.stringIsNullOrEmpty(str)) {
            return null;
        }
        try {
            return A01(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ImmutableList A01(JSONArray jSONArray) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArray.length()) {
                return builder.build();
            }
            try {
                String string = jSONArray.getString(i2);
                if (string != null) {
                    builder.m11011add((Object) string);
                }
            } catch (JSONException unused) {
            }
            i = i2 + 1;
        }
    }

    public static JSONArray A02(ImmutableList immutableList) {
        JSONArray jSONArray;
        if (immutableList == null) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray;
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public String A08() {
        return 4YT.A00(96);
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public JSONObject A09() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            JSONArray A02 = A02(this.A01);
            A12.putOpt("bump_type", this.A02).putOpt("title", this.A08).putOpt("description", this.A05).putOpt("icon_uri", this.A06).putOpt("image_uri", this.A07).putOpt("facepile_ids", A02).putOpt("cta_title", this.A03).putOpt("cta_uri", this.A04).putOpt("is_two_way", Boolean.valueOf(this.A09)).putOpt("conversation_starter", A02(this.A00));
        } catch (JSONException unused) {
        }
        return A12;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A08, this.A05, this.A06, this.A07, this.A01, this.A03, this.A04, Boolean.valueOf(this.A09), this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        JSONArray A02 = A02(this.A01);
        String str = null;
        parcel.writeString(A02 != null ? A02.toString() : null);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        JSONArray A022 = A02(this.A00);
        if (A022 != null) {
            str = A022.toString();
        }
        parcel.writeString(str);
    }
}
