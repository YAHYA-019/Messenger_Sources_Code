package com.facebook.ipc.inspiration.config;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.7zN;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C24b;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKF;
import X.DKG;
import X.DKH;
import X.ELz;
import X.EPQ;
import X.EQm;
import X.EQv;
import X.EnumC3476Meu;
import X.EnumC3481Mez;
import X.EnumC3482Mf0;
import X.EnumC3484Mf2;
import X.EnumC3488Mf7;
import X.FJ8;
import X.MRl;
import X.MfV;
import X.MhV;
import X.N2D;
import X.N4j;
import X.NAs;
import X.Qoc;
import X.Qp5;
import X.QqK;
import X.Qus;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.composer.media.ComposerMedia;
import com.facebook.composer.stories.camerarollinspiration.suggestions.model.SuggestionModel;
import com.facebook.composer.stories.camerarollinspiration.tryit.models.TryItSurfaceContext;
import com.facebook.events.story.ipc.EventsInspirationConfiguration;
import com.facebook.goodwill.ipc.GoodwillInspirationComposerLoggingParams;
import com.facebook.graphql.enums.GraphQLXFBCameraRollDataAccess;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.groups.share.api.config.GroupInspirationConfiguration;
import com.facebook.inspiration.capture.multicapture.remix.model.InspirationRemixData;
import com.facebook.inspiration.capture.multicapture.remix.model.InspirationRemixableVideoAssetMetaData;
import com.facebook.inspiration.model.InspirationEffect;
import com.facebook.inspiration.model.InspirationMultiCaptureState;
import com.facebook.inspiration.model.InspirationPostAction;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.inspiration.model.InspirationVideoSegment;
import com.facebook.inspiration.model.InspirationVideoTemplate;
import com.facebook.inspiration.model.RemoteAutoCreatedReelMediaItem;
import com.facebook.inspiration.model.SuggestionComponentModel;
import com.facebook.inspiration.model.movableoverlay.InspirationInitialTextToolTextParams;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerParams;
import com.facebook.inspiration.reshare.ipc.ReshareToStoryMetadata;
import com.facebook.ipc.composer.model.RMSRecommendationData;
import com.facebook.ipc.facecast.config.FacecastConfiguration;
import com.facebook.ipc.inspiration.config.memories.InspirationThenAndNowModel;
import com.facebook.ipc.inspiration.config.platform.PlatformCameraShareConfiguration;
import com.facebook.ipc.inspiration.config.rms.InspirationRMSPlaceholderModel;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: InspirationConfiguration.class */
public final class InspirationConfiguration implements Parcelable, NAs {
    public static volatile EnumC3488Mf7 A4F;
    public static volatile ELz A4G;
    public static volatile MfV A4H;
    public static volatile InspirationPostAction A4I;
    public static volatile InspirationVideoEditingData A4J;
    public static volatile Qp5 A4K;
    public static volatile EnumC3481Mez A4L;
    public static volatile EnumC3476Meu A4M;
    public static volatile InspirationStartReason A4N;
    public static volatile EnumC3482Mf0 A4O;
    public static volatile ImmutableList A4P;
    public static volatile ImmutableList A4Q;
    public static final Parcelable.Creator CREATOR = new CSR(29);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final SuggestionModel A0A;
    public final TryItSurfaceContext A0B;
    public final EventsInspirationConfiguration A0C;
    public final GoodwillInspirationComposerLoggingParams A0D;
    public final GraphQLXFBCameraRollDataAccess A0E;
    public final GraphQLTextWithEntities A0F;
    public final GraphQLTextWithEntities A0G;
    public final GroupInspirationConfiguration A0H;
    public final EnumC3488Mf7 A0I;
    public final EnumC3488Mf7 A0J;
    public final InspirationRemixData A0K;
    public final ELz A0L;
    public final MfV A0M;
    public final InspirationMultiCaptureState A0N;
    public final InspirationPostAction A0O;
    public final InspirationVideoEditingData A0P;
    public final InspirationVideoTemplate A0Q;
    public final SuggestionComponentModel A0R;
    public final InspirationInitialTextToolTextParams A0S;
    public final InspirationStickerParams A0T;
    public final ReshareToStoryMetadata A0U;
    public final Qp5 A0V;
    public final RMSRecommendationData A0W;
    public final EPQ A0X;
    public final FacecastConfiguration A0Y;
    public final Qoc A0Z;
    public final InspirationArAdsConfiguration A0a;
    public final InspirationCameraConfiguration A0b;
    public final EnumC3481Mez A0c;
    public final EnumC3484Mf2 A0d;
    public final EnumC3476Meu A0e;
    public final InspirationDraftTrackingInfo A0f;
    public final InspirationMultiCaptureReshootConfiguration A0g;
    public final InspirationNUXConfiguration A0h;
    public final InspirationStartReason A0i;
    public final EnumC3482Mf0 A0j;
    public final InspirationStorySourceMetadata A0k;
    public final InspirationThenAndNowModel A0l;
    public final PlatformCameraShareConfiguration A0m;
    public final InspirationRMSPlaceholderModel A0n;
    public final ImmutableList A0o;
    public final ImmutableList A0p;
    public final ImmutableList A0q;
    public final ImmutableList A0r;
    public final ImmutableList A0s;
    public final ImmutableList A0t;
    public final ImmutableList A0u;
    public final ImmutableList A0v;
    public final ImmutableList A0w;
    public final ImmutableList A0x;
    public final ImmutableList A0y;
    public final ImmutableList A0z;
    public final ImmutableList A10;
    public final ImmutableMap A11;
    public final Float A12;
    public final Integer A13;
    public final Long A14;
    public final String A15;
    public final String A16;
    public final String A17;
    public final String A18;
    public final String A19;
    public final String A1A;
    public final String A1B;
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
    public final String A1U;
    public final String A1V;
    public final String A1W;
    public final String A1X;
    public final String A1Y;
    public final String A1Z;
    public final String A1a;
    public final String A1b;
    public final String A1c;
    public final String A1d;
    public final String A1e;
    public final String A1f;
    public final String A1g;
    public final String A1h;
    public final String A1i;
    public final String A1j;
    public final String A1k;
    public final Set A1l;
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
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final boolean A2B;
    public final boolean A2C;
    public final boolean A2D;
    public final boolean A2E;
    public final boolean A2F;
    public final boolean A2G;
    public final boolean A2H;
    public final boolean A2I;
    public final boolean A2J;
    public final boolean A2K;
    public final boolean A2L;
    public final boolean A2M;
    public final boolean A2N;
    public final boolean A2O;
    public final boolean A2P;
    public final boolean A2Q;
    public final boolean A2R;
    public final boolean A2S;
    public final boolean A2T;
    public final boolean A2U;
    public final boolean A2V;
    public final boolean A2W;
    public final boolean A2X;
    public final boolean A2Y;
    public final boolean A2Z;
    public final boolean A2a;
    public final boolean A2b;
    public final boolean A2c;
    public final boolean A2d;
    public final boolean A2e;
    public final boolean A2f;
    public final boolean A2g;
    public final boolean A2h;
    public final boolean A2i;
    public final boolean A2j;
    public final boolean A2k;
    public final boolean A2l;
    public final boolean A2m;
    public final boolean A2n;
    public final boolean A2o;
    public final boolean A2p;
    public final boolean A2q;
    public final boolean A2r;
    public final boolean A2s;
    public final boolean A2t;
    public final boolean A2u;
    public final boolean A2v;
    public final boolean A2w;
    public final boolean A2x;
    public final boolean A2y;
    public final boolean A2z;
    public final boolean A30;
    public final boolean A31;
    public final boolean A32;
    public final boolean A33;
    public final boolean A34;
    public final boolean A35;
    public final boolean A36;
    public final boolean A37;
    public final boolean A38;
    public final boolean A39;
    public final boolean A3A;
    public final boolean A3B;
    public final boolean A3C;
    public final boolean A3D;
    public final boolean A3E;
    public final boolean A3F;
    public final boolean A3G;
    public final boolean A3H;
    public final boolean A3I;
    public final boolean A3J;
    public final boolean A3K;
    public final boolean A3L;
    public final boolean A3M;
    public final boolean A3N;
    public final boolean A3O;
    public final boolean A3P;
    public final boolean A3Q;
    public final boolean A3R;
    public final boolean A3S;
    public final boolean A3T;
    public final boolean A3U;
    public final boolean A3V;
    public final boolean A3W;
    public final boolean A3X;
    public final boolean A3Y;
    public final boolean A3Z;
    public final boolean A3a;
    public final boolean A3b;
    public final boolean A3c;
    public final boolean A3d;
    public final boolean A3e;
    public final boolean A3f;
    public final boolean A3g;
    public final boolean A3h;
    public final boolean A3i;
    public final boolean A3j;
    public final boolean A3k;
    public final boolean A3l;
    public final boolean A3m;
    public final boolean A3n;
    public final boolean A3o;
    public final boolean A3p;
    public final boolean A3q;
    public final boolean A3r;
    public final boolean A3s;
    public final boolean A3t;
    public final boolean A3u;
    public final boolean A3v;
    public final boolean A3w;
    public final boolean A3x;
    public final boolean A3y;
    public final boolean A3z;
    public final boolean A40;
    public final boolean A41;
    public final boolean A42;
    public final boolean A43;
    public final boolean A44;
    public final boolean A45;
    public final boolean A46;
    public final boolean A47;
    public final boolean A48;
    public final boolean A49;
    public final boolean A4A;
    public final boolean A4B;
    public final boolean A4C;
    public final boolean A4D;
    public final boolean A4E;

