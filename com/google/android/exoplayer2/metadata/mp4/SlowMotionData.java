package com.google.android.exoplayer2.metadata.mp4;

import X.1BK;
import X.6DP;
import X.6Y2;
import X.6Yl;
import X.AnonymousClass001;
import X.DKD;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: SlowMotionData.class */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(48);
    public final List A00;

    /* loaded from: SlowMotionData$Segment.class */
    public final class Segment implements Parcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(49);
        public final int A00;
        public final long A01;
        public final long A02;

        public Segment(long j, long j2, int i) {
            6DP.A03(DKD.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1))));
            this.A02 = j;
            this.A01 = j2;
            this.A00 = i;
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
                Segment segment = (Segment) obj;
                if (this.A02 != segment.A02 || this.A01 != segment.A01 || this.A00 != segment.A00) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(1BK.A1a(Long.valueOf(this.A02), Long.valueOf(this.A01), this.A00));
        }

        public String toString() {
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", 1BK.A1a(Long.valueOf(this.A02), Long.valueOf(this.A01), this.A00));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A02);
            parcel.writeLong(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    public SlowMotionData(List list) {
        boolean z;
        this.A00 = list;
        if (!list.isEmpty()) {
            long j = ((Segment) list.get(0)).A01;
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 >= list.size()) {
                    break;
                }
                if (((Segment) list.get(i2)).A02 < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) list.get(i2)).A01;
                    i = i2 + 1;
                }
            }
        }
        z = false;
        6DP.A03(!z);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void CXq(6Y2 r302) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((SlowMotionData) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SlowMotion: segments=");
        return AnonymousClass001.A0a(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
