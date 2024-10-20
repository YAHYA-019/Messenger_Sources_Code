package com.facebook.messaging.montage.composer.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C98M;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: RollCallCameraModel.class */
public final class RollCallCameraModel implements Parcelable {
    public static volatile C98M A06;
    public static final Parcelable.Creator CREATOR = new CSV(85);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final C98M A04;
    public final Set A05;

    public RollCallCameraModel(C98M c98m, String str, String str2, Set set, boolean z) {
        this.A02 = false;
        this.A04 = c98m;
        C1pq.A08("promptText", str);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public RollCallCameraModel(C98M c98m, String str, String str2, Set set, boolean z, boolean z2) {
        this.A02 = z;
        this.A04 = c98m;
        C1pq.A08("promptText", str);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public RollCallCameraModel(Parcel parcel) {
        int i = 0;
        boolean z = true;
        this.A02 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A04 = parcel.readInt() != 0 ? C98M.values()[parcel.readInt()] : null;
        this.A00 = parcel.readString();
        this.A01 = C3o5.A0O(parcel);
        this.A03 = parcel.readInt() != 1 ? false : z;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public C98M A00() {
        if (this.A05.contains("entryPoint")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = C98M.UNKNOWN;
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
            if (!(obj instanceof RollCallCameraModel)) {
                return false;
            }
            RollCallCameraModel rollCallCameraModel = (RollCallCameraModel) obj;
            if (this.A02 != rollCallCameraModel.A02 || A00() != rollCallCameraModel.A00() || !11T.A0O(this.A00, rollCallCameraModel.A00) || !11T.A0O(this.A01, rollCallCameraModel.A01) || this.A03 != rollCallCameraModel.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = C1pq.A05(this.A02);
        return C1pq.A02(C1pq.A04(this.A01, C1pq.A04(this.A00, (A05 * 31) + C3o5.A03(A00()))), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        C3o5.A0e(parcel, this.A04);
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
