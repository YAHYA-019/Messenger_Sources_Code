package com.google.android.exoplayer2.metadata.emsg;

import X.1BL;
import X.4YT;
import X.6Y2;
import X.6Yl;
import X.6Zr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: EventMessage.class */
public final class EventMessage implements Metadata.Entry {
    public static final 6Yl A06;
    public static final 6Yl A07;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    static {
        6Zr r0 = new 6Zr();
        r0.A0U = "application/id3";
        A06 = new 6Yl(r0);
        6Zr r02 = new 6Zr();
        r02.A0U = "application/x-scte35";
        A07 = new 6Yl(r02);
        CREATOR = LGn.A00(32);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] BL1() {
        if (BL2() != null) {
            return this.A05;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public 6Yl BL2() {
        Object obj;
        String str = this.A03;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    return A07;
                }
                return null;
            case -795945609:
                obj = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                obj = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (str.equals(obj)) {
            return A06;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void CXq(6Y2 r302) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !Util.A0P(this.A03, eventMessage.A03) || !Util.A0P(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int i2 = 0;
            int A062 = (527 + 1BL.A06(this.A03)) * 31;
            String str = this.A04;
            if (str != null) {
                i2 = str.hashCode();
            }
            i = AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, (A062 + i2) * 31)) + Arrays.hashCode(this.A05);
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EMSG: scheme=");
        A0k.append(this.A03);
        A0k.append(", id=");
        A0k.append(this.A02);
        A0k.append(4YT.A00(83));
        A0k.append(this.A01);
        A0k.append(", value=");
        return AnonymousClass001.A0d(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }
}
