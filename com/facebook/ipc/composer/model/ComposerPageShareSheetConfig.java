package com.facebook.ipc.composer.model;

import X.11T;
import X.1BM;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerPageShareSheetConfig.class */
public final class ComposerPageShareSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(51);
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public ComposerPageShareSheetConfig(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A03 = 1BM.A07(parcel);
        this.A04 = AbJ.A1W(parcel);
        this.A00 = parcel.readInt();
    }

    public ComposerPageShareSheetConfig(String str, int i, boolean z, boolean z2, boolean z3) {
        C1pq.A08("configOption", str);
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPageShareSheetConfig)) {
                return false;
            }
            ComposerPageShareSheetConfig composerPageShareSheetConfig = (ComposerPageShareSheetConfig) obj;
            if (!11T.A0O(this.A01, composerPageShareSheetConfig.A01) || this.A02 != composerPageShareSheetConfig.A02 || this.A03 != composerPageShareSheetConfig.A03 || this.A04 != composerPageShareSheetConfig.A04 || this.A00 != composerPageShareSheetConfig.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A01), this.A02), this.A03), this.A04) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
