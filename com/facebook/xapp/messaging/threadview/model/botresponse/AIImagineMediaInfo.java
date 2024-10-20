package com.facebook.xapp.messaging.threadview.model.botresponse;

import X.11T;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AIImagineMediaInfo.class */
public final class AIImagineMediaInfo extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(65);
    public final Long A00;
    public final boolean A01;
    public final boolean A02;

    public AIImagineMediaInfo(Long l, boolean z, boolean z2) {
        this.A00 = l;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AIImagineMediaInfo)) {
                return false;
            }
            AIImagineMediaInfo aIImagineMediaInfo = (AIImagineMediaInfo) obj;
            if (!11T.A0O(this.A00, aIImagineMediaInfo.A00) || this.A02 != aIImagineMediaInfo.A02 || this.A01 != aIImagineMediaInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A02(this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        7zV.A0m(parcel, this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
