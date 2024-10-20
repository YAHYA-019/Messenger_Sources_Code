package com.facebook.photos.simplepicker.controller.data.model;

import X.11T;
import X.7zU;
import X.AbE;
import X.C1pq;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Folder.class */
public final class Folder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(30);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Folder(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public Folder(String str, String str2, String str3, int i) {
        C1pq.A08(AbE.A00(46), str);
        this.A01 = str;
        C1pq.A08("bucketId", str2);
        this.A02 = str2;
        C1pq.A08("folderDisplayName", str3);
        this.A03 = str3;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Folder)) {
                return false;
            }
            Folder folder = (Folder) obj;
            if (!11T.A0O(this.A01, folder.A01) || !11T.A0O(this.A02, folder.A02) || !11T.A0O(this.A03, folder.A03) || this.A00 != folder.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }
}
