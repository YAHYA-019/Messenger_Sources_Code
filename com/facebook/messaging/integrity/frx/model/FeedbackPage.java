package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FeedbackPage.class */
public final class FeedbackPage implements Parcelable {
    public static volatile Integer A0B;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(96);
    public final ImmutableList A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;

    public FeedbackPage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        int readInt = parcel.readInt();
        FeedbackTag[] feedbackTagArr = new FeedbackTag[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, feedbackTagArr, i2);
        }
        this.A00 = ImmutableList.copyOf(feedbackTagArr);
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0A = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public FeedbackPage(ImmutableList immutableList, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Set set, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        C1pq.A08("feedbackTags", immutableList);
        this.A00 = immutableList;
        this.A09 = z;
        this.A0A = z2;
        this.A04 = str3;
        this.A01 = num;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A08.contains("pageTitleResId")) {
            num = this.A01;
        } else {
            if (A0B == null) {
                synchronized (this) {
                    if (A0B == null) {
                        A0B = 2131960052;
                    }
                }
            }
            num = A0B;
        }
        return num.intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FeedbackPage)) {
                return false;
            }
            FeedbackPage feedbackPage = (FeedbackPage) obj;
            if (!11T.A0O(this.A02, feedbackPage.A02) || !11T.A0O(this.A03, feedbackPage.A03) || !11T.A0O(this.A00, feedbackPage.A00) || this.A09 != feedbackPage.A09 || this.A0A != feedbackPage.A0A || !11T.A0O(this.A04, feedbackPage.A04) || A00() != feedbackPage.A00() || !11T.A0O(this.A05, feedbackPage.A05) || !11T.A0O(this.A06, feedbackPage.A06) || !11T.A0O(this.A07, feedbackPage.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A04(this.A04, C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02))), this.A09), this.A0A)) * 31) + A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((FeedbackTag) A0b.next(), i);
        }
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        1BL.A13(parcel, this.A04);
        C3o5.A0f(parcel, this.A01);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
