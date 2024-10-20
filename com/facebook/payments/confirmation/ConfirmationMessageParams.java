package com.facebook.payments.confirmation;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKE;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKZ;
import X.RLl;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: ConfirmationMessageParams.class */
public final class ConfirmationMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(25);
    public final C2203Dgv A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ConfirmationMessageParams(RLl rLl) {
        this.A01 = null;
        Integer num = rLl.A00;
        C1pq.A08("confirmationMessageMode", num);
        this.A02 = num;
        String str = rLl.A01;
        this.A03 = str;
        this.A04 = null;
        this.A00 = null;
        this.A05 = rLl.A02;
        if (num == 0S2.A00) {
            Object obj = null;
            obj.getClass();
            throw 0Q8.createAndThrow();
        }
        if (num != 0S2.A01) {
            throw DKG.A1A("Mode not handled ", num != null ? 1 - num.intValue() != 0 ? "DEFAULT" : "CUSTOM" : "null");
        }
        Preconditions.checkArgument(str == null ? false : true);
    }

    public ConfirmationMessageParams(Parcel parcel) {
        C2203Dgv c2203Dgv = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            Integer[] numArr = new Integer[readInt];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                numArr[i2] = AbI.A0z(parcel);
                i = i2 + 1;
            }
            this.A01 = ImmutableList.copyOf(numArr);
        }
        this.A02 = 7zU.A0e(parcel, 2);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (C2203Dgv) FJ8.A01(parcel) : c2203Dgv;
        this.A05 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ConfirmationMessageParams)) {
                return false;
            }
            ConfirmationMessageParams confirmationMessageParams = (ConfirmationMessageParams) obj;
            if (!11T.A0O(this.A01, confirmationMessageParams.A01) || this.A02 != confirmationMessageParams.A02 || !11T.A0O(this.A03, confirmationMessageParams.A03) || !11T.A0O(this.A04, confirmationMessageParams.A04) || !11T.A0O(this.A00, confirmationMessageParams.A00) || !11T.A0O(this.A05, confirmationMessageParams.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        Integer num = this.A02;
        return C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A03, (A03 * 31) + (num == null ? -1 : num.intValue())))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeInt(DKE.A0F(A0Y));
            }
        }
        parcel.writeInt(this.A02.intValue());
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A05);
    }
}
