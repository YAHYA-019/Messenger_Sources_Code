package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMG;
import X.FKf;
import X.RPN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBAIGenModelFailureType;
import com.facebook.inspiration.genai.aibackdrop.model.AIBackdropImage;
import com.facebook.inspiration.genai.aibackdrop.model.AIBackdropSemanticSegment;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationAIBackdropData.class */
public final class InspirationAIBackdropData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(42);
    public final int A00;
    public final int A01;
    public final GraphQLXFBAIGenModelFailureType A02;
    public final EMG A03;
    public final EMG A04;
    public final MediaData A05;
    public final MediaData A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public InspirationAIBackdropData(RPN rpn) {
        ImmutableList immutableList = rpn.A07;
        C1pq.A08("backedUpGeneratedImages", immutableList);
        this.A07 = immutableList;
        this.A05 = rpn.A05;
        this.A03 = rpn.A03;
        this.A00 = rpn.A00;
        this.A08 = rpn.A08;
        this.A02 = rpn.A02;
        ImmutableList immutableList2 = rpn.A09;
        C1pq.A08("generatedImages", immutableList2);
        this.A09 = immutableList2;
        this.A01 = rpn.A01;
        this.A0I = rpn.A0I;
        this.A0J = rpn.A0J;
        this.A0K = rpn.A0K;
        this.A0L = rpn.A0L;
        this.A06 = rpn.A06;
        this.A0F = rpn.A0F;
        this.A04 = rpn.A04;
        ImmutableList immutableList3 = rpn.A0A;
        C1pq.A08("pinnedPrompts", immutableList3);
        this.A0A = immutableList3;
        this.A0G = rpn.A0G;
        this.A0H = rpn.A0H;
        ImmutableList immutableList4 = rpn.A0B;
        C1pq.A08("segments", immutableList4);
        this.A0B = immutableList4;
        ImmutableList immutableList5 = rpn.A0C;
        C1pq.A08("selectedSegments", immutableList5);
        this.A0C = immutableList5;
        ImmutableList immutableList6 = rpn.A0D;
        C1pq.A08("suggestedPromptReserves", immutableList6);
        this.A0D = immutableList6;
        ImmutableList immutableList7 = rpn.A0E;
        C1pq.A08("suggestedPrompts", immutableList7);
        this.A0E = immutableList7;
    }

    public InspirationAIBackdropData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        AIBackdropImage[] aIBackdropImageArr = new AIBackdropImage[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = DKG.A02(parcel, AIBackdropImage.CREATOR, aIBackdropImageArr, i2);
        }
        this.A07 = ImmutableList.copyOf(aIBackdropImageArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = EMG.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt = parcel.readInt();
            AIBackdropSemanticSegment[] aIBackdropSemanticSegmentArr = new AIBackdropSemanticSegment[readInt];
            int i3 = 0;
            while (i3 < readInt) {
                i3 = DKG.A02(parcel, AIBackdropSemanticSegment.CREATOR, aIBackdropSemanticSegmentArr, i3);
            }
            this.A08 = ImmutableList.copyOf(aIBackdropSemanticSegmentArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = GraphQLXFBAIGenModelFailureType.values()[parcel.readInt()];
        }
        int readInt2 = parcel.readInt();
        AIBackdropImage[] aIBackdropImageArr2 = new AIBackdropImage[readInt2];
        int i4 = 0;
        while (i4 < readInt2) {
            i4 = DKG.A02(parcel, AIBackdropImage.CREATOR, aIBackdropImageArr2, i4);
        }
        this.A09 = ImmutableList.copyOf(aIBackdropImageArr2);
        this.A01 = parcel.readInt();
        this.A0I = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A0L = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = EMG.values()[parcel.readInt()];
        }
        int readInt3 = parcel.readInt();
        String[] strArr = new String[readInt3];
        int i5 = 0;
        while (i5 < readInt3) {
            i5 = AbH.A00(parcel, strArr, i5);
        }
        this.A0A = ImmutableList.copyOf(strArr);
        this.A0G = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0H = C3o5.A0O(parcel);
        int readInt4 = parcel.readInt();
        AIBackdropSemanticSegment[] aIBackdropSemanticSegmentArr2 = new AIBackdropSemanticSegment[readInt4];
        int i6 = 0;
        while (i6 < readInt4) {
            i6 = DKG.A02(parcel, AIBackdropSemanticSegment.CREATOR, aIBackdropSemanticSegmentArr2, i6);
        }
        this.A0B = ImmutableList.copyOf(aIBackdropSemanticSegmentArr2);
        int readInt5 = parcel.readInt();
        AIBackdropSemanticSegment[] aIBackdropSemanticSegmentArr3 = new AIBackdropSemanticSegment[readInt5];
        int i7 = 0;
        while (i7 < readInt5) {
            i7 = DKG.A02(parcel, AIBackdropSemanticSegment.CREATOR, aIBackdropSemanticSegmentArr3, i7);
        }
        this.A0C = ImmutableList.copyOf(aIBackdropSemanticSegmentArr3);
        int readInt6 = parcel.readInt();
        String[] strArr2 = new String[readInt6];
        int i8 = 0;
        while (i8 < readInt6) {
            i8 = AbH.A00(parcel, strArr2, i8);
        }
        this.A0D = ImmutableList.copyOf(strArr2);
        int readInt7 = parcel.readInt();
        String[] strArr3 = new String[readInt7];
        while (i < readInt7) {
            i = AbH.A00(parcel, strArr3, i);
        }
        this.A0E = ImmutableList.copyOf(strArr3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAIBackdropData)) {
                return false;
            }
            InspirationAIBackdropData inspirationAIBackdropData = (InspirationAIBackdropData) obj;
            if (!11T.A0O(this.A07, inspirationAIBackdropData.A07) || !11T.A0O(this.A05, inspirationAIBackdropData.A05) || this.A03 != inspirationAIBackdropData.A03 || this.A00 != inspirationAIBackdropData.A00 || !11T.A0O(this.A08, inspirationAIBackdropData.A08) || this.A02 != inspirationAIBackdropData.A02 || !11T.A0O(this.A09, inspirationAIBackdropData.A09) || this.A01 != inspirationAIBackdropData.A01 || this.A0I != inspirationAIBackdropData.A0I || this.A0J != inspirationAIBackdropData.A0J || this.A0K != inspirationAIBackdropData.A0K || this.A0L != inspirationAIBackdropData.A0L || !11T.A0O(this.A06, inspirationAIBackdropData.A06) || !11T.A0O(this.A0F, inspirationAIBackdropData.A0F) || this.A04 != inspirationAIBackdropData.A04 || !11T.A0O(this.A0A, inspirationAIBackdropData.A0A) || !11T.A0O(this.A0G, inspirationAIBackdropData.A0G) || !11T.A0O(this.A0H, inspirationAIBackdropData.A0H) || !11T.A0O(this.A0B, inspirationAIBackdropData.A0B) || !11T.A0O(this.A0C, inspirationAIBackdropData.A0C) || !11T.A0O(this.A0D, inspirationAIBackdropData.A0D) || !11T.A0O(this.A0E, inspirationAIBackdropData.A0E)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A05, C1pq.A03(this.A07));
        int A042 = C1pq.A04(this.A08, (((A04 * 31) + C3o5.A03(this.A03)) * 31) + this.A00);
        int A043 = C1pq.A04(this.A0F, C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(this.A09, (A042 * 31) + C3o5.A03(this.A02)) * 31) + this.A01, this.A0I), this.A0J), this.A0K), this.A0L)));
        return C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0A, (A043 * 31) + DKF.A04(this.A04))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A07);
        while (A0b.hasNext()) {
            ((AIBackdropImage) A0b.next()).writeToParcel(parcel, i);
        }
        DKH.A10(parcel, this.A05, i);
        C3o5.A0e(parcel, this.A03);
        parcel.writeInt(this.A00);
        ImmutableList immutableList = this.A08;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((AIBackdropSemanticSegment) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0e(parcel, this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A09);
        while (A0b2.hasNext()) {
            ((AIBackdropImage) A0b2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        DKH.A10(parcel, this.A06, i);
        1BL.A13(parcel, this.A0F);
        C3o5.A0e(parcel, this.A04);
        1Du A0b3 = 1BL.A0b(parcel, this.A0A);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        1Du A0b4 = 1BL.A0b(parcel, this.A0B);
        while (A0b4.hasNext()) {
            ((AIBackdropSemanticSegment) A0b4.next()).writeToParcel(parcel, i);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A0C);
        while (A0b5.hasNext()) {
            ((AIBackdropSemanticSegment) A0b5.next()).writeToParcel(parcel, i);
        }
        1Du A0b6 = 1BL.A0b(parcel, this.A0D);
        while (A0b6.hasNext()) {
            C3o5.A0h(parcel, A0b6);
        }
        1Du A0b7 = 1BL.A0b(parcel, this.A0E);
        while (A0b7.hasNext()) {
            C3o5.A0h(parcel, A0b7);
        }
    }
}
