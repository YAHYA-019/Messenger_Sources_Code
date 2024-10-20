package com.facebookpay.logging;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.KOi;
import X.KOw;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ClientSuppressionPolicy.class */
public final class ClientSuppressionPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(99);
    public final KOi A00;
    public final KOw A01;
    public final String A02;

    public ClientSuppressionPolicy(KOi kOi, KOw kOw, String str) {
        11T.A0F(kOi, 3);
        this.A02 = str;
        this.A01 = kOw;
        this.A00 = kOi;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ClientSuppressionPolicy)) {
                return false;
            }
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) obj;
            if (!11T.A0O(this.A02, clientSuppressionPolicy.A02) || this.A01 != clientSuppressionPolicy.A01 || this.A00 != clientSuppressionPolicy.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, ((1BL.A05(this.A02) * 31) + 4YU.A03(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ClientSuppressionPolicy(eventName=");
        A0k.append(this.A02);
        A0k.append(", payloadField=");
        A0k.append(this.A01);
        A0k.append(", suppressionMode=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        KOw kOw = this.A01;
        if (kOw == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, kOw);
        }
        1BL.A12(parcel, this.A00);
    }
}
