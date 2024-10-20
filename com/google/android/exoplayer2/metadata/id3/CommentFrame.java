package com.google.android.exoplayer2.metadata.id3;

import X.0Pz;
import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: CommentFrame.class */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(39);
    public final String A00;
    public final String A01;
    public final String A02;

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CommentFrame commentFrame = (CommentFrame) obj;
            if (!Util.A0P(this.A00, commentFrame.A00) || !Util.A0P(this.A01, commentFrame.A01) || !Util.A0P(this.A02, commentFrame.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (AbstractC2326GOr.A03(1BL.A06(this.A01)) + 1BL.A06(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A03 + i;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return 0Pz.A0z(super.A00, ": language=", this.A01, ", description=", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
