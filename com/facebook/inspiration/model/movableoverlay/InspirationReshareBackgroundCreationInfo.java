package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbL;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKc;
import X.QoZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationReshareBackgroundCreationInfo.class */
public final class InspirationReshareBackgroundCreationInfo implements Parcelable {
    public static volatile QoZ A06;
    public static volatile ImmutableList A07;
    public static final Parcelable.Creator CREATOR = FKc.A00(40);
    public final float A00;
    public final int A01;
    public final String A02;
    public final QoZ A03;
    public final ImmutableList A04;
    public final Set A05;

    public InspirationReshareBackgroundCreationInfo(QoZ qoZ, ImmutableList immutableList, String str, Set set, float f, int i) {
        this.A03 = qoZ;
        this.A04 = immutableList;
        this.A02 = str;
        this.A00 = f;
        this.A01 = i;
        this.A05 = Collections.unmodifiableSet(set);
        QoZ A00 = A00();
        11T.A0A(A00);
        if (A00 == QoZ.A04) {
            float f2 = 0.0f / 0.0f;
            if (this.A01 == -1) {
                throw AnonymousClass001.A0N("Image index needed for that background mode.");
            }
        }
        if (A00 == QoZ.A02) {
            if (this.A00 == -1.0f) {
                throw AnonymousClass001.A0N("Alignment percentage needed for photo rendering");
            }
            if (this.A02 == null) {
                throw AnonymousClass001.A0N("Background image URI needed.");
            }
        }
        if (A01().size() < 2) {
            throw AnonymousClass001.A0N("2+ Colors are needed for the background gradient, even if identical.");
        }
    }

    public InspirationReshareBackgroundCreationInfo(Parcel parcel) {
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = QoZ.values()[parcel.readInt()];
        }
        int i = 0;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A04 = immutableList;
        this.A02 = C3o5.A0O(parcel);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public QoZ A00() {
        if (this.A05.contains("backgroundCreationMode")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = QoZ.A03;
                }
            }
        }
        return A06;
    }

    public ImmutableList A01() {
        if (this.A05.contains(1BJ.A00(1042))) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    ImmutableList of = ImmutableList.of((Object) "#FFA8BBC3", (Object) "#FFA8BBC3");
                    11T.A0A(of);
                    A07 = of;
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationReshareBackgroundCreationInfo)) {
                return false;
            }
            InspirationReshareBackgroundCreationInfo inspirationReshareBackgroundCreationInfo = (InspirationReshareBackgroundCreationInfo) obj;
            if (A00() != inspirationReshareBackgroundCreationInfo.A00() || !11T.A0O(A01(), inspirationReshareBackgroundCreationInfo.A01()) || !11T.A0O(this.A02, inspirationReshareBackgroundCreationInfo.A02) || this.A00 != inspirationReshareBackgroundCreationInfo.A00 || this.A01 != inspirationReshareBackgroundCreationInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AbM.A00(C1pq.A04(this.A02, C1pq.A04(A01(), C3o5.A03(A00()) + 31)), this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A03);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
