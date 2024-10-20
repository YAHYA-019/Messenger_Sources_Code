package com.facebook.messaging.sharedalbum.model;

import X.11T;
import X.4YW;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: MediaResourceList.class */
public final class MediaResourceList extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(33);
    public final List A00;

    public MediaResourceList(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A00);
        while (A09.hasNext()) {
            parcel.writeParcelable((Parcelable) A09.next(), i);
        }
    }
}
