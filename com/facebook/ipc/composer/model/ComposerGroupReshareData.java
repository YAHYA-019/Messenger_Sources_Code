package com.facebook.ipc.composer.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerGroupReshareData.class */
public final class ComposerGroupReshareData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(30);
    public final String A00;
    public final String A01;
    public final String A02;

    public ComposerGroupReshareData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    public ComposerGroupReshareData(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupReshareData)) {
                return false;
            }
            ComposerGroupReshareData composerGroupReshareData = (ComposerGroupReshareData) obj;
            if (!11T.A0O(this.A00, composerGroupReshareData.A00) || !11T.A0O(this.A01, composerGroupReshareData.A01) || !11T.A0O(this.A02, composerGroupReshareData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    public String toString() {
        return 0Pz.A12("ComposerGroupReshareData{groupId=", this.A00, ", name=", this.A01, ", profileImageUri=", this.A02, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
