package com.facebook.ipc.inspiration.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbF;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKG;
import X.MRl;
import X.N1O;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.InspirationEffectWithSource;
import com.facebook.inspiration.model.InspirationEffectsModel;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.inspiration.model.movableoverlay.InspirationDoodleParams;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationBackupEditingData.class */
public final class InspirationBackupEditingData implements Parcelable {
    public static volatile InspirationDoodleParams A09;
    public static final Parcelable.Creator CREATOR = new CSR(39);
    public final InspirationEffectWithSource A00;
    public final InspirationEffectsModel A01;
    public final InspirationVideoEditingData A02;
    public final InspirationDoodleParams A03;
    public final InspirationZoomCropParams A04;
    public final ImmutableList A05;
    public final Boolean A06;
    public final String A07;
    public final Set A08;

    /* loaded from: InspirationBackupEditingData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N1O n1o = new N1O();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2118039208:
                                if (A1C.equals("inspiration_effects_params")) {
                                    n1o.A01 = (InspirationEffectsModel) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEffectsModel.class);
                                    break;
                                }
                                break;
                            case -1123147783:
                                if (A1C.equals("applied_postcapture_inspiration_model")) {
                                    n1o.A00 = (InspirationEffectWithSource) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEffectWithSource.class);
                                    break;
                                }
                                break;
                            case -1122219305:
                                if (A1C.equals("inspiration_doodle_params")) {
                                    n1o.A00((InspirationDoodleParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationDoodleParams.class));
                                    break;
                                }
                                break;
                            case -764561750:
                                if (A1C.equals("inspiration_video_editing_data")) {
                                    n1o.A02 = (InspirationVideoEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVideoEditingData.class);
                                    break;
                                }
                                break;
                            case 100237406:
                                if (A1C.equals("inspiration_zoom_crop_params")) {
                                    n1o.A04 = (InspirationZoomCropParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationZoomCropParams.class);
                                    break;
                                }
                                break;
                            case 543453426:
                                if (A1C.equals("applied_swipeable_effect_model_id")) {
                                    n1o.A07 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1100085051:
                                if (A1C.equals("inspiration_movable_overlay_params")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class);
                                    n1o.A05 = A00;
                                    C1pq.A08("inspirationMovableOverlayParams", A00);
                                    break;
                                }
                                break;
                            case 1880711946:
                                if (A1C.equals("is_ai_enhance_applied")) {
                                    n1o.A06 = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationBackupEditingData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationBackupEditingData(n1o);
        }
    }

    /* loaded from: InspirationBackupEditingData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationBackupEditingData inspirationBackupEditingData = (InspirationBackupEditingData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationBackupEditingData.A00, "applied_postcapture_inspiration_model");
            AbstractC11224vw.A0D(r302, "applied_swipeable_effect_model_id", inspirationBackupEditingData.A07);
            AbstractC11224vw.A05(r302, c26c, inspirationBackupEditingData.A01(), "inspiration_doodle_params");
            AbstractC11224vw.A05(r302, c26c, inspirationBackupEditingData.A01, "inspiration_effects_params");
            AbstractC11224vw.A06(r302, c26c, "inspiration_movable_overlay_params", inspirationBackupEditingData.A05);
            AbstractC11224vw.A05(r302, c26c, inspirationBackupEditingData.A02, "inspiration_video_editing_data");
            AbstractC11224vw.A05(r302, c26c, inspirationBackupEditingData.A04, "inspiration_zoom_crop_params");
            AbstractC11224vw.A08(r302, inspirationBackupEditingData.A06, "is_ai_enhance_applied");
            r302.A0Y();
        }
    }

    public InspirationBackupEditingData(N1O n1o) {
        this.A00 = n1o.A00;
        this.A07 = n1o.A07;
        this.A03 = n1o.A03;
        this.A01 = n1o.A01;
        ImmutableList immutableList = n1o.A05;
        C1pq.A08("inspirationMovableOverlayParams", immutableList);
        this.A05 = immutableList;
        this.A02 = n1o.A02;
        this.A04 = n1o.A04;
        this.A06 = n1o.A06;
        this.A08 = Collections.unmodifiableSet(n1o.A08);
    }

    public InspirationBackupEditingData(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationEffectWithSource) InspirationEffectWithSource.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (InspirationDoodleParams) InspirationDoodleParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationEffectsModel) InspirationEffectsModel.CREATOR.createFromParcel(parcel);
        }
        int readInt = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr = new InspirationOverlayParamsHolder[readInt];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= readInt) {
                break;
            } else {
                i2 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr, i3);
            }
        }
        this.A05 = ImmutableList.copyOf(inspirationOverlayParamsHolderArr);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InspirationVideoEditingData) InspirationVideoEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
        }
        this.A06 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public static N1O A00(InspirationBackupEditingData inspirationBackupEditingData) {
        if (inspirationBackupEditingData == null) {
            return new N1O();
        }
        new Object();
        HashSet A0v = AnonymousClass001.A0v();
        ((N1O) A0v).A08 = A0v;
        InspirationEffectWithSource inspirationEffectWithSource = inspirationBackupEditingData.A00;
        ((N1O) inspirationEffectWithSource).A00 = inspirationEffectWithSource;
        String str = inspirationBackupEditingData.A07;
        ((N1O) str).A07 = str;
        InspirationDoodleParams inspirationDoodleParams = inspirationBackupEditingData.A03;
        ((N1O) inspirationDoodleParams).A03 = inspirationDoodleParams;
        InspirationEffectsModel inspirationEffectsModel = inspirationBackupEditingData.A01;
        ((N1O) inspirationEffectsModel).A01 = inspirationEffectsModel;
        ImmutableList immutableList = inspirationBackupEditingData.A05;
        ((N1O) immutableList).A05 = immutableList;
        InspirationVideoEditingData inspirationVideoEditingData = inspirationBackupEditingData.A02;
        ((N1O) inspirationVideoEditingData).A02 = inspirationVideoEditingData;
        InspirationZoomCropParams inspirationZoomCropParams = inspirationBackupEditingData.A04;
        ((N1O) inspirationZoomCropParams).A04 = inspirationZoomCropParams;
        Boolean bool = inspirationBackupEditingData.A06;
        ((N1O) bool).A06 = bool;
        HashSet A1E = AbF.A1E(inspirationBackupEditingData.A08);
        ((N1O) A1E).A08 = A1E;
        return A1E;
    }

    public InspirationDoodleParams A01() {
        if (this.A08.contains("inspirationDoodleParams")) {
            return this.A03;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = new InspirationDoodleParams(null, null, null, "", AnonymousClass001.A0v());
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
            if (!(obj instanceof InspirationBackupEditingData)) {
                return false;
            }
            InspirationBackupEditingData inspirationBackupEditingData = (InspirationBackupEditingData) obj;
            if (!11T.A0O(this.A00, inspirationBackupEditingData.A00) || !11T.A0O(this.A07, inspirationBackupEditingData.A07) || !11T.A0O(A01(), inspirationBackupEditingData.A01()) || !11T.A0O(this.A01, inspirationBackupEditingData.A01) || !11T.A0O(this.A05, inspirationBackupEditingData.A05) || !11T.A0O(this.A02, inspirationBackupEditingData.A02) || !11T.A0O(this.A04, inspirationBackupEditingData.A04) || !11T.A0O(this.A06, inspirationBackupEditingData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(A01(), C1pq.A04(this.A07, C1pq.A03(this.A00))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationEffectWithSource inspirationEffectWithSource = this.A00;
        if (inspirationEffectWithSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectWithSource.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A07);
        InspirationDoodleParams inspirationDoodleParams = this.A03;
        if (inspirationDoodleParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationDoodleParams.writeToParcel(parcel, i);
        }
        InspirationEffectsModel inspirationEffectsModel = this.A01;
        if (inspirationEffectsModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectsModel.writeToParcel(parcel, i);
        }
        1Du A0b = 1BL.A0b(parcel, this.A05);
        while (A0b.hasNext()) {
            MRl.A0Q(parcel, A0b, i);
        }
        InspirationVideoEditingData inspirationVideoEditingData = this.A02;
        if (inspirationVideoEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationVideoEditingData.writeToParcel(parcel, i);
        }
        MRl.A0O(parcel, this.A04, i);
        AbN.A0s(parcel, this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
