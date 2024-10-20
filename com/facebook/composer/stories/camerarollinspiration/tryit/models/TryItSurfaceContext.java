package com.facebook.composer.stories.camerarollinspiration.tryit.models;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EQ2;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TryItSurfaceContext.class */
public final class TryItSurfaceContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(21);
    public final EQ2 A00;
    public final String A01;

    public TryItSurfaceContext(EQ2 eq2, String str) {
        this.A01 = str;
        this.A00 = eq2;
    }

    public TryItSurfaceContext(Parcel parcel) {
        EQ2 eq2 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? EQ2.values()[parcel.readInt()] : eq2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TryItSurfaceContext)) {
                return false;
            }
            TryItSurfaceContext tryItSurfaceContext = (TryItSurfaceContext) obj;
            if (!11T.A0O(this.A01, tryItSurfaceContext.A01) || this.A00 != tryItSurfaceContext.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return (A03 * 31) + C3o5.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TryItSurfaceContext{tryItSessionId=");
        A0k.append(this.A01);
        A0k.append(", tryItTileType=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        C3o5.A0e(parcel, this.A00);
    }
}
