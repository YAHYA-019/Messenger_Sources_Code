package com.facebook.interstitial.api;

import X.11T;
import X.1BK;
import X.1BL;
import X.2tJ;
import X.2vV;
import X.2xA;
import X.AnonymousClass001;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: FQLFetchInterstitialResult.class */
public final class FQLFetchInterstitialResult implements Parcelable, 2xA {
    public static final Parcelable.Creator CREATOR = new FKc(72);
    public final Parcelable data;
    public final long fetchTimeMs;
    public final String nuxID;
    public final int rank;

    public FQLFetchInterstitialResult() {
        this(null, null, -1, 0L);
    }

    public FQLFetchInterstitialResult(Parcel parcel) {
        this.rank = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.nuxID = readString;
        this.data = 1BL.A0C(parcel, getClass().getGenericSuperclass().getClass());
        this.fetchTimeMs = parcel.readLong();
    }

    public FQLFetchInterstitialResult(Parcelable parcelable, String str, int i, long j) {
        this.rank = i;
        this.nuxID = str == null ? "" : str;
        this.data = parcelable;
        this.fetchTimeMs = j;
    }

    public long AG6() {
        return this.fetchTimeMs;
    }

    public int Avl() {
        return 0;
    }

    public String Azq() {
        return this.nuxID;
    }

    public int B5m() {
        return this.rank;
    }

    public void CYi(2tJ r302, boolean z) {
        Parcelable parcelable;
        if (r302 instanceof 2vV) {
            2vV r0 = (2vV) r302;
            Class AlT = r0.AlT();
            if (AlT.isInstance(this.data)) {
                Object cast = AlT.cast(this.data);
                11T.A0I(cast, "null cannot be cast to non-null type android.os.Parcelable");
                parcelable = (Parcelable) cast;
            } else {
                parcelable = null;
            }
            r0.CYj(parcelable);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        return AnonymousClass001.A1P(this.nuxID.length());
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("interstitialId", this.nuxID);
        stringHelper.add("rank", this.rank);
        stringHelper.add("data", this.data);
        stringHelper.add("fetchTimeMs", this.fetchTimeMs);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.rank);
        parcel.writeString(this.nuxID);
        parcel.writeParcelable(this.data, i);
        parcel.writeLong(this.fetchTimeMs);
    }
}
