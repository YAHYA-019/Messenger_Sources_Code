package com.facebook.inspiration.emp.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.InspirationEffect;
import com.facebook.inspiration.model.fonts.InspirationFont;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: EMPModel.class */
public final class EMPModel implements Parcelable {
    public static volatile EMPOverlayModel A06;
    public static final Parcelable.Creator CREATOR = FKf.A01(30);
    public final EMPMediaModel A00;
    public final InspirationEffect A01;
    public final MusicTrackParams A02;
    public final ImmutableList A03;
    public final EMPOverlayModel A04;
    public final Set A05;

    public EMPModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        EMPOverlayModel eMPOverlayModel = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationEffect) InspirationEffect.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt = parcel.readInt();
            InspirationFont[] inspirationFontArr = new InspirationFont[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = DKG.A02(parcel, InspirationFont.CREATOR, inspirationFontArr, i2);
            }
            this.A03 = ImmutableList.copyOf(inspirationFontArr);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (EMPMediaModel) EMPMediaModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        this.A04 = parcel.readInt() != 0 ? (EMPOverlayModel) parcel.readParcelable(A0e) : eMPOverlayModel;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public EMPModel(EMPMediaModel eMPMediaModel, EMPOverlayModel eMPOverlayModel, InspirationEffect inspirationEffect, MusicTrackParams musicTrackParams, ImmutableList immutableList, Set set) {
        this.A01 = inspirationEffect;
        this.A03 = immutableList;
        this.A00 = eMPMediaModel;
        this.A02 = musicTrackParams;
        this.A04 = eMPOverlayModel;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public EMPOverlayModel A00() {
        if (this.A05.contains("overlayModel")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new EMPOverlayModel(ImmutableList.of());
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
            if (!(obj instanceof EMPModel)) {
                return false;
            }
            EMPModel eMPModel = (EMPModel) obj;
            if (!11T.A0O(this.A01, eMPModel.A01) || !11T.A0O(this.A03, eMPModel.A03) || !11T.A0O(this.A00, eMPModel.A00) || !11T.A0O(this.A02, eMPModel.A02) || !11T.A0O(A00(), eMPModel.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationEffect inspirationEffect = this.A01;
        if (inspirationEffect == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffect.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((InspirationFont) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        EMPMediaModel eMPMediaModel = this.A00;
        if (eMPMediaModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eMPMediaModel.writeToParcel(parcel, i);
        }
        MusicTrackParams musicTrackParams = this.A02;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A04, i);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
