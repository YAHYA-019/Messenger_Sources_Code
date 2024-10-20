package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

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
import X.DKF;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBRMSCTAAction;
import com.facebook.graphql.enums.GraphQLXFBRMSCTALayout;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: StoryViewerCardEntryPointData.class */
public final class StoryViewerCardEntryPointData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(17);
    public final PrivacyTextWithEntitiesData A00;
    public final GraphQLXFBRMSCTAAction A01;
    public final GraphQLXFBRMSCTALayout A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* loaded from: StoryViewerCardEntryPointData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GraphQLXFBRMSCTALayout graphQLXFBRMSCTALayout = null;
            String str = null;
            ImmutableList immutableList = null;
            String str2 = null;
            String str3 = null;
            GraphQLXFBRMSCTAAction graphQLXFBRMSCTAAction = null;
            String str4 = null;
            PrivacyTextWithEntitiesData privacyTextWithEntitiesData = null;
            String str5 = null;
            String str6 = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1323727521:
                                if (A1C.equals("subheader_text")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -815905284:
                                if (A1C.equals("cta_text")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -760402824:
                                if (A1C.equals("subheader_fallback_text")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -629092476:
                                if (A1C.equals("privacy_text")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 3063907:
                                if (A1C.equals("ctas")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, StoryViewerCardCtaEntryPointData.class);
                                    break;
                                }
                                break;
                            case 690837059:
                                if (A1C.equals("preview_c_t_a")) {
                                    graphQLXFBRMSCTAAction = (GraphQLXFBRMSCTAAction) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBRMSCTAAction.class);
                                    break;
                                }
                                break;
                            case 817434168:
                                if (A1C.equals("header_fallback_text")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1184148383:
                                if (A1C.equals("header_text")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1345352095:
                                if (A1C.equals("privacy_text_with_entities")) {
                                    privacyTextWithEntitiesData = (PrivacyTextWithEntitiesData) AbstractC11224vw.A02(abstractC01033pi, c27t, PrivacyTextWithEntitiesData.class);
                                    break;
                                }
                                break;
                            case 1661338681:
                                if (A1C.equals("cta_layout")) {
                                    graphQLXFBRMSCTALayout = (GraphQLXFBRMSCTALayout) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBRMSCTALayout.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, StoryViewerCardEntryPointData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new StoryViewerCardEntryPointData(privacyTextWithEntitiesData, graphQLXFBRMSCTAAction, graphQLXFBRMSCTALayout, immutableList, str, str2, str3, str4, str5, str6);
        }
    }

    /* loaded from: StoryViewerCardEntryPointData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            StoryViewerCardEntryPointData storyViewerCardEntryPointData = (StoryViewerCardEntryPointData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, storyViewerCardEntryPointData.A02, "cta_layout");
            AbstractC11224vw.A0D(r302, "cta_text", storyViewerCardEntryPointData.A04);
            AbstractC11224vw.A06(r302, c26c, "ctas", storyViewerCardEntryPointData.A03);
            AbstractC11224vw.A0D(r302, "header_fallback_text", storyViewerCardEntryPointData.A05);
            AbstractC11224vw.A0D(r302, "header_text", storyViewerCardEntryPointData.A06);
            AbstractC11224vw.A05(r302, c26c, storyViewerCardEntryPointData.A01, "preview_c_t_a");
            AbstractC11224vw.A0D(r302, "privacy_text", storyViewerCardEntryPointData.A07);
            AbstractC11224vw.A05(r302, c26c, storyViewerCardEntryPointData.A00, "privacy_text_with_entities");
            AbstractC11224vw.A0D(r302, "subheader_fallback_text", storyViewerCardEntryPointData.A08);
            AbstractC11224vw.A0D(r302, "subheader_text", storyViewerCardEntryPointData.A09);
            r302.A0Y();
        }
    }

    public StoryViewerCardEntryPointData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = GraphQLXFBRMSCTALayout.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt = parcel.readInt();
            StoryViewerCardCtaEntryPointData[] storyViewerCardCtaEntryPointDataArr = new StoryViewerCardCtaEntryPointData[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, storyViewerCardCtaEntryPointDataArr, i);
            }
            this.A03 = ImmutableList.copyOf(storyViewerCardCtaEntryPointDataArr);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXFBRMSCTAAction.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (PrivacyTextWithEntitiesData) parcel.readParcelable(A0e);
        }
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A09 = C3o5.A0O(parcel);
    }

    public StoryViewerCardEntryPointData(PrivacyTextWithEntitiesData privacyTextWithEntitiesData, GraphQLXFBRMSCTAAction graphQLXFBRMSCTAAction, GraphQLXFBRMSCTALayout graphQLXFBRMSCTALayout, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = graphQLXFBRMSCTALayout;
        this.A04 = str;
        this.A03 = immutableList;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = graphQLXFBRMSCTAAction;
        this.A07 = str4;
        this.A00 = privacyTextWithEntitiesData;
        this.A08 = str5;
        this.A09 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryViewerCardEntryPointData)) {
                return false;
            }
            StoryViewerCardEntryPointData storyViewerCardEntryPointData = (StoryViewerCardEntryPointData) obj;
            if (this.A02 != storyViewerCardEntryPointData.A02 || !11T.A0O(this.A04, storyViewerCardEntryPointData.A04) || !11T.A0O(this.A03, storyViewerCardEntryPointData.A03) || !11T.A0O(this.A05, storyViewerCardEntryPointData.A05) || !11T.A0O(this.A06, storyViewerCardEntryPointData.A06) || this.A01 != storyViewerCardEntryPointData.A01 || !11T.A0O(this.A07, storyViewerCardEntryPointData.A07) || !11T.A0O(this.A00, storyViewerCardEntryPointData.A00) || !11T.A0O(this.A08, storyViewerCardEntryPointData.A08) || !11T.A0O(this.A09, storyViewerCardEntryPointData.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A03, C1pq.A04(this.A04, C3o5.A03(this.A02) + 31))));
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A00, C1pq.A04(this.A07, (A04 * 31) + DKF.A04(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A02);
        1BL.A13(parcel, this.A04);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((StoryViewerCardCtaEntryPointData) A0Y.next(), i);
            }
        }
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0e(parcel, this.A01);
        1BL.A13(parcel, this.A07);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
    }
}
