package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C2203Dgv;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKa;
import X.Qzo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.ipc.composer.model.richtext.ComposerRichTextStyle;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerGroupConfiguration.class */
public final class ComposerGroupConfiguration implements Parcelable {
    public static volatile GraphQLTextWithEntities A0o;
    public static final Parcelable.Creator CREATOR = FKa.A00(25);
    public final C2203Dgv A00;
    public final GraphQLTextWithEntities A01;
    public final ComposerGroupAnonymousPostData A02;
    public final ComposerGroupProfileSwitchToggleData A03;
    public final ComposerRichTextStyle A04;
    public final ImmutableList A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    /* loaded from: ComposerGroupConfiguration$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            ComposerGroupAnonymousPostData composerGroupAnonymousPostData = null;
            ComposerRichTextStyle composerRichTextStyle = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            String str5 = null;
            C2203Dgv c2203Dgv = null;
            GraphQLTextWithEntities graphQLTextWithEntities = null;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z30 = false;
            boolean z31 = false;
            boolean z32 = false;
            boolean z33 = false;
            boolean z34 = false;
            boolean z35 = false;
            boolean z36 = false;
            ComposerGroupProfileSwitchToggleData composerGroupProfileSwitchToggleData = null;
            boolean z37 = false;
            HashSet A0v = AnonymousClass001.A0v();
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2140883584:
                                if (A1C.equals("is_eligible_for_r_m_s_bottomsheet")) {
                                    z20 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -2011608993:
                                if (A1C.equals("group_reels_privacy_description")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1979851315:
                                if (A1C.equals("allows_jobs_group_sprout")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1953894883:
                                if (A1C.equals("groups_welcome_post_prefill_text")) {
                                    c2203Dgv = (C2203Dgv) AbstractC11224vw.A02(abstractC01033pi, c27t, C2203Dgv.class);
                                    break;
                                }
                                break;
                            case -1939790406:
                                if (A1C.equals("is_looking_for_players_supported")) {
                                    z28 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1822872755:
                                if (A1C.equals("allows_branded_content_group_sprout")) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1684726380:
                                if (A1C.equals("is_attending_events_supported")) {
                                    z17 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1613388033:
                                if (A1C.equals("can_viewer_create_media_poll")) {
                                    z7 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1559211287:
                                if (A1C.equals("is_chat_creation_from_composer_enabled")) {
                                    z18 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1544026004:
                                if (A1C.equals("is_viewer_admin_of_initial_target_group")) {
                                    z34 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1380060263:
                                if (A1C.equals("group_contribution_badge_s_a_t_p_data")) {
                                    composerRichTextStyle = (ComposerRichTextStyle) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerRichTextStyle.class);
                                    break;
                                }
                                break;
                            case -1364890752:
                                if (A1C.equals("profile_switch_toggle_data")) {
                                    composerGroupProfileSwitchToggleData = (ComposerGroupProfileSwitchToggleData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGroupProfileSwitchToggleData.class);
                                    break;
                                }
                                break;
                            case -1275647005:
                                if (A1C.equals("is_poll_supported")) {
                                    z30 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1058336183:
                                if (A1C.equals("group_sfv_privacy_description")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -881260642:
                                if (A1C.equals("is_gif_supported")) {
                                    z23 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -839270792:
                                if (A1C.equals("composer_group_anonymous_post_data")) {
                                    composerGroupAnonymousPostData = (ComposerGroupAnonymousPostData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerGroupAnonymousPostData.class);
                                    break;
                                }
                                break;
                            case -803376944:
                                if (A1C.equals("is_live_supported")) {
                                    z27 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -657494413:
                                if (A1C.equals("is_group_reels_supported")) {
                                    z25 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -618997588:
                                if (A1C.equals("can_viewer_see_psuedo_upsell_message")) {
                                    z13 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -484435150:
                                if (A1C.equals("is_welcome_to_group_post")) {
                                    z36 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -409497272:
                                if (A1C.equals("initial_text")) {
                                    graphQLTextWithEntities = (GraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    C1pq.A08("initialText", graphQLTextWithEntities);
                                    A0v = 4YV.A10("initialText", A0v);
                                    break;
                                }
                                break;
                            case -404516918:
                                if (A1C.equals("is_video_meetup_supported")) {
                                    z33 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -309255036:
                                if (A1C.equals("group_reels_privacy_icon_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -279698123:
                                if (A1C.equals("can_viewer_see_post_title_sprout")) {
                                    z10 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -200661091:
                                if (A1C.equals("is_community_giving_creation_from_composer_enabled")) {
                                    z19 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -163459011:
                                if (A1C.equals("group_reshare_data")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerGroupReshareData.class);
                                    C1pq.A08("groupReshareData", of);
                                    break;
                                }
                                break;
                            case -136086819:
                                if (A1C.equals("can_viewer_cross_post")) {
                                    z8 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 30430288:
                                if (A1C.equals("is_music_group")) {
                                    z29 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 74305733:
                                if (A1C.equals("can_viewer_be_redirect_to_reels_composer")) {
                                    z4 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 204595807:
                                if (A1C.equals("can_viewer_see_profile_switch_toggle")) {
                                    z11 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 267122605:
                                if (A1C.equals("can_viewer_see_interruptive_rules_in_post_composer")) {
                                    z9 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 276699759:
                                if (A1C.equals("is_fundraiser_supported")) {
                                    z22 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 486175669:
                                if (A1C.equals("can_viewer_create_event")) {
                                    z6 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 804905093:
                                if (A1C.equals("should_disable_file_upload_for_work")) {
                                    z37 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 851848935:
                                if (A1C.equals("groups_welcome_post_creation_entrypoint")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1039499581:
                                if (A1C.equals("is_group_reels_remix_supported")) {
                                    z24 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1096857057:
                                if (A1C.equals("can_viewer_see_sell_something_sprout")) {
                                    z14 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1107057581:
                                if (A1C.equals("group_theme_color")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                break;
                            case 1193377351:
                                if (A1C.equals("allow_groups_scheduled_post")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1261415675:
                                if (A1C.equals("group_reels_privacy_title")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1342886085:
                                if (A1C.equals("is_a_i_rewrite_enabled")) {
                                    z16 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1402423745:
                                if (A1C.equals("is_thanks_group_post")) {
                                    z32 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1447854994:
                                if (A1C.equals("is_empty_casual_group")) {
                                    z21 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1603966951:
                                if (A1C.equals("can_viewer_share_music")) {
                                    z15 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1643883349:
                                if (A1C.equals("is_viewer_in_creation_unification_experiment")) {
                                    z35 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1698580483:
                                if (A1C.equals("is_group_reshare_pill_enabled")) {
                                    z26 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1730931716:
                                if (A1C.equals("can_viewer_create_collaborative_posts")) {
                                    z5 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2072862529:
                                if (A1C.equals("can_viewer_see_profile_switcher")) {
                                    z12 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2125131777:
                                if (A1C.equals("is_product_tagging_in_groups_enabled")) {
                                    z31 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerGroupConfiguration.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerGroupConfiguration(c2203Dgv, graphQLTextWithEntities, composerGroupAnonymousPostData, composerGroupProfileSwitchToggleData, composerRichTextStyle, of, num, str, str2, str3, str4, str5, A0v, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37);
        }
    }

    /* loaded from: ComposerGroupConfiguration$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerGroupConfiguration composerGroupConfiguration = (ComposerGroupConfiguration) obj;
            r302.A0b();
            boolean z = composerGroupConfiguration.A0D;
            r302.A0o("allow_groups_scheduled_post");
            r302.A0v(z);
            boolean z2 = composerGroupConfiguration.A0E;
            r302.A0o("allows_branded_content_group_sprout");
            r302.A0v(z2);
            boolean z3 = composerGroupConfiguration.A0F;
            r302.A0o("allows_jobs_group_sprout");
            r302.A0v(z3);
            boolean z4 = composerGroupConfiguration.A0G;
            r302.A0o("can_viewer_be_redirect_to_reels_composer");
            r302.A0v(z4);
            boolean z5 = composerGroupConfiguration.A0H;
            r302.A0o("can_viewer_create_collaborative_posts");
            r302.A0v(z5);
            boolean z6 = composerGroupConfiguration.A0I;
            r302.A0o("can_viewer_create_event");
            r302.A0v(z6);
            boolean z7 = composerGroupConfiguration.A0J;
            r302.A0o("can_viewer_create_media_poll");
            r302.A0v(z7);
            boolean z8 = composerGroupConfiguration.A0K;
            r302.A0o("can_viewer_cross_post");
            r302.A0v(z8);
            boolean z9 = composerGroupConfiguration.A0L;
            r302.A0o("can_viewer_see_interruptive_rules_in_post_composer");
            r302.A0v(z9);
            boolean z10 = composerGroupConfiguration.A0M;
            r302.A0o("can_viewer_see_post_title_sprout");
            r302.A0v(z10);
            boolean z11 = composerGroupConfiguration.A0N;
            r302.A0o("can_viewer_see_profile_switch_toggle");
            r302.A0v(z11);
            boolean z12 = composerGroupConfiguration.A0O;
            r302.A0o("can_viewer_see_profile_switcher");
            r302.A0v(z12);
            boolean z13 = composerGroupConfiguration.A0P;
            r302.A0o("can_viewer_see_psuedo_upsell_message");
            r302.A0v(z13);
            boolean z14 = composerGroupConfiguration.A0Q;
            r302.A0o("can_viewer_see_sell_something_sprout");
            r302.A0v(z14);
            boolean z15 = composerGroupConfiguration.A0R;
            r302.A0o("can_viewer_share_music");
            r302.A0v(z15);
            AbstractC11224vw.A05(r302, c26c, composerGroupConfiguration.A02, "composer_group_anonymous_post_data");
            AbstractC11224vw.A05(r302, c26c, composerGroupConfiguration.A04, "group_contribution_badge_s_a_t_p_data");
            AbstractC11224vw.A0D(r302, "group_reels_privacy_description", composerGroupConfiguration.A07);
            AbstractC11224vw.A0D(r302, "group_reels_privacy_icon_id", composerGroupConfiguration.A08);
            AbstractC11224vw.A0D(r302, "group_reels_privacy_title", composerGroupConfiguration.A09);
            AbstractC11224vw.A06(r302, c26c, "group_reshare_data", composerGroupConfiguration.A05);
            AbstractC11224vw.A0D(r302, "group_sfv_privacy_description", composerGroupConfiguration.A0A);
            AbstractC11224vw.A0B(r302, composerGroupConfiguration.A06, "group_theme_color");
            AbstractC11224vw.A0D(r302, "groups_welcome_post_creation_entrypoint", composerGroupConfiguration.A0B);
            AbstractC11224vw.A05(r302, c26c, composerGroupConfiguration.A00, "groups_welcome_post_prefill_text");
            AbstractC11224vw.A05(r302, c26c, composerGroupConfiguration.A00(), "initial_text");
            boolean z16 = composerGroupConfiguration.A0S;
            r302.A0o("is_a_i_rewrite_enabled");
            r302.A0v(z16);
            boolean z17 = composerGroupConfiguration.A0T;
            r302.A0o("is_attending_events_supported");
            r302.A0v(z17);
            boolean z18 = composerGroupConfiguration.A0U;
            r302.A0o("is_chat_creation_from_composer_enabled");
            r302.A0v(z18);
            boolean z19 = composerGroupConfiguration.A0V;
            r302.A0o("is_community_giving_creation_from_composer_enabled");
            r302.A0v(z19);
            boolean z20 = composerGroupConfiguration.A0W;
            r302.A0o("is_eligible_for_r_m_s_bottomsheet");
            r302.A0v(z20);
            boolean z21 = composerGroupConfiguration.A0X;
            r302.A0o("is_empty_casual_group");
            r302.A0v(z21);
            boolean z22 = composerGroupConfiguration.A0Y;
            r302.A0o("is_fundraiser_supported");
            r302.A0v(z22);
            boolean z23 = composerGroupConfiguration.A0Z;
            r302.A0o("is_gif_supported");
            r302.A0v(z23);
            boolean z24 = composerGroupConfiguration.A0a;
            r302.A0o("is_group_reels_remix_supported");
            r302.A0v(z24);
            boolean z25 = composerGroupConfiguration.A0b;
            r302.A0o("is_group_reels_supported");
            r302.A0v(z25);
            boolean z26 = composerGroupConfiguration.A0c;
            r302.A0o("is_group_reshare_pill_enabled");
            r302.A0v(z26);
            boolean z27 = composerGroupConfiguration.A0d;
            r302.A0o("is_live_supported");
            r302.A0v(z27);
            boolean z28 = composerGroupConfiguration.A0e;
            r302.A0o("is_looking_for_players_supported");
            r302.A0v(z28);
            boolean z29 = composerGroupConfiguration.A0f;
            r302.A0o("is_music_group");
            r302.A0v(z29);
            boolean z30 = composerGroupConfiguration.A0g;
            r302.A0o("is_poll_supported");
            r302.A0v(z30);
            boolean z31 = composerGroupConfiguration.A0h;
            r302.A0o("is_product_tagging_in_groups_enabled");
            r302.A0v(z31);
            boolean z32 = composerGroupConfiguration.A0i;
            r302.A0o("is_thanks_group_post");
            r302.A0v(z32);
            boolean z33 = composerGroupConfiguration.A0j;
            r302.A0o("is_video_meetup_supported");
            r302.A0v(z33);
            boolean z34 = composerGroupConfiguration.A0k;
            r302.A0o("is_viewer_admin_of_initial_target_group");
            r302.A0v(z34);
            boolean z35 = composerGroupConfiguration.A0l;
            r302.A0o("is_viewer_in_creation_unification_experiment");
            r302.A0v(z35);
            boolean z36 = composerGroupConfiguration.A0m;
            r302.A0o("is_welcome_to_group_post");
            r302.A0v(z36);
            AbstractC11224vw.A05(r302, c26c, composerGroupConfiguration.A03, "profile_switch_toggle_data");
            DKG.A1T(r302, "should_disable_file_upload_for_work", composerGroupConfiguration.A0n);
        }
    }

    public ComposerGroupConfiguration(C2203Dgv c2203Dgv, GraphQLTextWithEntities graphQLTextWithEntities, ComposerGroupAnonymousPostData composerGroupAnonymousPostData, ComposerGroupProfileSwitchToggleData composerGroupProfileSwitchToggleData, ComposerRichTextStyle composerRichTextStyle, ImmutableList immutableList, Integer num, String str, String str2, String str3, String str4, String str5, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37) {
        this.A0D = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A0G = z4;
        this.A0H = z5;
        this.A0I = z6;
        this.A0J = z7;
        this.A0K = z8;
        this.A0L = z9;
        this.A0M = z10;
        this.A0N = z11;
        this.A0O = z12;
        this.A0P = z13;
        this.A0Q = z14;
        this.A0R = z15;
        this.A02 = composerGroupAnonymousPostData;
        this.A04 = composerRichTextStyle;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        C1pq.A08("groupReshareData", immutableList);
        this.A05 = immutableList;
        this.A0A = str4;
        this.A06 = num;
        this.A0B = str5;
        this.A00 = c2203Dgv;
        this.A01 = graphQLTextWithEntities;
        this.A0S = z16;
        this.A0T = z17;
        this.A0U = z18;
        this.A0V = z19;
        this.A0W = z20;
        this.A0X = z21;
        this.A0Y = z22;
        this.A0Z = z23;
        this.A0a = z24;
        this.A0b = z25;
        this.A0c = z26;
        this.A0d = z27;
        this.A0e = z28;
        this.A0f = z29;
        this.A0g = z30;
        this.A0h = z31;
        this.A0i = z32;
        this.A0j = z33;
        this.A0k = z34;
        this.A0l = z35;
        this.A0m = z36;
        this.A03 = composerGroupProfileSwitchToggleData;
        this.A0n = z37;
        this.A0C = Collections.unmodifiableSet(set);
    }

    public ComposerGroupConfiguration(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A0D = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = 1BM.A07(parcel);
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A0L = 1BM.A07(parcel);
        this.A0M = 1BM.A07(parcel);
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0P = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0R = 1BM.A07(parcel);
        ComposerGroupProfileSwitchToggleData composerGroupProfileSwitchToggleData = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ComposerGroupAnonymousPostData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ComposerRichTextStyle) ComposerRichTextStyle.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        int readInt = parcel.readInt();
        ComposerGroupReshareData[] composerGroupReshareDataArr = new ComposerGroupReshareData[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, composerGroupReshareDataArr, i2);
        }
        this.A05 = ImmutableList.copyOf(composerGroupReshareDataArr);
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (C2203Dgv) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        this.A0Z = 1BM.A07(parcel);
        this.A0a = 1BM.A07(parcel);
        this.A0b = 1BM.A07(parcel);
        this.A0c = 1BM.A07(parcel);
        this.A0d = 1BM.A07(parcel);
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = 1BM.A07(parcel);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A0l = 1BM.A07(parcel);
        this.A0m = 1BM.A07(parcel);
        this.A03 = parcel.readInt() != 0 ? (ComposerGroupProfileSwitchToggleData) parcel.readParcelable(A0e) : composerGroupProfileSwitchToggleData;
        this.A0n = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0C = Collections.unmodifiableSet(A0v);
    }

    public GraphQLTextWithEntities A00() {
        if (this.A0C.contains("initialText")) {
            return this.A01;
        }
        if (A0o == null) {
            synchronized (this) {
                if (A0o == null) {
                    GraphQLTextWithEntities A00 = Qzo.A00("");
                    11T.A0A(A00);
                    A0o = A00;
                }
            }
        }
        return A0o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupConfiguration)) {
                return false;
            }
            ComposerGroupConfiguration composerGroupConfiguration = (ComposerGroupConfiguration) obj;
            if (this.A0D != composerGroupConfiguration.A0D || this.A0E != composerGroupConfiguration.A0E || this.A0F != composerGroupConfiguration.A0F || this.A0G != composerGroupConfiguration.A0G || this.A0H != composerGroupConfiguration.A0H || this.A0I != composerGroupConfiguration.A0I || this.A0J != composerGroupConfiguration.A0J || this.A0K != composerGroupConfiguration.A0K || this.A0L != composerGroupConfiguration.A0L || this.A0M != composerGroupConfiguration.A0M || this.A0N != composerGroupConfiguration.A0N || this.A0O != composerGroupConfiguration.A0O || this.A0P != composerGroupConfiguration.A0P || this.A0Q != composerGroupConfiguration.A0Q || this.A0R != composerGroupConfiguration.A0R || !11T.A0O(this.A02, composerGroupConfiguration.A02) || !11T.A0O(this.A04, composerGroupConfiguration.A04) || !11T.A0O(this.A07, composerGroupConfiguration.A07) || !11T.A0O(this.A08, composerGroupConfiguration.A08) || !11T.A0O(this.A09, composerGroupConfiguration.A09) || !11T.A0O(this.A05, composerGroupConfiguration.A05) || !11T.A0O(this.A0A, composerGroupConfiguration.A0A) || !11T.A0O(this.A06, composerGroupConfiguration.A06) || !11T.A0O(this.A0B, composerGroupConfiguration.A0B) || !11T.A0O(this.A00, composerGroupConfiguration.A00) || !11T.A0O(A00(), composerGroupConfiguration.A00()) || this.A0S != composerGroupConfiguration.A0S || this.A0T != composerGroupConfiguration.A0T || this.A0U != composerGroupConfiguration.A0U || this.A0V != composerGroupConfiguration.A0V || this.A0W != composerGroupConfiguration.A0W || this.A0X != composerGroupConfiguration.A0X || this.A0Y != composerGroupConfiguration.A0Y || this.A0Z != composerGroupConfiguration.A0Z || this.A0a != composerGroupConfiguration.A0a || this.A0b != composerGroupConfiguration.A0b || this.A0c != composerGroupConfiguration.A0c || this.A0d != composerGroupConfiguration.A0d || this.A0e != composerGroupConfiguration.A0e || this.A0f != composerGroupConfiguration.A0f || this.A0g != composerGroupConfiguration.A0g || this.A0h != composerGroupConfiguration.A0h || this.A0i != composerGroupConfiguration.A0i || this.A0j != composerGroupConfiguration.A0j || this.A0k != composerGroupConfiguration.A0k || this.A0l != composerGroupConfiguration.A0l || this.A0m != composerGroupConfiguration.A0m || !11T.A0O(this.A03, composerGroupConfiguration.A03) || this.A0n != composerGroupConfiguration.A0n) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(A00(), C1pq.A04(this.A00, C1pq.A04(this.A0B, C1pq.A04(this.A06, C1pq.A04(this.A0A, C1pq.A04(this.A05, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A0D), this.A0E), this.A0F), this.A0G), this.A0H), this.A0I), this.A0J), this.A0K), this.A0L), this.A0M), this.A0N), this.A0O), this.A0P), this.A0Q), this.A0R)))))))))))), this.A0S), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X), this.A0Y), this.A0Z), this.A0a), this.A0b), this.A0c), this.A0d), this.A0e), this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A0l), this.A0m)), this.A0n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        C3o5.A0d(parcel, this.A02, i);
        ComposerRichTextStyle composerRichTextStyle = this.A04;
        if (composerRichTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerRichTextStyle.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1Du A0b = 1BL.A0b(parcel, this.A05);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerGroupReshareData) A0b.next(), i);
        }
        1BL.A13(parcel, this.A0A);
        C3o5.A0f(parcel, this.A06);
        1BL.A13(parcel, this.A0B);
        DKH.A0y(parcel, this.A00);
        DKH.A0y(parcel, this.A01);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        C3o5.A0d(parcel, this.A03, i);
        parcel.writeInt(this.A0n ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A0C);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
