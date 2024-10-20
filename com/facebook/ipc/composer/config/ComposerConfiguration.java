package com.facebook.ipc.composer.config;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YT;
import X.5BB;
import X.7zN;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.AqT;
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
import X.FJ8;
import X.FKc;
import X.GKq;
import X.MRl;
import X.MfQ;
import X.N4h;
import X.NAp;
import X.Qnt;
import X.Qzo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.audience.model.interfaces.StoryDestinationConfiguration;
import com.facebook.composer.media.ComposerMedia;
import com.facebook.composer.mediaeffect.model.ComposerMediaTemplate;
import com.facebook.composer.minutiae.model.MinutiaeObject;
import com.facebook.graphql.enums.GraphQLEditPostFeatureCapability;
import com.facebook.graphql.model.GraphQLStory;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.groupcommerce.model.GroupCommerceCategory;
import com.facebook.inspiration.composer.smartgallery.model.SingleStackingMediaData;
import com.facebook.ipc.composer.model.AvatarFeatureData;
import com.facebook.ipc.composer.model.CollaborativePromptsModel;
import com.facebook.ipc.composer.model.CommunityGivingModel;
import com.facebook.ipc.composer.model.ComposerActionItemsData;
import com.facebook.ipc.composer.model.ComposerBirthdayData;
import com.facebook.ipc.composer.model.ComposerBizData;
import com.facebook.ipc.composer.model.ComposerCallToAction;
import com.facebook.ipc.composer.model.ComposerCommerceInfo;
import com.facebook.ipc.composer.model.ComposerDifferentVoiceData;
import com.facebook.ipc.composer.model.ComposerFanRecognitionModel;
import com.facebook.ipc.composer.model.ComposerFileData;
import com.facebook.ipc.composer.model.ComposerFunFactModel;
import com.facebook.ipc.composer.model.ComposerFundraiserForStoryData;
import com.facebook.ipc.composer.model.ComposerGetGiftCardPurchasesModel;
import com.facebook.ipc.composer.model.ComposerGifFileModel;
import com.facebook.ipc.composer.model.ComposerGratitudePostModel;
import com.facebook.ipc.composer.model.ComposerGroupConfiguration;
import com.facebook.ipc.composer.model.ComposerGroupsChatsPostData;
import com.facebook.ipc.composer.model.ComposerGroupsWelcomePostData;
import com.facebook.ipc.composer.model.ComposerInterceptionConfig;
import com.facebook.ipc.composer.model.ComposerLaunchLoggingParams;
import com.facebook.ipc.composer.model.ComposerLocalCommunityPostModel;
import com.facebook.ipc.composer.model.ComposerLocationInfo;
import com.facebook.ipc.composer.model.ComposerLookingForPlayersModel;
import com.facebook.ipc.composer.model.ComposerMajorLifeEventData;
import com.facebook.ipc.composer.model.ComposerMemeRemixData;
import com.facebook.ipc.composer.model.ComposerMemorialPostData;
import com.facebook.ipc.composer.model.ComposerMusicData;
import com.facebook.ipc.composer.model.ComposerOfferData;
import com.facebook.ipc.composer.model.ComposerPageRecommendationModel;
import com.facebook.ipc.composer.model.ComposerPageTargetData;
import com.facebook.ipc.composer.model.ComposerPollData;
import com.facebook.ipc.composer.model.ComposerShareParams;
import com.facebook.ipc.composer.model.ComposerTaggedUser;
import com.facebook.ipc.composer.model.ComposerTargetData;
import com.facebook.ipc.composer.model.ComposerTextData;
import com.facebook.ipc.composer.model.ComposerThreedInfo;
import com.facebook.ipc.composer.model.ComposerVideoMeetupPostData;
import com.facebook.ipc.composer.model.EventsShareMetadataParam;
import com.facebook.ipc.composer.model.GoodwillProductSystem;
import com.facebook.ipc.composer.model.GoodwillVideo;
import com.facebook.ipc.composer.model.InlineSproutsSurfaceInfo;
import com.facebook.ipc.composer.model.MarketingMessagesTopic;
import com.facebook.ipc.composer.model.NewsFeedShareAnalyticsData;
import com.facebook.ipc.composer.model.PlatformConfiguration;
import com.facebook.ipc.composer.model.ProductItemAttachment;
import com.facebook.ipc.composer.model.SerializedComposerPluginConfig;
import com.facebook.ipc.composer.model.ThrowbackCameraRollMediaInfo;
import com.facebook.ipc.composer.model.ThrowbackCard;
import com.facebook.ipc.composer.model.WorkDraftForData;
import com.facebook.ipc.composer.model.editprefilled.EditComposerPreFilledData;
import com.facebook.ipc.composer.model.richtext.ComposerRichTextStyle;
import com.facebook.ipc.inspiration.config.InspirationConfiguration;
import com.facebook.pages.common.brandedcontent.model.PageUnit;
import com.facebook.photos.simplepicker.controller.data.model.Folder;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyOption;
import com.facebook.share.model.ComposerAppAttribution;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerConfiguration.class */
public final class ComposerConfiguration implements Parcelable, NAp {
    public static volatile StoryDestinationConfiguration A21;
    public static volatile GraphQLTextWithEntities A22;
    public static volatile ComposerLaunchLoggingParams A23;
    public static volatile ComposerTargetData A24;
    public static volatile ComposerTextData A25;
    public static volatile MfQ A26;
    public static final Parcelable.Creator CREATOR = new FKc(86);
    public final int A00;
    public final StoryDestinationConfiguration A01;
    public final ComposerMediaTemplate A02;
    public final MinutiaeObject A03;
    public final GraphQLStory A04;
    public final GraphQLTextWithEntities A05;
    public final SingleStackingMediaData A06;
    public final AvatarFeatureData A07;
    public final CollaborativePromptsModel A08;
    public final CommunityGivingModel A09;
    public final ComposerActionItemsData A0A;
    public final ComposerBirthdayData A0B;
    public final ComposerBizData A0C;
    public final ComposerCallToAction A0D;
    public final ComposerCommerceInfo A0E;
    public final ComposerDifferentVoiceData A0F;
    public final ComposerFanRecognitionModel A0G;
    public final ComposerFileData A0H;
    public final ComposerFunFactModel A0I;
    public final ComposerFundraiserForStoryData A0J;
    public final ComposerGetGiftCardPurchasesModel A0K;
    public final ComposerGifFileModel A0L;
    public final ComposerGratitudePostModel A0M;
    public final ComposerGroupConfiguration A0N;
    public final ComposerGroupsChatsPostData A0O;
    public final ComposerGroupsWelcomePostData A0P;
    public final ComposerLaunchLoggingParams A0Q;
    public final ComposerLocalCommunityPostModel A0R;
    public final ComposerLocationInfo A0S;
    public final ComposerLookingForPlayersModel A0T;
    public final ComposerMajorLifeEventData A0U;
    public final ComposerMemeRemixData A0V;
    public final ComposerMemorialPostData A0W;
    public final ComposerMusicData A0X;
    public final ComposerOfferData A0Y;
    public final ComposerPageRecommendationModel A0Z;
    public final ComposerPageTargetData A0a;
    public final ComposerPollData A0b;
    public final ComposerShareParams A0c;
    public final ComposerTargetData A0d;
    public final ComposerTextData A0e;
    public final ComposerThreedInfo A0f;
    public final MfQ A0g;
    public final ComposerVideoMeetupPostData A0h;
    public final Qnt A0i;
    public final EventsShareMetadataParam A0j;
    public final GoodwillProductSystem A0k;
    public final GoodwillVideo A0l;
    public final InlineSproutsSurfaceInfo A0m;
    public final MarketingMessagesTopic A0n;
    public final NewsFeedShareAnalyticsData A0o;
    public final PlatformConfiguration A0p;
    public final ProductItemAttachment A0q;
    public final SerializedComposerPluginConfig A0r;
    public final ThrowbackCameraRollMediaInfo A0s;
    public final ThrowbackCard A0t;
    public final WorkDraftForData A0u;
    public final EditComposerPreFilledData A0v;
    public final ComposerRichTextStyle A0w;
    public final InspirationConfiguration A0x;
    public final PageUnit A0y;
    public final AqT A0z;
    public final Folder A10;
    public final UAFPrivacyOption A11;
    public final ComposerAppAttribution A12;
    public final ImmutableList A13;
    public final ImmutableList A14;
    public final ImmutableList A15;
    public final ImmutableList A16;
    public final ImmutableList A17;
    public final ImmutableList A18;
    public final ImmutableList A19;
    public final ImmutableList A1A;
    public final Long A1B;
    public final String A1C;
    public final String A1D;
    public final String A1E;
    public final String A1F;
    public final String A1G;
    public final String A1H;
    public final String A1I;
    public final String A1J;
    public final String A1K;
    public final String A1L;
    public final String A1M;
    public final String A1N;
    public final String A1O;
    public final String A1P;
    public final String A1Q;
    public final String A1R;
    public final String A1S;
    public final String A1T;
    public final Set A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;
    public final boolean A1a;
    public final boolean A1b;
    public final boolean A1c;
    public final boolean A1d;
    public final boolean A1e;
    public final boolean A1f;
    public final boolean A1g;
    public final boolean A1h;
    public final boolean A1i;
    public final boolean A1j;
    public final boolean A1k;
    public final boolean A1l;
    public final boolean A1m;
    public final boolean A1n;
    public final boolean A1o;
    public final boolean A1p;
    public final boolean A1q;
    public final boolean A1r;
    public final boolean A1s;
    public final boolean A1t;
    public final boolean A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final boolean A1y;
    public final boolean A1z;
    public final boolean A20;

