package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKW;
import X.QqY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: RemixParams.class */
public final class RemixParams implements Parcelable {
    public static volatile QqY A0B;
    public static final Parcelable.Creator CREATOR = FKW.A00(21);
    public final int A00;
    public final MediaData A01;
    public final PersistableRect A02;
    public final PersistableRect A03;
    public final PersistableRect A04;
    public final PersistableRect A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final QqY A09;
    public final Set A0A;

    public RemixParams(QqY qqY, MediaData mediaData, PersistableRect persistableRect, PersistableRect persistableRect2, PersistableRect persistableRect3, PersistableRect persistableRect4, String str, String str2, String str3, Set set, int i) {
        this.A06 = str;
        this.A00 = i;
        this.A07 = str2;
        this.A02 = persistableRect;
        this.A01 = mediaData;
        this.A03 = persistableRect2;
        this.A04 = persistableRect3;
        this.A05 = persistableRect4;
        C1pq.A08("remixLayoutType", str3);
        this.A08 = str3;
        this.A09 = qqY;
        this.A0A = Collections.unmodifiableSet(set);
    }

    public RemixParams(Parcel parcel) {
        QqY qqY = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0o(parcel);
        }
        this.A08 = parcel.readString();
        this.A09 = parcel.readInt() != 0 ? QqY.values()[parcel.readInt()] : qqY;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0A = Collections.unmodifiableSet(A0v);
    }

    public QqY A00() {
        if (this.A0A.contains("selectedLayoutConfiguration")) {
            return this.A09;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = QqY.A0B;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RemixParams)) {
                return false;
            }
            RemixParams remixParams = (RemixParams) obj;
            if (!11T.A0O(this.A06, remixParams.A06) || this.A00 != remixParams.A00 || !11T.A0O(this.A07, remixParams.A07) || !11T.A0O(this.A02, remixParams.A02) || !11T.A0O(this.A01, remixParams.A01) || !11T.A0O(this.A03, remixParams.A03) || !11T.A0O(this.A04, remixParams.A04) || !11T.A0O(this.A05, remixParams.A05) || !11T.A0O(this.A08, remixParams.A08) || A00() != remixParams.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A07, (C1pq.A03(this.A06) * 31) + this.A00)))))));
        return (A04 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A07);
        DKH.A11(parcel, this.A02, i);
        DKH.A10(parcel, this.A01, i);
        DKH.A11(parcel, this.A03, i);
        DKH.A11(parcel, this.A04, i);
        DKH.A11(parcel, this.A05, i);
        parcel.writeString(this.A08);
        C3o5.A0e(parcel, this.A09);
        Iterator A0S = C3o5.A0S(parcel, this.A0A);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
