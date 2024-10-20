package com.facebook.camerarollprocessor.model;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MediaFeatureData.class */
public final class MediaFeatureData implements Parcelable {
    public static volatile ImmutableList A0I;
    public static volatile ImmutableList A0J;
    public static final Parcelable.Creator CREATOR = DKf.A00(92);
    public final int A00;
    public final FaceSignals A01;
    public final Location A02;
    public final InspirationZoomCropParams A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final Double A0D;
    public final Double A0E;
    public final Double A0F;
    public final Double A0G;
    public final Set A0H;

    /* loaded from: MediaFeatureData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList immutableList = null;
            FaceSignals faceSignals = null;
            ImmutableList immutableList2 = null;
            Location location = null;
            Double d = null;
            ImmutableList immutableList3 = null;
            Double d2 = null;
            ImmutableList immutableList4 = null;
            ImmutableList immutableList5 = null;
            ImmutableList immutableList6 = null;
            Double d3 = null;
            Double d4 = null;
            ImmutableList immutableList7 = null;
            InspirationZoomCropParams inspirationZoomCropParams = null;
            ImmutableList immutableList8 = null;
            int i = 0;
            ImmutableList immutableList9 = null;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1816868889:
                                if (A1C.equals("x_ray_concepts")) {
                                    immutableList9 = AbstractC11224vw.A00(abstractC01033pi, c27t, XRayConcept.class);
                                    C1pq.A08("xRayConcepts", immutableList9);
                                    if (!A0v.contains("xRayConcepts")) {
                                        A0v = AbF.A1E(A0v);
                                        A0v.add("xRayConcepts");
                                        break;
                                    }
                                }
                                break;
                            case -1641839324:
                                if (A1C.equals("scene_x_keywords")) {
                                    immutableList6 = AbstractC11224vw.A00(abstractC01033pi, c27t, ContextualFeatureConcept.class);
                                    break;
                                }
                                break;
                            case -1408481449:
                                if (A1C.equals("embedding")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case -826410124:
                                if (A1C.equals("scene_x_fb_concepts")) {
                                    immutableList5 = AbstractC11224vw.A00(abstractC01033pi, c27t, ContextualFeatureConcept.class);
                                    break;
                                }
                                break;
                            case -764199873:
                                if (A1C.equals("occlusion_value")) {
                                    d = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case -692499435:
                                if (A1C.equals("scene_x_violence")) {
                                    d4 = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 97187254:
                                if (A1C.equals("faces")) {
                                    immutableList2 = AbstractC11224vw.A00(abstractC01033pi, c27t, Face.class);
                                    C1pq.A08("faces", immutableList2);
                                    if (!A0v.contains("faces")) {
                                        A0v = AbF.A1E(A0v);
                                        A0v.add("faces");
                                        break;
                                    }
                                }
                                break;
                            case 414484946:
                                if (A1C.equals("scene_x_aesthetic")) {
                                    d2 = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 844684299:
                                if (A1C.equals("scene_x_nudity")) {
                                    d3 = (Double) AbstractC11224vw.A02(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 1309367998:
                                if (A1C.equals("scene_x_xray_concepts")) {
                                    immutableList7 = AbstractC11224vw.A00(abstractC01033pi, c27t, ContextualFeatureConcept.class);
                                    break;
                                }
                                break;
                            case 1524021528:
                                if (A1C.equals("visual_embedding")) {
                                    immutableList8 = AbstractC11224vw.A00(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 1791890166:
                                if (A1C.equals("scene_x_embeddings")) {
                                    immutableList4 = AbstractC11224vw.A00(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 1808305050:
                                if (A1C.equals("word_count")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1901043637:
                                if (A1C.equals("location")) {
                                    location = (Location) AbstractC11224vw.A02(abstractC01033pi, c27t, Location.class);
                                    break;
                                }
                                break;
                            case 1940272554:
                                if (A1C.equals("saliency")) {
                                    immutableList3 = AbstractC11224vw.A00(abstractC01033pi, c27t, Double.class);
                                    break;
                                }
                                break;
                            case 1991768888:
                                if (A1C.equals("smart_crop_value")) {
                                    inspirationZoomCropParams = (InspirationZoomCropParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationZoomCropParams.class);
                                    break;
                                }
                                break;
                            case 2078160617:
                                if (A1C.equals("face_signals")) {
                                    faceSignals = (FaceSignals) AbstractC11224vw.A02(abstractC01033pi, c27t, FaceSignals.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MediaFeatureData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MediaFeatureData(faceSignals, location, inspirationZoomCropParams, immutableList, immutableList2, immutableList3, immutableList4, immutableList5, immutableList6, immutableList7, immutableList8, immutableList9, d, d2, d3, d4, A0v, i);
        }
    }

    /* loaded from: MediaFeatureData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MediaFeatureData mediaFeatureData = (MediaFeatureData) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "embedding", mediaFeatureData.A04);
            AbstractC11224vw.A05(r302, c26c, mediaFeatureData.A01, "face_signals");
            AbstractC11224vw.A06(r302, c26c, "faces", mediaFeatureData.A00());
            AbstractC11224vw.A05(r302, c26c, mediaFeatureData.A02, "location");
            AbstractC11224vw.A09(r302, mediaFeatureData.A0D, "occlusion_value");
            AbstractC11224vw.A06(r302, c26c, "saliency", mediaFeatureData.A06);
            AbstractC11224vw.A09(r302, mediaFeatureData.A0E, "scene_x_aesthetic");
            AbstractC11224vw.A06(r302, c26c, "scene_x_embeddings", mediaFeatureData.A07);
            AbstractC11224vw.A06(r302, c26c, "scene_x_fb_concepts", mediaFeatureData.A08);
            AbstractC11224vw.A06(r302, c26c, "scene_x_keywords", mediaFeatureData.A09);
            AbstractC11224vw.A09(r302, mediaFeatureData.A0F, "scene_x_nudity");
            AbstractC11224vw.A09(r302, mediaFeatureData.A0G, "scene_x_violence");
            AbstractC11224vw.A06(r302, c26c, "scene_x_xray_concepts", mediaFeatureData.A0A);
            AbstractC11224vw.A05(r302, c26c, mediaFeatureData.A03, "smart_crop_value");
            AbstractC11224vw.A06(r302, c26c, "visual_embedding", mediaFeatureData.A0B);
            int i = mediaFeatureData.A00;
            r302.A0o("word_count");
            r302.A0f(i);
            AbstractC11224vw.A06(r302, c26c, "x_ray_concepts", mediaFeatureData.A01());
            r302.A0Y();
        }
    }

    public MediaFeatureData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            int readInt = parcel.readInt();
            Double[] dArr = new Double[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                dArr[i2] = DKG.A0x(parcel);
            }
            this.A04 = ImmutableList.copyOf(dArr);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (FaceSignals) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt2 = parcel.readInt();
            Face[] faceArr = new Face[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbI.A01(parcel, A0e, faceArr, i3);
            }
            this.A05 = ImmutableList.copyOf(faceArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Location) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            int readInt3 = parcel.readInt();
            Double[] dArr2 = new Double[readInt3];
            for (int i4 = 0; i4 < readInt3; i4++) {
                dArr2[i4] = DKG.A0x(parcel);
            }
            this.A06 = ImmutableList.copyOf(dArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            int readInt4 = parcel.readInt();
            Double[] dArr3 = new Double[readInt4];
            for (int i5 = 0; i5 < readInt4; i5++) {
                dArr3[i5] = DKG.A0x(parcel);
            }
            this.A07 = ImmutableList.copyOf(dArr3);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt5 = parcel.readInt();
            ContextualFeatureConcept[] contextualFeatureConceptArr = new ContextualFeatureConcept[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbI.A01(parcel, A0e, contextualFeatureConceptArr, i6);
            }
            this.A08 = ImmutableList.copyOf(contextualFeatureConceptArr);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt6 = parcel.readInt();
            ContextualFeatureConcept[] contextualFeatureConceptArr2 = new ContextualFeatureConcept[readInt6];
            int i7 = 0;
            while (i7 < readInt6) {
                i7 = AbI.A01(parcel, A0e, contextualFeatureConceptArr2, i7);
            }
            this.A09 = ImmutableList.copyOf(contextualFeatureConceptArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt7 = parcel.readInt();
            ContextualFeatureConcept[] contextualFeatureConceptArr3 = new ContextualFeatureConcept[readInt7];
            int i8 = 0;
            while (i8 < readInt7) {
                i8 = AbI.A01(parcel, A0e, contextualFeatureConceptArr3, i8);
            }
            this.A0A = ImmutableList.copyOf(contextualFeatureConceptArr3);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            int readInt8 = parcel.readInt();
            Double[] dArr4 = new Double[readInt8];
            for (int i9 = 0; i9 < readInt8; i9++) {
                dArr4[i9] = DKG.A0x(parcel);
            }
            this.A0B = ImmutableList.copyOf(dArr4);
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() != 0) {
            int readInt9 = parcel.readInt();
            XRayConcept[] xRayConceptArr = new XRayConcept[readInt9];
            int i10 = 0;
            while (i10 < readInt9) {
                i10 = AbI.A01(parcel, A0e, xRayConceptArr, i10);
            }
            immutableList = ImmutableList.copyOf(xRayConceptArr);
        }
        this.A0C = immutableList;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt10 = parcel.readInt();
        while (i < readInt10) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0H = Collections.unmodifiableSet(A0v);
    }

    public MediaFeatureData(FaceSignals faceSignals, Location location, InspirationZoomCropParams inspirationZoomCropParams, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, ImmutableList immutableList8, ImmutableList immutableList9, Double d, Double d2, Double d3, Double d4, Set set, int i) {
        this.A04 = immutableList;
        this.A01 = faceSignals;
        this.A05 = immutableList2;
        this.A02 = location;
        this.A0D = d;
        this.A06 = immutableList3;
        this.A0E = d2;
        this.A07 = immutableList4;
        this.A08 = immutableList5;
        this.A09 = immutableList6;
        this.A0F = d3;
        this.A0G = d4;
        this.A0A = immutableList7;
        this.A03 = inspirationZoomCropParams;
        this.A0B = immutableList8;
        this.A00 = i;
        this.A0C = immutableList9;
        this.A0H = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A0H.contains("faces")) {
            return this.A05;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    A0I = 1BK.A0b();
                }
            }
        }
        return A0I;
    }

    public ImmutableList A01() {
        if (this.A0H.contains("xRayConcepts")) {
            return this.A0C;
        }
        if (A0J == null) {
            synchronized (this) {
                if (A0J == null) {
                    A0J = 1BK.A0b();
                }
            }
        }
        return A0J;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaFeatureData)) {
                return false;
            }
            MediaFeatureData mediaFeatureData = (MediaFeatureData) obj;
            if (!11T.A0O(this.A04, mediaFeatureData.A04) || !11T.A0O(this.A01, mediaFeatureData.A01) || !11T.A0O(A00(), mediaFeatureData.A00()) || !11T.A0O(this.A02, mediaFeatureData.A02) || !11T.A0O(this.A0D, mediaFeatureData.A0D) || !11T.A0O(this.A06, mediaFeatureData.A06) || !11T.A0O(this.A0E, mediaFeatureData.A0E) || !11T.A0O(this.A07, mediaFeatureData.A07) || !11T.A0O(this.A08, mediaFeatureData.A08) || !11T.A0O(this.A09, mediaFeatureData.A09) || !11T.A0O(this.A0F, mediaFeatureData.A0F) || !11T.A0O(this.A0G, mediaFeatureData.A0G) || !11T.A0O(this.A0A, mediaFeatureData.A0A) || !11T.A0O(this.A03, mediaFeatureData.A03) || !11T.A0O(this.A0B, mediaFeatureData.A0B) || this.A00 != mediaFeatureData.A00 || !11T.A0O(A01(), mediaFeatureData.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), (C1pq.A04(this.A0B, C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A0E, C1pq.A04(this.A06, C1pq.A04(this.A0D, C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(this.A04))))))))))))))) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                DKH.A14(parcel, A0Y);
            }
        }
        C3o5.A0d(parcel, this.A01, i);
        ImmutableList immutableList2 = this.A05;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((Face) A0Y2.next(), i);
            }
        }
        C3o5.A0d(parcel, this.A02, i);
        DKH.A13(parcel, this.A0D);
        ImmutableList immutableList3 = this.A06;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                DKH.A14(parcel, A0Y3);
            }
        }
        DKH.A13(parcel, this.A0E);
        ImmutableList immutableList4 = this.A07;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                DKH.A14(parcel, A0Y4);
            }
        }
        ImmutableList immutableList5 = this.A08;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y5 = AbL.A0Y(parcel, immutableList5);
            while (A0Y5.hasNext()) {
                parcel.writeParcelable((ContextualFeatureConcept) A0Y5.next(), i);
            }
        }
        ImmutableList immutableList6 = this.A09;
        if (immutableList6 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y6 = AbL.A0Y(parcel, immutableList6);
            while (A0Y6.hasNext()) {
                parcel.writeParcelable((ContextualFeatureConcept) A0Y6.next(), i);
            }
        }
        DKH.A13(parcel, this.A0F);
        DKH.A13(parcel, this.A0G);
        ImmutableList immutableList7 = this.A0A;
        if (immutableList7 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y7 = AbL.A0Y(parcel, immutableList7);
            while (A0Y7.hasNext()) {
                parcel.writeParcelable((ContextualFeatureConcept) A0Y7.next(), i);
            }
        }
        InspirationZoomCropParams inspirationZoomCropParams = this.A03;
        if (inspirationZoomCropParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationZoomCropParams.writeToParcel(parcel, i);
        }
        ImmutableList immutableList8 = this.A0B;
        if (immutableList8 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y8 = AbL.A0Y(parcel, immutableList8);
            while (A0Y8.hasNext()) {
                DKH.A14(parcel, A0Y8);
            }
        }
        parcel.writeInt(this.A00);
        ImmutableList immutableList9 = this.A0C;
        if (immutableList9 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y9 = AbL.A0Y(parcel, immutableList9);
            while (A0Y9.hasNext()) {
                parcel.writeParcelable((XRayConcept) A0Y9.next(), i);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0H);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
