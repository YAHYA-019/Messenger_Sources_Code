package com.facebook.messaging.communitymessaging.model;

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
/* loaded from: MemberRequestApprovalSetting.class */
public final class MemberRequestApprovalSetting implements Parcelable {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ MemberRequestApprovalSetting[] A02;
    public static final MemberRequestApprovalSetting A03;
    public static final MemberRequestApprovalSetting A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        MemberRequestApprovalSetting memberRequestApprovalSetting = new MemberRequestApprovalSetting("MEMBERS_CAN_APPROVE", 0, 0);
        A03 = memberRequestApprovalSetting;
        MemberRequestApprovalSetting memberRequestApprovalSetting2 = new MemberRequestApprovalSetting("ONLY_ADMODS_CAN_APPROVE", 1, 1);
        A04 = memberRequestApprovalSetting2;
        MemberRequestApprovalSetting[] memberRequestApprovalSettingArr = {memberRequestApprovalSetting, memberRequestApprovalSetting2};
        A02 = memberRequestApprovalSettingArr;
        A01 = C00t.A00(memberRequestApprovalSettingArr);
        CREATOR = CSW.A00(92);
        MemberRequestApprovalSetting[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (MemberRequestApprovalSetting memberRequestApprovalSetting3 : values) {
            linkedHashMap.put(Integer.valueOf(memberRequestApprovalSetting3.value), memberRequestApprovalSetting3);
        }
        A00 = linkedHashMap;
    }

    public MemberRequestApprovalSetting(String str, int i, int i2) {
        this.value = i2;
    }

    public static MemberRequestApprovalSetting valueOf(String str) {
        return (MemberRequestApprovalSetting) Enum.valueOf(MemberRequestApprovalSetting.class, str);
    }

    public static MemberRequestApprovalSetting[] values() {
        return (MemberRequestApprovalSetting[]) A02.clone();
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
