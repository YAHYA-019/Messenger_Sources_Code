package com.facebook.account.twofac.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: CheckApprovedMachineMethod$Result.class */
public class CheckApprovedMachineMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(82);
    public List A00 = ImmutableList.of();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A00);
    }
}
