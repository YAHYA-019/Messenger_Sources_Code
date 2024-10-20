package com.facebook.ipc.composer.model;

import X.11T;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FJ8;
import X.FKa;
import X.MT5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: ComposerLocationInfo.class */
public final class ComposerLocationInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(39);
    public final MT5 A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public ComposerLocationInfo(MT5 mt5, ImmutableList immutableList, String str, boolean z, boolean z2) {
        this.A03 = z;
        this.A04 = z2;
        C1pq.A08("lightweightPlacePickerPlaces", immutableList);
        this.A01 = immutableList;
        C1pq.A08("lightweightPlacePickerSearchResultsId", str);
        this.A02 = str;
        this.A00 = mt5;
    }

    public ComposerLocationInfo(Parcel parcel) {
        this.A03 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A04 = AbJ.A1W(parcel);
        this.A01 = ImmutableList.copyOf((Collection) FJ8.A06(parcel));
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt() == 0 ? null : FJ8.A01(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerLocationInfo)) {
                return false;
            }
            ComposerLocationInfo composerLocationInfo = (ComposerLocationInfo) obj;
            if (this.A03 != composerLocationInfo.A03 || this.A04 != composerLocationInfo.A04 || !11T.A0O(this.A01, composerLocationInfo.A01) || !11T.A0O(this.A02, composerLocationInfo.A02) || !11T.A0O(this.A00, composerLocationInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A05(this.A03), this.A04))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        FJ8.A0B(parcel, this.A01);
        parcel.writeString(this.A02);
        MT5 mt5 = this.A00;
        if (mt5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, mt5);
        }
    }
}
