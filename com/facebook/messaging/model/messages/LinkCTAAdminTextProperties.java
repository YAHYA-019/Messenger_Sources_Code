package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: LinkCTAAdminTextProperties.class */
public final class LinkCTAAdminTextProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(1);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.facebook.messaging.model.messages.LinkCTAAdminTextProperties] */
    public static LinkCTAAdminTextProperties A00(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A04 = str;
        obj.A01 = str2;
        obj.A02 = str3;
        obj.A00 = str4;
        obj.A03 = str5;
        return obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
    }
}
