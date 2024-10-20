package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1Du;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.EPI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationTextMention.class */
public final class InspirationTextMention implements Parcelable {
    public static volatile EPI A08;
    public static final Parcelable.Creator CREATOR = FKc.A00(52);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final EPI A06;
    public final Set A07;

    public InspirationTextMention(EPI epi, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, Set set) {
        C1pq.A08("bounds", immutableList);
        this.A00 = immutableList;
        C1pq.A08("highlightingName", str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = epi;
        C1pq.A08("tagFBID", str5);
        this.A05 = str5;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public InspirationTextMention(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        PersistableRect[] persistableRectArr = new PersistableRect[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = DKG.A02(parcel, PersistableRect.CREATOR, persistableRectArr, i2);
        }
        this.A00 = ImmutableList.copyOf(persistableRectArr);
        this.A01 = parcel.readString();
        String str = null;
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
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = DKH.A0Q(parcel);
        this.A05 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public EPI A00() {
        if (this.A07.contains("stickerType")) {
            return this.A06;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = EPI.A13;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTextMention)) {
                return false;
            }
            InspirationTextMention inspirationTextMention = (InspirationTextMention) obj;
            if (!11T.A0O(this.A00, inspirationTextMention.A00) || !11T.A0O(this.A01, inspirationTextMention.A01) || !11T.A0O(this.A02, inspirationTextMention.A02) || !11T.A0O(this.A03, inspirationTextMention.A03) || !11T.A0O(this.A04, inspirationTextMention.A04) || A00() != inspirationTextMention.A00() || !11T.A0O(this.A05, inspirationTextMention.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))));
        return C1pq.A04(this.A05, (A04 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((PersistableRect) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        C3o5.A0e(parcel, this.A06);
        parcel.writeString(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
