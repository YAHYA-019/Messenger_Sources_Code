package com.facebook.inspiration.capture.multicapture.remix.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKf;
import X.QqY;
import X.RaL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationRemixData.class */
public final class InspirationRemixData implements Parcelable {
    public static volatile QqY A0H;
    public static final Parcelable.Creator CREATOR = FKf.A01(22);
    public final int A00;
    public final int A01;
    public final QqY A02;
    public final MediaData A03;
    public final PersistableRect A04;
    public final PersistableRect A05;
    public final PersistableRect A06;
    public final PersistableRect A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final Set A0E;
    public final boolean A0F;
    public final boolean A0G;

    public InspirationRemixData(RaL raL) {
        this.A08 = raL.A08;
        this.A0F = raL.A0F;
        this.A0G = raL.A0G;
        this.A09 = raL.A09;
        this.A04 = raL.A04;
        String str = raL.A0A;
        C1pq.A08("originalVideoDownloadSessionId", str);
        this.A0A = str;
        this.A00 = raL.A00;
        String str2 = raL.A0B;
        C1pq.A08("originalVideoId", str2);
        this.A0B = str2;
        this.A03 = raL.A03;
        this.A0C = raL.A0C;
        this.A05 = raL.A05;
        this.A01 = raL.A01;
        this.A06 = raL.A06;
        this.A07 = raL.A07;
        String str3 = raL.A0D;
        C1pq.A08("remixLayoutType", str3);
        this.A0D = str3;
        this.A02 = raL.A02;
        this.A0E = Collections.unmodifiableSet(raL.A0E);
    }

    public InspirationRemixData(Parcel parcel) {
        QqY qqY = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        int i = 0;
        this.A0F = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0G = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0o(parcel);
        }
        this.A0A = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0B = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0o(parcel);
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = DKG.A0o(parcel);
        }
        this.A0D = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? QqY.values()[parcel.readInt()] : qqY;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0E = Collections.unmodifiableSet(A0v);
    }

    public QqY A00() {
        if (this.A0E.contains("selectedLayoutConfiguration")) {
            return this.A02;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = QqY.A0B;
                }
            }
        }
        return A0H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationRemixData)) {
                return false;
            }
            InspirationRemixData inspirationRemixData = (InspirationRemixData) obj;
            if (!11T.A0O(this.A08, inspirationRemixData.A08) || this.A0F != inspirationRemixData.A0F || this.A0G != inspirationRemixData.A0G || !11T.A0O(this.A09, inspirationRemixData.A09) || !11T.A0O(this.A04, inspirationRemixData.A04) || !11T.A0O(this.A0A, inspirationRemixData.A0A) || this.A00 != inspirationRemixData.A00 || !11T.A0O(this.A0B, inspirationRemixData.A0B) || !11T.A0O(this.A03, inspirationRemixData.A03) || !11T.A0O(this.A0C, inspirationRemixData.A0C) || !11T.A0O(this.A05, inspirationRemixData.A05) || this.A01 != inspirationRemixData.A01 || !11T.A0O(this.A06, inspirationRemixData.A06) || !11T.A0O(this.A07, inspirationRemixData.A07) || !11T.A0O(this.A0D, inspirationRemixData.A0D) || A00() != inspirationRemixData.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0D, C1pq.A04(this.A07, C1pq.A04(this.A06, (C1pq.A04(this.A05, C1pq.A04(this.A0C, C1pq.A04(this.A03, C1pq.A04(this.A0B, (C1pq.A04(this.A0A, C1pq.A04(this.A04, C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A03(this.A08), this.A0F), this.A0G)))) * 31) + this.A00)))) * 31) + this.A01)));
        return (A04 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        1BL.A13(parcel, this.A09);
        DKH.A11(parcel, this.A04, i);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0B);
        DKH.A10(parcel, this.A03, i);
        1BL.A13(parcel, this.A0C);
        DKH.A11(parcel, this.A05, i);
        parcel.writeInt(this.A01);
        DKH.A11(parcel, this.A06, i);
        DKH.A11(parcel, this.A07, i);
        parcel.writeString(this.A0D);
        C3o5.A0e(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A0E);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
