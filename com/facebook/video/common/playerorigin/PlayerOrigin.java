package com.facebook.video.common.playerorigin;

import X.11T;
import X.6TL;
import X.82N;
import X.C7ls;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceEventType;
import java.util.Arrays;

/* loaded from: PlayerOrigin.class */
public final class PlayerOrigin implements Parcelable {
    public static final PlayerOrigin A03;
    public static final PlayerOrigin A04;
    public static final PlayerOrigin A05;
    public static final PlayerOrigin A06;
    public static final PlayerOrigin A07;
    public static final PlayerOrigin A08;
    public static final PlayerOrigin A09;
    public static final PlayerOrigin A0A;
    public static final PlayerOrigin A0B;
    public static final PlayerOrigin A0C;
    public static final PlayerOrigin A0D;
    public static final PlayerOrigin A0E;
    public static final PlayerOrigin A0F;
    public static final PlayerOrigin A0G;
    public static final PlayerOrigin A0H;
    public static final PlayerOrigin A0I;
    public static final PlayerOrigin A0J;
    public static final PlayerOrigin A0K;
    public static final PlayerOrigin A0L;
    public static final PlayerOrigin A0M;
    public static final PlayerOrigin A0N;
    public static final PlayerOrigin A0O;
    public static final PlayerOrigin A0P;
    public static final PlayerOrigin A0Q;
    public static final PlayerOrigin A0R;
    public static final PlayerOrigin A0S;
    public static final PlayerOrigin A0T;
    public static final PlayerOrigin A0U;
    public static final PlayerOrigin A0V;
    public static final PlayerOrigin A0W;
    public static final PlayerOrigin A0X;
    public static final PlayerOrigin A0Y;
    public static final PlayerOrigin A0Z;
    public static final PlayerOrigin A0a;
    public static final PlayerOrigin A0b;
    public static final PlayerOrigin A0c;
    public static final PlayerOrigin A0d;
    public static final PlayerOrigin A0e;
    public static final PlayerOrigin A0f;
    public static final PlayerOrigin A0g;
    public static final PlayerOrigin A0h;
    public static final PlayerOrigin A0i;
    public static final PlayerOrigin A0j;
    public static final PlayerOrigin A0k;
    public static final PlayerOrigin A0l;
    public static final Parcelable.Creator CREATOR;
    public final String A00;
    public final String A01;
    public volatile String A02;

