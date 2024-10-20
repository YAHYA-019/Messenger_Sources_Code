package com.facebook.messaging.communitymessaging.model;

import X.1BK;
import X.7zU;
import X.AbL;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityCreationStatus.class */
public final class CommunityCreationStatus implements Parcelable {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ CommunityCreationStatus[] A02;
    public static final CommunityCreationStatus A03;
    public static final CommunityCreationStatus A04;
    public static final CommunityCreationStatus A05;
    public static final CommunityCreationStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final int status;

    static {
        CommunityCreationStatus communityCreationStatus = new CommunityCreationStatus("PENDING", 0, 0);
        A05 = communityCreationStatus;
        CommunityCreationStatus communityCreationStatus2 = new CommunityCreationStatus("SUCCESS", 1, 1);
        A06 = communityCreationStatus2;
        CommunityCreationStatus communityCreationStatus3 = new CommunityCreationStatus("FAILURE", 2, 2);
        A03 = communityCreationStatus3;
        CommunityCreationStatus communityCreationStatus4 = new CommunityCreationStatus("NOT_STARTED", 3, 3);
        A04 = communityCreationStatus4;
        CommunityCreationStatus[] communityCreationStatusArr = {communityCreationStatus, communityCreationStatus2, communityCreationStatus3, communityCreationStatus4};
        A02 = communityCreationStatusArr;
        A01 = C00t.A00(communityCreationStatusArr);
        CREATOR = CSW.A00(83);
        CommunityCreationStatus[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (CommunityCreationStatus communityCreationStatus5 : values) {
            1BK.A1O(communityCreationStatus5, linkedHashMap, communityCreationStatus5.status);
        }
        A00 = linkedHashMap;
    }

    public CommunityCreationStatus(String str, int i, int i2) {
        this.status = i2;
    }

    public static CommunityCreationStatus valueOf(String str) {
        return (CommunityCreationStatus) Enum.valueOf(CommunityCreationStatus.class, str);
    }

    public static CommunityCreationStatus[] values() {
        return (CommunityCreationStatus[]) A02.clone();
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
