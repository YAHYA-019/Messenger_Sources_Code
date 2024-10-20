package com.facebook.xapp.messaging.gallery.model;

import X.0S2;
import X.11T;
import X.4YV;
import X.7zU;
import X.9hV;
import X.Aao;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: GalleryMediaItem.class */
public final class GalleryMediaItem implements Parcelable, Aao {
    public static volatile Integer A0C;
    public static final Parcelable.Creator CREATOR = new FKb(52);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final Set A0A;
    public final boolean A0B;

    public GalleryMediaItem(9hV r302) {
        String str = r302.A08;
        C1pq.A08(AbE.A00(46), str);
        this.A08 = str;
        this.A03 = r302.A03;
        this.A04 = r302.A04;
        this.A05 = r302.A05;
        this.A00 = r302.A00;
        this.A0B = r302.A0B;
        this.A07 = r302.A07;
        String str2 = r302.A09;
        C1pq.A08("mimeType", str2);
        this.A09 = str2;
        this.A01 = r302.A01;
        Uri uri = r302.A06;
        C1pq.A08(TraceFieldType.Uri, uri);
        this.A06 = uri;
        this.A02 = r302.A02;
        this.A0A = Collections.unmodifiableSet(r302.A0A);
        boolean z = this.A0B;
        int i = this.A01;
        if (z) {
            if (i < 0) {
                throw AnonymousClass001.A0L("If the model is selected, the selectedPositionIndex must be >= 0.");
            }
        } else if (i != -1) {
            throw AnonymousClass001.A0L("If the model is not selected, its selectedPositionIndex should be set to -1.");
        }
    }

    public GalleryMediaItem(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A08 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A00 = parcel.readInt();
        int i = 0;
        this.A0B = 4YV.A1U(parcel.readInt());
        this.A07 = parcel.readInt() == 0 ? null : 7zU.A0e(parcel, 2);
        this.A09 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A06 = (Uri) parcel.readParcelable(A0e);
        this.A02 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0A = Collections.unmodifiableSet(A0v);
    }

    @Override // X.Aao
    public Integer AsY() {
        if (this.A0A.contains("itemType")) {
            return this.A07;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = 0S2.A00;
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GalleryMediaItem)) {
                return false;
            }
            GalleryMediaItem galleryMediaItem = (GalleryMediaItem) obj;
            if (!11T.A0O(this.A08, galleryMediaItem.A08) || this.A03 != galleryMediaItem.A03 || this.A04 != galleryMediaItem.A04 || this.A05 != galleryMediaItem.A05 || this.A00 != galleryMediaItem.A00 || this.A0B != galleryMediaItem.A0B || AsY() != galleryMediaItem.AsY() || !11T.A0O(this.A09, galleryMediaItem.A09) || this.A01 != galleryMediaItem.A01 || !11T.A0O(this.A06, galleryMediaItem.A06) || this.A02 != galleryMediaItem.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02((C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A03(this.A08), this.A03), this.A04), this.A05) * 31) + this.A00, this.A0B);
        return (C1pq.A04(this.A06, (C1pq.A04(this.A09, (A02 * 31) + C3o5.A04(AsY())) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.A08);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        Integer num = this.A07;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A0A);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
