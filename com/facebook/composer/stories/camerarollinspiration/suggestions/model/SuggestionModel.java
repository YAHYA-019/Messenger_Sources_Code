package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.7zO;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbM;
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
import X.DKG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.camerarollprocessor.model.Location;
import com.facebook.camerarollprocessor.model.XRayConcept;
import com.facebook.composer.stories.camerarollinspiration.mediaprovider.model.CollageContext;
import com.facebook.inspiration.emp.model.EMPModel;
import com.facebook.ipc.media.data.MediaData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: SuggestionModel.class */
public final class SuggestionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(19);
    public final float A00;
    public final XRayConcept A01;
    public final CollageContext A02;
    public final StoryViewerCardEntryPointData A03;
    public final SuggestionsTitleModel A04;
    public final EMPModel A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final Boolean A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final Location A0G;

    /* loaded from: SuggestionModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            CollageContext collageContext = null;
            XRayConcept xRayConcept = null;
            Long l = null;
            EMPModel eMPModel = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            ImmutableList immutableList = null;
            String str4 = null;
            float f = 0.0f;
            StoryViewerCardEntryPointData storyViewerCardEntryPointData = null;
            SuggestionsTitleModel suggestionsTitleModel = null;
            ImmutableList of = ImmutableList.of();
            String str5 = "";
            ImmutableList of2 = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2051544061:
                                if (A1C.equals("collage_context")) {
                                    collageContext = (CollageContext) AbstractC11224vw.A02(abstractC01033pi, c27t, CollageContext.class);
                                    break;
                                }
                                break;
                            case -2031472398:
                                if (A1C.equals("emp_model")) {
                                    eMPModel = (EMPModel) AbstractC11224vw.A02(abstractC01033pi, c27t, EMPModel.class);
                                    break;
                                }
                                break;
                            case -1871587889:
                                if (A1C.equals("score_description")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1618432855:
                                if (A1C.equals("identifier")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -806847381:
                                if (A1C.equals("assets_metadata")) {
                                    of2 = AbstractC11224vw.A00(abstractC01033pi, c27t, SuggestionMediaModel.class);
                                    C1pq.A08("suggestionMedia", of2);
                                    break;
                                }
                                break;
                            case -632326958:
                                if (A1C.equals("story_viewer_card_entry_point_data")) {
                                    storyViewerCardEntryPointData = (StoryViewerCardEntryPointData) AbstractC11224vw.A02(abstractC01033pi, c27t, StoryViewerCardEntryPointData.class);
                                    break;
                                }
                                break;
                            case -168253769:
                                if (A1C.equals("background_image_uri")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 78813367:
                                if (A1C.equals("fallback_preview_image_url")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 109264530:
                                if (A1C.equals("score")) {
                                    f = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1C.equals("title")) {
                                    suggestionsTitleModel = (SuggestionsTitleModel) AbstractC11224vw.A02(abstractC01033pi, c27t, SuggestionsTitleModel.class);
                                    break;
                                }
                                break;
                            case 951024232:
                                if (A1C.equals("concept")) {
                                    xRayConcept = (XRayConcept) AbstractC11224vw.A02(abstractC01033pi, c27t, XRayConcept.class);
                                    break;
                                }
                                break;
                            case 1014577290:
                                if (A1C.equals("product_type")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("productType", str5);
                                    break;
                                }
                                break;
                            case 1613830380:
                                if (A1C.equals("is_fallback_suggestion")) {
                                    bool = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case 2003148228:
                                if (A1C.equals("created_time")) {
                                    l = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                            case 2140775389:
                                if (A1C.equals("media_ids")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, SuggestionModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new SuggestionModel(xRayConcept, collageContext, storyViewerCardEntryPointData, suggestionsTitleModel, eMPModel, immutableList, of, of2, bool, l, str, str2, str3, str4, str5, f);
        }
    }

    /* loaded from: SuggestionModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            SuggestionModel suggestionModel = (SuggestionModel) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "background_image_uri", suggestionModel.A0B);
            AbstractC11224vw.A05(r302, c26c, suggestionModel.A02, "collage_context");
            AbstractC11224vw.A05(r302, c26c, suggestionModel.A01, "concept");
            AbstractC11224vw.A0C(r302, suggestionModel.A0A, "created_time");
            AbstractC11224vw.A05(r302, c26c, suggestionModel.A05, "emp_model");
            AbstractC11224vw.A0D(r302, "fallback_preview_image_url", suggestionModel.A0C);
            AbstractC11224vw.A0D(r302, "identifier", suggestionModel.A0D);
            AbstractC11224vw.A08(r302, suggestionModel.A09, "is_fallback_suggestion");
            AbstractC11224vw.A06(r302, c26c, "media_ids", suggestionModel.A06);
            AbstractC11224vw.A0D(r302, "score_description", suggestionModel.A0E);
            AbstractC11224vw.A0D(r302, "product_type", suggestionModel.A0F);
            float f = suggestionModel.A00;
            r302.A0o("score");
            r302.A0e(f);
            AbstractC11224vw.A05(r302, c26c, suggestionModel.A03, "story_viewer_card_entry_point_data");
            AbstractC11224vw.A06(r302, c26c, "assets_metadata", suggestionModel.A08);
            AbstractC11224vw.A05(r302, c26c, suggestionModel.A04, "title");
            r302.A0Y();
        }
    }

    public SuggestionModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SuggestionsTitleModel suggestionsTitleModel = null;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (CollageContext) CollageContext.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (XRayConcept) XRayConcept.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (EMPModel) EMPModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = Boolean.valueOf(AbN.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (Location) Location.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            int readInt = parcel.readInt();
            Long[] lArr = new Long[readInt];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                }
                lArr[i3] = 7zO.A0j(parcel);
                i2 = i3 + 1;
            }
            this.A06 = ImmutableList.copyOf(lArr);
        }
        int readInt2 = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt2];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= readInt2) {
                break;
            } else {
                i4 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i5);
            }
        }
        this.A07 = ImmutableList.copyOf(mediaDataArr);
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A0F = parcel.readString();
        this.A00 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (StoryViewerCardEntryPointData) parcel.readParcelable(A0e);
        }
        int readInt3 = parcel.readInt();
        SuggestionMediaModel[] suggestionMediaModelArr = new SuggestionMediaModel[readInt3];
        while (i < readInt3) {
            i = AbI.A01(parcel, A0e, suggestionMediaModelArr, i);
        }
        this.A08 = ImmutableList.copyOf(suggestionMediaModelArr);
        this.A04 = parcel.readInt() != 0 ? (SuggestionsTitleModel) parcel.readParcelable(A0e) : suggestionsTitleModel;
    }

    public SuggestionModel(XRayConcept xRayConcept, CollageContext collageContext, StoryViewerCardEntryPointData storyViewerCardEntryPointData, SuggestionsTitleModel suggestionsTitleModel, EMPModel eMPModel, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, float f) {
        this.A0B = str;
        this.A02 = collageContext;
        this.A01 = xRayConcept;
        this.A0A = l;
        this.A05 = eMPModel;
        this.A0C = str2;
        this.A0D = str3;
        this.A09 = bool;
        this.A0G = null;
        this.A06 = immutableList;
        C1pq.A08("medias", immutableList2);
        this.A07 = immutableList2;
        this.A0E = str4;
        C1pq.A08("productType", str5);
        this.A0F = str5;
        this.A00 = f;
        this.A03 = storyViewerCardEntryPointData;
        C1pq.A08("suggestionMedia", immutableList3);
        this.A08 = immutableList3;
        this.A04 = suggestionsTitleModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuggestionModel)) {
                return false;
            }
            SuggestionModel suggestionModel = (SuggestionModel) obj;
            if (!11T.A0O(this.A0B, suggestionModel.A0B) || !11T.A0O(this.A02, suggestionModel.A02) || !11T.A0O(this.A01, suggestionModel.A01) || !11T.A0O(this.A0A, suggestionModel.A0A) || !11T.A0O(this.A05, suggestionModel.A05) || !11T.A0O(this.A0C, suggestionModel.A0C) || !11T.A0O(this.A0D, suggestionModel.A0D) || !11T.A0O(this.A09, suggestionModel.A09) || !11T.A0O(this.A0G, suggestionModel.A0G) || !11T.A0O(this.A06, suggestionModel.A06) || !11T.A0O(this.A07, suggestionModel.A07) || !11T.A0O(this.A0E, suggestionModel.A0E) || !11T.A0O(this.A0F, suggestionModel.A0F) || this.A00 != suggestionModel.A00 || !11T.A0O(this.A03, suggestionModel.A03) || !11T.A0O(this.A08, suggestionModel.A08) || !11T.A0O(this.A04, suggestionModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A08, C1pq.A04(this.A03, AbM.A00(C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A0G, C1pq.A04(this.A09, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A05, C1pq.A04(this.A0A, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A0B))))))))))))), this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0B);
        CollageContext collageContext = this.A02;
        if (collageContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collageContext.writeToParcel(parcel, i);
        }
        XRayConcept xRayConcept = this.A01;
        if (xRayConcept == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xRayConcept.writeToParcel(parcel, i);
        }
        C3o5.A0g(parcel, this.A0A);
        EMPModel eMPModel = this.A05;
        if (eMPModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eMPModel.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        AbN.A0s(parcel, this.A09);
        Location location = this.A0G;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A06;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeLong(AnonymousClass001.A05(A0Y.next()));
            }
        }
        1Du A0b = 1BL.A0b(parcel, this.A07);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        1BL.A13(parcel, this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeFloat(this.A00);
        C3o5.A0d(parcel, this.A03, i);
        1Du A0b2 = 1BL.A0b(parcel, this.A08);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((SuggestionMediaModel) A0b2.next(), i);
        }
        C3o5.A0d(parcel, this.A04, i);
    }
}
