package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AbJ;
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
import X.DKB;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMo;
import X.EnumC3475Met;
import X.EnumC3479Mex;
import X.EnumC3480Mey;
import X.FJ8;
import X.FKa;
import X.GOm;
import X.JQw;
import X.MRl;
import X.MT4;
import X.N2G;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbshorts.sharesheet.coverphotoselector.model.CoverPhotoSelectionResultDataModel;
import com.facebook.fbshorts.sharesheet.tagtopics.model.FbShareSheetSubTopicModel;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FbShortsPublishPostData.class */
public final class FbShortsPublishPostData implements Parcelable {
    public static volatile EnumC3479Mex A0Z;
    public static volatile EnumC3475Met A0a;
    public static volatile EMo A0b;
    public static final Parcelable.Creator CREATOR = FKa.A00(87);
    public final int A00;
    public final CoverPhotoSelectionResultDataModel A01;
    public final MT4 A02;
    public final EnumC3479Mex A03;
    public final MetaGalleryMediaPublishingData A04;
    public final EnumC3480Mey A05;
    public final EnumC3475Met A06;
    public final EMo A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Set A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    /* loaded from: FbShortsPublishPostData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            N2G n2g = new N2G();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2086296424:
                                if (A1C.equals("video_list_id")) {
                                    n2g.A0O = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2046370802:
                                if (A1C.equals("boost_status")) {
                                    n2g.A0R = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1863833901:
                                if (A1C.equals("publish_mode")) {
                                    EMo eMo = (EMo) AbstractC11224vw.A02(abstractC01033pi, c27t, EMo.class);
                                    n2g.A07 = eMo;
                                    str = "publishMode";
                                    C1pq.A08(str, eMo);
                                    N2G.A00(n2g, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1802232444:
                                if (A1C.equals("cover_photo_selection_result_data")) {
                                    n2g.A01 = (CoverPhotoSelectionResultDataModel) AbstractC11224vw.A02(abstractC01033pi, c27t, CoverPhotoSelectionResultDataModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1787667769:
                                if (A1C.equals("caption_variants")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    n2g.A08 = A00;
                                    C1pq.A08("captionVariants", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1668654509:
                                if (A1C.equals("tagged_event_id")) {
                                    n2g.A0N = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1528451439:
                                if (A1C.equals("share_to_story")) {
                                    n2g.A0M = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1499035055:
                                if (A1C.equals(DKB.A00(ActionId.ABORTED))) {
                                    n2g.A0T = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1460704618:
                                if (A1C.equals("is_cross_posting_first_time_nux_session")) {
                                    n2g.A0U = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1199093718:
                                if (A1C.equals(DKB.A00(ActionId.ACTION_BAR_COMPLETE))) {
                                    n2g.A0S = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -950066934:
                                if (A1C.equals("unified_tagged_user_ids")) {
                                    n2g.A0E = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -938313697:
                                if (A1C.equals("recent_selected_privacy_option_index")) {
                                    n2g.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -782949059:
                                if (A1C.equals("is_reels_posted_to_feed")) {
                                    n2g.A0W = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -726622126:
                                if (A1C.equals("privacy_write_id")) {
                                    n2g.A0L = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -692991276:
                                if (A1C.equals("story_media_ids_for_auto_created_reels")) {
                                    ImmutableList A0G = MRl.A0G(abstractC01033pi, c27t);
                                    n2g.A0B = A0G;
                                    C1pq.A08("storyMediaIdsForAutoCreatedReels", A0G);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -679959943:
                                if (A1C.equals("is_follow_setting_enabled")) {
                                    n2g.A0V = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -398107136:
                                if (A1C.equals("preferred_thumbnail_variant_handles")) {
                                    ImmutableList A0G2 = MRl.A0G(abstractC01033pi, c27t);
                                    n2g.A0A = A0G2;
                                    C1pq.A08("preferredThumbnailVariantHandles", A0G2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -382400588:
                                if (A1C.equals("meta_gallery_media_publishing_data")) {
                                    n2g.A04 = (MetaGalleryMediaPublishingData) AbstractC11224vw.A02(abstractC01033pi, c27t, MetaGalleryMediaPublishingData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -374604357:
                                if (A1C.equals("video_list_title")) {
                                    n2g.A0P = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -337851199:
                                if (A1C.equals("post_publishing_destination")) {
                                    EnumC3475Met enumC3475Met = (EnumC3475Met) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3475Met.class);
                                    n2g.A06 = enumC3475Met;
                                    str = "postPublishingDestination";
                                    C1pq.A08(str, enumC3475Met);
                                    N2G.A00(n2g, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 162743461:
                                if (A1C.equals("schedule_publish_time")) {
                                    n2g.A0F = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 166857942:
                                if (A1C.equals(GOm.A00(1))) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n2g.A0J = A03;
                                    C1pq.A08("mediaSource", A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 168294549:
                                if (A1C.equals("tagged_topic_ids")) {
                                    n2g.A0C = AbstractC11224vw.A00(abstractC01033pi, c27t, FbShareSheetSubTopicModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 194899813:
                                if (A1C.equals("input_description_text")) {
                                    n2g.A0I = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 248375839:
                                if (A1C.equals("selected_deal_fragment")) {
                                    n2g.A02 = (MT4) AbstractC11224vw.A02(abstractC01033pi, c27t, MT4.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 477606312:
                                if (A1C.equals("remix_status")) {
                                    EnumC3479Mex enumC3479Mex = (EnumC3479Mex) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3479Mex.class);
                                    n2g.A03 = enumC3479Mex;
                                    str = "remixStatus";
                                    C1pq.A08(str, enumC3479Mex);
                                    N2G.A00(n2g, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 511221459:
                                if (A1C.equals("deals_id")) {
                                    n2g.A0H = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 624489660:
                                if (A1C.equals("optimistic_media_upload_surface")) {
                                    n2g.A05 = (EnumC3480Mey) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3480Mey.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 746846732:
                                if (A1C.equals("unified_collaborator_ids")) {
                                    n2g.A0D = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1048945925:
                                if (A1C.equals("should_show_follow_upsell")) {
                                    n2g.A0Y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1399477917:
                                if (A1C.equals(DKB.A00(91))) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, CoverPhotoSelectionResultDataModel.class);
                                    n2g.A09 = A002;
                                    C1pq.A08("coverPhotoVariantsSelectionResultData", A002);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1422949584:
                                if (A1C.equals("mv_link")) {
                                    n2g.A0K = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1464872015:
                                if (A1C.equals("is_stars_disabled")) {
                                    n2g.A0X = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1983599621:
                                if (A1C.equals(JQw.A00(67))) {
                                    n2g.A0G = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            default:
                                abstractC01033pi.A20();
                                break;
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, FbShortsPublishPostData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new FbShortsPublishPostData(n2g);
        }
    }

    /* loaded from: FbShortsPublishPostData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            FbShortsPublishPostData fbShortsPublishPostData = (FbShortsPublishPostData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, JQw.A00(67), fbShortsPublishPostData.A0G);
            boolean z = fbShortsPublishPostData.A0R;
            r302.A0o("boost_status");
            r302.A0v(z);
            AbstractC11224vw.A06(r302, c26c, "caption_variants", fbShortsPublishPostData.A08);
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A01, "cover_photo_selection_result_data");
            AbstractC11224vw.A06(r302, c26c, DKB.A00(91), fbShortsPublishPostData.A09);
            AbstractC11224vw.A0D(r302, "deals_id", fbShortsPublishPostData.A0H);
            AbstractC11224vw.A0D(r302, "input_description_text", fbShortsPublishPostData.A0I);
            boolean z2 = fbShortsPublishPostData.A0S;
            r302.A0o(DKB.A00(ActionId.ACTION_BAR_COMPLETE));
            r302.A0v(z2);
            boolean z3 = fbShortsPublishPostData.A0T;
            r302.A0o(DKB.A00(ActionId.ABORTED));
            r302.A0v(z3);
            boolean z4 = fbShortsPublishPostData.A0U;
            r302.A0o("is_cross_posting_first_time_nux_session");
            r302.A0v(z4);
            boolean z5 = fbShortsPublishPostData.A0V;
            r302.A0o("is_follow_setting_enabled");
            r302.A0v(z5);
            boolean z6 = fbShortsPublishPostData.A0W;
            r302.A0o("is_reels_posted_to_feed");
            r302.A0v(z6);
            boolean z7 = fbShortsPublishPostData.A0X;
            r302.A0o("is_stars_disabled");
            r302.A0v(z7);
            AbstractC11224vw.A0D(r302, GOm.A00(1), fbShortsPublishPostData.A0J);
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A04, "meta_gallery_media_publishing_data");
            AbstractC11224vw.A0D(r302, "mv_link", fbShortsPublishPostData.A0K);
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A05, "optimistic_media_upload_surface");
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A01(), "post_publishing_destination");
            AbstractC11224vw.A06(r302, c26c, "preferred_thumbnail_variant_handles", fbShortsPublishPostData.A0A);
            AbstractC11224vw.A0D(r302, "privacy_write_id", fbShortsPublishPostData.A0L);
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A02(), "publish_mode");
            int i = fbShortsPublishPostData.A00;
            r302.A0o("recent_selected_privacy_option_index");
            r302.A0f(i);
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A00(), "remix_status");
            AbstractC11224vw.A0C(r302, fbShortsPublishPostData.A0F, "schedule_publish_time");
            AbstractC11224vw.A05(r302, c26c, fbShortsPublishPostData.A02, "selected_deal_fragment");
            AbstractC11224vw.A0D(r302, "share_to_story", fbShortsPublishPostData.A0M);
            boolean z8 = fbShortsPublishPostData.A0Y;
            r302.A0o("should_show_follow_upsell");
            r302.A0v(z8);
            AbstractC11224vw.A06(r302, c26c, "story_media_ids_for_auto_created_reels", fbShortsPublishPostData.A0B);
            AbstractC11224vw.A0D(r302, "tagged_event_id", fbShortsPublishPostData.A0N);
            AbstractC11224vw.A06(r302, c26c, "tagged_topic_ids", fbShortsPublishPostData.A0C);
            AbstractC11224vw.A06(r302, c26c, "unified_collaborator_ids", fbShortsPublishPostData.A0D);
            AbstractC11224vw.A06(r302, c26c, "unified_tagged_user_ids", fbShortsPublishPostData.A0E);
            AbstractC11224vw.A0D(r302, "video_list_id", fbShortsPublishPostData.A0O);
            AbstractC11224vw.A0D(r302, "video_list_title", fbShortsPublishPostData.A0P);
            r302.A0Y();
        }
    }

    public FbShortsPublishPostData(N2G n2g) {
        this.A0G = n2g.A0G;
        this.A0R = n2g.A0R;
        ImmutableList immutableList = n2g.A08;
        C1pq.A08("captionVariants", immutableList);
        this.A08 = immutableList;
        this.A01 = n2g.A01;
        ImmutableList immutableList2 = n2g.A09;
        C1pq.A08("coverPhotoVariantsSelectionResultData", immutableList2);
        this.A09 = immutableList2;
        this.A0H = n2g.A0H;
        this.A0I = n2g.A0I;
        this.A0S = n2g.A0S;
        this.A0T = n2g.A0T;
        this.A0U = n2g.A0U;
        this.A0V = n2g.A0V;
        this.A0W = n2g.A0W;
        this.A0X = n2g.A0X;
        String str = n2g.A0J;
        C1pq.A08("mediaSource", str);
        this.A0J = str;
        this.A04 = n2g.A04;
        this.A0K = n2g.A0K;
        this.A05 = n2g.A05;
        this.A06 = n2g.A06;
        ImmutableList immutableList3 = n2g.A0A;
        C1pq.A08("preferredThumbnailVariantHandles", immutableList3);
        this.A0A = immutableList3;
        this.A0L = n2g.A0L;
        this.A07 = n2g.A07;
        this.A00 = n2g.A00;
        this.A03 = n2g.A03;
        this.A0F = n2g.A0F;
        this.A02 = n2g.A02;
        this.A0M = n2g.A0M;
        this.A0Y = n2g.A0Y;
        ImmutableList immutableList4 = n2g.A0B;
        C1pq.A08("storyMediaIdsForAutoCreatedReels", immutableList4);
        this.A0B = immutableList4;
        this.A0N = n2g.A0N;
        this.A0C = n2g.A0C;
        this.A0D = n2g.A0D;
        this.A0E = n2g.A0E;
        this.A0O = n2g.A0O;
        this.A0P = n2g.A0P;
        this.A0Q = Collections.unmodifiableSet(n2g.A0Q);
    }

    public FbShortsPublishPostData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        int i = 0;
        this.A0R = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = ImmutableList.copyOf((Collection) FJ8.A06(parcel));
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (CoverPhotoSelectionResultDataModel) CoverPhotoSelectionResultDataModel.CREATOR.createFromParcel(parcel);
        }
        int readInt = parcel.readInt();
        CoverPhotoSelectionResultDataModel[] coverPhotoSelectionResultDataModelArr = new CoverPhotoSelectionResultDataModel[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, CoverPhotoSelectionResultDataModel.CREATOR, coverPhotoSelectionResultDataModelArr, i2);
        }
        this.A09 = ImmutableList.copyOf(coverPhotoSelectionResultDataModelArr);
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0J = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (MetaGalleryMediaPublishingData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = EnumC3480Mey.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = EnumC3475Met.values()[parcel.readInt()];
        }
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr, i3);
        }
        this.A0A = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = EMo.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = EnumC3479Mex.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A0Y = AbJ.A1V(parcel);
        int readInt3 = parcel.readInt();
        String[] strArr2 = new String[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbH.A00(parcel, strArr2, i4);
        }
        this.A0B = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            int readInt4 = parcel.readInt();
            FbShareSheetSubTopicModel[] fbShareSheetSubTopicModelArr = new FbShareSheetSubTopicModel[readInt4];
            int i5 = 0;
            while (i5 < readInt4) {
                i5 = DKG.A02(parcel, FbShareSheetSubTopicModel.CREATOR, fbShareSheetSubTopicModelArr, i5);
            }
            this.A0C = ImmutableList.copyOf(fbShareSheetSubTopicModelArr);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            int readInt5 = parcel.readInt();
            String[] strArr3 = new String[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbH.A00(parcel, strArr3, i6);
            }
            this.A0D = ImmutableList.copyOf(strArr3);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            int readInt6 = parcel.readInt();
            String[] strArr4 = new String[readInt6];
            int i7 = 0;
            while (i7 < readInt6) {
                i7 = AbH.A00(parcel, strArr4, i7);
            }
            this.A0E = ImmutableList.copyOf(strArr4);
        }
        this.A0O = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0P = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt7 = parcel.readInt();
        while (i < readInt7) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0Q = Collections.unmodifiableSet(A0v);
    }

    public EnumC3479Mex A00() {
        if (this.A0Q.contains("remixStatus")) {
            return this.A03;
        }
        if (A0Z == null) {
            synchronized (this) {
                if (A0Z == null) {
                    A0Z = EnumC3479Mex.A04;
                }
            }
        }
        return A0Z;
    }

    public EnumC3475Met A01() {
        if (this.A0Q.contains("postPublishingDestination")) {
            return this.A06;
        }
        if (A0a == null) {
            synchronized (this) {
                if (A0a == null) {
                    A0a = EnumC3475Met.A02;
                }
            }
        }
        return A0a;
    }

    public EMo A02() {
        if (this.A0Q.contains("publishMode")) {
            return this.A07;
        }
        if (A0b == null) {
            synchronized (this) {
                if (A0b == null) {
                    A0b = EMo.A02;
                }
            }
        }
        return A0b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbShortsPublishPostData)) {
                return false;
            }
            FbShortsPublishPostData fbShortsPublishPostData = (FbShortsPublishPostData) obj;
            if (!11T.A0O(this.A0G, fbShortsPublishPostData.A0G) || this.A0R != fbShortsPublishPostData.A0R || !11T.A0O(this.A08, fbShortsPublishPostData.A08) || !11T.A0O(this.A01, fbShortsPublishPostData.A01) || !11T.A0O(this.A09, fbShortsPublishPostData.A09) || !11T.A0O(this.A0H, fbShortsPublishPostData.A0H) || !11T.A0O(this.A0I, fbShortsPublishPostData.A0I) || this.A0S != fbShortsPublishPostData.A0S || this.A0T != fbShortsPublishPostData.A0T || this.A0U != fbShortsPublishPostData.A0U || this.A0V != fbShortsPublishPostData.A0V || this.A0W != fbShortsPublishPostData.A0W || this.A0X != fbShortsPublishPostData.A0X || !11T.A0O(this.A0J, fbShortsPublishPostData.A0J) || !11T.A0O(this.A04, fbShortsPublishPostData.A04) || !11T.A0O(this.A0K, fbShortsPublishPostData.A0K) || this.A05 != fbShortsPublishPostData.A05 || A01() != fbShortsPublishPostData.A01() || !11T.A0O(this.A0A, fbShortsPublishPostData.A0A) || !11T.A0O(this.A0L, fbShortsPublishPostData.A0L) || A02() != fbShortsPublishPostData.A02() || this.A00 != fbShortsPublishPostData.A00 || A00() != fbShortsPublishPostData.A00() || !11T.A0O(this.A0F, fbShortsPublishPostData.A0F) || !11T.A0O(this.A02, fbShortsPublishPostData.A02) || !11T.A0O(this.A0M, fbShortsPublishPostData.A0M) || this.A0Y != fbShortsPublishPostData.A0Y || !11T.A0O(this.A0B, fbShortsPublishPostData.A0B) || !11T.A0O(this.A0N, fbShortsPublishPostData.A0N) || !11T.A0O(this.A0C, fbShortsPublishPostData.A0C) || !11T.A0O(this.A0D, fbShortsPublishPostData.A0D) || !11T.A0O(this.A0E, fbShortsPublishPostData.A0E) || !11T.A0O(this.A0O, fbShortsPublishPostData.A0O) || !11T.A0O(this.A0P, fbShortsPublishPostData.A0P)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0K, C1pq.A04(this.A04, C1pq.A04(this.A0J, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A09, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A02(C1pq.A03(this.A0G), this.A0R)))))), this.A0S), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X))));
        int A03 = (A04 * 31) + C3o5.A03(this.A05);
        int A042 = C1pq.A04(this.A0L, C1pq.A04(this.A0A, (A03 * 31) + C3o5.A03(A01())));
        int A032 = (((A042 * 31) + C3o5.A03(A02())) * 31) + this.A00;
        return C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0N, C1pq.A04(this.A0B, C1pq.A02(C1pq.A04(this.A0M, C1pq.A04(this.A02, C1pq.A04(this.A0F, (A032 * 31) + DKF.A04(A00())))), this.A0Y))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0G);
        parcel.writeInt(this.A0R ? 1 : 0);
        FJ8.A0B(parcel, this.A08);
        CoverPhotoSelectionResultDataModel coverPhotoSelectionResultDataModel = this.A01;
        if (coverPhotoSelectionResultDataModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverPhotoSelectionResultDataModel.writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A09);
        while (A0b2.hasNext()) {
            ((CoverPhotoSelectionResultDataModel) A0b2.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeString(this.A0J);
        C3o5.A0d(parcel, this.A04, i);
        1BL.A13(parcel, this.A0K);
        C3o5.A0e(parcel, this.A05);
        C3o5.A0e(parcel, this.A06);
        1Du A0b3 = 1BL.A0b(parcel, this.A0A);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        1BL.A13(parcel, this.A0L);
        C3o5.A0e(parcel, this.A07);
        parcel.writeInt(this.A00);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0g(parcel, this.A0F);
        DKH.A0y(parcel, this.A02);
        1BL.A13(parcel, this.A0M);
        parcel.writeInt(this.A0Y ? 1 : 0);
        1Du A0b4 = 1BL.A0b(parcel, this.A0B);
        while (A0b4.hasNext()) {
            C3o5.A0h(parcel, A0b4);
        }
        1BL.A13(parcel, this.A0N);
        ImmutableList immutableList = this.A0C;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((FbShareSheetSubTopicModel) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        ImmutableList immutableList2 = this.A0D;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        ImmutableList immutableList3 = this.A0E;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                C3o5.A0h(parcel, A0Y3);
            }
        }
        1BL.A13(parcel, this.A0O);
        1BL.A13(parcel, this.A0P);
        Iterator A0S = C3o5.A0S(parcel, this.A0Q);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
