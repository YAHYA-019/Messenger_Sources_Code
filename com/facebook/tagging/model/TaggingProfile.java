package com.facebook.tagging.model;

import X.1BJ;
import X.1BL;
import X.1BM;
import X.7zN;
import X.AbJ;
import X.AnonymousClass001;
import X.C53v;
import X.DKD;
import X.EM9;
import X.Er0;
import X.FKe;
import X.RPM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.enums.GraphQLAccountClaimStatus;
import com.facebook.graphql.enums.GraphQLWorkForeignEntityType;
import com.facebook.user.model.Name;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: TaggingProfile.class */
public class TaggingProfile implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(77);
    public GraphQLWorkForeignEntityType A00;
    public ImmutableList A01;
    public double A02;
    public final long A03;
    public final EM9 A04;
    public final Name A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final GraphQLAccountClaimStatus A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0N;

    public TaggingProfile(Er0 er0) {
        this.A01 = ImmutableList.of();
        this.A05 = er0.A05;
        this.A03 = er0.A01;
        this.A09 = er0.A08;
        this.A07 = null;
        this.A0B = er0.A0B;
        this.A04 = er0.A04;
        this.A0N = false;
        this.A0A = er0.A09;
        this.A0L = er0.A0A;
        this.A08 = er0.A07;
        this.A0C = er0.A0C;
        this.A0I = er0.A0G;
        this.A0M = null;
        this.A0J = er0.A02;
        this.A0H = false;
        this.A0E = er0.A0D;
        this.A0G = er0.A0F;
        this.A0F = er0.A0E;
        this.A02 = er0.A00;
        this.A0D = null;
        this.A06 = null;
        this.A00 = er0.A03;
        this.A01 = er0.A06;
        this.A0K = null;
    }

    public TaggingProfile(Parcel parcel) {
        this.A01 = ImmutableList.of();
        this.A05 = (Name) 1BL.A0C(parcel, Name.class);
        this.A03 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0D = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = EM9.values()[parcel.readInt()];
        this.A0N = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0A = parcel.readString();
        this.A0L = parcel.readString();
        this.A08 = parcel.readString();
        this.A0C = parcel.readString();
        this.A0I = 1BM.A07(parcel);
        this.A0M = parcel.readString();
        this.A0J = (GraphQLAccountClaimStatus) C53v.A07(parcel, GraphQLAccountClaimStatus.class);
        this.A0H = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = AbJ.A1W(parcel);
        this.A00 = (GraphQLWorkForeignEntityType) C53v.A07(parcel, GraphQLWorkForeignEntityType.class);
        this.A02 = parcel.readDouble();
        this.A01 = C53v.A01(parcel);
        this.A0K = parcel.readString();
    }

    public TaggingProfile(GraphQLAccountClaimStatus graphQLAccountClaimStatus, GraphQLWorkForeignEntityType graphQLWorkForeignEntityType, EM9 em9, Name name, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = ImmutableList.of();
        this.A05 = name;
        this.A03 = j;
        this.A09 = str4;
        this.A07 = str2;
        this.A0B = str7;
        this.A04 = em9;
        this.A0N = z;
        this.A0A = str5;
        this.A0L = str6;
        this.A08 = str3;
        this.A0C = str8;
        this.A0I = false;
        this.A0M = null;
        this.A0J = graphQLAccountClaimStatus;
        this.A0H = z5;
        this.A0E = z2;
        this.A0G = z4;
        this.A0F = z3;
        this.A02 = d;
        this.A0D = str9;
        this.A06 = str;
        this.A00 = graphQLWorkForeignEntityType;
        this.A01 = immutableList;
        this.A0K = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static EM9 A00(String str) {
        if (str != null) {
            Preconditions.checkArgument(!1BJ.A00(300).equals(str));
            switch (str.hashCode()) {
                case -1932766292:
                    if (str.equals("Hashtag")) {
                        return EM9.A09;
                    }
                    break;
                case -1038540822:
                    if (str.equals("PageWhatsAppNumber")) {
                        return EM9.A0B;
                    }
                    break;
                case 2479791:
                    if (str.equals("Page")) {
                        return EM9.A0A;
                    }
                    break;
                case 2645995:
                    if (str.equals("User")) {
                        return EM9.A0G;
                    }
                    break;
                case 67338874:
                    if (str.equals("Event")) {
                        return EM9.A04;
                    }
                    break;
                case 69076575:
                    if (str.equals("Group")) {
                        return EM9.A06;
                    }
                    break;
                case 520931835:
                    if (str.equals("GroupRule")) {
                        return EM9.A07;
                    }
                    break;
                case 1562753717:
                    if (str.equals("GroupRulesTaggingEntry")) {
                        return EM9.A08;
                    }
                    break;
                case 1942302979:
                    if (str.equals("BatchMentions")) {
                        return EM9.A01;
                    }
                    break;
            }
        }
        return EM9.A0F;
    }

    public static List A01(RPM rpm, List list) {
        boolean z = rpm.A0G;
        if (z && rpm.A0C && rpm.A0F && rpm.A0H && rpm.A0D) {
            return list;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TaggingProfile taggingProfile = (TaggingProfile) it.next();
            if (z || taggingProfile.A04 != EM9.A0D) {
                if (rpm.A0C || taggingProfile.A04 != EM9.A0G) {
                    if (rpm.A0F || taggingProfile.A04 != EM9.A0A) {
                        if (rpm.A0H || taggingProfile.A04 != EM9.A0E) {
                            if (rpm.A0D || taggingProfile.A04 != EM9.A06) {
                                A0s.add(taggingProfile);
                            }
                        }
                    }
                }
            }
        }
        return A0s;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.A03).compareTo(Long.valueOf(((TaggingProfile) obj).A03));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (((com.facebook.tagging.model.TaggingProfile) r302).A03 != r301.A03) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.tagging.model.TaggingProfile
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r302
            com.facebook.tagging.model.TaggingProfile r0 = (com.facebook.tagging.model.TaggingProfile) r0
            r302 = r0
            r0 = r302
            long r0 = r0.A03
            r304 = r0
            r0 = r301
            long r0 = r0.A03
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 == 0) goto L28
        L26:
            r0 = 0
            r303 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tagging.model.TaggingProfile.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return DKD.A04(Long.valueOf(this.A03));
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("%s (%s: %d)", this.A05, this.A04, Long.valueOf(this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A06);
        7zN.A0z(parcel, this.A04);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0M);
        C53v.A0J(parcel, this.A0J);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        C53v.A0J(parcel, this.A00);
        parcel.writeDouble(this.A02);
        ImmutableList immutableList = this.A01;
        immutableList.getClass();
        parcel.writeStringList(immutableList);
        parcel.writeString(this.A0K);
    }
}
