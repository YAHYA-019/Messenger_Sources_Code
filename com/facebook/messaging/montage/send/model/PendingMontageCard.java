package com.facebook.messaging.montage.send.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.google.common.collect.ImmutableList;

/* loaded from: PendingMontageCard.class */
public final class PendingMontageCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(26);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public PendingMontageCard(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A04 = Boolean.valueOf(AnonymousClass001.A1Q(parcel.readInt(), 1));
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            MontageFeedbackOverlay[] montageFeedbackOverlayArr = new MontageFeedbackOverlay[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbI.A01(parcel, A0e, montageFeedbackOverlayArr, i3);
            }
            this.A01 = ImmutableList.copyOf(montageFeedbackOverlayArr);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt3 = parcel.readInt();
            String[] strArr2 = new String[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbH.A00(parcel, strArr2, i4);
            }
            this.A02 = ImmutableList.copyOf(strArr2);
        }
        this.A09 = parcel.readString();
        this.A05 = Boolean.valueOf(AbJ.A1V(parcel));
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            String[] strArr3 = new String[readInt4];
            while (i < readInt4) {
                i = AbH.A00(parcel, strArr3, i);
            }
            immutableList = ImmutableList.copyOf(strArr3);
        }
        this.A03 = immutableList;
        this.A0B = C3o5.A0O(parcel);
        this.A06 = 7zO.A0j(parcel);
    }

    public PendingMontageCard(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A00 = immutableList;
        this.A07 = str;
        C1pq.A08("copyMedia", bool);
        this.A04 = bool;
        this.A01 = immutableList2;
        this.A08 = str2;
        this.A02 = immutableList3;
        C1pq.A08("offlineCardId", str3);
        this.A09 = str3;
        C1pq.A08("scanAttachmentForNudity", bool2);
        this.A05 = bool2;
        this.A0A = str4;
        this.A03 = immutableList4;
        this.A0B = str5;
        C1pq.A08("timestamp", l);
        this.A06 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PendingMontageCard)) {
                return false;
            }
            PendingMontageCard pendingMontageCard = (PendingMontageCard) obj;
            if (!11T.A0O(this.A00, pendingMontageCard.A00) || !11T.A0O(this.A07, pendingMontageCard.A07) || !11T.A0O(this.A04, pendingMontageCard.A04) || !11T.A0O(this.A01, pendingMontageCard.A01) || !11T.A0O(this.A08, pendingMontageCard.A08) || !11T.A0O(this.A02, pendingMontageCard.A02) || !11T.A0O(this.A09, pendingMontageCard.A09) || !11T.A0O(this.A05, pendingMontageCard.A05) || !11T.A0O(this.A0A, pendingMontageCard.A0A) || !11T.A0O(this.A03, pendingMontageCard.A03) || !11T.A0O(this.A0B, pendingMontageCard.A0B) || !11T.A0O(this.A06, pendingMontageCard.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A0B, C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A05, C1pq.A04(this.A09, C1pq.A04(this.A02, C1pq.A04(this.A08, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A07, C1pq.A03(this.A00))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A04.booleanValue() ? 1 : 0);
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((MontageFeedbackOverlay) A0Y2.next(), i);
            }
        }
        1BL.A13(parcel, this.A08);
        ImmutableList immutableList3 = this.A02;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                C3o5.A0h(parcel, A0Y3);
            }
        }
        parcel.writeString(this.A09);
        parcel.writeInt(this.A05.booleanValue() ? 1 : 0);
        1BL.A13(parcel, this.A0A);
        ImmutableList immutableList4 = this.A03;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                C3o5.A0h(parcel, A0Y4);
            }
        }
        1BL.A13(parcel, this.A0B);
        parcel.writeLong(this.A06.longValue());
    }
}
