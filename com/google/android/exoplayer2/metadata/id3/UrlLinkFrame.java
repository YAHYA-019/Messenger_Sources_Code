package com.google.android.exoplayer2.metadata.id3;

import X.0Pz;
import X.1BL;
import X.AbstractC2326GOr;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: UrlLinkFrame.class */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(45);
    public final String A00;
    public final String A01;

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (!super.A00.equals(((Id3Frame) urlLinkFrame).A00) || !Util.A0P(this.A00, urlLinkFrame.A00) || !Util.A0P(this.A01, urlLinkFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (AbstractC2326GOr.A07(super.A00) + 1BL.A06(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return 0Pz.A0j(super.A00, ": url=", this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
