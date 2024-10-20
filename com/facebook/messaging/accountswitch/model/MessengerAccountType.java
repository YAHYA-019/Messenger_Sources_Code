package com.facebook.messaging.accountswitch.model;

import X.11T;
import X.82M;
import X.C00t;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: MessengerAccountType.class */
public final class MessengerAccountType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MessengerAccountType[] A01;
    public static final MessengerAccountType A02;
    public static final MessengerAccountType A03;
    public static final MessengerAccountType A04;
    public static final MessengerAccountType A05;
    public static final MessengerAccountType A06;
    public static final MessengerAccountType A07;
    public static final MessengerAccountType A08;
    public static final MessengerAccountType A09;
    public static final MessengerAccountType A0A;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        MessengerAccountType messengerAccountType = new MessengerAccountType(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, 0);
        A09 = messengerAccountType;
        MessengerAccountType messengerAccountType2 = new MessengerAccountType("FB_USER", 1, 1);
        A03 = messengerAccountType2;
        MessengerAccountType messengerAccountType3 = new MessengerAccountType("PAGE", 2, 2);
        A07 = messengerAccountType3;
        MessengerAccountType messengerAccountType4 = new MessengerAccountType("ADDITIONAL_PROFILE_PLUS", 3, 3);
        A02 = messengerAccountType4;
        MessengerAccountType messengerAccountType5 = new MessengerAccountType("SINGLE_OWNER_ADDITIONAL_PROFILE", 4, 4);
        A08 = messengerAccountType5;
        MessengerAccountType messengerAccountType6 = new MessengerAccountType("IG_USER", 5, 5);
        A05 = messengerAccountType6;
        MessengerAccountType messengerAccountType7 = new MessengerAccountType("WORKPLACE", 6, 6);
        A0A = messengerAccountType7;
        MessengerAccountType messengerAccountType8 = new MessengerAccountType("HORIZON", 7, 7);
        A04 = messengerAccountType8;
        MessengerAccountType messengerAccountType9 = new MessengerAccountType("MSPLIT", 8, 8);
        A06 = messengerAccountType9;
        MessengerAccountType[] messengerAccountTypeArr = {messengerAccountType, messengerAccountType2, messengerAccountType3, messengerAccountType4, messengerAccountType5, messengerAccountType6, messengerAccountType7, messengerAccountType8, messengerAccountType9};
        A01 = messengerAccountTypeArr;
        A00 = C00t.A00(messengerAccountTypeArr);
        CREATOR = new 82M(8);
    }

    public MessengerAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessengerAccountType valueOf(String str) {
        return (MessengerAccountType) Enum.valueOf(MessengerAccountType.class, str);
    }

    public static MessengerAccountType[] values() {
        return (MessengerAccountType[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(name());
    }
}
