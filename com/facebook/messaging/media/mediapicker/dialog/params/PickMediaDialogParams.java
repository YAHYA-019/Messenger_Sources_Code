package com.facebook.messaging.media.mediapicker.dialog.params;

import X.1BL;
import X.C53v;
import X.CSV;
import X.H9H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* loaded from: PickMediaDialogParams.class */
public final class PickMediaDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(23);
    public final CropImageParams A00;
    public final H9H A01;
    public final ImmutableSet A02;
    public final String A03;
    public final boolean A04;

    public PickMediaDialogParams(Parcel parcel) {
        this.A01 = parcel.readSerializable();
        this.A00 = (CropImageParams) 1BL.A0C(parcel, CropImageParams.class);
        this.A04 = C53v.A0S(parcel);
        this.A02 = (ImmutableSet) parcel.readSerializable();
        this.A03 = Platform.stringIsNullOrEmpty(parcel.readString()) ? null : parcel.readString();
    }

    public PickMediaDialogParams(CropImageParams cropImageParams, H9H h9h, String str, Set set) {
        h9h.getClass();
        set.getClass();
        this.A01 = h9h;
        this.A00 = cropImageParams;
        this.A04 = false;
        this.A02 = ImmutableSet.A07(set);
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeSerializable(this.A02);
        String str = this.A03;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
    }
}
