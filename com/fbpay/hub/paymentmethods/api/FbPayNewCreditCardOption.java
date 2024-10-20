package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.KOm;
import X.LGn;
import X.Qpx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FbPayNewCreditCardOption.class */
public final class FbPayNewCreditCardOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(17);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public FbPayNewCreditCardOption() {
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbPayNewCreditCardOption(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            FbPayAdditionalField[] fbPayAdditionalFieldArr = new FbPayAdditionalField[readInt];
            for (int i = 0; i < readInt; i++) {
                fbPayAdditionalFieldArr[i] = parcel.readParcelable(A0e);
            }
            this.A00 = ImmutableList.copyOf(fbPayAdditionalFieldArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            Qpx[] qpxArr = new Qpx[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                qpxArr[i2] = Qpx.values()[parcel.readInt()];
            }
            this.A01 = ImmutableList.copyOf(qpxArr);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            KOm[] kOmArr = new KOm[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                kOmArr[i3] = KOm.values()[parcel.readInt()];
            }
            immutableList = ImmutableList.copyOf(kOmArr);
        }
        this.A02 = immutableList;
        this.A04 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayNewCreditCardOption)) {
                return false;
            }
            FbPayNewCreditCardOption fbPayNewCreditCardOption = (FbPayNewCreditCardOption) obj;
            if (!11T.A0O(this.A00, fbPayNewCreditCardOption.A00) || !11T.A0O(this.A03, fbPayNewCreditCardOption.A03) || !11T.A0O(this.A01, fbPayNewCreditCardOption.A01) || !11T.A0O(this.A02, fbPayNewCreditCardOption.A02) || !11T.A0O(this.A04, fbPayNewCreditCardOption.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((FbPayAdditionalField) A0Y.next(), i);
            }
        }
        1BL.A13(parcel, this.A03);
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeInt(((Qpx) A0Y2.next()).ordinal());
            }
        }
        ImmutableList immutableList3 = this.A02;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                parcel.writeInt(((KOm) A0Y3.next()).ordinal());
            }
        }
        1BL.A13(parcel, this.A04);
    }
}
