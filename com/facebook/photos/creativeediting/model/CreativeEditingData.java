package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKW;
import X.GKv;
import X.Res;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.magicmod.model.MagicModImage;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CreativeEditingData.class */
public final class CreativeEditingData implements Parcelable, GKv {
    public static volatile String A0T;
    public static final Parcelable.Creator CREATOR = FKW.A00(15);
    public final float A00;
    public final float A01;
    public final int A02;
    public final MagicModImage A03;
    public final InspirationZoomCropParams A04;
    public final AIBackdropParams A05;
    public final AiImagineParams A06;
    public final StoryBackgroundGradientColor A07;
    public final PersistableRect A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final Set A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public CreativeEditingData(Res res) {
        ImmutableList immutableList = res.A09;
        C1pq.A08("addYoursTemplateOverlayItems", immutableList);
        this.A09 = immutableList;
        this.A05 = res.A05;
        this.A0I = res.A0I;
        this.A06 = res.A06;
        this.A0A = res.A0A;
        this.A00 = res.A00;
        this.A0J = res.A0J;
        this.A08 = res.A08;
        this.A0K = res.A0K;
        ImmutableList immutableList2 = res.A0B;
        C1pq.A08("doodleParamsList", immutableList2);
        this.A0B = immutableList2;
        this.A0L = res.A0L;
        this.A0M = res.A0M;
        ImmutableList immutableList3 = res.A0C;
        C1pq.A08("frameOverlayItems", immutableList3);
        this.A0C = immutableList3;
        ImmutableList immutableList4 = res.A0D;
        C1pq.A08("framePacks", immutableList4);
        this.A0D = immutableList4;
        this.A0Q = res.A0Q;
        this.A0R = res.A0R;
        this.A03 = res.A03;
        this.A0N = res.A0N;
        this.A0O = res.A0O;
        this.A0E = res.A0E;
        this.A02 = res.A02;
        this.A01 = res.A01;
        this.A0S = res.A0S;
        ImmutableList immutableList5 = res.A0F;
        C1pq.A08("stickerParamsList", immutableList5);
        this.A0F = immutableList5;
        ImmutableList immutableList6 = res.A0G;
        C1pq.A08("storiesPhotoOverlayItems", immutableList6);
        this.A0G = immutableList6;
        this.A07 = res.A07;
        ImmutableList immutableList7 = res.A0H;
        C1pq.A08("textParamsList", immutableList7);
        this.A0H = immutableList7;
        this.A04 = res.A04;
        this.A0P = Collections.unmodifiableSet(res.A0P);
    }

