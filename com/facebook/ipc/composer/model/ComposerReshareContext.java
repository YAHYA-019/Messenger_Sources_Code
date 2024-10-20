package com.facebook.ipc.composer.model;

import X.11T;
import X.7zK;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerReshareContext.class */
public final class ComposerReshareContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(63);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public ComposerReshareContext(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = AbN.A1U(parcel);
    }

    public ComposerReshareContext(String str, String str2, boolean z) {
        C1pq.A08("originalShareActorName", str);
        this.A00 = str;
        C1pq.A08(7zK.A00(414), str2);
        this.A01 = str2;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerReshareContext)) {
                return false;
            }
            ComposerReshareContext composerReshareContext = (ComposerReshareContext) obj;
            if (!11T.A0O(this.A00, composerReshareContext.A00) || !11T.A0O(this.A01, composerReshareContext.A01) || this.A02 != composerReshareContext.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
