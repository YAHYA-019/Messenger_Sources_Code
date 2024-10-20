package com.facebook.messaging.montage.model.cards;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import X.GOp;
import X.HhW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageTagSticker.class */
public final class MontageTagSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A05;
    public static final Parcelable.Creator CREATOR = CST.A00(21);
    public final String A00;
    public final String A01;
    public final String A02;
    public final MontageStickerOverlayBounds A03;
    public final Set A04;

    public MontageTagSticker(HhW hhW) {
        this.A03 = hhW.A00;
        this.A00 = hhW.A01;
        String str = hhW.A02;
        C1pq.A08("tagId", str);
        this.A01 = str;
        String str2 = hhW.A03;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        this.A02 = str2;
        this.A04 = Collections.unmodifiableSet(hhW.A04);
    }

    public MontageTagSticker(Parcel parcel) {
        this.A03 = parcel.readInt() != 0 ? (MontageStickerOverlayBounds) parcel.readParcelable(4YV.A0e(this)) : null;
        this.A00 = C3o5.A0O(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public MontageTagSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, Set set) {
        this.A03 = montageStickerOverlayBounds;
        this.A00 = null;
        C1pq.A08("tagId", str);
        this.A01 = str;
        this.A02 = "PEOPLE";
        this.A04 = Collections.unmodifiableSet(set);
    }

    public MontageStickerOverlayBounds A00() {
        if (this.A04.contains("montageStickerOverlayBounds")) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = GOp.A0M();
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageTagSticker)) {
                return false;
            }
            MontageTagSticker montageTagSticker = (MontageTagSticker) obj;
            if (!11T.A0O(A00(), montageTagSticker.A00()) || !11T.A0O(this.A00, montageTagSticker.A00) || !11T.A0O(this.A01, montageTagSticker.A01) || !11T.A0O(this.A02, montageTagSticker.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(A00()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A03, i);
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
