package com.facebook.photos.creativeediting.model;

import X.0Pz;
import X.1BL;
import X.1BM;
import X.1Bi;
import X.4YT;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass047;
import X.C01s;
import X.C1pq;
import X.C3o5;
import X.FFp;
import X.FKW;
import X.RZ9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoTrimParams.class */
public final class VideoTrimParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(26);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public VideoTrimParams(RZ9 rz9) {
        this.A03 = rz9.A03;
        this.A04 = rz9.A04;
        this.A05 = rz9.A05;
        this.A00 = rz9.A00;
        this.A01 = rz9.A01;
        this.A02 = rz9.A02;
        int i = (-1) >>> 1;
        int i2 = 0;
        if (1BL.A0Q().AZk(36311049424865104L)) {
            int i3 = this.A02;
            if (i3 < -1) {
                A00(this, "VideoTrimParamsSpec-Illegal-trimStartTimeMs");
            }
            int i4 = this.A01;
            if (i4 < -1) {
                A00(this, "VideoTrimParamsSpec-Illegal-trimEndTimeMs");
            }
            if ((i4 != -1 ? i4 : i) <= (i3 != -1 ? i3 : i2)) {
                A00(this, "VideoTrimParamsSpec-Illegal-endLessThanStart:trimStartTimeMs");
                return;
            }
            return;
        }
        C01s A0G = 4YV.A0G();
        int i5 = this.A02;
        if (i5 < -1) {
            A0G.D0v("VideoTrimParamsSpec-Illegal-trimStartTimeMs", 0Pz.A0T("trimStartTimeMs: ", i5));
        }
        int i6 = this.A01;
        if (i6 < -1) {
            A0G.D0v("VideoTrimParamsSpec-Illegal-trimEndTimeMs", 0Pz.A0T("trimEndTimeMs: ", i6));
        }
        i2 = i5 != -1 ? i5 : i2;
        if (i6 == -1 || i6 >= i2) {
            return;
        }
        A0G.D0v("VideoTrimParamsSpec-Illegal-endLessThanStart", 0Pz.A0C(i5, i6, "trimStartTimeMs: ", ", trimEndTimeMs: "));
    }

    public VideoTrimParams(Parcel parcel) {
        this.A03 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public static final void A00(VideoTrimParams videoTrimParams, String str) {
        AnonymousClass047 A02 = ((FFp) 1Bi.A03(98513)).A02("invalid_video_trim_params", "VideoTrimParams", str);
        A02.A8I(4YT.A00(1548), videoTrimParams.A02);
        A02.A8I(4YT.A00(1547), videoTrimParams.A01);
        A02.A8L("isAutoTrim", videoTrimParams.A03);
        A02.A8L("isManual", videoTrimParams.A04);
        A02.A8I("scrollStartOffsetMs", videoTrimParams.A00);
        A02.report();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoTrimParams)) {
                return false;
            }
            VideoTrimParams videoTrimParams = (VideoTrimParams) obj;
            if (this.A03 != videoTrimParams.A03 || this.A04 != videoTrimParams.A04 || this.A05 != videoTrimParams.A05 || this.A00 != videoTrimParams.A00 || this.A01 != videoTrimParams.A01 || this.A02 != videoTrimParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((C1pq.A02(C1pq.A02(C1pq.A05(this.A03), this.A04), this.A05) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
