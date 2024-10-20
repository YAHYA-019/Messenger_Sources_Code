package com.facebook.messaging.communitymessaging.directadd.disclosurebottomsheet.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DisclosureBottomSheetParentSurface.class */
public final class DisclosureBottomSheetParentSurface implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ DisclosureBottomSheetParentSurface[] A01;
    public static final DisclosureBottomSheetParentSurface A02;
    public static final DisclosureBottomSheetParentSurface A03;
    public static final Parcelable.Creator CREATOR;

    static {
        DisclosureBottomSheetParentSurface disclosureBottomSheetParentSurface = new DisclosureBottomSheetParentSurface("COMMUNITY", 0);
        A03 = disclosureBottomSheetParentSurface;
        DisclosureBottomSheetParentSurface disclosureBottomSheetParentSurface2 = new DisclosureBottomSheetParentSurface("CHANNEL", 1);
        A02 = disclosureBottomSheetParentSurface2;
        DisclosureBottomSheetParentSurface[] disclosureBottomSheetParentSurfaceArr = {disclosureBottomSheetParentSurface, disclosureBottomSheetParentSurface2};
        A01 = disclosureBottomSheetParentSurfaceArr;
        A00 = C00t.A00(disclosureBottomSheetParentSurfaceArr);
        CREATOR = new CSW(69);
    }

    public DisclosureBottomSheetParentSurface(String str, int i) {
    }

    public static DisclosureBottomSheetParentSurface valueOf(String str) {
        return (DisclosureBottomSheetParentSurface) Enum.valueOf(DisclosureBottomSheetParentSurface.class, str);
    }

    public static DisclosureBottomSheetParentSurface[] values() {
        return (DisclosureBottomSheetParentSurface[]) A01.clone();
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
