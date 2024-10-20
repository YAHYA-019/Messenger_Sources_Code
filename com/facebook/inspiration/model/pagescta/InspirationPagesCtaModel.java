package com.facebook.inspiration.model.pagescta;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.ComposerLocation;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationPagesCtaModel.class */
public final class InspirationPagesCtaModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(66);
    public final ComposerLocation A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public InspirationPagesCtaModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A0B = AnonymousClass001.A1Q(parcel.readInt(), 1);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A0C = 1BM.A07(parcel);
        int readInt = parcel.readInt();
        InspirationPagesStructuredCtaModel[] inspirationPagesStructuredCtaModelArr = new InspirationPagesStructuredCtaModel[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationPagesStructuredCtaModelArr, i2);
        }
        this.A01 = ImmutableList.copyOf(inspirationPagesStructuredCtaModelArr);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ComposerLocation) ComposerLocation.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = AbJ.A1V(parcel);
        int readInt2 = parcel.readInt();
        InspirationPagesStructuredCtaModel[] inspirationPagesStructuredCtaModelArr2 = new InspirationPagesStructuredCtaModel[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, inspirationPagesStructuredCtaModelArr2, i3);
        }
        this.A02 = ImmutableList.copyOf(inspirationPagesStructuredCtaModelArr2);
        int readInt3 = parcel.readInt();
        InspirationPagesStructuredCtaModel[] inspirationPagesStructuredCtaModelArr3 = new InspirationPagesStructuredCtaModel[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbI.A01(parcel, A0e, inspirationPagesStructuredCtaModelArr3, i4);
        }
        this.A03 = ImmutableList.copyOf(inspirationPagesStructuredCtaModelArr3);
        int readInt4 = parcel.readInt();
        InspirationPagesStructuredCtaModel[] inspirationPagesStructuredCtaModelArr4 = new InspirationPagesStructuredCtaModel[readInt4];
        while (i < readInt4) {
            i = AbI.A01(parcel, A0e, inspirationPagesStructuredCtaModelArr4, i);
        }
        this.A04 = ImmutableList.copyOf(inspirationPagesStructuredCtaModelArr4);
        this.A0A = C3o5.A0O(parcel);
    }

    public InspirationPagesCtaModel(ComposerLocation composerLocation, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0B = z;
        this.A05 = str;
        this.A0C = z2;
        C1pq.A08("jobOpenings", immutableList);
        this.A01 = immutableList;
        this.A06 = str2;
        this.A00 = composerLocation;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0D = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = z6;
        C1pq.A08("taggableProducts", immutableList2);
        this.A02 = immutableList2;
        C1pq.A08("upcomingEvents", immutableList3);
        this.A03 = immutableList3;
        C1pq.A08("validOffers", immutableList4);
        this.A04 = immutableList4;
        this.A0A = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationPagesCtaModel)) {
                return false;
            }
            InspirationPagesCtaModel inspirationPagesCtaModel = (InspirationPagesCtaModel) obj;
            if (this.A0B != inspirationPagesCtaModel.A0B || !11T.A0O(this.A05, inspirationPagesCtaModel.A05) || this.A0C != inspirationPagesCtaModel.A0C || !11T.A0O(this.A01, inspirationPagesCtaModel.A01) || !11T.A0O(this.A06, inspirationPagesCtaModel.A06) || !11T.A0O(this.A00, inspirationPagesCtaModel.A00) || !11T.A0O(this.A07, inspirationPagesCtaModel.A07) || !11T.A0O(this.A08, inspirationPagesCtaModel.A08) || !11T.A0O(this.A09, inspirationPagesCtaModel.A09) || this.A0D != inspirationPagesCtaModel.A0D || this.A0E != inspirationPagesCtaModel.A0E || this.A0F != inspirationPagesCtaModel.A0F || this.A0G != inspirationPagesCtaModel.A0G || !11T.A0O(this.A02, inspirationPagesCtaModel.A02) || !11T.A0O(this.A03, inspirationPagesCtaModel.A03) || !11T.A0O(this.A04, inspirationPagesCtaModel.A04) || !11T.A0O(this.A0A, inspirationPagesCtaModel.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A00, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A05, C1pq.A05(this.A0B)), this.A0C))))))), this.A0D), this.A0E), this.A0F), this.A0G)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0B ? 1 : 0);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A0C ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationPagesStructuredCtaModel) A0b.next(), i);
        }
        1BL.A13(parcel, this.A06);
        ComposerLocation composerLocation = this.A00;
        if (composerLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLocation.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationPagesStructuredCtaModel) A0b2.next(), i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A03);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((InspirationPagesStructuredCtaModel) A0b3.next(), i);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A04);
        while (A0b4.hasNext()) {
            parcel.writeParcelable((InspirationPagesStructuredCtaModel) A0b4.next(), i);
        }
        1BL.A13(parcel, this.A0A);
    }
}
