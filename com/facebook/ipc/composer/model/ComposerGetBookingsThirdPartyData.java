package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerGetBookingsThirdPartyData.class */
public final class ComposerGetBookingsThirdPartyData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(20);
    public final ComposerLocalDevPlatformPostDefinitionAdditionalData A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ComposerGetBookingsThirdPartyData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ComposerLocalDevPlatformPostDefinitionAdditionalData) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readString();
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
    }

    public ComposerGetBookingsThirdPartyData(ComposerLocalDevPlatformPostDefinitionAdditionalData composerLocalDevPlatformPostDefinitionAdditionalData, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = composerLocalDevPlatformPostDefinitionAdditionalData;
        C1pq.A08("appConfigID", str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        C1pq.A08("pageID", str5);
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGetBookingsThirdPartyData)) {
                return false;
            }
            ComposerGetBookingsThirdPartyData composerGetBookingsThirdPartyData = (ComposerGetBookingsThirdPartyData) obj;
            if (!11T.A0O(this.A00, composerGetBookingsThirdPartyData.A00) || !11T.A0O(this.A01, composerGetBookingsThirdPartyData.A01) || !11T.A0O(this.A02, composerGetBookingsThirdPartyData.A02) || !11T.A0O(this.A03, composerGetBookingsThirdPartyData.A03) || !11T.A0O(this.A04, composerGetBookingsThirdPartyData.A04) || !11T.A0O(this.A05, composerGetBookingsThirdPartyData.A05) || !11T.A0O(this.A06, composerGetBookingsThirdPartyData.A06) || !11T.A0O(this.A07, composerGetBookingsThirdPartyData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
    }
}
