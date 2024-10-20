package com.facebook.messaging.model.threads;

import X.0S2;
import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LearningSpaceThreadData.class */
public final class LearningSpaceThreadData implements Parcelable {
    public static volatile Integer A03;
    public static final Parcelable.Creator CREATOR = new CSV(61);
    public final String A00;
    public final Integer A01;
    public final Set A02;

    public LearningSpaceThreadData(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? 0S2.A00(3)[parcel.readInt()] : num;
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A02 = Collections.unmodifiableSet(hashSet);
    }

    public LearningSpaceThreadData(String str, Set set) {
        this.A00 = str;
        this.A01 = null;
        this.A02 = Collections.unmodifiableSet(set);
    }

    private Integer A00() {
        if (this.A02.contains("virtualEventCTAState")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 0S2.A0C;
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LearningSpaceThreadData)) {
                return false;
            }
            LearningSpaceThreadData learningSpaceThreadData = (LearningSpaceThreadData) obj;
            if (!11T.A0O(this.A00, learningSpaceThreadData.A00) || A00() != learningSpaceThreadData.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A032 = C1pq.A03(this.A00);
        return (A032 * 31) + C3o5.A04(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        C3o5.A0f(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
