package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.4YW;
import X.7zL;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FeedbackTag.class */
public final class FeedbackTag implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(98);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public FeedbackTag(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        FeedbackTag[] feedbackTagArr = new FeedbackTag[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, feedbackTagArr, i);
        }
        this.A00 = ImmutableList.copyOf(feedbackTagArr);
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = 1BM.A07(parcel);
        this.A06 = AbJ.A1W(parcel);
        this.A01 = AbK.A15(parcel, parcel.readInt());
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public FeedbackTag(ImmutableList immutableList, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C1pq.A08("children", immutableList);
        this.A00 = immutableList;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = str;
        C1pq.A08("tagType", str2);
        this.A02 = str2;
        AbF.A1V(str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FeedbackTag)) {
                return false;
            }
            FeedbackTag feedbackTag = (FeedbackTag) obj;
            if (!11T.A0O(this.A00, feedbackTag.A00) || this.A04 != feedbackTag.A04 || this.A05 != feedbackTag.A05 || this.A06 != feedbackTag.A06 || !11T.A0O(this.A01, feedbackTag.A01) || !11T.A0O(this.A02, feedbackTag.A02) || !11T.A0O(this.A03, feedbackTag.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A04), this.A05), this.A06))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((FeedbackTag) A0b.next(), i);
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        4YW.A0E(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
