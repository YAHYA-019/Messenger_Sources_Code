package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.composedtext.ComposedTextBlock;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerTextData.class */
public final class ComposerTextData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(72);
    public final ImmutableList A00;

    public ComposerTextData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        ComposedTextBlock[] composedTextBlockArr = new ComposedTextBlock[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A00 = ImmutableList.copyOf(composedTextBlockArr);
                return;
            }
            i = DKG.A02(parcel, ComposedTextBlock.CREATOR, composedTextBlockArr, i2);
        }
    }

    public ComposerTextData(ImmutableList immutableList) {
        C1pq.A08("composedTextBlocks", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerTextData) && 11T.A0O(this.A00, ((ComposerTextData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((ComposedTextBlock) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
