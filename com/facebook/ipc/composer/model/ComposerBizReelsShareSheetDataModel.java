package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerBizReelsShareSheetDataModel.class */
public final class ComposerBizReelsShareSheetDataModel implements Parcelable {
    public static volatile Long A09;
    public static volatile String A0A;
    public static final Parcelable.Creator CREATOR = FKa.A00(2);
    public final GraphQLTextWithEntities A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final Long A06;
    public final String A07;
    public final Set A08;

    public ComposerBizReelsShareSheetDataModel(Parcel parcel) {
        GraphQLTextWithEntities graphQLTextWithEntities = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        int i = 0;
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = 7zO.A0j(parcel);
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readInt() != 0 ? (GraphQLTextWithEntities) FJ8.A01(parcel) : graphQLTextWithEntities;
        this.A03 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public ComposerBizReelsShareSheetDataModel(GraphQLTextWithEntities graphQLTextWithEntities, ImmutableList immutableList, Long l, String str, String str2, String str3, Set set, boolean z, boolean z2) {
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A07 = str2;
        this.A06 = l;
        C1pq.A08("selectedPlacements", immutableList);
        this.A01 = immutableList;
        this.A00 = graphQLTextWithEntities;
        this.A03 = str3;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public long A00() {
        Long l;
        if (this.A08.contains("schedulePublishTime")) {
            l = this.A06;
        } else {
            if (A09 == null) {
                synchronized (this) {
                    if (A09 == null) {
                        A09 = 4YV.A0j();
                    }
                }
            }
            l = A09;
        }
        return l.longValue();
    }

    public String A01() {
        if (this.A08.contains("publishOption")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = "NOW";
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerBizReelsShareSheetDataModel)) {
                return false;
            }
            ComposerBizReelsShareSheetDataModel composerBizReelsShareSheetDataModel = (ComposerBizReelsShareSheetDataModel) obj;
            if (!11T.A0O(this.A02, composerBizReelsShareSheetDataModel.A02) || this.A04 != composerBizReelsShareSheetDataModel.A04 || this.A05 != composerBizReelsShareSheetDataModel.A05 || !11T.A0O(A01(), composerBizReelsShareSheetDataModel.A01()) || A00() != composerBizReelsShareSheetDataModel.A00() || !11T.A0O(this.A01, composerBizReelsShareSheetDataModel.A01) || !11T.A0O(this.A00, composerBizReelsShareSheetDataModel.A00) || !11T.A0O(this.A03, composerBizReelsShareSheetDataModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A01(C1pq.A04(A01(), C1pq.A02(C1pq.A02(C1pq.A03(this.A02), this.A04), this.A05)), A00()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A07);
        C3o5.A0g(parcel, this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
