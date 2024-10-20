package com.facebook.messaging.navigation.home.drawer.fragment;

import X.11T;
import X.C00t;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: HomeDrawerSwipeStateController$DrawerSwipeAction.class */
public final class HomeDrawerSwipeStateController$DrawerSwipeAction implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ HomeDrawerSwipeStateController$DrawerSwipeAction[] A01;
    public static final HomeDrawerSwipeStateController$DrawerSwipeAction A02;
    public static final HomeDrawerSwipeStateController$DrawerSwipeAction A03;
    public static final Parcelable.Creator CREATOR;

    static {
        HomeDrawerSwipeStateController$DrawerSwipeAction homeDrawerSwipeStateController$DrawerSwipeAction = new HomeDrawerSwipeStateController$DrawerSwipeAction("OPEN", 0);
        A03 = homeDrawerSwipeStateController$DrawerSwipeAction;
        HomeDrawerSwipeStateController$DrawerSwipeAction homeDrawerSwipeStateController$DrawerSwipeAction2 = new HomeDrawerSwipeStateController$DrawerSwipeAction("CLOSE", 1);
        A02 = homeDrawerSwipeStateController$DrawerSwipeAction2;
        HomeDrawerSwipeStateController$DrawerSwipeAction[] homeDrawerSwipeStateController$DrawerSwipeActionArr = {homeDrawerSwipeStateController$DrawerSwipeAction, homeDrawerSwipeStateController$DrawerSwipeAction2};
        A01 = homeDrawerSwipeStateController$DrawerSwipeActionArr;
        A00 = C00t.A00(homeDrawerSwipeStateController$DrawerSwipeActionArr);
        CREATOR = new C4Ny(30);
    }

    public HomeDrawerSwipeStateController$DrawerSwipeAction(String str, int i) {
    }

    public static HomeDrawerSwipeStateController$DrawerSwipeAction valueOf(String str) {
        return (HomeDrawerSwipeStateController$DrawerSwipeAction) Enum.valueOf(HomeDrawerSwipeStateController$DrawerSwipeAction.class, str);
    }

    public static HomeDrawerSwipeStateController$DrawerSwipeAction[] values() {
        return (HomeDrawerSwipeStateController$DrawerSwipeAction[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(name());
    }
}
