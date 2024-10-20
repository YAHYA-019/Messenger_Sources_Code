package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.4YW;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKc;
import X.RMT;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TextToolActiveState.class */
public final class TextToolActiveState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(59);
    public final InspirationTextParams A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public TextToolActiveState(RMT rmt) {
        this.A00 = rmt.A00;
        this.A01 = rmt.A01;
        this.A02 = rmt.A02;
        this.A03 = rmt.A03;
    }

    public TextToolActiveState(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (InspirationTextParams) parcel.readParcelable(4YV.A0e(this));
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = 1BM.A07(parcel);
        this.A03 = AbJ.A1W(parcel);
    }

    public TextToolActiveState(InspirationTextParams inspirationTextParams, boolean z, boolean z2, boolean z3) {
        this.A00 = inspirationTextParams;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TextToolActiveState)) {
                return false;
            }
            TextToolActiveState textToolActiveState = (TextToolActiveState) obj;
            if (!11T.A0O(this.A00, textToolActiveState.A00) || this.A01 != textToolActiveState.A01 || this.A02 != textToolActiveState.A02 || this.A03 != textToolActiveState.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextToolActiveState{currentTextParams=");
        A0k.append(this.A00);
        A0k.append(", isColorPickerShown=");
        A0k.append(this.A01);
        A0k.append(", isCreatingNewText=");
        A0k.append(this.A02);
        A0k.append(", isInteractiveEffectEditingMode=");
        A0k.append(this.A03);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
