package com.facebook.inspiration.emp.model;

import X.11T;
import X.1BL;
import X.4YU;
import X.AnonymousClass002;
import X.C04v;
import X.EKy;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.composer.media.ComposerMedia;

/* loaded from: EMPMediaModel.class */
public final class EMPMediaModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(29);
    public final int A00;
    public final int A01;
    public final ComposerMedia A02;
    public final EKy A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public EMPMediaModel(ComposerMedia composerMedia, EKy eKy, String str, String str2, String str3, int i, int i2) {
        1BL.A1H(eKy, str, str2);
        this.A03 = eKy;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = composerMedia;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EMPMediaModel)) {
                return false;
            }
            EMPMediaModel eMPMediaModel = (EMPMediaModel) obj;
            if (this.A03 != eMPMediaModel.A03 || !11T.A0O(this.A04, eMPMediaModel.A04) || !11T.A0O(this.A05, eMPMediaModel.A05) || !11T.A0O(this.A06, eMPMediaModel.A06) || this.A01 != eMPMediaModel.A01 || this.A00 != eMPMediaModel.A00 || !11T.A0O(this.A02, eMPMediaModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A07(this.A05, AnonymousClass002.A07(this.A04, 1BL.A03(this.A03))) + 1BL.A05(this.A06)) * 31) + this.A01) * 31) + this.A00) * 31) + 4YU.A03(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }
}
