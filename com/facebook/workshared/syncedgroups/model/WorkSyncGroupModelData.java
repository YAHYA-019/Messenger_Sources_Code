package com.facebook.workshared.syncedgroups.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKb;
import X.ROF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLGroupPurposeType;

/* loaded from: WorkSyncGroupModelData.class */
public final class WorkSyncGroupModelData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(42);
    public final int A00;
    public final int A01;
    public final long A02;
    public final GraphQLGroupPurposeType A03;
    public final String A04;
    public final String A05;

    public WorkSyncGroupModelData(ROF rof) {
        this.A00 = rof.A00;
        this.A04 = rof.A04;
        this.A02 = rof.A02;
        this.A05 = rof.A05;
        this.A03 = rof.A03;
        this.A01 = rof.A01;
    }

    public WorkSyncGroupModelData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        GraphQLGroupPurposeType graphQLGroupPurposeType = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A02 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? GraphQLGroupPurposeType.values()[parcel.readInt()] : graphQLGroupPurposeType;
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof WorkSyncGroupModelData)) {
                return false;
            }
            WorkSyncGroupModelData workSyncGroupModelData = (WorkSyncGroupModelData) obj;
            if (this.A00 != workSyncGroupModelData.A00 || !11T.A0O(this.A04, workSyncGroupModelData.A04) || this.A02 != workSyncGroupModelData.A02 || !11T.A0O(this.A05, workSyncGroupModelData.A05) || this.A03 != workSyncGroupModelData.A03 || this.A01 != workSyncGroupModelData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A05, C1pq.A01(C1pq.A04(this.A04, this.A00 + 31), this.A02));
        return (((A04 * 31) + C3o5.A03(this.A03)) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A04);
        parcel.writeLong(this.A02);
        1BL.A13(parcel, this.A05);
        C3o5.A0e(parcel, this.A03);
        parcel.writeInt(this.A01);
    }
}
