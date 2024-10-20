package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AvatarFeatureData.class */
public final class AvatarFeatureData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(88);
    public final String A00;
    public final String A01;
    public final String A02;

    public AvatarFeatureData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public AvatarFeatureData(String str, String str2, String str3) {
        C1pq.A08("poseId", str);
        this.A00 = str;
        C1pq.A08("previewId", str2);
        this.A01 = str2;
        C1pq.A08("previewUri", str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AvatarFeatureData)) {
                return false;
            }
            AvatarFeatureData avatarFeatureData = (AvatarFeatureData) obj;
            if (!11T.A0O(this.A00, avatarFeatureData.A00) || !11T.A0O(this.A01, avatarFeatureData.A01) || !11T.A0O(this.A02, avatarFeatureData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
