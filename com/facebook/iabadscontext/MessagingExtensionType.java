package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.C00t;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: MessagingExtensionType.class */
public final class MessagingExtensionType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MessagingExtensionType[] A01;
    public static final MessagingExtensionType A02;
    public static final MessagingExtensionType A03;
    public static final Parcelable.Creator CREATOR;

    static {
        MessagingExtensionType messagingExtensionType = new MessagingExtensionType("WHATSAPP", 0);
        A03 = messagingExtensionType;
        MessagingExtensionType messagingExtensionType2 = new MessagingExtensionType("MESSENGER", 1);
        A02 = messagingExtensionType2;
        MessagingExtensionType[] messagingExtensionTypeArr = {messagingExtensionType, messagingExtensionType2, new MessagingExtensionType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 2)};
        A01 = messagingExtensionTypeArr;
        A00 = C00t.A00(messagingExtensionTypeArr);
        CREATOR = FKf.A01(8);
    }

    public MessagingExtensionType(String str, int i) {
    }

    public static MessagingExtensionType valueOf(String str) {
        return (MessagingExtensionType) Enum.valueOf(MessagingExtensionType.class, str);
    }

    public static MessagingExtensionType[] values() {
        return (MessagingExtensionType[]) A01.clone();
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
