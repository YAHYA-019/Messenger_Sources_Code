package com.facebook.messaging.media.download.params;

import X.11T;
import X.1BL;
import X.7zN;
import X.7zU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSV;
import X.RVI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.secure.strictfile.FileLocationScopeParcelable;

/* loaded from: SaveMediaParams.class */
public final class SaveMediaParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(15);
    public boolean A00;
    public final Uri A01;
    public final FileLocationScopeParcelable A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public SaveMediaParams(Uri uri, FileLocationScopeParcelable fileLocationScopeParcelable, Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = num;
        this.A01 = uri;
        this.A02 = fileLocationScopeParcelable;
        this.A00 = z;
        this.A06 = z2;
        this.A05 = str;
        this.A04 = str2;
    }

    public SaveMediaParams(Uri uri, Integer num, String str, String str2, boolean z, boolean z2) {
        this(uri, null, num, str2, str, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SaveMediaParams)) {
                return false;
            }
            SaveMediaParams saveMediaParams = (SaveMediaParams) obj;
            if (this.A03 != saveMediaParams.A03 || !11T.A0O(this.A01, saveMediaParams.A01) || !11T.A0O(this.A02, saveMediaParams.A02) || this.A00 != saveMediaParams.A00 || this.A06 != saveMediaParams.A06 || !11T.A0O(this.A05, saveMediaParams.A05) || !11T.A0O(this.A04, saveMediaParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A03;
        return ((((((((((((num == null ? 0 : 7zU.A02(num, RVI.A01(num))) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + 1BL.A05(this.A05)) * 31) + 7zN.A05(this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(RVI.A01(num));
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }
}
