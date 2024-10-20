package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zM;
import X.AbH;
import X.AbM;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKc;
import X.QpP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationReshareMediaInfo.class */
public final class InspirationReshareMediaInfo implements Parcelable {
    public static volatile QpP A09;
    public static final Parcelable.Creator CREATOR = FKc.A00(44);
    public final float A00;
    public final int A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final QpP A07;
    public final Set A08;

    public InspirationReshareMediaInfo(QpP qpP, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, Set set, float f, int i, boolean z) {
        this.A01 = i;
        this.A00 = f;
        C1pq.A08("imageUris", immutableList);
        this.A02 = immutableList;
        C1pq.A08("mediaGrids", immutableList2);
        this.A03 = immutableList2;
        this.A07 = qpP;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A08 = Collections.unmodifiableSet(set);
        QpP A00 = A00();
        if (A00 == QpP.A02) {
            throw AnonymousClass001.A0N("MediaType must be explicitly set to a valid value");
        }
        if (A00 == QpP.A04) {
            if (!7zM.A1b(this.A03)) {
                throw AnonymousClass001.A0N("Media grids required for multiphoto reshare.");
            }
            if (this.A01 < 0) {
                throw AnonymousClass001.A0N("Invalid additional media count for reshare.");
            }
        }
    }

    public InspirationReshareMediaInfo(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A00 = parcel.readFloat();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A02 = ImmutableList.copyOf(strArr);
        int readInt2 = parcel.readInt();
        PersistableRect[] persistableRectArr = new PersistableRect[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = DKG.A02(parcel, PersistableRect.CREATOR, persistableRectArr, i3);
        }
        this.A03 = ImmutableList.copyOf(persistableRectArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = QpP.values()[parcel.readInt()];
        }
        this.A06 = AbN.A1U(parcel);
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public QpP A00() {
        if (this.A08.contains("mediaType")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = QpP.A02;
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationReshareMediaInfo)) {
                return false;
            }
            InspirationReshareMediaInfo inspirationReshareMediaInfo = (InspirationReshareMediaInfo) obj;
            if (this.A01 != inspirationReshareMediaInfo.A01 || this.A00 != inspirationReshareMediaInfo.A00 || !11T.A0O(this.A02, inspirationReshareMediaInfo.A02) || !11T.A0O(this.A03, inspirationReshareMediaInfo.A03) || A00() != inspirationReshareMediaInfo.A00() || this.A06 != inspirationReshareMediaInfo.A06 || !11T.A0O(this.A04, inspirationReshareMediaInfo.A04) || !11T.A0O(this.A05, inspirationReshareMediaInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A02, AbM.A00(this.A01 + 31, this.A00)));
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02((A04 * 31) + C3o5.A03(A00()), this.A06)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            ((PersistableRect) A0b2.next()).writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A07);
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
