package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerEarlyAccessData.class */
public final class ComposerEarlyAccessData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(14);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public ComposerEarlyAccessData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = AbJ.A1W(parcel);
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A00 = parcel.readInt();
        this.A03 = C3o5.A0O(parcel);
    }

    public ComposerEarlyAccessData(String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A01 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerEarlyAccessData)) {
                return false;
            }
            ComposerEarlyAccessData composerEarlyAccessData = (ComposerEarlyAccessData) obj;
            if (!11T.A0O(this.A01, composerEarlyAccessData.A01) || this.A04 != composerEarlyAccessData.A04 || this.A05 != composerEarlyAccessData.A05 || !11T.A0O(this.A02, composerEarlyAccessData.A02) || this.A00 != composerEarlyAccessData.A00 || !11T.A0O(this.A03, composerEarlyAccessData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A03(this.A01), this.A04), this.A05)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A03);
    }
}
