package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerLocalCommunityPostModel.class */
public final class ComposerLocalCommunityPostModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(36);
    public final String A00;
    public final String A01;

    public ComposerLocalCommunityPostModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    public ComposerLocalCommunityPostModel(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerLocalCommunityPostModel)) {
                return false;
            }
            ComposerLocalCommunityPostModel composerLocalCommunityPostModel = (ComposerLocalCommunityPostModel) obj;
            if (!11T.A0O(this.A00, composerLocalCommunityPostModel.A00) || !11T.A0O(this.A01, composerLocalCommunityPostModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
