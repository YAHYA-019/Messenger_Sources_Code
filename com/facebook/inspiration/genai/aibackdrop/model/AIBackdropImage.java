package com.facebook.inspiration.genai.aibackdrop.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerParams;
import com.facebook.ipc.media.data.MediaData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AIBackdropImage.class */
public final class AIBackdropImage implements Parcelable {
    public static volatile MediaData A09;
    public static final Parcelable.Creator CREATOR = FKf.A01(33);
    public final InspirationStickerParams A00;
    public final MediaData A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public AIBackdropImage(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        int i = 0;
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = AbJ.A1V(parcel);
        InspirationStickerParams inspirationStickerParams = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = DKG.A0Y(parcel);
        }
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? (InspirationStickerParams) InspirationStickerParams.CREATOR.createFromParcel(parcel) : inspirationStickerParams;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public AIBackdropImage(InspirationStickerParams inspirationStickerParams, MediaData mediaData, String str, String str2, String str3, String str4, Set set, boolean z, boolean z2) {
        AbF.A1T(str);
        this.A02 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = str2;
        this.A01 = mediaData;
        C1pq.A08("networkUri", str3);
        this.A04 = str3;
        C1pq.A08("prompt", str4);
        this.A05 = str4;
        this.A00 = inspirationStickerParams;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public MediaData A00() {
        if (this.A06.contains("mediaData")) {
            return this.A01;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = DKI.A0C();
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AIBackdropImage)) {
                return false;
            }
            AIBackdropImage aIBackdropImage = (AIBackdropImage) obj;
            if (!11T.A0O(this.A02, aIBackdropImage.A02) || this.A07 != aIBackdropImage.A07 || this.A08 != aIBackdropImage.A08 || !11T.A0O(this.A03, aIBackdropImage.A03) || !11T.A0O(A00(), aIBackdropImage.A00()) || !11T.A0O(this.A04, aIBackdropImage.A04) || !11T.A0O(this.A05, aIBackdropImage.A05) || !11T.A0O(this.A00, aIBackdropImage.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A03(this.A02), this.A07), this.A08))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        DKH.A10(parcel, this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        InspirationStickerParams inspirationStickerParams = this.A00;
        if (inspirationStickerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationStickerParams.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
