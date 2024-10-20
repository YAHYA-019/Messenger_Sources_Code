package com.facebook.messaging.model.messages;

import X.0fH;
import X.1BJ;
import X.AbE;
import X.AnonymousClass001;
import X.DJg;
import X.LGs;
import android.os.Parcel;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ConfirmFriendRequestInfoProperties.class */
public final class ConfirmFriendRequestInfoProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new LGs(0);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public ConfirmFriendRequestInfoProperties() {
    }

    public ConfirmFriendRequestInfoProperties(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        String readString = parcel.readString();
        this.A02 = readString != null ? GraphQLStringDefUtil.A00().ATw(1BJ.A00(278), readString) : "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        this.A09 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public ConfirmFriendRequestInfoProperties(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A09 = str10;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A05 = str6;
        this.A04 = str5;
        this.A03 = str4;
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public String A08() {
        return 1BJ.A00(661);
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public JSONObject A09() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("friend_request_recipient", this.A00);
            A12.put("friend_request_sender", this.A01);
            String str = this.A02;
            if (str == null) {
                str = null;
            }
            A12.put("friend_request_subtype", str);
            A12.put("subtype_title", this.A09);
            A12.put("subtype_cta_title", this.A06);
            A12.put("subtype_cta_url", this.A07);
            A12.put("subtype_image_url", this.A08);
            A12.put("icebreaker_type", this.A05);
            A12.put("icebreaker_title", this.A04);
            A12.put("icebreaker_subtitle", this.A03);
            return A12;
        } catch (JSONException e) {
            0fH.A0p("ConfirmFriendRequestInfoProperties", AbE.A00(284), e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ConfirmFriendRequestInfoProperties confirmFriendRequestInfoProperties = (ConfirmFriendRequestInfoProperties) obj;
            if (!Objects.equal(this.A00, confirmFriendRequestInfoProperties.A00) || !Objects.equal(this.A01, confirmFriendRequestInfoProperties.A01) || !Objects.equal(this.A02, confirmFriendRequestInfoProperties.A02) || !Objects.equal(this.A09, confirmFriendRequestInfoProperties.A09) || !Objects.equal(this.A06, confirmFriendRequestInfoProperties.A06) || !Objects.equal(this.A07, confirmFriendRequestInfoProperties.A07) || !Objects.equal(this.A08, confirmFriendRequestInfoProperties.A08) || !Objects.equal(this.A05, confirmFriendRequestInfoProperties.A05) || !Objects.equal(this.A04, confirmFriendRequestInfoProperties.A04) || !Objects.equal(this.A03, confirmFriendRequestInfoProperties.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00, this.A01, this.A02, this.A09, this.A06, this.A07, this.A08, this.A05, this.A04, this.A03});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        String str = this.A02;
        if (str == null) {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
