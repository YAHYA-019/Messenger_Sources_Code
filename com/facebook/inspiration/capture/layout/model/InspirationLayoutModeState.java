package com.facebook.inspiration.capture.layout.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKf;
import X.QqY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationLayoutModeState.class */
public final class InspirationLayoutModeState implements Parcelable {
    public static volatile QqY A03;
    public static final Parcelable.Creator CREATOR = FKf.A01(21);
    public final QqY A00;
    public final ImmutableList A01;
    public final Set A02;

    public InspirationLayoutModeState(QqY qqY, ImmutableList immutableList, Set set) {
        C1pq.A08("sectionMedia", immutableList);
        this.A01 = immutableList;
        this.A00 = qqY;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationLayoutModeState(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        MediaData[] mediaDataArr = new MediaData[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
        this.A01 = ImmutableList.copyOf(mediaDataArr);
        this.A00 = parcel.readInt() == 0 ? null : QqY.values()[parcel.readInt()];
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public QqY A00() {
        if (this.A02.contains("selectedLayoutConfiguration")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = QqY.A0B;
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
            if (!(obj instanceof InspirationLayoutModeState)) {
                return false;
            }
            InspirationLayoutModeState inspirationLayoutModeState = (InspirationLayoutModeState) obj;
            if (!11T.A0O(this.A01, inspirationLayoutModeState.A01) || A00() != inspirationLayoutModeState.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A032 = C1pq.A03(this.A01);
        return (A032 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        parcel.writeInt(DKH.A05(parcel, this.A00));
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
