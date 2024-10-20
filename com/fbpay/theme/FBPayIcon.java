package com.fbpay.theme;

import X.11T;
import X.1BL;
import X.C00t;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: FBPayIcon.class */
public final class FBPayIcon implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ FBPayIcon[] A01;
    public static final FBPayIcon A02;
    public static final FBPayIcon A03;
    public static final Parcelable.Creator CREATOR;
    public final int iconColor;
    public final int iconType;

    static {
        FBPayIcon fBPayIcon = new FBPayIcon("CAMERA_SECONDARY", 0, 8, 14);
        A02 = fBPayIcon;
        FBPayIcon fBPayIcon2 = new FBPayIcon("LOADING_SPINNER", 1, 41, 33);
        A03 = fBPayIcon2;
        FBPayIcon[] fBPayIconArr = {fBPayIcon, fBPayIcon2, new FBPayIcon("CVV_INFO", 2, 53, 14)};
        A01 = fBPayIconArr;
        A00 = C00t.A00(fBPayIconArr);
        CREATOR = LGn.A00(23);
    }

    public FBPayIcon(String str, int i, int i2, int i3) {
        this.iconType = i2;
        this.iconColor = i3;
    }

    public static FBPayIcon valueOf(String str) {
        return (FBPayIcon) Enum.valueOf(FBPayIcon.class, str);
    }

    public static FBPayIcon[] values() {
        return (FBPayIcon[]) A01.clone();
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