    /* loaded from: InspirationConfiguration$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            N4j n4j = new N4j();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2088029621:
                                if (A1C.equals("should_override_render_animate_mask_effects_as_static")) {
                                    n4j.A3v = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2059483480:
                                if (A1C.equals("playlist_id")) {
                                    n4j.A1W = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2052566462:
                                if (A1C.equals("is_avatar_story_sticker_mode_enabled")) {
                                    n4j.A23 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2049821076:
                                if (A1C.equals("should_disable_search_tool")) {
                                    n4j.A3c = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2042105081:
                                if (A1C.equals("initial_effects")) {
                                    n4j.A0G(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationEffect.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2036844657:
                                if (A1C.equals("ar_game_payload")) {
                                    n4j.A18 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -2015390141:
                                if (A1C.equals("captured_media")) {
                                    n4j.A0F(AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerMedia.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1995111224:
                                if (A1C.equals("should_finish_call_site_after_posting")) {
                                    n4j.A3l = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1991407759:
                                if (A1C.equals("inspiration_navigation_button_type")) {
                                    n4j.A13 = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1981187702:
                                if (A1C.equals("reshare_to_story_metadata")) {
                                    n4j.A0U = (ReshareToStoryMetadata) AbstractC11224vw.A02(abstractC01033pi, c27t, ReshareToStoryMetadata.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1961176213:
                                if (A1C.equals("is_video_trimming_disabled")) {
                                    n4j.A3J = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1951148928:
                                if (A1C.equals("is_name_sticker_enabled")) {
                                    n4j.A2k = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1937323901:
                                if (A1C.equals("artist_name")) {
                                    n4j.A1B = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1927255585:
                                if (A1C.equals("is_music_picker_enabled")) {
                                    n4j.A2f = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1920514990:
                                if (A1C.equals("is_footer_enabled")) {
                                    n4j.A2G = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1905698766:
                                if (A1C.equals("is_magic_montage_enabled")) {
                                    n4j.A2Z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1897977327:
                                if (A1C.equals("is_ueg_vertical_toolbar_enabled")) {
                                    n4j.A3F = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1887496520:
                                if (A1C.equals("is_pre_capture_step_enabled")) {
                                    n4j.A2r = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1880724011:
                                if (A1C.equals("is_r_m_s_collage_enabled")) {
                                    n4j.A2v = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1879727239:
                                if (A1C.equals("feed_post_id")) {
                                    n4j.A1K = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1878172177:
                                if (A1C.equals("initial_backdrop_sticker")) {
                                    n4j.A0T = (InspirationStickerParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStickerParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1844502936:
                                if (A1C.equals("is_dynamic_toolbar_enabled")) {
                                    n4j.A2C = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1842436172:
                                if (A1C.equals("trash_unification_support_enabled_entry_point")) {
                                    EnumC3476Meu enumC3476Meu = (EnumC3476Meu) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3476Meu.class);
                                    n4j.A0e = enumC3476Meu;
                                    str = "trashUnificationSupportEnabledEntryPoint";
                                    C1pq.A08(str, enumC3476Meu);
                                    N4j.A07(n4j, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1836779549:
                                if (A1C.equals("should_disable_mentions_in_text_tool")) {
                                    n4j.A3Y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1832452793:
                                if (A1C.equals("should_disable_text_prompt_in_stories_editor")) {
                                    n4j.A3e = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1795799370:
                                if (A1C.equals("is_sound_tool_button_enabled")) {
                                    n4j.A34 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1765153793:
                                if (A1C.equals("initial_music_asset_id")) {
                                    n4j.A1R = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1743221103:
                                if (A1C.equals("reel_editor_session_id")) {
                                    n4j.A1c = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1733544084:
                                if (A1C.equals("should_return_to_picker_from_home_base_when_discard")) {
                                    n4j.A3w = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1727587173:
                                if (A1C.equals("is_precapture_vertical_toolbar_enabled")) {
                                    n4j.A2t = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1723731798:
                                if (A1C.equals("is_r_m_s_use_case_enabled")) {
                                    n4j.A2w = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1718266541:
                                if (A1C.equals("default_gesture_layout_visibility")) {
                                    n4j.A01 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1715756219:
                                if (A1C.equals("should_navigate_to_news_feed_after_share")) {
                                    n4j.A3u = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1693074601:
                                if (A1C.equals("is_stories_imagine_enabled")) {
                                    n4j.A37 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1655934363:
                                if (A1C.equals("share_button_label_text")) {
                                    n4j.A1f = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1651418066:
                                if (A1C.equals("enable_new_effects_in_live")) {
                                    n4j.A1t = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1647298572:
                                if (A1C.equals("inspiration_story_source_metadata")) {
                                    n4j.A0k = (InspirationStorySourceMetadata) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStorySourceMetadata.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1636547810:
                                if (A1C.equals("initial_backdrop_uri")) {
                                    n4j.A1O = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1635694238:
                                if (A1C.equals("preselected_recipient_id")) {
                                    n4j.A1Y = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1635407973:
                                if (A1C.equals("is_text_tool_mention_disabled")) {
                                    n4j.A3A = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1626226103:
                                if (A1C.equals("is_photo_import_enabled")) {
                                    n4j.A2m = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1623320691:
                                if (A1C.equals("default_open_tray")) {
                                    n4j.A0I = (EnumC3488Mf7) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3488Mf7.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1620578813:
                                if (A1C.equals("camera_button_tooltip_title_text")) {
                                    n4j.A1D = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1615862324:
                                if (A1C.equals("is_auto_created_reel")) {
                                    n4j.A22 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1609370909:
                                if (A1C.equals("is_attributed_music")) {
                                    n4j.A1x = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1576470064:
                                if (A1C.equals("is_doodle_enabled")) {
                                    n4j.A2B = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1565435342:
                                if (A1C.equals("should_show_hashtag_is_applied_prompt_in_camera")) {
                                    n4j.A41 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1559386018:
                                if (A1C.equals("is_moments")) {
                                    n4j.A2a = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1545463088:
                                if (A1C.equals("is_from_homebase")) {
                                    n4j.A2J = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1533247231:
                                if (A1C.equals("is_vertical_toolbar_label_fade_enabled")) {
                                    n4j.A3I = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1519388509:
                                if (A1C.equals("should_disable_close_friends_story_buttons")) {
                                    n4j.A3T = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1487818092:
                                if (A1C.equals("tall_screen_support_enabled_entry_point")) {
                                    n4j.A0d = (EnumC3484Mf2) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3484Mf2.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1465196113:
                                if (A1C.equals("is_fundraising_sticker_enabled")) {
                                    n4j.A2Q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1446124444:
                                if (A1C.equals("is_session_saver_disabled")) {
                                    n4j.A33 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1428443576:
                                if (A1C.equals("recommendation_media_hint")) {
                                    n4j.A1b = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1424131476:
                                if (A1C.equals("should_enable_story_button")) {
                                    n4j.A3i = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1411534108:
                                if (A1C.equals("should_show_playlist_is_applied_prompt_in_camera")) {
                                    n4j.A46 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1406325327:
                                if (A1C.equals("should_disable_ai_text_suggestions")) {
                                    n4j.A3R = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1393434894:
                                if (A1C.equals("is_cross_platform_mention_sticker_enabled")) {
                                    n4j.A2A = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1378158070:
                                if (A1C.equals("is_giphy_sticker_enabled")) {
                                    n4j.A2R = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1358226949:
                                if (A1C.equals("is_from_sound_sync_mid_card")) {
                                    n4j.A2N = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1355433341:
                                if (A1C.equals("should_disable_music_stickers_for_photos")) {
                                    n4j.A3Z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1295698572:
                                if (A1C.equals("should_create_reel_from_vod_fragment_after_timeline_editor")) {
                                    n4j.A3P = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1258197829:
                                if (A1C.equals("events_inspiration_configuration")) {
                                    n4j.A0C = (EventsInspirationConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, EventsInspirationConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1252204661:
                                if (A1C.equals("is_from_notification")) {
                                    n4j.A2L = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1243375270:
                                if (A1C.equals("is_audio_browser_try_on_enabled")) {
                                    n4j.A1y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1233601014:
                                if (A1C.equals("required_style_categories")) {
                                    n4j.A0J(MRl.A0G(abstractC01033pi, c27t));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1228328664:
                                if (A1C.equals("allows_people_tagging_mode")) {
                                    n4j.A1n = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1219127316:
                                if (A1C.equals("default_effects_tray_category")) {
                                    n4j.A1I = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1196100506:
                                if (A1C.equals("should_cta_use_swipe_up_link")) {
                                    n4j.A3Q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1191041620:
                                if (A1C.equals("is_reels_gallery_multi_select_enabled")) {
                                    n4j.A2z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1187973399:
                                if (A1C.equals("notif_type")) {
                                    n4j.A1T = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1149043378:
                                if (A1C.equals("inspiration_ar_ads_configuration")) {
                                    n4j.A0a = (InspirationArAdsConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationArAdsConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1134900197:
                                if (A1C.equals("previously_selected_media")) {
                                    ImmutableMap A0H = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), Integer.class);
                                    n4j.A11 = A0H;
                                    C1pq.A08("previouslySelectedMedia", A0H);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1132860507:
                                if (A1C.equals("min_extra_duration_ms_for_trimming_eligibility")) {
                                    n4j.A08 = abstractC01033pi.A1B();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1128659975:
                                if (A1C.equals("is_landscape_orientation_enabled")) {
                                    n4j.A2W = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1103688630:
                                if (A1C.equals("is_ueg_caption_button_enabled")) {
                                    n4j.A3D = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1096841232:
                                if (A1C.equals("is_unified_audio_controls_supported")) {
                                    n4j.A3G = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1066943904:
                                if (A1C.equals("is_auto_add_music_for_single_clip_enabled")) {
                                    n4j.A20 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1062312915:
                                if (A1C.equals("should_disable_i_g_offending_stickers_warning")) {
                                    n4j.A3X = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1057593495:
                                if (A1C.equals("suggested_song_id")) {
                                    n4j.A1g = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1053815434:
                                if (A1C.equals("then_and_now_model")) {
                                    n4j.A0l = (InspirationThenAndNowModel) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationThenAndNowModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -986486022:
                                if (A1C.equals("should_disable_share_sheet_reset_on_resume")) {
                                    n4j.A3d = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -968810806:
                                if (A1C.equals("should_show_send_forward_variant")) {
                                    n4j.A48 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -964224408:
                                if (A1C.equals("initial_composer_session_id")) {
                                    n4j.A0L(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -959482019:
                                if (A1C.equals("should_launch_vod_composer_after_timeline_editor")) {
                                    n4j.A3p = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -939721636:
                                if (A1C.equals("is_music_picker_video_icon_disabled")) {
                                    n4j.A2g = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -934675455:
                                if (A1C.equals("is_from_feed_composer")) {
                                    n4j.A2I = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -923338906:
                                if (A1C.equals("is_music_first_sound_sync_flow_enabled")) {
                                    n4j.A2e = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -902603187:
                                if (A1C.equals("is_immersive_reels_reshare")) {
                                    n4j.A2U = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -897916220:
                                if (A1C.equals("open_sound_sync_action_type")) {
                                    Qp5 qp5 = (Qp5) AbstractC11224vw.A02(abstractC01033pi, c27t, Qp5.class);
                                    n4j.A0V = qp5;
                                    str = "openSoundSyncActionType";
                                    C1pq.A08(str, qp5);
                                    N4j.A07(n4j, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -853736151:
                                if (A1C.equals("should_enable_visual_trimmer")) {
                                    n4j.A3j = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -852743426:
                                if (A1C.equals("is_camera_shortcut_dialog_enabled")) {
                                    n4j.A27 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -847701647:
                                if (A1C.equals("preselected_share_to_channel_thread_id")) {
                                    n4j.A1Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -835968619:
                                if (A1C.equals("ar_game_camera_type")) {
                                    n4j.A16 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -816638833:
                                if (A1C.equals("ar_game_i_d")) {
                                    n4j.A17 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -809683138:
                                if (A1C.equals("vpv_id")) {
                                    n4j.A1k = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -785253473:
                                if (A1C.equals("camera_button_tooltip_description_text")) {
                                    n4j.A1C = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -784855684:
                                if (A1C.equals("ready_made_suggestion_model")) {
                                    n4j.A0A = (SuggestionModel) AbstractC11224vw.A02(abstractC01033pi, c27t, SuggestionModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -770811338:
                                if (A1C.equals("is_v_t_s_animations_effects_supported")) {
                                    n4j.A3H = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -708101509:
                                if (A1C.equals("is_pre_capture_bug_reporting_enabled")) {
                                    n4j.A2q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -699258711:
                                if (A1C.equals("is_music_tool_enabled")) {
                                    n4j.A2j = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -679501158:
                                if (A1C.equals("initial_form_type")) {
                                    n4j.A09((ELz) AbstractC11224vw.A02(abstractC01033pi, c27t, ELz.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -678166542:
                                if (A1C.equals("enable_camera_movable_overlays")) {
                                    n4j.A1s = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -675650337:
                                if (A1C.equals("is_editable_stickers_disabled")) {
                                    n4j.A2D = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -659335519:
                                if (A1C.equals("is_timed_element_enabled")) {
                                    n4j.A3B = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -644634608:
                                if (A1C.equals("initial_video_editing_data")) {
                                    n4j.A0C((InspirationVideoEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVideoEditingData.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -636436083:
                                if (A1C.equals("disable_canvas_letterboxing")) {
                                    n4j.A1q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -624365547:
                                if (A1C.equals("is_from_stories_draft")) {
                                    n4j.A2O = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -602118432:
                                if (A1C.equals("goodwill_inspiration_composer_logging_params")) {
                                    n4j.A0D = (GoodwillInspirationComposerLoggingParams) AbstractC11224vw.A02(abstractC01033pi, c27t, GoodwillInspirationComposerLoggingParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -590080183:
                                if (A1C.equals("allows_box_crop_mode")) {
                                    n4j.A1m = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -548385864:
                                if (A1C.equals("is_reaction_reels")) {
                                    n4j.A2x = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -539238044:
                                if (A1C.equals("search_text")) {
                                    n4j.A1e = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -536851384:
                                if (A1C.equals("should_select_newsfeed")) {
                                    n4j.A3x = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -518931170:
                                if (A1C.equals("ar_game_promise_id")) {
                                    n4j.A19 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -517642226:
                                if (A1C.equals("should_share_to_story_only")) {
                                    n4j.A3z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -500533791:
                                if (A1C.equals("initial_text_for_structured_composer")) {
                                    n4j.A0G = (GraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -479954332:
                                if (A1C.equals("should_enable_camera_settings_button")) {
                                    n4j.A3h = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -470742285:
                                if (A1C.equals("progress_bar_style")) {
                                    n4j.A04 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -462455510:
                                if (A1C.equals("is_sticker_enabled")) {
                                    n4j.A35 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -455972994:
                                if (A1C.equals("is_stories_recap")) {
                                    n4j.A38 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -429865933:
                                if (A1C.equals("should_create_memories_polaroid_sticker")) {
                                    n4j.A3O = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -384449927:
                                if (A1C.equals("should_show_music_digest_sections")) {
                                    n4j.A43 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -375084143:
                                if (A1C.equals("inspiration_camera_configuration")) {
                                    n4j.A0b = (InspirationCameraConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationCameraConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -345699824:
                                if (A1C.equals("camera_post_context_source")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n4j.A1E = A03;
                                    C1pq.A08("cameraPostContextSource", A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -331746686:
                                if (A1C.equals("is_multimedia_enabled")) {
                                    n4j.A2c = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -318272732:
                                if (A1C.equals("is_text_enabled")) {
                                    n4j.A39 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -285664184:
                                if (A1C.equals("camera_roll_data_privacy_access")) {
                                    n4j.A0E = (GraphQLXFBCameraRollDataAccess) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBCameraRollDataAccess.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -282628298:
                                if (A1C.equals("was_delayed_to_fetch_consent_state")) {
                                    n4j.A4E = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -268454720:
                                if (A1C.equals("challenge_prompt")) {
                                    n4j.A1G = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -176959269:
                                if (A1C.equals("selected_attribution")) {
                                    n4j.A10 = AbstractC11224vw.A00(abstractC01033pi, c27t, EQm.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -148416701:
                                if (A1C.equals("should_inject_style_background_media")) {
                                    n4j.A3o = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -144932733:
                                if (A1C.equals("should_disable_effect_switching")) {
                                    n4j.A3V = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -123808072:
                                if (A1C.equals("default_open_tray_in_post_capture_when_other_trays_are_dismissed")) {
                                    n4j.A08((EnumC3488Mf7) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3488Mf7.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -86802628:
                                if (A1C.equals("is_from_story_viewer")) {
                                    n4j.A2P = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -64636662:
                                if (A1C.equals("should_use_birthday_spark_layout")) {
                                    n4j.A4B = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -62422765:
                                if (A1C.equals("facecast_configuration")) {
                                    n4j.A0Y = (FacecastConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, FacecastConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -59551800:
                                if (A1C.equals("platform_camera_share_configuration")) {
                                    n4j.A0m = (PlatformCameraShareConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, PlatformCameraShareConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -36051548:
                                if (A1C.equals("pre_applied_effects")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationEffect.class);
                                    n4j.A0x = A00;
                                    C1pq.A08("preAppliedEffects", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -25593663:
                                if (A1C.equals(1BJ.A00(57))) {
                                    n4j.A0E((InspirationStartReason) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStartReason.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 24020166:
                                if (A1C.equals("background_placeholder_color")) {
                                    n4j.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 32914938:
                                if (A1C.equals("is_capture_only")) {
                                    n4j.A28 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 38090285:
                                if (A1C.equals("should_disable_music_stickers_for_suggestions")) {
                                    n4j.A3a = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 40696373:
                                if (A1C.equals("is_photo_preview_disabled")) {
                                    n4j.A2n = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 68250316:
                                if (A1C.equals("is_from_camera_capture")) {
                                    n4j.A2H = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 96858564:
                                if (A1C.equals("is_camera_roll_enabled")) {
                                    n4j.A26 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 100376876:
                                if (A1C.equals("suggestion_component_model")) {
                                    n4j.A0R = (SuggestionComponentModel) AbstractC11224vw.A02(abstractC01033pi, c27t, SuggestionComponentModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 112359031:
                                if (A1C.equals("challenge_id")) {
                                    n4j.A1F = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 129543048:
                                if (A1C.equals("instagram_cross_posting_state")) {
                                    n4j.A0D((EnumC3481Mez) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3481Mez.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 132905395:
                                if (A1C.equals("inspiration_form_types")) {
                                    n4j.A0I(AbstractC11224vw.A00(abstractC01033pi, c27t, ELz.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 197061157:
                                if (A1C.equals("is_auto_attributed_licensed_music")) {
                                    n4j.A21 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 203591619:
                                if (A1C.equals("is_launched_from_camera_shortcut")) {
                                    n4j.A2X = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 255015490:
                                if (A1C.equals("starting_mode")) {
                                    EnumC3482Mf0 enumC3482Mf0 = (EnumC3482Mf0) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3482Mf0.class);
                                    n4j.A0j = enumC3482Mf0;
                                    str = "startingMode";
                                    C1pq.A08(str, enumC3482Mf0);
                                    N4j.A07(n4j, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 262029785:
                                if (A1C.equals("is_multi_capture_timeline_editor_enabled")) {
                                    n4j.A2b = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 262094888:
                                if (A1C.equals("close_camera_transition")) {
                                    n4j.A0Z = (Qoc) AbstractC11224vw.A02(abstractC01033pi, c27t, Qoc.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 263344827:
                                if (A1C.equals("initial_remix_data")) {
                                    n4j.A0K = (InspirationRemixData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationRemixData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 273590496:
                                if (A1C.equals("inspiration_post_action")) {
                                    n4j.A0B((InspirationPostAction) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPostAction.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 316997494:
                                if (A1C.equals("should_show_ar_scenes_in_background_selector")) {
                                    n4j.A40 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 318942489:
                                if (A1C.equals("max_video_duration_ms_override")) {
                                    n4j.A14 = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 335461072:
                                if (A1C.equals("is_music_sticker_enabled")) {
                                    n4j.A2h = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 388706230:
                                if (A1C.equals("is_launched_from_feed_re_share_flow")) {
                                    n4j.A2Y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 390435437:
                                if (A1C.equals("is_sticker_prefetch_disabled")) {
                                    n4j.A36 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 410708767:
                                if (A1C.equals("is_green_screen_enabled")) {
                                    n4j.A2S = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 459465032:
                                if (A1C.equals("initial_text_for_text_tool_params")) {
                                    n4j.A0S = (InspirationInitialTextToolTextParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationInitialTextToolTextParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 468633549:
                                if (A1C.equals("reasons_failed")) {
                                    n4j.A1a = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 478469961:
                                if (A1C.equals("rms_recommendation_data")) {
                                    n4j.A0W = (RMSRecommendationData) AbstractC11224vw.A02(abstractC01033pi, c27t, RMSRecommendationData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 489726986:
                                if (A1C.equals("is_product_sticker_enabled_for_page")) {
                                    n4j.A2u = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 510736563:
                                if (A1C.equals("is_save_button_enabled_for_camera_captures")) {
                                    n4j.A32 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 531170342:
                                if (A1C.equals("is_c_f_bottom_sheet_disabled")) {
                                    n4j.A25 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 554889940:
                                if (A1C.equals("target_audio_library_product")) {
                                    n4j.A1h = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 563435503:
                                if (A1C.equals("is_effects_enabled")) {
                                    n4j.A2E = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 571184389:
                                if (A1C.equals("selected_media_item_index")) {
                                    n4j.A05 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 574519571:
                                if (A1C.equals("artist_id")) {
                                    n4j.A1A = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 604168392:
                                if (A1C.equals("nux_configuration")) {
                                    n4j.A0h = (InspirationNUXConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationNUXConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 616452088:
                                if (A1C.equals("initial_additional_remixable_video_asset_meta_data")) {
                                    n4j.A0q = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationRemixableVideoAssetMetaData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 618308631:
                                if (A1C.equals("target_linked_video_id")) {
                                    n4j.A1i = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 629051211:
                                if (A1C.equals("min_capture_duration_ms")) {
                                    n4j.A07 = abstractC01033pi.A1B();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 678319539:
                                if (A1C.equals("inspiration_video_template")) {
                                    n4j.A0Q = (InspirationVideoTemplate) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVideoTemplate.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 708948710:
                                if (A1C.equals("should_display_camera_roll_effect_tooltip")) {
                                    n4j.A3f = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 783180635:
                                if (A1C.equals("should_disable_reels_drafts")) {
                                    n4j.A3b = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 786700730:
                                if (A1C.equals("initial_audio_source_type")) {
                                    n4j.A02 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 806329176:
                                if (A1C.equals("photos_to_reels_originating_media_id")) {
                                    n4j.A1U = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 816448728:
                                if (A1C.equals("playlist_name")) {
                                    n4j.A1X = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 828522909:
                                if (A1C.equals("is_ueg_mute_button_enabled")) {
                                    n4j.A3E = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 849538109:
                                if (A1C.equals("is_background_selector_enabled")) {
                                    n4j.A24 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 851869507:
                                if (A1C.equals("is_voice_over_tool_enabled")) {
                                    n4j.A3L = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 927395489:
                                if (A1C.equals("group_inspiration_configuration")) {
                                    n4j.A0H = (GroupInspirationConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, GroupInspirationConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 962261678:
                                if (A1C.equals("initial_magic_mod_prompt")) {
                                    n4j.A1Q = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 973249636:
                                if (A1C.equals("should_show_only_preselected_effects")) {
                                    n4j.A45 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1002005952:
                                if (A1C.equals("is_pre_capture_video_speed_tool_enabled")) {
                                    n4j.A2s = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1028618290:
                                if (A1C.equals("disable_s_s_i_m_calculation")) {
                                    n4j.A1r = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1052876074:
                                if (A1C.equals("should_show_music_survey")) {
                                    n4j.A44 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1060619483:
                                if (A1C.equals("is_from_reels_draft")) {
                                    n4j.A2M = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1069403779:
                                if (A1C.equals("should_disable_camera_roll_settings_button")) {
                                    n4j.A3S = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1072120879:
                                if (A1C.equals("inspiration_multi_capture_reshoot_configuration")) {
                                    n4j.A0g = (InspirationMultiCaptureReshootConfiguration) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMultiCaptureReshootConfiguration.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1079375640:
                                if (A1C.equals("draft_tracking_info")) {
                                    n4j.A0f = (InspirationDraftTrackingInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationDraftTrackingInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1087171544:
                                if (A1C.equals("should_show_scenes_in_background_selector")) {
                                    n4j.A47 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1125044929:
                                if (A1C.equals("messaging_entry_point_data")) {
                                    n4j.A1S = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1138506662:
                                if (A1C.equals("is_inline_effects_tray_enabled")) {
                                    n4j.A2V = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1144618322:
                                if (A1C.equals("should_music_selection_auto_start_capture")) {
                                    n4j.A3t = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1145558980:
                                if (A1C.equals("should_use_full_canvas")) {
                                    n4j.A4C = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1185038364:
                                if (A1C.equals("is_green_screen_enabled_for_mimicry")) {
                                    n4j.A2T = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1187116557:
                                if (A1C.equals("try_it_surface_context")) {
                                    n4j.A0B = (TryItSurfaceContext) AbstractC11224vw.A02(abstractC01033pi, c27t, TryItSurfaceContext.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1232589234:
                                if (A1C.equals("is_post_capture_suggestion_sticker_tray_enabled")) {
                                    n4j.A2p = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1265512904:
                                if (A1C.equals("is_from_homebase_sprout")) {
                                    n4j.A2K = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1271680279:
                                if (A1C.equals("override_enable_o_p_s_sends")) {
                                    n4j.A3N = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1330115454:
                                if (A1C.equals("hide_reels_branding")) {
                                    n4j.A1u = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1349370457:
                                if (A1C.equals("customized_background_uri")) {
                                    n4j.A1H = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1355899748:
                                if (A1C.equals("max_trimming_duration_ms")) {
                                    n4j.A06 = abstractC01033pi.A1B();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1364608805:
                                if (A1C.equals("is_ar_game_effect")) {
                                    n4j.A1v = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1429259214:
                                if (A1C.equals("remote_auto_created_reel_media_items")) {
                                    n4j.A0y = AbstractC11224vw.A00(abstractC01033pi, c27t, RemoteAutoCreatedReelMediaItem.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1444149022:
                                if (A1C.equals("hashtag_name")) {
                                    n4j.A1M = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1480358956:
                                if (A1C.equals("is_effects_unification_camera_layout_in_shorts_enabled")) {
                                    n4j.A2F = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1486108624:
                                if (A1C.equals("is_virtual_video_player_enabled")) {
                                    n4j.A3K = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1528128831:
                                if (A1C.equals("initial_video_segments")) {
                                    n4j.A0H(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationVideoSegment.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1532414354:
                                if (A1C.equals("initial_text_for_share_sheet")) {
                                    n4j.A0F = (GraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1549850963:
                                if (A1C.equals("is_assistive_audio_enabled")) {
                                    n4j.A1w = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1570783455:
                                if (A1C.equals("inspiration_template_suggestions")) {
                                    n4j.A0v = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationVideoTemplate.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1581800438:
                                if (A1C.equals("should_log_f_c_r")) {
                                    n4j.A3r = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1585335408:
                                if (A1C.equals("initial_format_mode")) {
                                    n4j.A0A((MfV) AbstractC11224vw.A02(abstractC01033pi, c27t, MfV.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1585914088:
                                if (A1C.equals("should_skip_media_validation")) {
                                    n4j.A49 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1592562286:
                                if (A1C.equals("hashtag_id")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    n4j.A1L = A032;
                                    C1pq.A08("hashtagId", A032);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1597648742:
                                if (A1C.equals("initial_music_start_time_ms")) {
                                    n4j.A03 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1607111254:
                                if (A1C.equals("should_show_mini_preview")) {
                                    n4j.A42 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1608527478:
                                if (A1C.equals("rms_placeholder_model")) {
                                    n4j.A0n = (InspirationRMSPlaceholderModel) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationRMSPlaceholderModel.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1609298562:
                                if (A1C.equals("entry_animation_type")) {
                                    n4j.A0K(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1618134502:
                                if (A1C.equals("is_music_enabled_on_saved_short_videos")) {
                                    n4j.A2d = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1623707901:
                                if (A1C.equals("inspiration_multi_capture_state")) {
                                    n4j.A0N = (InspirationMultiCaptureState) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMultiCaptureState.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1627008786:
                                if (A1C.equals("allows_product_tagging_mode")) {
                                    n4j.A1o = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1628772759:
                                if (A1C.equals("is_music_tool_disabled_override")) {
                                    n4j.A2i = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1629108170:
                                if (A1C.equals("should_enable_camera_roll_button")) {
                                    n4j.A3g = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1629807414:
                                if (A1C.equals("min_trimming_duration_ms")) {
                                    n4j.A09 = abstractC01033pi.A1B();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1677147945:
                                if (A1C.equals("use_first_party_effects_only")) {
                                    n4j.A4D = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1768996461:
                                if (A1C.equals("vod_to_reels_composer_session_id")) {
                                    n4j.A1j = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1769753505:
                                if (A1C.equals("is_save_button_enabled")) {
                                    n4j.A31 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1824988769:
                                if (A1C.equals("is_post_capture_effects_enabled")) {
                                    n4j.A2o = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1851822852:
                                if (A1C.equals("should_hide_discard_button_in_camera")) {
                                    n4j.A3m = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1867916538:
                                if (A1C.equals("should_log_composer_entry")) {
                                    n4j.A3q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1868311601:
                                if (A1C.equals("composer_source_screen")) {
                                    n4j.A0X = (EPQ) AbstractC11224vw.A02(abstractC01033pi, c27t, EPQ.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1871906596:
                                if (A1C.equals("are_button_labels_clickable")) {
                                    n4j.A1p = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1906810648:
                                if (A1C.equals("should_uplevel_backdrop")) {
                                    n4j.A4A = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1911746892:
                                if (A1C.equals("should_hide_discard_button_in_editor")) {
                                    n4j.A3n = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1924321304:
                                if (A1C.equals("is_audio_only_mode")) {
                                    n4j.A1z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1930077810:
                                if (A1C.equals("initial_backdrop_prompt")) {
                                    n4j.A1N = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1931966366:
                                if (A1C.equals("is_ready_made_suggested_stories")) {
                                    n4j.A2y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1936376637:
                                if (A1C.equals("should_disable_create_sticker")) {
                                    n4j.A3U = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1944424472:
                                if (A1C.equals("is_non_cross_postable_i_g_stickers_disabled")) {
                                    n4j.A2l = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1949410892:
                                if (A1C.equals("should_expand_music_pill")) {
                                    n4j.A3k = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1969000352:
                                if (A1C.equals("inspiration_zoom_crop_gesture_auto_zoom_scale")) {
                                    n4j.A12 = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1974109550:
                                if (A1C.equals("is_ueg_boomerang_button_enabled")) {
                                    n4j.A3C = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1980484797:
                                if (A1C.equals("should_disable_giphy_stickers_for_photos")) {
                                    n4j.A3W = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1990162462:
                                if (A1C.equals("is_reels_pre_capture_effects_system_enabled")) {
                                    n4j.A30 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1992960964:
                                if (A1C.equals("should_set_activity_result_after_posting")) {
                                    n4j.A3y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2012530081:
                                if (A1C.equals("initial_movable_overlay_params")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class);
                                    n4j.A0s = A002;
                                    C1pq.A08("initialMovableOverlayParams", A002);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2019848617:
                                if (A1C.equals("is_zoom_crop_enabled")) {
                                    n4j.A3M = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2041903298:
                                if (A1C.equals("initial_add_yours_template_overlay_params")) {
                                    ImmutableList A003 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class);
                                    n4j.A0p = A003;
                                    C1pq.A08("initialAddYoursTemplateOverlayParams", A003);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2044969671:
                                if (A1C.equals("placeholder_text_gratitude")) {
                                    n4j.A1V = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2079714231:
                                if (A1C.equals("aggregation_page_session_id")) {
                                    n4j.A15 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2082252223:
                                if (A1C.equals("new_releases_cluster_ids")) {
                                    n4j.A0w = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2119569536:
                                if (A1C.equals("is_collage_enabled")) {
                                    n4j.A29 = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2141454889:
                                if (A1C.equals("should_log_inspiration_entry_point_string")) {
                                    n4j.A3s = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2145097153:
                                if (A1C.equals("reels_consumption_tracking")) {
                                    n4j.A1d = AbstractC11224vw.A03(abstractC01033pi);
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
                    C4V6.A01(abstractC01033pi, InspirationConfiguration.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationConfiguration(n4j);
        }
    }

    /* loaded from: InspirationConfiguration$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationConfiguration inspirationConfiguration = (InspirationConfiguration) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "aggregation_page_session_id", inspirationConfiguration.A15);
            boolean z = inspirationConfiguration.A1m;
            r302.A0o("allows_box_crop_mode");
            r302.A0v(z);
            boolean z2 = inspirationConfiguration.A1n;
            r302.A0o("allows_people_tagging_mode");
            r302.A0v(z2);
            boolean z3 = inspirationConfiguration.A1o;
            r302.A0o("allows_product_tagging_mode");
            r302.A0v(z3);
            AbstractC11224vw.A0D(r302, "ar_game_camera_type", inspirationConfiguration.A16);
            AbstractC11224vw.A0D(r302, "ar_game_i_d", inspirationConfiguration.A17);
            AbstractC11224vw.A0D(r302, "ar_game_payload", inspirationConfiguration.A18);
            AbstractC11224vw.A0D(r302, "ar_game_promise_id", inspirationConfiguration.A19);
            boolean z4 = inspirationConfiguration.A1p;
            r302.A0o("are_button_labels_clickable");
            r302.A0v(z4);
            AbstractC11224vw.A0D(r302, "artist_id", inspirationConfiguration.A1A);
            AbstractC11224vw.A0D(r302, "artist_name", inspirationConfiguration.A1B);
            int i = inspirationConfiguration.A00;
            r302.A0o("background_placeholder_color");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, "camera_button_tooltip_description_text", inspirationConfiguration.A1C);
            AbstractC11224vw.A0D(r302, "camera_button_tooltip_title_text", inspirationConfiguration.A1D);
            AbstractC11224vw.A0D(r302, "camera_post_context_source", inspirationConfiguration.A1E);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0E, "camera_roll_data_privacy_access");
            AbstractC11224vw.A06(r302, c26c, "captured_media", inspirationConfiguration.A0o);
            AbstractC11224vw.A0D(r302, "challenge_id", inspirationConfiguration.A1F);
            AbstractC11224vw.A0D(r302, "challenge_prompt", inspirationConfiguration.A1G);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0Z, "close_camera_transition");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0X, "composer_source_screen");
            AbstractC11224vw.A0D(r302, "customized_background_uri", inspirationConfiguration.A1H);
            AbstractC11224vw.A0D(r302, "default_effects_tray_category", inspirationConfiguration.A1I);
            int i2 = inspirationConfiguration.A01;
            r302.A0o("default_gesture_layout_visibility");
            r302.A0f(i2);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0I, "default_open_tray");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.Ah2(), "default_open_tray_in_post_capture_when_other_trays_are_dismissed");
            boolean z5 = inspirationConfiguration.A1q;
            r302.A0o("disable_canvas_letterboxing");
            r302.A0v(z5);
            boolean z6 = inspirationConfiguration.A1r;
            r302.A0o("disable_s_s_i_m_calculation");
            r302.A0v(z6);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0f, "draft_tracking_info");
            boolean z7 = inspirationConfiguration.A1s;
            r302.A0o("enable_camera_movable_overlays");
            r302.A0v(z7);
            boolean z8 = inspirationConfiguration.A1t;
            r302.A0o("enable_new_effects_in_live");
            r302.A0v(z8);
            AbstractC11224vw.A0D(r302, "entry_animation_type", inspirationConfiguration.A1J);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0C, "events_inspiration_configuration");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0Y, "facecast_configuration");
            AbstractC11224vw.A0D(r302, "feed_post_id", inspirationConfiguration.A1K);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0D, "goodwill_inspiration_composer_logging_params");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0H, "group_inspiration_configuration");
            AbstractC11224vw.A0D(r302, "hashtag_id", inspirationConfiguration.A1L);
            AbstractC11224vw.A0D(r302, "hashtag_name", inspirationConfiguration.A1M);
            boolean z9 = inspirationConfiguration.A1u;
            r302.A0o("hide_reels_branding");
            r302.A0v(z9);
            AbstractC11224vw.A06(r302, c26c, "initial_add_yours_template_overlay_params", inspirationConfiguration.A0p);
            AbstractC11224vw.A06(r302, c26c, "initial_additional_remixable_video_asset_meta_data", inspirationConfiguration.A0q);
            int i3 = inspirationConfiguration.A02;
            r302.A0o("initial_audio_source_type");
            r302.A0f(i3);
            AbstractC11224vw.A0D(r302, "initial_backdrop_prompt", inspirationConfiguration.A1N);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0T, "initial_backdrop_sticker");
            AbstractC11224vw.A0D(r302, "initial_backdrop_uri", inspirationConfiguration.A1O);
            AbstractC11224vw.A0D(r302, "initial_composer_session_id", inspirationConfiguration.A1P);
            AbstractC11224vw.A06(r302, c26c, "initial_effects", inspirationConfiguration.A0r);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.Aqe(), "initial_form_type");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.Aqf(), "initial_format_mode");
            AbstractC11224vw.A0D(r302, "initial_magic_mod_prompt", inspirationConfiguration.A1Q);
            AbstractC11224vw.A06(r302, c26c, "initial_movable_overlay_params", inspirationConfiguration.A0s);
            AbstractC11224vw.A0D(r302, "initial_music_asset_id", inspirationConfiguration.A1R);
            int i4 = inspirationConfiguration.A03;
            r302.A0o("initial_music_start_time_ms");
            r302.A0f(i4);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0K, "initial_remix_data");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0F, "initial_text_for_share_sheet");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0G, "initial_text_for_structured_composer");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0S, "initial_text_for_text_tool_params");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.Aql(), "initial_video_editing_data");
            AbstractC11224vw.A06(r302, c26c, "initial_video_segments", inspirationConfiguration.A0t);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0a, "inspiration_ar_ads_configuration");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0b, "inspiration_camera_configuration");
            AbstractC11224vw.A06(r302, c26c, "inspiration_form_types", inspirationConfiguration.ArB());
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0g, "inspiration_multi_capture_reshoot_configuration");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0N, "inspiration_multi_capture_state");
            AbstractC11224vw.A0B(r302, inspirationConfiguration.A13, "inspiration_navigation_button_type");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.ArF(), "inspiration_post_action");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0k, "inspiration_story_source_metadata");
            AbstractC11224vw.A06(r302, c26c, "inspiration_template_suggestions", inspirationConfiguration.A0v);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0Q, "inspiration_video_template");
            AbstractC11224vw.A0A(r302, inspirationConfiguration.A12, "inspiration_zoom_crop_gesture_auto_zoom_scale");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.ArP(), "instagram_cross_posting_state");
            boolean z10 = inspirationConfiguration.A1v;
            r302.A0o("is_ar_game_effect");
            r302.A0v(z10);
            boolean z11 = inspirationConfiguration.A1w;
            r302.A0o("is_assistive_audio_enabled");
            r302.A0v(z11);
            boolean z12 = inspirationConfiguration.A1x;
            r302.A0o("is_attributed_music");
            r302.A0v(z12);
            boolean z13 = inspirationConfiguration.A1y;
            r302.A0o("is_audio_browser_try_on_enabled");
            r302.A0v(z13);
            boolean z14 = inspirationConfiguration.A1z;
            r302.A0o("is_audio_only_mode");
            r302.A0v(z14);
            boolean z15 = inspirationConfiguration.A20;
            r302.A0o("is_auto_add_music_for_single_clip_enabled");
            r302.A0v(z15);
            boolean z16 = inspirationConfiguration.A21;
            r302.A0o("is_auto_attributed_licensed_music");
            r302.A0v(z16);
            boolean z17 = inspirationConfiguration.A22;
            r302.A0o("is_auto_created_reel");
            r302.A0v(z17);
            boolean z18 = inspirationConfiguration.A23;
            r302.A0o("is_avatar_story_sticker_mode_enabled");
            r302.A0v(z18);
            boolean z19 = inspirationConfiguration.A24;
            r302.A0o("is_background_selector_enabled");
            r302.A0v(z19);
            boolean z20 = inspirationConfiguration.A25;
            r302.A0o("is_c_f_bottom_sheet_disabled");
            r302.A0v(z20);
            boolean z21 = inspirationConfiguration.A26;
            r302.A0o("is_camera_roll_enabled");
            r302.A0v(z21);
            boolean z22 = inspirationConfiguration.A27;
            r302.A0o("is_camera_shortcut_dialog_enabled");
            r302.A0v(z22);
            boolean z23 = inspirationConfiguration.A28;
            r302.A0o("is_capture_only");
            r302.A0v(z23);
            boolean z24 = inspirationConfiguration.A29;
            r302.A0o("is_collage_enabled");
            r302.A0v(z24);
            boolean z25 = inspirationConfiguration.A2A;
            r302.A0o("is_cross_platform_mention_sticker_enabled");
            r302.A0v(z25);
            boolean z26 = inspirationConfiguration.A2B;
            r302.A0o("is_doodle_enabled");
            r302.A0v(z26);
            boolean z27 = inspirationConfiguration.A2C;
            r302.A0o("is_dynamic_toolbar_enabled");
            r302.A0v(z27);
            boolean z28 = inspirationConfiguration.A2D;
            r302.A0o("is_editable_stickers_disabled");
            r302.A0v(z28);
            boolean z29 = inspirationConfiguration.A2E;
            r302.A0o("is_effects_enabled");
            r302.A0v(z29);
            boolean z30 = inspirationConfiguration.A2F;
            r302.A0o("is_effects_unification_camera_layout_in_shorts_enabled");
            r302.A0v(z30);
            boolean z31 = inspirationConfiguration.A2G;
            r302.A0o("is_footer_enabled");
            r302.A0v(z31);
            boolean z32 = inspirationConfiguration.A2H;
            r302.A0o("is_from_camera_capture");
            r302.A0v(z32);
            boolean z33 = inspirationConfiguration.A2I;
            r302.A0o("is_from_feed_composer");
            r302.A0v(z33);
            boolean z34 = inspirationConfiguration.A2J;
            r302.A0o("is_from_homebase");
            r302.A0v(z34);
            boolean z35 = inspirationConfiguration.A2K;
            r302.A0o("is_from_homebase_sprout");
            r302.A0v(z35);
            boolean z36 = inspirationConfiguration.A2L;
            r302.A0o("is_from_notification");
            r302.A0v(z36);
            boolean z37 = inspirationConfiguration.A2M;
            r302.A0o("is_from_reels_draft");
            r302.A0v(z37);
            boolean z38 = inspirationConfiguration.A2N;
            r302.A0o("is_from_sound_sync_mid_card");
            r302.A0v(z38);
            boolean z39 = inspirationConfiguration.A2O;
            r302.A0o("is_from_stories_draft");
            r302.A0v(z39);
            boolean z40 = inspirationConfiguration.A2P;
            r302.A0o("is_from_story_viewer");
            r302.A0v(z40);
            boolean z41 = inspirationConfiguration.A2Q;
            r302.A0o("is_fundraising_sticker_enabled");
            r302.A0v(z41);
            boolean z42 = inspirationConfiguration.A2R;
            r302.A0o("is_giphy_sticker_enabled");
            r302.A0v(z42);
            boolean z43 = inspirationConfiguration.A2S;
            r302.A0o("is_green_screen_enabled");
            r302.A0v(z43);
            boolean z44 = inspirationConfiguration.A2T;
            r302.A0o("is_green_screen_enabled_for_mimicry");
            r302.A0v(z44);
            boolean z45 = inspirationConfiguration.A2U;
            r302.A0o("is_immersive_reels_reshare");
            r302.A0v(z45);
            boolean z46 = inspirationConfiguration.A2V;
            r302.A0o("is_inline_effects_tray_enabled");
            r302.A0v(z46);
            boolean z47 = inspirationConfiguration.A2W;
            r302.A0o("is_landscape_orientation_enabled");
            r302.A0v(z47);
            boolean z48 = inspirationConfiguration.A2X;
            r302.A0o("is_launched_from_camera_shortcut");
            r302.A0v(z48);
            boolean z49 = inspirationConfiguration.A2Y;
            r302.A0o("is_launched_from_feed_re_share_flow");
            r302.A0v(z49);
            boolean z50 = inspirationConfiguration.A2Z;
            r302.A0o("is_magic_montage_enabled");
            r302.A0v(z50);
            boolean z51 = inspirationConfiguration.A2a;
            r302.A0o("is_moments");
            r302.A0v(z51);
            boolean z52 = inspirationConfiguration.A2b;
            r302.A0o("is_multi_capture_timeline_editor_enabled");
            r302.A0v(z52);
            boolean z53 = inspirationConfiguration.A2c;
            r302.A0o("is_multimedia_enabled");
            r302.A0v(z53);
            boolean z54 = inspirationConfiguration.A2d;
            r302.A0o("is_music_enabled_on_saved_short_videos");
            r302.A0v(z54);
            boolean z55 = inspirationConfiguration.A2e;
            r302.A0o("is_music_first_sound_sync_flow_enabled");
            r302.A0v(z55);
            boolean z56 = inspirationConfiguration.A2f;
            r302.A0o("is_music_picker_enabled");
            r302.A0v(z56);
            boolean z57 = inspirationConfiguration.A2g;
            r302.A0o("is_music_picker_video_icon_disabled");
            r302.A0v(z57);
            boolean z58 = inspirationConfiguration.A2h;
            r302.A0o("is_music_sticker_enabled");
            r302.A0v(z58);
            boolean z59 = inspirationConfiguration.A2i;
            r302.A0o("is_music_tool_disabled_override");
            r302.A0v(z59);
            boolean z60 = inspirationConfiguration.A2j;
            r302.A0o("is_music_tool_enabled");
            r302.A0v(z60);
            boolean z61 = inspirationConfiguration.A2k;
            r302.A0o("is_name_sticker_enabled");
            r302.A0v(z61);
            boolean z62 = inspirationConfiguration.A2l;
            r302.A0o("is_non_cross_postable_i_g_stickers_disabled");
            r302.A0v(z62);
            boolean z63 = inspirationConfiguration.A2m;
            r302.A0o("is_photo_import_enabled");
            r302.A0v(z63);
            boolean z64 = inspirationConfiguration.A2n;
            r302.A0o("is_photo_preview_disabled");
            r302.A0v(z64);
            boolean z65 = inspirationConfiguration.A2o;
            r302.A0o("is_post_capture_effects_enabled");
            r302.A0v(z65);
            boolean z66 = inspirationConfiguration.A2p;
            r302.A0o("is_post_capture_suggestion_sticker_tray_enabled");
            r302.A0v(z66);
            boolean z67 = inspirationConfiguration.A2q;
            r302.A0o("is_pre_capture_bug_reporting_enabled");
            r302.A0v(z67);
            boolean z68 = inspirationConfiguration.A2r;
            r302.A0o("is_pre_capture_step_enabled");
            r302.A0v(z68);
            boolean z69 = inspirationConfiguration.A2s;
            r302.A0o("is_pre_capture_video_speed_tool_enabled");
            r302.A0v(z69);
            boolean z70 = inspirationConfiguration.A2t;
            r302.A0o("is_precapture_vertical_toolbar_enabled");
            r302.A0v(z70);
            boolean z71 = inspirationConfiguration.A2u;
            r302.A0o("is_product_sticker_enabled_for_page");
            r302.A0v(z71);
            boolean z72 = inspirationConfiguration.A2v;
            r302.A0o("is_r_m_s_collage_enabled");
            r302.A0v(z72);
            boolean z73 = inspirationConfiguration.A2w;
            r302.A0o("is_r_m_s_use_case_enabled");
            r302.A0v(z73);
            boolean z74 = inspirationConfiguration.A2x;
            r302.A0o("is_reaction_reels");
            r302.A0v(z74);
            boolean z75 = inspirationConfiguration.A2y;
            r302.A0o("is_ready_made_suggested_stories");
            r302.A0v(z75);
            boolean z76 = inspirationConfiguration.A2z;
            r302.A0o("is_reels_gallery_multi_select_enabled");
            r302.A0v(z76);
            boolean z77 = inspirationConfiguration.A30;
            r302.A0o("is_reels_pre_capture_effects_system_enabled");
            r302.A0v(z77);
            boolean z78 = inspirationConfiguration.A31;
            r302.A0o("is_save_button_enabled");
            r302.A0v(z78);
            boolean z79 = inspirationConfiguration.A32;
            r302.A0o("is_save_button_enabled_for_camera_captures");
            r302.A0v(z79);
            boolean z80 = inspirationConfiguration.A33;
            r302.A0o("is_session_saver_disabled");
            r302.A0v(z80);
            boolean z81 = inspirationConfiguration.A34;
            r302.A0o("is_sound_tool_button_enabled");
            r302.A0v(z81);
            boolean z82 = inspirationConfiguration.A35;
            r302.A0o("is_sticker_enabled");
            r302.A0v(z82);
            boolean z83 = inspirationConfiguration.A36;
            r302.A0o("is_sticker_prefetch_disabled");
            r302.A0v(z83);
            boolean z84 = inspirationConfiguration.A37;
            r302.A0o("is_stories_imagine_enabled");
            r302.A0v(z84);
            boolean z85 = inspirationConfiguration.A38;
            r302.A0o("is_stories_recap");
            r302.A0v(z85);
            boolean z86 = inspirationConfiguration.A39;
            r302.A0o("is_text_enabled");
            r302.A0v(z86);
            boolean z87 = inspirationConfiguration.A3A;
            r302.A0o("is_text_tool_mention_disabled");
            r302.A0v(z87);
            boolean z88 = inspirationConfiguration.A3B;
            r302.A0o("is_timed_element_enabled");
            r302.A0v(z88);
            boolean z89 = inspirationConfiguration.A3C;
            r302.A0o("is_ueg_boomerang_button_enabled");
            r302.A0v(z89);
            boolean z90 = inspirationConfiguration.A3D;
            r302.A0o("is_ueg_caption_button_enabled");
            r302.A0v(z90);
            boolean z91 = inspirationConfiguration.A3E;
            r302.A0o("is_ueg_mute_button_enabled");
            r302.A0v(z91);
            boolean z92 = inspirationConfiguration.A3F;
            r302.A0o("is_ueg_vertical_toolbar_enabled");
            r302.A0v(z92);
            boolean z93 = inspirationConfiguration.A3G;
            r302.A0o("is_unified_audio_controls_supported");
            r302.A0v(z93);
            boolean z94 = inspirationConfiguration.A3H;
            r302.A0o("is_v_t_s_animations_effects_supported");
            r302.A0v(z94);
            boolean z95 = inspirationConfiguration.A3I;
            r302.A0o("is_vertical_toolbar_label_fade_enabled");
            r302.A0v(z95);
            boolean z96 = inspirationConfiguration.A3J;
            r302.A0o("is_video_trimming_disabled");
            r302.A0v(z96);
            boolean z97 = inspirationConfiguration.A3K;
            r302.A0o("is_virtual_video_player_enabled");
            r302.A0v(z97);
            boolean z98 = inspirationConfiguration.A3L;
            r302.A0o("is_voice_over_tool_enabled");
            r302.A0v(z98);
            boolean z99 = inspirationConfiguration.A3M;
            r302.A0o("is_zoom_crop_enabled");
            r302.A0v(z99);
            long j = inspirationConfiguration.A06;
            r302.A0o("max_trimming_duration_ms");
            r302.A0g(j);
            AbstractC11224vw.A0C(r302, inspirationConfiguration.A14, "max_video_duration_ms_override");
            AbstractC11224vw.A0D(r302, "messaging_entry_point_data", inspirationConfiguration.A1S);
            long j2 = inspirationConfiguration.A07;
            r302.A0o("min_capture_duration_ms");
            r302.A0g(j2);
            long j3 = inspirationConfiguration.A08;
            r302.A0o("min_extra_duration_ms_for_trimming_eligibility");
            r302.A0g(j3);
            long j4 = inspirationConfiguration.A09;
            r302.A0o("min_trimming_duration_ms");
            r302.A0g(j4);
            AbstractC11224vw.A06(r302, c26c, "new_releases_cluster_ids", inspirationConfiguration.A0w);
            AbstractC11224vw.A0D(r302, "notif_type", inspirationConfiguration.A1T);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0h, "nux_configuration");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.B0J(), "open_sound_sync_action_type");
            boolean z100 = inspirationConfiguration.A3N;
            r302.A0o("override_enable_o_p_s_sends");
            r302.A0v(z100);
            AbstractC11224vw.A0D(r302, "photos_to_reels_originating_media_id", inspirationConfiguration.A1U);
            AbstractC11224vw.A0D(r302, "placeholder_text_gratitude", inspirationConfiguration.A1V);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0m, "platform_camera_share_configuration");
            AbstractC11224vw.A0D(r302, "playlist_id", inspirationConfiguration.A1W);
            AbstractC11224vw.A0D(r302, "playlist_name", inspirationConfiguration.A1X);
            AbstractC11224vw.A06(r302, c26c, "pre_applied_effects", inspirationConfiguration.A0x);
            AbstractC11224vw.A0D(r302, "preselected_recipient_id", inspirationConfiguration.A1Y);
            AbstractC11224vw.A0D(r302, "preselected_share_to_channel_thread_id", inspirationConfiguration.A1Z);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A11, "previously_selected_media");
            int i5 = inspirationConfiguration.A04;
            r302.A0o("progress_bar_style");
            r302.A0f(i5);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0A, "ready_made_suggestion_model");
            AbstractC11224vw.A0D(r302, "reasons_failed", inspirationConfiguration.A1a);
            AbstractC11224vw.A0D(r302, "recommendation_media_hint", inspirationConfiguration.A1b);
            AbstractC11224vw.A0D(r302, "reel_editor_session_id", inspirationConfiguration.A1c);
            AbstractC11224vw.A0D(r302, "reels_consumption_tracking", inspirationConfiguration.A1d);
            AbstractC11224vw.A06(r302, c26c, "remote_auto_created_reel_media_items", inspirationConfiguration.A0y);
            AbstractC11224vw.A06(r302, c26c, "required_style_categories", inspirationConfiguration.B7d());
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0U, "reshare_to_story_metadata");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0n, "rms_placeholder_model");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0W, "rms_recommendation_data");
            AbstractC11224vw.A0D(r302, "search_text", inspirationConfiguration.A1e);
            AbstractC11224vw.A06(r302, c26c, "selected_attribution", inspirationConfiguration.A10);
            int i6 = inspirationConfiguration.A05;
            r302.A0o("selected_media_item_index");
            r302.A0f(i6);
            AbstractC11224vw.A0D(r302, "share_button_label_text", inspirationConfiguration.A1f);
            boolean z101 = inspirationConfiguration.A3O;
            r302.A0o("should_create_memories_polaroid_sticker");
            r302.A0v(z101);
            boolean z102 = inspirationConfiguration.A3P;
            r302.A0o("should_create_reel_from_vod_fragment_after_timeline_editor");
            r302.A0v(z102);
            boolean z103 = inspirationConfiguration.A3Q;
            r302.A0o("should_cta_use_swipe_up_link");
            r302.A0v(z103);
            boolean z104 = inspirationConfiguration.A3R;
            r302.A0o("should_disable_ai_text_suggestions");
            r302.A0v(z104);
            boolean z105 = inspirationConfiguration.A3S;
            r302.A0o("should_disable_camera_roll_settings_button");
            r302.A0v(z105);
            boolean z106 = inspirationConfiguration.A3T;
            r302.A0o("should_disable_close_friends_story_buttons");
            r302.A0v(z106);
            boolean z107 = inspirationConfiguration.A3U;
            r302.A0o("should_disable_create_sticker");
            r302.A0v(z107);
            boolean z108 = inspirationConfiguration.A3V;
            r302.A0o("should_disable_effect_switching");
            r302.A0v(z108);
            boolean z109 = inspirationConfiguration.A3W;
            r302.A0o("should_disable_giphy_stickers_for_photos");
            r302.A0v(z109);
            boolean z110 = inspirationConfiguration.A3X;
            r302.A0o("should_disable_i_g_offending_stickers_warning");
            r302.A0v(z110);
            boolean z111 = inspirationConfiguration.A3Y;
            r302.A0o("should_disable_mentions_in_text_tool");
            r302.A0v(z111);
            boolean z112 = inspirationConfiguration.A3Z;
            r302.A0o("should_disable_music_stickers_for_photos");
            r302.A0v(z112);
            boolean z113 = inspirationConfiguration.A3a;
            r302.A0o("should_disable_music_stickers_for_suggestions");
            r302.A0v(z113);
            boolean z114 = inspirationConfiguration.A3b;
            r302.A0o("should_disable_reels_drafts");
            r302.A0v(z114);
            boolean z115 = inspirationConfiguration.A3c;
            r302.A0o("should_disable_search_tool");
            r302.A0v(z115);
            boolean z116 = inspirationConfiguration.A3d;
            r302.A0o("should_disable_share_sheet_reset_on_resume");
            r302.A0v(z116);
            boolean z117 = inspirationConfiguration.A3e;
            r302.A0o("should_disable_text_prompt_in_stories_editor");
            r302.A0v(z117);
            boolean z118 = inspirationConfiguration.A3f;
            r302.A0o("should_display_camera_roll_effect_tooltip");
            r302.A0v(z118);
            boolean z119 = inspirationConfiguration.A3g;
            r302.A0o("should_enable_camera_roll_button");
            r302.A0v(z119);
            boolean z120 = inspirationConfiguration.A3h;
            r302.A0o("should_enable_camera_settings_button");
            r302.A0v(z120);
            boolean z121 = inspirationConfiguration.A3i;
            r302.A0o("should_enable_story_button");
            r302.A0v(z121);
            boolean z122 = inspirationConfiguration.A3j;
            r302.A0o("should_enable_visual_trimmer");
            r302.A0v(z122);
            boolean z123 = inspirationConfiguration.A3k;
            r302.A0o("should_expand_music_pill");
            r302.A0v(z123);
            boolean z124 = inspirationConfiguration.A3l;
            r302.A0o("should_finish_call_site_after_posting");
            r302.A0v(z124);
            boolean z125 = inspirationConfiguration.A3m;
            r302.A0o("should_hide_discard_button_in_camera");
            r302.A0v(z125);
            boolean z126 = inspirationConfiguration.A3n;
            r302.A0o("should_hide_discard_button_in_editor");
            r302.A0v(z126);
            boolean z127 = inspirationConfiguration.A3o;
            r302.A0o("should_inject_style_background_media");
            r302.A0v(z127);
            boolean z128 = inspirationConfiguration.A3p;
            r302.A0o("should_launch_vod_composer_after_timeline_editor");
            r302.A0v(z128);
            boolean z129 = inspirationConfiguration.A3q;
            r302.A0o("should_log_composer_entry");
            r302.A0v(z129);
            boolean z130 = inspirationConfiguration.A3r;
            r302.A0o("should_log_f_c_r");
            r302.A0v(z130);
            boolean z131 = inspirationConfiguration.A3s;
            r302.A0o("should_log_inspiration_entry_point_string");
            r302.A0v(z131);
            boolean z132 = inspirationConfiguration.A3t;
            r302.A0o("should_music_selection_auto_start_capture");
            r302.A0v(z132);
            boolean z133 = inspirationConfiguration.A3u;
            r302.A0o("should_navigate_to_news_feed_after_share");
            r302.A0v(z133);
            boolean z134 = inspirationConfiguration.A3v;
            r302.A0o("should_override_render_animate_mask_effects_as_static");
            r302.A0v(z134);
            boolean z135 = inspirationConfiguration.A3w;
            r302.A0o("should_return_to_picker_from_home_base_when_discard");
            r302.A0v(z135);
            boolean z136 = inspirationConfiguration.A3x;
            r302.A0o("should_select_newsfeed");
            r302.A0v(z136);
            boolean z137 = inspirationConfiguration.A3y;
            r302.A0o("should_set_activity_result_after_posting");
            r302.A0v(z137);
            boolean z138 = inspirationConfiguration.A3z;
            r302.A0o("should_share_to_story_only");
            r302.A0v(z138);
            boolean z139 = inspirationConfiguration.A40;
            r302.A0o("should_show_ar_scenes_in_background_selector");
            r302.A0v(z139);
            boolean z140 = inspirationConfiguration.A41;
            r302.A0o("should_show_hashtag_is_applied_prompt_in_camera");
            r302.A0v(z140);
            boolean z141 = inspirationConfiguration.A42;
            r302.A0o("should_show_mini_preview");
            r302.A0v(z141);
            boolean z142 = inspirationConfiguration.A43;
            r302.A0o("should_show_music_digest_sections");
            r302.A0v(z142);
            boolean z143 = inspirationConfiguration.A44;
            r302.A0o("should_show_music_survey");
            r302.A0v(z143);
            boolean z144 = inspirationConfiguration.A45;
            r302.A0o("should_show_only_preselected_effects");
            r302.A0v(z144);
            boolean z145 = inspirationConfiguration.A46;
            r302.A0o("should_show_playlist_is_applied_prompt_in_camera");
            r302.A0v(z145);
            boolean z146 = inspirationConfiguration.A47;
            r302.A0o("should_show_scenes_in_background_selector");
            r302.A0v(z146);
            boolean z147 = inspirationConfiguration.A48;
            r302.A0o("should_show_send_forward_variant");
            r302.A0v(z147);
            boolean z148 = inspirationConfiguration.A49;
            r302.A0o("should_skip_media_validation");
            r302.A0v(z148);
            boolean z149 = inspirationConfiguration.A4A;
            r302.A0o("should_uplevel_backdrop");
            r302.A0v(z149);
            boolean z150 = inspirationConfiguration.A4B;
            r302.A0o("should_use_birthday_spark_layout");
            r302.A0v(z150);
            boolean z151 = inspirationConfiguration.A4C;
            r302.A0o("should_use_full_canvas");
            r302.A0v(z151);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.BBz(), 1BJ.A00(57));
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.BC5(), "starting_mode");
            AbstractC11224vw.A0D(r302, "suggested_song_id", inspirationConfiguration.A1g);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0R, "suggestion_component_model");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0d, "tall_screen_support_enabled_entry_point");
            AbstractC11224vw.A0D(r302, "target_audio_library_product", inspirationConfiguration.A1h);
            AbstractC11224vw.A0D(r302, "target_linked_video_id", inspirationConfiguration.A1i);
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0l, "then_and_now_model");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.BGx(), "trash_unification_support_enabled_entry_point");
            AbstractC11224vw.A05(r302, c26c, inspirationConfiguration.A0B, "try_it_surface_context");
            boolean z152 = inspirationConfiguration.A4D;
            r302.A0o("use_first_party_effects_only");
            r302.A0v(z152);
            AbstractC11224vw.A0D(r302, "vod_to_reels_composer_session_id", inspirationConfiguration.A1j);
            AbstractC11224vw.A0D(r302, "vpv_id", inspirationConfiguration.A1k);
            DKG.A1T(r302, "was_delayed_to_fetch_consent_state", inspirationConfiguration.A4E);
        }
    }

    public InspirationConfiguration(N4j n4j) {
        this.A15 = n4j.A15;
        this.A1m = n4j.A1m;
        this.A1n = n4j.A1n;
        this.A1o = n4j.A1o;
        this.A16 = n4j.A16;
        this.A17 = n4j.A17;
        this.A18 = n4j.A18;
        this.A19 = n4j.A19;
        this.A1p = n4j.A1p;
        this.A1A = n4j.A1A;
        this.A1B = n4j.A1B;
        this.A00 = n4j.A00;
        this.A1C = n4j.A1C;
        this.A1D = n4j.A1D;
        String str = n4j.A1E;
        C1pq.A08("cameraPostContextSource", str);
        this.A1E = str;
        this.A0E = n4j.A0E;
        ImmutableList immutableList = n4j.A0o;
        C1pq.A08("capturedMedia", immutableList);
        this.A0o = immutableList;
        this.A1F = n4j.A1F;
        this.A1G = n4j.A1G;
        this.A0Z = n4j.A0Z;
        this.A0X = n4j.A0X;
        this.A1H = n4j.A1H;
        this.A1I = n4j.A1I;
        this.A01 = n4j.A01;
        this.A0I = n4j.A0I;
        this.A0J = n4j.A0J;
        this.A1q = n4j.A1q;
        this.A1r = n4j.A1r;
        this.A0f = n4j.A0f;
        this.A1s = n4j.A1s;
        this.A1t = n4j.A1t;
        String str2 = n4j.A1J;
        C1pq.A08("entryAnimationType", str2);
        this.A1J = str2;
        this.A0C = n4j.A0C;
        this.A0Y = n4j.A0Y;
        this.A1K = n4j.A1K;
        this.A0D = n4j.A0D;
        this.A0H = n4j.A0H;
        String str3 = n4j.A1L;
        C1pq.A08("hashtagId", str3);
        this.A1L = str3;
        this.A1M = n4j.A1M;
        this.A1u = n4j.A1u;
        ImmutableList immutableList2 = n4j.A0p;
        C1pq.A08("initialAddYoursTemplateOverlayParams", immutableList2);
        this.A0p = immutableList2;
        this.A0q = n4j.A0q;
        this.A02 = n4j.A02;
        this.A1N = n4j.A1N;
        this.A0T = n4j.A0T;
        this.A1O = n4j.A1O;
        String str4 = n4j.A1P;
        C1pq.A08("initialComposerSessionId", str4);
        this.A1P = str4;
        ImmutableList immutableList3 = n4j.A0r;
        C1pq.A08("initialEffects", immutableList3);
        this.A0r = immutableList3;
        this.A0L = n4j.A0L;
        this.A0M = n4j.A0M;
        this.A1Q = n4j.A1Q;
        ImmutableList immutableList4 = n4j.A0s;
        C1pq.A08("initialMovableOverlayParams", immutableList4);
        this.A0s = immutableList4;
        this.A1R = n4j.A1R;
        this.A03 = n4j.A03;
        this.A0K = n4j.A0K;
        this.A0F = n4j.A0F;
        this.A0G = n4j.A0G;
        this.A0S = n4j.A0S;
        this.A0P = n4j.A0P;
        ImmutableList immutableList5 = n4j.A0t;
        C1pq.A08("initialVideoSegments", immutableList5);
        this.A0t = immutableList5;
        this.A0a = n4j.A0a;
        this.A0b = n4j.A0b;
        this.A0u = n4j.A0u;
        this.A0g = n4j.A0g;
        this.A0N = n4j.A0N;
        this.A13 = n4j.A13;
        this.A0O = n4j.A0O;
        this.A0k = n4j.A0k;
        this.A0v = n4j.A0v;
        this.A0Q = n4j.A0Q;
        this.A12 = n4j.A12;
        this.A0c = n4j.A0c;
        this.A1v = n4j.A1v;
        this.A1w = n4j.A1w;
        this.A1x = n4j.A1x;
        this.A1y = n4j.A1y;
        this.A1z = n4j.A1z;
        this.A20 = n4j.A20;
        this.A21 = n4j.A21;
        this.A22 = n4j.A22;
        this.A23 = n4j.A23;
        this.A24 = n4j.A24;
        this.A25 = n4j.A25;
        this.A26 = n4j.A26;
        this.A27 = n4j.A27;
        this.A28 = n4j.A28;
        this.A29 = n4j.A29;
        this.A2A = n4j.A2A;
        this.A2B = n4j.A2B;
        this.A2C = n4j.A2C;
        this.A2D = n4j.A2D;
        this.A2E = n4j.A2E;
        this.A2F = n4j.A2F;
        this.A2G = n4j.A2G;
        this.A2H = n4j.A2H;
        this.A2I = n4j.A2I;
        this.A2J = n4j.A2J;
        this.A2K = n4j.A2K;
        this.A2L = n4j.A2L;
        this.A2M = n4j.A2M;
        this.A2N = n4j.A2N;
        this.A2O = n4j.A2O;
        this.A2P = n4j.A2P;
        this.A2Q = n4j.A2Q;
        this.A2R = n4j.A2R;
        this.A2S = n4j.A2S;
        this.A2T = n4j.A2T;
        this.A2U = n4j.A2U;
        this.A2V = n4j.A2V;
        this.A2W = n4j.A2W;
        this.A2X = n4j.A2X;
        this.A2Y = n4j.A2Y;
        this.A2Z = n4j.A2Z;
        this.A2a = n4j.A2a;
        this.A2b = n4j.A2b;
        this.A2c = n4j.A2c;
        this.A2d = n4j.A2d;
        this.A2e = n4j.A2e;
        this.A2f = n4j.A2f;
        this.A2g = n4j.A2g;
        this.A2h = n4j.A2h;
        this.A2i = n4j.A2i;
        this.A2j = n4j.A2j;
        this.A2k = n4j.A2k;
        this.A2l = n4j.A2l;
        this.A2m = n4j.A2m;
        this.A2n = n4j.A2n;
        this.A2o = n4j.A2o;
        this.A2p = n4j.A2p;
        this.A2q = n4j.A2q;
        this.A2r = n4j.A2r;
        this.A2s = n4j.A2s;
        this.A2t = n4j.A2t;
        this.A2u = n4j.A2u;
        this.A2v = n4j.A2v;
        this.A2w = n4j.A2w;
        this.A2x = n4j.A2x;
        this.A2y = n4j.A2y;
        this.A2z = n4j.A2z;
        this.A30 = n4j.A30;
        this.A31 = n4j.A31;
        this.A32 = n4j.A32;
        this.A33 = n4j.A33;
        this.A34 = n4j.A34;
        this.A35 = n4j.A35;
        this.A36 = n4j.A36;
        this.A37 = n4j.A37;
        this.A38 = n4j.A38;
        this.A39 = n4j.A39;
        this.A3A = n4j.A3A;
        this.A3B = n4j.A3B;
        this.A3C = n4j.A3C;
        this.A3D = n4j.A3D;
        this.A3E = n4j.A3E;
        this.A3F = n4j.A3F;
        this.A3G = n4j.A3G;
        this.A3H = n4j.A3H;
        this.A3I = n4j.A3I;
        this.A3J = n4j.A3J;
        this.A3K = n4j.A3K;
        this.A3L = n4j.A3L;
        this.A3M = n4j.A3M;
        this.A06 = n4j.A06;
        this.A14 = n4j.A14;
        this.A1S = n4j.A1S;
        this.A07 = n4j.A07;
        this.A08 = n4j.A08;
        this.A09 = n4j.A09;
        this.A0w = n4j.A0w;
        this.A1T = n4j.A1T;
        this.A0h = n4j.A0h;
        this.A0V = n4j.A0V;
        this.A3N = n4j.A3N;
        this.A1U = n4j.A1U;
        this.A1V = n4j.A1V;
        this.A0m = n4j.A0m;
        this.A1W = n4j.A1W;
        this.A1X = n4j.A1X;
        ImmutableList immutableList6 = n4j.A0x;
        C1pq.A08("preAppliedEffects", immutableList6);
        this.A0x = immutableList6;
        this.A1Y = n4j.A1Y;
        this.A1Z = n4j.A1Z;
        ImmutableMap immutableMap = n4j.A11;
        C1pq.A08("previouslySelectedMedia", immutableMap);
        this.A11 = immutableMap;
        this.A04 = n4j.A04;
        this.A0A = n4j.A0A;
        this.A1a = n4j.A1a;
        this.A1b = n4j.A1b;
        this.A1c = n4j.A1c;
        this.A1d = n4j.A1d;
        this.A0y = n4j.A0y;
        this.A0z = n4j.A0z;
        this.A0U = n4j.A0U;
        this.A0n = n4j.A0n;
        this.A0W = n4j.A0W;
        this.A1e = n4j.A1e;
        this.A10 = n4j.A10;
        this.A05 = n4j.A05;
        this.A1f = n4j.A1f;
        this.A3O = n4j.A3O;
        this.A3P = n4j.A3P;
        this.A3Q = n4j.A3Q;
        this.A3R = n4j.A3R;
        this.A3S = n4j.A3S;
        this.A3T = n4j.A3T;
        this.A3U = n4j.A3U;
        this.A3V = n4j.A3V;
        this.A3W = n4j.A3W;
        this.A3X = n4j.A3X;
        this.A3Y = n4j.A3Y;
        this.A3Z = n4j.A3Z;
        this.A3a = n4j.A3a;
        this.A3b = n4j.A3b;
        this.A3c = n4j.A3c;
        this.A3d = n4j.A3d;
        this.A3e = n4j.A3e;
        this.A3f = n4j.A3f;
        this.A3g = n4j.A3g;
        this.A3h = n4j.A3h;
        this.A3i = n4j.A3i;
        this.A3j = n4j.A3j;
        this.A3k = n4j.A3k;
        this.A3l = n4j.A3l;
        this.A3m = n4j.A3m;
        this.A3n = n4j.A3n;
        this.A3o = n4j.A3o;
        this.A3p = n4j.A3p;
        this.A3q = n4j.A3q;
        this.A3r = n4j.A3r;
        this.A3s = n4j.A3s;
        this.A3t = n4j.A3t;
        this.A3u = n4j.A3u;
        this.A3v = n4j.A3v;
        this.A3w = n4j.A3w;
        this.A3x = n4j.A3x;
        this.A3y = n4j.A3y;
        this.A3z = n4j.A3z;
        this.A40 = n4j.A40;
        this.A41 = n4j.A41;
        this.A42 = n4j.A42;
        this.A43 = n4j.A43;
        this.A44 = n4j.A44;
        this.A45 = n4j.A45;
        this.A46 = n4j.A46;
        this.A47 = n4j.A47;
        this.A48 = n4j.A48;
        this.A49 = n4j.A49;
        this.A4A = n4j.A4A;
        this.A4B = n4j.A4B;
        this.A4C = n4j.A4C;
        this.A0i = n4j.A0i;
        this.A0j = n4j.A0j;
        this.A1g = n4j.A1g;
        this.A0R = n4j.A0R;
        this.A0d = n4j.A0d;
        this.A1h = n4j.A1h;
        this.A1i = n4j.A1i;
        this.A0l = n4j.A0l;
        this.A0e = n4j.A0e;
        this.A0B = n4j.A0B;
        this.A4D = n4j.A4D;
        this.A1j = n4j.A1j;
        this.A1k = n4j.A1k;
        this.A4E = n4j.A4E;
        this.A1l = Collections.unmodifiableSet(n4j.A1l);
        if (this.A28 && !this.A2r) {
            throw AnonymousClass001.A0N("Pre capture step must be enabled for capture only!");
        }
        if (this.A3z && !this.A3F) {
            throw AnonymousClass001.A0N("Share to story only mode should always try to use vertical toolbar!");
        }
        if (this.A09 < this.A07) {
            throw AnonymousClass001.A0N("Minimum trim duration must be equal or larger than minimum capture duration!");
        }
        if (this.A2j && (!this.A3F || !this.A2t)) {
            throw AnonymousClass001.A0N("The Pre/Post Capture music tool only works with the vertical tool bar");
        }
        if (this.A2n && !this.A3K) {
            throw AnonymousClass001.A0N("VVP must be enabled when photo preview is disabled");
        }
    }

    public InspirationConfiguration(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A15 = null;
        } else {
            this.A15 = parcel.readString();
        }
        int i = 0;
        this.A1m = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A1n = 1BM.A07(parcel);
        this.A1o = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A16 = null;
        } else {
            this.A16 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A17 = null;
        } else {
            this.A17 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A18 = null;
        } else {
            this.A18 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A19 = null;
        } else {
            this.A19 = parcel.readString();
        }
        this.A1p = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A1A = null;
        } else {
            this.A1A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1B = null;
        } else {
            this.A1B = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A1C = null;
        } else {
            this.A1C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1D = null;
        } else {
            this.A1D = parcel.readString();
        }
        this.A1E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = GraphQLXFBCameraRollDataAccess.values()[parcel.readInt()];
        }
        int readInt = parcel.readInt();
        ComposerMedia[] composerMediaArr = new ComposerMedia[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, ComposerMedia.CREATOR, composerMediaArr, i2);
        }
        this.A0o = ImmutableList.copyOf(composerMediaArr);
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
            this.A0Z = null;
        } else {
            this.A0Z = Qoc.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = EPQ.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1H = null;
        } else {
            this.A1H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1I = null;
        } else {
            this.A1I = parcel.readString();
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = EnumC3488Mf7.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = EnumC3488Mf7.values()[parcel.readInt()];
        }
        this.A1q = 1BM.A07(parcel);
        this.A1r = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = (InspirationDraftTrackingInfo) parcel.readParcelable(A0e);
        }
        this.A1s = 1BM.A07(parcel);
        this.A1t = 1BM.A07(parcel);
        this.A1J = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (EventsInspirationConfiguration) EventsInspirationConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = (FacecastConfiguration) FacecastConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1K = null;
        } else {
            this.A1K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (GoodwillInspirationComposerLoggingParams) GoodwillInspirationComposerLoggingParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (GroupInspirationConfiguration) GroupInspirationConfiguration.CREATOR.createFromParcel(parcel);
        }
        this.A1L = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A1M = null;
        } else {
            this.A1M = parcel.readString();
        }
        this.A1u = 1BM.A07(parcel);
        int readInt2 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr = new InspirationOverlayParamsHolder[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr, i3);
        }
        this.A0p = ImmutableList.copyOf(inspirationOverlayParamsHolderArr);
        if (parcel.readInt() == 0) {
            this.A0q = null;
        } else {
            int readInt3 = parcel.readInt();
            InspirationRemixableVideoAssetMetaData[] inspirationRemixableVideoAssetMetaDataArr = new InspirationRemixableVideoAssetMetaData[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = DKG.A02(parcel, InspirationRemixableVideoAssetMetaData.CREATOR, inspirationRemixableVideoAssetMetaDataArr, i4);
            }
            this.A0q = ImmutableList.copyOf(inspirationRemixableVideoAssetMetaDataArr);
        }
        this.A02 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A1N = null;
        } else {
            this.A1N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (InspirationStickerParams) InspirationStickerParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1O = null;
        } else {
            this.A1O = parcel.readString();
        }
        this.A1P = parcel.readString();
        int readInt4 = parcel.readInt();
        InspirationEffect[] inspirationEffectArr = new InspirationEffect[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, InspirationEffect.CREATOR, inspirationEffectArr, i5);
        }
        this.A0r = ImmutableList.copyOf(inspirationEffectArr);
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = ELz.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = MfV.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1Q = null;
        } else {
            this.A1Q = parcel.readString();
        }
        int readInt5 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr2 = new InspirationOverlayParamsHolder[readInt5];
        int i6 = 0;
        while (i6 < readInt5) {
            i6 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr2, i6);
        }
        this.A0s = ImmutableList.copyOf(inspirationOverlayParamsHolderArr2);
        if (parcel.readInt() == 0) {
            this.A1R = null;
        } else {
            this.A1R = parcel.readString();
        }
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (InspirationRemixData) InspirationRemixData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = (InspirationInitialTextToolTextParams) InspirationInitialTextToolTextParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = (InspirationVideoEditingData) InspirationVideoEditingData.CREATOR.createFromParcel(parcel);
        }
        int readInt6 = parcel.readInt();
        InspirationVideoSegment[] inspirationVideoSegmentArr = new InspirationVideoSegment[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = DKG.A02(parcel, InspirationVideoSegment.CREATOR, inspirationVideoSegmentArr, i7);
        }
        this.A0t = ImmutableList.copyOf(inspirationVideoSegmentArr);
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = (InspirationArAdsConfiguration) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = (InspirationCameraConfiguration) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0u = null;
        } else {
            int readInt7 = parcel.readInt();
            ELz[] eLzArr = new ELz[readInt7];
            for (int i8 = 0; i8 < readInt7; i8++) {
                eLzArr[i8] = ELz.values()[parcel.readInt()];
            }
            this.A0u = ImmutableList.copyOf(eLzArr);
        }
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = (InspirationMultiCaptureReshootConfiguration) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (InspirationMultiCaptureState) InspirationMultiCaptureState.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A13 = null;
        } else {
            this.A13 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (InspirationPostAction) InspirationPostAction.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0k = null;
        } else {
            this.A0k = (InspirationStorySourceMetadata) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0v = null;
        } else {
            int readInt8 = parcel.readInt();
            InspirationVideoTemplate[] inspirationVideoTemplateArr = new InspirationVideoTemplate[readInt8];
            int i9 = 0;
            while (i9 < readInt8) {
                i9 = DKG.A02(parcel, InspirationVideoTemplate.CREATOR, inspirationVideoTemplateArr, i9);
            }
            this.A0v = ImmutableList.copyOf(inspirationVideoTemplateArr);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (InspirationVideoTemplate) InspirationVideoTemplate.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A12 = null;
        } else {
            this.A12 = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = EnumC3481Mez.values()[parcel.readInt()];
        }
        this.A1v = 1BM.A07(parcel);
        this.A1w = 1BM.A07(parcel);
        this.A1x = 1BM.A07(parcel);
        this.A1y = 1BM.A07(parcel);
        this.A1z = 1BM.A07(parcel);
        this.A20 = 1BM.A07(parcel);
        this.A21 = 1BM.A07(parcel);
        this.A22 = 1BM.A07(parcel);
        this.A23 = 1BM.A07(parcel);
        this.A24 = 1BM.A07(parcel);
        this.A25 = 1BM.A07(parcel);
        this.A26 = 1BM.A07(parcel);
        this.A27 = 1BM.A07(parcel);
        this.A28 = 1BM.A07(parcel);
        this.A29 = 1BM.A07(parcel);
        this.A2A = 1BM.A07(parcel);
        this.A2B = 1BM.A07(parcel);
        this.A2C = 1BM.A07(parcel);
        this.A2D = 1BM.A07(parcel);
        this.A2E = 1BM.A07(parcel);
        this.A2F = 1BM.A07(parcel);
        this.A2G = 1BM.A07(parcel);
        this.A2H = 1BM.A07(parcel);
        this.A2I = 1BM.A07(parcel);
        this.A2J = 1BM.A07(parcel);
        this.A2K = 1BM.A07(parcel);
        this.A2L = 1BM.A07(parcel);
        this.A2M = 1BM.A07(parcel);
        this.A2N = 1BM.A07(parcel);
        this.A2O = 1BM.A07(parcel);
        this.A2P = 1BM.A07(parcel);
        this.A2Q = 1BM.A07(parcel);
        this.A2R = 1BM.A07(parcel);
        this.A2S = 1BM.A07(parcel);
        this.A2T = 1BM.A07(parcel);
        this.A2U = 1BM.A07(parcel);
        this.A2V = 1BM.A07(parcel);
        this.A2W = 1BM.A07(parcel);
        this.A2X = 1BM.A07(parcel);
        this.A2Y = 1BM.A07(parcel);
        this.A2Z = 1BM.A07(parcel);
        this.A2a = 1BM.A07(parcel);
        this.A2b = 1BM.A07(parcel);
        this.A2c = 1BM.A07(parcel);
        this.A2d = 1BM.A07(parcel);
        this.A2e = 1BM.A07(parcel);
        this.A2f = 1BM.A07(parcel);
        this.A2g = 1BM.A07(parcel);
        this.A2h = 1BM.A07(parcel);
        this.A2i = 1BM.A07(parcel);
        this.A2j = 1BM.A07(parcel);
        this.A2k = 1BM.A07(parcel);
        this.A2l = 1BM.A07(parcel);
        this.A2m = 1BM.A07(parcel);
        this.A2n = 1BM.A07(parcel);
        this.A2o = 1BM.A07(parcel);
        this.A2p = 1BM.A07(parcel);
        this.A2q = 1BM.A07(parcel);
        this.A2r = 1BM.A07(parcel);
        this.A2s = 1BM.A07(parcel);
        this.A2t = 1BM.A07(parcel);
        this.A2u = 1BM.A07(parcel);
        this.A2v = 1BM.A07(parcel);
        this.A2w = 1BM.A07(parcel);
        this.A2x = 1BM.A07(parcel);
        this.A2y = 1BM.A07(parcel);
        this.A2z = 1BM.A07(parcel);
        this.A30 = 1BM.A07(parcel);
        this.A31 = 1BM.A07(parcel);
        this.A32 = 1BM.A07(parcel);
        this.A33 = 1BM.A07(parcel);
        this.A34 = 1BM.A07(parcel);
        this.A35 = 1BM.A07(parcel);
        this.A36 = 1BM.A07(parcel);
        this.A37 = 1BM.A07(parcel);
        this.A38 = 1BM.A07(parcel);
        this.A39 = 1BM.A07(parcel);
        this.A3A = 1BM.A07(parcel);
        this.A3B = 1BM.A07(parcel);
        this.A3C = 1BM.A07(parcel);
        this.A3D = 1BM.A07(parcel);
        this.A3E = 1BM.A07(parcel);
        this.A3F = 1BM.A07(parcel);
        this.A3G = 1BM.A07(parcel);
        this.A3H = 1BM.A07(parcel);
        this.A3I = 1BM.A07(parcel);
        this.A3J = 1BM.A07(parcel);
        this.A3K = 1BM.A07(parcel);
        this.A3L = 1BM.A07(parcel);
        this.A3M = 1BM.A07(parcel);
        this.A06 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A14 = null;
        } else {
            this.A14 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1S = null;
        } else {
            this.A1S = parcel.readString();
        }
        this.A07 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A09 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0w = null;
        } else {
            int readInt9 = parcel.readInt();
            String[] strArr = new String[readInt9];
            int i10 = 0;
            while (i10 < readInt9) {
                i10 = AbH.A00(parcel, strArr, i10);
            }
            this.A0w = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A1T = null;
        } else {
            this.A1T = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = (InspirationNUXConfiguration) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = Qp5.values()[parcel.readInt()];
        }
        this.A3N = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A1U = null;
        } else {
            this.A1U = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1V = null;
        } else {
            this.A1V = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0m = null;
        } else {
            this.A0m = (PlatformCameraShareConfiguration) PlatformCameraShareConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1W = null;
        } else {
            this.A1W = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1X = null;
        } else {
            this.A1X = parcel.readString();
        }
        int readInt10 = parcel.readInt();
        InspirationEffect[] inspirationEffectArr2 = new InspirationEffect[readInt10];
        int i11 = 0;
        while (i11 < readInt10) {
            i11 = DKG.A02(parcel, InspirationEffect.CREATOR, inspirationEffectArr2, i11);
        }
        this.A0x = ImmutableList.copyOf(inspirationEffectArr2);
        if (parcel.readInt() == 0) {
            this.A1Y = null;
        } else {
            this.A1Y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1Z = null;
        } else {
            this.A1Z = parcel.readString();
        }
        HashMap A0u = AnonymousClass001.A0u();
        int readInt11 = parcel.readInt();
        for (int i12 = 0; i12 < readInt11; i12++) {
            AnonymousClass001.A1A(parcel.readString(), A0u, parcel.readInt());
        }
        this.A11 = ImmutableMap.copyOf((Map) A0u);
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (SuggestionModel) SuggestionModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1a = null;
        } else {
            this.A1a = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1b = null;
        } else {
            this.A1b = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1c = null;
        } else {
            this.A1c = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1d = null;
        } else {
            this.A1d = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0y = null;
        } else {
            int readInt12 = parcel.readInt();
            RemoteAutoCreatedReelMediaItem[] remoteAutoCreatedReelMediaItemArr = new RemoteAutoCreatedReelMediaItem[readInt12];
            int i13 = 0;
            while (i13 < readInt12) {
                i13 = DKG.A02(parcel, RemoteAutoCreatedReelMediaItem.CREATOR, remoteAutoCreatedReelMediaItemArr, i13);
            }
            this.A0y = ImmutableList.copyOf(remoteAutoCreatedReelMediaItemArr);
        }
        if (parcel.readInt() == 0) {
            this.A0z = null;
        } else {
            int readInt13 = parcel.readInt();
            String[] strArr2 = new String[readInt13];
            int i14 = 0;
            while (i14 < readInt13) {
                i14 = AbH.A00(parcel, strArr2, i14);
            }
            this.A0z = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (ReshareToStoryMetadata) ReshareToStoryMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0n = null;
        } else {
            this.A0n = (InspirationRMSPlaceholderModel) InspirationRMSPlaceholderModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (RMSRecommendationData) RMSRecommendationData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1e = null;
        } else {
            this.A1e = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A10 = null;
        } else {
            int readInt14 = parcel.readInt();
            EQm[] eQmArr = new EQm[readInt14];
            for (int i15 = 0; i15 < readInt14; i15++) {
                eQmArr[i15] = EQm.values()[parcel.readInt()];
            }
            this.A10 = ImmutableList.copyOf(eQmArr);
        }
        this.A05 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A1f = null;
        } else {
            this.A1f = parcel.readString();
        }
        this.A3O = 1BM.A07(parcel);
        this.A3P = 1BM.A07(parcel);
        this.A3Q = 1BM.A07(parcel);
        this.A3R = 1BM.A07(parcel);
        this.A3S = 1BM.A07(parcel);
        this.A3T = 1BM.A07(parcel);
        this.A3U = 1BM.A07(parcel);
        this.A3V = 1BM.A07(parcel);
        this.A3W = 1BM.A07(parcel);
        this.A3X = 1BM.A07(parcel);
        this.A3Y = 1BM.A07(parcel);
        this.A3Z = 1BM.A07(parcel);
        this.A3a = 1BM.A07(parcel);
        this.A3b = 1BM.A07(parcel);
        this.A3c = 1BM.A07(parcel);
        this.A3d = 1BM.A07(parcel);
        this.A3e = 1BM.A07(parcel);
        this.A3f = 1BM.A07(parcel);
        this.A3g = 1BM.A07(parcel);
        this.A3h = 1BM.A07(parcel);
        this.A3i = 1BM.A07(parcel);
        this.A3j = 1BM.A07(parcel);
        this.A3k = 1BM.A07(parcel);
        this.A3l = 1BM.A07(parcel);
        this.A3m = 1BM.A07(parcel);
        this.A3n = 1BM.A07(parcel);
        this.A3o = 1BM.A07(parcel);
        this.A3p = 1BM.A07(parcel);
        this.A3q = 1BM.A07(parcel);
        this.A3r = 1BM.A07(parcel);
        this.A3s = 1BM.A07(parcel);
        this.A3t = 1BM.A07(parcel);
        this.A3u = 1BM.A07(parcel);
        this.A3v = 1BM.A07(parcel);
        this.A3w = 1BM.A07(parcel);
        this.A3x = 1BM.A07(parcel);
        this.A3y = 1BM.A07(parcel);
        this.A3z = 1BM.A07(parcel);
        this.A40 = 1BM.A07(parcel);
        this.A41 = 1BM.A07(parcel);
        this.A42 = 1BM.A07(parcel);
        this.A43 = 1BM.A07(parcel);
        this.A44 = 1BM.A07(parcel);
        this.A45 = 1BM.A07(parcel);
        this.A46 = 1BM.A07(parcel);
        this.A47 = 1BM.A07(parcel);
        this.A48 = 1BM.A07(parcel);
        this.A49 = 1BM.A07(parcel);
        this.A4A = 1BM.A07(parcel);
        this.A4B = 1BM.A07(parcel);
        this.A4C = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = (InspirationStartReason) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = EnumC3482Mf0.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1g = null;
        } else {
            this.A1g = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = (SuggestionComponentModel) SuggestionComponentModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = EnumC3484Mf2.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1h = null;
        } else {
            this.A1h = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1i = null;
        } else {
            this.A1i = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0l = null;
        } else {
            this.A0l = (InspirationThenAndNowModel) InspirationThenAndNowModel.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = EnumC3476Meu.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (TryItSurfaceContext) TryItSurfaceContext.CREATOR.createFromParcel(parcel);
        }
        this.A4D = 1BM.A07(parcel);
        this.A1j = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A1k = C3o5.A0O(parcel);
        this.A4E = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt15 = parcel.readInt();
        while (i < readInt15) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A1l = Collections.unmodifiableSet(A0v);
    }

    @Override // X.NAs
    public EnumC3488Mf7 Ah2() {
        if (this.A1l.contains("defaultOpenTrayInPostCaptureWhenOtherTraysAreDismissed")) {
            return this.A0J;
        }
        if (A4F == null) {
            synchronized (this) {
                if (A4F == null) {
                    A4F = EnumC3488Mf7.A0L;
                }
            }
        }
        return A4F;
    }

    @Override // X.NAs
    public ELz Aqe() {
        if (this.A1l.contains("initialFormType")) {
            return this.A0L;
        }
        if (A4G == null) {
            synchronized (this) {
                if (A4G == null) {
                    A4G = ELz.A09;
                }
            }
        }
        return A4G;
    }

    @Override // X.NAs
    public MfV Aqf() {
        if (this.A1l.contains("initialFormatMode")) {
            return this.A0M;
        }
        if (A4H == null) {
            synchronized (this) {
                if (A4H == null) {
                    A4H = MfV.A0l;
                }
            }
        }
        return A4H;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.N2D, java.lang.Object] */
    @Override // X.NAs
    public InspirationVideoEditingData Aql() {
        if (this.A1l.contains("initialVideoEditingData")) {
            return this.A0P;
        }
        if (A4J == null) {
            synchronized (this) {
                if (A4J == null) {
                    A4J = new InspirationVideoEditingData((N2D) new Object());
                }
            }
        }
        return A4J;
    }

