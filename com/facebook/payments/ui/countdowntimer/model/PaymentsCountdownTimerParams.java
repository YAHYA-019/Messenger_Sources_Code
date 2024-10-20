package com.facebook.payments.ui.countdowntimer.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YW;
import X.AbG;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.DKH;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentsCountdownTimerParams.class */
public final class PaymentsCountdownTimerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(6);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public PaymentsCountdownTimerParams() {
        this.A00 = 0L;
        this.A05 = false;
        this.A06 = false;
        this.A02 = "%02d:%02d";
        this.A01 = 600000L;
        this.A03 = null;
        this.A04 = "[[countdown_timer]]";
    }

    public PaymentsCountdownTimerParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = AbJ.A1W(parcel);
        this.A02 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A03 = DKH.A0l(parcel);
        this.A04 = parcel.readString();
    }

    public PaymentsCountdownTimerParams(String str, String str2, String str3, long j, long j2, boolean z) {
        this.A00 = j;
        this.A05 = z;
        this.A06 = true;
        C1pq.A08("timerFormat", str);
        this.A02 = str;
        this.A01 = j2;
        this.A03 = str2;
        C1pq.A08("timerToken", str3);
        this.A04 = str3;
        if (this.A05) {
            String str4 = this.A03;
            if (str4 == null || str4.length() == 0) {
                throw 1BK.A0g();
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsCountdownTimerParams)) {
                return false;
            }
            PaymentsCountdownTimerParams paymentsCountdownTimerParams = (PaymentsCountdownTimerParams) obj;
            if (this.A00 != paymentsCountdownTimerParams.A00 || this.A05 != paymentsCountdownTimerParams.A05 || this.A06 != paymentsCountdownTimerParams.A06 || !11T.A0O(this.A02, paymentsCountdownTimerParams.A02) || this.A01 != paymentsCountdownTimerParams.A01 || !11T.A0O(this.A03, paymentsCountdownTimerParams.A03) || !11T.A0O(this.A04, paymentsCountdownTimerParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A02, C1pq.A02(C1pq.A02(1BL.A01(this.A00) + 31, this.A05), this.A06)), this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
        4YW.A0E(parcel, this.A03);
        parcel.writeString(this.A04);
    }
}
