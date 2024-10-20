package com.facebook.graphql.enums;

import X.DKF;
import com.facebook.acra.constants.ActionId;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLInstantGamesSDKMessageSet.class */
public final class GraphQLInstantGamesSDKMessageSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[ActionId.MESSENGER_DELTA_REQUEST];
        System.arraycopy(new String[]{"AD_CLICK", "ANALYTICS_LOG_EVENT", "APP_NOTIFICATION_OPT_IN_NOTIFICATION", "AR_CAMERA_FIRST", "AUTHORIZE_ASYNC", "AVERAGE_FRAME_TIME", "CAMERA_LOAD_EFFECT_ASYNC", "CAMERA_SHOW_EFFECT_ASYNC", "CAN_CREATE_SHORTCUT_ASYNC", "CG_CONNECTION_ERROR", "CG_RETRY", "CHANGE_CONTEXT_ASYNC", "CLEAR_AVATAR_EFFECTS_ASYNC", "CONTEXT_ADD_PLAYER_ASYNC", "CONTEXT_CHOOSE_ASYNC", "CONTEXT_CREATE_ASYNC", "CONTEXT_MATCH_CREATE_ASYNC", "CONTEXT_MATCH_DATA_FETCH_ASYNC", "CONTEXT_MATCH_DATA_INC_ASYNC", "CONTEXT_MATCH_DATA_SAVE_ASYNC", "CONTEXT_MATCH_END_ASYNC", "CONTEXT_MATCH_FETCH_ASYNC", "CONTEXT_PLAYERS_FETCH_ASYNC", "CONTEXT_SWITCH_ASYNC", "COPLAY_CLEAR_EFFECT_ASYNC", "COPLAY_LOAD_EFFECT_ASYNC", "COPLAY_SHOW_EFFECT_ASYNC"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"CREATE_AUGMENT_ASYNC", "CREATE_BOTTOM_SHEET_ASYNC", "CREATE_CHAT_MESSAGE_ASYNC", "CREATE_CONTEXTUAL_ELEMENT_ASYNC", "CREATE_CONTEXT_CARD_ASYNC", "CREATE_LIVE_PRODUCER_DIALOG_ASYNC", "CREATE_LIVE_PRODUCER_EXTRA_CONTENT_ASYNC", "CREATE_PLAYER_TAB_ASYNC", "CREATE_SHORTCUT_ASYNC", "CREATE_SPLITSCREEN_BOTTOM_SHEET_ASYNC", "DISMISS_BOTTOM_SHEET_ASYNC", "DISMISS_SPLITSCREEN_BOTTOM_SHEET_ASYNC", "DVR_CLIP_REQUESTED", "DVR_CLIP_RESULT", "FBGCOMPONENT_REPLACE", "FLUSH_PLAYER_DATA_ASYNC", "GAME_START", "GAME_SWITCH", "GAME_SWITCH_NATIVE", "GAME_TOS", "GAME_YIELD", "GENERIC_ACTION", "GESTURE_COMMAND", "GET_CLIPBOARD_TEXT_ASYNC", "GET_CONNECTED_PLAYERS_ASYNC", "GET_ENTRY_POINT_VIDEO_ID", "GET_ENTRY_POINT_VIDEO_ID_ASYNC"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"GET_INTERSTITIAL_AD_ASYNC", "GET_PLAYER_DATA_ASYNC", "GET_REWARDED_INTERSTITIAL_ASYNC", "GET_REWARDED_VIDEO_ASYNC", "GET_SIGNED_PLAYER_INFO_ASYNC", "HIDE_BANNER_AD_ASYNC", "INITIALIZE_ASYNC", "INVENTORY_UNLOCK_ITEM_ASYNC", "INVOKE_FBGCOMPONENT_CALLBACK", "LIVE_VIDEO_COMMENT_VIEW_CREATE_ASYNC", "LIVE_VIDEO_COMMENT_VIEW_DESTROY", "LIVE_VIDEO_COMMENT_VIEW_GET_DISPLAY_RECT_ASYNC", "LIVE_VIDEO_COMMENT_VIEW_GET_STATE_ASYNC", "LIVE_VIDEO_COMMENT_VIEW_SET_STATE", "LOAD_AD_ASYNC", "LOAD_AVATAR_EFFECTS_ASYNC", "LOAD_BANNER_AD_ASYNC", "MATCH_PLAYER_ASYNC", "MEDIA_SEND_IMAGE_ASYNC", "NAVIGATE_TO_CAMERA_WITH_EFFECT_ASYNC", "ON_BEGIN_LOAD", "ON_CONSOLE", "ON_END_GAME", "ON_FRAME_DROP", "ON_GAME_READY", "ON_PICTURE", "ON_PROGRESS_LOAD"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"ON_SCORE", "ON_SCREENSHOT", "OPEN_URL_ASYNC", "PAUSE", "PAYMENTS_CANCEL_SUBSCRIPTION_ASYNC", "PAYMENTS_CONSUME_PURCHASE_ASYNC", "PAYMENTS_FETCH_CATALOG_ASYNC", "PAYMENTS_FETCH_PURCHASES_ASYNC", "PAYMENTS_FETCH_SUBSCRIBABLE_CATALOG_ASYNC", "PAYMENTS_FETCH_SUBSCRIPTIONS_ASYNC", "PAYMENTS_INITIALIZED", "PAYMENTS_PURCHASE_ASYNC", "PAYMENTS_PURCHASE_SUBSCRIPTION_ASYNC", "PAYMENTS_RESTORE_PURCHASES_ASYNC", "PERFORM_HAPTIC_FEEDBACK_ASYNC", "PLUGIN_EVENT_UPDATE_SUBSCRIPTION_ASYNC", "PLUGIN_GAME_BOTTOM_SHEET_CREATE_ASYNC", "PLUGIN_GAME_BOTTOM_SHEET_DISMISS_ASYNC", "PLUGIN_GAME_BOTTOM_SHEET_ON_DISMISSED", "PLUGIN_GAME_BOTTOM_SHEET_ON_MESSAGE_RECEIVED", "PLUGIN_GAME_BOTTOM_SHEET_SEND_MESSAGE_ASYNC", "PLUGIN_GET_CONTENT_ID_ASYNC", "PLUGIN_QUERY_ASYNC", "PLUGIN_VIEWPORT_CHANGED_EVENT", "QUIT", "REALTIME_RECEIVE_MESSAGE", "REALTIME_RECEIVE_STATE_UPDATE"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"REALTIME_SEND_MESSAGE", "REALTIME_SEND_STATE_UPDATE", "REGISTER_SCREENSHOT_PROVIDER", "REJECT_PROMISE", "REQUEST_SCREENSHOT", "REQUEST_STAR_SEND_ASYNC", "RESOLVE_PROMISE", "RESTART", "RESUME", "SELECT_PLAYER_TAB_ASYNC", "SEND_PASS_THROUGH_ASYNC", "SET_CLIPBOARD_TEXT_ASYNC", "SET_PLAYER_DATA_ASYNC", "SET_SESSION_DATA", "SHARE_ASYNC", "SHOW_AD_ASYNC", "SHOW_AVATAR_EFFECTS_ASYNC", "SHOW_GENERIC_DIALOG_ASYNC", "SHOW_GENERIC_DIALOG_ASYNC_IOS", "SHOW_TOAST_ASYNC", "SUBSCRIBE_BOT_ASYNC", "VIDEO_PLAYER_CREATE_ASYNC", "VIDEO_PLAYER_GET_INSTANCES_ASYNC", "VIDEO_PLAYER_INSTANCE_DESTROY", "VIDEO_PLAYER_INSTANCE_GET_ORIGINAL_DIMENSIONS_ASYNC", "VIDEO_PLAYER_INSTANCE_GET_STATE_ASYNC", "VIDEO_PLAYER_INSTANCE_JUMP_TO_END"}, 0, strArr, 108, 27);
        A00 = DKF.A0w(new String[]{"VIDEO_PLAYER_INSTANCE_JUMP_TO_TIMESTAMP", "VIDEO_PLAYER_INSTANCE_SET_STATE", "VIDEO_PLAYER_INSTANCE_TIMESTAMP_UPDATE"}, strArr, 0, ActionId.MQTT_CONNECTING, 3);
    }

    public static final Set getSet() {
        return A00;
    }
}
