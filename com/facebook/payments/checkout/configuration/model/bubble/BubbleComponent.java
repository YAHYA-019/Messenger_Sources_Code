package com.facebook.payments.checkout.configuration.model.bubble;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C2203Dgv;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKY;
import X.RLk;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BubbleComponent.class */
public final class BubbleComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(96);
    public final C2203Dgv A00;
    public final String A01;
    public final String A02;

    public BubbleComponent(C2203Dgv c2203Dgv, String str) {
        this.A00 = c2203Dgv;
        this.A01 = str;
        this.A02 = null;
    }

    public BubbleComponent(RLk rLk) {
        this.A00 = rLk.A00;
        this.A01 = rLk.A01;
        this.A02 = rLk.A02;
    }

    public BubbleComponent(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (C2203Dgv) FJ8.A01(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BubbleComponent)) {
                return false;
            }
            BubbleComponent bubbleComponent = (BubbleComponent) obj;
            if (!11T.A0O(this.A00, bubbleComponent.A00) || !11T.A0O(this.A01, bubbleComponent.A01) || !11T.A0O(this.A02, bubbleComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
