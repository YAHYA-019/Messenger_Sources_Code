package com.facebook.messaging.composer.quickreply.logging.type;

import X.7zL;
import X.7zU;
import X.C00t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: QuickReplyLoggingType.class */
public final class QuickReplyLoggingType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ QuickReplyLoggingType[] A01;
    public static final QuickReplyLoggingType A02;
    public static final QuickReplyLoggingType A03;
    public static final QuickReplyLoggingType A04;
    public static final QuickReplyLoggingType A05;
    public static final QuickReplyLoggingType A06;
    public static final QuickReplyLoggingType A07;
    public static final Parcelable.Creator CREATOR;

    static {
        QuickReplyLoggingType quickReplyLoggingType = new QuickReplyLoggingType("DEFAULT_QUICK_REPLY", 0);
        A04 = quickReplyLoggingType;
        QuickReplyLoggingType quickReplyLoggingType2 = new QuickReplyLoggingType("ICE_BREAKER", 1);
        A06 = quickReplyLoggingType2;
        QuickReplyLoggingType quickReplyLoggingType3 = new QuickReplyLoggingType("CM_HELPER_BOT", 2);
        A03 = quickReplyLoggingType3;
        QuickReplyLoggingType quickReplyLoggingType4 = new QuickReplyLoggingType("CHAT_ENTITY_QUICK_REPLY", 3);
        A02 = quickReplyLoggingType4;
        QuickReplyLoggingType quickReplyLoggingType5 = new QuickReplyLoggingType("EMOJI", 4);
        A05 = quickReplyLoggingType5;
        QuickReplyLoggingType quickReplyLoggingType6 = new QuickReplyLoggingType("SMART_REPLY", 5);
        A07 = quickReplyLoggingType6;
        QuickReplyLoggingType[] quickReplyLoggingTypeArr = {quickReplyLoggingType, quickReplyLoggingType2, quickReplyLoggingType3, quickReplyLoggingType4, quickReplyLoggingType5, quickReplyLoggingType6};
        A01 = quickReplyLoggingTypeArr;
        A00 = C00t.A00(quickReplyLoggingTypeArr);
        CREATOR = 7zL.A0v(21);
    }

    public QuickReplyLoggingType(String str, int i) {
    }

    public static QuickReplyLoggingType valueOf(String str) {
        return (QuickReplyLoggingType) Enum.valueOf(QuickReplyLoggingType.class, str);
    }

    public static QuickReplyLoggingType[] values() {
        return (QuickReplyLoggingType[]) A01.clone();
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
