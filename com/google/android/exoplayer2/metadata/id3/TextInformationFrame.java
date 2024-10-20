package com.google.android.exoplayer2.metadata.id3;

import X.1BK;
import X.1BL;
import X.6DP;
import X.6Xe;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C3o5;
import X.JR0;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

/* loaded from: TextInformationFrame.class */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = LGn.A00(44);
    public final String A00;
    public final List A01;

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        6DP.A03(1BK.A1Y(list));
        this.A00 = str2;
        ArrayList A00 = 6Xe.A00(list.toArray(new String[0]));
        this.A01 = A00;
        A00.get(0);
    }

    public static ArrayList A00(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            int length = str.length();
            if (length >= 10) {
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 0, 4));
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 5, 7));
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 8, 10));
                return A0s;
            }
            if (length >= 7) {
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 0, 4));
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 5, 7));
                return A0s;
            }
            if (length >= 4) {
                AnonymousClass001.A1J(A0s, JR0.A0P(str, 0, 4));
            }
            return A0s;
        } catch (NumberFormatException unused) {
            return AnonymousClass001.A0s();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A0P(super.A00, ((Id3Frame) textInformationFrame).A00) || !Util.A0P(this.A00, textInformationFrame.A00) || !this.A01.equals(textInformationFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A07(super.A00) + 1BL.A06(this.A00)) * 31) + this.A01.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.A00);
        A0k.append(": description=");
        A0k.append(this.A00);
        A0k.append(": values=");
        return AnonymousClass001.A0a(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray(C3o5.A0n(this.A01));
    }
}
