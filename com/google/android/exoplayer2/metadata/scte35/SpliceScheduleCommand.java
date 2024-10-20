package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass001;
import X.Ki0;
import X.L0v;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: SpliceScheduleCommand.class */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = LGn.A00(54);
    public final List A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A0t = AnonymousClass001.A0t(readInt);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = Collections.unmodifiableList(A0t);
                return;
            } else {
                A0t.add(new L0v(parcel));
                i = i2 + 1;
            }
        }
    }

    public SpliceScheduleCommand(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return;
            }
            L0v l0v = (L0v) list.get(i3);
            parcel.writeLong(l0v.A04);
            parcel.writeByte(l0v.A0A ? (byte) 1 : (byte) 0);
            parcel.writeByte(l0v.A08 ? (byte) 1 : (byte) 0);
            parcel.writeByte(l0v.A09 ? (byte) 1 : (byte) 0);
            List list2 = l0v.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < size2) {
                    Ki0 ki0 = (Ki0) list2.get(i5);
                    parcel.writeInt(ki0.A00);
                    parcel.writeLong(ki0.A01);
                    i4 = i5 + 1;
                }
            }
            parcel.writeLong(l0v.A05);
            parcel.writeByte(l0v.A07 ? (byte) 1 : (byte) 0);
            parcel.writeLong(l0v.A03);
            parcel.writeInt(l0v.A02);
            parcel.writeInt(l0v.A00);
            parcel.writeInt(l0v.A01);
            i2 = i3 + 1;
        }
    }
}
