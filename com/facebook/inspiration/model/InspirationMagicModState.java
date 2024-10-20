package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMG;
import X.FKf;
import X.RP6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBAIGenModelFailureType;
import com.facebook.inspiration.magicmod.model.MagicModImage;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationMagicModState.class */
public final class InspirationMagicModState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(58);
    public final GraphQLXFBAIGenModelFailureType A00;
    public final EMG A01;
    public final MediaData A02;
    public final MediaData A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public InspirationMagicModState(RP6 rp6) {
        this.A02 = rp6.A02;
        this.A06 = rp6.A06;
        ImmutableList immutableList = rp6.A04;
        C1pq.A08("generatedImages", immutableList);
        this.A04 = immutableList;
        this.A07 = rp6.A07;
        this.A08 = rp6.A08;
        this.A00 = rp6.A00;
        this.A09 = rp6.A09;
        this.A03 = rp6.A03;
        this.A01 = rp6.A01;
        ImmutableList immutableList2 = rp6.A05;
        C1pq.A08("savedImages", immutableList2);
        this.A05 = immutableList2;
        this.A0A = rp6.A0A;
    }

    public InspirationMagicModState(Parcel parcel) {
        EMG emg = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        int readInt = parcel.readInt();
        MagicModImage[] magicModImageArr = new MagicModImage[readInt];
        int i = 0;
        while (i < readInt) {
            i = DKG.A02(parcel, MagicModImage.CREATOR, magicModImageArr, i);
        }
        this.A04 = ImmutableList.copyOf(magicModImageArr);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = GraphQLXFBAIGenModelFailureType.values()[parcel.readInt()];
        }
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0Y(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? EMG.values()[parcel.readInt()] : emg;
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A05 = ImmutableList.copyOf(strArr);
        this.A0A = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMagicModState)) {
                return false;
            }
            InspirationMagicModState inspirationMagicModState = (InspirationMagicModState) obj;
            if (!11T.A0O(this.A02, inspirationMagicModState.A02) || !11T.A0O(this.A06, inspirationMagicModState.A06) || !11T.A0O(this.A04, inspirationMagicModState.A04) || !11T.A0O(this.A07, inspirationMagicModState.A07) || !11T.A0O(this.A08, inspirationMagicModState.A08) || this.A00 != inspirationMagicModState.A00 || this.A09 != inspirationMagicModState.A09 || !11T.A0O(this.A03, inspirationMagicModState.A03) || this.A01 != inspirationMagicModState.A01 || !11T.A0O(this.A05, inspirationMagicModState.A05) || this.A0A != inspirationMagicModState.A0A) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A03(this.A02)))));
        int A042 = C1pq.A04(this.A03, C1pq.A02((A04 * 31) + C3o5.A03(this.A00), this.A09));
        return C1pq.A02(C1pq.A04(this.A05, (A042 * 31) + DKF.A04(this.A01)), this.A0A);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A10(parcel, this.A02, i);
        1BL.A13(parcel, this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            ((MagicModImage) A0b.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0e(parcel, this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
        DKH.A10(parcel, this.A03, i);
        C3o5.A0e(parcel, this.A01);
        1Du A0b2 = 1BL.A0b(parcel, this.A05);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
