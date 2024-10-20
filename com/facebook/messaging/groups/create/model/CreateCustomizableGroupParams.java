package com.facebook.messaging.groups.create.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.graphql.enums.GraphQLGroupVisibility;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CreateCustomizableGroupParams.class */
public final class CreateCustomizableGroupParams implements Parcelable {
    public static volatile TriState A0N;
    public static volatile TriState A0O;
    public static volatile TriState A0P;
    public static volatile TriState A0Q;
    public static volatile ImmutableList A0R;
    public static volatile ImmutableList A0S;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(68);
    public final long A00;
    public final TriState A01;
    public final TriState A02;
    public final TriState A03;
    public final TriState A04;
    public final FbTraceNode A05;
    public final GraphQLGroupVisibility A06;
    public final LoggingParams A07;
    public final MediaResource A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Set A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public CreateCustomizableGroupParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        String str = null;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt = parcel.readInt();
            User[] userArr = new User[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, userArr, i2);
            }
            this.A09 = ImmutableList.copyOf(userArr);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = TriState.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbTraceNode) FbTraceNode.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (MediaResource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = GraphQLGroupVisibility.values()[parcel.readInt()];
        }
        this.A0J = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = TriState.values()[parcel.readInt()];
        }
        this.A0K = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = TriState.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (LoggingParams) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt2 = parcel.readInt();
            User[] userArr2 = new User[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbI.A01(parcel, A0e, userArr2, i3);
            }
            this.A0A = ImmutableList.copyOf(userArr2);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = TriState.values()[parcel.readInt()];
        }
        this.A0L = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A0G = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0H = C3o5.A0O(parcel);
        this.A0M = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0I = Collections.unmodifiableSet(A0v);
    }

    public CreateCustomizableGroupParams(TriState triState, TriState triState2, TriState triState3, TriState triState4, FbTraceNode fbTraceNode, GraphQLGroupVisibility graphQLGroupVisibility, LoggingParams loggingParams, MediaResource mediaResource, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = immutableList;
        this.A01 = triState;
        this.A0B = str;
        this.A0C = str2;
        this.A05 = fbTraceNode;
        this.A0D = str3;
        this.A0E = str4;
        this.A08 = mediaResource;
        this.A06 = graphQLGroupVisibility;
        this.A0J = z;
        this.A02 = triState2;
        this.A0K = z2;
        this.A03 = triState3;
        this.A07 = loggingParams;
        this.A00 = j;
        this.A0A = immutableList2;
        this.A04 = triState4;
        this.A0L = z3;
        this.A0F = str5;
        this.A0G = str6;
        this.A0H = str7;
        this.A0M = z4;
        this.A0I = Collections.unmodifiableSet(set);
    }

    public TriState A00() {
        if (this.A0I.contains("discoverableEnabled")) {
            return this.A01;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    A0N = TriState.UNSET;
                }
            }
        }
        return A0N;
    }

    public TriState A01() {
        if (this.A0I.contains("isJoinable")) {
            return this.A02;
        }
        if (A0O == null) {
            synchronized (this) {
                if (A0O == null) {
                    A0O = TriState.UNSET;
                }
            }
        }
        return A0O;
    }

    public TriState A02() {
        if (this.A0I.contains("isVideoRoom")) {
            return this.A03;
        }
        if (A0P == null) {
            synchronized (this) {
                if (A0P == null) {
                    A0P = TriState.UNSET;
                }
            }
        }
        return A0P;
    }

    public TriState A03() {
        if (this.A0I.contains("requireApprovalState")) {
            return this.A04;
        }
        if (A0Q == null) {
            synchronized (this) {
                if (A0Q == null) {
                    A0Q = TriState.UNSET;
                }
            }
        }
        return A0Q;
    }

    public ImmutableList A04() {
        if (this.A0I.contains("coAdmins")) {
            return this.A09;
        }
        if (A0R == null) {
            synchronized (this) {
                if (A0R == null) {
                    A0R = ImmutableList.of();
                }
            }
        }
        return A0R;
    }

    public ImmutableList A05() {
        if (this.A0I.contains("participants")) {
            return this.A0A;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = ImmutableList.of();
                }
            }
        }
        return A0S;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreateCustomizableGroupParams)) {
                return false;
            }
            CreateCustomizableGroupParams createCustomizableGroupParams = (CreateCustomizableGroupParams) obj;
            if (!11T.A0O(A04(), createCustomizableGroupParams.A04()) || A00() != createCustomizableGroupParams.A00() || !11T.A0O(this.A0B, createCustomizableGroupParams.A0B) || !11T.A0O(this.A0C, createCustomizableGroupParams.A0C) || !11T.A0O(this.A05, createCustomizableGroupParams.A05) || !11T.A0O(this.A0D, createCustomizableGroupParams.A0D) || !11T.A0O(this.A0E, createCustomizableGroupParams.A0E) || !11T.A0O(this.A08, createCustomizableGroupParams.A08) || this.A06 != createCustomizableGroupParams.A06 || this.A0J != createCustomizableGroupParams.A0J || A01() != createCustomizableGroupParams.A01() || this.A0K != createCustomizableGroupParams.A0K || A02() != createCustomizableGroupParams.A02() || !11T.A0O(this.A07, createCustomizableGroupParams.A07) || this.A00 != createCustomizableGroupParams.A00 || !11T.A0O(A05(), createCustomizableGroupParams.A05()) || A03() != createCustomizableGroupParams.A03() || this.A0L != createCustomizableGroupParams.A0L || !11T.A0O(this.A0F, createCustomizableGroupParams.A0F) || !11T.A0O(this.A0G, createCustomizableGroupParams.A0G) || !11T.A0O(this.A0H, createCustomizableGroupParams.A0H) || this.A0M != createCustomizableGroupParams.A0M) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(A05(), C1pq.A01(C1pq.A04(this.A07, (C1pq.A02((C1pq.A02((C1pq.A04(this.A08, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A05, C1pq.A04(this.A0C, C1pq.A04(this.A0B, (C1pq.A03(A04()) * 31) + C3o5.A03(A00()))))))) * 31) + C3o5.A03(this.A06), this.A0J) * 31) + C3o5.A03(A01()), this.A0K) * 31) + C3o5.A03(A02())), this.A00));
        TriState A03 = A03();
        if (A03 != null) {
            i = A03.ordinal();
        }
        return C1pq.A02(C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A02((A04 * 31) + i, this.A0L)))), this.A0M);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A09;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable(AbG.A0t(A0Y), i);
            }
        }
        C3o5.A0e(parcel, this.A01);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        FbTraceNode fbTraceNode = this.A05;
        if (fbTraceNode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fbTraceNode.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        C3o5.A0d(parcel, this.A08, i);
        C3o5.A0e(parcel, this.A06);
        parcel.writeInt(this.A0J ? 1 : 0);
        C3o5.A0e(parcel, this.A02);
        parcel.writeInt(this.A0K ? 1 : 0);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0d(parcel, this.A07, i);
        parcel.writeLong(this.A00);
        ImmutableList immutableList2 = this.A0A;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable(AbG.A0t(A0Y2), i);
            }
        }
        C3o5.A0e(parcel, this.A04);
        parcel.writeInt(this.A0L ? 1 : 0);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        parcel.writeInt(this.A0M ? 1 : 0);
        Iterator A0S2 = C3o5.A0S(parcel, this.A0I);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
