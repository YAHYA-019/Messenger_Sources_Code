package com.facebook.messaging.communitymessaging.channelcreation.channelcreationmodel;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ChannelCreationRequestStatus.class */
public final class ChannelCreationRequestStatus implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ChannelCreationRequestStatus[] A01;
    public static final ChannelCreationRequestStatus A02;
    public static final ChannelCreationRequestStatus A03;
    public static final ChannelCreationRequestStatus A04;
    public static final ChannelCreationRequestStatus A05;
    public static final Parcelable.Creator CREATOR;

    static {
        ChannelCreationRequestStatus channelCreationRequestStatus = new ChannelCreationRequestStatus("NOT_STARTED", 0);
        A04 = channelCreationRequestStatus;
        ChannelCreationRequestStatus channelCreationRequestStatus2 = new ChannelCreationRequestStatus("IN_PROGRESS", 1);
        A03 = channelCreationRequestStatus2;
        ChannelCreationRequestStatus channelCreationRequestStatus3 = new ChannelCreationRequestStatus("SUCCESSFUL", 2);
        A05 = channelCreationRequestStatus3;
        ChannelCreationRequestStatus channelCreationRequestStatus4 = new ChannelCreationRequestStatus("FAILURE", 3);
        A02 = channelCreationRequestStatus4;
        ChannelCreationRequestStatus[] channelCreationRequestStatusArr = {channelCreationRequestStatus, channelCreationRequestStatus2, channelCreationRequestStatus3, channelCreationRequestStatus4};
        A01 = channelCreationRequestStatusArr;
        A00 = C00t.A00(channelCreationRequestStatusArr);
        CREATOR = CSW.A00(57);
    }

    public ChannelCreationRequestStatus(String str, int i) {
    }

    public static ChannelCreationRequestStatus valueOf(String str) {
        return (ChannelCreationRequestStatus) Enum.valueOf(ChannelCreationRequestStatus.class, str);
    }

    public static ChannelCreationRequestStatus[] values() {
        return (ChannelCreationRequestStatus[]) A01.clone();
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
