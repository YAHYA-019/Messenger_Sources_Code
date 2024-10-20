package com.facebook.messaging.communitymessaging.model;

import X.7zU;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.CSW;
import X.DCa;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: MessengerApprovalMode.class */
public final class MessengerApprovalMode implements Parcelable {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ MessengerApprovalMode[] A02;
    public static final MessengerApprovalMode A03;
    public static final MessengerApprovalMode A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        MessengerApprovalMode messengerApprovalMode = new MessengerApprovalMode("OPEN", 0, 0);
        A04 = messengerApprovalMode;
        MessengerApprovalMode messengerApprovalMode2 = new MessengerApprovalMode("APPROVALS", 1, 1);
        A03 = messengerApprovalMode2;
        MessengerApprovalMode[] messengerApprovalModeArr = {messengerApprovalMode, messengerApprovalMode2};
        A02 = messengerApprovalModeArr;
        A01 = C00t.A00(messengerApprovalModeArr);
        CREATOR = CSW.A00(93);
        A00 = C01g.A00(C03i.A03, DCa.A00);
    }

    public MessengerApprovalMode(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessengerApprovalMode valueOf(String str) {
        return (MessengerApprovalMode) Enum.valueOf(MessengerApprovalMode.class, str);
    }

    public static MessengerApprovalMode[] values() {
        return (MessengerApprovalMode[]) A02.clone();
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
