package com.facebook.messaging.communitymessaging.model;

import X.02J;
import X.11T;
import X.1BL;
import X.82M;
import X.C00t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityNewBadgeStatus.class */
public final class CommunityNewBadgeStatus implements Parcelable {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ CommunityNewBadgeStatus[] A02;
    public static final CommunityNewBadgeStatus A03;
    public static final CommunityNewBadgeStatus A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        CommunityNewBadgeStatus communityNewBadgeStatus = new CommunityNewBadgeStatus("NO_BADGE", 0, 0);
        A03 = communityNewBadgeStatus;
        CommunityNewBadgeStatus communityNewBadgeStatus2 = new CommunityNewBadgeStatus("SHOW_BADGE", 1, 1);
        A04 = communityNewBadgeStatus2;
        CommunityNewBadgeStatus[] communityNewBadgeStatusArr = {communityNewBadgeStatus, communityNewBadgeStatus2, new CommunityNewBadgeStatus("BADGE_DISMISSED", 2, 2)};
        A02 = communityNewBadgeStatusArr;
        A01 = C00t.A00(communityNewBadgeStatusArr);
        CREATOR = new 82M(23);
        CommunityNewBadgeStatus[] values = values();
        int A002 = 02J.A00(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002 < 16 ? 16 : A002);
        for (CommunityNewBadgeStatus communityNewBadgeStatus3 : values) {
            linkedHashMap.put(Integer.valueOf(communityNewBadgeStatus3.value), communityNewBadgeStatus3);
        }
        A00 = linkedHashMap;
    }

    public CommunityNewBadgeStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static CommunityNewBadgeStatus valueOf(String str) {
        return (CommunityNewBadgeStatus) Enum.valueOf(CommunityNewBadgeStatus.class, str);
    }

    public static CommunityNewBadgeStatus[] values() {
        return (CommunityNewBadgeStatus[]) A02.clone();
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
