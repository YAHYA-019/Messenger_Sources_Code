package com.facebook.messaging.business.bizrtc.model;

import X.C53v;
import X.C5ap;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: PageIncomingCallNotification.class */
public final class PageIncomingCallNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CSW.A00(12);
    public boolean A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public PageIncomingCallNotification(Parcel parcel) {
        super(parcel);
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = C53v.A0S(parcel);
    }

    public PageIncomingCallNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        super(C5ap.A2V, null);
        this.A09 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (android.text.TextUtils.equals(r0, "RING") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A07
            r302 = r0
            java.lang.String r0 = "offer"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L23
            r0 = r302
            java.lang.String r1 = "RING"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            r304 = r0
        L25:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.bizrtc.model.PageIncomingCallNotification.A04():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
