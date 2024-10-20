package com.facebook.messaging.navigation.home.drawer.model;

import X.11T;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DrawerSnippetInfo.class */
public final class DrawerSnippetInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(51);
    public final Integer A00;
    public final String A01;
    public final boolean A02;

    public DrawerSnippetInfo(Integer num, String str, boolean z) {
        11T.A0F(num, 3);
        this.A01 = str;
        this.A02 = z;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        switch (this.A00.intValue()) {
            case 0:
                str = "NONE";
                break;
            case 1:
                str = "COMMUNITY_INVITE";
                break;
            case 2:
                str = "COMMUNITY_INVITE_REQUEST_PENDING";
                break;
            case 3:
                str = "COMMUNITY_INVITE_ADDED_BUT_UNCONFIRMED";
                break;
            case 4:
                str = "PENDING_MEMBER_REQUESTS";
                break;
            case 5:
                str = "PRESENCE_ACTIVE_NUM";
                break;
            default:
                str = "COMMUNITY_TAKEN_DOWN";
                break;
        }
        parcel.writeString(str);
    }
}
