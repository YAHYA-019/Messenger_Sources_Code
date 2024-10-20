package com.facebook.payments.jsbasedpayment.logging;

import X.0S2;
import X.AnonymousClass001;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: JSBasedPaymentLoggingParamters.class */
public final class JSBasedPaymentLoggingParamters implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(62);
    public long A00;
    public Integer A01;
    public Map A02;
    public final String A03;

    public JSBasedPaymentLoggingParamters(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2.equals("MESSENGER")) {
            num = 0S2.A00;
        } else {
            if (!readString2.equals("INSTANT_EXPERIENCES")) {
                throw AnonymousClass001.A0L(readString2);
            }
            num = 0S2.A01;
        }
        long readLong = parcel.readLong();
        HashMap readHashMap = parcel.readHashMap(String.class.getClassLoader());
        this.A03 = readString;
        this.A01 = num;
        this.A00 = readLong;
        this.A02 = readHashMap;
    }

    public JSBasedPaymentLoggingParamters(Integer num, String str, Map map) {
        long nextLong = new Random().nextLong();
        this.A03 = str;
        this.A01 = num;
        this.A00 = nextLong;
        this.A02 = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(1 - this.A01.intValue() != 0 ? "MESSENGER" : "INSTANT_EXPERIENCES");
        parcel.writeLong(this.A00);
        parcel.writeMap(this.A02);
    }
}
