package com.google.android.exoplayer2.metadata.scte35;

import X.6aO;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TimeSignalCommand.class */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = LGn.A00(55);
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(6aO r301, long j) {
        long A07 = r301.A07();
        if ((128 & A07) != 0) {
            return 8589934591L & ((((A07 & 1) << 32) | r301.A0E()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