    static {
        6TL r0 = 6TL.A1D;
        new PlayerOrigin(r0, "actor_profile_video");
        6TL r02 = 6TL.A1I;
        new PlayerOrigin(r02, "album_feed");
        new PlayerOrigin(6TL.A03, "audio_home");
        new PlayerOrigin(6TL.A04, "autodownload");
        A03 = new PlayerOrigin(6TL.A05, "background_play");
        A04 = new PlayerOrigin(6TL.A06, "bell_multiple");
        new PlayerOrigin(6TL.A08, "biz_disco_feed");
        A05 = new PlayerOrigin(r0, "carousel_video");
        new PlayerOrigin(r0, "channel_view");
        new PlayerOrigin(6TL.A0C, "comment");
        6TL r03 = 6TL.A0E;
        new PlayerOrigin(r03, "composer");
        A06 = new PlayerOrigin(r03, "music_attachment");
        new PlayerOrigin(r0, "cultural_moments_share");
        new PlayerOrigin(r0, "cm_promotion");
        new PlayerOrigin(6TL.A0H, "unknown");
        new PlayerOrigin(6TL.A0J, "direct_inbox_production_video");
        6TL r04 = 6TL.A0M;
        new PlayerOrigin(r04, "feed_story");
        new PlayerOrigin(r04, "event_chevron");
        new PlayerOrigin(r04, "event_cover_video");
        new PlayerOrigin(r04, "events_live_cta");
        new PlayerOrigin(r04, "event_pay_to_access_cta");
        new PlayerOrigin(r04, "event_tour_cover_video");
        6TL r05 = 6TL.A1K;
        new PlayerOrigin(r05, "events_tour_card");
        new PlayerOrigin(r05, "EVENT_MULTI_EVENTS_CARD");
        6TL r06 = 6TL.A0O;
        new PlayerOrigin(r06, "huddle_live_audio");
        new PlayerOrigin(6TL.A0P, "facebook_note");
        6TL r07 = 6TL.A0Y;
        A07 = new PlayerOrigin(r07, "story_tray");
        A08 = new PlayerOrigin(r0, "feed_story");
        new PlayerOrigin(r0, "fb_shorts_native_in_feed_unit");
        new PlayerOrigin(r0, "chevron");
        new PlayerOrigin(r0, "video_inline_pivot");
        new PlayerOrigin(r0, "live_ring");
        new PlayerOrigin(r0, "feed_midcard");
        new PlayerOrigin(r0, "multimedia_post");
        A09 = new PlayerOrigin(r0, "music_attachment");
        6TL r08 = 6TL.A1F;
        new PlayerOrigin(r08, "notifications");
        new PlayerOrigin(r02, "fullscreen_video_uri");
        6TL r09 = 6TL.A1t;
        new PlayerOrigin(r09, "global_search_warion");
        6TL r010 = 6TL.A1d;
        new PlayerOrigin(r010, "global_search_warion");
        6TL r011 = 6TL.A0j;
        A0A = new PlayerOrigin(r011, "feed_story");
        new PlayerOrigin(r011, "chevron");
        new PlayerOrigin(6TL.A1P, "haptic_sound_effect");
        A0B = new PlayerOrigin(6TL.A0l, "huddle_live_audio");
        A0C = new PlayerOrigin(r02, "inspiration_camera");
        A0D = new PlayerOrigin(r02, "inspiration_remix");
        6TL r012 = 6TL.A0n;
        A0E = new PlayerOrigin(r012, "instant_articles");
        new PlayerOrigin(r012, "shared_video_feed_story");
        new PlayerOrigin(6TL.A0o, "instant_experience");
        new PlayerOrigin(6TL.A0p, "instant_shopping");
        new PlayerOrigin(r03, "live_video_composer");
        new PlayerOrigin(6TL.A0w, "live_video_end_screen");
        new PlayerOrigin(r09, "live_linear_video_channel");
        new PlayerOrigin(6TL.A0x, "living_room");
        new PlayerOrigin(6TL.A0z, "living_room_comments");
        6TL r013 = 6TL.A11;
        new PlayerOrigin(r013, "living_room_recap_fullscreen");
        new PlayerOrigin(r013, "living_room_recap_inline");
        6TL r014 = 6TL.A12;
        A0F = new PlayerOrigin(r014, "feed_story");
        new PlayerOrigin(r014, "chevron");
        A0G = new PlayerOrigin(6TL.A0D, "marketplace_tab");
        new PlayerOrigin(6TL.A14, "media_gallery");
        new PlayerOrigin(r02, "media_picker");
        6TL r015 = 6TL.A15;
        A0H = new PlayerOrigin(r015, "messenger_content_search");
        A0I = new PlayerOrigin(r015, "gif_message");
        new PlayerOrigin(6TL.A17, "messenger_kids_threadview_inline");
        A0J = new PlayerOrigin(r015, "media_manager");
        new PlayerOrigin(r015, "media_tray_popup_view");
        A0K = new PlayerOrigin(r015, "media_picker_popup_view");
        new PlayerOrigin(r015, "direct_viewer_rvp");
        6TL r016 = 6TL.A19;
        A0M = new PlayerOrigin(r016, "viewer_rvp");
        A0L = new PlayerOrigin(r016, "stories_grid_autoplay");
        A0N = new PlayerOrigin(r015, "multimedia_editor_preview");
        A0O = new PlayerOrigin(6TL.A18, "messenger_note");
        A0V = new PlayerOrigin(r015, "media_share_view");
        A0U = new PlayerOrigin(r015, "thread_video_message_view");
        A0T = new PlayerOrigin(r015, "thread_video_message_media_viewer");
        A0R = new PlayerOrigin(r015, "stax_thread_video_message_view");
        A0S = new PlayerOrigin(r015, "stax_thread_video_message_view_groot");
        A0P = new PlayerOrigin(r015, "stax_thread_video_message_media_viewer");
        A0Q = new PlayerOrigin(r015, "stax_thread_video_message_media_viewer_groot");
        A0W = new PlayerOrigin(r015, "viewer_rvp_seg");
        new PlayerOrigin(r016, "viewer_rvp_seg");
        A0X = new PlayerOrigin(r015, "xma_shared_video");
        new PlayerOrigin(r015, "messenger_discover_tab");
        new PlayerOrigin(r015, "messenger_selfie_sticker");
        new PlayerOrigin(6TL.A1B, "fullscreen");
        new PlayerOrigin(6TL.A1C, "native_templates");
        new PlayerOrigin(6TL.A1E, "native_templates");
        new PlayerOrigin(r05, "page_cover_video");
        new PlayerOrigin(r05, "page_header");
        new PlayerOrigin(r05, "page_tab_episodes");
        new PlayerOrigin(r05, "page_tab_home");
        new PlayerOrigin(r05, "page_tab_playlists");
        new PlayerOrigin(r05, "page_tab_show_videos");
        new PlayerOrigin(r05, "page_tab_live_tab");
        new PlayerOrigin(r05, "channel_tab_videos_card");
        new PlayerOrigin(r05, "video_page_spotlight_unit");
        new PlayerOrigin(r05, "feed_story");
        new PlayerOrigin(r05, "action_channel");
        new PlayerOrigin(r05, "chevron");
        new PlayerOrigin(r05, "page_video_list_permalink");
        6TL r017 = 6TL.A1N;
        A0Y = new PlayerOrigin(r017, "feed_story");
        new PlayerOrigin(r017, "faceweb_redirect");
        new PlayerOrigin(r017, "faceweb_redirect_with_thread");
        new PlayerOrigin(r017, "notifications");
        new PlayerOrigin(r017, TraceEventType.Push);
        new PlayerOrigin(6TL.A1O, "multimedia_post");
        6TL r018 = 6TL.A1q;
        A0Z = new PlayerOrigin(r018, "profile_video");
        new PlayerOrigin(r018, "profile_cover_video");
        new PlayerOrigin(r018, "profile_cover_video_upload_artwork_preview");
        new PlayerOrigin(r018, "profile_cover_video_upload_header_preview");
        new PlayerOrigin(r018, "timeline_video_hub");
        new PlayerOrigin(r018, "profile_video_preview");
        6TL r019 = 6TL.A1Y;
        new PlayerOrigin(r019, "prompt_post");
        new PlayerOrigin(r019, "prompt_post_mega_nux");
        new PlayerOrigin(6TL.A0g, "games_tab");
        new PlayerOrigin(6TL.A0f, "games_feed");
        new PlayerOrigin(r02, "reaction_overlay");
        new PlayerOrigin(r010, "results_page_mixed_media");
        new PlayerOrigin(6TL.A1c, "saved_dashboard");
        A0a = new PlayerOrigin(r010, "results");
        new PlayerOrigin(6TL.A1g, "results");
        new PlayerOrigin(6TL.A1h, "sharesheet");
        A0b = new PlayerOrigin(r03, "fb_shorts_in_stories_reshare_sticker");
        new PlayerOrigin(6TL.A1j, "simple_picker");
        A0c = new PlayerOrigin(r08, "fb_stories_live_notification");
        A0e = new PlayerOrigin(r08, "fb_stories_viewersheet");
        A0d = new PlayerOrigin(r07, "fb_stories_optimistic_video");
        new PlayerOrigin(r07, "fb_stories_tray");
        new PlayerOrigin(r07, "fb_stories_viewersheet");
        new PlayerOrigin(r07, "fb_stories_viewer");
        A0f = new PlayerOrigin(6TL.A1o, "unified_camera_roll");
        A0g = new PlayerOrigin(6TL.A1p, "unknown");
        A0h = new PlayerOrigin(r018, "feed_story");
        new PlayerOrigin(r018, "chevron");
        new PlayerOrigin(r02, "video_album_permalink");
        new PlayerOrigin(6TL.A1s, "video_editing_gallery_preview");
        new PlayerOrigin(r09, "notifications");
        new PlayerOrigin(r09, TraceEventType.Push);
        new PlayerOrigin(r09, "saved_dashboard");
        new PlayerOrigin(r09, "watchlist");
        new PlayerOrigin(r09, "watchlist_aggregation");
        new PlayerOrigin(r09, "more_shows_fragment");
        new PlayerOrigin(r09, "after_party");
        new PlayerOrigin(r09, "discover_see_all");
        new PlayerOrigin(r09, "discover_topic_see_all");
        A0l = new PlayerOrigin(r09, "feed");
        new PlayerOrigin(r09, "fb_shorts_viewer");
        new PlayerOrigin(6TL.A1X, "fb_shorts_viewer");
        new PlayerOrigin(r09, "topic_feed");
        new PlayerOrigin(r09, "topic_music");
        A0j = new PlayerOrigin(r09, "entry_point");
        A0k = new PlayerOrigin(r09, "entry_point_notifications");
        new PlayerOrigin(r09, "fb_shorts_native_watch_in_feed_unit");
        new PlayerOrigin(r0, "video_sets");
        new PlayerOrigin(r09, r06.toString());
        new PlayerOrigin(6TL.A20, "youth_fullscreen_video");
        new PlayerOrigin(r0, "quick_promotion");
        A0i = new PlayerOrigin(r09, "share_sheet");
        CREATOR = new 82N(15);
    }

    public PlayerOrigin(6TL r302, String str) {
        this(r302.toString(), str);
    }

    public PlayerOrigin(Parcel parcel) {
        this.A00 = C7ls.A00(parcel.readString()).playerOriginSource;
        this.A01 = parcel.readString();
    }

    public PlayerOrigin(String str, String str2) {
        11T.A0F(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof PlayerOrigin)) {
                return false;
            }
            PlayerOrigin playerOrigin = (PlayerOrigin) obj;
            if (11T.A0O(this.A00, playerOrigin.A00) && 11T.A0O(this.A01, playerOrigin.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public String toString() {
        String str = this.A02;
        if (str == null) {
            String str2 = this.A01;
            if (str2 == null || str2.length() == 0) {
                str = this.A00;
            } else {
                str = StringFormatUtil.formatStrLocaleSafe("%s::%s", this.A00, str2);
                11T.A0A(str);
            }
            this.A02 = str;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
