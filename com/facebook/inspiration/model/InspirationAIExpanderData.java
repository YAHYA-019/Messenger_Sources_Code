package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbJ;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMG;
import X.FKf;
import X.RPK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBAIGenModelFailureType;
import com.facebook.inspiration.genai.aiexpander.model.AIExpanderImage;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationAIExpanderData.class */
public final class InspirationAIExpanderData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(43);
    public final GraphQLXFBAIGenModelFailureType A00;
    public final AIExpanderImage A01;
    public final EMG A02;
    public final EMG A03;
    public final MediaData A04;
    public final MediaData A05;
    public final ImmutableList A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public InspirationAIExpanderData(RPK rpk) {
        this.A01 = rpk.A01;
        this.A04 = rpk.A04;
        this.A02 = rpk.A02;
        this.A0B = rpk.A0B;
        this.A0C = rpk.A0C;
        ImmutableList immutableList = rpk.A06;
        C1pq.A08("generatedImages", immutableList);
        this.A06 = immutableList;
        this.A00 = rpk.A00;
        this.A08 = rpk.A08;
        this.A0D = rpk.A0D;
        this.A0E = rpk.A0E;
        this.A0F = rpk.A0F;
        this.A0G = rpk.A0G;
        this.A07 = rpk.A07;
        this.A05 = rpk.A05;
        this.A09 = rpk.A09;
        this.A0A = rpk.A0A;
        this.A03 = rpk.A03;
    }

    public InspirationAIExpanderData(Parcel parcel) {
        EMG emg = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = (AIExpanderImage) AIExpanderImage.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = EMG.values()[parcel.readInt()];
        }
        this.A0B = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0C = 1BM.A07(parcel);
        int readInt = parcel.readInt();
        AIExpanderImage[] aIExpanderImageArr = new AIExpanderImage[readInt];
        int i = 0;
        while (i < readInt) {
            i = DKG.A02(parcel, AIExpanderImage.CREATOR, aIExpanderImageArr, i);
        }
        this.A06 = ImmutableList.copyOf(aIExpanderImageArr);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = GraphQLXFBAIGenModelFailureType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = Boolean.valueOf(AbJ.A1W(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? EMG.values()[parcel.readInt()] : emg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAIExpanderData)) {
                return false;
            }
            InspirationAIExpanderData inspirationAIExpanderData = (InspirationAIExpanderData) obj;
            if (!11T.A0O(this.A01, inspirationAIExpanderData.A01) || !11T.A0O(this.A04, inspirationAIExpanderData.A04) || this.A02 != inspirationAIExpanderData.A02 || this.A0B != inspirationAIExpanderData.A0B || this.A0C != inspirationAIExpanderData.A0C || !11T.A0O(this.A06, inspirationAIExpanderData.A06) || this.A00 != inspirationAIExpanderData.A00 || !11T.A0O(this.A08, inspirationAIExpanderData.A08) || this.A0D != inspirationAIExpanderData.A0D || this.A0E != inspirationAIExpanderData.A0E || this.A0F != inspirationAIExpanderData.A0F || this.A0G != inspirationAIExpanderData.A0G || !11T.A0O(this.A07, inspirationAIExpanderData.A07) || !11T.A0O(this.A05, inspirationAIExpanderData.A05) || !11T.A0O(this.A09, inspirationAIExpanderData.A09) || !11T.A0O(this.A0A, inspirationAIExpanderData.A0A) || this.A03 != inspirationAIExpanderData.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, C1pq.A03(this.A01));
        int A042 = C1pq.A04(this.A06, C1pq.A02(C1pq.A02((A04 * 31) + C3o5.A03(this.A02), this.A0B), this.A0C));
        int A043 = C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A05, C1pq.A04(this.A07, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A08, (A042 * 31) + C3o5.A03(this.A00)), this.A0D), this.A0E), this.A0F), this.A0G)))));
        return (A043 * 31) + DKF.A04(this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AIExpanderImage aIExpanderImage = this.A01;
        if (aIExpanderImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIExpanderImage.writeToParcel(parcel, i);
        }
        DKH.A10(parcel, this.A04, i);
        C3o5.A0e(parcel, this.A02);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A06);
        while (A0b.hasNext()) {
            ((AIExpanderImage) A0b.next()).writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        AbN.A0s(parcel, this.A07);
        DKH.A10(parcel, this.A05, i);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        C3o5.A0e(parcel, this.A03);
    }
}
