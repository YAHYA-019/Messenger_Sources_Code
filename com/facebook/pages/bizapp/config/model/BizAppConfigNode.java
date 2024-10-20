package com.facebook.pages.bizapp.config.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: BizAppConfigNode.class */
public final class BizAppConfigNode implements Parcelable {
    public static volatile BizAppBusinessPermissions A0c;
    public static volatile String A0d;
    public static final Parcelable.Creator CREATOR = new FKY(25);
    public final long A00;
    public final long A01;
    public final ImmutableList A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final BizAppBusinessPermissions A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final Set A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public BizAppConfigNode(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (BizAppBusinessPermissions) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        this.A05 = parcel.readInt();
        int i = 0;
        boolean z = true;
        this.A0W = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        this.A0Z = 1BM.A07(parcel);
        this.A06 = parcel.readLong();
        this.A0a = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A07 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A09 = parcel.readLong();
        this.A0A = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        this.A00 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = parcel.readString();
        }
        this.A0B = parcel.readLong();
        this.A0C = parcel.readLong();
        this.A0R = parcel.readString();
        this.A0S = parcel.readString();
        this.A0D = parcel.readLong();
        this.A0E = parcel.readLong();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            strArr[i2] = parcel.readString();
        }
        this.A0G = ImmutableList.copyOf(strArr);
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = parcel.readString();
        }
        this.A0b = parcel.readInt() != 1 ? false : z;
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        for (int i3 = 0; i3 < readInt2; i3++) {
            strArr2[i3] = parcel.readString();
        }
        this.A02 = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            String[] strArr3 = new String[readInt3];
            for (int i4 = 0; i4 < readInt3; i4++) {
                strArr3[i4] = parcel.readString();
            }
            immutableList = ImmutableList.copyOf(strArr3);
        }
        this.A0H = immutableList;
        this.A0U = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt4 = parcel.readInt();
        while (i < readInt4) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0V = Collections.unmodifiableSet(A0v);
    }

    public BizAppConfigNode(BizAppBusinessPermissions bizAppBusinessPermissions, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Set set, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0F = bizAppBusinessPermissions;
        this.A0I = str;
        this.A0J = str2;
        this.A05 = i;
        this.A0W = z;
        this.A0X = z2;
        this.A0Y = z3;
        this.A0Z = z4;
        this.A06 = j;
        this.A0a = z5;
        this.A03 = z6;
        this.A04 = z7;
        this.A07 = j2;
        this.A08 = j3;
        this.A09 = j4;
        this.A0A = j5;
        this.A0K = str3;
        this.A0L = str4;
        this.A0M = str5;
        this.A0N = str6;
        this.A0O = str7;
        this.A00 = j6;
        this.A0P = str8;
        this.A0Q = str9;
        this.A0B = j7;
        this.A0C = j8;
        this.A0R = str10;
        this.A0S = str11;
        this.A0D = j9;
        this.A0E = j10;
        this.A0G = immutableList;
        this.A01 = j11;
        this.A0T = str12;
        this.A0b = z8;
        C1pq.A08("supportedPageBasedExperiments", immutableList2);
        this.A02 = immutableList2;
        this.A0H = immutableList3;
        this.A0U = str13;
        this.A0V = Collections.unmodifiableSet(set);
    }

    private BizAppBusinessPermissions A00() {
        if (this.A0V.contains("businessPermissions")) {
            return this.A0F;
        }
        if (A0c == null) {
            synchronized (this) {
                if (A0c == null) {
                    A0c = new BizAppBusinessPermissions(false, false, false, false, false, false, false, false, false, false, false, false);
                }
            }
        }
        return A0c;
    }

    private String A01() {
        if (this.A0V.contains("toolReadinessStatus")) {
            return this.A0U;
        }
        if (A0d == null) {
            synchronized (this) {
                if (A0d == null) {
                    A0d = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BizAppConfigNode)) {
                return false;
            }
            BizAppConfigNode bizAppConfigNode = (BizAppConfigNode) obj;
            if (!11T.A0O(A00(), bizAppConfigNode.A00()) || !11T.A0O(this.A0I, bizAppConfigNode.A0I) || !11T.A0O(this.A0J, bizAppConfigNode.A0J) || this.A05 != bizAppConfigNode.A05 || this.A0W != bizAppConfigNode.A0W || this.A0X != bizAppConfigNode.A0X || this.A0Y != bizAppConfigNode.A0Y || this.A0Z != bizAppConfigNode.A0Z || this.A06 != bizAppConfigNode.A06 || this.A0a != bizAppConfigNode.A0a || this.A03 != bizAppConfigNode.A03 || this.A04 != bizAppConfigNode.A04 || this.A07 != bizAppConfigNode.A07 || this.A08 != bizAppConfigNode.A08 || this.A09 != bizAppConfigNode.A09 || this.A0A != bizAppConfigNode.A0A || !11T.A0O(this.A0K, bizAppConfigNode.A0K) || !11T.A0O(this.A0L, bizAppConfigNode.A0L) || !11T.A0O(this.A0M, bizAppConfigNode.A0M) || !11T.A0O(this.A0N, bizAppConfigNode.A0N) || !11T.A0O(this.A0O, bizAppConfigNode.A0O) || this.A00 != bizAppConfigNode.A00 || !11T.A0O(this.A0P, bizAppConfigNode.A0P) || !11T.A0O(this.A0Q, bizAppConfigNode.A0Q) || this.A0B != bizAppConfigNode.A0B || this.A0C != bizAppConfigNode.A0C || !11T.A0O(this.A0R, bizAppConfigNode.A0R) || !11T.A0O(this.A0S, bizAppConfigNode.A0S) || this.A0D != bizAppConfigNode.A0D || this.A0E != bizAppConfigNode.A0E || !11T.A0O(this.A0G, bizAppConfigNode.A0G) || this.A01 != bizAppConfigNode.A01 || !11T.A0O(this.A0T, bizAppConfigNode.A0T) || this.A0b != bizAppConfigNode.A0b || !11T.A0O(this.A02, bizAppConfigNode.A02) || !11T.A0O(this.A0H, bizAppConfigNode.A0H) || !11T.A0O(A01(), bizAppConfigNode.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A04(this.A0H, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A0T, C1pq.A01(C1pq.A04(this.A0G, C1pq.A01(C1pq.A01(C1pq.A04(this.A0S, C1pq.A04(this.A0R, C1pq.A01(C1pq.A01(C1pq.A04(this.A0Q, C1pq.A04(this.A0P, C1pq.A01(C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A03(A00()))) * 31) + this.A05, this.A0W), this.A0X), this.A0Y), this.A0Z), this.A06), this.A0a), this.A03), this.A04), this.A07), this.A08), this.A09), this.A0A)))))), this.A00))), this.A0B), this.A0C))), this.A0D), this.A0E)), this.A01)), this.A0b))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A0F, i);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A0A);
        1BL.A13(parcel, this.A0K);
        1BL.A13(parcel, this.A0L);
        1BL.A13(parcel, this.A0M);
        1BL.A13(parcel, this.A0N);
        1BL.A13(parcel, this.A0O);
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A0P);
        1BL.A13(parcel, this.A0Q);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0C);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0E);
        1Du A0b = 1BL.A0b(parcel, this.A0G);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeLong(this.A01);
        1BL.A13(parcel, this.A0T);
        parcel.writeInt(this.A0b ? 1 : 0);
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        ImmutableList immutableList = this.A0H;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b3 = 1BL.A0b(parcel, immutableList);
            while (A0b3.hasNext()) {
                C3o5.A0h(parcel, A0b3);
            }
        }
        1BL.A13(parcel, this.A0U);
        Iterator A0S = C3o5.A0S(parcel, this.A0V);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
