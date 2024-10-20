package com.facebook.interstitial.triggers;

import X.0Pz;
import X.11T;
import X.1BK;
import X.1BL;
import X.2bJ;
import X.2bQ;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.LogcatReader;

/* loaded from: InterstitialTrigger.class */
public final class InterstitialTrigger implements Comparable, Parcelable {
    public static final 2bJ A03 = new Object();
    public static final Parcelable.Creator CREATOR = new C2xc(10);
    public final int A00;
    public final InterstitialTriggerContext A01;
    public final String A02;

    public InterstitialTrigger() {
        this(LogcatReader.DEFAULT_WAIT_TIME, (String) null);
    }

    public InterstitialTrigger(int i, String str) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = null;
    }

    public InterstitialTrigger(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.A00 = 2bQ.A00(readString);
        this.A02 = parcel.readString();
        this.A01 = (InterstitialTriggerContext) 1BL.A0C(parcel, InterstitialTriggerContext.class);
    }

    public InterstitialTrigger(InterstitialTrigger interstitialTrigger, InterstitialTriggerContext interstitialTriggerContext) {
        11T.A0F(interstitialTrigger, 1);
        this.A00 = interstitialTrigger.A00;
        this.A02 = null;
        this.A01 = interstitialTriggerContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterstitialTrigger(String str, String str2) {
        this(2bQ.A00(str), str2);
        11T.A0F(str, 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        11T.A0F(obj, 0);
        return toString().compareTo(obj.toString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InterstitialTrigger) {
            return 11T.A0O(toString(), obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String str = this.A02;
        int i = this.A00;
        return str != null ? 0Pz.A0Y(2bQ.A01(i), str, ':') : 2bQ.A01(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(2bQ.A01(this.A00));
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }
}
