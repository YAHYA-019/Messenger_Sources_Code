package com.facebook.messaging.accountlogin.fragment.segue;

import X.06Z;
import X.7zL;
import X.7zS;
import X.AbH;
import X.AbJ;
import X.AlJ;
import X.AnonymousClass001;
import X.BLp;
import X.C06c;
import X.CSR;
import X.DEf;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountLoginSegueBase.class */
public abstract class AccountLoginSegueBase implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(83);
    public boolean A00;
    public final BLp A01;
    public final boolean A02;

    public AccountLoginSegueBase(BLp bLp, boolean z) {
        this.A01 = bLp;
        this.A02 = z;
    }

    public AccountLoginSegueBase(Parcel parcel) {
        this.A02 = 7zS.A1Z(parcel);
        this.A01 = parcel.readSerializable();
    }

    public static boolean A01(AlJ alJ, AccountLoginSegueBase accountLoginSegueBase, DEf dEf) {
        return accountLoginSegueBase.A04(alJ, dEf, true);
    }

    private boolean A04(AlJ alJ, DEf dEf, boolean z) {
        Bundle bundle = alJ.mArguments;
        if (bundle != null) {
            bundle.putParcelable("segue_params", this);
        } else {
            alJ.setArguments(AbH.A05(this, "segue_params"));
        }
        String A0Y = AnonymousClass001.A0Y(alJ);
        06Z BDe = dEf.BDe();
        boolean z2 = this.A02;
        boolean z3 = true;
        int i = 0;
        if (!z2) {
            int i2 = 0;
            while (i2 < BDe.A0U()) {
                BDe.A0w();
                i2++;
                z3 = false;
            }
        } else if (A0Y != null && !(this instanceof AccountLoginSegueRegSoftMatch) && z) {
            int A0U = BDe.A0U() - 1;
            while (true) {
                int i3 = A0U;
                if (i3 < 0) {
                    break;
                }
                if (A0Y.equals(((C06c) BDe.A0e(i3)).A0A)) {
                    BDe.A1Q(((C06c) BDe.A0e(i3)).A0A, 0);
                    return false;
                }
                A0U = i3 - 1;
            }
        }
        C06c A0G = 7zL.A0G(dEf.BDe());
        if (!this.A00) {
            if (z2) {
                i = 2130772099;
            }
            A0G.A0D(i, 2130772103, 2130772098, 2130772104);
        }
        A0G.A0M(alJ, 2131364228);
        AbJ.A1K(A0G, A0Y);
        return z3;
    }

    public int A02() {
        if (this instanceof AccountLoginSegueMainScreen) {
            return 1;
        }
        return this instanceof AccountLoginSegueCheckpoint ? 2 : 0;
    }

    public abstract AccountLoginSegueBase A03(BLp bLp);

    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(X.DEf r302) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase.A05(X.DEf):boolean");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeSerializable(this.A01);
    }
}
