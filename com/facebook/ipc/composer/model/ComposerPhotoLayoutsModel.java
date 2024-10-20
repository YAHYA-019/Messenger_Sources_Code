package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerPhotoLayoutsModel.class */
public final class ComposerPhotoLayoutsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(53);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public ComposerPhotoLayoutsModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = AbJ.A1W(parcel);
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A02 = C3o5.A0O(parcel);
    }

    public ComposerPhotoLayoutsModel(String str, String str2, String str3, boolean z, boolean z2) {
        C1pq.A08("framePhotoLayoutBackgroundColor", str);
        this.A00 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPhotoLayoutsModel)) {
                return false;
            }
            ComposerPhotoLayoutsModel composerPhotoLayoutsModel = (ComposerPhotoLayoutsModel) obj;
            if (!11T.A0O(this.A00, composerPhotoLayoutsModel.A00) || this.A03 != composerPhotoLayoutsModel.A03 || this.A04 != composerPhotoLayoutsModel.A04 || !11T.A0O(this.A01, composerPhotoLayoutsModel.A01) || !11T.A0O(this.A02, composerPhotoLayoutsModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A03), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
