package com.facebook.inspiration.genai.aibackdrop.model;

import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBGenAISemanticSegmentCategory;

/* loaded from: AIBackdropSemanticSegment.class */
public final class AIBackdropSemanticSegment implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(34);
    public final int A00;
    public final GraphQLXFBGenAISemanticSegmentCategory A01;
    public final boolean A02;

    public AIBackdropSemanticSegment(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : GraphQLXFBGenAISemanticSegmentCategory.values()[parcel.readInt()];
        this.A02 = AbN.A1U(parcel);
        this.A00 = parcel.readInt();
    }

    public AIBackdropSemanticSegment(GraphQLXFBGenAISemanticSegmentCategory graphQLXFBGenAISemanticSegmentCategory, int i, boolean z) {
        this.A01 = graphQLXFBGenAISemanticSegmentCategory;
        this.A02 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AIBackdropSemanticSegment)) {
                return false;
            }
            AIBackdropSemanticSegment aIBackdropSemanticSegment = (AIBackdropSemanticSegment) obj;
            if (this.A01 != aIBackdropSemanticSegment.A01 || this.A02 != aIBackdropSemanticSegment.A02 || this.A00 != aIBackdropSemanticSegment.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02(C3o5.A03(this.A01) + 31, this.A02) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A01));
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
