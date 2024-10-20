package com.facebook.locationsharing.core.models;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.GOq;
import X.I0L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: LocationSharingPresenterState.class */
public final class LocationSharingPresenterState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(69);
    public final int A00;
    public final long A01;
    public final Address A02;
    public final LiveLocationSession A03;
    public final Location A04;
    public final Location A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public LocationSharingPresenterState(I0L i0l) {
        ImmutableList immutableList = i0l.A06;
        C1pq.A08("addedSharerIds", immutableList);
        this.A06 = immutableList;
        this.A04 = i0l.A04;
        this.A01 = i0l.A01;
        this.A03 = i0l.A03;
        this.A02 = i0l.A02;
        this.A0D = i0l.A0D;
        this.A05 = i0l.A05;
        ImmutableList immutableList2 = i0l.A07;
        C1pq.A08("pointsOfInterest", immutableList2);
        this.A07 = immutableList2;
        ImmutableList immutableList3 = i0l.A08;
        C1pq.A08("removedSharerIds", immutableList3);
        this.A08 = immutableList3;
        this.A00 = i0l.A00;
        this.A0B = i0l.A0B;
        ImmutableList immutableList4 = i0l.A09;
        C1pq.A08("sharers", immutableList4);
        this.A09 = immutableList4;
        ImmutableList immutableList5 = i0l.A0A;
        C1pq.A08("updatedSharerIds", immutableList5);
        this.A0A = immutableList5;
        String str = i0l.A0C;
        C1pq.A08("userId", str);
        this.A0C = str;
    }

    public LocationSharingPresenterState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A06 = ImmutableList.copyOf(strArr);
        Location location = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (Location) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (LiveLocationSession) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Address) parcel.readParcelable(A0e);
        }
        this.A0D = AbN.A1U(parcel);
        this.A05 = parcel.readInt() != 0 ? (Location) parcel.readParcelable(A0e) : location;
        int readInt2 = parcel.readInt();
        PointOfInterest[] pointOfInterestArr = new PointOfInterest[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, pointOfInterestArr, i3);
        }
        this.A07 = ImmutableList.copyOf(pointOfInterestArr);
        int readInt3 = parcel.readInt();
        String[] strArr2 = new String[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbH.A00(parcel, strArr2, i4);
        }
        this.A08 = ImmutableList.copyOf(strArr2);
        this.A00 = parcel.readInt();
        this.A0B = C3o5.A0O(parcel);
        int readInt4 = parcel.readInt();
        LiveLocationSharer[] liveLocationSharerArr = new LiveLocationSharer[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = AbI.A01(parcel, A0e, liveLocationSharerArr, i5);
        }
        this.A09 = ImmutableList.copyOf(liveLocationSharerArr);
        int readInt5 = parcel.readInt();
        String[] strArr3 = new String[readInt5];
        while (i < readInt5) {
            i = AbH.A00(parcel, strArr3, i);
        }
        this.A0A = ImmutableList.copyOf(strArr3);
        this.A0C = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LocationSharingPresenterState)) {
                return false;
            }
            LocationSharingPresenterState locationSharingPresenterState = (LocationSharingPresenterState) obj;
            if (!11T.A0O(this.A06, locationSharingPresenterState.A06) || !11T.A0O(this.A04, locationSharingPresenterState.A04) || this.A01 != locationSharingPresenterState.A01 || !11T.A0O(this.A03, locationSharingPresenterState.A03) || !11T.A0O(this.A02, locationSharingPresenterState.A02) || this.A0D != locationSharingPresenterState.A0D || !11T.A0O(this.A05, locationSharingPresenterState.A05) || !11T.A0O(this.A07, locationSharingPresenterState.A07) || !11T.A0O(this.A08, locationSharingPresenterState.A08) || this.A00 != locationSharingPresenterState.A00 || !11T.A0O(this.A0B, locationSharingPresenterState.A0B) || !11T.A0O(this.A09, locationSharingPresenterState.A09) || !11T.A0O(this.A0A, locationSharingPresenterState.A0A) || !11T.A0O(this.A0C, locationSharingPresenterState.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0C, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A0B, (C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A04, C1pq.A03(this.A06)), this.A01))), this.A0D)))) * 31) + this.A00))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocationSharingPresenterState{addedSharerIds=");
        A0k.append(this.A06);
        A0k.append(", currentLocation=");
        A0k.append(this.A04);
        A0k.append(", currentTimeMillis=");
        A0k.append(this.A01);
        A0k.append(", liveLocationSession=");
        A0k.append(this.A03);
        A0k.append(", mapAddress=");
        A0k.append(this.A02);
        A0k.append(", mapDragging=");
        A0k.append(this.A0D);
        A0k.append(", mapLocation=");
        A0k.append(this.A05);
        A0k.append(", pointsOfInterest=");
        A0k.append(this.A07);
        A0k.append(", removedSharerIds=");
        A0k.append(this.A08);
        A0k.append(", selectedPointOfInterestIndex=");
        A0k.append(this.A00);
        A0k.append(", selectedSharerId=");
        A0k.append(this.A0B);
        A0k.append(", sharers=");
        A0k.append(this.A09);
        A0k.append(", updatedSharerIds=");
        A0k.append(this.A0A);
        A0k.append(", userId=");
        return GOq.A12(this.A0C, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A06);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeLong(this.A01);
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        C3o5.A0d(parcel, this.A05, i);
        1Du A0b2 = 1BL.A0b(parcel, this.A07);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((PointOfInterest) A0b2.next(), i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A08);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0B);
        1Du A0b4 = 1BL.A0b(parcel, this.A09);
        while (A0b4.hasNext()) {
            parcel.writeParcelable((LiveLocationSharer) A0b4.next(), i);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A0A);
        while (A0b5.hasNext()) {
            C3o5.A0h(parcel, A0b5);
        }
        parcel.writeString(this.A0C);
    }
}
