package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLAsset3DCategory;
import com.facebook.graphql.model.GraphQLObjectWithAsset3D;
import com.facebook.ipc.media.data.MediaData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerThreedInfo.class */
public final class ComposerThreedInfo implements Parcelable {
    public static volatile GraphQLAsset3DCategory A0D;
    public static final Parcelable.Creator CREATOR = FKa.A00(73);
    public final GraphQLObjectWithAsset3D A00;
    public final MediaData A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final GraphQLAsset3DCategory A0B;
    public final Set A0C;

    public ComposerThreedInfo(Parcel parcel) {
        MediaData mediaData = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A0B = null;
        } else {
            this.A0B = GraphQLAsset3DCategory.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        int i = 0;
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A0A = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? DKG.A0Y(parcel) : mediaData;
        this.A07 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0C = Collections.unmodifiableSet(A0v);
    }

    public ComposerThreedInfo(GraphQLAsset3DCategory graphQLAsset3DCategory, GraphQLObjectWithAsset3D graphQLObjectWithAsset3D, MediaData mediaData, String str, String str2, String str3, String str4, String str5, String str6, Set set, boolean z, boolean z2, boolean z3) {
        this.A0B = graphQLAsset3DCategory;
        this.A00 = graphQLObjectWithAsset3D;
        this.A08 = z;
        this.A09 = z2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A0A = z3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = mediaData;
        this.A07 = str6;
        this.A0C = Collections.unmodifiableSet(set);
    }

    public GraphQLAsset3DCategory A00() {
        if (this.A0C.contains("asset3DCategory")) {
            return this.A0B;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = GraphQLAsset3DCategory.COMPOSER;
                }
            }
        }
        return A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerThreedInfo)) {
                return false;
            }
            ComposerThreedInfo composerThreedInfo = (ComposerThreedInfo) obj;
            if (A00() != composerThreedInfo.A00() || !11T.A0O(this.A00, composerThreedInfo.A00) || this.A08 != composerThreedInfo.A08 || this.A09 != composerThreedInfo.A09 || !11T.A0O(this.A02, composerThreedInfo.A02) || !11T.A0O(this.A03, composerThreedInfo.A03) || !11T.A0O(this.A04, composerThreedInfo.A04) || this.A0A != composerThreedInfo.A0A || !11T.A0O(this.A05, composerThreedInfo.A05) || !11T.A0O(this.A06, composerThreedInfo.A06) || !11T.A0O(this.A01, composerThreedInfo.A01) || !11T.A0O(this.A07, composerThreedInfo.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A01, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C3o5.A03(A00()) + 31), this.A08), this.A09)))), this.A0A)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A0B);
        DKH.A0y(parcel, this.A00);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A0A ? 1 : 0);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        DKH.A10(parcel, this.A01, i);
        1BL.A13(parcel, this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A0C);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
