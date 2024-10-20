package com.facebook.messaging.cowatch.launcher.parameters;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.video.engine.api.VideoDataSource;

/* loaded from: VideoInfo.class */
public final class VideoInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(27);
    public final int A00;
    public final VideoDataSource A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public VideoInfo(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = (VideoDataSource) VideoDataSource.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = parcel.readString();
        this.A05 = C3o5.A0O(parcel);
    }

    public VideoInfo(VideoDataSource videoDataSource, String str, String str2, String str3, String str4) {
        this.A01 = videoDataSource;
        this.A02 = str;
        this.A00 = 0;
        this.A03 = str2;
        C1pq.A08("videoId", str3);
        this.A04 = str3;
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoInfo)) {
                return false;
            }
            VideoInfo videoInfo = (VideoInfo) obj;
            if (!11T.A0O(this.A01, videoInfo.A01) || !11T.A0O(this.A02, videoInfo.A02) || this.A00 != videoInfo.A00 || !11T.A0O(this.A03, videoInfo.A03) || !11T.A0O(this.A04, videoInfo.A04) || !11T.A0O(this.A05, videoInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, (C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31) + this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        VideoDataSource videoDataSource = this.A01;
        if (videoDataSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDataSource.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
    }
}
