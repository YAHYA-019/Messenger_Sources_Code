package com.facebook.pushlite.model;

import X.0fH;
import X.11T;
import X.1BL;
import X.4YU;
import X.5Yi;
import X.5Yj;
import X.5Yp;
import X.5Ys;
import X.5Yu;
import X.82N;
import X.AnonymousClass001;
import X.C04v;
import X.C3o5;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PushInfraMetaData.class */
public final class PushInfraMetaData extends C04v implements Parcelable {
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new 82N(3);
    public static final 5Yj A0A = 5Yp.A00(5Yi.A00, 5Yj.A03);

    /* loaded from: PushInfraMetaData$Companion.class */
    public final class Companion {
        public static final PushInfraMetaData A00(String str) {
            if (str != null) {
                try {
                    return (PushInfraMetaData) PushInfraMetaData.A0A.A00(str, 5Ys.A00);
                } catch (Exception e) {
                    0fH.A0r("PushInfraMetaData", "Error parsing PIM from json string", e);
                }
            }
            0fH.A0j("PushInfraMetaData", "Returning default PushInfraMetaData");
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }

        public final PushInfraMetaData A01(Intent intent) {
            String stringExtra;
            if (intent.hasExtra("pim")) {
                String stringExtra2 = intent.getStringExtra("pim");
                if (stringExtra2 != null && stringExtra2.length() != 0) {
                    return A00(stringExtra2);
                }
            } else if (intent.hasExtra("data") && (stringExtra = intent.getStringExtra("data")) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("pim")) {
                        5Yj r0 = PushInfraMetaData.A0A;
                        return A00(jSONObject.getString("pim"));
                    }
                } catch (JSONException e) {
                    0fH.A0r("PushInfraMetaData", "Could not extract PIM, error parsing json \"data\" field on intent", e);
                }
            }
            0fH.A0j("PushInfraMetaData", "Could not extract PIM from intent, returning default PushInfraMetaData");
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }

        public final PushInfraMetaData A02(RemoteMessage remoteMessage) {
            if (remoteMessage.A01().containsKey("pim")) {
                return A00((String) remoteMessage.A01().get("pim"));
            }
            0fH.A0j("PushInfraMetaData", "Could not extract PIM from RemoteMessage, returning default PushInfraMetaData");
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }

        public final 5Yu serializer() {
            return 5Ys.A00;
        }
    }

    public PushInfraMetaData() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public PushInfraMetaData(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A06 = str;
        this.A01 = l;
        this.A08 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A09 = str6;
        this.A07 = str7;
        this.A02 = str8;
        this.A00 = l2;
    }

    public /* synthetic */ PushInfraMetaData(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 1) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str;
        }
        if ((i & 2) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l;
        }
        if ((i & 4) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str2;
        }
        if ((i & 8) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str3;
        }
        if ((i & 16) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str4;
        }
        if ((i & 32) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str5;
        }
        if ((i & 64) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str6;
        }
        if ((i & 128) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str7;
        }
        if ((i & 256) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str8;
        }
        if ((i & 512) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PushInfraMetaData)) {
                return false;
            }
            PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
            if (!11T.A0O(this.A06, pushInfraMetaData.A06) || !11T.A0O(this.A01, pushInfraMetaData.A01) || !11T.A0O(this.A08, pushInfraMetaData.A08) || !11T.A0O(this.A03, pushInfraMetaData.A03) || !11T.A0O(this.A04, pushInfraMetaData.A04) || !11T.A0O(this.A05, pushInfraMetaData.A05) || !11T.A0O(this.A09, pushInfraMetaData.A09) || !11T.A0O(this.A07, pushInfraMetaData.A07) || !11T.A0O(this.A02, pushInfraMetaData.A02) || !11T.A0O(this.A00, pushInfraMetaData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((1BL.A05(this.A06) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        C3o5.A0g(parcel, this.A01);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        C3o5.A0g(parcel, this.A00);
    }
}
