package com.facebook.ipc.locationcomponents.locationpicker.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: LocationPickerResultLocation.class */
public final class LocationPickerResultLocation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(45);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public LocationPickerResultLocation(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    public LocationPickerResultLocation(String str, String str2, String str3, int i) {
        C1pq.A08("contextualName", str);
        this.A01 = str;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        this.A02 = str2;
        this.A00 = i;
        C1pq.A08("locationPlaceTopicId", str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LocationPickerResultLocation)) {
                return false;
            }
            LocationPickerResultLocation locationPickerResultLocation = (LocationPickerResultLocation) obj;
            if (!11T.A0O(this.A01, locationPickerResultLocation.A01) || !11T.A0O(this.A02, locationPickerResultLocation.A02) || this.A00 != locationPickerResultLocation.A00 || !11T.A0O(this.A03, locationPickerResultLocation.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
