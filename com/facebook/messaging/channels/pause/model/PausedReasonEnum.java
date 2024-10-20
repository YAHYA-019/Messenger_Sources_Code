package com.facebook.messaging.channels.pause.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PausedReasonEnum.class */
public final class PausedReasonEnum implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PausedReasonEnum[] A01;
    public static final PausedReasonEnum A02;
    public static final PausedReasonEnum A03;
    public static final PausedReasonEnum A04;
    public static final PausedReasonEnum A05;
    public static final PausedReasonEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String value;

    static {
        PausedReasonEnum pausedReasonEnum = new PausedReasonEnum("CATCH_UP_ON_THE_CHAT", 0, "catch_up_on_the_chat");
        A02 = pausedReasonEnum;
        PausedReasonEnum pausedReasonEnum2 = new PausedReasonEnum("MODERATE_THE_CHAT", 1, "moderate_the_chat");
        A03 = pausedReasonEnum2;
        PausedReasonEnum pausedReasonEnum3 = new PausedReasonEnum("TAKE_A_BREAK", 2, "take_a_break");
        A05 = pausedReasonEnum3;
        PausedReasonEnum pausedReasonEnum4 = new PausedReasonEnum("UPDATE_CHAT_INTO", 3, "update_chat_info");
        A06 = pausedReasonEnum4;
        PausedReasonEnum pausedReasonEnum5 = new PausedReasonEnum("NONE", 4, "none");
        A04 = pausedReasonEnum5;
        PausedReasonEnum[] pausedReasonEnumArr = {pausedReasonEnum, pausedReasonEnum2, pausedReasonEnum3, pausedReasonEnum4, pausedReasonEnum5};
        A01 = pausedReasonEnumArr;
        A00 = C00t.A00(pausedReasonEnumArr);
        CREATOR = new CSW(49);
    }

    public PausedReasonEnum(String str, int i, String str2) {
        this.value = str2;
    }

    public static PausedReasonEnum valueOf(String str) {
        return (PausedReasonEnum) Enum.valueOf(PausedReasonEnum.class, str);
    }

    public static PausedReasonEnum[] values() {
        return (PausedReasonEnum[]) A01.clone();
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
