package com.facebook.messaging.communitymessaging.memberlist.extradata;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: RequestToJoinVersion.class */
public final class RequestToJoinVersion implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ RequestToJoinVersion[] A01;
    public static final RequestToJoinVersion A02;
    public static final RequestToJoinVersion A03;
    public static final RequestToJoinVersion A04;
    public static final Parcelable.Creator CREATOR;

    static {
        RequestToJoinVersion requestToJoinVersion = new RequestToJoinVersion("THREAD_SETTINGS", 0);
        A04 = requestToJoinVersion;
        RequestToJoinVersion requestToJoinVersion2 = new RequestToJoinVersion("ADMIN_HOME_CHAT_LIST", 1);
        A02 = requestToJoinVersion2;
        RequestToJoinVersion requestToJoinVersion3 = new RequestToJoinVersion("ADMIN_HOME_SINGLE_CHAT", 2);
        A03 = requestToJoinVersion3;
        RequestToJoinVersion[] requestToJoinVersionArr = {requestToJoinVersion, requestToJoinVersion2, requestToJoinVersion3};
        A01 = requestToJoinVersionArr;
        A00 = C00t.A00(requestToJoinVersionArr);
        CREATOR = CSW.A00(81);
    }

    public RequestToJoinVersion(String str, int i) {
    }

    public static RequestToJoinVersion valueOf(String str) {
        return (RequestToJoinVersion) Enum.valueOf(RequestToJoinVersion.class, str);
    }

    public static RequestToJoinVersion[] values() {
        return (RequestToJoinVersion[]) A01.clone();
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