    @Override // X.NAs
    public ImmutableList ArB() {
        if (this.A1l.contains("inspirationFormTypes")) {
            return this.A0u;
        }
        if (A4P == null) {
            synchronized (this) {
                if (A4P == null) {
                    A4P = ELz.A00;
                }
            }
        }
        return A4P;
    }

    @Override // X.NAs
    public InspirationPostAction ArF() {
        if (this.A1l.contains("inspirationPostAction")) {
            return this.A0O;
        }
        if (A4I == null) {
            synchronized (this) {
                if (A4I == null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    A4I = new InspirationPostAction(Qus.A02, QqK.A09, 4YV.A10("reason", 4YV.A0z("action", A0v, A0v)), false, false, false, true, false, false);
                }
            }
        }
        return A4I;
    }

    @Override // X.NAs
    public EnumC3481Mez ArP() {
        if (this.A1l.contains("instagramCrossPostingState")) {
            return this.A0c;
        }
        if (A4L == null) {
            synchronized (this) {
                if (A4L == null) {
                    A4L = EnumC3481Mez.A03;
                }
            }
        }
        return A4L;
    }

    @Override // X.NAs
    public Qp5 B0J() {
        if (this.A1l.contains("openSoundSyncActionType")) {
            return this.A0V;
        }
        if (A4K == null) {
            synchronized (this) {
                if (A4K == null) {
                    A4K = Qp5.A04;
                }
            }
        }
        return A4K;
    }

