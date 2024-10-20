package com.facebook.push.constants;

import X.11T;
import X.4YV;
import X.4YW;
import X.4rH;
import X.82N;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PushProperty.class */
public final class PushProperty implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(2);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final 4rH A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushProperty(4rH r302) {
        this(r302, null, null, null, null, 0L, 0L);
        11T.A0F(r302, 1);
    }

    public PushProperty(4rH r302, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, long j, long j2, long j3, boolean z) {
        this.A04 = r302;
        this.A0A = str;
        this.A02 = j;
        this.A08 = str2;
        this.A0B = str3;
        this.A0E = str4;
        this.A03 = j2;
        this.A0G = z;
        this.A06 = str5;
        this.A0C = str6;
        this.A09 = str7;
        this.A07 = str8;
        this.A0F = str9;
        this.A0D = str10;
        this.A00 = i;
        this.A05 = num;
        this.A01 = j3;
    }

    public PushProperty(4rH r302, String str, String str2, String str3, String str4, long j, long j2) {
        this(r302, null, str, str2, str3, str4, null, null, null, null, null, null, 0, j, j2, 0L, false);
    }

    public PushProperty(Parcel parcel) {
        4rH readSerializable = parcel.readSerializable();
        11T.A0I(readSerializable, "null cannot be cast to non-null type com.facebook.push.constants.PushSource");
        this.A04 = readSerializable;
        this.A0A = parcel.readString();
        this.A02 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0E = parcel.readString();
        this.A03 = parcel.readLong();
        this.A0G = 4YW.A0K(parcel);
        this.A06 = parcel.readString();
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0F = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = (Integer) 4YV.A0l(parcel, Integer.TYPE);
        this.A01 = parcel.readLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        if (r303 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap A00() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.push.constants.PushProperty.A00():java.util.HashMap");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PushProperty{source=");
        A0k.append(this.A04);
        A0k.append(", notifId='");
        A0k.append(this.A0A);
        A0k.append("', deliveryId='");
        A0k.append(this.A06);
        A0k.append("', receivedTime=");
        A0k.append(this.A02);
        A0k.append(", msgId='");
        A0k.append(this.A08);
        A0k.append("', notifType='");
        A0k.append(this.A0B);
        A0k.append("', senderId='");
        A0k.append(this.A0E);
        A0k.append("', serverPushTime=");
        A0k.append(this.A03);
        A0k.append(", isLoggedOutPush=");
        A0k.append(this.A0G);
        A0k.append(", pnid='");
        A0k.append(this.A0C);
        A0k.append("', priorityDiff='");
        A0k.append(this.A05);
        return AnonymousClass001.A0d("'}", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A03);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeLong(this.A01);
    }
}
