package com.facebookpay.logging;

import X.11T;
import X.1BK;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JR1;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: LoggingPolicy.class */
public final class LoggingPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(2);
    public final String A00;
    public final ArrayList A01;

    public LoggingPolicy(String str, ArrayList arrayList) {
        11T.A0F(str, 1);
        this.A00 = str;
        this.A01 = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LoggingPolicy)) {
                return false;
            }
            LoggingPolicy loggingPolicy = (LoggingPolicy) obj;
            if (!11T.A0O(this.A00, loggingPolicy.A00) || !11T.A0O(this.A01, loggingPolicy.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LoggingPolicy(loggingPolicyProduct=");
        A0k.append(this.A00);
        A0k.append(", clientSuppressionPolicy=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A13 = JR1.A13(parcel, this.A01);
        while (A13.hasNext()) {
            ((ClientSuppressionPolicy) A13.next()).writeToParcel(parcel, i);
        }
    }
}
