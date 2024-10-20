package com.facebook.messaging.sharedalbum.viewstate;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YW;
import X.BW9;
import X.C04v;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: SharedAlbumsViewState.class */
public final class SharedAlbumsViewState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(42);
    public final Integer A00;
    public final List A01;

    public SharedAlbumsViewState(Integer num, List list) {
        1BL.A1F(num, list);
        this.A00 = num;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharedAlbumsViewState)) {
                return false;
            }
            SharedAlbumsViewState sharedAlbumsViewState = (SharedAlbumsViewState) obj;
            if (this.A00 != sharedAlbumsViewState.A00 || !11T.A0O(this.A01, sharedAlbumsViewState.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A00;
        return 1BK.A03(this.A01, C3o5.A05(num, BW9.A00(num)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(BW9.A00(this.A00));
        Iterator A09 = 4YW.A09(parcel, this.A01);
        while (A09.hasNext()) {
            ((SharedAlbumViewState) A09.next()).writeToParcel(parcel, i);
        }
    }
}
