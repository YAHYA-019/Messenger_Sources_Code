package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.1BL;
import X.C00t;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: MessengerJoinRequestApprovalSetting.class */
public final class MessengerJoinRequestApprovalSetting implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MessengerJoinRequestApprovalSetting[] A01;
    public static final MessengerJoinRequestApprovalSetting A02;
    public static final MessengerJoinRequestApprovalSetting A03;
    public static final MessengerJoinRequestApprovalSetting A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting = new MessengerJoinRequestApprovalSetting("UNSET", 0, -1);
        A04 = messengerJoinRequestApprovalSetting;
        MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting2 = new MessengerJoinRequestApprovalSetting("ADMIN_AND_MODERATORS_ONLY", 1, 0);
        A02 = messengerJoinRequestApprovalSetting2;
        MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting3 = new MessengerJoinRequestApprovalSetting("ALL_MEMBERS", 2, 1);
        A03 = messengerJoinRequestApprovalSetting3;
        MessengerJoinRequestApprovalSetting[] messengerJoinRequestApprovalSettingArr = {messengerJoinRequestApprovalSetting, messengerJoinRequestApprovalSetting2, messengerJoinRequestApprovalSetting3};
        A01 = messengerJoinRequestApprovalSettingArr;
        A00 = C00t.A00(messengerJoinRequestApprovalSettingArr);
        CREATOR = new C2xc(16);
    }

    public MessengerJoinRequestApprovalSetting(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessengerJoinRequestApprovalSetting valueOf(String str) {
        return (MessengerJoinRequestApprovalSetting) Enum.valueOf(MessengerJoinRequestApprovalSetting.class, str);
    }

    public static MessengerJoinRequestApprovalSetting[] values() {
        return (MessengerJoinRequestApprovalSetting[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this);
    }
}
