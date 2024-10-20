package com.facebook.messaging.accountswitch.model;

import X.11T;
import X.1BL;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import org.json.JSONObject;

/* loaded from: MessengerAccountInfo.class */
public final class MessengerAccountInfo implements Parcelable {
    public static final MessengerAccountType A0F = MessengerAccountType.A03;
    public static final Parcelable.Creator CREATOR = new 82M(7);
    public int A00;
    public final long A01;
    public final long A02;
    public final MessengerAccountType A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public MessengerAccountInfo() {
        this.A0A = null;
        this.A05 = null;
        this.A07 = null;
        this.A01 = -1;
        this.A09 = null;
        this.A02 = 0L;
        this.A03 = A0F;
        this.A0D = false;
        this.A0E = false;
        this.A0B = false;
        this.A0C = false;
        this.A06 = null;
        this.A00 = 0;
        this.A04 = null;
        this.A08 = null;
    }

    public MessengerAccountInfo(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A02 = parcel.readLong();
        String readString = parcel.readString();
        readString = readString == null ? "FB_USER" : readString;
        11T.A0D(readString);
        this.A03 = MessengerAccountType.valueOf(readString);
        boolean z = true;
        this.A0D = parcel.readInt() != 0;
        this.A0E = parcel.readInt() != 0;
        this.A0B = parcel.readInt() != 0;
        this.A0C = parcel.readInt() == 0 ? false : z;
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A08 = parcel.readString();
    }

    public MessengerAccountInfo(MessengerAccountType messengerAccountType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0A = str7;
        this.A05 = str2;
        this.A07 = str4;
        this.A01 = j;
        this.A09 = str6;
        this.A02 = j2;
        this.A03 = messengerAccountType;
        this.A0D = z3;
        this.A0E = z4;
        this.A0B = z;
        this.A0C = z2;
        this.A06 = str3;
        this.A00 = i;
        this.A04 = str;
        this.A08 = str5;
    }

    public final String A00() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ErrorReportingConstants.USER_ID_KEY, this.A0A);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A05);
        jSONObject.put("profile_username", this.A07);
        jSONObject.put("last_logout_timestamp", this.A01);
        jSONObject.put("unseen_count_access_token", this.A09);
        jSONObject.put("last_unseen_timestamp", this.A02);
        jSONObject.put("messenger_account_type", this.A03.name());
        jSONObject.put("is_page_account", this.A0D);
        jSONObject.put("is_soap_account", this.A0E);
        jSONObject.put("is_horizon_account", this.A0B);
        jSONObject.put("is_instagram_account", this.A0C);
        jSONObject.put("profile_picture_override", this.A06);
        jSONObject.put("page_badge_count", this.A00);
        jSONObject.put("access_token", this.A04);
        jSONObject.put("session_cookies", this.A08);
        String obj = jSONObject.toString();
        11T.A0A(obj);
        return obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            MessengerAccountInfo messengerAccountInfo = (MessengerAccountInfo) obj;
            if (!11T.A0O(this.A0A, messengerAccountInfo.A0A) || !11T.A0O(this.A05, messengerAccountInfo.A05) || !11T.A0O(this.A07, messengerAccountInfo.A07) || !11T.A0O(this.A09, messengerAccountInfo.A09) || this.A01 != messengerAccountInfo.A01 || this.A02 != messengerAccountInfo.A02 || this.A03 != messengerAccountInfo.A03 || this.A0D != messengerAccountInfo.A0D || this.A0E != messengerAccountInfo.A0E || this.A0B != messengerAccountInfo.A0B || this.A0C != messengerAccountInfo.A0C || !11T.A0O(this.A06, messengerAccountInfo.A06) || this.A00 != messengerAccountInfo.A00 || !11T.A0O(this.A04, messengerAccountInfo.A04) || !11T.A0O(this.A08, messengerAccountInfo.A08)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A09);
        parcel.writeLong(this.A02);
        1BL.A12(parcel, this.A03);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
    }
}
