package com.facebook.inspiration.contextualmetadata.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKE;
import X.DKG;
import X.DKH;
import X.EpT;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationContextualFeatureData.class */
public final class InspirationContextualFeatureData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(26);
    public final InspirationZoomCropParams A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Double A04;
    public final String A05;

    /* loaded from: InspirationContextualFeatureData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.EpT] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ?? obj = new Object();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1874255346:
                                if (A1C.equals("embedding_feature")) {
                                    ((EpT) obj).A01 = AbstractC11224vw.A00(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case -1128704554:
                                if (A1C.equals("dense_feature")) {
                                    ((EpT) obj).A04 = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case -97328952:
                                if (A1C.equals("string_feature")) {
                                    ((EpT) obj).A05 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 657593593:
                                if (A1C.equals("id_list_feature")) {
                                    ((EpT) obj).A02 = AbstractC11224vw.A00(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 1618644733:
                                if (A1C.equals("smart_crop_feature")) {
                                    ((EpT) obj).A00 = (InspirationZoomCropParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationZoomCropParams.class);
                                    break;
                                }
                                break;
                            case 2003694214:
                                if (A1C.equals("id_score_list_feature")) {
                                    ((EpT) obj).A03 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationIdScoreFeatureValue.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationContextualFeatureData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationContextualFeatureData((EpT) obj);
        }
    }

    /* loaded from: InspirationContextualFeatureData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationContextualFeatureData inspirationContextualFeatureData = (InspirationContextualFeatureData) obj;
            r302.A0b();
            AbstractC11224vw.A09(r302, inspirationContextualFeatureData.A04, "dense_feature");
            AbstractC11224vw.A06(r302, c26c, "embedding_feature", inspirationContextualFeatureData.A01);
            AbstractC11224vw.A06(r302, c26c, "id_list_feature", inspirationContextualFeatureData.A02);
            AbstractC11224vw.A06(r302, c26c, "id_score_list_feature", inspirationContextualFeatureData.A03);
            AbstractC11224vw.A05(r302, c26c, inspirationContextualFeatureData.A00, "smart_crop_feature");
            AbstractC11224vw.A0D(r302, "string_feature", inspirationContextualFeatureData.A05);
            r302.A0Y();
        }
    }

    public InspirationContextualFeatureData() {
        this.A04 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public InspirationContextualFeatureData(EpT epT) {
        this.A04 = epT.A04;
        this.A01 = epT.A01;
        this.A02 = epT.A02;
        this.A03 = epT.A03;
        this.A00 = epT.A00;
        this.A05 = epT.A05;
    }

    public InspirationContextualFeatureData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationZoomCropParams inspirationZoomCropParams = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0x(parcel);
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            Double[] dArr = new Double[readInt];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                }
                dArr[i3] = DKG.A0x(parcel);
                i2 = i3 + 1;
            }
            this.A01 = ImmutableList.copyOf(dArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            Integer[] numArr = new Integer[readInt2];
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= readInt2) {
                    break;
                }
                numArr[i5] = AbI.A0z(parcel);
                i4 = i5 + 1;
            }
            this.A02 = ImmutableList.copyOf(numArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt3 = parcel.readInt();
            InspirationIdScoreFeatureValue[] inspirationIdScoreFeatureValueArr = new InspirationIdScoreFeatureValue[readInt3];
            while (i < readInt3) {
                i = AbI.A01(parcel, A0e, inspirationIdScoreFeatureValueArr, i);
            }
            this.A03 = ImmutableList.copyOf(inspirationIdScoreFeatureValueArr);
        }
        this.A00 = parcel.readInt() != 0 ? (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel) : inspirationZoomCropParams;
        this.A05 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationContextualFeatureData)) {
                return false;
            }
            InspirationContextualFeatureData inspirationContextualFeatureData = (InspirationContextualFeatureData) obj;
            if (!11T.A0O(this.A04, inspirationContextualFeatureData.A04) || !11T.A0O(this.A01, inspirationContextualFeatureData.A01) || !11T.A0O(this.A02, inspirationContextualFeatureData.A02) || !11T.A0O(this.A03, inspirationContextualFeatureData.A03) || !11T.A0O(this.A00, inspirationContextualFeatureData.A00) || !11T.A0O(this.A05, inspirationContextualFeatureData.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A04))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A13(parcel, this.A04);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                DKH.A14(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeInt(DKE.A0F(A0Y2));
            }
        }
        ImmutableList immutableList3 = this.A03;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                parcel.writeParcelable((InspirationIdScoreFeatureValue) A0Y3.next(), i);
            }
        }
        InspirationZoomCropParams inspirationZoomCropParams = this.A00;
        if (inspirationZoomCropParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationZoomCropParams.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A05);
    }
}
