package com.facebook.messaging.montage.model.cards;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import X.RPH;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageEventsSticker.class */
public final class MontageEventsSticker implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(10);
    public final MontageStickerOverlayBounds A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public MontageEventsSticker(RPH rph) {
        this.A0D = rph.A0D;
        this.A0E = rph.A0E;
        this.A01 = rph.A01;
        this.A02 = rph.A02;
        this.A03 = rph.A03;
        this.A04 = rph.A04;
        this.A05 = rph.A05;
        this.A06 = rph.A06;
        this.A07 = rph.A07;
        this.A08 = rph.A08;
        this.A09 = rph.A09;
        this.A00 = rph.A00;
        this.A0A = rph.A0A;
        this.A0B = rph.A0B;
        this.A0C = rph.A0C;
    }

    public MontageEventsSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A0D = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0E = AbJ.A1W(parcel);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MontageStickerOverlayBounds) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A0B = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0C = C3o5.A0O(parcel);
    }

    public MontageEventsSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, String str2) {
        this.A0D = false;
        this.A0E = false;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = null;
        this.A07 = null;
        this.A08 = null;
        this.A09 = null;
        this.A00 = montageStickerOverlayBounds;
        this.A0A = null;
        this.A0B = null;
        this.A0C = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageEventsSticker)) {
                return false;
            }
            MontageEventsSticker montageEventsSticker = (MontageEventsSticker) obj;
            if (this.A0D != montageEventsSticker.A0D || this.A0E != montageEventsSticker.A0E || !11T.A0O(this.A01, montageEventsSticker.A01) || !11T.A0O(this.A02, montageEventsSticker.A02) || !11T.A0O(this.A03, montageEventsSticker.A03) || !11T.A0O(this.A04, montageEventsSticker.A04) || !11T.A0O(this.A05, montageEventsSticker.A05) || !11T.A0O(this.A06, montageEventsSticker.A06) || !11T.A0O(this.A07, montageEventsSticker.A07) || !11T.A0O(this.A08, montageEventsSticker.A08) || !11T.A0O(this.A09, montageEventsSticker.A09) || !11T.A0O(this.A00, montageEventsSticker.A00) || !11T.A0O(this.A0A, montageEventsSticker.A0A) || !11T.A0O(this.A0B, montageEventsSticker.A0B) || !11T.A0O(this.A0C, montageEventsSticker.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A00, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A05(this.A0D), this.A0E))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
    }
}