    /* loaded from: ComposerConfiguration$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            N4h n4h = new N4h();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2053165245:
                                if (A1C.equals("events_share_metadata_param")) {
                                    n4h.A0j = (EventsShareMetadataParam) AbstractC11224vw.A02(abstractC01033pi, c27t, EventsShareMetadataParam.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2048884622:
                                if (A1C.equals("launch_logging_params")) {
                                    n4h.A08((ComposerLaunchLoggingParams) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerLaunchLoggingParams.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2014688872:
                                if (A1C.equals("initial_page_recommendation_model")) {
                                    n4h.A0Z = (ComposerPageRecommendationModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerPageRecommendationModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1970653120:
                                if (A1C.equals("group_commerce_categories")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, GroupCommerceCategory.class);
                                    n4h.A16 = A00;
                                    C1pq.A08("groupCommerceCategories", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1958119139:
                                if (A1C.equals("initial_target_data")) {
                                    n4h.A09((ComposerTargetData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerTargetData.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1930589878:
                                if (A1C.equals("is_edit_privacy_enabled")) {
                                    n4h.A1h = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1842344294:
                                if (A1C.equals("attached_story")) {
                                    n4h.A04 = (GraphQLStory) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLStory.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1828648547:
                                if (A1C.equals("initial_throwback_card")) {
                                    n4h.A0t = (ThrowbackCard) AbstractC11224vw.A02(abstractC01033pi, c27t, ThrowbackCard.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1707690573:
                                if (A1C.equals("single_stacking_media_data")) {
                                    n4h.A06 = (SingleStackingMediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, SingleStackingMediaData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1662616500:
                                if (A1C.equals("should_disable_mentions")) {
                                    n4h.A1t = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1660216622:
                                if (A1C.equals("nectar_module")) {
                                    n4h.A1P = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1562235024:
                                if (A1C.equals("thread_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n4h.A1S = A03;
                                    C1pq.A08("threadId", A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1539855932:
                                if (A1C.equals("should_disable_photos")) {
                                    n4h.A1u = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1513036492:
                                if (A1C.equals("local_community_post_model")) {
                                    n4h.A0R = (ComposerLocalCommunityPostModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerLocalCommunityPostModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1474840340:
                                if (A1C.equals("media_selected_on_edit_flow")) {
                                    n4h.A1A = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerMedia.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1474470340:
                                if (A1C.equals("initial_groups_welcome_post_data")) {
                                    n4h.A0P = (ComposerGroupsWelcomePostData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGroupsWelcomePostData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1441805828:
                                if (A1C.equals("can_viewer_edit_post_media")) {
                                    n4h.A1X = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1311170098:
                                if (A1C.equals("plugin_config")) {
                                    n4h.A0r = (SerializedComposerPluginConfig) AbstractC11224vw.A02(abstractC01033pi, c27t, SerializedComposerPluginConfig.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1309129239:
                                if (A1C.equals("is_fire_and_forget")) {
                                    n4h.A1j = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1290496940:
                                if (A1C.equals("initial_collaborative_prompts_model")) {
                                    n4h.A08 = (CollaborativePromptsModel) AbstractC11224vw.A02(abstractC01033pi, c27t, CollaborativePromptsModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1261310984:
                                if (A1C.equals("initial_composer_text_data")) {
                                    ComposerTextData composerTextData = (ComposerTextData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerTextData.class);
                                    n4h.A0e = composerTextData;
                                    str = "initialComposerTextData";
                                    C1pq.A08(str, composerTextData);
                                    N4h.A06(n4h, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1238896538:
                                if (A1C.equals("disable_post_to_wall")) {
                                    n4h.A1a = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1224466329:
                                if (A1C.equals("initial_rich_text_style")) {
                                    n4h.A0w = (ComposerRichTextStyle) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerRichTextStyle.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1166065490:
                                if (A1C.equals("initial_gift_card_model")) {
                                    n4h.A0K = (ComposerGetGiftCardPurchasesModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGetGiftCardPurchasesModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1160447879:
                                if (A1C.equals("avatar_feature_data")) {
                                    n4h.A07 = (AvatarFeatureData) AbstractC11224vw.A02(abstractC01033pi, c27t, AvatarFeatureData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1112763735:
                                if (A1C.equals("edit_post_feature_capabilities")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, GraphQLEditPostFeatureCapability.class);
                                    n4h.A15 = A002;
                                    C1pq.A08("editPostFeatureCapabilities", A002);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1081001232:
                                if (A1C.equals("initial_post_title_message_text")) {
                                    n4h.A1J = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1040684523:
                                if (A1C.equals("feedback_source")) {
                                    n4h.A1G = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1011522811:
                                if (A1C.equals("initial_composer_gif_file_model")) {
                                    n4h.A0L = (ComposerGifFileModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGifFileModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -999272351:
                                if (A1C.equals("inspiration_configuration")) {
                                    n4h.A0x = (InspirationConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -934716346:
                                if (A1C.equals("memorial_post_data")) {
                                    n4h.A0W = (ComposerMemorialPostData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMemorialPostData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -881872344:
                                if (A1C.equals("initial_tagged_branded_content")) {
                                    n4h.A0y = (PageUnit) AbstractC11224vw.A02(abstractC01033pi, c27t, PageUnit.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -879750251:
                                if (A1C.equals("composer_biz_data")) {
                                    n4h.A0C = (ComposerBizData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerBizData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -847701647:
                                if (A1C.equals("preselected_share_to_channel_thread_id")) {
                                    n4h.A1Q = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -816638833:
                                if (A1C.equals("ar_game_i_d")) {
                                    n4h.A1C = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -758735386:
                                if (A1C.equals("initial_fundraiser_for_story")) {
                                    n4h.A0J = (ComposerFundraiserForStoryData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerFundraiserForStoryData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -729686271:
                                if (A1C.equals("initial_share_params")) {
                                    n4h.A0c = (ComposerShareParams) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerShareParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -700581793:
                                if (A1C.equals("custom_rich_text_styles")) {
                                    ImmutableList A0G = MRl.A0G(abstractC01033pi, c27t);
                                    n4h.A14 = A0G;
                                    C1pq.A08("customRichTextStyles", A0G);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -652663746:
                                if (A1C.equals("should_post_to_marketplace_by_default")) {
                                    n4h.A1y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -631953273:
                                if (A1C.equals("is_throwback_post")) {
                                    n4h.A1r = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -628132470:
                                if (A1C.equals("initial_publish_schedule_time")) {
                                    n4h.A1B = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -574610596:
                                if (A1C.equals("initial_target_album")) {
                                    n4h.A0z = (AqT) AbstractC11224vw.A02(abstractC01033pi, c27t, AqT.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -535674941:
                                if (A1C.equals("throwback_camera_roll_media_info")) {
                                    n4h.A0s = (ThrowbackCameraRollMediaInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, ThrowbackCameraRollMediaInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -502124244:
                                if (A1C.equals("work_draft_for_data")) {
                                    n4h.A0u = (WorkDraftForData) AbstractC11224vw.A02(abstractC01033pi, c27t, WorkDraftForData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -484127176:
                                if (A1C.equals("interception_configs")) {
                                    ImmutableList A003 = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerInterceptionConfig.class);
                                    n4h.A19 = A003;
                                    C1pq.A08("interceptionConfigs", A003);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -479476846:
                                if (A1C.equals("commerce_info")) {
                                    n4h.A0E = (ComposerCommerceInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerCommerceInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -461526097:
                                if (A1C.equals("goodwill_product_system")) {
                                    n4h.A0k = (GoodwillProductSystem) AbstractC11224vw.A02(abstractC01033pi, c27t, GoodwillProductSystem.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -433489160:
                                if (A1C.equals("cache_id")) {
                                    n4h.A1D = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -409497272:
                                if (A1C.equals("initial_text")) {
                                    GraphQLTextWithEntities graphQLTextWithEntities = (GraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    n4h.A05 = graphQLTextWithEntities;
                                    str = "initialText";
                                    C1pq.A08(str, graphQLTextWithEntities);
                                    N4h.A06(n4h, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -381903775:
                                if (A1C.equals("native_templates_client_id")) {
                                    n4h.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -365322094:
                                if (A1C.equals("should_show_tag_products_button")) {
                                    n4h.A1z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -341463121:
                                if (A1C.equals("is_shared_from_stella_app")) {
                                    n4h.A1p = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -312420404:
                                if (A1C.equals("initial_is_self_disclosed_as_a_i_generated")) {
                                    n4h.A1d = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -305798042:
                                if (A1C.equals("initial_app_attribution")) {
                                    n4h.A12 = (ComposerAppAttribution) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerAppAttribution.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -296389834:
                                if (A1C.equals("group_configuration")) {
                                    n4h.A0N = (ComposerGroupConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGroupConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -291507744:
                                if (A1C.equals("legacy_api_story_id")) {
                                    n4h.A1M = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -256874255:
                                if (A1C.equals("initial_composer_fan_recognition_model")) {
                                    n4h.A0G = (ComposerFanRecognitionModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerFanRecognitionModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -238500939:
                                if (A1C.equals("initial_groups_chats_post_data")) {
                                    n4h.A0O = (ComposerGroupsChatsPostData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGroupsChatsPostData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -237990832:
                                if (A1C.equals("initial_marketing_messages_topic")) {
                                    n4h.A0n = (MarketingMessagesTopic) AbstractC11224vw.A02(abstractC01033pi, c27t, MarketingMessagesTopic.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -204079489:
                                if (A1C.equals("product_item_attachment")) {
                                    n4h.A0q = (ProductItemAttachment) AbstractC11224vw.A02(abstractC01033pi, c27t, ProductItemAttachment.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -175506869:
                                if (A1C.equals("goodwill_video")) {
                                    n4h.A0l = (GoodwillVideo) AbstractC11224vw.A02(abstractC01033pi, c27t, GoodwillVideo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -163489278:
                                if (A1C.equals("should_open_with_collapsed_sprouts")) {
                                    n4h.A1w = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -103666088:
                                if (A1C.equals("tofu_tray_session_id")) {
                                    n4h.A1T = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -67622595:
                                if (A1C.equals("initial_location_info")) {
                                    n4h.A0S = (ComposerLocationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerLocationInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -39253949:
                                if (A1C.equals("disable_sticky_rich_text_style")) {
                                    n4h.A1c = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2615171:
                                if (A1C.equals("initial_page_target_data")) {
                                    n4h.A0a = (ComposerPageTargetData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerPageTargetData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 105354816:
                                if (A1C.equals("initial_selected_photo_layout")) {
                                    n4h.A1K = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 114659077:
                                if (A1C.equals("is_contribution_sticker_enabled")) {
                                    n4h.A1f = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 180340653:
                                if (A1C.equals("initial_frame_photo_layout_background_color")) {
                                    n4h.A1I = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 184002345:
                                if (A1C.equals("initial_media")) {
                                    n4h.A0A(AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerMedia.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 210955212:
                                if (A1C.equals("is_group_linking_post")) {
                                    n4h.A1l = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 211515028:
                                if (A1C.equals("allow_target_selection")) {
                                    n4h.A1V = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 256862897:
                                if (A1C.equals("initial_different_voice")) {
                                    n4h.A0F = (ComposerDifferentVoiceData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerDifferentVoiceData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 290562704:
                                if (A1C.equals("initial_tagged_users")) {
                                    ImmutableList A004 = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerTaggedUser.class);
                                    n4h.A18 = A004;
                                    C1pq.A08("initialTaggedUsers", A004);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 303838088:
                                if (A1C.equals("initial_offer_data")) {
                                    n4h.A0Y = (ComposerOfferData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerOfferData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 311637547:
                                if (A1C.equals("disable_plain_text_style")) {
                                    n4h.A1Z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 375250923:
                                if (A1C.equals("initial_video_meetup_model")) {
                                    n4h.A0h = (ComposerVideoMeetupPostData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerVideoMeetupPostData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 488951122:
                                if (A1C.equals("initial_file_data")) {
                                    n4h.A0H = (ComposerFileData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerFileData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 496358236:
                                if (A1C.equals("is_edit_tag_enabled")) {
                                    n4h.A1i = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 571085544:
                                if (A1C.equals("global_hint_override")) {
                                    n4h.A1H = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 602192290:
                                if (A1C.equals("initial_major_life_event_model")) {
                                    n4h.A0U = (ComposerMajorLifeEventData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMajorLifeEventData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 604458028:
                                if (A1C.equals("birthday_data")) {
                                    n4h.A0B = (ComposerBirthdayData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerBirthdayData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 662753205:
                                if (A1C.equals("instant_game_entry_point_data")) {
                                    n4h.A1L = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 692648198:
                                if (A1C.equals("default_hint_override")) {
                                    n4h.A1E = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 711174173:
                                if (A1C.equals("story_destination_config")) {
                                    StoryDestinationConfiguration storyDestinationConfiguration = (StoryDestinationConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, StoryDestinationConfiguration.class);
                                    n4h.A01 = storyDestinationConfiguration;
                                    str = "storyDestinationConfig";
                                    C1pq.A08(str, storyDestinationConfiguration);
                                    N4h.A06(n4h, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 747422985:
                                if (A1C.equals("disable_s_a_t_p_in_edit")) {
                                    n4h.A1b = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 749553972:
                                if (A1C.equals("should_use_optimistic_posting")) {
                                    n4h.A20 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 811688869:
                                if (A1C.equals("creator_content_sourcing_event_ids")) {
                                    n4h.A13 = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 815036220:
                                if (A1C.equals("gratitude_post_model")) {
                                    n4h.A0M = (ComposerGratitudePostModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGratitudePostModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 840174264:
                                if (A1C.equals("news_feed_share_analytics_data")) {
                                    n4h.A0o = (NewsFeedShareAnalyticsData) AbstractC11224vw.A02(abstractC01033pi, c27t, NewsFeedShareAnalyticsData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 871951581:
                                if (A1C.equals("initial_composer_call_to_action")) {
                                    n4h.A0D = (ComposerCallToAction) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerCallToAction.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 888407176:
                                if (A1C.equals("initial_composer_music_data")) {
                                    n4h.A0X = (ComposerMusicData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMusicData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 913316832:
                                if (A1C.equals("is_boost_post_supported")) {
                                    n4h.A1e = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 913573807:
                                if (A1C.equals("live_video_init_format")) {
                                    n4h.A1N = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 916645501:
                                if (A1C.equals("minutiae_object_tag")) {
                                    n4h.A03 = (MinutiaeObject) AbstractC11224vw.A02(abstractC01033pi, c27t, MinutiaeObject.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 966548318:
                                if (A1C.equals("sprouts_for_entity")) {
                                    n4h.A0m = (InlineSproutsSurfaceInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InlineSproutsSurfaceInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1000325291:
                                if (A1C.equals("external_ref_name")) {
                                    n4h.A1F = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1002390540:
                                if (A1C.equals("disable_ig_feed_cross_posting")) {
                                    n4h.A1Y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1037887823:
                                if (A1C.equals("meme_remix_data")) {
                                    n4h.A0V = (ComposerMemeRemixData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMemeRemixData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1125044929:
                                if (A1C.equals("messaging_entry_point_data")) {
                                    n4h.A1O = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1147920273:
                                if (A1C.equals("is_stories_cta_enabled")) {
                                    n4h.A1q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1185755847:
                                if (A1C.equals("threed_info")) {
                                    n4h.A0f = (ComposerThreedInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerThreedInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1218170313:
                                if (A1C.equals("initial_folder")) {
                                    n4h.A10 = (Folder) AbstractC11224vw.A02(abstractC01033pi, c27t, Folder.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1250052317:
                                if (A1C.equals("is_live_composer_disabled")) {
                                    n4h.A1m = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1271744044:
                                if (A1C.equals("is_from_stories_composer")) {
                                    n4h.A1k = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1289730857:
                                if (A1C.equals("initial_community_giving_model")) {
                                    n4h.A09 = (CommunityGivingModel) AbstractC11224vw.A02(abstractC01033pi, c27t, CommunityGivingModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1308073534:
                                if (A1C.equals("initial_privacy_override")) {
                                    n4h.A11 = (UAFPrivacyOption) AbstractC11224vw.A02(abstractC01033pi, c27t, UAFPrivacyOption.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1356297810:
                                if (A1C.equals("default_privacy_setting_configuration")) {
                                    n4h.A0i = (Qnt) AbstractC11224vw.A02(abstractC01033pi, c27t, Qnt.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1371549271:
                                if (A1C.equals("should_disable_friend_tagging")) {
                                    n4h.A1s = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1388457935:
                                if (A1C.equals("initial_looking_for_players_model")) {
                                    n4h.A0T = (ComposerLookingForPlayersModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerLookingForPlayersModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1448217143:
                                if (A1C.equals("initial_action_items_data")) {
                                    n4h.A0A = (ComposerActionItemsData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerActionItemsData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1481218071:
                                if (A1C.equals("should_open_with_keyboard")) {
                                    n4h.A1x = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1521323185:
                                if (A1C.equals("initial_fun_fact_model")) {
                                    n4h.A0I = (ComposerFunFactModel) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerFunFactModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1535912084:
                                if (A1C.equals("is_schedule_post_supported_for_undirected")) {
                                    n4h.A1o = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1581800438:
                                if (A1C.equals("should_log_f_c_r")) {
                                    n4h.A1v = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1661607151:
                                if (A1C.equals("initial_poll_data")) {
                                    n4h.A0b = (ComposerPollData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerPollData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1676291441:
                                if (A1C.equals("is_loaded_from_draft")) {
                                    n4h.A1n = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1715038762:
                                if (A1C.equals("platform_configuration")) {
                                    n4h.A0p = (PlatformConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, PlatformConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1717754021:
                                if (A1C.equals("story_id")) {
                                    n4h.A1R = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1875196529:
                                if (A1C.equals("can_viewer_edit_link_attachment")) {
                                    n4h.A1W = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1890416500:
                                if (A1C.equals("composer_media_template")) {
                                    n4h.A02 = (ComposerMediaTemplate) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMediaTemplate.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1926642425:
                                if (A1C.equals(4YT.A00(36))) {
                                    MfQ mfQ = (MfQ) AbstractC11224vw.A02(abstractC01033pi, c27t, MfQ.class);
                                    n4h.A0g = mfQ;
                                    str = "composerType";
                                    C1pq.A08(str, mfQ);
                                    N4h.A06(n4h, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2081801215:
                                if (A1C.equals("is_edit")) {
                                    n4h.A1g = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2100574273:
                                if (A1C.equals("edit_composer_pre_filled_data")) {
                                    n4h.A0v = (EditComposerPreFilledData) AbstractC11224vw.A02(abstractC01033pi, c27t, EditComposerPreFilledData.class);
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
                    C4V6.A01(abstractC01033pi, ComposerConfiguration.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerConfiguration(n4h);
        }
    }

    /* loaded from: ComposerConfiguration$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerConfiguration composerConfiguration = (ComposerConfiguration) obj;
            r302.A0b();
            boolean z = composerConfiguration.A1V;
            r302.A0o("allow_target_selection");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "ar_game_i_d", composerConfiguration.A1C);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A04, "attached_story");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A07, "avatar_feature_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0B, "birthday_data");
            AbstractC11224vw.A0D(r302, "cache_id", composerConfiguration.A1D);
            boolean z2 = composerConfiguration.A1W;
            r302.A0o("can_viewer_edit_link_attachment");
            r302.A0v(z2);
            boolean z3 = composerConfiguration.A1X;
            r302.A0o("can_viewer_edit_post_media");
            r302.A0v(z3);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0E, "commerce_info");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0C, "composer_biz_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A02, "composer_media_template");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.AdW(), 4YT.A00(36));
            AbstractC11224vw.A06(r302, c26c, "creator_content_sourcing_event_ids", composerConfiguration.A13);
            AbstractC11224vw.A06(r302, c26c, "custom_rich_text_styles", composerConfiguration.A14);
            AbstractC11224vw.A0D(r302, "default_hint_override", composerConfiguration.A1E);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0i, "default_privacy_setting_configuration");
            boolean z4 = composerConfiguration.A1Y;
            r302.A0o("disable_ig_feed_cross_posting");
            r302.A0v(z4);
            boolean z5 = composerConfiguration.A1Z;
            r302.A0o("disable_plain_text_style");
            r302.A0v(z5);
            boolean z6 = composerConfiguration.A1a;
            r302.A0o("disable_post_to_wall");
            r302.A0v(z6);
            boolean z7 = composerConfiguration.A1b;
            r302.A0o("disable_s_a_t_p_in_edit");
            r302.A0v(z7);
            boolean z8 = composerConfiguration.A1c;
            r302.A0o("disable_sticky_rich_text_style");
            r302.A0v(z8);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0v, "edit_composer_pre_filled_data");
            AbstractC11224vw.A06(r302, c26c, "edit_post_feature_capabilities", composerConfiguration.A15);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0j, "events_share_metadata_param");
            AbstractC11224vw.A0D(r302, "external_ref_name", composerConfiguration.A1F);
            AbstractC11224vw.A0D(r302, "feedback_source", composerConfiguration.A1G);
            AbstractC11224vw.A0D(r302, "global_hint_override", composerConfiguration.A1H);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0k, "goodwill_product_system");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0l, "goodwill_video");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0M, "gratitude_post_model");
            AbstractC11224vw.A06(r302, c26c, "group_commerce_categories", composerConfiguration.A16);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0N, "group_configuration");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0A, "initial_action_items_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A12, "initial_app_attribution");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A08, "initial_collaborative_prompts_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A09, "initial_community_giving_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0D, "initial_composer_call_to_action");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0G, "initial_composer_fan_recognition_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0L, "initial_composer_gif_file_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0X, "initial_composer_music_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.Aqc(), "initial_composer_text_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0F, "initial_different_voice");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0H, "initial_file_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A10, "initial_folder");
            AbstractC11224vw.A0D(r302, "initial_frame_photo_layout_background_color", composerConfiguration.A1I);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0I, "initial_fun_fact_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0J, "initial_fundraiser_for_story");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0K, "initial_gift_card_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0O, "initial_groups_chats_post_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0P, "initial_groups_welcome_post_data");
            boolean z9 = composerConfiguration.A1d;
            r302.A0o("initial_is_self_disclosed_as_a_i_generated");
            r302.A0v(z9);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0S, "initial_location_info");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0T, "initial_looking_for_players_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0U, "initial_major_life_event_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0n, "initial_marketing_messages_topic");
            AbstractC11224vw.A06(r302, c26c, "initial_media", composerConfiguration.A17);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0Y, "initial_offer_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0Z, "initial_page_recommendation_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0a, "initial_page_target_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0b, "initial_poll_data");
            AbstractC11224vw.A0D(r302, "initial_post_title_message_text", composerConfiguration.A1J);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A11, "initial_privacy_override");
            AbstractC11224vw.A0C(r302, composerConfiguration.A1B, "initial_publish_schedule_time");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0w, "initial_rich_text_style");
            AbstractC11224vw.A0D(r302, "initial_selected_photo_layout", composerConfiguration.A1K);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0c, "initial_share_params");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0y, "initial_tagged_branded_content");
            AbstractC11224vw.A06(r302, c26c, "initial_tagged_users", composerConfiguration.A18);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0z, "initial_target_album");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.Aqh(), "initial_target_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.Aqi(), "initial_text");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0t, "initial_throwback_card");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0h, "initial_video_meetup_model");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0x, "inspiration_configuration");
            AbstractC11224vw.A0D(r302, "instant_game_entry_point_data", composerConfiguration.A1L);
            AbstractC11224vw.A06(r302, c26c, "interception_configs", composerConfiguration.A19);
            boolean z10 = composerConfiguration.A1e;
            r302.A0o("is_boost_post_supported");
            r302.A0v(z10);
            boolean z11 = composerConfiguration.A1f;
            r302.A0o("is_contribution_sticker_enabled");
            r302.A0v(z11);
            boolean z12 = composerConfiguration.A1g;
            r302.A0o("is_edit");
            r302.A0v(z12);
            boolean z13 = composerConfiguration.A1h;
            r302.A0o("is_edit_privacy_enabled");
            r302.A0v(z13);
            boolean z14 = composerConfiguration.A1i;
            r302.A0o("is_edit_tag_enabled");
            r302.A0v(z14);
            boolean z15 = composerConfiguration.A1j;
            r302.A0o("is_fire_and_forget");
            r302.A0v(z15);
            boolean z16 = composerConfiguration.A1k;
            r302.A0o("is_from_stories_composer");
            r302.A0v(z16);
            boolean z17 = composerConfiguration.A1l;
            r302.A0o("is_group_linking_post");
            r302.A0v(z17);
            boolean z18 = composerConfiguration.A1m;
            r302.A0o("is_live_composer_disabled");
            r302.A0v(z18);
            boolean z19 = composerConfiguration.A1n;
            r302.A0o("is_loaded_from_draft");
            r302.A0v(z19);
            boolean z20 = composerConfiguration.A1o;
            r302.A0o("is_schedule_post_supported_for_undirected");
            r302.A0v(z20);
            boolean z21 = composerConfiguration.A1p;
            r302.A0o("is_shared_from_stella_app");
            r302.A0v(z21);
            boolean z22 = composerConfiguration.A1q;
            r302.A0o("is_stories_cta_enabled");
            r302.A0v(z22);
            boolean z23 = composerConfiguration.A1r;
            r302.A0o("is_throwback_post");
            r302.A0v(z23);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.AtP(), "launch_logging_params");
            AbstractC11224vw.A0D(r302, "legacy_api_story_id", composerConfiguration.A1M);
            AbstractC11224vw.A0D(r302, "live_video_init_format", composerConfiguration.A1N);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0R, "local_community_post_model");
            AbstractC11224vw.A06(r302, c26c, "media_selected_on_edit_flow", composerConfiguration.A1A);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0V, "meme_remix_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0W, "memorial_post_data");
            AbstractC11224vw.A0D(r302, "messaging_entry_point_data", composerConfiguration.A1O);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A03, "minutiae_object_tag");
            int i = composerConfiguration.A00;
            r302.A0o("native_templates_client_id");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, "nectar_module", composerConfiguration.A1P);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0o, "news_feed_share_analytics_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0p, "platform_configuration");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0r, "plugin_config");
            AbstractC11224vw.A0D(r302, "preselected_share_to_channel_thread_id", composerConfiguration.A1Q);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0q, "product_item_attachment");
            boolean z24 = composerConfiguration.A1s;
            r302.A0o("should_disable_friend_tagging");
            r302.A0v(z24);
            boolean z25 = composerConfiguration.A1t;
            r302.A0o("should_disable_mentions");
            r302.A0v(z25);
            boolean z26 = composerConfiguration.A1u;
            r302.A0o("should_disable_photos");
            r302.A0v(z26);
            boolean z27 = composerConfiguration.A1v;
            r302.A0o("should_log_f_c_r");
            r302.A0v(z27);
            boolean z28 = composerConfiguration.A1w;
            r302.A0o("should_open_with_collapsed_sprouts");
            r302.A0v(z28);
            boolean z29 = composerConfiguration.A1x;
            r302.A0o("should_open_with_keyboard");
            r302.A0v(z29);
            boolean z30 = composerConfiguration.A1y;
            r302.A0o("should_post_to_marketplace_by_default");
            r302.A0v(z30);
            boolean z31 = composerConfiguration.A1z;
            r302.A0o("should_show_tag_products_button");
            r302.A0v(z31);
            boolean z32 = composerConfiguration.A20;
            r302.A0o("should_use_optimistic_posting");
            r302.A0v(z32);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A06, "single_stacking_media_data");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0m, "sprouts_for_entity");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.BCn(), "story_destination_config");
            AbstractC11224vw.A0D(r302, "story_id", composerConfiguration.A1R);
            AbstractC11224vw.A0D(r302, "thread_id", composerConfiguration.A1S);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0f, "threed_info");
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0s, "throwback_camera_roll_media_info");
            AbstractC11224vw.A0D(r302, "tofu_tray_session_id", composerConfiguration.A1T);
            AbstractC11224vw.A05(r302, c26c, composerConfiguration.A0u, "work_draft_for_data");
            r302.A0Y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0592, code lost:
    
        if (r0.isReshare != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0559, code lost:
    
        if (r301.A0p != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ComposerConfiguration(X.N4h r302) {
        /*
            Method dump skipped, instructions count: 1665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ipc.composer.config.ComposerConfiguration.<init>(X.N4h):void");
    }

    public ComposerConfiguration(Parcel parcel) {
        int i = 0;
        this.A1V = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        WorkDraftForData workDraftForData = null;
        if (parcel.readInt() == 0) {
            this.A1C = null;
        } else {
            this.A1C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (GraphQLStory) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (AvatarFeatureData) AvatarFeatureData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (ComposerBirthdayData) ComposerBirthdayData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1D = null;
        } else {
            this.A1D = parcel.readString();
        }
        this.A1W = 1BM.A07(parcel);
        this.A1X = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (ComposerCommerceInfo) ComposerCommerceInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (ComposerBizData) ComposerBizData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ComposerMediaTemplate) ComposerMediaTemplate.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = MfQ.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A13 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A13 = ImmutableList.copyOf(strArr);
        }
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr2, i3);
        }
        this.A14 = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() == 0) {
            this.A1E = null;
        } else {
            this.A1E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = Qnt.values()[parcel.readInt()];
        }
        this.A1Y = 1BM.A07(parcel);
        this.A1Z = 1BM.A07(parcel);
        this.A1a = 1BM.A07(parcel);
        this.A1b = 1BM.A07(parcel);
        this.A1c = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0v = null;
        } else {
            this.A0v = (EditComposerPreFilledData) EditComposerPreFilledData.CREATOR.createFromParcel(parcel);
        }
        int readInt3 = parcel.readInt();
        GraphQLEditPostFeatureCapability[] graphQLEditPostFeatureCapabilityArr = new GraphQLEditPostFeatureCapability[readInt3];
        for (int i4 = 0; i4 < readInt3; i4++) {
            graphQLEditPostFeatureCapabilityArr[i4] = GraphQLEditPostFeatureCapability.values()[parcel.readInt()];
        }
        this.A15 = ImmutableList.copyOf(graphQLEditPostFeatureCapabilityArr);
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = (EventsShareMetadataParam) EventsShareMetadataParam.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1F = null;
        } else {
            this.A1F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1G = null;
        } else {
            this.A1G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1H = null;
        } else {
            this.A1H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0k = null;
        } else {
            this.A0k = (GoodwillProductSystem) GoodwillProductSystem.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0l = null;
        } else {
            this.A0l = (GoodwillVideo) GoodwillVideo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (ComposerGratitudePostModel) ComposerGratitudePostModel.CREATOR.createFromParcel(parcel);
        }
        int readInt4 = parcel.readInt();
        GroupCommerceCategory[] groupCommerceCategoryArr = new GroupCommerceCategory[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, GroupCommerceCategory.CREATOR, groupCommerceCategoryArr, i5);
        }
        this.A16 = ImmutableList.copyOf(groupCommerceCategoryArr);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (ComposerGroupConfiguration) ComposerGroupConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (ComposerActionItemsData) ComposerActionItemsData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A12 = null;
        } else {
            this.A12 = (ComposerAppAttribution) ComposerAppAttribution.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (CollaborativePromptsModel) CollaborativePromptsModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (CommunityGivingModel) CommunityGivingModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (ComposerCallToAction) ComposerCallToAction.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (ComposerFanRecognitionModel) ComposerFanRecognitionModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (ComposerGifFileModel) ComposerGifFileModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = (ComposerMusicData) ComposerMusicData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = (ComposerTextData) ComposerTextData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (ComposerDifferentVoiceData) ComposerDifferentVoiceData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (ComposerFileData) ComposerFileData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A10 = null;
        } else {
            this.A10 = (Folder) Folder.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1I = null;
        } else {
            this.A1I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (ComposerFunFactModel) ComposerFunFactModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (ComposerFundraiserForStoryData) ComposerFundraiserForStoryData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (ComposerGetGiftCardPurchasesModel) ComposerGetGiftCardPurchasesModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (ComposerGroupsChatsPostData) ComposerGroupsChatsPostData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = (ComposerGroupsWelcomePostData) ComposerGroupsWelcomePostData.CREATOR.createFromParcel(parcel);
        }
        this.A1d = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = (ComposerLocationInfo) ComposerLocationInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (ComposerLookingForPlayersModel) ComposerLookingForPlayersModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (ComposerMajorLifeEventData) ComposerMajorLifeEventData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0n = null;
        } else {
            this.A0n = (MarketingMessagesTopic) MarketingMessagesTopic.CREATOR.createFromParcel(parcel);
        }
        int readInt5 = parcel.readInt();
        ComposerMedia[] composerMediaArr = new ComposerMedia[readInt5];
        int i6 = 0;
        while (i6 < readInt5) {
            i6 = DKG.A02(parcel, ComposerMedia.CREATOR, composerMediaArr, i6);
        }
        this.A17 = ImmutableList.copyOf(composerMediaArr);
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = (ComposerOfferData) ComposerOfferData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = (ComposerPageRecommendationModel) ComposerPageRecommendationModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = (ComposerPageTargetData) ComposerPageTargetData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = (ComposerPollData) ComposerPollData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1J = null;
        } else {
            this.A1J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A11 = null;
        } else {
            this.A11 = (UAFPrivacyOption) UAFPrivacyOption.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1B = null;
        } else {
            this.A1B = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0w = null;
        } else {
            this.A0w = (ComposerRichTextStyle) ComposerRichTextStyle.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1K = null;
        } else {
            this.A1K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = (ComposerShareParams) ComposerShareParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0y = null;
        } else {
            this.A0y = (PageUnit) PageUnit.CREATOR.createFromParcel(parcel);
        }
        int readInt6 = parcel.readInt();
        ComposerTaggedUser[] composerTaggedUserArr = new ComposerTaggedUser[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = DKG.A02(parcel, ComposerTaggedUser.CREATOR, composerTaggedUserArr, i7);
        }
        this.A18 = ImmutableList.copyOf(composerTaggedUserArr);
        if (parcel.readInt() == 0) {
            this.A0z = null;
        } else {
            this.A0z = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = (ComposerTargetData) ComposerTargetData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0t = null;
        } else {
            this.A0t = (ThrowbackCard) ThrowbackCard.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = (ComposerVideoMeetupPostData) ComposerVideoMeetupPostData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0x = null;
        } else {
            this.A0x = (InspirationConfiguration) InspirationConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1L = null;
        } else {
            this.A1L = parcel.readString();
        }
        int readInt7 = parcel.readInt();
        ComposerInterceptionConfig[] composerInterceptionConfigArr = new ComposerInterceptionConfig[readInt7];
        int i8 = 0;
        while (i8 < readInt7) {
            i8 = DKG.A02(parcel, ComposerInterceptionConfig.CREATOR, composerInterceptionConfigArr, i8);
        }
        this.A19 = ImmutableList.copyOf(composerInterceptionConfigArr);
        this.A1e = 1BM.A07(parcel);
        this.A1f = 1BM.A07(parcel);
        this.A1g = 1BM.A07(parcel);
        this.A1h = 1BM.A07(parcel);
        this.A1i = 1BM.A07(parcel);
        this.A1j = 1BM.A07(parcel);
        this.A1k = 1BM.A07(parcel);
        this.A1l = 1BM.A07(parcel);
        this.A1m = 1BM.A07(parcel);
        this.A1n = 1BM.A07(parcel);
        this.A1o = 1BM.A07(parcel);
        this.A1p = 1BM.A07(parcel);
        this.A1q = 1BM.A07(parcel);
        this.A1r = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (ComposerLaunchLoggingParams) ComposerLaunchLoggingParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1M = null;
        } else {
            this.A1M = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1N = null;
        } else {
            this.A1N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = (ComposerLocalCommunityPostModel) ComposerLocalCommunityPostModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1A = null;
        } else {
            int readInt8 = parcel.readInt();
            ComposerMedia[] composerMediaArr2 = new ComposerMedia[readInt8];
            int i9 = 0;
            while (i9 < readInt8) {
                i9 = DKG.A02(parcel, ComposerMedia.CREATOR, composerMediaArr2, i9);
            }
            this.A1A = ImmutableList.copyOf(composerMediaArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (ComposerMemeRemixData) ComposerMemeRemixData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (ComposerMemorialPostData) ComposerMemorialPostData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1O = null;
        } else {
            this.A1O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (MinutiaeObject) MinutiaeObject.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A1P = null;
        } else {
            this.A1P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0o = null;
        } else {
            this.A0o = (NewsFeedShareAnalyticsData) NewsFeedShareAnalyticsData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0p = null;
        } else {
            this.A0p = (PlatformConfiguration) PlatformConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0r = null;
        } else {
            this.A0r = (SerializedComposerPluginConfig) SerializedComposerPluginConfig.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1Q = null;
        } else {
            this.A1Q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0q = null;
        } else {
            this.A0q = (ProductItemAttachment) ProductItemAttachment.CREATOR.createFromParcel(parcel);
        }
        this.A1s = 1BM.A07(parcel);
        this.A1t = 1BM.A07(parcel);
        this.A1u = 1BM.A07(parcel);
        this.A1v = 1BM.A07(parcel);
        this.A1w = 1BM.A07(parcel);
        this.A1x = 1BM.A07(parcel);
        this.A1y = 1BM.A07(parcel);
        this.A1z = 1BM.A07(parcel);
        this.A20 = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (SingleStackingMediaData) SingleStackingMediaData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0m = null;
        } else {
            this.A0m = (InlineSproutsSurfaceInfo) InlineSproutsSurfaceInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (StoryDestinationConfiguration) StoryDestinationConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1R = null;
        } else {
            this.A1R = parcel.readString();
        }
        this.A1S = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = (ComposerThreedInfo) ComposerThreedInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0s = null;
        } else {
            this.A0s = (ThrowbackCameraRollMediaInfo) ThrowbackCameraRollMediaInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1T = null;
        } else {
            this.A1T = parcel.readString();
        }
        this.A0u = parcel.readInt() != 0 ? (WorkDraftForData) WorkDraftForData.CREATOR.createFromParcel(parcel) : workDraftForData;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt9 = parcel.readInt();
        while (i < readInt9) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A1U = Collections.unmodifiableSet(A0v);
    }

    @Override // X.NAp
    public MfQ AdW() {
        if (this.A1U.contains("composerType")) {
            return this.A0g;
        }
        if (A26 == null) {
            synchronized (this) {
                if (A26 == null) {
                    A26 = MfQ.A07;
                }
            }
        }
        return A26;
    }

    @Override // X.NAp
    public ComposerTextData Aqc() {
        if (this.A1U.contains("initialComposerTextData")) {
            return this.A0e;
        }
        if (A25 == null) {
            synchronized (this) {
                if (A25 == null) {
                    ImmutableList.of();
                    ImmutableList of = ImmutableList.of();
                    C1pq.A08(DKB.A00(351), of);
                    A25 = new ComposerTextData(of);
                }
            }
        }
        return A25;
    }

    @Override // X.NAp
    public ComposerTargetData Aqh() {
        if (this.A1U.contains("initialTargetData")) {
            return this.A0d;
        }
        if (A24 == null) {
            synchronized (this) {
                if (A24 == null) {
                    A24 = GKq.A00;
                }
            }
        }
        return A24;
    }

    @Override // X.NAp
    public GraphQLTextWithEntities Aqi() {
        if (this.A1U.contains("initialText")) {
            return this.A05;
        }
        if (A22 == null) {
            synchronized (this) {
                if (A22 == null) {
                    GraphQLTextWithEntities A00 = Qzo.A00("");
                    11T.A0A(A00);
                    A22 = A00;
                }
            }
        }
        return A22;
    }

    @Override // X.NAp
    public ComposerLaunchLoggingParams AtP() {
        if (this.A1U.contains("launchLoggingParams")) {
            return this.A0Q;
        }
        if (A23 == null) {
            synchronized (this) {
                if (A23 == null) {
                    A23 = new ComposerLaunchLoggingParams(null, null, "", AnonymousClass001.A0v());
                }
            }
        }
        return A23;
    }

    @Override // X.NAp
    public StoryDestinationConfiguration BCn() {
        if (this.A1U.contains("storyDestinationConfig")) {
            return this.A01;
        }
        if (A21 == null) {
            synchronized (this) {
                if (A21 == null) {
                    A21 = new StoryDestinationConfiguration(null, null, null, false, false, false);
                }
            }
        }
        return A21;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerConfiguration)) {
                return false;
            }
            ComposerConfiguration composerConfiguration = (ComposerConfiguration) obj;
            if (this.A1V != composerConfiguration.A1V || !11T.A0O(this.A1C, composerConfiguration.A1C) || !11T.A0O(this.A04, composerConfiguration.A04) || !11T.A0O(this.A07, composerConfiguration.A07) || !11T.A0O(this.A0B, composerConfiguration.A0B) || !11T.A0O(this.A1D, composerConfiguration.A1D) || this.A1W != composerConfiguration.A1W || this.A1X != composerConfiguration.A1X || !11T.A0O(this.A0E, composerConfiguration.A0E) || !11T.A0O(this.A0C, composerConfiguration.A0C) || !11T.A0O(this.A02, composerConfiguration.A02) || AdW() != composerConfiguration.AdW() || !11T.A0O(this.A13, composerConfiguration.A13) || !11T.A0O(this.A14, composerConfiguration.A14) || !11T.A0O(this.A1E, composerConfiguration.A1E) || this.A0i != composerConfiguration.A0i || this.A1Y != composerConfiguration.A1Y || this.A1Z != composerConfiguration.A1Z || this.A1a != composerConfiguration.A1a || this.A1b != composerConfiguration.A1b || this.A1c != composerConfiguration.A1c || !11T.A0O(this.A0v, composerConfiguration.A0v) || !11T.A0O(this.A15, composerConfiguration.A15) || !11T.A0O(this.A0j, composerConfiguration.A0j) || !11T.A0O(this.A1F, composerConfiguration.A1F) || !11T.A0O(this.A1G, composerConfiguration.A1G) || !11T.A0O(this.A1H, composerConfiguration.A1H) || !11T.A0O(this.A0k, composerConfiguration.A0k) || !11T.A0O(this.A0l, composerConfiguration.A0l) || !11T.A0O(this.A0M, composerConfiguration.A0M) || !11T.A0O(this.A16, composerConfiguration.A16) || !11T.A0O(this.A0N, composerConfiguration.A0N) || !11T.A0O(this.A0A, composerConfiguration.A0A) || !11T.A0O(this.A12, composerConfiguration.A12) || !11T.A0O(this.A08, composerConfiguration.A08) || !11T.A0O(this.A09, composerConfiguration.A09) || !11T.A0O(this.A0D, composerConfiguration.A0D) || !11T.A0O(this.A0G, composerConfiguration.A0G) || !11T.A0O(this.A0L, composerConfiguration.A0L) || !11T.A0O(this.A0X, composerConfiguration.A0X) || !11T.A0O(Aqc(), composerConfiguration.Aqc()) || !11T.A0O(this.A0F, composerConfiguration.A0F) || !11T.A0O(this.A0H, composerConfiguration.A0H) || !11T.A0O(this.A10, composerConfiguration.A10) || !11T.A0O(this.A1I, composerConfiguration.A1I) || !11T.A0O(this.A0I, composerConfiguration.A0I) || !11T.A0O(this.A0J, composerConfiguration.A0J) || !11T.A0O(this.A0K, composerConfiguration.A0K) || !11T.A0O(this.A0O, composerConfiguration.A0O) || !11T.A0O(this.A0P, composerConfiguration.A0P) || this.A1d != composerConfiguration.A1d || !11T.A0O(this.A0S, composerConfiguration.A0S) || !11T.A0O(this.A0T, composerConfiguration.A0T) || !11T.A0O(this.A0U, composerConfiguration.A0U) || !11T.A0O(this.A0n, composerConfiguration.A0n) || !11T.A0O(this.A17, composerConfiguration.A17) || !11T.A0O(this.A0Y, composerConfiguration.A0Y) || !11T.A0O(this.A0Z, composerConfiguration.A0Z) || !11T.A0O(this.A0a, composerConfiguration.A0a) || !11T.A0O(this.A0b, composerConfiguration.A0b) || !11T.A0O(this.A1J, composerConfiguration.A1J) || !11T.A0O(this.A11, composerConfiguration.A11) || !11T.A0O(this.A1B, composerConfiguration.A1B) || !11T.A0O(this.A0w, composerConfiguration.A0w) || !11T.A0O(this.A1K, composerConfiguration.A1K) || !11T.A0O(this.A0c, composerConfiguration.A0c) || !11T.A0O(this.A0y, composerConfiguration.A0y) || !11T.A0O(this.A18, composerConfiguration.A18) || !11T.A0O(this.A0z, composerConfiguration.A0z) || !11T.A0O(Aqh(), composerConfiguration.Aqh()) || !11T.A0O(Aqi(), composerConfiguration.Aqi()) || !11T.A0O(this.A0t, composerConfiguration.A0t) || !11T.A0O(this.A0h, composerConfiguration.A0h) || !11T.A0O(this.A0x, composerConfiguration.A0x) || !11T.A0O(this.A1L, composerConfiguration.A1L) || !11T.A0O(this.A19, composerConfiguration.A19) || this.A1e != composerConfiguration.A1e || this.A1f != composerConfiguration.A1f || this.A1g != composerConfiguration.A1g || this.A1h != composerConfiguration.A1h || this.A1i != composerConfiguration.A1i || this.A1j != composerConfiguration.A1j || this.A1k != composerConfiguration.A1k || this.A1l != composerConfiguration.A1l || this.A1m != composerConfiguration.A1m || this.A1n != composerConfiguration.A1n || this.A1o != composerConfiguration.A1o || this.A1p != composerConfiguration.A1p || this.A1q != composerConfiguration.A1q || this.A1r != composerConfiguration.A1r || !11T.A0O(AtP(), composerConfiguration.AtP()) || !11T.A0O(this.A1M, composerConfiguration.A1M) || !11T.A0O(this.A1N, composerConfiguration.A1N) || !11T.A0O(this.A0R, composerConfiguration.A0R) || !11T.A0O(this.A1A, composerConfiguration.A1A) || !11T.A0O(this.A0V, composerConfiguration.A0V) || !11T.A0O(this.A0W, composerConfiguration.A0W) || !11T.A0O(this.A1O, composerConfiguration.A1O) || !11T.A0O(this.A03, composerConfiguration.A03) || this.A00 != composerConfiguration.A00 || !11T.A0O(this.A1P, composerConfiguration.A1P) || !11T.A0O(this.A0o, composerConfiguration.A0o) || !11T.A0O(this.A0p, composerConfiguration.A0p) || !11T.A0O(this.A0r, composerConfiguration.A0r) || !11T.A0O(this.A1Q, composerConfiguration.A1Q) || !11T.A0O(this.A0q, composerConfiguration.A0q) || this.A1s != composerConfiguration.A1s || this.A1t != composerConfiguration.A1t || this.A1u != composerConfiguration.A1u || this.A1v != composerConfiguration.A1v || this.A1w != composerConfiguration.A1w || this.A1x != composerConfiguration.A1x || this.A1y != composerConfiguration.A1y || this.A1z != composerConfiguration.A1z || this.A20 != composerConfiguration.A20 || !11T.A0O(this.A06, composerConfiguration.A06) || !11T.A0O(this.A0m, composerConfiguration.A0m) || !11T.A0O(BCn(), composerConfiguration.BCn()) || !11T.A0O(this.A1R, composerConfiguration.A1R) || !11T.A0O(this.A1S, composerConfiguration.A1S) || !11T.A0O(this.A0f, composerConfiguration.A0f) || !11T.A0O(this.A0s, composerConfiguration.A0s) || !11T.A0O(this.A1T, composerConfiguration.A1T) || !11T.A0O(this.A0u, composerConfiguration.A0u)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A0C, C1pq.A04(this.A0E, C1pq.A02(C1pq.A02(C1pq.A04(this.A1D, C1pq.A04(this.A0B, C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(this.A1C, C1pq.A05(this.A1V)))))), this.A1W), this.A1X))));
        int A042 = C1pq.A04(this.A1E, C1pq.A04(this.A14, C1pq.A04(this.A13, (A04 * 31) + C3o5.A03(AdW()))));
        return C1pq.A04(this.A0u, C1pq.A04(this.A1T, C1pq.A04(this.A0s, C1pq.A04(this.A0f, C1pq.A04(this.A1S, C1pq.A04(this.A1R, C1pq.A04(BCn(), C1pq.A04(this.A0m, C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0q, C1pq.A04(this.A1Q, C1pq.A04(this.A0r, C1pq.A04(this.A0p, C1pq.A04(this.A0o, C1pq.A04(this.A1P, (C1pq.A04(this.A03, C1pq.A04(this.A1O, C1pq.A04(this.A0W, C1pq.A04(this.A0V, C1pq.A04(this.A1A, C1pq.A04(this.A0R, C1pq.A04(this.A1N, C1pq.A04(this.A1M, C1pq.A04(AtP(), C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A19, C1pq.A04(this.A1L, C1pq.A04(this.A0x, C1pq.A04(this.A0h, C1pq.A04(this.A0t, C1pq.A04(Aqi(), C1pq.A04(Aqh(), C1pq.A04(this.A0z, C1pq.A04(this.A18, C1pq.A04(this.A0y, C1pq.A04(this.A0c, C1pq.A04(this.A1K, C1pq.A04(this.A0w, C1pq.A04(this.A1B, C1pq.A04(this.A11, C1pq.A04(this.A1J, C1pq.A04(this.A0b, C1pq.A04(this.A0a, C1pq.A04(this.A0Z, C1pq.A04(this.A0Y, C1pq.A04(this.A17, C1pq.A04(this.A0n, C1pq.A04(this.A0U, C1pq.A04(this.A0T, C1pq.A04(this.A0S, C1pq.A02(C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A1I, C1pq.A04(this.A10, C1pq.A04(this.A0H, C1pq.A04(this.A0F, C1pq.A04(Aqc(), C1pq.A04(this.A0X, C1pq.A04(this.A0L, C1pq.A04(this.A0G, C1pq.A04(this.A0D, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A12, C1pq.A04(this.A0A, C1pq.A04(this.A0N, C1pq.A04(this.A16, C1pq.A04(this.A0M, C1pq.A04(this.A0l, C1pq.A04(this.A0k, C1pq.A04(this.A1H, C1pq.A04(this.A1G, C1pq.A04(this.A1F, C1pq.A04(this.A0j, C1pq.A04(this.A15, C1pq.A04(this.A0v, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((A042 * 31) + DKF.A04(this.A0i), this.A1Y), this.A1Z), this.A1a), this.A1b), this.A1c)))))))))))))))))))))))))))))), this.A1d)))))))))))))))))))))))))), this.A1e), this.A1f), this.A1g), this.A1h), this.A1i), this.A1j), this.A1k), this.A1l), this.A1m), this.A1n), this.A1o), this.A1p), this.A1q), this.A1r)))))))))) * 31) + this.A00)))))), this.A1s), this.A1t), this.A1u), this.A1v), this.A1w), this.A1x), this.A1y), this.A1z), this.A20))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A1V ? 1 : 0);
        1BL.A13(parcel, this.A1C);
        DKH.A0y(parcel, this.A04);
        AvatarFeatureData avatarFeatureData = this.A07;
        if (avatarFeatureData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatarFeatureData.writeToParcel(parcel, i);
        }
        ComposerBirthdayData composerBirthdayData = this.A0B;
        if (composerBirthdayData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerBirthdayData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1D);
        parcel.writeInt(this.A1W ? 1 : 0);
        parcel.writeInt(this.A1X ? 1 : 0);
        ComposerCommerceInfo composerCommerceInfo = this.A0E;
        if (composerCommerceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerCommerceInfo.writeToParcel(parcel, i);
        }
        ComposerBizData composerBizData = this.A0C;
        if (composerBizData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerBizData.writeToParcel(parcel, i);
        }
        ComposerMediaTemplate composerMediaTemplate = this.A02;
        if (composerMediaTemplate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerMediaTemplate.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0g);
        ImmutableList immutableList = this.A13;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1Du A0b = 1BL.A0b(parcel, this.A14);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1BL.A13(parcel, this.A1E);
        C3o5.A0e(parcel, this.A0i);
        parcel.writeInt(this.A1Y ? 1 : 0);
        parcel.writeInt(this.A1Z ? 1 : 0);
        parcel.writeInt(this.A1a ? 1 : 0);
        parcel.writeInt(this.A1b ? 1 : 0);
        parcel.writeInt(this.A1c ? 1 : 0);
        EditComposerPreFilledData editComposerPreFilledData = this.A0v;
        if (editComposerPreFilledData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editComposerPreFilledData.writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A15);
        while (A0b2.hasNext()) {
            7zN.A0z(parcel, (GraphQLEditPostFeatureCapability) A0b2.next());
        }
        EventsShareMetadataParam eventsShareMetadataParam = this.A0j;
        if (eventsShareMetadataParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventsShareMetadataParam.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1F);
        1BL.A13(parcel, this.A1G);
        1BL.A13(parcel, this.A1H);
        GoodwillProductSystem goodwillProductSystem = this.A0k;
        if (goodwillProductSystem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            goodwillProductSystem.writeToParcel(parcel, i);
        }
        GoodwillVideo goodwillVideo = this.A0l;
        if (goodwillVideo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            goodwillVideo.writeToParcel(parcel, i);
        }
        ComposerGratitudePostModel composerGratitudePostModel = this.A0M;
        if (composerGratitudePostModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGratitudePostModel.writeToParcel(parcel, i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A16);
        while (A0b3.hasNext()) {
            ((GroupCommerceCategory) A0b3.next()).writeToParcel(parcel, i);
        }
        ComposerGroupConfiguration composerGroupConfiguration = this.A0N;
        if (composerGroupConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGroupConfiguration.writeToParcel(parcel, i);
        }
        ComposerActionItemsData composerActionItemsData = this.A0A;
        if (composerActionItemsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerActionItemsData.writeToParcel(parcel, i);
        }
        ComposerAppAttribution composerAppAttribution = this.A12;
        if (composerAppAttribution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerAppAttribution.writeToParcel(parcel, i);
        }
        CollaborativePromptsModel collaborativePromptsModel = this.A08;
        if (collaborativePromptsModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collaborativePromptsModel.writeToParcel(parcel, i);
        }
        CommunityGivingModel communityGivingModel = this.A09;
        if (communityGivingModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            communityGivingModel.writeToParcel(parcel, i);
        }
        ComposerCallToAction composerCallToAction = this.A0D;
        if (composerCallToAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerCallToAction.writeToParcel(parcel, i);
        }
        ComposerFanRecognitionModel composerFanRecognitionModel = this.A0G;
        if (composerFanRecognitionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerFanRecognitionModel.writeToParcel(parcel, i);
        }
        ComposerGifFileModel composerGifFileModel = this.A0L;
        if (composerGifFileModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGifFileModel.writeToParcel(parcel, i);
        }
        ComposerMusicData composerMusicData = this.A0X;
        if (composerMusicData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerMusicData.writeToParcel(parcel, i);
        }
        ComposerTextData composerTextData = this.A0e;
        if (composerTextData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerTextData.writeToParcel(parcel, i);
        }
        ComposerDifferentVoiceData composerDifferentVoiceData = this.A0F;
        if (composerDifferentVoiceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerDifferentVoiceData.writeToParcel(parcel, i);
        }
        ComposerFileData composerFileData = this.A0H;
        if (composerFileData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerFileData.writeToParcel(parcel, i);
        }
        Folder folder = this.A10;
        if (folder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            folder.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1I);
        ComposerFunFactModel composerFunFactModel = this.A0I;
        if (composerFunFactModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerFunFactModel.writeToParcel(parcel, i);
        }
        ComposerFundraiserForStoryData composerFundraiserForStoryData = this.A0J;
        if (composerFundraiserForStoryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerFundraiserForStoryData.writeToParcel(parcel, i);
        }
        ComposerGetGiftCardPurchasesModel composerGetGiftCardPurchasesModel = this.A0K;
        if (composerGetGiftCardPurchasesModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGetGiftCardPurchasesModel.writeToParcel(parcel, i);
        }
        ComposerGroupsChatsPostData composerGroupsChatsPostData = this.A0O;
        if (composerGroupsChatsPostData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGroupsChatsPostData.writeToParcel(parcel, i);
        }
        ComposerGroupsWelcomePostData composerGroupsWelcomePostData = this.A0P;
        if (composerGroupsWelcomePostData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerGroupsWelcomePostData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A1d ? 1 : 0);
        ComposerLocationInfo composerLocationInfo = this.A0S;
        if (composerLocationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLocationInfo.writeToParcel(parcel, i);
        }
        ComposerLookingForPlayersModel composerLookingForPlayersModel = this.A0T;
        if (composerLookingForPlayersModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLookingForPlayersModel.writeToParcel(parcel, i);
        }
        ComposerMajorLifeEventData composerMajorLifeEventData = this.A0U;
        if (composerMajorLifeEventData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerMajorLifeEventData.writeToParcel(parcel, i);
        }
        MarketingMessagesTopic marketingMessagesTopic = this.A0n;
        if (marketingMessagesTopic == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketingMessagesTopic.writeToParcel(parcel, i);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A17);
        while (A0b4.hasNext()) {
            ((ComposerMedia) A0b4.next()).writeToParcel(parcel, i);
        }
        ComposerOfferData composerOfferData = this.A0Y;
        if (composerOfferData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerOfferData.writeToParcel(parcel, i);
        }
        ComposerPageRecommendationModel composerPageRecommendationModel = this.A0Z;
        if (composerPageRecommendationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerPageRecommendationModel.writeToParcel(parcel, i);
        }
        ComposerPageTargetData composerPageTargetData = this.A0a;
        if (composerPageTargetData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerPageTargetData.writeToParcel(parcel, i);
        }
        ComposerPollData composerPollData = this.A0b;
        if (composerPollData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerPollData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1J);
        UAFPrivacyOption uAFPrivacyOption = this.A11;
        if (uAFPrivacyOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uAFPrivacyOption.writeToParcel(parcel, i);
        }
        C3o5.A0g(parcel, this.A1B);
        ComposerRichTextStyle composerRichTextStyle = this.A0w;
        if (composerRichTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerRichTextStyle.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1K);
        ComposerShareParams composerShareParams = this.A0c;
        if (composerShareParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerShareParams.writeToParcel(parcel, i);
        }
        PageUnit pageUnit = this.A0y;
        if (pageUnit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageUnit.writeToParcel(parcel, i);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A18);
        while (A0b5.hasNext()) {
            ((ComposerTaggedUser) A0b5.next()).writeToParcel(parcel, i);
        }
        DKH.A0y(parcel, this.A0z);
        ComposerTargetData composerTargetData = this.A0d;
        if (composerTargetData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerTargetData.writeToParcel(parcel, i);
        }
        DKH.A0y(parcel, this.A05);
        ThrowbackCard throwbackCard = this.A0t;
        if (throwbackCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            throwbackCard.writeToParcel(parcel, i);
        }
        ComposerVideoMeetupPostData composerVideoMeetupPostData = this.A0h;
        if (composerVideoMeetupPostData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerVideoMeetupPostData.writeToParcel(parcel, i);
        }
        InspirationConfiguration inspirationConfiguration = this.A0x;
        if (inspirationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationConfiguration.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1L);
        1Du A0b6 = 1BL.A0b(parcel, this.A19);
        while (A0b6.hasNext()) {
            ((ComposerInterceptionConfig) A0b6.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A1e ? 1 : 0);
        parcel.writeInt(this.A1f ? 1 : 0);
        parcel.writeInt(this.A1g ? 1 : 0);
        parcel.writeInt(this.A1h ? 1 : 0);
        parcel.writeInt(this.A1i ? 1 : 0);
        parcel.writeInt(this.A1j ? 1 : 0);
        parcel.writeInt(this.A1k ? 1 : 0);
        parcel.writeInt(this.A1l ? 1 : 0);
        parcel.writeInt(this.A1m ? 1 : 0);
        parcel.writeInt(this.A1n ? 1 : 0);
        parcel.writeInt(this.A1o ? 1 : 0);
        parcel.writeInt(this.A1p ? 1 : 0);
        parcel.writeInt(this.A1q ? 1 : 0);
        parcel.writeInt(this.A1r ? 1 : 0);
        ComposerLaunchLoggingParams composerLaunchLoggingParams = this.A0Q;
        if (composerLaunchLoggingParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLaunchLoggingParams.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1M);
        1BL.A13(parcel, this.A1N);
        ComposerLocalCommunityPostModel composerLocalCommunityPostModel = this.A0R;
        if (composerLocalCommunityPostModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLocalCommunityPostModel.writeToParcel(parcel, i);
        }
        ImmutableList immutableList2 = this.A1A;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                ((ComposerMedia) A0Y2.next()).writeToParcel(parcel, i);
            }
        }
        ComposerMemeRemixData composerMemeRemixData = this.A0V;
        if (composerMemeRemixData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerMemeRemixData.writeToParcel(parcel, i);
        }
        ComposerMemorialPostData composerMemorialPostData = this.A0W;
        if (composerMemorialPostData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerMemorialPostData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1O);
        MinutiaeObject minutiaeObject = this.A03;
        if (minutiaeObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minutiaeObject.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A1P);
        NewsFeedShareAnalyticsData newsFeedShareAnalyticsData = this.A0o;
        if (newsFeedShareAnalyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsFeedShareAnalyticsData.writeToParcel(parcel, i);
        }
        PlatformConfiguration platformConfiguration = this.A0p;
        if (platformConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformConfiguration.writeToParcel(parcel, i);
        }
        SerializedComposerPluginConfig serializedComposerPluginConfig = this.A0r;
        if (serializedComposerPluginConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serializedComposerPluginConfig.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1Q);
        ProductItemAttachment productItemAttachment = this.A0q;
        if (productItemAttachment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productItemAttachment.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A1s ? 1 : 0);
        parcel.writeInt(this.A1t ? 1 : 0);
        parcel.writeInt(this.A1u ? 1 : 0);
        parcel.writeInt(this.A1v ? 1 : 0);
        parcel.writeInt(this.A1w ? 1 : 0);
        parcel.writeInt(this.A1x ? 1 : 0);
        parcel.writeInt(this.A1y ? 1 : 0);
        parcel.writeInt(this.A1z ? 1 : 0);
        parcel.writeInt(this.A20 ? 1 : 0);
        SingleStackingMediaData singleStackingMediaData = this.A06;
        if (singleStackingMediaData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleStackingMediaData.writeToParcel(parcel, i);
        }
        InlineSproutsSurfaceInfo inlineSproutsSurfaceInfo = this.A0m;
        if (inlineSproutsSurfaceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inlineSproutsSurfaceInfo.writeToParcel(parcel, i);
        }
        StoryDestinationConfiguration storyDestinationConfiguration = this.A01;
        if (storyDestinationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyDestinationConfiguration.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1R);
        parcel.writeString(this.A1S);
        ComposerThreedInfo composerThreedInfo = this.A0f;
        if (composerThreedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerThreedInfo.writeToParcel(parcel, i);
        }
        ThrowbackCameraRollMediaInfo throwbackCameraRollMediaInfo = this.A0s;
        if (throwbackCameraRollMediaInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            throwbackCameraRollMediaInfo.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1T);
        WorkDraftForData workDraftForData = this.A0u;
        if (workDraftForData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            workDraftForData.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A1U);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
