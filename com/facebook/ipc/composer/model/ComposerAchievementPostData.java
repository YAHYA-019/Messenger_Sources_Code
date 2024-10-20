package com.facebook.ipc.composer.model;

import X.11T;
import X.4YW;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerAchievementPostData.class */
public final class ComposerAchievementPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(94);
    public final String A00;
    public final String A01;
    public final String A02;

    public ComposerAchievementPostData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = DKH.A0l(parcel);
        this.A02 = parcel.readString();
    }

    public ComposerAchievementPostData(String str, String str2, String str3) {
        C1pq.A08("iconType", str);
        this.A00 = str;
        this.A01 = str2;
        AbF.A1V(str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerAchievementPostData)) {
                return false;
            }
            ComposerAchievementPostData composerAchievementPostData = (ComposerAchievementPostData) obj;
            if (!11T.A0O(this.A00, composerAchievementPostData.A00) || !11T.A0O(this.A01, composerAchievementPostData.A01) || !11T.A0O(this.A02, composerAchievementPostData.A02)) {
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
        4YW.A0E(parcel, this.A01);
        parcel.writeString(this.A02);
    }
}
