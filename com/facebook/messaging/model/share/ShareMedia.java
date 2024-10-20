package com.facebook.messaging.model.share;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zN;
import X.C00t;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.MoreObjects;
import kotlin.enums.EnumEntries;

/* loaded from: ShareMedia.class */
public final class ShareMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(56);
    public final Type A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: ShareMedia$Type.class */
    public final class Type implements Parcelable {
        public static final /* synthetic */ EnumEntries A00;
        public static final /* synthetic */ Type[] A01;
        public static final Type A02;
        public static final Type A03;
        public static final Type A04;
        public static final Type A05;
        public static final Parcelable.Creator CREATOR;

        static {
            Type type = new Type("PHOTO", 0);
            A03 = type;
            Type type2 = new Type("VIDEO", 1);
            A05 = type2;
            Type type3 = new Type("LINK", 2);
            A02 = type3;
            Type type4 = new Type(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3);
            A04 = type4;
            Type[] typeArr = {type, type2, type3, type4};
            A01 = typeArr;
            A00 = C00t.A00(typeArr);
            CREATOR = CSV.A00(57);
        }

        public Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) A01.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            7zN.A0z(parcel, this);
        }
    }

    public ShareMedia(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (Type) 1BL.A0C(parcel, Type.class);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public ShareMedia(Type type, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = type;
        this.A03 = str3;
        this.A02 = str2;
        this.A04 = null;
    }

    public ShareMedia(Type type, String str, String str2, String str3, String str4) {
        if (type == null) {
            throw 1BK.A0h();
        }
        this.A01 = str;
        this.A00 = type;
        this.A03 = str3;
        this.A02 = str2;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(ShareMedia.class);
        stringHelper.add("href", this.A01);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, String.valueOf(this.A00));
        stringHelper.add("src", this.A03);
        stringHelper.add("playableSrc", this.A02);
        stringHelper.add("watchEligibleSrc", this.A04);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
