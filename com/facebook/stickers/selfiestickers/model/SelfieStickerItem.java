package com.facebook.stickers.selfiestickers.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.7zK;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SelfieStickerItem.class */
public final class SelfieStickerItem implements Parcelable {
    public static volatile Uri A03;
    public static final Parcelable.Creator CREATOR = FKe.A00(39);
    public final Uri A00;
    public final String A01;
    public final Set A02;

    public SelfieStickerItem(Uri uri, String str, Set set) {
        AbF.A1T(str);
        this.A01 = str;
        this.A00 = uri;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public SelfieStickerItem(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt() == 0 ? null : (Uri) parcel.readParcelable(A0e);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    private Uri A00() {
        if (this.A02.contains(7zK.A00(39))) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    Uri uri = Uri.EMPTY;
                    11T.A0B(uri);
                    A03 = uri;
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SelfieStickerItem)) {
                return false;
            }
            SelfieStickerItem selfieStickerItem = (SelfieStickerItem) obj;
            if (!11T.A0O(this.A01, selfieStickerItem.A01) || !11T.A0O(A00(), selfieStickerItem.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        4YW.A0D(parcel, this.A00, i);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
