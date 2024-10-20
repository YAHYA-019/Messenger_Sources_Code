package com.facebook.messaging.montage.model.cards;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C2578Ghr;
import X.C3o5;
import X.CST;
import X.FJ8;
import X.GOp;
import X.HjO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.forked.viewer.overlays.slider.model.FbSliderVotesModel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageSliderSticker.class */
public final class MontageSliderSticker implements Parcelable {
    public static volatile MontageStickerOverlayBounds A09;
    public static final Parcelable.Creator CREATOR = CST.A00(19);
    public final C2578Ghr A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final FbSliderVotesModel A06;
    public final MontageStickerOverlayBounds A07;
    public final Set A08;

    public MontageSliderSticker(C2578Ghr c2578Ghr, FbSliderVotesModel fbSliderVotesModel, MontageStickerOverlayBounds montageStickerOverlayBounds, String str, String str2, String str3, String str4, String str5, Set set) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = c2578Ghr;
        this.A07 = montageStickerOverlayBounds;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = fbSliderVotesModel;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public MontageSliderSticker(HjO hjO) {
        this.A01 = hjO.A02;
        this.A02 = hjO.A03;
        this.A03 = hjO.A04;
        this.A00 = hjO.A00;
        this.A07 = hjO.A01;
        this.A04 = hjO.A05;
        this.A05 = hjO.A06;
        this.A06 = null;
        this.A08 = Collections.unmodifiableSet(hjO.A07);
    }

    public MontageSliderSticker(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        FbSliderVotesModel fbSliderVotesModel = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (C2578Ghr) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (MontageStickerOverlayBounds) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? (FbSliderVotesModel) FbSliderVotesModel.CREATOR.createFromParcel(parcel) : fbSliderVotesModel;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public MontageStickerOverlayBounds A00() {
        if (this.A08.contains("stickerBounds")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = GOp.A0M();
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
            if (!(obj instanceof MontageSliderSticker)) {
                return false;
            }
            MontageSliderSticker montageSliderSticker = (MontageSliderSticker) obj;
            if (!11T.A0O(this.A01, montageSliderSticker.A01) || !11T.A0O(this.A02, montageSliderSticker.A02) || !11T.A0O(this.A03, montageSliderSticker.A03) || !11T.A0O(this.A00, montageSliderSticker.A00) || !11T.A0O(A00(), montageSliderSticker.A00()) || !11T.A0O(this.A04, montageSliderSticker.A04) || !11T.A0O(this.A05, montageSliderSticker.A05) || !11T.A0O(this.A06, montageSliderSticker.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C2578Ghr c2578Ghr = this.A00;
        if (c2578Ghr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, c2578Ghr);
        }
        C3o5.A0d(parcel, this.A07, i);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        FbSliderVotesModel fbSliderVotesModel = this.A06;
        if (fbSliderVotesModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fbSliderVotesModel.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
