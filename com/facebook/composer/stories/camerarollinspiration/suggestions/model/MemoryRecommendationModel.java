package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.7zO;
import X.AbE;
import X.AbG;
import X.AbI;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.emp.model.EMPModel;
import com.facebook.ipc.media.data.MediaData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: MemoryRecommendationModel.class */
public final class MemoryRecommendationModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(12);
    public final StoryViewerCardEntryPointData A00;
    public final EMPModel A01;
    public final ImmutableList A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    /* loaded from: MemoryRecommendationModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Integer num = null;
            String str = null;
            Long l = null;
            EMPModel eMPModel = null;
            boolean z = false;
            StoryViewerCardEntryPointData storyViewerCardEntryPointData = null;
            String str2 = null;
            String str3 = "";
            ImmutableList of = ImmutableList.of();
            String str4 = str3;
            String str5 = str3;
            String str6 = str3;
            String str7 = str3;
            String str8 = str3;
            String str9 = str3;
            String str10 = str3;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2031472398:
                                if (A1C.equals("emp_model")) {
                                    eMPModel = (EMPModel) AbstractC11224vw.A02(abstractC01033pi, c27t, EMPModel.class);
                                    break;
                                }
                                break;
                            case -1773366604:
                                if (A1C.equals("title_text")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1078031089:
                                if (A1C.equals("medias")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, MediaData.class);
                                    C1pq.A08("medias", of);
                                    break;
                                }
                                break;
                            case -632326958:
                                if (A1C.equals("story_viewer_card_entry_point_data")) {
                                    storyViewerCardEntryPointData = (StoryViewerCardEntryPointData) AbstractC11224vw.A02(abstractC01033pi, c27t, StoryViewerCardEntryPointData.class);
                                    break;
                                }
                                break;
                            case -270906245:
                                if (A1C.equals(AbE.A00(90))) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("shareSource", str7);
                                    break;
                                }
                                break;
                            case -168253769:
                                if (A1C.equals("background_image_uri")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 344825466:
                                if (A1C.equals("serialized_story")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("serializedStory", str6);
                                    break;
                                }
                                break;
                            case 474540897:
                                if (A1C.equals("recommendation_id")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("recommendationId", str5);
                                    break;
                                }
                                break;
                            case 531712199:
                                if (A1C.equals("shared_text")) {
                                    str8 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("sharedText", str8);
                                    break;
                                }
                                break;
                            case 1014577290:
                                if (A1C.equals("product_type")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("productType", str4);
                                    break;
                                }
                                break;
                            case 1342366594:
                                if (A1C.equals("archive_story_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("archiveStoryId", str3);
                                    break;
                                }
                                break;
                            case 1494523972:
                                if (A1C.equals("story_type")) {
                                    str10 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("storyType", str10);
                                    break;
                                }
                                break;
                            case 1513980642:
                                if (A1C.equals("archive_date_timestamp")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 1717754021:
                                if (A1C.equals("story_id")) {
                                    str9 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("storyId", str9);
                                    break;
                                }
                                break;
                            case 1937593174:
                                if (A1C.equals("should_use_client_blur_background")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2003148228:
                                if (A1C.equals("created_time")) {
                                    l = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MemoryRecommendationModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MemoryRecommendationModel(storyViewerCardEntryPointData, eMPModel, of, num, l, str3, str, str4, str5, str6, str7, str8, str9, str10, str2, z);
        }
    }

    /* loaded from: MemoryRecommendationModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MemoryRecommendationModel memoryRecommendationModel = (MemoryRecommendationModel) obj;
            r302.A0b();
            AbstractC11224vw.A0B(r302, memoryRecommendationModel.A03, "archive_date_timestamp");
            AbstractC11224vw.A0D(r302, "archive_story_id", memoryRecommendationModel.A05);
            AbstractC11224vw.A0D(r302, "background_image_uri", memoryRecommendationModel.A06);
            AbstractC11224vw.A0C(r302, memoryRecommendationModel.A04, "created_time");
            AbstractC11224vw.A05(r302, c26c, memoryRecommendationModel.A01, "emp_model");
            AbstractC11224vw.A06(r302, c26c, "medias", memoryRecommendationModel.A02);
            AbstractC11224vw.A0D(r302, "product_type", memoryRecommendationModel.A07);
            AbstractC11224vw.A0D(r302, "recommendation_id", memoryRecommendationModel.A08);
            AbstractC11224vw.A0D(r302, "serialized_story", memoryRecommendationModel.A09);
            AbstractC11224vw.A0D(r302, AbE.A00(90), memoryRecommendationModel.A0A);
            AbstractC11224vw.A0D(r302, "shared_text", memoryRecommendationModel.A0B);
            boolean z = memoryRecommendationModel.A0F;
            r302.A0o("should_use_client_blur_background");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "story_id", memoryRecommendationModel.A0C);
            AbstractC11224vw.A0D(r302, "story_type", memoryRecommendationModel.A0D);
            AbstractC11224vw.A05(r302, c26c, memoryRecommendationModel.A00, "story_viewer_card_entry_point_data");
            AbstractC11224vw.A0D(r302, "title_text", memoryRecommendationModel.A0E);
            r302.A0Y();
        }
    }

    public MemoryRecommendationModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        StoryViewerCardEntryPointData storyViewerCardEntryPointData = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        this.A05 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (EMPModel) EMPModel.CREATOR.createFromParcel(parcel);
        }
        int readInt = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            } else {
                i = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
            }
        }
        this.A02 = ImmutableList.copyOf(mediaDataArr);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0F = DKH.A1W(parcel);
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? (StoryViewerCardEntryPointData) parcel.readParcelable(A0e) : storyViewerCardEntryPointData;
        this.A0E = C3o5.A0O(parcel);
    }

    public MemoryRecommendationModel(StoryViewerCardEntryPointData storyViewerCardEntryPointData, EMPModel eMPModel, ImmutableList immutableList, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.A03 = num;
        C1pq.A08("archiveStoryId", str);
        this.A05 = str;
        this.A06 = str2;
        this.A04 = l;
        this.A01 = eMPModel;
        C1pq.A08("medias", immutableList);
        this.A02 = immutableList;
        C1pq.A08("productType", str3);
        this.A07 = str3;
        C1pq.A08("recommendationId", str4);
        this.A08 = str4;
        C1pq.A08("serializedStory", str5);
        this.A09 = str5;
        C1pq.A08("shareSource", str6);
        this.A0A = str6;
        C1pq.A08("sharedText", str7);
        this.A0B = str7;
        this.A0F = z;
        C1pq.A08("storyId", str8);
        this.A0C = str8;
        C1pq.A08("storyType", str9);
        this.A0D = str9;
        this.A00 = storyViewerCardEntryPointData;
        this.A0E = str10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MemoryRecommendationModel)) {
                return false;
            }
            MemoryRecommendationModel memoryRecommendationModel = (MemoryRecommendationModel) obj;
            if (!11T.A0O(this.A03, memoryRecommendationModel.A03) || !11T.A0O(this.A05, memoryRecommendationModel.A05) || !11T.A0O(this.A06, memoryRecommendationModel.A06) || !11T.A0O(this.A04, memoryRecommendationModel.A04) || !11T.A0O(this.A01, memoryRecommendationModel.A01) || !11T.A0O(this.A02, memoryRecommendationModel.A02) || !11T.A0O(this.A07, memoryRecommendationModel.A07) || !11T.A0O(this.A08, memoryRecommendationModel.A08) || !11T.A0O(this.A09, memoryRecommendationModel.A09) || !11T.A0O(this.A0A, memoryRecommendationModel.A0A) || !11T.A0O(this.A0B, memoryRecommendationModel.A0B) || this.A0F != memoryRecommendationModel.A0F || !11T.A0O(this.A0C, memoryRecommendationModel.A0C) || !11T.A0O(this.A0D, memoryRecommendationModel.A0D) || !11T.A0O(this.A00, memoryRecommendationModel.A00) || !11T.A0O(this.A0E, memoryRecommendationModel.A0E)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0E, C1pq.A04(this.A00, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A02(C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A03))))))))))), this.A0F)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A03);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0g(parcel, this.A04);
        EMPModel eMPModel = this.A01;
        if (eMPModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eMPModel.writeToParcel(parcel, i);
        }
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A0E);
    }
}
