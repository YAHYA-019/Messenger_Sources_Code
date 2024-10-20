package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKE;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EPI;
import X.EW3;
import X.EnumC3498Mft;
import X.FKc;
import X.JQw;
import X.MRl;
import X.N3X;
import X.NAh;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.caption.InspirationCaptionStickerInfo;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.facebook.ipc.composer.model.DateStickerOverlay;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationStickerParams.class */
public final class InspirationStickerParams implements NAh, Parcelable {
    public static volatile EnumC3498Mft A1F;
    public static volatile EPI A1G;
    public static volatile SnapbackStrategy A1H;
    public static volatile PersistableRect A1I;
    public static volatile String A1J;
    public static final Parcelable.Creator CREATOR = new FKc(50);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final EnumC3498Mft A0C;
    public final EnumC3498Mft A0D;
    public final EPI A0E;
    public final AddYoursParticipationInfo A0F;
    public final AddYoursTemplateParticipationInfo A0G;
    public final CreateStickerInfo A0H;
    public final InspirationBloksStickerInfo A0I;
    public final InspirationEventInfo A0J;
    public final InspirationFeelingsInfo A0K;
    public final InspirationFundraiserInfo A0L;
    public final InspirationGiphyInfo A0M;
    public final InspirationHashtagStickerOverlayInfo A0N;
    public final InspirationLazyStickerStyleInfo A0O;
    public final InspirationOverlayFeedRemixStickerInfo A0P;
    public final InspirationPollInfo A0Q;
    public final InspirationProductInfo A0R;
    public final InspirationReshareInfo A0S;
    public final InspirationStaticStickerInfo A0T;
    public final InspirationStickerLocationInfo A0U;
    public final InspirationStickerNameInfo A0V;
    public final InspirationVoterRegistrationInfo A0W;
    public final InspirationWeatherInfo A0X;
    public final SnapbackStrategy A0Y;
    public final InspirationCaptionStickerInfo A0Z;
    public final InspirationMusicStickerInfo A0a;
    public final InspirationTimedElementParams A0b;
    public final DateStickerOverlay A0c;
    public final MetaGalleryMetadata A0d;
    public final PersistableRect A0e;
    public final ImmutableList A0f;
    public final ImmutableList A0g;
    public final ImmutableList A0h;
    public final Float A0i;
    public final Float A0j;
    public final Integer A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final String A0o;
    public final String A0p;
    public final String A0q;
    public final String A0r;
    public final String A0s;
    public final String A0t;
    public final String A0u;
    public final String A0v;
    public final String A0w;
    public final String A0x;
    public final Set A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;

