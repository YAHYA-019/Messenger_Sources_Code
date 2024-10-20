package com.facebook.stories.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLFriendshipStatus;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AudienceControlData.class */
public final class AudienceControlData implements Parcelable {
    public static volatile GraphQLFriendshipStatus A0N;
    public static final Parcelable.Creator CREATOR = FKe.A00(65);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final GraphQLFriendshipStatus A0L;
    public final Set A0M;

    public AudienceControlData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        this.A00 = parcel.readInt();
        int i = 0;
        this.A0D = AnonymousClass001.A1Q(parcel.readInt(), 1);
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
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = GraphQLFriendshipStatus.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = 1BM.A07(parcel);
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A0B = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = parcel.readInt();
        this.A0C = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0M = Collections.unmodifiableSet(A0v);
    }

    public AudienceControlData(GraphQLFriendshipStatus graphQLFriendshipStatus, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = num;
        this.A00 = i;
        this.A0D = z;
        this.A05 = str;
        this.A06 = str2;
        this.A0L = graphQLFriendshipStatus;
        this.A01 = i2;
        AbF.A1T(str3);
        this.A07 = str3;
        this.A0E = z2;
        this.A0F = z3;
        this.A0G = z4;
        this.A0H = z5;
        this.A0I = z6;
        this.A0J = z7;
        this.A0K = z8;
        this.A08 = str4;
        this.A09 = str5;
        this.A04 = num2;
        this.A0A = str6;
        this.A0B = str7;
        this.A02 = i3;
        this.A0C = str8;
        this.A0M = Collections.unmodifiableSet(set);
    }

    public GraphQLFriendshipStatus A00() {
        if (this.A0M.contains("friendshipStatus")) {
            return this.A0L;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    A0N = GraphQLFriendshipStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                }
            }
        }
        return A0N;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudienceControlData)) {
                return false;
            }
            AudienceControlData audienceControlData = (AudienceControlData) obj;
            if (!11T.A0O(this.A03, audienceControlData.A03) || this.A00 != audienceControlData.A00 || this.A0D != audienceControlData.A0D || !11T.A0O(this.A05, audienceControlData.A05) || !11T.A0O(this.A06, audienceControlData.A06) || A00() != audienceControlData.A00() || this.A01 != audienceControlData.A01 || !11T.A0O(this.A07, audienceControlData.A07) || this.A0E != audienceControlData.A0E || this.A0F != audienceControlData.A0F || this.A0G != audienceControlData.A0G || this.A0H != audienceControlData.A0H || this.A0I != audienceControlData.A0I || this.A0J != audienceControlData.A0J || this.A0K != audienceControlData.A0K || !11T.A0O(this.A08, audienceControlData.A08) || !11T.A0O(this.A09, audienceControlData.A09) || !11T.A0O(this.A04, audienceControlData.A04) || !11T.A0O(this.A0A, audienceControlData.A0A) || !11T.A0O(this.A0B, audienceControlData.A0B) || this.A02 != audienceControlData.A02 || !11T.A0O(this.A0C, audienceControlData.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A02((C1pq.A03(this.A03) * 31) + this.A00, this.A0D)));
        return C1pq.A04(this.A0C, (C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A04, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A07, (((A04 * 31) + C3o5.A03(A00())) * 31) + this.A01), this.A0E), this.A0F), this.A0G), this.A0H), this.A0I), this.A0J), this.A0K)))))) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0e(parcel, this.A0L);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        C3o5.A0f(parcel, this.A04);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        parcel.writeInt(this.A02);
        1BL.A13(parcel, this.A0C);
        Iterator A0S = C3o5.A0S(parcel, this.A0M);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
