package com.facebook.rtc.launch;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbM;
import X.AnonymousClass001;
import X.C53v;
import X.FKW;
import X.H9h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CallStartOutcome.class */
public final class CallStartOutcome implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(96);
    public final H9h A00;
    public final String A01;

    public CallStartOutcome(H9h h9h, String str) {
        this.A00 = h9h;
        this.A01 = str;
    }

    public CallStartOutcome(Parcel parcel) {
        Enum A07 = C53v.A07(parcel, H9h.class);
        if (A07 == null) {
            throw 1BK.A0h();
        }
        this.A00 = (H9h) A07;
        this.A01 = parcel.readString();
    }

    public final boolean A00() {
        return AnonymousClass001.A1W(this.A00, H9h.A03);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            CallStartOutcome callStartOutcome = (CallStartOutcome) obj;
            if (this.A00 != callStartOutcome.A00 || !11T.A0O(this.A01, callStartOutcome.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C53v.A0J(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
