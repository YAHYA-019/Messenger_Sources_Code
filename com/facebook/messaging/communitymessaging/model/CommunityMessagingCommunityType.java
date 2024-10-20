package com.facebook.messaging.communitymessaging.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityMessagingCommunityType.class */
public final class CommunityMessagingCommunityType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ CommunityMessagingCommunityType[] A01;
    public static final CommunityMessagingCommunityType A02;
    public static final CommunityMessagingCommunityType A03;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        CommunityMessagingCommunityType communityMessagingCommunityType = new CommunityMessagingCommunityType("FB_COMMUNITY", 0, 0);
        A02 = communityMessagingCommunityType;
        CommunityMessagingCommunityType communityMessagingCommunityType2 = new CommunityMessagingCommunityType("STANDALONE_COMMUNITY", 1, 1);
        A03 = communityMessagingCommunityType2;
        CommunityMessagingCommunityType[] communityMessagingCommunityTypeArr = {communityMessagingCommunityType, communityMessagingCommunityType2};
        A01 = communityMessagingCommunityTypeArr;
        A00 = C00t.A00(communityMessagingCommunityTypeArr);
        CREATOR = CSW.A00(85);
    }

    public CommunityMessagingCommunityType(String str, int i, int i2) {
        this.value = i2;
    }

    public static CommunityMessagingCommunityType valueOf(String str) {
        return (CommunityMessagingCommunityType) Enum.valueOf(CommunityMessagingCommunityType.class, str);
    }

    public static CommunityMessagingCommunityType[] values() {
        return (CommunityMessagingCommunityType[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zU.A11(parcel, this);
    }
}
