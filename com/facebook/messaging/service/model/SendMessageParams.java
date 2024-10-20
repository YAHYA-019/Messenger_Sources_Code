package com.facebook.messaging.service.model;

import X.1BL;
import X.4YW;
import X.AnonymousClass001;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.model.messages.Message;

/* loaded from: SendMessageParams.class */
public final class SendMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(16);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final FbTraceNode A04;
    public final Message A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SendMessageParams(Parcel parcel) {
        this.A05 = (Message) 1BL.A0C(parcel, Message.class);
        boolean z = true;
        this.A08 = AnonymousClass001.A1N(parcel.readInt());
        this.A04 = (FbTraceNode) 1BL.A0C(parcel, FbTraceNode.class);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A0B = 4YW.A0K(parcel);
        this.A0C = 4YW.A0K(parcel);
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A09 = 4YW.A0K(parcel);
        this.A07 = parcel.readString();
        this.A0A = parcel.readByte() == 0 ? false : z;
    }

    public SendMessageParams(FbTraceNode fbTraceNode, Message message, String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = message;
        this.A08 = z;
        this.A04 = fbTraceNode;
        this.A01 = i;
        this.A03 = j;
        this.A02 = j2;
        this.A0B = z2;
        this.A0C = z3;
        this.A00 = i2;
        this.A06 = str;
        this.A09 = z4;
        this.A07 = str2;
        this.A0A = z5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A07);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
    }
}
