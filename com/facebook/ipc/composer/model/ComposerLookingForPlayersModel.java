package com.facebook.ipc.composer.model;

import X.11T;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerLookingForPlayersModel.class */
public final class ComposerLookingForPlayersModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(40);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ComposerLookingForPlayersModel(int i, String str, String str2, String str3) {
        this.A00 = i;
        C1pq.A08("gameId", str);
        this.A01 = str;
        this.A02 = str2;
        C1pq.A08("gameTitle", str3);
        this.A03 = str3;
    }

    public ComposerLookingForPlayersModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = AbK.A15(parcel, parcel.readInt());
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerLookingForPlayersModel)) {
                return false;
            }
            ComposerLookingForPlayersModel composerLookingForPlayersModel = (ComposerLookingForPlayersModel) obj;
            if (this.A00 != composerLookingForPlayersModel.A00 || !11T.A0O(this.A01, composerLookingForPlayersModel.A01) || !11T.A0O(this.A02, composerLookingForPlayersModel.A02) || !11T.A0O(this.A03, composerLookingForPlayersModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, this.A00 + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        4YW.A0E(parcel, this.A02);
        parcel.writeString(this.A03);
    }
}
