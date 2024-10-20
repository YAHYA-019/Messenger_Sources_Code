package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.7t1, reason: invalid class name */
/* loaded from: 7t1.class */
public final class C7t1 {
    public static final String A00(AnonymousClass539 anonymousClass539) {
        switch (anonymousClass539.ordinal()) {
            case 0:
                return "unknown";
            case 3:
                return "messenger_inbox";
            case 5:
                return MRk.A00(0);
            case 13:
                return "messenger_inbox:pending_requests";
            case 17:
                return "messenger_inbox:holiday_card_share_sheet";
            case 18:
                return "messenger_inbox:holiday_card_share_sheet_qp";
            case 22:
                return "messenger_universal_search:message_search";
            case 42:
                return "montage_and_active_now:notes";
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return "montage_and_active_now:an_tray_story_reply";
            case 46:
                return "messenger_active_now_friends_tab:friends_tab";
            case ActionId.ON_START_END /* 47 */:
                return "people_tab_montage_reply";
            case ActionId.QUEUED /* 48 */:
                return "messenger_active_now_friends_tab:recent_active";
            case ActionId.IN_PROGRESS /* 49 */:
                return "messenger_active_now_friends_tab:recent_active_and_story";
            case ActionId.QUEUEING_BEGIN /* 54 */:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return AbE.A00(596);
            case ActionId.QUEUEING_FAIL /* 56 */:
                return "messenger_broadcast_flow:from_fb";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return "messenger_broadcast_flow:from_external";
            case ActionId.COUNTER /* 61 */:
                return "forward_gutter";
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return "forward_longclick";
            case 63:
                return "forward_fullscreen";
            case 64:
                return "messenger_omnipicker";
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return "messenger_notification";
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return "messenger_notification:longpress_reaction";
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return MRk.A00(13);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                return "messenger_montage_composer:friends_tab";
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return "messenger_montage_composer:friends_tab_story_and_active_now";
            case ActionId.VIDEO_PLAYING /* 116 */:
                return "messenger_montage_reply";
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return "messenger_montage_reply:inbox_thread_list_profile";
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                return "messenger_montage_reply:reply_context";
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return "messenger_montage_reply:thread_nav_bar";
            case 227:
                return "contact_manager";
            case 269:
                return "chathead_click_collapsed";
            case 270:
                return "timeline_message_button";
            case 271:
                return "direct_reply_intent";
            case 307:
                return "send_plugin";
            case 335:
                return "highlights_tab:feed_inline";
            case 338:
                return "highlights_tab:feed_inline_connected_chat";
            case 339:
                return "highlights_tab:feed_inline_local_event";
            case 340:
                return "highlights_tab:feed_inline_friends_update";
            case 341:
                return "highlights_tab:feed_inline_birthday";
            case 346:
                return "highlights_tab:thread_view_friends_update";
            case 347:
                return "highlights_tab:thread_view_birthday";
            case 348:
                return "highlights_tab:thread_view_note";
            case 349:
                return "highlights_tab:feed_inline_note";
            case 350:
                return "highlights_tab_connected_broadcast_channel_share_sheet";
            case 351:
                return "highlights_tab:smart_reply_drawer_birthday";
            case 352:
                return "highlights_tab:share_sheet_holiday_card";
            case 354:
                return "highlights_tab:quick_react_connected_chat";
            case 355:
                return "highlights_tab:quick_react_local_event";
            case 356:
                return "highlights_tab:quick_react_friends_update";
            case 357:
                return "highlights_tab:quick_react_birthday";
            case 358:
                return "highlights_tab:quick_react_stories";
            case 359:
                return "highlights_tab:quick_react_note";
            case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH /* 360 */:
                return "highlights_tab:quick_react_life_event";
            case 363:
                return "highlights_tab_stories_tray";
            case 393:
                return "shared_album";
            case 402:
                return "memories";
            case 404:
                return "memories_notification";
            case 405:
                return "memories_quick_promotion";
            case 406:
                return "memories_highlights_tab";
            case 407:
                return "memories_list";
            case 412:
                return "community_invite";
            case 413:
                return "community_chat_invite";
            case 420:
                return "ai_home_chat_with_ai";
            case 421:
                return "ai_home_inbox_qp";
            case 422:
                return "ai_agent_message_share";
            case 423:
                return "ai_home_from_thread";
            default:
                return anonymousClass539.name();
        }
    }
}
