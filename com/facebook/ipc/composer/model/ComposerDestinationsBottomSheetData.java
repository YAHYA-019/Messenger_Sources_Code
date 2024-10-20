package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AqT;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLGroupVisibility;

/* loaded from: ComposerDestinationsBottomSheetData.class */
public final class ComposerDestinationsBottomSheetData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(11);
    public final GraphQLGroupVisibility A00;
    public final AqT A01;
    public final String A02;

    public ComposerDestinationsBottomSheetData(Parcel parcel) {
        AqT aqT = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = GraphQLGroupVisibility.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (AqT) FJ8.A01(parcel) : aqT;
        this.A02 = C3o5.A0O(parcel);
    }

    public ComposerDestinationsBottomSheetData(GraphQLGroupVisibility graphQLGroupVisibility, AqT aqT, String str) {
        this.A00 = graphQLGroupVisibility;
        this.A01 = aqT;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerDestinationsBottomSheetData)) {
                return false;
            }
            ComposerDestinationsBottomSheetData composerDestinationsBottomSheetData = (ComposerDestinationsBottomSheetData) obj;
            if (this.A00 != composerDestinationsBottomSheetData.A00 || !11T.A0O(this.A01, composerDestinationsBottomSheetData.A01) || !11T.A0O(this.A02, composerDestinationsBottomSheetData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C3o5.A03(this.A00) + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        DKH.A0y(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
