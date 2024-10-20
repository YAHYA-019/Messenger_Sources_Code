package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass001;
import X.JR1;
import X.KjQ;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: SpliceInsertCommand.class */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = LGn.A00(52);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A09 = JR1.A1U(parcel);
        this.A0A = JR1.A1U(parcel);
        this.A0C = JR1.A1U(parcel);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A0t = AnonymousClass001.A0t(readInt);
        for (int i = 0; i < readInt; i++) {
            A0t.add(new KjQ(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.A07 = Collections.unmodifiableList(A0t);
        this.A08 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public SpliceInsertCommand(List list, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
                parcel.writeLong(this.A03);
                parcel.writeInt(this.A02);
                parcel.writeInt(this.A00);
                parcel.writeInt(this.A01);
                return;
            }
            KjQ kjQ = (KjQ) list.get(i3);
            parcel.writeInt(kjQ.A00);
            parcel.writeLong(kjQ.A02);
            parcel.writeLong(kjQ.A01);
            i2 = i3 + 1;
        }
    }
}
