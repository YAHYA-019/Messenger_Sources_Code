package com.facebook.photos.simplepicker.controller.data.model;

import X.11T;
import X.1Du;
import X.AbH;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GroupedFoldersFieldList.class */
public final class GroupedFoldersFieldList implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(32);
    public final ImmutableList A00;

    public GroupedFoldersFieldList(Parcel parcel) {
        ImmutableList copyOf;
        if (C3o5.A01(parcel, this) == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            copyOf = ImmutableList.copyOf(strArr);
        }
        this.A00 = copyOf;
    }

    public GroupedFoldersFieldList(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GroupedFoldersFieldList) && 11T.A0O(this.A00, ((GroupedFoldersFieldList) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            C3o5.A0h(parcel, A0Y);
        }
    }
}
