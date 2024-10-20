package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLLifeEventAPIIdentifier;
import com.facebook.uicontrib.datepicker.Date;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LifeEventAttachmentData.class */
public final class LifeEventAttachmentData implements Parcelable {
    public static volatile GraphQLLifeEventAPIIdentifier A0K;
    public static final Parcelable.Creator CREATOR = FKa.A00(94);
    public final Date A00;
    public final Date A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final GraphQLLifeEventAPIIdentifier A0I;
    public final Set A0J;

    public LifeEventAttachmentData(Parcel parcel) {
        Date date = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Date) Date.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        this.A0C = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0D = 1BM.A07(parcel);
        this.A05 = parcel.readString();
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = GraphQLLifeEventAPIIdentifier.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A02 = ImmutableList.copyOf(strArr);
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr2, i3);
        }
        this.A03 = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A0G = 1BM.A07(parcel);
        this.A0H = AbJ.A1V(parcel);
        this.A01 = parcel.readInt() != 0 ? (Date) Date.CREATOR.createFromParcel(parcel) : date;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0J = Collections.unmodifiableSet(A0v);
    }

    public LifeEventAttachmentData(GraphQLLifeEventAPIIdentifier graphQLLifeEventAPIIdentifier, Date date, Date date2, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = str;
        this.A00 = date;
        this.A0C = z;
        this.A0D = z2;
        C1pq.A08("iconId", str2);
        this.A05 = str2;
        this.A0E = z3;
        this.A0F = z4;
        this.A06 = str3;
        this.A07 = str4;
        C1pq.A08("lifeEventTitle", str5);
        this.A08 = str5;
        this.A0I = graphQLLifeEventAPIIdentifier;
        this.A09 = str6;
        C1pq.A08("relationshipTaggedUserIds", immutableList);
        this.A02 = immutableList;
        C1pq.A08("remoteFbMediaIds", immutableList2);
        this.A03 = immutableList2;
        this.A0A = str7;
        this.A0B = str8;
        this.A0G = z5;
        this.A0H = z6;
        this.A01 = date2;
        this.A0J = Collections.unmodifiableSet(set);
    }

    public GraphQLLifeEventAPIIdentifier A00() {
        if (this.A0J.contains("lifeEventType")) {
            return this.A0I;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = GraphQLLifeEventAPIIdentifier.A01;
                }
            }
        }
        return A0K;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LifeEventAttachmentData)) {
                return false;
            }
            LifeEventAttachmentData lifeEventAttachmentData = (LifeEventAttachmentData) obj;
            if (!11T.A0O(this.A04, lifeEventAttachmentData.A04) || !11T.A0O(this.A00, lifeEventAttachmentData.A00) || this.A0C != lifeEventAttachmentData.A0C || this.A0D != lifeEventAttachmentData.A0D || !11T.A0O(this.A05, lifeEventAttachmentData.A05) || this.A0E != lifeEventAttachmentData.A0E || this.A0F != lifeEventAttachmentData.A0F || !11T.A0O(this.A06, lifeEventAttachmentData.A06) || !11T.A0O(this.A07, lifeEventAttachmentData.A07) || !11T.A0O(this.A08, lifeEventAttachmentData.A08) || A00() != lifeEventAttachmentData.A00() || !11T.A0O(this.A09, lifeEventAttachmentData.A09) || !11T.A0O(this.A02, lifeEventAttachmentData.A02) || !11T.A0O(this.A03, lifeEventAttachmentData.A03) || !11T.A0O(this.A0A, lifeEventAttachmentData.A0A) || !11T.A0O(this.A0B, lifeEventAttachmentData.A0B) || this.A0G != lifeEventAttachmentData.A0G || this.A0H != lifeEventAttachmentData.A0H || !11T.A0O(this.A01, lifeEventAttachmentData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C1pq.A03(this.A04)), this.A0C), this.A0D)), this.A0E), this.A0F))));
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A09, (A04 * 31) + C3o5.A03(A00())))))), this.A0G), this.A0H));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        Date date = this.A00;
        if (date == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            date.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        C3o5.A0e(parcel, this.A0I);
        1BL.A13(parcel, this.A09);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        Date date2 = this.A01;
        if (date2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            date2.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0J);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
