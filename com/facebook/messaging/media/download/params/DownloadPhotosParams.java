package com.facebook.messaging.media.download.params;

import X.11T;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSV;
import X.RVI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: DownloadPhotosParams.class */
public final class DownloadPhotosParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(12);
    public final ImmutableList A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public DownloadPhotosParams(ImmutableList immutableList, Integer num, boolean z, boolean z2) {
        11T.A0F(num, 2);
        this.A00 = immutableList;
        this.A01 = num;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DownloadPhotosParams)) {
                return false;
            }
            DownloadPhotosParams downloadPhotosParams = (DownloadPhotosParams) obj;
            if (!11T.A0O(this.A00, downloadPhotosParams.A00) || this.A01 != downloadPhotosParams.A01 || this.A03 != downloadPhotosParams.A03 || this.A02 != downloadPhotosParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass001.A02(this.A00) * 31;
        Integer num = this.A01;
        return ((7zV.A03(num, RVI.A01(num), A02) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A00);
        parcel.writeString(RVI.A01(this.A01));
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
