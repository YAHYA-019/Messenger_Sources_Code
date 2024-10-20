package com.facebook.ipc.composer.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerShareableData.class */
public final class ComposerShareableData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(68);
    public final String A00;
    public final String A01;
    public final String A02;

    public ComposerShareableData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
        this.A02 = parcel.readString();
    }

    public ComposerShareableData(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        C1pq.A08("typeName", str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerShareableData)) {
                return false;
            }
            ComposerShareableData composerShareableData = (ComposerShareableData) obj;
            if (!11T.A0O(this.A00, composerShareableData.A00) || !11T.A0O(this.A01, composerShareableData.A01) || !11T.A0O(this.A02, composerShareableData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    public String toString() {
        return 0Pz.A12("ComposerShareableData{id=", this.A00, ", trackingCodes=", this.A01, ", typeName=", this.A02, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
    }
}
