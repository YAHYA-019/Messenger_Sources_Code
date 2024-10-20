package com.facebook.crossposting.contentcompatibility.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.EPE;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXCXPAppName;
import com.facebook.graphql.enums.GraphQLXCXPCXPAccountPrivacyType;
import com.facebook.graphql.enums.GraphQLXCXPCXPIdentityRemixSettingStatus;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CrossPostingMetadata.class */
public final class CrossPostingMetadata implements Parcelable {
    public static volatile EPE A0H;
    public static final Parcelable.Creator CREATOR = FKX.A00(57);
    public final EPE A00;
    public final GraphQLXCXPAppName A01;
    public final GraphQLXCXPCXPAccountPrivacyType A02;
    public final GraphQLXCXPCXPIdentityRemixSettingStatus A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public CrossPostingMetadata(EPE epe, GraphQLXCXPAppName graphQLXCXPAppName, GraphQLXCXPCXPAccountPrivacyType graphQLXCXPCXPAccountPrivacyType, GraphQLXCXPCXPIdentityRemixSettingStatus graphQLXCXPCXPIdentityRemixSettingStatus, ImmutableList immutableList, Integer num, String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = graphQLXCXPCXPAccountPrivacyType;
        this.A00 = epe;
        C1pq.A08("countOfLinkedDestination", num);
        this.A05 = num;
        this.A01 = graphQLXCXPAppName;
        this.A0A = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A0E = z5;
        this.A0F = z6;
        this.A06 = str;
        this.A03 = graphQLXCXPCXPIdentityRemixSettingStatus;
        this.A04 = immutableList;
        this.A0G = z7;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public CrossPostingMetadata(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = GraphQLXCXPCXPAccountPrivacyType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EPE.values()[parcel.readInt()];
        }
        this.A05 = AbI.A0z(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXCXPAppName.values()[parcel.readInt()];
        }
        int i = 0;
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = GraphQLXCXPCXPIdentityRemixSettingStatus.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A04 = ImmutableList.copyOf(strArr);
        }
        this.A0G = AbJ.A1V(parcel);
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public EPE A00() {
        if (this.A09.contains("contentIneligibility")) {
            return this.A00;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = EPE.A0O;
                }
            }
        }
        return A0H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CrossPostingMetadata)) {
                return false;
            }
            CrossPostingMetadata crossPostingMetadata = (CrossPostingMetadata) obj;
            if (this.A02 != crossPostingMetadata.A02 || A00() != crossPostingMetadata.A00() || !11T.A0O(this.A05, crossPostingMetadata.A05) || this.A01 != crossPostingMetadata.A01 || this.A0A != crossPostingMetadata.A0A || this.A0B != crossPostingMetadata.A0B || this.A0C != crossPostingMetadata.A0C || this.A0D != crossPostingMetadata.A0D || this.A0E != crossPostingMetadata.A0E || this.A0F != crossPostingMetadata.A0F || !11T.A0O(this.A06, crossPostingMetadata.A06) || this.A03 != crossPostingMetadata.A03 || !11T.A0O(this.A04, crossPostingMetadata.A04) || this.A0G != crossPostingMetadata.A0G || !11T.A0O(this.A07, crossPostingMetadata.A07) || !11T.A0O(this.A08, crossPostingMetadata.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C3o5.A03(this.A02) + 31;
        int A04 = C1pq.A04(this.A05, (A03 * 31) + C3o5.A03(A00()));
        int A042 = C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((A04 * 31) + C3o5.A03(this.A01), this.A0A), this.A0B), this.A0C), this.A0D), this.A0E), this.A0F));
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A02(C1pq.A04(this.A04, (A042 * 31) + DKF.A04(this.A03)), this.A0G)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A02);
        C3o5.A0e(parcel, this.A00);
        parcel.writeInt(this.A05.intValue());
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        1BL.A13(parcel, this.A06);
        C3o5.A0e(parcel, this.A03);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeInt(this.A0G ? 1 : 0);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
