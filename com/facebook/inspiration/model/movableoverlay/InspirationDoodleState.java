package com.facebook.inspiration.model.movableoverlay;

import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.C3o5;
import X.DKF;
import X.FIE;
import X.FKc;
import X.Qp3;
import X.Qty;
import X.Rag;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationDoodleState.class */
public final class InspirationDoodleState implements Parcelable {
    public static volatile Qty A05;
    public static volatile Integer A06;
    public static final Parcelable.Creator CREATOR = FKc.A00(9);
    public final float A00;
    public final Qp3 A01;
    public final Qty A02;
    public final Integer A03;
    public final Set A04;

    public InspirationDoodleState(Rag rag) {
        this.A02 = rag.A02;
        this.A03 = rag.A03;
        this.A01 = rag.A01;
        this.A00 = rag.A00;
        this.A04 = Collections.unmodifiableSet(rag.A04);
    }

    public InspirationDoodleState(Parcel parcel) {
        Qp3 qp3 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = Qty.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? Qp3.values()[parcel.readInt()] : qp3;
        this.A00 = parcel.readFloat();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public int A00() {
        Integer num;
        if (this.A04.contains("colorSelection")) {
            num = this.A03;
        } else {
            if (A06 == null) {
                synchronized (this) {
                    if (A06 == null) {
                        A06 = Integer.valueOf(FIE.A0O);
                    }
                }
            }
            num = A06;
        }
        return num.intValue();
    }

    public Qty A01() {
        if (this.A04.contains("brushTypeID")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = Qty.A03;
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationDoodleState)) {
                return false;
            }
            InspirationDoodleState inspirationDoodleState = (InspirationDoodleState) obj;
            if (A01() != inspirationDoodleState.A01() || A00() != inspirationDoodleState.A00() || this.A01 != inspirationDoodleState.A01 || this.A00 != inspirationDoodleState.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = ((C3o5.A03(A01()) + 31) * 31) + A00();
        return AbM.A00((A03 * 31) + DKF.A04(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A02);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0e(parcel, this.A01);
        parcel.writeFloat(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
