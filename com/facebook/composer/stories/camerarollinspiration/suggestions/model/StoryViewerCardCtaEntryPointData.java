package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKF;
import X.EQv;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLXFBRMSCTAAction;
import com.facebook.graphql.enums.GraphQLXFBRMSCTAButtonIconName;
import com.facebook.graphql.enums.GraphQLXFBRMSCTAButtonType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StoryViewerCardCtaEntryPointData.class */
public final class StoryViewerCardCtaEntryPointData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(16);
    public final EQv A00;
    public final GraphQLXFBRMSCTAAction A01;
    public final GraphQLXFBRMSCTAButtonIconName A02;
    public final GraphQLXFBRMSCTAButtonType A03;
    public final String A04;

    /* loaded from: StoryViewerCardCtaEntryPointData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GraphQLXFBRMSCTAAction graphQLXFBRMSCTAAction = null;
            GraphQLXFBRMSCTAButtonIconName graphQLXFBRMSCTAButtonIconName = null;
            EQv eQv = null;
            String str = null;
            GraphQLXFBRMSCTAButtonType graphQLXFBRMSCTAButtonType = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1422950858:
                                if (A1C.equals("action")) {
                                    graphQLXFBRMSCTAAction = (GraphQLXFBRMSCTAAction) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBRMSCTAAction.class);
                                    break;
                                }
                                break;
                            case -681517650:
                                if (A1C.equals("inspiration_entry_point")) {
                                    eQv = (EQv) AbstractC11224vw.A02(abstractC01033pi, c27t, EQv.class);
                                    break;
                                }
                                break;
                            case 3556653:
                                if (A1C.equals("text")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 3575610:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                                    graphQLXFBRMSCTAButtonType = (GraphQLXFBRMSCTAButtonType) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBRMSCTAButtonType.class);
                                    break;
                                }
                                break;
                            case 1689396942:
                                if (A1C.equals("fb_icon_name")) {
                                    graphQLXFBRMSCTAButtonIconName = (GraphQLXFBRMSCTAButtonIconName) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBRMSCTAButtonIconName.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, StoryViewerCardCtaEntryPointData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new StoryViewerCardCtaEntryPointData(eQv, graphQLXFBRMSCTAAction, graphQLXFBRMSCTAButtonIconName, graphQLXFBRMSCTAButtonType, str);
        }
    }

    /* loaded from: StoryViewerCardCtaEntryPointData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            StoryViewerCardCtaEntryPointData storyViewerCardCtaEntryPointData = (StoryViewerCardCtaEntryPointData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, storyViewerCardCtaEntryPointData.A01, "action");
            AbstractC11224vw.A05(r302, c26c, storyViewerCardCtaEntryPointData.A02, "fb_icon_name");
            AbstractC11224vw.A05(r302, c26c, storyViewerCardCtaEntryPointData.A00, "inspiration_entry_point");
            AbstractC11224vw.A0D(r302, "text", storyViewerCardCtaEntryPointData.A04);
            AbstractC11224vw.A05(r302, c26c, storyViewerCardCtaEntryPointData.A03, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            r302.A0Y();
        }
    }

    public StoryViewerCardCtaEntryPointData(EQv eQv, GraphQLXFBRMSCTAAction graphQLXFBRMSCTAAction, GraphQLXFBRMSCTAButtonIconName graphQLXFBRMSCTAButtonIconName, GraphQLXFBRMSCTAButtonType graphQLXFBRMSCTAButtonType, String str) {
        this.A01 = graphQLXFBRMSCTAAction;
        this.A02 = graphQLXFBRMSCTAButtonIconName;
        this.A00 = eQv;
        this.A04 = str;
        this.A03 = graphQLXFBRMSCTAButtonType;
    }

    public StoryViewerCardCtaEntryPointData(Parcel parcel) {
        GraphQLXFBRMSCTAButtonType graphQLXFBRMSCTAButtonType = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXFBRMSCTAAction.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = GraphQLXFBRMSCTAButtonIconName.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EQv.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? GraphQLXFBRMSCTAButtonType.values()[parcel.readInt()] : graphQLXFBRMSCTAButtonType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryViewerCardCtaEntryPointData)) {
                return false;
            }
            StoryViewerCardCtaEntryPointData storyViewerCardCtaEntryPointData = (StoryViewerCardCtaEntryPointData) obj;
            if (this.A01 != storyViewerCardCtaEntryPointData.A01 || this.A02 != storyViewerCardCtaEntryPointData.A02 || this.A00 != storyViewerCardCtaEntryPointData.A00 || !11T.A0O(this.A04, storyViewerCardCtaEntryPointData.A04) || this.A03 != storyViewerCardCtaEntryPointData.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C3o5.A03(this.A01) + 31;
        int A032 = (A03 * 31) + C3o5.A03(this.A02);
        int A04 = C1pq.A04(this.A04, (A032 * 31) + C3o5.A03(this.A00));
        return (A04 * 31) + DKF.A04(this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        C3o5.A0e(parcel, this.A02);
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A04);
        C3o5.A0e(parcel, this.A03);
    }
}
