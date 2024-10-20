package com.google.android.exoplayer2.metadata.id3;

import X.1BL;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: ChapterTocFrame.class */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(38);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    /* JADX WARN: Multi-variable type inference failed */
    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        boolean z = true;
        this.A02 = AnonymousClass001.A1N(parcel.readByte());
        this.A01 = parcel.readByte() == 0 ? false : z;
        this.A03 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A04[i] = 1BL.A0C(parcel, Id3Frame.class);
        }
    }

    public ChapterTocFrame(String str, Id3Frame[] id3FrameArr, String[] strArr, boolean z, boolean z2) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.A02 != chapterTocFrame.A02 || this.A01 != chapterTocFrame.A01 || !Util.A0P(this.A00, chapterTocFrame.A00) || !Arrays.equals(this.A03, chapterTocFrame.A03) || !Arrays.equals(this.A04, chapterTocFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(this.A02 ? 1 : 0) + (this.A01 ? 1 : 0)) * 31) + 1BL.A06(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        Id3Frame[] id3FrameArr = this.A04;
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