    @Override // X.NAs
    public ImmutableList B7d() {
        if (this.A1l.contains("requiredStyleCategories")) {
            return this.A0z;
        }
        if (A4Q == null) {
            synchronized (this) {
                if (A4Q == null) {
                    A4Q = ImmutableList.of((Object) "TEXT_MODE");
                }
            }
        }
        return A4Q;
    }

    @Override // X.NAs
    public InspirationStartReason BBz() {
        if (this.A1l.contains("startReason")) {
            return this.A0i;
        }
        if (A4N == null) {
            synchronized (this) {
                if (A4N == null) {
                    A4N = MhV.A00(EQv.A0Q, EPQ.A14, "inspiration");
                }
            }
        }
        return A4N;
    }

    @Override // X.NAs
    public EnumC3482Mf0 BC5() {
        if (this.A1l.contains("startingMode")) {
            return this.A0j;
        }
        if (A4O == null) {
            synchronized (this) {
                if (A4O == null) {
                    A4O = EnumC3482Mf0.A02;
                }
            }
        }
        return A4O;
    }

    @Override // X.NAs
    public EnumC3476Meu BGx() {
        if (this.A1l.contains("trashUnificationSupportEnabledEntryPoint")) {
            return this.A0e;
        }
        if (A4M == null) {
            synchronized (this) {
                if (A4M == null) {
                    A4M = EnumC3476Meu.A03;
                }
            }
        }
        return A4M;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationConfiguration)) {
                return false;
            }
            InspirationConfiguration inspirationConfiguration = (InspirationConfiguration) obj;
            if (!11T.A0O(this.A15, inspirationConfiguration.A15) || this.A1m != inspirationConfiguration.A1m || this.A1n != inspirationConfiguration.A1n || this.A1o != inspirationConfiguration.A1o || !11T.A0O(this.A16, inspirationConfiguration.A16) || !11T.A0O(this.A17, inspirationConfiguration.A17) || !11T.A0O(this.A18, inspirationConfiguration.A18) || !11T.A0O(this.A19, inspirationConfiguration.A19) || this.A1p != inspirationConfiguration.A1p || !11T.A0O(this.A1A, inspirationConfiguration.A1A) || !11T.A0O(this.A1B, inspirationConfiguration.A1B) || this.A00 != inspirationConfiguration.A00 || !11T.A0O(this.A1C, inspirationConfiguration.A1C) || !11T.A0O(this.A1D, inspirationConfiguration.A1D) || !11T.A0O(this.A1E, inspirationConfiguration.A1E) || this.A0E != inspirationConfiguration.A0E || !11T.A0O(this.A0o, inspirationConfiguration.A0o) || !11T.A0O(this.A1F, inspirationConfiguration.A1F) || !11T.A0O(this.A1G, inspirationConfiguration.A1G) || this.A0Z != inspirationConfiguration.A0Z || this.A0X != inspirationConfiguration.A0X || !11T.A0O(this.A1H, inspirationConfiguration.A1H) || !11T.A0O(this.A1I, inspirationConfiguration.A1I) || this.A01 != inspirationConfiguration.A01 || this.A0I != inspirationConfiguration.A0I || Ah2() != inspirationConfiguration.Ah2() || this.A1q != inspirationConfiguration.A1q || this.A1r != inspirationConfiguration.A1r || !11T.A0O(this.A0f, inspirationConfiguration.A0f) || this.A1s != inspirationConfiguration.A1s || this.A1t != inspirationConfiguration.A1t || !11T.A0O(this.A1J, inspirationConfiguration.A1J) || !11T.A0O(this.A0C, inspirationConfiguration.A0C) || !11T.A0O(this.A0Y, inspirationConfiguration.A0Y) || !11T.A0O(this.A1K, inspirationConfiguration.A1K) || !11T.A0O(this.A0D, inspirationConfiguration.A0D) || !11T.A0O(this.A0H, inspirationConfiguration.A0H) || !11T.A0O(this.A1L, inspirationConfiguration.A1L) || !11T.A0O(this.A1M, inspirationConfiguration.A1M) || this.A1u != inspirationConfiguration.A1u || !11T.A0O(this.A0p, inspirationConfiguration.A0p) || !11T.A0O(this.A0q, inspirationConfiguration.A0q) || this.A02 != inspirationConfiguration.A02 || !11T.A0O(this.A1N, inspirationConfiguration.A1N) || !11T.A0O(this.A0T, inspirationConfiguration.A0T) || !11T.A0O(this.A1O, inspirationConfiguration.A1O) || !11T.A0O(this.A1P, inspirationConfiguration.A1P) || !11T.A0O(this.A0r, inspirationConfiguration.A0r) || Aqe() != inspirationConfiguration.Aqe() || Aqf() != inspirationConfiguration.Aqf() || !11T.A0O(this.A1Q, inspirationConfiguration.A1Q) || !11T.A0O(this.A0s, inspirationConfiguration.A0s) || !11T.A0O(this.A1R, inspirationConfiguration.A1R) || this.A03 != inspirationConfiguration.A03 || !11T.A0O(this.A0K, inspirationConfiguration.A0K) || !11T.A0O(this.A0F, inspirationConfiguration.A0F) || !11T.A0O(this.A0G, inspirationConfiguration.A0G) || !11T.A0O(this.A0S, inspirationConfiguration.A0S) || !11T.A0O(Aql(), inspirationConfiguration.Aql()) || !11T.A0O(this.A0t, inspirationConfiguration.A0t) || !11T.A0O(this.A0a, inspirationConfiguration.A0a) || !11T.A0O(this.A0b, inspirationConfiguration.A0b) || !11T.A0O(ArB(), inspirationConfiguration.ArB()) || !11T.A0O(this.A0g, inspirationConfiguration.A0g) || !11T.A0O(this.A0N, inspirationConfiguration.A0N) || !11T.A0O(this.A13, inspirationConfiguration.A13) || !11T.A0O(ArF(), inspirationConfiguration.ArF()) || !11T.A0O(this.A0k, inspirationConfiguration.A0k) || !11T.A0O(this.A0v, inspirationConfiguration.A0v) || !11T.A0O(this.A0Q, inspirationConfiguration.A0Q) || !11T.A0O(this.A12, inspirationConfiguration.A12) || ArP() != inspirationConfiguration.ArP() || this.A1v != inspirationConfiguration.A1v || this.A1w != inspirationConfiguration.A1w || this.A1x != inspirationConfiguration.A1x || this.A1y != inspirationConfiguration.A1y || this.A1z != inspirationConfiguration.A1z || this.A20 != inspirationConfiguration.A20 || this.A21 != inspirationConfiguration.A21 || this.A22 != inspirationConfiguration.A22 || this.A23 != inspirationConfiguration.A23 || this.A24 != inspirationConfiguration.A24 || this.A25 != inspirationConfiguration.A25 || this.A26 != inspirationConfiguration.A26 || this.A27 != inspirationConfiguration.A27 || this.A28 != inspirationConfiguration.A28 || this.A29 != inspirationConfiguration.A29 || this.A2A != inspirationConfiguration.A2A || this.A2B != inspirationConfiguration.A2B || this.A2C != inspirationConfiguration.A2C || this.A2D != inspirationConfiguration.A2D || this.A2E != inspirationConfiguration.A2E || this.A2F != inspirationConfiguration.A2F || this.A2G != inspirationConfiguration.A2G || this.A2H != inspirationConfiguration.A2H || this.A2I != inspirationConfiguration.A2I || this.A2J != inspirationConfiguration.A2J || this.A2K != inspirationConfiguration.A2K || this.A2L != inspirationConfiguration.A2L || this.A2M != inspirationConfiguration.A2M || this.A2N != inspirationConfiguration.A2N || this.A2O != inspirationConfiguration.A2O || this.A2P != inspirationConfiguration.A2P || this.A2Q != inspirationConfiguration.A2Q || this.A2R != inspirationConfiguration.A2R || this.A2S != inspirationConfiguration.A2S || this.A2T != inspirationConfiguration.A2T || this.A2U != inspirationConfiguration.A2U || this.A2V != inspirationConfiguration.A2V || this.A2W != inspirationConfiguration.A2W || this.A2X != inspirationConfiguration.A2X || this.A2Y != inspirationConfiguration.A2Y || this.A2Z != inspirationConfiguration.A2Z || this.A2a != inspirationConfiguration.A2a || this.A2b != inspirationConfiguration.A2b || this.A2c != inspirationConfiguration.A2c || this.A2d != inspirationConfiguration.A2d || this.A2e != inspirationConfiguration.A2e || this.A2f != inspirationConfiguration.A2f || this.A2g != inspirationConfiguration.A2g || this.A2h != inspirationConfiguration.A2h || this.A2i != inspirationConfiguration.A2i || this.A2j != inspirationConfiguration.A2j || this.A2k != inspirationConfiguration.A2k || this.A2l != inspirationConfiguration.A2l || this.A2m != inspirationConfiguration.A2m || this.A2n != inspirationConfiguration.A2n || this.A2o != inspirationConfiguration.A2o || this.A2p != inspirationConfiguration.A2p || this.A2q != inspirationConfiguration.A2q || this.A2r != inspirationConfiguration.A2r || this.A2s != inspirationConfiguration.A2s || this.A2t != inspirationConfiguration.A2t || this.A2u != inspirationConfiguration.A2u || this.A2v != inspirationConfiguration.A2v || this.A2w != inspirationConfiguration.A2w || this.A2x != inspirationConfiguration.A2x || this.A2y != inspirationConfiguration.A2y || this.A2z != inspirationConfiguration.A2z || this.A30 != inspirationConfiguration.A30 || this.A31 != inspirationConfiguration.A31 || this.A32 != inspirationConfiguration.A32 || this.A33 != inspirationConfiguration.A33 || this.A34 != inspirationConfiguration.A34 || this.A35 != inspirationConfiguration.A35 || this.A36 != inspirationConfiguration.A36 || this.A37 != inspirationConfiguration.A37 || this.A38 != inspirationConfiguration.A38 || this.A39 != inspirationConfiguration.A39 || this.A3A != inspirationConfiguration.A3A || this.A3B != inspirationConfiguration.A3B || this.A3C != inspirationConfiguration.A3C || this.A3D != inspirationConfiguration.A3D || this.A3E != inspirationConfiguration.A3E || this.A3F != inspirationConfiguration.A3F || this.A3G != inspirationConfiguration.A3G || this.A3H != inspirationConfiguration.A3H || this.A3I != inspirationConfiguration.A3I || this.A3J != inspirationConfiguration.A3J || this.A3K != inspirationConfiguration.A3K || this.A3L != inspirationConfiguration.A3L || this.A3M != inspirationConfiguration.A3M || this.A06 != inspirationConfiguration.A06 || !11T.A0O(this.A14, inspirationConfiguration.A14) || !11T.A0O(this.A1S, inspirationConfiguration.A1S) || this.A07 != inspirationConfiguration.A07 || this.A08 != inspirationConfiguration.A08 || this.A09 != inspirationConfiguration.A09 || !11T.A0O(this.A0w, inspirationConfiguration.A0w) || !11T.A0O(this.A1T, inspirationConfiguration.A1T) || !11T.A0O(this.A0h, inspirationConfiguration.A0h) || B0J() != inspirationConfiguration.B0J() || this.A3N != inspirationConfiguration.A3N || !11T.A0O(this.A1U, inspirationConfiguration.A1U) || !11T.A0O(this.A1V, inspirationConfiguration.A1V) || !11T.A0O(this.A0m, inspirationConfiguration.A0m) || !11T.A0O(this.A1W, inspirationConfiguration.A1W) || !11T.A0O(this.A1X, inspirationConfiguration.A1X) || !11T.A0O(this.A0x, inspirationConfiguration.A0x) || !11T.A0O(this.A1Y, inspirationConfiguration.A1Y) || !11T.A0O(this.A1Z, inspirationConfiguration.A1Z) || !11T.A0O(this.A11, inspirationConfiguration.A11) || this.A04 != inspirationConfiguration.A04 || !11T.A0O(this.A0A, inspirationConfiguration.A0A) || !11T.A0O(this.A1a, inspirationConfiguration.A1a) || !11T.A0O(this.A1b, inspirationConfiguration.A1b) || !11T.A0O(this.A1c, inspirationConfiguration.A1c) || !11T.A0O(this.A1d, inspirationConfiguration.A1d) || !11T.A0O(this.A0y, inspirationConfiguration.A0y) || !11T.A0O(B7d(), inspirationConfiguration.B7d()) || !11T.A0O(this.A0U, inspirationConfiguration.A0U) || !11T.A0O(this.A0n, inspirationConfiguration.A0n) || !11T.A0O(this.A0W, inspirationConfiguration.A0W) || !11T.A0O(this.A1e, inspirationConfiguration.A1e) || !11T.A0O(this.A10, inspirationConfiguration.A10) || this.A05 != inspirationConfiguration.A05 || !11T.A0O(this.A1f, inspirationConfiguration.A1f) || this.A3O != inspirationConfiguration.A3O || this.A3P != inspirationConfiguration.A3P || this.A3Q != inspirationConfiguration.A3Q || this.A3R != inspirationConfiguration.A3R || this.A3S != inspirationConfiguration.A3S || this.A3T != inspirationConfiguration.A3T || this.A3U != inspirationConfiguration.A3U || this.A3V != inspirationConfiguration.A3V || this.A3W != inspirationConfiguration.A3W || this.A3X != inspirationConfiguration.A3X || this.A3Y != inspirationConfiguration.A3Y || this.A3Z != inspirationConfiguration.A3Z || this.A3a != inspirationConfiguration.A3a || this.A3b != inspirationConfiguration.A3b || this.A3c != inspirationConfiguration.A3c || this.A3d != inspirationConfiguration.A3d || this.A3e != inspirationConfiguration.A3e || this.A3f != inspirationConfiguration.A3f || this.A3g != inspirationConfiguration.A3g || this.A3h != inspirationConfiguration.A3h || this.A3i != inspirationConfiguration.A3i || this.A3j != inspirationConfiguration.A3j || this.A3k != inspirationConfiguration.A3k || this.A3l != inspirationConfiguration.A3l || this.A3m != inspirationConfiguration.A3m || this.A3n != inspirationConfiguration.A3n || this.A3o != inspirationConfiguration.A3o || this.A3p != inspirationConfiguration.A3p || this.A3q != inspirationConfiguration.A3q || this.A3r != inspirationConfiguration.A3r || this.A3s != inspirationConfiguration.A3s || this.A3t != inspirationConfiguration.A3t || this.A3u != inspirationConfiguration.A3u || this.A3v != inspirationConfiguration.A3v || this.A3w != inspirationConfiguration.A3w || this.A3x != inspirationConfiguration.A3x || this.A3y != inspirationConfiguration.A3y || this.A3z != inspirationConfiguration.A3z || this.A40 != inspirationConfiguration.A40 || this.A41 != inspirationConfiguration.A41 || this.A42 != inspirationConfiguration.A42 || this.A43 != inspirationConfiguration.A43 || this.A44 != inspirationConfiguration.A44 || this.A45 != inspirationConfiguration.A45 || this.A46 != inspirationConfiguration.A46 || this.A47 != inspirationConfiguration.A47 || this.A48 != inspirationConfiguration.A48 || this.A49 != inspirationConfiguration.A49 || this.A4A != inspirationConfiguration.A4A || this.A4B != inspirationConfiguration.A4B || this.A4C != inspirationConfiguration.A4C || !11T.A0O(BBz(), inspirationConfiguration.BBz()) || BC5() != inspirationConfiguration.BC5() || !11T.A0O(this.A1g, inspirationConfiguration.A1g) || !11T.A0O(this.A0R, inspirationConfiguration.A0R) || this.A0d != inspirationConfiguration.A0d || !11T.A0O(this.A1h, inspirationConfiguration.A1h) || !11T.A0O(this.A1i, inspirationConfiguration.A1i) || !11T.A0O(this.A0l, inspirationConfiguration.A0l) || BGx() != inspirationConfiguration.BGx() || !11T.A0O(this.A0B, inspirationConfiguration.A0B) || this.A4D != inspirationConfiguration.A4D || !11T.A0O(this.A1j, inspirationConfiguration.A1j) || !11T.A0O(this.A1k, inspirationConfiguration.A1k) || this.A4E != inspirationConfiguration.A4E) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A1E, C1pq.A04(this.A1D, C1pq.A04(this.A1C, (C1pq.A04(this.A1B, C1pq.A04(this.A1A, C1pq.A02(C1pq.A04(this.A19, C1pq.A04(this.A18, C1pq.A04(this.A17, C1pq.A04(this.A16, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A15), this.A1m), this.A1n), this.A1o))))), this.A1p))) * 31) + this.A00)));
        int A042 = C1pq.A04(this.A1G, C1pq.A04(this.A1F, C1pq.A04(this.A0o, (A04 * 31) + C3o5.A03(this.A0E))));
        int A03 = (A042 * 31) + C3o5.A03(this.A0Z);
        int A043 = (C1pq.A04(this.A1I, C1pq.A04(this.A1H, (A03 * 31) + C3o5.A03(this.A0X))) * 31) + this.A01;
        int A032 = (A043 * 31) + C3o5.A03(this.A0I);
        int A044 = C1pq.A04(this.A0r, C1pq.A04(this.A1P, C1pq.A04(this.A1O, C1pq.A04(this.A0T, C1pq.A04(this.A1N, (C1pq.A04(this.A0q, C1pq.A04(this.A0p, C1pq.A02(C1pq.A04(this.A1M, C1pq.A04(this.A1L, C1pq.A04(this.A0H, C1pq.A04(this.A0D, C1pq.A04(this.A1K, C1pq.A04(this.A0Y, C1pq.A04(this.A0C, C1pq.A04(this.A1J, C1pq.A02(C1pq.A02(C1pq.A04(this.A0f, C1pq.A02(C1pq.A02((A032 * 31) + C3o5.A03(Ah2()), this.A1q), this.A1r)), this.A1s), this.A1t))))))))), this.A1u))) * 31) + this.A02)))));
        int A033 = (A044 * 31) + C3o5.A03(Aqe());
        int A045 = C1pq.A04(this.A12, C1pq.A04(this.A0Q, C1pq.A04(this.A0v, C1pq.A04(this.A0k, C1pq.A04(ArF(), C1pq.A04(this.A13, C1pq.A04(this.A0N, C1pq.A04(this.A0g, C1pq.A04(ArB(), C1pq.A04(this.A0b, C1pq.A04(this.A0a, C1pq.A04(this.A0t, C1pq.A04(Aql(), C1pq.A04(this.A0S, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A0K, (C1pq.A04(this.A1R, C1pq.A04(this.A0s, C1pq.A04(this.A1Q, (A033 * 31) + C3o5.A03(Aqf())))) * 31) + this.A03)))))))))))))))));
        int A046 = C1pq.A04(this.A0h, C1pq.A04(this.A1T, C1pq.A04(this.A0w, C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A04(this.A1S, C1pq.A04(this.A14, C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((A045 * 31) + C3o5.A03(ArP()), this.A1v), this.A1w), this.A1x), this.A1y), this.A1z), this.A20), this.A21), this.A22), this.A23), this.A24), this.A25), this.A26), this.A27), this.A28), this.A29), this.A2A), this.A2B), this.A2C), this.A2D), this.A2E), this.A2F), this.A2G), this.A2H), this.A2I), this.A2J), this.A2K), this.A2L), this.A2M), this.A2N), this.A2O), this.A2P), this.A2Q), this.A2R), this.A2S), this.A2T), this.A2U), this.A2V), this.A2W), this.A2X), this.A2Y), this.A2Z), this.A2a), this.A2b), this.A2c), this.A2d), this.A2e), this.A2f), this.A2g), this.A2h), this.A2i), this.A2j), this.A2k), this.A2l), this.A2m), this.A2n), this.A2o), this.A2p), this.A2q), this.A2r), this.A2s), this.A2t), this.A2u), this.A2v), this.A2w), this.A2x), this.A2y), this.A2z), this.A30), this.A31), this.A32), this.A33), this.A34), this.A35), this.A36), this.A37), this.A38), this.A39), this.A3A), this.A3B), this.A3C), this.A3D), this.A3E), this.A3F), this.A3G), this.A3H), this.A3I), this.A3J), this.A3K), this.A3L), this.A3M), this.A06))), this.A07), this.A08), this.A09))));
        int A047 = C1pq.A04(BBz(), C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A1f, (C1pq.A04(this.A10, C1pq.A04(this.A1e, C1pq.A04(this.A0W, C1pq.A04(this.A0n, C1pq.A04(this.A0U, C1pq.A04(B7d(), C1pq.A04(this.A0y, C1pq.A04(this.A1d, C1pq.A04(this.A1c, C1pq.A04(this.A1b, C1pq.A04(this.A1a, C1pq.A04(this.A0A, (C1pq.A04(this.A11, C1pq.A04(this.A1Z, C1pq.A04(this.A1Y, C1pq.A04(this.A0x, C1pq.A04(this.A1X, C1pq.A04(this.A1W, C1pq.A04(this.A0m, C1pq.A04(this.A1V, C1pq.A04(this.A1U, C1pq.A02((A046 * 31) + C3o5.A03(B0J()), this.A3N)))))))))) * 31) + this.A04)))))))))))) * 31) + this.A05), this.A3O), this.A3P), this.A3Q), this.A3R), this.A3S), this.A3T), this.A3U), this.A3V), this.A3W), this.A3X), this.A3Y), this.A3Z), this.A3a), this.A3b), this.A3c), this.A3d), this.A3e), this.A3f), this.A3g), this.A3h), this.A3i), this.A3j), this.A3k), this.A3l), this.A3m), this.A3n), this.A3o), this.A3p), this.A3q), this.A3r), this.A3s), this.A3t), this.A3u), this.A3v), this.A3w), this.A3x), this.A3y), this.A3z), this.A40), this.A41), this.A42), this.A43), this.A44), this.A45), this.A46), this.A47), this.A48), this.A49), this.A4A), this.A4B), this.A4C));
        int A048 = C1pq.A04(this.A0R, C1pq.A04(this.A1g, (A047 * 31) + C3o5.A03(BC5())));
        int A049 = C1pq.A04(this.A0l, C1pq.A04(this.A1i, C1pq.A04(this.A1h, (A048 * 31) + C3o5.A03(this.A0d))));
        return C1pq.A02(C1pq.A04(this.A1k, C1pq.A04(this.A1j, C1pq.A02(C1pq.A04(this.A0B, (A049 * 31) + DKF.A04(BGx())), this.A4D))), this.A4E);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationConfiguration{aggregationPageSessionId=");
        A0k.append(this.A15);
        A0k.append(", allowsBoxCropMode=");
        A0k.append(this.A1m);
        A0k.append(", allowsPeopleTaggingMode=");
        A0k.append(this.A1n);
        A0k.append(", allowsProductTaggingMode=");
        A0k.append(this.A1o);
        A0k.append(", arGameCameraType=");
        A0k.append(this.A16);
        A0k.append(", arGameID=");
        A0k.append(this.A17);
        A0k.append(", arGamePayload=");
        A0k.append(this.A18);
        A0k.append(", arGamePromiseId=");
        A0k.append(this.A19);
        A0k.append(", areButtonLabelsClickable=");
        A0k.append(this.A1p);
        A0k.append(", artistId=");
        A0k.append(this.A1A);
        A0k.append(", artistName=");
        A0k.append(this.A1B);
        A0k.append(", backgroundPlaceholderColor=");
        A0k.append(this.A00);
        A0k.append(", cameraButtonTooltipDescriptionText=");
        A0k.append(this.A1C);
        A0k.append(", cameraButtonTooltipTitleText=");
        A0k.append(this.A1D);
        A0k.append(", cameraPostContextSource=");
        A0k.append(this.A1E);
        A0k.append(", cameraRollDataPrivacyAccess=");
        A0k.append(this.A0E);
        A0k.append(", capturedMedia=");
        A0k.append(this.A0o);
        A0k.append(", challengeId=");
        A0k.append(this.A1F);
        A0k.append(", challengePrompt=");
        A0k.append(this.A1G);
        A0k.append(", closeCameraTransition=");
        A0k.append(this.A0Z);
        A0k.append(", composerSourceScreen=");
        A0k.append(this.A0X);
        A0k.append(", customizedBackgroundUri=");
        A0k.append(this.A1H);
        A0k.append(", defaultEffectsTrayCategory=");
        A0k.append(this.A1I);
        A0k.append(", defaultGestureLayoutVisibility=");
        A0k.append(this.A01);
        A0k.append(", defaultOpenTray=");
        A0k.append(this.A0I);
        A0k.append(", defaultOpenTrayInPostCaptureWhenOtherTraysAreDismissed=");
        A0k.append(Ah2());
        A0k.append(", disableCanvasLetterboxing=");
        A0k.append(this.A1q);
        A0k.append(", disableSSIMCalculation=");
        A0k.append(this.A1r);
        A0k.append(", draftTrackingInfo=");
        A0k.append(this.A0f);
        A0k.append(", enableCameraMovableOverlays=");
        A0k.append(this.A1s);
        A0k.append(", enableNewEffectsInLive=");
        A0k.append(this.A1t);
        A0k.append(", entryAnimationType=");
        A0k.append(this.A1J);
        A0k.append(", eventsInspirationConfiguration=");
        A0k.append(this.A0C);
        A0k.append(", facecastConfiguration=");
        A0k.append(this.A0Y);
        A0k.append(", feedPostId=");
        A0k.append(this.A1K);
        A0k.append(", goodwillInspirationComposerLoggingParams=");
        A0k.append(this.A0D);
        A0k.append(", groupInspirationConfiguration=");
        A0k.append(this.A0H);
        A0k.append(", hashtagId=");
        A0k.append(this.A1L);
        A0k.append(", hashtagName=");
        A0k.append(this.A1M);
        A0k.append(", hideReelsBranding=");
        A0k.append(this.A1u);
        A0k.append(", initialAddYoursTemplateOverlayParams=");
        A0k.append(this.A0p);
        A0k.append(", initialAdditionalRemixableVideoAssetMetaData=");
        A0k.append(this.A0q);
        A0k.append(", initialAudioSourceType=");
        A0k.append(this.A02);
        A0k.append(", initialBackdropPrompt=");
        A0k.append(this.A1N);
        A0k.append(", initialBackdropSticker=");
        A0k.append(this.A0T);
        A0k.append(", initialBackdropUri=");
        A0k.append(this.A1O);
        A0k.append(", initialComposerSessionId=");
        A0k.append(this.A1P);
        A0k.append(", initialEffects=");
        A0k.append(this.A0r);
        A0k.append(", initialFormType=");
        A0k.append(Aqe());
        A0k.append(", initialFormatMode=");
        A0k.append(Aqf());
        A0k.append(", initialMagicModPrompt=");
        A0k.append(this.A1Q);
        A0k.append(", initialMovableOverlayParams=");
        A0k.append(this.A0s);
        A0k.append(", initialMusicAssetId=");
        A0k.append(this.A1R);
        A0k.append(", initialMusicStartTimeMs=");
        A0k.append(this.A03);
        A0k.append(", initialRemixData=");
        A0k.append(this.A0K);
        A0k.append(", initialTextForShareSheet=");
        A0k.append(this.A0F);
        A0k.append(", initialTextForStructuredComposer=");
        A0k.append(this.A0G);
        A0k.append(", initialTextForTextToolParams=");
        A0k.append(this.A0S);
        A0k.append(", initialVideoEditingData=");
        A0k.append(Aql());
        A0k.append(", initialVideoSegments=");
        A0k.append(this.A0t);
        A0k.append(", inspirationArAdsConfiguration=");
        A0k.append(this.A0a);
        A0k.append(", inspirationCameraConfiguration=");
        A0k.append(this.A0b);
        A0k.append(", inspirationFormTypes=");
        A0k.append(ArB());
        A0k.append(", inspirationMultiCaptureReshootConfiguration=");
        A0k.append(this.A0g);
        A0k.append(", inspirationMultiCaptureState=");
        A0k.append(this.A0N);
        A0k.append(", inspirationNavigationButtonType=");
        A0k.append(this.A13);
        A0k.append(", inspirationPostAction=");
        A0k.append(ArF());
        A0k.append(", inspirationStorySourceMetadata=");
        A0k.append(this.A0k);
        A0k.append(", inspirationTemplateSuggestions=");
        A0k.append(this.A0v);
        A0k.append(", inspirationVideoTemplate=");
        A0k.append(this.A0Q);
        A0k.append(", inspirationZoomCropGestureAutoZoomScale=");
        A0k.append(this.A12);
        A0k.append(", instagramCrossPostingState=");
        A0k.append(ArP());
        A0k.append(", isArGameEffect=");
        A0k.append(this.A1v);
        A0k.append(", isAssistiveAudioEnabled=");
        A0k.append(this.A1w);
        A0k.append(", isAttributedMusic=");
        A0k.append(this.A1x);
        A0k.append(", isAudioBrowserTryOnEnabled=");
        A0k.append(this.A1y);
        A0k.append(", isAudioOnlyMode=");
        A0k.append(this.A1z);
        A0k.append(", isAutoAddMusicForSingleClipEnabled=");
        A0k.append(this.A20);
        A0k.append(", isAutoAttributedLicensedMusic=");
        A0k.append(this.A21);
        A0k.append(", isAutoCreatedReel=");
        A0k.append(this.A22);
        A0k.append(", isAvatarStoryStickerModeEnabled=");
        A0k.append(this.A23);
        A0k.append(", isBackgroundSelectorEnabled=");
        A0k.append(this.A24);
        A0k.append(", isCFBottomSheetDisabled=");
        A0k.append(this.A25);
        A0k.append(", isCameraRollEnabled=");
        A0k.append(this.A26);
        A0k.append(", isCameraShortcutDialogEnabled=");
        A0k.append(this.A27);
        A0k.append(", isCaptureOnly=");
        A0k.append(this.A28);
        A0k.append(", isCollageEnabled=");
        A0k.append(this.A29);
        A0k.append(", isCrossPlatformMentionStickerEnabled=");
        A0k.append(this.A2A);
        A0k.append(", isDoodleEnabled=");
        A0k.append(this.A2B);
        A0k.append(", isDynamicToolbarEnabled=");
        A0k.append(this.A2C);
        A0k.append(", isEditableStickersDisabled=");
        A0k.append(this.A2D);
        A0k.append(", isEffectsEnabled=");
        A0k.append(this.A2E);
        A0k.append(", isEffectsUnificationCameraLayoutInShortsEnabled=");
        A0k.append(this.A2F);
        A0k.append(", isFooterEnabled=");
        A0k.append(this.A2G);
        A0k.append(", isFromCameraCapture=");
        A0k.append(this.A2H);
        A0k.append(", isFromFeedComposer=");
        A0k.append(this.A2I);
        A0k.append(", isFromHomebase=");
        A0k.append(this.A2J);
        A0k.append(", isFromHomebaseSprout=");
        A0k.append(this.A2K);
        A0k.append(", isFromNotification=");
        A0k.append(this.A2L);
        A0k.append(", isFromReelsDraft=");
        A0k.append(this.A2M);
        A0k.append(", isFromSoundSyncMidCard=");
        A0k.append(this.A2N);
        A0k.append(", isFromStoriesDraft=");
        A0k.append(this.A2O);
        A0k.append(", isFromStoryViewer=");
        A0k.append(this.A2P);
        A0k.append(", isFundraisingStickerEnabled=");
        A0k.append(this.A2Q);
        A0k.append(", isGiphyStickerEnabled=");
        A0k.append(this.A2R);
        A0k.append(", isGreenScreenEnabled=");
        A0k.append(this.A2S);
        A0k.append(", isGreenScreenEnabledForMimicry=");
        A0k.append(this.A2T);
        A0k.append(", isImmersiveReelsReshare=");
        A0k.append(this.A2U);
        A0k.append(", isInlineEffectsTrayEnabled=");
        A0k.append(this.A2V);
        A0k.append(", isLandscapeOrientationEnabled=");
        A0k.append(this.A2W);
        A0k.append(", isLaunchedFromCameraShortcut=");
        A0k.append(this.A2X);
        A0k.append(", isLaunchedFromFeedReShareFlow=");
        A0k.append(this.A2Y);
        A0k.append(", isMagicMontageEnabled=");
        A0k.append(this.A2Z);
        A0k.append(", isMoments=");
        A0k.append(this.A2a);
        A0k.append(", isMultiCaptureTimelineEditorEnabled=");
        A0k.append(this.A2b);
        A0k.append(", isMultimediaEnabled=");
        A0k.append(this.A2c);
        A0k.append(", isMusicEnabledOnSavedShortVideos=");
        A0k.append(this.A2d);
        A0k.append(", isMusicFirstSoundSyncFlowEnabled=");
        A0k.append(this.A2e);
        A0k.append(", isMusicPickerEnabled=");
        A0k.append(this.A2f);
        A0k.append(", isMusicPickerVideoIconDisabled=");
        A0k.append(this.A2g);
        A0k.append(", isMusicStickerEnabled=");
        A0k.append(this.A2h);
        A0k.append(", isMusicToolDisabledOverride=");
        A0k.append(this.A2i);
        A0k.append(", isMusicToolEnabled=");
        A0k.append(this.A2j);
        A0k.append(", isNameStickerEnabled=");
        A0k.append(this.A2k);
        A0k.append(", isNonCrossPostableIGStickersDisabled=");
        A0k.append(this.A2l);
        A0k.append(", isPhotoImportEnabled=");
        A0k.append(this.A2m);
        A0k.append(", isPhotoPreviewDisabled=");
        A0k.append(this.A2n);
        A0k.append(", isPostCaptureEffectsEnabled=");
        A0k.append(this.A2o);
        A0k.append(", isPostCaptureSuggestionStickerTrayEnabled=");
        A0k.append(this.A2p);
        A0k.append(", isPreCaptureBugReportingEnabled=");
        A0k.append(this.A2q);
        A0k.append(", isPreCaptureStepEnabled=");
        A0k.append(this.A2r);
        A0k.append(", isPreCaptureVideoSpeedToolEnabled=");
        A0k.append(this.A2s);
        A0k.append(", isPrecaptureVerticalToolbarEnabled=");
        A0k.append(this.A2t);
        A0k.append(", isProductStickerEnabledForPage=");
        A0k.append(this.A2u);
        A0k.append(", isRMSCollageEnabled=");
        A0k.append(this.A2v);
        A0k.append(", isRMSUseCaseEnabled=");
        A0k.append(this.A2w);
        A0k.append(", isReactionReels=");
        A0k.append(this.A2x);
        A0k.append(", isReadyMadeSuggestedStories=");
        A0k.append(this.A2y);
        A0k.append(", isReelsGalleryMultiSelectEnabled=");
        A0k.append(this.A2z);
        A0k.append(", isReelsPreCaptureEffectsSystemEnabled=");
        A0k.append(this.A30);
        A0k.append(", isSaveButtonEnabled=");
        A0k.append(this.A31);
        A0k.append(", isSaveButtonEnabledForCameraCaptures=");
        A0k.append(this.A32);
        A0k.append(", isSessionSaverDisabled=");
        A0k.append(this.A33);
        A0k.append(", isSoundToolButtonEnabled=");
        A0k.append(this.A34);
        A0k.append(", isStickerEnabled=");
        A0k.append(this.A35);
        A0k.append(", isStickerPrefetchDisabled=");
        A0k.append(this.A36);
        A0k.append(", isStoriesImagineEnabled=");
        A0k.append(this.A37);
        A0k.append(", isStoriesRecap=");
        A0k.append(this.A38);
        A0k.append(", isTextEnabled=");
        A0k.append(this.A39);
        A0k.append(", isTextToolMentionDisabled=");
        A0k.append(this.A3A);
        A0k.append(", isTimedElementEnabled=");
        A0k.append(this.A3B);
        A0k.append(", isUegBoomerangButtonEnabled=");
        A0k.append(this.A3C);
        A0k.append(", isUegCaptionButtonEnabled=");
        A0k.append(this.A3D);
        A0k.append(", isUegMuteButtonEnabled=");
        A0k.append(this.A3E);
        A0k.append(", isUegVerticalToolbarEnabled=");
        A0k.append(this.A3F);
        A0k.append(", isUnifiedAudioControlsSupported=");
        A0k.append(this.A3G);
        A0k.append(", isVTSAnimationsEffectsSupported=");
        A0k.append(this.A3H);
        A0k.append(", isVerticalToolbarLabelFadeEnabled=");
        A0k.append(this.A3I);
        A0k.append(", isVideoTrimmingDisabled=");
        A0k.append(this.A3J);
        A0k.append(", isVirtualVideoPlayerEnabled=");
        A0k.append(this.A3K);
        A0k.append(", isVoiceOverToolEnabled=");
        A0k.append(this.A3L);
        A0k.append(", isZoomCropEnabled=");
        A0k.append(this.A3M);
        A0k.append(", maxTrimmingDurationMs=");
        A0k.append(this.A06);
        A0k.append(", maxVideoDurationMsOverride=");
        A0k.append(this.A14);
        A0k.append(", messagingEntryPointData=");
        A0k.append(this.A1S);
        A0k.append(", minCaptureDurationMs=");
        A0k.append(this.A07);
        A0k.append(", minExtraDurationMsForTrimmingEligibility=");
        A0k.append(this.A08);
        A0k.append(", minTrimmingDurationMs=");
        A0k.append(this.A09);
        A0k.append(", newReleasesClusterIds=");
        A0k.append(this.A0w);
        A0k.append(", notifType=");
        A0k.append(this.A1T);
        A0k.append(", nuxConfiguration=");
        A0k.append(this.A0h);
        A0k.append(", openSoundSyncActionType=");
        A0k.append(B0J());
        A0k.append(", overrideEnableOPSSends=");
        A0k.append(this.A3N);
        A0k.append(", photosToReelsOriginatingMediaId=");
        A0k.append(this.A1U);
        A0k.append(", placeholderTextGratitude=");
        A0k.append(this.A1V);
        A0k.append(", platformCameraShareConfiguration=");
        A0k.append(this.A0m);
        A0k.append(", playlistId=");
        A0k.append(this.A1W);
        A0k.append(", playlistName=");
        A0k.append(this.A1X);
        A0k.append(", preAppliedEffects=");
        A0k.append(this.A0x);
        A0k.append(", preselectedRecipientId=");
        A0k.append(this.A1Y);
        A0k.append(", preselectedShareToChannelThreadId=");
        A0k.append(this.A1Z);
        A0k.append(", previouslySelectedMedia=");
        A0k.append(this.A11);
        A0k.append(", progressBarStyle=");
        A0k.append(this.A04);
        A0k.append(", readyMadeSuggestionModel=");
        A0k.append(this.A0A);
        A0k.append(", reasonsFailed=");
        A0k.append(this.A1a);
        A0k.append(", recommendationMediaHint=");
        A0k.append(this.A1b);
        A0k.append(", reelEditorSessionId=");
        A0k.append(this.A1c);
        A0k.append(", reelsConsumptionTracking=");
        A0k.append(this.A1d);
        A0k.append(", remoteAutoCreatedReelMediaItems=");
        A0k.append(this.A0y);
        A0k.append(", requiredStyleCategories=");
        A0k.append(B7d());
        A0k.append(", reshareToStoryMetadata=");
        A0k.append(this.A0U);
        A0k.append(", rmsPlaceholderModel=");
        A0k.append(this.A0n);
        A0k.append(", rmsRecommendationData=");
        A0k.append(this.A0W);
        A0k.append(", searchText=");
        A0k.append(this.A1e);
        A0k.append(", selectedAttribution=");
        A0k.append(this.A10);
        A0k.append(", selectedMediaItemIndex=");
        A0k.append(this.A05);
        A0k.append(", shareButtonLabelText=");
        A0k.append(this.A1f);
        A0k.append(", shouldCreateMemoriesPolaroidSticker=");
        A0k.append(this.A3O);
        A0k.append(", shouldCreateReelFromVodFragmentAfterTimelineEditor=");
        A0k.append(this.A3P);
        A0k.append(", shouldCtaUseSwipeUpLink=");
        A0k.append(this.A3Q);
        A0k.append(", shouldDisableAiTextSuggestions=");
        A0k.append(this.A3R);
        A0k.append(", shouldDisableCameraRollSettingsButton=");
        A0k.append(this.A3S);
        A0k.append(", shouldDisableCloseFriendsStoryButtons=");
        A0k.append(this.A3T);
        A0k.append(", shouldDisableCreateSticker=");
        A0k.append(this.A3U);
        A0k.append(", shouldDisableEffectSwitching=");
        A0k.append(this.A3V);
        A0k.append(", shouldDisableGiphyStickersForPhotos=");
        A0k.append(this.A3W);
        A0k.append(", shouldDisableIGOffendingStickersWarning=");
        A0k.append(this.A3X);
        A0k.append(", shouldDisableMentionsInTextTool=");
        A0k.append(this.A3Y);
        A0k.append(", shouldDisableMusicStickersForPhotos=");
        A0k.append(this.A3Z);
        A0k.append(", shouldDisableMusicStickersForSuggestions=");
        A0k.append(this.A3a);
        A0k.append(", shouldDisableReelsDrafts=");
        A0k.append(this.A3b);
        A0k.append(", shouldDisableSearchTool=");
        A0k.append(this.A3c);
        A0k.append(", shouldDisableShareSheetResetOnResume=");
        A0k.append(this.A3d);
        A0k.append(", shouldDisableTextPromptInStoriesEditor=");
        A0k.append(this.A3e);
        A0k.append(", shouldDisplayCameraRollEffectTooltip=");
        A0k.append(this.A3f);
        A0k.append(", shouldEnableCameraRollButton=");
        A0k.append(this.A3g);
        A0k.append(", shouldEnableCameraSettingsButton=");
        A0k.append(this.A3h);
        A0k.append(", shouldEnableStoryButton=");
        A0k.append(this.A3i);
        A0k.append(", shouldEnableVisualTrimmer=");
        A0k.append(this.A3j);
        A0k.append(", shouldExpandMusicPill=");
        A0k.append(this.A3k);
        A0k.append(", shouldFinishCallSiteAfterPosting=");
        A0k.append(this.A3l);
        A0k.append(", shouldHideDiscardButtonInCamera=");
        A0k.append(this.A3m);
        A0k.append(", shouldHideDiscardButtonInEditor=");
        A0k.append(this.A3n);
        A0k.append(", shouldInjectStyleBackgroundMedia=");
        A0k.append(this.A3o);
        A0k.append(", shouldLaunchVodComposerAfterTimelineEditor=");
        A0k.append(this.A3p);
        A0k.append(", shouldLogComposerEntry=");
        A0k.append(this.A3q);
        A0k.append(", shouldLogFCR=");
        A0k.append(this.A3r);
        A0k.append(", shouldLogInspirationEntryPointString=");
        A0k.append(this.A3s);
        A0k.append(", shouldMusicSelectionAutoStartCapture=");
        A0k.append(this.A3t);
        A0k.append(", shouldNavigateToNewsFeedAfterShare=");
        A0k.append(this.A3u);
        A0k.append(", shouldOverrideRenderAnimateMaskEffectsAsStatic=");
        A0k.append(this.A3v);
        A0k.append(", shouldReturnToPickerFromHomeBaseWhenDiscard=");
        A0k.append(this.A3w);
        A0k.append(", shouldSelectNewsfeed=");
        A0k.append(this.A3x);
        A0k.append(", shouldSetActivityResultAfterPosting=");
        A0k.append(this.A3y);
        A0k.append(", shouldShareToStoryOnly=");
        A0k.append(this.A3z);
        A0k.append(", shouldShowArScenesInBackgroundSelector=");
        A0k.append(this.A40);
        A0k.append(", shouldShowHashtagIsAppliedPromptInCamera=");
        A0k.append(this.A41);
        A0k.append(", shouldShowMiniPreview=");
        A0k.append(this.A42);
        A0k.append(", shouldShowMusicDigestSections=");
        A0k.append(this.A43);
        A0k.append(", shouldShowMusicSurvey=");
        A0k.append(this.A44);
        A0k.append(", shouldShowOnlyPreselectedEffects=");
        A0k.append(this.A45);
        A0k.append(", shouldShowPlaylistIsAppliedPromptInCamera=");
        A0k.append(this.A46);
        A0k.append(", shouldShowScenesInBackgroundSelector=");
        A0k.append(this.A47);
        A0k.append(", shouldShowSendForwardVariant=");
        A0k.append(this.A48);
        A0k.append(", shouldSkipMediaValidation=");
        A0k.append(this.A49);
        A0k.append(", shouldUplevelBackdrop=");
        A0k.append(this.A4A);
        A0k.append(", shouldUseBirthdaySparkLayout=");
        A0k.append(this.A4B);
        A0k.append(", shouldUseFullCanvas=");
        A0k.append(this.A4C);
        A0k.append(", startReason=");
        A0k.append(BBz());
        A0k.append(", startingMode=");
        A0k.append(BC5());
        A0k.append(", suggestedSongId=");
        A0k.append(this.A1g);
        A0k.append(", suggestionComponentModel=");
        A0k.append(this.A0R);
        A0k.append(", tallScreenSupportEnabledEntryPoint=");
        A0k.append(this.A0d);
        A0k.append(", targetAudioLibraryProduct=");
        A0k.append(this.A1h);
        A0k.append(", targetLinkedVideoId=");
        A0k.append(this.A1i);
        A0k.append(", thenAndNowModel=");
        A0k.append(this.A0l);
        A0k.append(", trashUnificationSupportEnabledEntryPoint=");
        A0k.append(BGx());
        A0k.append(", tryItSurfaceContext=");
        A0k.append(this.A0B);
        A0k.append(", useFirstPartyEffectsOnly=");
        A0k.append(this.A4D);
        A0k.append(", vodToReelsComposerSessionId=");
        A0k.append(this.A1j);
        A0k.append(", vpvId=");
        A0k.append(this.A1k);
        A0k.append(", wasDelayedToFetchConsentState=");
        return AbstractC2327GOs.A0X(A0k, this.A4E);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A15);
        parcel.writeInt(this.A1m ? 1 : 0);
        parcel.writeInt(this.A1n ? 1 : 0);
        parcel.writeInt(this.A1o ? 1 : 0);
        1BL.A13(parcel, this.A16);
        1BL.A13(parcel, this.A17);
        1BL.A13(parcel, this.A18);
        1BL.A13(parcel, this.A19);
        parcel.writeInt(this.A1p ? 1 : 0);
        1BL.A13(parcel, this.A1A);
        1BL.A13(parcel, this.A1B);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A1C);
        1BL.A13(parcel, this.A1D);
        parcel.writeString(this.A1E);
        C3o5.A0e(parcel, this.A0E);
        1Du A0b = 1BL.A0b(parcel, this.A0o);
        while (A0b.hasNext()) {
            ((ComposerMedia) A0b.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1F);
        1BL.A13(parcel, this.A1G);
        C3o5.A0e(parcel, this.A0Z);
        C3o5.A0e(parcel, this.A0X);
        1BL.A13(parcel, this.A1H);
        1BL.A13(parcel, this.A1I);
        parcel.writeInt(this.A01);
        C3o5.A0e(parcel, this.A0I);
        C3o5.A0e(parcel, this.A0J);
        parcel.writeInt(this.A1q ? 1 : 0);
        parcel.writeInt(this.A1r ? 1 : 0);
        C3o5.A0d(parcel, this.A0f, i);
        parcel.writeInt(this.A1s ? 1 : 0);
        parcel.writeInt(this.A1t ? 1 : 0);
        parcel.writeString(this.A1J);
        EventsInspirationConfiguration eventsInspirationConfiguration = this.A0C;
        if (eventsInspirationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventsInspirationConfiguration.writeToParcel(parcel, i);
        }
        FacecastConfiguration facecastConfiguration = this.A0Y;
        if (facecastConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            facecastConfiguration.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1K);
        GoodwillInspirationComposerLoggingParams goodwillInspirationComposerLoggingParams = this.A0D;
        if (goodwillInspirationComposerLoggingParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            goodwillInspirationComposerLoggingParams.writeToParcel(parcel, i);
        }
        GroupInspirationConfiguration groupInspirationConfiguration = this.A0H;
        if (groupInspirationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInspirationConfiguration.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A1L);
        1BL.A13(parcel, this.A1M);
        parcel.writeInt(this.A1u ? 1 : 0);
        1Du A0b2 = 1BL.A0b(parcel, this.A0p);
        while (A0b2.hasNext()) {
            MRl.A0Q(parcel, A0b2, i);
        }
        ImmutableList immutableList = this.A0q;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((InspirationRemixableVideoAssetMetaData) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.A02);
        1BL.A13(parcel, this.A1N);
        InspirationStickerParams inspirationStickerParams = this.A0T;
        if (inspirationStickerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationStickerParams.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1O);
        parcel.writeString(this.A1P);
        1Du A0b3 = 1BL.A0b(parcel, this.A0r);
        while (A0b3.hasNext()) {
            ((InspirationEffect) A0b3.next()).writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0L);
        C3o5.A0e(parcel, this.A0M);
        1BL.A13(parcel, this.A1Q);
        1Du A0b4 = 1BL.A0b(parcel, this.A0s);
        while (A0b4.hasNext()) {
            MRl.A0Q(parcel, A0b4, i);
        }
        1BL.A13(parcel, this.A1R);
        parcel.writeInt(this.A03);
        InspirationRemixData inspirationRemixData = this.A0K;
        if (inspirationRemixData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationRemixData.writeToParcel(parcel, i);
        }
        DKH.A0y(parcel, this.A0F);
        DKH.A0y(parcel, this.A0G);
        InspirationInitialTextToolTextParams inspirationInitialTextToolTextParams = this.A0S;
        if (inspirationInitialTextToolTextParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationInitialTextToolTextParams.writeToParcel(parcel, i);
        }
        InspirationVideoEditingData inspirationVideoEditingData = this.A0P;
        if (inspirationVideoEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationVideoEditingData.writeToParcel(parcel, i);
        }
        1Du A0b5 = 1BL.A0b(parcel, this.A0t);
        while (A0b5.hasNext()) {
            ((InspirationVideoSegment) A0b5.next()).writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0a, i);
        C3o5.A0d(parcel, this.A0b, i);
        ImmutableList immutableList2 = this.A0u;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                7zN.A0z(parcel, (ELz) A0Y2.next());
            }
        }
        C3o5.A0d(parcel, this.A0g, i);
        InspirationMultiCaptureState inspirationMultiCaptureState = this.A0N;
        if (inspirationMultiCaptureState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMultiCaptureState.writeToParcel(parcel, i);
        }
        C3o5.A0f(parcel, this.A13);
        InspirationPostAction inspirationPostAction = this.A0O;
        if (inspirationPostAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationPostAction.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0k, i);
        ImmutableList immutableList3 = this.A0v;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                ((InspirationVideoTemplate) A0Y3.next()).writeToParcel(parcel, i);
            }
        }
        InspirationVideoTemplate inspirationVideoTemplate = this.A0Q;
        if (inspirationVideoTemplate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationVideoTemplate.writeToParcel(parcel, i);
        }
        DKH.A12(parcel, this.A12);
        C3o5.A0e(parcel, this.A0c);
        parcel.writeInt(this.A1v ? 1 : 0);
        parcel.writeInt(this.A1w ? 1 : 0);
        parcel.writeInt(this.A1x ? 1 : 0);
        parcel.writeInt(this.A1y ? 1 : 0);
        parcel.writeInt(this.A1z ? 1 : 0);
        parcel.writeInt(this.A20 ? 1 : 0);
        parcel.writeInt(this.A21 ? 1 : 0);
        parcel.writeInt(this.A22 ? 1 : 0);
        parcel.writeInt(this.A23 ? 1 : 0);
        parcel.writeInt(this.A24 ? 1 : 0);
        parcel.writeInt(this.A25 ? 1 : 0);
        parcel.writeInt(this.A26 ? 1 : 0);
        parcel.writeInt(this.A27 ? 1 : 0);
        parcel.writeInt(this.A28 ? 1 : 0);
        parcel.writeInt(this.A29 ? 1 : 0);
        parcel.writeInt(this.A2A ? 1 : 0);
        parcel.writeInt(this.A2B ? 1 : 0);
        parcel.writeInt(this.A2C ? 1 : 0);
        parcel.writeInt(this.A2D ? 1 : 0);
        parcel.writeInt(this.A2E ? 1 : 0);
        parcel.writeInt(this.A2F ? 1 : 0);
        parcel.writeInt(this.A2G ? 1 : 0);
        parcel.writeInt(this.A2H ? 1 : 0);
        parcel.writeInt(this.A2I ? 1 : 0);
        parcel.writeInt(this.A2J ? 1 : 0);
        parcel.writeInt(this.A2K ? 1 : 0);
        parcel.writeInt(this.A2L ? 1 : 0);
        parcel.writeInt(this.A2M ? 1 : 0);
        parcel.writeInt(this.A2N ? 1 : 0);
        parcel.writeInt(this.A2O ? 1 : 0);
        parcel.writeInt(this.A2P ? 1 : 0);
        parcel.writeInt(this.A2Q ? 1 : 0);
        parcel.writeInt(this.A2R ? 1 : 0);
        parcel.writeInt(this.A2S ? 1 : 0);
        parcel.writeInt(this.A2T ? 1 : 0);
        parcel.writeInt(this.A2U ? 1 : 0);
        parcel.writeInt(this.A2V ? 1 : 0);
        parcel.writeInt(this.A2W ? 1 : 0);
        parcel.writeInt(this.A2X ? 1 : 0);
        parcel.writeInt(this.A2Y ? 1 : 0);
        parcel.writeInt(this.A2Z ? 1 : 0);
        parcel.writeInt(this.A2a ? 1 : 0);
        parcel.writeInt(this.A2b ? 1 : 0);
        parcel.writeInt(this.A2c ? 1 : 0);
        parcel.writeInt(this.A2d ? 1 : 0);
        parcel.writeInt(this.A2e ? 1 : 0);
        parcel.writeInt(this.A2f ? 1 : 0);
        parcel.writeInt(this.A2g ? 1 : 0);
        parcel.writeInt(this.A2h ? 1 : 0);
        parcel.writeInt(this.A2i ? 1 : 0);
        parcel.writeInt(this.A2j ? 1 : 0);
        parcel.writeInt(this.A2k ? 1 : 0);
        parcel.writeInt(this.A2l ? 1 : 0);
        parcel.writeInt(this.A2m ? 1 : 0);
        parcel.writeInt(this.A2n ? 1 : 0);
        parcel.writeInt(this.A2o ? 1 : 0);
        parcel.writeInt(this.A2p ? 1 : 0);
        parcel.writeInt(this.A2q ? 1 : 0);
        parcel.writeInt(this.A2r ? 1 : 0);
        parcel.writeInt(this.A2s ? 1 : 0);
        parcel.writeInt(this.A2t ? 1 : 0);
        parcel.writeInt(this.A2u ? 1 : 0);
        parcel.writeInt(this.A2v ? 1 : 0);
        parcel.writeInt(this.A2w ? 1 : 0);
        parcel.writeInt(this.A2x ? 1 : 0);
        parcel.writeInt(this.A2y ? 1 : 0);
        parcel.writeInt(this.A2z ? 1 : 0);
        parcel.writeInt(this.A30 ? 1 : 0);
        parcel.writeInt(this.A31 ? 1 : 0);
        parcel.writeInt(this.A32 ? 1 : 0);
        parcel.writeInt(this.A33 ? 1 : 0);
        parcel.writeInt(this.A34 ? 1 : 0);
        parcel.writeInt(this.A35 ? 1 : 0);
        parcel.writeInt(this.A36 ? 1 : 0);
        parcel.writeInt(this.A37 ? 1 : 0);
        parcel.writeInt(this.A38 ? 1 : 0);
        parcel.writeInt(this.A39 ? 1 : 0);
        parcel.writeInt(this.A3A ? 1 : 0);
        parcel.writeInt(this.A3B ? 1 : 0);
        parcel.writeInt(this.A3C ? 1 : 0);
        parcel.writeInt(this.A3D ? 1 : 0);
        parcel.writeInt(this.A3E ? 1 : 0);
        parcel.writeInt(this.A3F ? 1 : 0);
        parcel.writeInt(this.A3G ? 1 : 0);
        parcel.writeInt(this.A3H ? 1 : 0);
        parcel.writeInt(this.A3I ? 1 : 0);
        parcel.writeInt(this.A3J ? 1 : 0);
        parcel.writeInt(this.A3K ? 1 : 0);
        parcel.writeInt(this.A3L ? 1 : 0);
        parcel.writeInt(this.A3M ? 1 : 0);
        parcel.writeLong(this.A06);
        C3o5.A0g(parcel, this.A14);
        1BL.A13(parcel, this.A1S);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A09);
        ImmutableList immutableList4 = this.A0w;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                C3o5.A0h(parcel, A0Y4);
            }
        }
        1BL.A13(parcel, this.A1T);
        C3o5.A0d(parcel, this.A0h, i);
        C3o5.A0e(parcel, this.A0V);
        parcel.writeInt(this.A3N ? 1 : 0);
        1BL.A13(parcel, this.A1U);
        1BL.A13(parcel, this.A1V);
        PlatformCameraShareConfiguration platformCameraShareConfiguration = this.A0m;
        if (platformCameraShareConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformCameraShareConfiguration.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1W);
        1BL.A13(parcel, this.A1X);
        1Du A0b6 = 1BL.A0b(parcel, this.A0x);
        while (A0b6.hasNext()) {
            ((InspirationEffect) A0b6.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1Y);
        1BL.A13(parcel, this.A1Z);
        1Du A0g = DKH.A0g(parcel, this.A11);
        while (A0g.hasNext()) {
            parcel.writeInt(((Number) MRl.A0K(parcel, A0g)).intValue());
        }
        parcel.writeInt(this.A04);
        SuggestionModel suggestionModel = this.A0A;
        if (suggestionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestionModel.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1a);
        1BL.A13(parcel, this.A1b);
        1BL.A13(parcel, this.A1c);
        1BL.A13(parcel, this.A1d);
        ImmutableList immutableList5 = this.A0y;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y5 = AbL.A0Y(parcel, immutableList5);
            while (A0Y5.hasNext()) {
                ((RemoteAutoCreatedReelMediaItem) A0Y5.next()).writeToParcel(parcel, i);
            }
        }
        ImmutableList immutableList6 = this.A0z;
        if (immutableList6 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y6 = AbL.A0Y(parcel, immutableList6);
            while (A0Y6.hasNext()) {
                C3o5.A0h(parcel, A0Y6);
            }
        }
        ReshareToStoryMetadata reshareToStoryMetadata = this.A0U;
        if (reshareToStoryMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reshareToStoryMetadata.writeToParcel(parcel, i);
        }
        InspirationRMSPlaceholderModel inspirationRMSPlaceholderModel = this.A0n;
        if (inspirationRMSPlaceholderModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationRMSPlaceholderModel.writeToParcel(parcel, i);
        }
        RMSRecommendationData rMSRecommendationData = this.A0W;
        if (rMSRecommendationData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rMSRecommendationData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A1e);
        ImmutableList immutableList7 = this.A10;
        if (immutableList7 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y7 = AbL.A0Y(parcel, immutableList7);
            while (A0Y7.hasNext()) {
                7zN.A0z(parcel, (EQm) A0Y7.next());
            }
        }
        parcel.writeInt(this.A05);
        1BL.A13(parcel, this.A1f);
        parcel.writeInt(this.A3O ? 1 : 0);
        parcel.writeInt(this.A3P ? 1 : 0);
        parcel.writeInt(this.A3Q ? 1 : 0);
        parcel.writeInt(this.A3R ? 1 : 0);
        parcel.writeInt(this.A3S ? 1 : 0);
        parcel.writeInt(this.A3T ? 1 : 0);
        parcel.writeInt(this.A3U ? 1 : 0);
        parcel.writeInt(this.A3V ? 1 : 0);
        parcel.writeInt(this.A3W ? 1 : 0);
        parcel.writeInt(this.A3X ? 1 : 0);
        parcel.writeInt(this.A3Y ? 1 : 0);
        parcel.writeInt(this.A3Z ? 1 : 0);
        parcel.writeInt(this.A3a ? 1 : 0);
        parcel.writeInt(this.A3b ? 1 : 0);
        parcel.writeInt(this.A3c ? 1 : 0);
        parcel.writeInt(this.A3d ? 1 : 0);
        parcel.writeInt(this.A3e ? 1 : 0);
        parcel.writeInt(this.A3f ? 1 : 0);
        parcel.writeInt(this.A3g ? 1 : 0);
        parcel.writeInt(this.A3h ? 1 : 0);
        parcel.writeInt(this.A3i ? 1 : 0);
        parcel.writeInt(this.A3j ? 1 : 0);
        parcel.writeInt(this.A3k ? 1 : 0);
        parcel.writeInt(this.A3l ? 1 : 0);
        parcel.writeInt(this.A3m ? 1 : 0);
        parcel.writeInt(this.A3n ? 1 : 0);
        parcel.writeInt(this.A3o ? 1 : 0);
        parcel.writeInt(this.A3p ? 1 : 0);
        parcel.writeInt(this.A3q ? 1 : 0);
        parcel.writeInt(this.A3r ? 1 : 0);
        parcel.writeInt(this.A3s ? 1 : 0);
        parcel.writeInt(this.A3t ? 1 : 0);
        parcel.writeInt(this.A3u ? 1 : 0);
        parcel.writeInt(this.A3v ? 1 : 0);
        parcel.writeInt(this.A3w ? 1 : 0);
        parcel.writeInt(this.A3x ? 1 : 0);
        parcel.writeInt(this.A3y ? 1 : 0);
        parcel.writeInt(this.A3z ? 1 : 0);
        parcel.writeInt(this.A40 ? 1 : 0);
        parcel.writeInt(this.A41 ? 1 : 0);
        parcel.writeInt(this.A42 ? 1 : 0);
        parcel.writeInt(this.A43 ? 1 : 0);
        parcel.writeInt(this.A44 ? 1 : 0);
        parcel.writeInt(this.A45 ? 1 : 0);
        parcel.writeInt(this.A46 ? 1 : 0);
        parcel.writeInt(this.A47 ? 1 : 0);
        parcel.writeInt(this.A48 ? 1 : 0);
        parcel.writeInt(this.A49 ? 1 : 0);
        parcel.writeInt(this.A4A ? 1 : 0);
        parcel.writeInt(this.A4B ? 1 : 0);
        parcel.writeInt(this.A4C ? 1 : 0);
        C3o5.A0d(parcel, this.A0i, i);
        C3o5.A0e(parcel, this.A0j);
        1BL.A13(parcel, this.A1g);
        SuggestionComponentModel suggestionComponentModel = this.A0R;
        if (suggestionComponentModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestionComponentModel.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0d);
        1BL.A13(parcel, this.A1h);
        1BL.A13(parcel, this.A1i);
        InspirationThenAndNowModel inspirationThenAndNowModel = this.A0l;
        if (inspirationThenAndNowModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationThenAndNowModel.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0e);
        TryItSurfaceContext tryItSurfaceContext = this.A0B;
        if (tryItSurfaceContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tryItSurfaceContext.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A4D ? 1 : 0);
        1BL.A13(parcel, this.A1j);
        1BL.A13(parcel, this.A1k);
        parcel.writeInt(this.A4E ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A1l);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
