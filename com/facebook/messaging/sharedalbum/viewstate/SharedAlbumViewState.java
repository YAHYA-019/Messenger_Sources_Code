package com.facebook.messaging.sharedalbum.viewstate;

import X.11T;
import X.4YV;
import X.4YW;
import X.7zP;
import X.AnonymousClass002;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: SharedAlbumViewState.class */
public final class SharedAlbumViewState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(41);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final List A06;

    public SharedAlbumViewState(String str, List list, int i, long j, long j2, long j3, long j4) {
        7zP.A1L(str, 1, list);
        this.A05 = str;
        this.A02 = j;
        this.A04 = j2;
        this.A01 = j3;
        this.A03 = j4;
        this.A06 = list;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharedAlbumViewState)) {
                return false;
            }
            SharedAlbumViewState sharedAlbumViewState = (SharedAlbumViewState) obj;
            if (!11T.A0O(this.A05, sharedAlbumViewState.A05) || this.A02 != sharedAlbumViewState.A02 || this.A04 != sharedAlbumViewState.A04 || this.A01 != sharedAlbumViewState.A01 || this.A03 != sharedAlbumViewState.A03 || !11T.A0O(this.A06, sharedAlbumViewState.A06) || this.A00 != sharedAlbumViewState.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A06, AnonymousClass002.A02(this.A03, AnonymousClass002.A02(this.A01, AnonymousClass002.A02(this.A04, AnonymousClass002.A02(this.A02, 4YV.A02(this.A05)))))) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A03);
        Iterator A09 = 4YW.A09(parcel, this.A06);
        while (A09.hasNext()) {
            parcel.writeParcelable((Parcelable) A09.next(), i);
        }
        parcel.writeInt(this.A00);
    }
}
