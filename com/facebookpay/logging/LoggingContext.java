package com.facebookpay.logging;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3o5;
import X.DKH;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LoggingContext.class */
public final class LoggingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(1);
    public final long A00;
    public final LoggingPolicy A01;
    public final String A02;
    public final Set A03;
    public final Set A04;
    public final boolean A05;

    public LoggingContext(LoggingPolicy loggingPolicy, String str, Set set, Set set2, long j, boolean z) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A00 = j;
        this.A01 = loggingPolicy;
        this.A03 = set;
        this.A04 = set2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LoggingContext)) {
                return false;
            }
            LoggingContext loggingContext = (LoggingContext) obj;
            if (!11T.A0O(this.A02, loggingContext.A02) || this.A00 != loggingContext.A00 || !11T.A0O(this.A01, loggingContext.A01) || !11T.A0O(this.A03, loggingContext.A03) || !11T.A0O(this.A04, loggingContext.A04) || this.A05 != loggingContext.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A03, (AnonymousClass002.A02(this.A00, 4YV.A02(this.A02)) + AnonymousClass001.A02(this.A01)) * 31)) + AnonymousClass002.A00(this.A05 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LoggingContext(sessionId=");
        A0k.append(this.A02);
        A0k.append(", productId=");
        A0k.append(this.A00);
        A0k.append(", loggingPolicy=");
        A0k.append(this.A01);
        A0k.append(", eventSuppressionPolicy=");
        A0k.append(this.A03);
        A0k.append(", payloadFieldSuppressionPolicy=");
        A0k.append(this.A04);
        A0k.append(", disableLogging=");
        return DKH.A0q(A0k, this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        LoggingPolicy loggingPolicy = this.A01;
        if (loggingPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loggingPolicy.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
        Iterator A0S2 = C3o5.A0S(parcel, this.A04);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
