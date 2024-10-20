package com.facebook.messaging.model.messages;

import X.0fH;
import X.1BK;
import X.1Du;
import X.1JF;
import X.29S;
import X.2LA;
import X.4YU;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AnonymousClass001;
import X.BXt;
import X.CSY;
import X.D1U;
import X.DJg;
import android.os.Parcel;
import android.util.Base64;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: MessengerCallLogProperties.class */
public final class MessengerCallLogProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(5);
    public final long A00;
    public final D1U A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public MessengerCallLogProperties(D1U d1u, ImmutableList immutableList, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        this.A07 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A09 = z;
        this.A00 = j;
        this.A01 = d1u;
        this.A03 = immutableMap;
        this.A02 = immutableList;
    }

    public static MessengerCallLogProperties A00(D1U d1u, ImmutableList immutableList, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        if (Platform.stringIsNullOrEmpty(str)) {
            return null;
        }
        return new MessengerCallLogProperties(d1u, immutableList, immutableMap, str, str2, str3, str4, str5, j, z);
    }

    public static D1U A01(String str) {
        Object[] objArr;
        String str2;
        if (1JF.A0B(str)) {
            return null;
        }
        try {
            return D1U.A00(BXt.A00(new 29S(), Base64.decode(str, 0)));
        } catch (2LA e) {
            e = e;
            objArr = new Object[0];
            str2 = "failed to deserialize";
            0fH.A0N(MessengerCallLogProperties.class, str2, e, objArr);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            objArr = new Object[0];
            str2 = "failed to decode";
            0fH.A0N(MessengerCallLogProperties.class, str2, e, objArr);
            return null;
        }
    }

    public static ImmutableList A02(String str) {
        if (1JF.A0B(str)) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length()) {
                    break;
                }
                builder.m11011add((Object) jSONArray.getString(i2));
                i = i2 + 1;
            }
        } catch (JSONException unused) {
        }
        return builder.build();
    }

    public static ImmutableMap A03(String str) {
        JSONObject jSONObject;
        JSONArray names;
        if (1JF.A0B(str)) {
            return null;
        }
        ImmutableMap.Builder A0c = 1BK.A0c();
        try {
            jSONObject = new JSONObject(str);
            names = jSONObject.names();
        } catch (JSONException unused) {
        }
        if (names == null) {
            return A0c.build();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= names.length()) {
                break;
            }
            String string = names.getString(i2);
            A0c.put(string, jSONObject.getString(string));
            i = i2 + 1;
        }
        return A0c.build();
    }

    public static String A04(D1U d1u) {
        if (d1u == null) {
            return null;
        }
        try {
            return Base64.encodeToString(AbK.A0s().A00(d1u), 0);
        } catch (2LA e) {
            0fH.A0N(MessengerCallLogProperties.class, "failed to serialize", e, new Object[0]);
            return null;
        }
    }

    public static JSONArray A05(ImmutableList immutableList) {
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

    public static JSONObject A06(ImmutableMap immutableMap) {
        if (immutableMap == null || immutableMap.size() < 1) {
            return null;
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            1Du A0i = 4YU.A0i(immutableMap);
            while (A0i.hasNext()) {
                AbL.A19(A0i, A12);
            }
        } catch (JSONException unused) {
        }
        return A12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(A04(this.A01));
        JSONObject A06 = A06(this.A03);
        parcel.writeString(A06 != null ? A06.toString() : null);
        parcel.writeString(AbH.A1D((String) null, A05(this.A02)));
    }
}
