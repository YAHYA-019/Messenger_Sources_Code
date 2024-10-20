package com.facebook.messaging.communitymessaging.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityMessagingFbGroupType.class */
public final class CommunityMessagingFbGroupType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ CommunityMessagingFbGroupType[] A01;
    public static final CommunityMessagingFbGroupType A02;
    public static final CommunityMessagingFbGroupType A03;
    public static final CommunityMessagingFbGroupType A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        CommunityMessagingFbGroupType communityMessagingFbGroupType = new CommunityMessagingFbGroupType("OPEN", 0, 1);
        A03 = communityMessagingFbGroupType;
        CommunityMessagingFbGroupType communityMessagingFbGroupType2 = new CommunityMessagingFbGroupType("CLOSED", 1, 2);
        A02 = communityMessagingFbGroupType2;
        CommunityMessagingFbGroupType communityMessagingFbGroupType3 = new CommunityMessagingFbGroupType("SECRET", 2, 3);
        A04 = communityMessagingFbGroupType3;
        CommunityMessagingFbGroupType[] communityMessagingFbGroupTypeArr = {communityMessagingFbGroupType, communityMessagingFbGroupType2, communityMessagingFbGroupType3};
        A01 = communityMessagingFbGroupTypeArr;
        A00 = C00t.A00(communityMessagingFbGroupTypeArr);
        CREATOR = CSW.A00(86);
    }

    public CommunityMessagingFbGroupType(String str, int i, int i2) {
        this.value = i2;
    }

    public static CommunityMessagingFbGroupType valueOf(String str) {
        return (CommunityMessagingFbGroupType) Enum.valueOf(CommunityMessagingFbGroupType.class, str);
    }

    public static CommunityMessagingFbGroupType[] values() {
        return (CommunityMessagingFbGroupType[]) A01.clone();
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
