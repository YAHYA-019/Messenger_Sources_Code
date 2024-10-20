package com.facebook.inspiration.model.movableoverlay.caption;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbM;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKI;
import X.FKc;
import X.GKi;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.audiosharing.model.AudioTranscriptionTokenParam;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationCaptionStickerInfo.class */
public final class InspirationCaptionStickerInfo implements Parcelable, GKi {
    public static volatile InspirationOverlayPosition A0A;
    public static final Parcelable.Creator CREATOR = FKc.A00(62);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final ImmutableList A06;
    public final boolean A07;
    public final InspirationOverlayPosition A08;
    public final Set A09;

    public InspirationCaptionStickerInfo(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        AudioTranscriptionTokenParam[] audioTranscriptionTokenParamArr = new AudioTranscriptionTokenParam[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, AudioTranscriptionTokenParam.CREATOR, audioTranscriptionTokenParamArr, i2);
        }
        this.A06 = ImmutableList.copyOf(audioTranscriptionTokenParamArr);
        this.A00 = parcel.readFloat();
        this.A07 = AbN.A1U(parcel);
        this.A08 = DKH.A0R(parcel, parcel.readInt());
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public InspirationCaptionStickerInfo(InspirationOverlayPosition inspirationOverlayPosition, ImmutableList immutableList, Set set, float f, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        C1pq.A08("detailedTranscriptions", immutableList);
        this.A06 = immutableList;
        this.A00 = f;
        this.A07 = z;
        this.A08 = inspirationOverlayPosition;
        this.A03 = i3;
        this.A04 = i4;
        this.A05 = i5;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A09)) {
            return this.A08;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = DKG.A0V();
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationCaptionStickerInfo)) {
                return false;
            }
            InspirationCaptionStickerInfo inspirationCaptionStickerInfo = (InspirationCaptionStickerInfo) obj;
            if (this.A01 != inspirationCaptionStickerInfo.A01 || this.A02 != inspirationCaptionStickerInfo.A02 || !11T.A0O(this.A06, inspirationCaptionStickerInfo.A06) || this.A00 != inspirationCaptionStickerInfo.A00 || this.A07 != inspirationCaptionStickerInfo.A07 || !11T.A0O(A00(), inspirationCaptionStickerInfo.A00()) || this.A03 != inspirationCaptionStickerInfo.A03 || this.A04 != inspirationCaptionStickerInfo.A04 || this.A05 != inspirationCaptionStickerInfo.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((C1pq.A04(A00(), C1pq.A02(AbM.A00(C1pq.A04(this.A06, ((this.A01 + 31) * 31) + this.A02), this.A00), this.A07)) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A06);
        while (A0b.hasNext()) {
            ((AudioTranscriptionTokenParam) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
        DKI.A0P(parcel, this.A08, i);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
