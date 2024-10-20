package com.facebook.video.creativeediting.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoSegmentHolder.class */
public final class VideoSegmentHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(6);
    public final FBPhotoSegment A00;
    public final FBVideoSegment A01;

    public VideoSegmentHolder(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        FBVideoSegment fBVideoSegment = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FBPhotoSegment) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (FBVideoSegment) parcel.readParcelable(A0e) : fBVideoSegment;
    }

    public VideoSegmentHolder(FBPhotoSegment fBPhotoSegment, FBVideoSegment fBVideoSegment) {
        this.A00 = fBPhotoSegment;
        this.A01 = fBVideoSegment;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoSegmentHolder)) {
                return false;
            }
            VideoSegmentHolder videoSegmentHolder = (VideoSegmentHolder) obj;
            if (!11T.A0O(this.A00, videoSegmentHolder.A00) || !11T.A0O(this.A01, videoSegmentHolder.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
    }
}