    /* loaded from: InspirationStickerParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N3X n3x = new N3X();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2100961746:
                                if (A1C.equals("selected_index")) {
                                    n3x.A08 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -2067408082:
                                if (A1C.equals("time_created_ns")) {
                                    n3x.A0B = abstractC01033pi.A1B();
                                    break;
                                }
                                break;
                            case -2037673351:
                                if (A1C.equals("sticker_creation_source")) {
                                    n3x.A06(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -2031196083:
                                if (A1C.equals("sticker_name")) {
                                    n3x.A07(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -2030994180:
                                if (A1C.equals("sticker_type")) {
                                    n3x.A02((EPI) AbstractC11224vw.A02(abstractC01033pi, c27t, EPI.class));
                                    break;
                                }
                                break;
                            case -1910090346:
                                if (A1C.equals("drawable_params_list")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationStickerDrawableParams.class);
                                    n3x.A0g = A00;
                                    C1pq.A08("drawableParamsList", A00);
                                    break;
                                }
                                break;
                            case -1904594471:
                                if (A1C.equals("should_burn_sticker")) {
                                    n3x.A1C = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1817104942:
                                if (A1C.equals("left_percentage")) {
                                    n3x.A02 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -1813503001:
                                if (A1C.equals("feed_remix_sticker_info")) {
                                    n3x.A0P = (InspirationOverlayFeedRemixStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayFeedRemixStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1608476747:
                                if (A1C.equals("is_instruction_text_enabled")) {
                                    n3x.A15 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1581235777:
                                if (A1C.equals("inspiration_music_sticker_info")) {
                                    n3x.A0a = (InspirationMusicStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMusicStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1529957545:
                                if (A1C.equals("inspiration_bloks_sticker_info")) {
                                    n3x.A0I = (InspirationBloksStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationBloksStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1439996518:
                                if (A1C.equals("min_scale_factor_override")) {
                                    n3x.A0j = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                break;
                            case -1383373720:
                                if (A1C.equals("inspiration_voter_registration_info")) {
                                    n3x.A0W = (InspirationVoterRegistrationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVoterRegistrationInfo.class);
                                    break;
                                }
                                break;
                            case -1341199572:
                                if (A1C.equals("max_scale_factor_override")) {
                                    n3x.A0i = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                break;
                            case -1337586391:
                                if (A1C.equals("raas_request_id")) {
                                    n3x.A0p = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1302586347:
                                if (A1C.equals(JQw.A00(21))) {
                                    n3x.A0n = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1261118192:
                                if (A1C.equals("should_allow_moving")) {
                                    n3x.A18 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1260649503:
                                if (A1C.equals("inspiration_feelings_info")) {
                                    n3x.A0K = (InspirationFeelingsInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationFeelingsInfo.class);
                                    break;
                                }
                                break;
                            case -1221029593:
                                if (A1C.equals(Property.ICON_TEXT_FIT_HEIGHT)) {
                                    n3x.A07 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1166667645:
                                if (A1C.equals("should_allow_removing")) {
                                    n3x.A19 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1143691484:
                                if (A1C.equals("is_video_sticker")) {
                                    n3x.A17 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1124141595:
                                if (A1C.equals("should_download_images_in_u_e_g")) {
                                    n3x.A1D = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1081840034:
                                if (A1C.equals("inspiration_caption_sticker_info")) {
                                    n3x.A0Z = (InspirationCaptionStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationCaptionStickerInfo.class);
                                    break;
                                }
                                break;
                            case -1075585221:
                                if (A1C.equals("has_custom_animation")) {
                                    n3x.A10 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1074310264:
                                if (A1C.equals("secondary_sticker_source")) {
                                    n3x.A0C = (EnumC3498Mft) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3498Mft.class);
                                    break;
                                }
                                break;
                            case -1061221503:
                                if (A1C.equals("reshare_info")) {
                                    n3x.A0S = (InspirationReshareInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReshareInfo.class);
                                    break;
                                }
                                break;
                            case -1002616498:
                                if (A1C.equals("inspiration_weather_info")) {
                                    n3x.A0X = (InspirationWeatherInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationWeatherInfo.class);
                                    break;
                                }
                                break;
                            case -995375538:
                                if (A1C.equals("is_suggested")) {
                                    n3x.A16 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -916437662:
                                if (A1C.equals("animated_sticker_indexes")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, Integer.class);
                                    n3x.A0f = A002;
                                    C1pq.A08("animatedStickerIndexes", A002);
                                    break;
                                }
                                break;
                            case -712502269:
                                if (A1C.equals("inspiration_giphy_info")) {
                                    n3x.A0M = (InspirationGiphyInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationGiphyInfo.class);
                                    break;
                                }
                                break;
                            case -694150208:
                                if (A1C.equals("should_allow_rotation")) {
                                    n3x.A1A = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -663393549:
                                if (A1C.equals("sticker_meta_gallery_info")) {
                                    n3x.A0d = (MetaGalleryMetadata) AbstractC11224vw.A02(abstractC01033pi, c27t, MetaGalleryMetadata.class);
                                    break;
                                }
                                break;
                            case -617304825:
                                if (A1C.equals("should_show_sticker")) {
                                    n3x.A1E = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -538310583:
                                if (A1C.equals("unique_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n3x.A0x = A03;
                                    C1pq.A08("uniqueId", A03);
                                    break;
                                }
                                break;
                            case -511362388:
                                if (A1C.equals("inspiration_time_sticker_time")) {
                                    n3x.A0o = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -447180908:
                                if (A1C.equals("add_yours_template_participation_info")) {
                                    n3x.A0G = (AddYoursTemplateParticipationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, AddYoursTemplateParticipationInfo.class);
                                    break;
                                }
                                break;
                            case -361805646:
                                if (A1C.equals("height_percentage")) {
                                    n3x.A01 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -151588877:
                                if (A1C.equals("tag_f_b_i_d")) {
                                    n3x.A0w = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -143948498:
                                if (A1C.equals("poll_info")) {
                                    n3x.A0Q = (InspirationPollInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPollInfo.class);
                                    break;
                                }
                                break;
                            case -40300674:
                                if (A1C.equals("rotation")) {
                                    n3x.A03 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -24072244:
                                if (A1C.equals("inspiration_static_sticker_info")) {
                                    n3x.A0T = (InspirationStaticStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStaticStickerInfo.class);
                                    break;
                                }
                                break;
                            case 3598471:
                                if (A1C.equals("uris")) {
                                    n3x.A05(MRl.A0G(abstractC01033pi, c27t));
                                    break;
                                }
                                break;
                            case 58881585:
                                if (A1C.equals("timed_element_params")) {
                                    n3x.A0b = (InspirationTimedElementParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTimedElementParams.class);
                                    break;
                                }
                                break;
                            case 112918854:
                                if (A1C.equals("is_always_in_back")) {
                                    n3x.A11 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 113126854:
                                if (A1C.equals(Property.ICON_TEXT_FIT_WIDTH)) {
                                    n3x.A0A = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 227237637:
                                if (A1C.equals("should_allow_scaling")) {
                                    n3x.A1B = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 365467955:
                                if (A1C.equals("inspiration_product_info")) {
                                    n3x.A0R = (InspirationProductInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationProductInfo.class);
                                    break;
                                }
                                break;
                            case 459030217:
                                if (A1C.equals("add_yours_participation_info")) {
                                    n3x.A0F = (AddYoursParticipationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, AddYoursParticipationInfo.class);
                                    break;
                                }
                                break;
                            case 483160950:
                                if (A1C.equals("sticker_location_info")) {
                                    n3x.A0U = (InspirationStickerLocationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStickerLocationInfo.class);
                                    break;
                                }
                                break;
                            case 548526931:
                                if (A1C.equals("is_auto_inserted")) {
                                    n3x.A13 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 720621508:
                                if (A1C.equals("top_percentage")) {
                                    n3x.A05 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 770040499:
                                if (A1C.equals("width_percentage")) {
                                    n3x.A06 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 849285032:
                                if (A1C.equals("inspiration_event_info")) {
                                    n3x.A0J = (InspirationEventInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEventInfo.class);
                                    break;
                                }
                                break;
                            case 899150587:
                                if (A1C.equals("comment_id")) {
                                    n3x.A0l = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 983340243:
                                if (A1C.equals("create_sticker_info")) {
                                    n3x.A0H = (CreateStickerInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, CreateStickerInfo.class);
                                    break;
                                }
                                break;
                            case 1233551842:
                                if (A1C.equals("name_info")) {
                                    n3x.A0V = (InspirationStickerNameInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationStickerNameInfo.class);
                                    break;
                                }
                                break;
                            case 1339464930:
                                if (A1C.equals("reaction_sticker_asset_id")) {
                                    n3x.A0q = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1404607910:
                                if (A1C.equals("has_animated_sticker")) {
                                    n3x.A0z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1517265888:
                                if (A1C.equals("sticker_instruction_text_size")) {
                                    n3x.A04 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 1571987955:
                                if (A1C.equals("is_auto_added_from_tool")) {
                                    n3x.A12 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1572334657:
                                if (A1C.equals("snapback_strategy")) {
                                    n3x.A03((SnapbackStrategy) AbstractC11224vw.A02(abstractC01033pi, c27t, SnapbackStrategy.class));
                                    break;
                                }
                                break;
                            case 1661853540:
                                if (A1C.equals("session_id")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    n3x.A0r = A032;
                                    C1pq.A08("sessionId", A032);
                                    break;
                                }
                                break;
                            case 1686508800:
                                if (A1C.equals("sticker_instruction_text")) {
                                    n3x.A0u = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1705054776:
                                if (A1C.equals("inspiration_hashtag_sticker_info")) {
                                    n3x.A0N = (InspirationHashtagStickerOverlayInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationHashtagStickerOverlayInfo.class);
                                    break;
                                }
                                break;
                            case 1715732911:
                                if (A1C.equals("sticker_index_in_the_tray")) {
                                    n3x.A09 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1764578627:
                                if (A1C.equals("memories_polaroid_timestamp")) {
                                    n3x.A0k = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 1796796777:
                                if (A1C.equals("lazy_sticker_style_info")) {
                                    n3x.A0O = (InspirationLazyStickerStyleInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationLazyStickerStyleInfo.class);
                                    break;
                                }
                                break;
                            case 1797686785:
                                if (A1C.equals("is_from_ay_template")) {
                                    n3x.A14 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1933949168:
                                if (A1C.equals("sticker_selection_source")) {
                                    n3x.A01((EnumC3498Mft) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3498Mft.class));
                                    break;
                                }
                                break;
                            case 1939796319:
                                if (A1C.equals("media_rect")) {
                                    n3x.A04((PersistableRect) AbstractC11224vw.A02(abstractC01033pi, c27t, PersistableRect.class));
                                    break;
                                }
                                break;
                            case 1955500326:
                                if (A1C.equals("skip_burning_text_uri")) {
                                    n3x.A0s = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1964347581:
                                if (A1C.equals("date_sticker_overlay")) {
                                    n3x.A0c = (DateStickerOverlay) AbstractC11224vw.A02(abstractC01033pi, c27t, DateStickerOverlay.class);
                                    break;
                                }
                                break;
                            case 1993065956:
                                if (A1C.equals("scale_factor")) {
                                    n3x.A00 = abstractC01033pi.A11();
                                    break;
                                }
                                break;
                            case 2040309773:
                                if (A1C.equals("inspiration_fundraiser_info")) {
                                    n3x.A0L = (InspirationFundraiserInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationFundraiserInfo.class);
                                    break;
                                }
                                break;
                            case 2103876495:
                                if (A1C.equals("comment_url")) {
                                    n3x.A0m = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationStickerParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationStickerParams(n3x);
        }
    }

    /* loaded from: InspirationStickerParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationStickerParams inspirationStickerParams = (InspirationStickerParams) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0F, "add_yours_participation_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0G, "add_yours_template_participation_info");
            AbstractC11224vw.A06(r302, c26c, "animated_sticker_indexes", inspirationStickerParams.A0f);
            AbstractC11224vw.A0D(r302, "comment_id", inspirationStickerParams.A0l);
            AbstractC11224vw.A0D(r302, "comment_url", inspirationStickerParams.A0m);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0H, "create_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0c, "date_sticker_overlay");
            AbstractC11224vw.A06(r302, c26c, "drawable_params_list", inspirationStickerParams.A0g);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0P, "feed_remix_sticker_info");
            AbstractC11224vw.A0D(r302, JQw.A00(21), inspirationStickerParams.A0n);
            boolean z = inspirationStickerParams.A0z;
            r302.A0o("has_animated_sticker");
            r302.A0v(z);
            boolean z2 = inspirationStickerParams.A10;
            r302.A0o("has_custom_animation");
            r302.A0v(z2);
            int i = inspirationStickerParams.A07;
            r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
            r302.A0f(i);
            float f = inspirationStickerParams.A01;
            r302.A0o("height_percentage");
            r302.A0e(f);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0I, "inspiration_bloks_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0Z, "inspiration_caption_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0J, "inspiration_event_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0K, "inspiration_feelings_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0L, "inspiration_fundraiser_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0M, "inspiration_giphy_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0N, "inspiration_hashtag_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0a, "inspiration_music_sticker_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0R, "inspiration_product_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0T, "inspiration_static_sticker_info");
            AbstractC11224vw.A0D(r302, "inspiration_time_sticker_time", inspirationStickerParams.A0o);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0W, "inspiration_voter_registration_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0X, "inspiration_weather_info");
            boolean z3 = inspirationStickerParams.A11;
            r302.A0o("is_always_in_back");
            r302.A0v(z3);
            boolean z4 = inspirationStickerParams.A12;
            r302.A0o("is_auto_added_from_tool");
            r302.A0v(z4);
            boolean z5 = inspirationStickerParams.A13;
            r302.A0o("is_auto_inserted");
            r302.A0v(z5);
            boolean z6 = inspirationStickerParams.A14;
            r302.A0o("is_from_ay_template");
            r302.A0v(z6);
            boolean z7 = inspirationStickerParams.A15;
            r302.A0o("is_instruction_text_enabled");
            r302.A0v(z7);
            boolean z8 = inspirationStickerParams.A16;
            r302.A0o("is_suggested");
            r302.A0v(z8);
            boolean z9 = inspirationStickerParams.A17;
            r302.A0o("is_video_sticker");
            r302.A0v(z9);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0O, "lazy_sticker_style_info");
            float f2 = inspirationStickerParams.A02;
            r302.A0o("left_percentage");
            r302.A0e(f2);
            AbstractC11224vw.A0A(r302, inspirationStickerParams.A0i, "max_scale_factor_override");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.AwK(), "media_rect");
            AbstractC11224vw.A0B(r302, inspirationStickerParams.A0k, "memories_polaroid_timestamp");
            AbstractC11224vw.A0A(r302, inspirationStickerParams.A0j, "min_scale_factor_override");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0V, "name_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0Q, "poll_info");
            AbstractC11224vw.A0D(r302, "raas_request_id", inspirationStickerParams.A0p);
            AbstractC11224vw.A0D(r302, "reaction_sticker_asset_id", inspirationStickerParams.A0q);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0S, "reshare_info");
            float f3 = inspirationStickerParams.A03;
            r302.A0o("rotation");
            r302.A0e(f3);
            double d = inspirationStickerParams.A00;
            r302.A0o("scale_factor");
            r302.A0d(d);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0C, "secondary_sticker_source");
            int i2 = inspirationStickerParams.A08;
            r302.A0o("selected_index");
            r302.A0f(i2);
            AbstractC11224vw.A0D(r302, "session_id", inspirationStickerParams.A0r);
            boolean z10 = inspirationStickerParams.A18;
            r302.A0o("should_allow_moving");
            r302.A0v(z10);
            boolean z11 = inspirationStickerParams.A19;
            r302.A0o("should_allow_removing");
            r302.A0v(z11);
            boolean z12 = inspirationStickerParams.A1A;
            r302.A0o("should_allow_rotation");
            r302.A0v(z12);
            boolean z13 = inspirationStickerParams.A1B;
            r302.A0o("should_allow_scaling");
            r302.A0v(z13);
            boolean z14 = inspirationStickerParams.A1C;
            r302.A0o("should_burn_sticker");
            r302.A0v(z14);
            boolean z15 = inspirationStickerParams.A1D;
            r302.A0o("should_download_images_in_u_e_g");
            r302.A0v(z15);
            boolean z16 = inspirationStickerParams.A1E;
            r302.A0o("should_show_sticker");
            r302.A0v(z16);
            AbstractC11224vw.A0D(r302, "skip_burning_text_uri", inspirationStickerParams.A0s);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.BBL(), "snapback_strategy");
            AbstractC11224vw.A0D(r302, "sticker_creation_source", inspirationStickerParams.A02());
            int i3 = inspirationStickerParams.A09;
            r302.A0o("sticker_index_in_the_tray");
            r302.A0f(i3);
            AbstractC11224vw.A0D(r302, "sticker_instruction_text", inspirationStickerParams.A0u);
            float f4 = inspirationStickerParams.A04;
            r302.A0o("sticker_instruction_text_size");
            r302.A0e(f4);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0U, "sticker_location_info");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0d, "sticker_meta_gallery_info");
            AbstractC11224vw.A0D(r302, "sticker_name", inspirationStickerParams.A0v);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A00(), "sticker_selection_source");
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A01(), "sticker_type");
            AbstractC11224vw.A0D(r302, "tag_f_b_i_d", inspirationStickerParams.A0w);
            long j = inspirationStickerParams.A0B;
            r302.A0o("time_created_ns");
            r302.A0g(j);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerParams.A0b, "timed_element_params");
            float f5 = inspirationStickerParams.A05;
            r302.A0o("top_percentage");
            r302.A0e(f5);
            AbstractC11224vw.A0D(r302, "unique_id", inspirationStickerParams.A0x);
            AbstractC11224vw.A06(r302, c26c, "uris", inspirationStickerParams.A0h);
            int i4 = inspirationStickerParams.A0A;
            r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
            r302.A0f(i4);
            float f6 = inspirationStickerParams.A06;
            r302.A0o("width_percentage");
            r302.A0e(f6);
            r302.A0Y();
        }
    }

    public InspirationStickerParams(N3X n3x) {
        this.A0F = n3x.A0F;
        this.A0G = n3x.A0G;
        ImmutableList immutableList = n3x.A0f;
        C1pq.A08("animatedStickerIndexes", immutableList);
        this.A0f = immutableList;
        this.A0l = n3x.A0l;
        this.A0m = n3x.A0m;
        this.A0H = n3x.A0H;
        this.A0c = n3x.A0c;
        ImmutableList immutableList2 = n3x.A0g;
        C1pq.A08("drawableParamsList", immutableList2);
        this.A0g = immutableList2;
        this.A0P = n3x.A0P;
        this.A0n = n3x.A0n;
        this.A0z = n3x.A0z;
        this.A10 = n3x.A10;
        this.A07 = n3x.A07;
        this.A01 = n3x.A01;
        this.A0I = n3x.A0I;
        this.A0Z = n3x.A0Z;
        this.A0J = n3x.A0J;
        this.A0K = n3x.A0K;
        this.A0L = n3x.A0L;
        this.A0M = n3x.A0M;
        this.A0N = n3x.A0N;
        this.A0a = n3x.A0a;
        this.A0R = n3x.A0R;
        this.A0T = n3x.A0T;
        this.A0o = n3x.A0o;
        this.A0W = n3x.A0W;
        this.A0X = n3x.A0X;
        this.A11 = n3x.A11;
        this.A12 = n3x.A12;
        this.A13 = n3x.A13;
        this.A14 = n3x.A14;
        this.A15 = n3x.A15;
        this.A16 = n3x.A16;
        this.A17 = n3x.A17;
        this.A0O = n3x.A0O;
        this.A02 = n3x.A02;
        this.A0i = n3x.A0i;
        this.A0e = n3x.A0e;
        this.A0k = n3x.A0k;
        this.A0j = n3x.A0j;
        this.A0V = n3x.A0V;
        this.A0Q = n3x.A0Q;
        this.A0p = n3x.A0p;
        this.A0q = n3x.A0q;
        this.A0S = n3x.A0S;
        this.A03 = n3x.A03;
        this.A00 = n3x.A00;
        this.A0C = n3x.A0C;
        this.A08 = n3x.A08;
        String str = n3x.A0r;
        C1pq.A08("sessionId", str);
        this.A0r = str;
        this.A18 = n3x.A18;
        this.A19 = n3x.A19;
        this.A1A = n3x.A1A;
        this.A1B = n3x.A1B;
        this.A1C = n3x.A1C;
        this.A1D = n3x.A1D;
        this.A1E = n3x.A1E;
        this.A0s = n3x.A0s;
        this.A0Y = n3x.A0Y;
        this.A0t = n3x.A0t;
        this.A09 = n3x.A09;
        this.A0u = n3x.A0u;
        this.A04 = n3x.A04;
        this.A0U = n3x.A0U;
        this.A0d = n3x.A0d;
        String str2 = n3x.A0v;
        C1pq.A08("stickerName", str2);
        this.A0v = str2;
        this.A0D = n3x.A0D;
        this.A0E = n3x.A0E;
        this.A0w = n3x.A0w;
        this.A0B = n3x.A0B;
        this.A0b = n3x.A0b;
        this.A05 = n3x.A05;
        String str3 = n3x.A0x;
        C1pq.A08("uniqueId", str3);
        this.A0x = str3;
        ImmutableList immutableList3 = n3x.A0h;
        C1pq.A08("uris", immutableList3);
        this.A0h = immutableList3;
        this.A0A = n3x.A0A;
        this.A06 = n3x.A06;
        this.A0y = Collections.unmodifiableSet(n3x.A0y);
        EPI A01 = A01();
        if (A01 == EPI.A0p && this.A0S == null) {
            throw AnonymousClass001.A0N("A reshare sticker must have reshare info set");
        }
        if (A01 == EPI.A0W && this.A0M == null) {
            throw AnonymousClass001.A0N("A giphy sticker must have giphy info set");
        }
        11T.A0A(A01);
        boolean A00 = EW3.A00(A01);
        if (A00 && this.A0Q == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(A01);
            A0k.append(" sticker must have poll info set");
            throw AnonymousClass001.A0N(A0k.toString());
        }
        if (!A00 && this.A0Q != null) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("Poll info should not be specified for sticker type of ");
            A0k2.append(A01);
            throw AnonymousClass001.A0N(A0k2.toString());
        }
        if (A01 == EPI.A04 && this.A0F == null) {
            throw AnonymousClass001.A0N("An add yours participation must have add yours participation info set");
        }
        if (A01 == EPI.A06 && this.A0G == null) {
            throw AnonymousClass001.A0N("An add yours template participation must have add yours template participation info set");
        }
        if (A01 == EPI.A0S && this.A0P == null) {
            throw AnonymousClass001.A0N("A feed remix sticker must have feed remix info set");
        }
    }

    public InspirationStickerParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationTimedElementParams inspirationTimedElementParams = null;
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (AddYoursParticipationInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (AddYoursTemplateParticipationInfo) parcel.readParcelable(A0e);
        }
        int readInt = parcel.readInt();
        Integer[] numArr = new Integer[readInt];
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            numArr[i2] = AbI.A0z(parcel);
        }
        this.A0f = ImmutableList.copyOf(numArr);
        if (parcel.readInt() == 0) {
            this.A0l = null;
        } else {
            this.A0l = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0m = null;
        } else {
            this.A0m = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (CreateStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = (DateStickerOverlay) DateStickerOverlay.CREATOR.createFromParcel(parcel);
        }
        int readInt2 = parcel.readInt();
        InspirationStickerDrawableParams[] inspirationStickerDrawableParamsArr = new InspirationStickerDrawableParams[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, inspirationStickerDrawableParamsArr, i3);
        }
        this.A0g = ImmutableList.copyOf(inspirationStickerDrawableParamsArr);
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = (InspirationOverlayFeedRemixStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0n = null;
        } else {
            this.A0n = parcel.readString();
        }
        this.A0z = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A10 = 1BM.A07(parcel);
        this.A07 = parcel.readInt();
        this.A01 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (InspirationBloksStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = (InspirationCaptionStickerInfo) InspirationCaptionStickerInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (InspirationEventInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (InspirationFeelingsInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (InspirationFundraiserInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (InspirationGiphyInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (InspirationHashtagStickerOverlayInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = (InspirationMusicStickerInfo) InspirationMusicStickerInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = (InspirationProductInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (InspirationStaticStickerInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0o = null;
        } else {
            this.A0o = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (InspirationVoterRegistrationInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = (InspirationWeatherInfo) parcel.readParcelable(A0e);
        }
        this.A11 = 1BM.A07(parcel);
        this.A12 = 1BM.A07(parcel);
        this.A13 = 1BM.A07(parcel);
        this.A14 = 1BM.A07(parcel);
        this.A15 = 1BM.A07(parcel);
        this.A16 = 1BM.A07(parcel);
        this.A17 = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (InspirationLazyStickerStyleInfo) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0k = null;
        } else {
            this.A0k = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (InspirationStickerNameInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (InspirationPollInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0p = null;
        } else {
            this.A0p = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0q = null;
        } else {
            this.A0q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = (InspirationReshareInfo) parcel.readParcelable(A0e);
        }
        this.A03 = parcel.readFloat();
        this.A00 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = EnumC3498Mft.values()[parcel.readInt()];
        }
        this.A08 = parcel.readInt();
        this.A0r = parcel.readString();
        this.A18 = 1BM.A07(parcel);
        this.A19 = 1BM.A07(parcel);
        this.A1A = 1BM.A07(parcel);
        this.A1B = 1BM.A07(parcel);
        this.A1C = 1BM.A07(parcel);
        this.A1D = 1BM.A07(parcel);
        this.A1E = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A0s = null;
        } else {
            this.A0s = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = (SnapbackStrategy) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0t = null;
        } else {
            this.A0t = parcel.readString();
        }
        this.A09 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0u = null;
        } else {
            this.A0u = parcel.readString();
        }
        this.A04 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (InspirationStickerLocationInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = (MetaGalleryMetadata) MetaGalleryMetadata.CREATOR.createFromParcel(parcel);
        }
        this.A0v = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = EnumC3498Mft.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = EPI.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0w = null;
        } else {
            this.A0w = parcel.readString();
        }
        this.A0B = parcel.readLong();
        this.A0b = parcel.readInt() != 0 ? (InspirationTimedElementParams) InspirationTimedElementParams.CREATOR.createFromParcel(parcel) : inspirationTimedElementParams;
        this.A05 = parcel.readFloat();
        this.A0x = parcel.readString();
        int readInt3 = parcel.readInt();
        String[] strArr = new String[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbH.A00(parcel, strArr, i4);
        }
        this.A0h = ImmutableList.copyOf(strArr);
        this.A0A = parcel.readInt();
        this.A06 = parcel.readFloat();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt4 = parcel.readInt();
        while (i < readInt4) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0y = Collections.unmodifiableSet(A0v);
    }

    public EnumC3498Mft A00() {
        if (this.A0y.contains("stickerSelectionSource")) {
            return this.A0D;
        }
        if (A1F == null) {
            synchronized (this) {
                if (A1F == null) {
                    A1F = EnumC3498Mft.A0A;
                }
            }
        }
        return A1F;
    }

    public EPI A01() {
        if (this.A0y.contains("stickerType")) {
            return this.A0E;
        }
        if (A1G == null) {
            synchronized (this) {
                if (A1G == null) {
                    A1G = EPI.A13;
                }
            }
        }
        return A1G;
    }

    public String A02() {
        if (this.A0y.contains("stickerCreationSource")) {
            return this.A0t;
        }
        if (A1J == null) {
            synchronized (this) {
                if (A1J == null) {
                    A1J = "STICKER_TAG";
                }
            }
        }
        return A1J;
    }

    @Override // X.NAh
    public float Aoy() {
        return this.A01;
    }

    @Override // X.NAh
    public float Atd() {
        return this.A02;
    }

    @Override // X.NAh
    public PersistableRect AwK() {
        if (this.A0y.contains("mediaRect")) {
            return this.A0e;
        }
        if (A1I == null) {
            synchronized (this) {
                if (A1I == null) {
                    A1I = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A1I;
    }

    @Override // X.NAh
    public float B8H() {
        return this.A03;
    }

    @Override // X.NAh
    public double B8m() {
        return this.A00;
    }

    @Override // X.NAh
    public int B9j() {
        return this.A08;
    }

    @Override // X.NAh
    public String BAE() {
        return this.A0r;
    }

    @Override // X.NAh
    public boolean BAb() {
        return this.A18;
    }

    @Override // X.NAh
    public boolean BAc() {
        return this.A19;
    }

    @Override // X.NAh
    public boolean BAd() {
        return this.A1A;
    }

    @Override // X.NAh
    public boolean BAe() {
        return this.A1B;
    }

    @Override // X.NAh
    public SnapbackStrategy BBL() {
        if (this.A0y.contains("snapbackStrategy")) {
            return this.A0Y;
        }
        if (A1H == null) {
            synchronized (this) {
                if (A1H == null) {
                    A1H = new SnapbackStrategy(null, null, null, null, null, AnonymousClass001.A0v());
                }
            }
        }
        return A1H;
    }

    @Override // X.NAh
    public InspirationTimedElementParams BFr() {
        return this.A0b;
    }

    @Override // X.NAh
    public float BGR() {
        return this.A05;
    }

    @Override // X.NAh
    public String BHy() {
        return this.A0x;
    }

    @Override // X.NAh
    public /* bridge */ /* synthetic */ ImmutableList BIO() {
        return this.A0h;
    }