    public CreativeEditingData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        OverlayParamsHolder[] overlayParamsHolderArr = new OverlayParamsHolder[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, overlayParamsHolderArr, i2);
        }
        this.A09 = ImmutableList.copyOf(overlayParamsHolderArr);
        InspirationZoomCropParams inspirationZoomCropParams = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (AIBackdropParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (AiImagineParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr, i3);
            }
            this.A0A = ImmutableList.copyOf(strArr);
        }
        this.A00 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        int readInt3 = parcel.readInt();
        DoodleParams[] doodleParamsArr = new DoodleParams[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = DKG.A02(parcel, DoodleParams.CREATOR, doodleParamsArr, i4);
        }
        this.A0B = ImmutableList.copyOf(doodleParamsArr);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        int readInt4 = parcel.readInt();
        StickerParams[] stickerParamsArr = new StickerParams[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, StickerParams.CREATOR, stickerParamsArr, i5);
        }
        this.A0C = ImmutableList.copyOf(stickerParamsArr);
        this.A0D = FJ8.A02(parcel);
        this.A0Q = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0R = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (MagicModImage) MagicModImage.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            int readInt5 = parcel.readInt();
            String[] strArr2 = new String[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbH.A00(parcel, strArr2, i6);
            }
            this.A0E = ImmutableList.copyOf(strArr2);
        }
        this.A02 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0S = AbJ.A1V(parcel);
        int readInt6 = parcel.readInt();
        StickerParams[] stickerParamsArr2 = new StickerParams[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = DKG.A02(parcel, StickerParams.CREATOR, stickerParamsArr2, i7);
        }
        this.A0F = ImmutableList.copyOf(stickerParamsArr2);
        int readInt7 = parcel.readInt();
        OverlayParamsHolder[] overlayParamsHolderArr2 = new OverlayParamsHolder[readInt7];
        int i8 = 0;
        while (i8 < readInt7) {
            i8 = AbI.A01(parcel, A0e, overlayParamsHolderArr2, i8);
        }
        this.A0G = ImmutableList.copyOf(overlayParamsHolderArr2);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (StoryBackgroundGradientColor) parcel.readParcelable(A0e);
        }
        int readInt8 = parcel.readInt();
        TextParams[] textParamsArr = new TextParams[readInt8];
        int i9 = 0;
        while (i9 < readInt8) {
            i9 = DKG.A02(parcel, TextParams.CREATOR, textParamsArr, i9);
        }
        this.A0H = ImmutableList.copyOf(textParamsArr);
        this.A04 = parcel.readInt() != 0 ? (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel) : inspirationZoomCropParams;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt9 = parcel.readInt();
        while (i < readInt9) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0P = Collections.unmodifiableSet(A0v);
    }

    public static Res A00(GKv gKv) {
        return gKv != null ? new Res(gKv) : new Res();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreativeEditingData)) {
                return false;
            }
            CreativeEditingData creativeEditingData = (CreativeEditingData) obj;
            if (!11T.A0O(this.A09, creativeEditingData.A09) || !11T.A0O(this.A05, creativeEditingData.A05) || !11T.A0O(this.A0I, creativeEditingData.A0I) || !11T.A0O(this.A06, creativeEditingData.A06) || !11T.A0O(this.A0A, creativeEditingData.A0A) || this.A00 != creativeEditingData.A00 || !11T.A0O(this.A0J, creativeEditingData.A0J) || !11T.A0O(this.A08, creativeEditingData.A08) || !11T.A0O(this.A0K, creativeEditingData.A0K) || !11T.A0O(this.A0B, creativeEditingData.A0B) || !11T.A0O(this.A0L, creativeEditingData.A0L) || !11T.A0O(getFilterName(), creativeEditingData.getFilterName()) || !11T.A0O(this.A0C, creativeEditingData.A0C) || !11T.A0O(this.A0D, creativeEditingData.A0D) || this.A0Q != creativeEditingData.A0Q || this.A0R != creativeEditingData.A0R || !11T.A0O(this.A03, creativeEditingData.A03) || !11T.A0O(this.A0N, creativeEditingData.A0N) || !11T.A0O(this.A0O, creativeEditingData.A0O) || !11T.A0O(this.A0E, creativeEditingData.A0E) || this.A02 != creativeEditingData.A02 || this.A01 != creativeEditingData.A01 || this.A0S != creativeEditingData.A0S || !11T.A0O(this.A0F, creativeEditingData.A0F) || !11T.A0O(this.A0G, creativeEditingData.A0G) || !11T.A0O(this.A07, creativeEditingData.A07) || !11T.A0O(this.A0H, creativeEditingData.A0H) || !11T.A0O(this.A04, creativeEditingData.A04)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.GKv
    public String getFilterName() {
        if (this.A0P.contains("filterName")) {
            return this.A0M;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = "PassThrough";
                }
            }
        }
        return A0T;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A0H, C1pq.A04(this.A07, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A02(AbM.A00((C1pq.A04(this.A0E, C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(getFilterName(), C1pq.A04(this.A0L, C1pq.A04(this.A0B, C1pq.A04(this.A0K, C1pq.A04(this.A08, C1pq.A04(this.A0J, AbM.A00(C1pq.A04(this.A0A, C1pq.A04(this.A06, C1pq.A04(this.A0I, C1pq.A04(this.A05, C1pq.A03(this.A09))))), this.A00))))))))), this.A0Q), this.A0R))))) * 31) + this.A02, this.A01), this.A0S))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A09);
        while (A0b.hasNext()) {
            parcel.writeParcelable((OverlayParamsHolder) A0b.next(), i);
        }
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A0I);
        C3o5.A0d(parcel, this.A06, i);
        ImmutableList immutableList = this.A0A;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeFloat(this.A00);
        1BL.A13(parcel, this.A0J);
        DKH.A11(parcel, this.A08, i);
        1BL.A13(parcel, this.A0K);
        1Du A0b2 = 1BL.A0b(parcel, this.A0B);
        while (A0b2.hasNext()) {
            ((DoodleParams) A0b2.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0L);
        1BL.A13(parcel, this.A0M);
        1Du A0b3 = 1BL.A0b(parcel, this.A0C);
        while (A0b3.hasNext()) {
            ((StickerParams) A0b3.next()).writeToParcel(parcel, i);
        }
        FJ8.A0B(parcel, this.A0D);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        MagicModImage magicModImage = this.A03;
        if (magicModImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            magicModImage.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0N);
        1BL.A13(parcel, this.A0O);
        ImmutableList immutableList2 = this.A0E;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0S ? 1 : 0);
        1Du A0b4 = 1BL.A0b(parcel, this.A0F);
        while (A0b4.hasNext()) {
            ((StickerParams) A0b4.next()).writeToParcel(parcel, i);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A0G);
        while (A0b5.hasNext()) {
            parcel.writeParcelable((OverlayParamsHolder) A0b5.next(), i);
        }
        C3o5.A0d(parcel, this.A07, i);
        1Du A0b6 = 1BL.A0b(parcel, this.A0H);
        while (A0b6.hasNext()) {
            ((TextParams) A0b6.next()).writeToParcel(parcel, i);
        }
        InspirationZoomCropParams inspirationZoomCropParams = this.A04;
        if (inspirationZoomCropParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationZoomCropParams.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0P);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
