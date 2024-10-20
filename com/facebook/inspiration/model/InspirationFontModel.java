package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.F7t;
import X.FKf;
import X.Ra8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.fonts.InspirationFont;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationFontModel.class */
public final class InspirationFontModel implements Parcelable {
    public static volatile InspirationFont A03;
    public static final Parcelable.Creator CREATOR = FKf.A01(53);
    public final InspirationFont A00;
    public final ImmutableList A01;
    public final Set A02;

    public InspirationFontModel(Ra8 ra8) {
        ImmutableList immutableList = ra8.A01;
        C1pq.A08("customFonts", immutableList);
        this.A01 = immutableList;
        this.A00 = ra8.A00;
        this.A02 = Collections.unmodifiableSet(ra8.A02);
    }

    public InspirationFontModel(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        InspirationFont[] inspirationFontArr = new InspirationFont[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = DKG.A02(parcel, InspirationFont.CREATOR, inspirationFontArr, i2);
        }
        this.A01 = ImmutableList.copyOf(inspirationFontArr);
        this.A00 = parcel.readInt() == 0 ? null : (InspirationFont) InspirationFont.CREATOR.createFromParcel(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public InspirationFontModel(InspirationFont inspirationFont, ImmutableList immutableList, Set set) {
        C1pq.A08("customFonts", immutableList);
        this.A01 = immutableList;
        this.A00 = inspirationFont;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationFont A00() {
        if (this.A02.contains("selectedFont")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = F7t.A03;
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
            if (!(obj instanceof InspirationFontModel)) {
                return false;
            }
            InspirationFontModel inspirationFontModel = (InspirationFontModel) obj;
            if (!11T.A0O(this.A01, inspirationFontModel.A01) || !11T.A0O(A00(), inspirationFontModel.A00())) {
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
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            ((InspirationFont) A0b.next()).writeToParcel(parcel, i);
        }
        InspirationFont inspirationFont = this.A00;
        if (inspirationFont == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationFont.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
