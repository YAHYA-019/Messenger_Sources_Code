package com.facebook.messaging.contactstab.intf;

import X.11T;
import X.7zL;
import X.7zN;
import X.C00t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: FriendsSubTabTag.class */
public final class FriendsSubTabTag implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ FriendsSubTabTag[] A01;
    public static final FriendsSubTabTag A02;
    public static final FriendsSubTabTag A03;
    public static final FriendsSubTabTag A04;
    public static final FriendsSubTabTag A05;
    public static final FriendsSubTabTag A06;
    public static final Parcelable.Creator CREATOR;
    public int nameResId;
    public int viewId;

    static {
        FriendsSubTabTag friendsSubTabTag = new FriendsSubTabTag("STORIES", 0, 2131957069, 2131364250);
        A06 = friendsSubTabTag;
        FriendsSubTabTag friendsSubTabTag2 = new FriendsSubTabTag("ACTIVE", 1, 2131957063, 2131364246);
        A02 = friendsSubTabTag2;
        FriendsSubTabTag friendsSubTabTag3 = new FriendsSubTabTag("CONTACTS", 2, 2131957065, 2131364247);
        A03 = friendsSubTabTag3;
        FriendsSubTabTag friendsSubTabTag4 = new FriendsSubTabTag("HIGHLIGHTS", 3, 2131957640, 2131364488);
        A04 = friendsSubTabTag4;
        FriendsSubTabTag friendsSubTabTag5 = new FriendsSubTabTag("SEE_ALL_ACTIVE", 4, 2131965603, 2131367243);
        A05 = friendsSubTabTag5;
        FriendsSubTabTag[] friendsSubTabTagArr = {friendsSubTabTag, friendsSubTabTag2, friendsSubTabTag3, friendsSubTabTag4, friendsSubTabTag5};
        A01 = friendsSubTabTagArr;
        A00 = C00t.A00(friendsSubTabTagArr);
        CREATOR = 7zL.A0v(23);
    }

    public FriendsSubTabTag(String str, int i, int i2, int i3) {
        this.nameResId = i2;
        this.viewId = i3;
    }

    public static FriendsSubTabTag valueOf(String str) {
        return (FriendsSubTabTag) Enum.valueOf(FriendsSubTabTag.class, str);
    }

    public static FriendsSubTabTag[] values() {
        return (FriendsSubTabTag[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        7zN.A0z(parcel, this);
        parcel.writeInt(this.nameResId);
        parcel.writeInt(this.viewId);
    }
}
