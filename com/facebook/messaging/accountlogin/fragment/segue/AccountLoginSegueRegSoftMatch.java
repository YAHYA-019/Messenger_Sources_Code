package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import X.EPM;
import android.os.Parcel;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;

/* loaded from: AccountLoginSegueRegSoftMatch.class */
public final class AccountLoginSegueRegSoftMatch extends AccountLoginSegueRegBaseData {
    public int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccountLoginSegueRegSoftMatch(com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegBaseData r302, int r303) {
        /*
            r301 = this;
            X.BLp r0 = X.BLp.A0N
            r304 = r0
            r0 = r302
            r305 = r0
            r0 = r302
            java.lang.String r0 = r0.A03
            r306 = r0
            r0 = r302
            java.lang.String r0 = r0.A05
            r307 = r0
            r0 = r302
            java.lang.String r0 = r0.A06
            r308 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r309 = r0
            r0 = r302
            java.lang.String r0 = r0.A04
            r310 = r0
            r0 = r302
            java.lang.String r0 = r0.A07
            r311 = r0
            r0 = r302
            java.lang.String r0 = r0.A08
            r312 = r0
            r0 = r302
            java.lang.String r0 = r0.A02
            r313 = r0
            r0 = r302
            boolean r0 = r0.A0C
            r314 = r0
            r0 = r302
            com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase r0 = r0.A00
            r315 = r0
            r0 = r302
            java.util.List r0 = r0.A0A
            r316 = r0
            r0 = r302
            java.util.List r0 = r0.A0B
            r317 = r0
            r0 = r302
            java.util.List r0 = r0.A09
            r305 = r0
            r0 = r301
            r1 = r304
            r2 = 1
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r306
            r0.A03 = r1
            r0 = r301
            r1 = r307
            r0.A05 = r1
            r0 = r301
            r1 = r308
            r0.A06 = r1
            r0 = r301
            r1 = r309
            r0.A01 = r1
            r0 = r301
            r1 = r310
            r0.A04 = r1
            r0 = r301
            r1 = r311
            r0.A07 = r1
            r0 = r301
            r1 = r312
            r0.A08 = r1
            r0 = r301
            r1 = r313
            r0.A02 = r1
            r0 = r301
            r1 = r314
            r0.A0C = r1
            r0 = r301
            r1 = r315
            r0.A00 = r1
            r0 = r301
            r1 = r316
            r0.A0A = r1
            r0 = r301
            r1 = r317
            r0.A0B = r1
            r0 = r301
            r1 = r305
            r0.A09 = r1
            r0 = r301
            r1 = r303
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegSoftMatch.<init>(com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegBaseData, int):void");
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        RecoveredAccount A06;
        return bLp == BLp.A0N ? new AccountLoginSegueRegSoftMatch(this, this.A00 + 1) : (bLp != BLp.A0O || (A06 = A06()) == null) ? super.A03(bLp) : new AccountLoginSegueRegSoftMatchLogin(EPM.A0R, A06, this.A05);
    }

    public RecoveredAccount A06() {
        int i = this.A00;
        if (i < this.A09.size()) {
            return (RecoveredAccount) this.A09.get(i);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 9;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
