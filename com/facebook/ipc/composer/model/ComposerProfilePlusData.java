package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerProfilePlusData.class */
public final class ComposerProfilePlusData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(60);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public ComposerProfilePlusData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = parcel.readString();
        this.A04 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
        this.A03 = C3o5.A0O(parcel);
    }

    public ComposerProfilePlusData(String str, String str2, String str3, String str4, boolean z) {
        this.A00 = str;
        C1pq.A08("delegatePageId", str2);
        this.A01 = str2;
        this.A04 = z;
        C1pq.A08("pageName", str3);
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerProfilePlusData)) {
                return false;
            }
            ComposerProfilePlusData composerProfilePlusData = (ComposerProfilePlusData) obj;
            if (!11T.A0O(this.A00, composerProfilePlusData.A00) || !11T.A0O(this.A01, composerProfilePlusData.A01) || this.A04 != composerProfilePlusData.A04 || !11T.A0O(this.A02, composerProfilePlusData.A02) || !11T.A0O(this.A03, composerProfilePlusData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
    }
}
