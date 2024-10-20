package com.facebook.ipc.composer.model.composedtext;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKH;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLComposedEntityType;
import com.facebook.graphql.model.GraphQLEntity;

/* loaded from: ComposedEntityRange.class */
public final class ComposedEntityRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(19);
    public final int A00;
    public final int A01;
    public final GraphQLComposedEntityType A02;
    public final GraphQLEntity A03;
    public final String A04;
    public final String A05;

    public ComposedEntityRange(Parcel parcel) {
        GraphQLComposedEntityType graphQLComposedEntityType = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? GraphQLComposedEntityType.values()[parcel.readInt()] : graphQLComposedEntityType;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public ComposedEntityRange(GraphQLComposedEntityType graphQLComposedEntityType, GraphQLEntity graphQLEntity, String str, String str2, int i, int i2) {
        this.A03 = graphQLEntity;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = graphQLComposedEntityType;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposedEntityRange)) {
                return false;
            }
            ComposedEntityRange composedEntityRange = (ComposedEntityRange) obj;
            if (!11T.A0O(this.A03, composedEntityRange.A03) || !11T.A0O(this.A04, composedEntityRange.A04) || !11T.A0O(this.A05, composedEntityRange.A05) || this.A02 != composedEntityRange.A02 || this.A00 != composedEntityRange.A00 || this.A01 != composedEntityRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A03(this.A03)));
        return (((((A04 * 31) + C3o5.A03(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        C3o5.A0e(parcel, this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
