package com.facebook.messaging.service.model;

import X.1BL;
import X.1F9;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* loaded from: MarkThreadFields.class */
public final class MarkThreadFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(87);
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final 1F9 A05;
    public final ThreadKey A06;
    public final boolean A07;

    public MarkThreadFields(1F9 r302, ThreadKey threadKey, long j, long j2, long j3, long j4, boolean z) {
        this.A06 = threadKey;
        this.A07 = z;
        this.A02 = j2;
        this.A04 = j4;
        this.A03 = j3;
        this.A05 = r302;
        this.A01 = j;
    }

    public MarkThreadFields(Parcel parcel) {
        this.A06 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A07 = C53v.A0S(parcel);
        this.A02 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A05 = 1F9.A00(parcel.readString());
        this.A03 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    public String A00() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("threadKey", this.A06);
        stringHelper.add("state", this.A07);
        stringHelper.add("syncSeqId", this.A02);
        stringHelper.add("threadTimestampMs", this.A03);
        stringHelper.add("timestampMs", this.A04);
        stringHelper.add("folderName", this.A05);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MarkThreadFields markThreadFields = (MarkThreadFields) obj;
            if (!this.A06.equals(markThreadFields.A06) || this.A07 != markThreadFields.A07 || this.A02 != markThreadFields.A02 || this.A03 != markThreadFields.A03 || this.A04 != markThreadFields.A04 || !this.A05.equals(markThreadFields.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, Boolean.valueOf(this.A07), Long.valueOf(this.A02), Long.valueOf(this.A03), Long.valueOf(this.A04), this.A05});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A05.dbName);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
    }
}
