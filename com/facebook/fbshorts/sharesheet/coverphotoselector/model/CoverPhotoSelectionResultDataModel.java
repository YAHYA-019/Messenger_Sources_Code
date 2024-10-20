package com.facebook.fbshorts.sharesheet.coverphotoselector.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKX;
import X.QoB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CoverPhotoSelectionResultDataModel.class */
public final class CoverPhotoSelectionResultDataModel implements Parcelable {
    public static volatile QoB A06;
    public static final Parcelable.Creator CREATOR = FKX.A00(76);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final QoB A04;
    public final Set A05;

    public CoverPhotoSelectionResultDataModel(QoB qoB, Integer num, String str, String str2, Set set, boolean z) {
        this.A04 = qoB;
        this.A01 = str;
        this.A00 = num;
        this.A03 = z;
        this.A02 = str2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public CoverPhotoSelectionResultDataModel(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = QoB.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        int i = 0;
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A02 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public QoB A00() {
        if (this.A05.contains("coverPhotoSource")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = QoB.A03;
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CoverPhotoSelectionResultDataModel)) {
                return false;
            }
            CoverPhotoSelectionResultDataModel coverPhotoSelectionResultDataModel = (CoverPhotoSelectionResultDataModel) obj;
            if (A00() != coverPhotoSelectionResultDataModel.A00() || !11T.A0O(this.A01, coverPhotoSelectionResultDataModel.A01) || !11T.A0O(this.A00, coverPhotoSelectionResultDataModel.A00) || this.A03 != coverPhotoSelectionResultDataModel.A03 || !11T.A0O(this.A02, coverPhotoSelectionResultDataModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A01, C3o5.A03(A00()) + 31)), this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A04);
        1BL.A13(parcel, this.A01);
        C3o5.A0f(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
