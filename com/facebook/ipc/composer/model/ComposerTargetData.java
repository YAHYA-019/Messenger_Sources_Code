package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C2223Dhf;
import X.C3o5;
import X.DKF;
import X.DKH;
import X.EOx;
import X.FJ8;
import X.FKa;
import X.GKq;
import X.RRe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLGroupPostStatus;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerTargetData.class */
public final class ComposerTargetData implements Parcelable, GKq {
    public static volatile GraphQLGroupPostStatus A0A;
    public static volatile EOx A0B;
    public static final Parcelable.Creator CREATOR = FKa.A00(71);
    public final long A00;
    public final C2223Dhf A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final GraphQLGroupPostStatus A07;
    public final EOx A08;
    public final Set A09;

    public ComposerTargetData(EOx eOx, Set set, long j) {
        this.A05 = false;
        this.A06 = false;
        this.A00 = j;
        this.A02 = "";
        this.A07 = null;
        this.A01 = null;
        this.A03 = "";
        this.A04 = null;
        this.A08 = eOx;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public ComposerTargetData(RRe rRe) {
        this.A05 = rRe.A08;
        this.A06 = rRe.A09;
        this.A00 = rRe.A00;
        String str = rRe.A04;
        C1pq.A08("targetName", str);
        this.A02 = str;
        this.A07 = rRe.A01;
        this.A01 = rRe.A02;
        String str2 = rRe.A05;
        C1pq.A08("targetProfilePicUrl", str2);
        this.A03 = str2;
        this.A04 = rRe.A06;
        this.A08 = rRe.A03;
        this.A09 = Collections.unmodifiableSet(rRe.A07);
    }

    public ComposerTargetData(Parcel parcel) {
        int i = 0;
        this.A05 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A06 = AbJ.A1V(parcel);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        EOx eOx = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = GraphQLGroupPostStatus.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (C2223Dhf) FJ8.A01(parcel);
        }
        this.A03 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A08 = parcel.readInt() != 0 ? EOx.values()[parcel.readInt()] : eOx;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public GraphQLGroupPostStatus A00() {
        if (this.A09.contains("targetPostStatus")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = GraphQLGroupPostStatus.A02;
                }
            }
        }
        return A0A;
    }

    public EOx A01() {
        if (this.A09.contains("targetType")) {
            return this.A08;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = EOx.A0G;
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
            if (!(obj instanceof ComposerTargetData)) {
                return false;
            }
            ComposerTargetData composerTargetData = (ComposerTargetData) obj;
            if (this.A05 != composerTargetData.A05 || this.A06 != composerTargetData.A06 || this.A00 != composerTargetData.A00 || !11T.A0O(this.A02, composerTargetData.A02) || A00() != composerTargetData.A00() || !11T.A0O(this.A01, composerTargetData.A01) || !11T.A0O(this.A03, composerTargetData.A03) || !11T.A0O(this.A04, composerTargetData.A04) || A01() != composerTargetData.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A01(C1pq.A02(C1pq.A05(this.A05), this.A06), this.A00));
        int A042 = C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, (A04 * 31) + C3o5.A03(A00()))));
        return (A042 * 31) + DKF.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A07);
        DKH.A0y(parcel, this.A01);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        C3o5.A0e(parcel, this.A08);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