    @Override // X.NAh
    public float BKm() {
        return this.A06;
    }

    @Override // X.NAh
    public boolean BQo() {
        return this.A12;
    }

    @Override // X.NAh
    public boolean BSy() {
        return this.A14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerParams)) {
                return false;
            }
            InspirationStickerParams inspirationStickerParams = (InspirationStickerParams) obj;
            if (!11T.A0O(this.A0F, inspirationStickerParams.A0F) || !11T.A0O(this.A0G, inspirationStickerParams.A0G) || !11T.A0O(this.A0f, inspirationStickerParams.A0f) || !11T.A0O(this.A0l, inspirationStickerParams.A0l) || !11T.A0O(this.A0m, inspirationStickerParams.A0m) || !11T.A0O(this.A0H, inspirationStickerParams.A0H) || !11T.A0O(this.A0c, inspirationStickerParams.A0c) || !11T.A0O(this.A0g, inspirationStickerParams.A0g) || !11T.A0O(this.A0P, inspirationStickerParams.A0P) || !11T.A0O(this.A0n, inspirationStickerParams.A0n) || this.A0z != inspirationStickerParams.A0z || this.A10 != inspirationStickerParams.A10 || this.A07 != inspirationStickerParams.A07 || this.A01 != inspirationStickerParams.A01 || !11T.A0O(this.A0I, inspirationStickerParams.A0I) || !11T.A0O(this.A0Z, inspirationStickerParams.A0Z) || !11T.A0O(this.A0J, inspirationStickerParams.A0J) || !11T.A0O(this.A0K, inspirationStickerParams.A0K) || !11T.A0O(this.A0L, inspirationStickerParams.A0L) || !11T.A0O(this.A0M, inspirationStickerParams.A0M) || !11T.A0O(this.A0N, inspirationStickerParams.A0N) || !11T.A0O(this.A0a, inspirationStickerParams.A0a) || !11T.A0O(this.A0R, inspirationStickerParams.A0R) || !11T.A0O(this.A0T, inspirationStickerParams.A0T) || !11T.A0O(this.A0o, inspirationStickerParams.A0o) || !11T.A0O(this.A0W, inspirationStickerParams.A0W) || !11T.A0O(this.A0X, inspirationStickerParams.A0X) || this.A11 != inspirationStickerParams.A11 || this.A12 != inspirationStickerParams.A12 || this.A13 != inspirationStickerParams.A13 || this.A14 != inspirationStickerParams.A14 || this.A15 != inspirationStickerParams.A15 || this.A16 != inspirationStickerParams.A16 || this.A17 != inspirationStickerParams.A17 || !11T.A0O(this.A0O, inspirationStickerParams.A0O) || this.A02 != inspirationStickerParams.A02 || !11T.A0O(this.A0i, inspirationStickerParams.A0i) || !11T.A0O(AwK(), inspirationStickerParams.AwK()) || !11T.A0O(this.A0k, inspirationStickerParams.A0k) || !11T.A0O(this.A0j, inspirationStickerParams.A0j) || !11T.A0O(this.A0V, inspirationStickerParams.A0V) || !11T.A0O(this.A0Q, inspirationStickerParams.A0Q) || !11T.A0O(this.A0p, inspirationStickerParams.A0p) || !11T.A0O(this.A0q, inspirationStickerParams.A0q) || !11T.A0O(this.A0S, inspirationStickerParams.A0S) || this.A03 != inspirationStickerParams.A03 || this.A00 != inspirationStickerParams.A00 || this.A0C != inspirationStickerParams.A0C || this.A08 != inspirationStickerParams.A08 || !11T.A0O(this.A0r, inspirationStickerParams.A0r) || this.A18 != inspirationStickerParams.A18 || this.A19 != inspirationStickerParams.A19 || this.A1A != inspirationStickerParams.A1A || this.A1B != inspirationStickerParams.A1B || this.A1C != inspirationStickerParams.A1C || this.A1D != inspirationStickerParams.A1D || this.A1E != inspirationStickerParams.A1E || !11T.A0O(this.A0s, inspirationStickerParams.A0s) || !11T.A0O(BBL(), inspirationStickerParams.BBL()) || !11T.A0O(A02(), inspirationStickerParams.A02()) || this.A09 != inspirationStickerParams.A09 || !11T.A0O(this.A0u, inspirationStickerParams.A0u) || this.A04 != inspirationStickerParams.A04 || !11T.A0O(this.A0U, inspirationStickerParams.A0U) || !11T.A0O(this.A0d, inspirationStickerParams.A0d) || !11T.A0O(this.A0v, inspirationStickerParams.A0v) || A00() != inspirationStickerParams.A00() || A01() != inspirationStickerParams.A01() || !11T.A0O(this.A0w, inspirationStickerParams.A0w) || this.A0B != inspirationStickerParams.A0B || !11T.A0O(this.A0b, inspirationStickerParams.A0b) || this.A05 != inspirationStickerParams.A05 || !11T.A0O(this.A0x, inspirationStickerParams.A0x) || !11T.A0O(this.A0h, inspirationStickerParams.A0h) || this.A0A != inspirationStickerParams.A0A || this.A06 != inspirationStickerParams.A06) {
                return false;
            }
        }
        return true;
    }

    @Override // X.NAh
    public int getHeight() {
        return this.A07;
    }

    @Override // X.NAh
    public int getWidth() {
        return this.A0A;
    }

    public int hashCode() {
        int A00 = C1pq.A00(this.A00, AbM.A00(C1pq.A04(this.A0S, C1pq.A04(this.A0q, C1pq.A04(this.A0p, C1pq.A04(this.A0Q, C1pq.A04(this.A0V, C1pq.A04(this.A0j, C1pq.A04(this.A0k, C1pq.A04(AwK(), C1pq.A04(this.A0i, AbM.A00(C1pq.A04(this.A0O, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0X, C1pq.A04(this.A0W, C1pq.A04(this.A0o, C1pq.A04(this.A0T, C1pq.A04(this.A0R, C1pq.A04(this.A0a, C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0Z, C1pq.A04(this.A0I, AbM.A00((C1pq.A02(C1pq.A02(C1pq.A04(this.A0n, C1pq.A04(this.A0P, C1pq.A04(this.A0g, C1pq.A04(this.A0c, C1pq.A04(this.A0H, C1pq.A04(this.A0m, C1pq.A04(this.A0l, C1pq.A04(this.A0f, C1pq.A04(this.A0G, C1pq.A03(this.A0F)))))))))), this.A0z), this.A10) * 31) + this.A07, this.A01)))))))))))))), this.A11), this.A12), this.A13), this.A14), this.A15), this.A16), this.A17)), this.A02)))))))))), this.A03));
        int A04 = C1pq.A04(this.A0v, C1pq.A04(this.A0d, C1pq.A04(this.A0U, AbM.A00(C1pq.A04(this.A0u, (C1pq.A04(A02(), C1pq.A04(BBL(), C1pq.A04(this.A0s, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0r, (((A00 * 31) + C3o5.A03(this.A0C)) * 31) + this.A08), this.A18), this.A19), this.A1A), this.A1B), this.A1C), this.A1D), this.A1E)))) * 31) + this.A09), this.A04))));
        int A03 = (A04 * 31) + C3o5.A03(A00());
        return AbM.A00((C1pq.A04(this.A0h, C1pq.A04(this.A0x, AbM.A00(C1pq.A04(this.A0b, C1pq.A01(C1pq.A04(this.A0w, (A03 * 31) + DKF.A04(A01())), this.A0B)), this.A05))) * 31) + this.A0A, this.A06);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A0F, i);
        C3o5.A0d(parcel, this.A0G, i);
        1Du A0b = 1BL.A0b(parcel, this.A0f);
        while (A0b.hasNext()) {
            parcel.writeInt(DKE.A0F(A0b));
        }
        1BL.A13(parcel, this.A0l);
        1BL.A13(parcel, this.A0m);
        C3o5.A0d(parcel, this.A0H, i);
        DateStickerOverlay dateStickerOverlay = this.A0c;
        if (dateStickerOverlay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateStickerOverlay.writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A0g);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationStickerDrawableParams) A0b2.next(), i);
        }
        C3o5.A0d(parcel, this.A0P, i);
        1BL.A13(parcel, this.A0n);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeInt(this.A07);
        parcel.writeFloat(this.A01);
        C3o5.A0d(parcel, this.A0I, i);
        InspirationCaptionStickerInfo inspirationCaptionStickerInfo = this.A0Z;
        if (inspirationCaptionStickerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationCaptionStickerInfo.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0J, i);
        C3o5.A0d(parcel, this.A0K, i);
        C3o5.A0d(parcel, this.A0L, i);
        C3o5.A0d(parcel, this.A0M, i);
        C3o5.A0d(parcel, this.A0N, i);
        InspirationMusicStickerInfo inspirationMusicStickerInfo = this.A0a;
        if (inspirationMusicStickerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMusicStickerInfo.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0R, i);
        C3o5.A0d(parcel, this.A0T, i);
        1BL.A13(parcel, this.A0o);
        C3o5.A0d(parcel, this.A0W, i);
        C3o5.A0d(parcel, this.A0X, i);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeInt(this.A14 ? 1 : 0);
        parcel.writeInt(this.A15 ? 1 : 0);
        parcel.writeInt(this.A16 ? 1 : 0);
        parcel.writeInt(this.A17 ? 1 : 0);
        C3o5.A0d(parcel, this.A0O, i);
        parcel.writeFloat(this.A02);
        DKH.A12(parcel, this.A0i);
        DKH.A11(parcel, this.A0e, i);
        C3o5.A0f(parcel, this.A0k);
        DKH.A12(parcel, this.A0j);
        C3o5.A0d(parcel, this.A0V, i);
        C3o5.A0d(parcel, this.A0Q, i);
        1BL.A13(parcel, this.A0p);
        1BL.A13(parcel, this.A0q);
        C3o5.A0d(parcel, this.A0S, i);
        parcel.writeFloat(this.A03);
        parcel.writeDouble(this.A00);
        C3o5.A0e(parcel, this.A0C);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0r);
        parcel.writeInt(this.A18 ? 1 : 0);
        parcel.writeInt(this.A19 ? 1 : 0);
        parcel.writeInt(this.A1A ? 1 : 0);
        parcel.writeInt(this.A1B ? 1 : 0);
        parcel.writeInt(this.A1C ? 1 : 0);
        parcel.writeInt(this.A1D ? 1 : 0);
        parcel.writeInt(this.A1E ? 1 : 0);
        1BL.A13(parcel, this.A0s);
        C3o5.A0d(parcel, this.A0Y, i);
        1BL.A13(parcel, this.A0t);
        parcel.writeInt(this.A09);
        1BL.A13(parcel, this.A0u);
        parcel.writeFloat(this.A04);
        C3o5.A0d(parcel, this.A0U, i);
        MetaGalleryMetadata metaGalleryMetadata = this.A0d;
        if (metaGalleryMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metaGalleryMetadata.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0v);
        C3o5.A0e(parcel, this.A0D);
        C3o5.A0e(parcel, this.A0E);
        1BL.A13(parcel, this.A0w);
        parcel.writeLong(this.A0B);
        InspirationTimedElementParams inspirationTimedElementParams = this.A0b;
        if (inspirationTimedElementParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTimedElementParams.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A05);
        parcel.writeString(this.A0x);
        1Du A0b3 = 1BL.A0b(parcel, this.A0h);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        parcel.writeInt(this.A0A);
        parcel.writeFloat(this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A0y);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
