package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.4YT;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: ComposerVideoListData.class */
public final class ComposerVideoListData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(76);
    public final String A00;
    public final String A01;
    public final String A02;

    public ComposerVideoListData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A02 = C3o5.A0O(parcel);
    }

    public ComposerVideoListData(String str, String str2, String str3) {
        C1pq.A08(4YT.A00(ActionId.HEADER_DATA_LOADED), str);
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
            if (!(obj instanceof ComposerVideoListData)) {
                return false;
            }
            ComposerVideoListData composerVideoListData = (ComposerVideoListData) obj;
            if (!11T.A0O(this.A00, composerVideoListData.A00) || !11T.A0O(this.A01, composerVideoListData.A01) || !11T.A0O(this.A02, composerVideoListData.A02)) {
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
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
