package com.google.android.exoplayer2.metadata.id3;

import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: ChapterFrame.class */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(37);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    /* JADX WARN: Multi-variable type inference failed */
    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return;
            }
            this.A05[i2] = 1BL.A0C(parcel, Id3Frame.class);
            i = i2 + 1;
        }
    }

    public ChapterFrame(String str, Id3Frame[] id3FrameArr, int i, int i2, long j, long j2) {
        super("CHAP");
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.A01 != chapterFrame.A01 || this.A00 != chapterFrame.A00 || this.A03 != chapterFrame.A03 || this.A02 != chapterFrame.A02 || !Util.A0P(this.A04, chapterFrame.A04) || !Arrays.equals(this.A05, chapterFrame.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A03(this.A01) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + 1BL.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        Id3Frame[] id3FrameArr = this.A05;
        int length = id3FrameArr.length;
        parcel.writeInt(length);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return;
            }
            parcel.writeParcelable(id3FrameArr[i3], 0);
            i2 = i3 + 1;
        }
    }
}
