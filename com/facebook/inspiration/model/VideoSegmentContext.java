package com.facebook.inspiration.model;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.RKv;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoSegmentContext.class */
public final class VideoSegmentContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(94);
    public final int A00;
    public final int A01;
    public final Boolean A02;

    public VideoSegmentContext(RKv rKv) {
        this.A02 = rKv.A02;
        this.A00 = rKv.A00;
        this.A01 = rKv.A01;
    }

    public VideoSegmentContext(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) == 0 ? null : Boolean.valueOf(AbN.A1U(parcel));
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public VideoSegmentContext(Boolean bool, int i, int i2) {
        this.A02 = bool;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoSegmentContext)) {
                return false;
            }
            VideoSegmentContext videoSegmentContext = (VideoSegmentContext) obj;
            if (!11T.A0O(this.A02, videoSegmentContext.A02) || this.A00 != videoSegmentContext.A00 || this.A01 != videoSegmentContext.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Boolean bool = this.A02;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue() ? 1 : 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
