package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationHashtagStickerOverlayInfo.class */
public final class InspirationHashtagStickerOverlayInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A06;
    public static final Parcelable.Creator CREATOR = FKc.A00(17);
    public final InspirationTimedElementParams A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final InspirationOverlayPosition A04;
    public final Set A05;

    public InspirationHashtagStickerOverlayInfo(Parcel parcel) {
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationTimedElementParams) InspirationTimedElementParams.CREATOR.createFromParcel(parcel);
        }
        this.A04 = parcel.readInt() != 0 ? DKG.A0W(parcel) : inspirationOverlayPosition;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public InspirationHashtagStickerOverlayInfo(InspirationOverlayPosition inspirationOverlayPosition, InspirationTimedElementParams inspirationTimedElementParams, String str, String str2, String str3, Set set) {
        this.A00 = inspirationTimedElementParams;
        this.A04 = inspirationOverlayPosition;
        C1pq.A08("stickerImageAssetId", str);
        this.A01 = str;
        C1pq.A08(AbE.A00(739), str2);
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A05)) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = DKG.A0V();
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationHashtagStickerOverlayInfo)) {
                return false;
            }
            InspirationHashtagStickerOverlayInfo inspirationHashtagStickerOverlayInfo = (InspirationHashtagStickerOverlayInfo) obj;
            if (!11T.A0O(this.A00, inspirationHashtagStickerOverlayInfo.A00) || !11T.A0O(A00(), inspirationHashtagStickerOverlayInfo.A00()) || !11T.A0O(this.A01, inspirationHashtagStickerOverlayInfo.A01) || !11T.A0O(this.A02, inspirationHashtagStickerOverlayInfo.A02) || !11T.A0O(this.A03, inspirationHashtagStickerOverlayInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(A00(), C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationTimedElementParams inspirationTimedElementParams = this.A00;
        if (inspirationTimedElementParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTimedElementParams.writeToParcel(parcel, i);
        }
        DKH.A0z(parcel, this.A04, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
