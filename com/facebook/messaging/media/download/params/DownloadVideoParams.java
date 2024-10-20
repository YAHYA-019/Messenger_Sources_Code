package com.facebook.messaging.media.download.params;

import X.11T;
import X.7zU;
import X.AnonymousClass001;
import X.C04v;
import X.CSV;
import X.RVI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.attachments.VideoAttachmentData;

/* loaded from: DownloadVideoParams.class */
public final class DownloadVideoParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(13);
    public final VideoAttachmentData A00;
    public final Integer A01;

    public DownloadVideoParams(VideoAttachmentData videoAttachmentData, Integer num) {
        this.A00 = videoAttachmentData;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DownloadVideoParams)) {
                return false;
            }
            DownloadVideoParams downloadVideoParams = (DownloadVideoParams) obj;
            if (!11T.A0O(this.A00, downloadVideoParams.A00) || this.A01 != downloadVideoParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = AnonymousClass001.A02(this.A00) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = 7zU.A02(num, RVI.A01(num));
        }
        return A02 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(RVI.A01(num));
        }
    }
}
