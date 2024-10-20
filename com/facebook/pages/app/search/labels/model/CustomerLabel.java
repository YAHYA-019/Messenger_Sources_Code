package com.facebook.pages.app.search.labels.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPageCommPlatform;
import com.facebook.graphql.enums.GraphQLXFBPageCustomLabelDataSilo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CustomerLabel.class */
public final class CustomerLabel implements Parcelable {
    public static volatile GraphQLPageCommPlatform A0A;
    public static volatile GraphQLXFBPageCustomLabelDataSilo A0B;
    public static final Parcelable.Creator CREATOR = new FKY(23);
    public final long A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final GraphQLPageCommPlatform A07;
    public final GraphQLXFBPageCustomLabelDataSilo A08;
    public final Set A09;

    public CustomerLabel(Parcel parcel) {
        GraphQLPageCommPlatform graphQLPageCommPlatform = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = GraphQLXFBPageCustomLabelDataSilo.values()[parcel.readInt()];
        }
        this.A00 = parcel.readLong();
        int i = 0;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = AbJ.A1V(parcel);
        this.A02 = parcel.readString();
        this.A07 = parcel.readInt() != 0 ? GraphQLPageCommPlatform.values()[parcel.readInt()] : graphQLPageCommPlatform;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public CustomerLabel(GraphQLPageCommPlatform graphQLPageCommPlatform, GraphQLXFBPageCustomLabelDataSilo graphQLXFBPageCustomLabelDataSilo, String str, String str2, Set set, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A08 = graphQLXFBPageCustomLabelDataSilo;
        this.A00 = j;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
        C1pq.A08("labelName", str2);
        this.A02 = str2;
        this.A07 = graphQLPageCommPlatform;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public GraphQLPageCommPlatform A00() {
        if (this.A09.contains("platform")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = GraphQLPageCommPlatform.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                }
            }
        }
        return A0A;
    }

    public GraphQLXFBPageCustomLabelDataSilo A01() {
        if (this.A09.contains("dataSilo")) {
            return this.A08;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = GraphQLXFBPageCustomLabelDataSilo.A01;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CustomerLabel)) {
                return false;
            }
            CustomerLabel customerLabel = (CustomerLabel) obj;
            if (!11T.A0O(this.A01, customerLabel.A01) || A01() != customerLabel.A01() || this.A00 != customerLabel.A00 || this.A03 != customerLabel.A03 || this.A04 != customerLabel.A04 || this.A05 != customerLabel.A05 || this.A06 != customerLabel.A06 || !11T.A0O(this.A02, customerLabel.A02) || A00() != customerLabel.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A01((C1pq.A03(this.A01) * 31) + C3o5.A03(A01()), this.A00), this.A03), this.A04), this.A05), this.A06));
        GraphQLPageCommPlatform A00 = A00();
        if (A00 != null) {
            i = A00.ordinal();
        }
        return (A04 * 31) + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        C3o5.A0e(parcel, this.A08);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
