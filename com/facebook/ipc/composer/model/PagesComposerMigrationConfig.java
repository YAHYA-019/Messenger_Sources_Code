package com.facebook.ipc.composer.model;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PagesComposerMigrationConfig.class */
public final class PagesComposerMigrationConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(2);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public PagesComposerMigrationConfig(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
    }

    public PagesComposerMigrationConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PagesComposerMigrationConfig)) {
                return false;
            }
            PagesComposerMigrationConfig pagesComposerMigrationConfig = (PagesComposerMigrationConfig) obj;
            if (this.A00 != pagesComposerMigrationConfig.A00 || this.A01 != pagesComposerMigrationConfig.A01 || this.A02 != pagesComposerMigrationConfig.A02 || this.A03 != pagesComposerMigrationConfig.A03 || this.A04 != pagesComposerMigrationConfig.A04 || this.A05 != pagesComposerMigrationConfig.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
