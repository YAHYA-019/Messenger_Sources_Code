package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.3o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3o4.class */
public abstract class AbstractC00603o4 {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "android.permission.READ_MEDIA_IMAGES";
            case 1:
                return "com.facebook.orca.notify.SECURE_VIEW";
            case 2:
                return "android.permission.READ_MEDIA_VIDEO";
            case 3:
                return "com.facebook.messaging.marketplace.plugins.marketplacefolder.MarketplaceDrawerFolderKillSwitch";
            case 4:
                return "android.permission.READ_MEDIA_AUDIO";
            case 5:
                return "channel_creation_entry_point";
            case 6:
                return "com.facebook.messaging.archivedchats.plugins.archive.ArchiveKillSwitch";
            case 7:
                return "com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent";
            case 8:
                return "com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.SpamFolderKillSwitch";
            case 9:
                return "fb_messaging_attribution_logging_entrypoint";
            case 10:
                return "is_request_to_join_selected";
            case 11:
                return "messenger_customthreads_picker_save";
            case 12:
                return "null cannot be cast to non-null type kotlin.Float";
            case 13:
                return "BugReporter";
            case 14:
                return "Missing Required Props";
            case 15:
                return "ccu_contacts_upload_information_event";
            case 16:
                return "downstream_bandwidth_kbps";
            case 17:
                return "fb_messaging_initiating_app_id";
            case 18:
                return "is_from_switcher_add_account";
            case 19:
                return "screen_type";
            case 20:
                return "send_as_message_entry_point";
            case 21:
                return "unread_count";
            case 22:
                return "upstream_bandwidth_kbps";
            case 23:
                return "use_thread_transition";
            case 24:
                return "FbZeroRequestHandler";
            case 25:
                return "SecureMessageFetchUnreadPeerDeviceChangeAlert";
            case 26:
                return "android.permission.ACCESS_WIFI_STATE";
            case 27:
                return "application_link_type";
            case 28:
                return "community_channel_invite_entrypoint";
            case 29:
                return TraceFieldType.Error;
            case 30:
                return "extra_thread_view_params";
            case 31:
                return "feedback_type";
            case 32:
                return "incoming intent uri cannot be null";
            case 33:
                return "media_template_pause_video";
            case 34:
                return "messenger_customthreads_picker_open";
            case 35:
                return "out_of_app_message";
            case 36:
                return "profile_picture_url";
            case 37:
                return "sim_operator_mcc_mnc";
            case 38:
                return "stories_interactive_feedback";
            case 39:
                return "target_fragment";
            case 40:
                return "video_duration_ms";
            case 41:
                return "350685531728";
            case 42:
                return "Current token (";
            case 43:
                return "MESSENGER_JOIN_REQUEST";
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return "Search";
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return "USE_LONG_TIMEOUT_FOR_PENDING_INTENT";
            case 46:
                return "account_id";
            case ActionId.ON_START_END /* 47 */:
                return "action_type";
            case ActionId.QUEUED /* 48 */:
                return "android_messenger_ranking_sync";
            case ActionId.IN_PROGRESS /* 49 */:
                return "app_launch";
            case 50:
                return "bot_response_id";
            case ActionId.UNKNOWN /* 51 */:
                return "ccu_contacts_upload_failed_event";
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return "com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent";
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return "com.facebook.messenger.neue.MainActivity";
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return "composer_entry";
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return "creation_session_id";
            case ActionId.QUEUEING_FAIL /* 56 */:
                return "deeplink_url";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return "entrypoint_type";
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return "error_recovery_attempt";
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return "extra_account_switch_redirect_source";
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return "extra_account_switch_target_uid";
            case ActionId.COUNTER /* 61 */:
                return "flow_from_fb4a_redirect";
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return "inbox_ia_screen";
            case 63:
                return "last_active_time";
            case 64:
                return "link_hash";
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return "media_upload_segmented_transcode_success";
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return "memu_onboarding_thread_key";
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return "message_requests_delete_request";
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return "messaging_ai_agent_interactions";
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return "messenger_group_create_success";
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return "mobile_config_error";
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return "mobile_power_stats";
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return "msgr_account_login_flow";
            case ActionId.INTENT_MAPPED /* 73 */:
                return "network_generation";
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return "network_operator_mcc_mnc";
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return "network_operator_name";
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return "open_channel_list";
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                return "p2p_history_get_request";
            case ActionId.FRAGMENT_CREATED /* 78 */:
                return "p2p_history_get_success";
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                return "p2p_history_visible_tab";
            case 80:
                return "p2p_initiate_edit_card";
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                return "pages_event";
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return "phone_type";
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                return "product_extras";
            case ActionId.MARKER_SWAPPED /* 84 */:
                return "rtc_callsite_impression";
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                return "rx_link_speed_mbps";
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                return "silent_switch_account";
            case ActionId.ERROR /* 87 */:
                return "tactic";
            case ActionId.METHOD_INVOKE /* 88 */:
                return "tx_link_speed_mbps";
            case ActionId.FINALLY /* 89 */:
                return TraceFieldType.ServerUpstreamLatency;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return "user_ids";
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                return " instead";
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return ", badgeCount=";
            case ActionId.ANIMATION_END /* 93 */:
                return ", isHidden=";
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return ", username=";
            case ActionId.MAIN_COMPLETE /* 95 */:
                return "CONFIG_FETCH_ERROR";
            case ActionId.INTERRUPTED /* 96 */:
                return "Continue";
            case ActionId.NETWORK_FAILED /* 97 */:
                return "EXTRA_OPEN_OMNI_PICKER";
            case ActionId.NETWORK_RESPONSE /* 98 */:
                return "EXTRA_SAVED_TAB";
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                return "FacebookPushServerRegistrar";
            case 100:
                return "GeoApiLocationAppStateListener";
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                return "HOTSPOT";
            case ActionId.DATA_LOAD_START /* 102 */:
                return "INVALID_TOKEN";
            case ActionId.LEGACY_MARKER /* 103 */:
                return "MessagingNotificationAccountSwitchIntentWrapperaccount_switch_target_account_ui_info";
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return "MessagingNotificationAccountSwitchIntentWrapperaccount_switch_target_user_id";
            case ActionId.ABORTED /* 105 */:
                return "MessagingNotificationAccountSwitchIntentWrappernotification_pending_intent";
            case ActionId.QUERY_READY /* 106 */:
                return "Received ";
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                return "Session viewer is not matched with intent url passed viewer";
            case 108:
                return "THREAD_KEY";
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                return "Unable to complete resolveOneToOneThreadKeyAsync(...)";
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                return "Unexpected ";
            case ActionId.NEW_START_FOUND /* 111 */:
                return "You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)";
            case ActionId.MISSED_EVENT /* 112 */:
                return "ZeroStatusUpdateContentRetriever";
            case ActionId.TIMEOUT /* 113 */:
                return "\\s*,\\s*";
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                return "account_switcher";
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return "adContextMediaAttachments";
            case ActionId.VIDEO_PLAYING /* 116 */:
                return "admin_pages_prefetch_failure";
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return "android.provider.extra.CHANNEL_ID";
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                return "android.settings.CHANNEL_NOTIFICATION_SETTINGS";
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return "android_messenger_switch_account_auth_successful";
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return "android_messenger_switch_account_session_expired";
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return "approve_request";
            case ActionId.CARD_DATA_LOADED /* 122 */:
                return "audio_clips_cancelled_by_user";
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                return "audio_clips_download_error";
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                return "audio_clips_playback_error";
            case 125:
                return "audio_clips_playback_pause";
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                return "audio_clips_playback_resume";
            case 127:
                return "audio_clips_playback_start";
            case 128:
                return "audio_clips_send";
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                return "audio_clips_show_composer";
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                return "bishop_call_home";
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                return "block_id";
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                return "bluetooth";
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                return "bss_load";
            case ActionId.APP_MAIN /* 134 */:
                return "caption_change";
            case ActionId.MQTT_CONNECTING /* 135 */:
                return "carrier_logo_url";
            case ActionId.MQTT_CONNECTED /* 136 */:
                return "carrier_mcc";
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                return "carrier_mnc";
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                return "ccu_contacts_upload_succeeded_event";
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                return "ccu_create_session_check_sync_event";
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                return "ccu_setting";
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                return "ccu_setting_enable_disable_event";
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                return "ccu_setting_failed_event";
            case ActionId.ACTIVITY_RESUME /* 143 */:
                return "ccu_upload";
            case ActionId.ACTIVITY_START /* 144 */:
                return "chathead_settings_change";
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                return "clear_montage_composition";
            case ActionId.END_START_ACTIVITY /* 146 */:
                return TraceFieldType.ClientPublicAddr;
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                return "com.bloks.www.minishops.pdp";
            case ActionId.FORMAT_ERROR /* 148 */:
                return "com.bloks.www.p2p.payment.composer";
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                return "com.facebook.common.connectionstatus.FbDataConnectionManager.BANDWIDTH_STATE";
            case 150:
                return "com.facebook.messaging.navigation.home.tabs.plugins.core.NavigationHomeTabsCoreKillSwitch";
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                return "com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch";
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                return "com.facebook.messaging.navigation.plugins.travel.NavigationTravelKillSwitch";
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                return "com.facebook.messaging.support.plugins.supportfolder.SupportFolderKillSwitch";
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                return "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.WellbeingUnknowncontactMessagerequestsHomedrawerKillSwitch";
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                return "component_helper_name";
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                return "composer_cancel";
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                return "composer_init";
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                return "composer_initial_text";
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                return "composer_post";
            case ActionId.OFFLINE /* 160 */:
                return "composer_post_failure";
            case ActionId.ASNYC_FAILED /* 161 */:
                return "composer_post_success";
            case ActionId.ASYNC_FAIL /* 162 */:
                return "contact_upload_entry_event";
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                return "content_search_final_result";
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                return "create_chat_suggestion";
            case ActionId.DISPLAYED /* 165 */:
                return "create_community";
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                return "create_group_attempt";
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                return "create_thread_step";
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                return "dash.live_prefetch_max_retries";
            case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                return "dialtone_ineligible_interstitial_become_invisible";
            case ActionId.VIDEO_DISPLAYED /* 170 */:
                return "dialtone_ineligible_interstitial_impression";
            case ActionId.VIDEO_REQUESTED_PLAYING /* 171 */:
                return "effect_cache_eviction_report";
            case 172:
                return "email_auto_confirm_failure";
            case 173:
                return "empty String (\"\")";
            case 174:
                return "exit_background_job";
            case 175:
                return "external_intent";
            case 176:
                return "extra_launch_uri";
            case 177:
                return "extra_message";
            case 178:
                return "facecast_broadcaster_update";
            case 179:
                return "fb-messenger-secure://accounts";
            case 180:
                return "fb-messenger-secure://join_request";
            case 181:
                return "fb-messenger-secure://notification_to_account_switch";
            case 182:
                return "fb_messaging_attribution_logging_content_id";
            case 183:
                return "fb_messaging_attribution_logging_post_id";
            case 184:
                return "first_message_first_send_delta";
            case 185:
                return "forward_send_pressed";
            case 186:
                return "friend_finder_legal_get_started";
            case 187:
                return "friend_finder_legal_opened";
            case 188:
                return "group_thread_type";
            case 189:
                return "handle_mdotme_natively";
            case 190:
                return "has_icc_card";
            case 191:
                return "image/jpg";
            case 192:
                return "intent_auth_type_extra_key";
            case 193:
                return TraceFieldType.IpAddr;
            case 194:
                return "is_data_roaming_enabled";
            case 195:
                return "keyframes_frame_perf_report";
            case 196:
                return "long_press";
            case 197:
                return "marketing_message_page_id";
            case 198:
                return "marketplace_impression";
            case 199:
                return "media_attachment_preparation_summary";
            case 200:
                return "media_post_start";
            case 201:
                return "media_post_success";
            case 202:
                return "media_template_click_to_fullscreen";
            case 203:
                return "media_template_play_video";
            case 204:
                return "media_upload_cancel";
            case 205:
                return "media_upload_chunk_transfer_failure";
            case 206:
                return "media_upload_chunk_transfer_start";
            case 207:
                return "media_upload_chunk_transfer_success";
            case 208:
                return "media_upload_failure";
            case 209:
                return "media_upload_flow_fatal";
            case 210:
                return "media_upload_flow_start";
            case 211:
                return "media_upload_flow_success";
            case 212:
                return "media_upload_init_failure";
            case 213:
                return "media_upload_init_start";
            case 214:
                return "media_upload_init_success";
            case 215:
                return "media_upload_process_failure";
            case 216:
                return "media_upload_process_skipped";
            case 217:
                return "media_upload_process_start";
            case 218:
                return "media_upload_process_success";
            case 219:
                return "media_upload_start";
            case 220:
                return "media_upload_success";
            case 221:
                return "media_upload_transfer_failure";
            case 222:
                return "media_upload_transfer_start";
            case 223:
                return "media_upload_transfer_success";
            case 224:
                return "mention";
            case 225:
                return "message_action";
            case 226:
                return "message_collapsing_groups_collapse";
            case 227:
                return "message_collapsing_groups_expand";
            case 228:
                return "message_requests_delete_attempt_multiple";
            case 229:
                return "message_requests_delete_cancel_multiple";
            case 230:
                return "message_requests_delete_request_multiple";
            case 231:
                return "message_requests_entrypoint_tap";
            case 232:
                return "message_requests_thread_open";
            case 233:
                return "messaging_push_notif_";
            case 234:
                return "messenger.com";
            case 235:
                return "messenger_built_in_composer_shortcut_click";
            case 236:
                return "messenger_built_in_composer_shortcut_impression";
            case 237:
                return "messenger_ctm_ads_pre_send";
            case 238:
                return "messenger_hscroll_impression";
            case 239:
                return "messenger_mention";
            case 240:
                return "messenger_notification_banner_events";
            case 241:
                return "messenger_orca_900_chathead_active";
            case 242:
                return "messenger_search_data_source_loaded";
            case 243:
                return "messenger_thread_notif_setting_change";
            case 244:
                return "messenger_welcome_page_seen";
            case 245:
                return "mnet_conversion_rtc";
            case 246:
                return "mnet_conversion_share";
            case 247:
                return "mnet_impression_bcf";
            case 248:
                return "mnet_impression_rtc";
            case 249:
                return "mobile_image_transcode";
            case 250:
                return "mobile_power_attribution_stats";
            case Process.SD_STDOUT /* 251 */:
                return "montageXRaySmartFeature";
            case Process.SD_PIPE /* 252 */:
                return "montage_seen_list";
            case Process.SD_BLACK_HOLE /* 253 */:
                return "mqtt_get_diffs";
            case 254:
                return "mswitchaccounts_unseen_fetch";
            case 255:
                return "mswitchaccounts_unseen_fetch_failure";
            case 256:
                return "mswitchaccounts_unseen_fetch_success";
            case 257:
                return "multiway_join_via_push_notification";
            case 258:
                return "network_country_iso";
            case 259:
                return "note_creators";
            case 260:
                return "notification_id";
            case 261:
                return "nt_render_failure";
            case 262:
                return "null cannot be cast to non-null type android.net.Uri";
            case 263:
                return "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.model.CommunityDrawerFolderKey";
            case 264:
                return "offline_mode_operation_retry_succeeded";
            case 265:
                return "open_admin_onboarding_bottom_sheet";
            case 266:
                return "open_pending_member_chat_suggestions_screen";
            case 267:
                return "open_pending_member_requests_screen";
            case 268:
                return "open_story_media_permalink";
            case 269:
                return "open_thread_member_requests_screen";
            case 270:
                return "other_user_fbid";
            case 271:
                return "page_name";
            case 272:
                return "payflows_click";
            case 273:
                return "payflows_fail";
            case 274:
                return "perf_touch_up_endpoint";
            case 275:
                return "perf_touch_up_mono_time_ms";
            case 276:
                return "photoUri";
            case 277:
                return "pixel_ratio";
            case 278:
                return "post_save_wait_time_millis";
            case 279:
                return "pre_game_start_api_call";
            case 280:
                return "priority_diff";
            case 281:
                return "products";
            case 282:
                return "push_id";
            case 283:
                return "redirect_url";
            case 284:
                return "referrer";
            case 285:
                return "retry_tapped";
            case 286:
                return "rich_media_msg_send";
            case 287:
                return "rtc_call_aborted";
            case 288:
                return "rtc_call_attempted";
            case 289:
                return "rtc_call_initialized";
            case 290:
                return "rtc_effect_impression";
            case 291:
                return "rtc_expression";
            case 292:
                return "samsung_warning_notification";
            case 293:
                return "selected_item";
            case 294:
                return "send_message";
            case 295:
                return "share_send_pressed";
            case 296:
                return "show_inbox";
            case 297:
                return "sim_country_iso";
            case 298:
                return "sim_mcc";
            case 299:
                return "sim_mnc";
            case 300:
                return "sim_specific_carrier_id";
            case 301:
                return "sms_short_code_notif_action_add";
            case 302:
                return "stall_detail";
            case 303:
                return TraceFieldType.StatusCode;
            case 304:
                return "sticker_asset";
            case 305:
                return "stories_tab";
            case 306:
                return "story_interactive_item_click";
            case 307:
                return "syncPayload";
            case 308:
                return "sync_full_refresh";
            case 309:
                return "task_name";
            case 310:
                return "text/plain";
            case 311:
                return "thread_activity_banner_seen";
            case 312:
                return "thread_activity_banner_tapped";
            case 313:
                return "time_spent_bit_array";
            case 314:
                return "touch_down";
            case 315:
                return "touch_up";
            case 316:
                return "unmuted";
            case 317:
                return TraceFieldType.VideoId;
            case 318:
                return "view_attribution_link";
            case 319:
                return " because it's no longer in the DB";
            case 320:
                return " does not exist";
            case 321:
                return ", hasPendingAdminInvite=";
            case 322:
                return ", instagramId=";
            case 323:
                return ", obfuscatedId=";
            case 324:
                return ", pauseStatus=";
            case 325:
                return ", unfilteredBadgeCount=";
            case 326:
                return ", unpackedNotifications=";
            case 327:
                return ", xmaContentType=";
            case 328:
                return "105910932827969";
            case 329:
                return "181425161904154";
            case 330:
                return "612618412962237";
            case 331:
                return "?use_e2ee=true";
            case 332:
                return "ACTION_STOP_FOREGROUND";
            case 333:
                return "ARMADILLO_NOTIFICATIONS_RECEIVED_WRONG_USER_NOTIFICATION";
            case 334:
                return "ARMADILLO_NOTIFICATIONS_SERVICE_LAUNCHER_INITIATED";
            case 335:
                return "AcceptFriendInSmallGroupRequestIntentHandler";
            case 336:
                return "AcceptFriendRequestIntentHandler";
            case 337:
                return "AddFriendInSmallGroupRequestIntentHandler";
            case 338:
                return "Cannot create empty instance of %s, no default Creator";
            case 339:
                return "Cannot find a deserializer for type ";
            case 340:
                return "CloseConnectionsPrefetcher";
            case 341:
                return "CommunityMenuItems";
            case 342:
                return "DATA_SAVER_ENABLED";
            case 343:
                return "DeleteFriendRequestIntentHandler";
            case 344:
                return "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS";
            case 345:
                return "EXTRA_FOCUS_TAB_ENTRY_POINT";
            case 346:
                return "EXTRA_OPEN_FRIEND_REQUEST_FOLDER";
            case 347:
                return "EXTRA_OPEN_HALF_SHEET_ACCOUNT_SWITCHER";
            case 348:
                return "EXTRA_SKIP_PING";
            case 349:
                return "Error parsing extras";
            case 350:
                return "Event: %s. url: %s";
            case 351:
                return "Exception in topic data reading";
            case 352:
                return "Expected object header. Got 0x";
            case 353:
                return "FACEBOOK_GAMING_DMA";
            case 354:
                return "FACEBOOK_NT_URI_MODULE";
            case 355:
                return "FACEBOOK_QUICKSILVER_MODULE";
            case 356:
                return "FOR_CONDITIONAL_WORKER_SERVICE";
            case 357:
                return "Failed to load config";
            case 358:
                return "Failed to send like due to null thread key.";
            case 359:
                return "FbPushDataDecryptionManager";
            case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH /* 360 */:
                return "FeatureWalletEventHandler";
            case 361:
                return "HyperThriftWriter.write";
            case 362:
                return "Incorrect intent %s";
            case 363:
                return "Integer value (";
            case 364:
                return "IntentExtraHandler";
            case 365:
                return "IntentHandlerDelegateImpl";
            case 366:
                return "Internal error: this code path should never get executed";
            case 367:
                return "Key retrieved from keystore is not an ECPrivateKey";
            case 368:
                return "Key retrieved from keystore is not an ECPublicKey";
            case 369:
                return "LegacySyncLastDeltaTracker";
            case 370:
                return "MARKER_START";
            case 371:
                return "MESSENGER_QP_PLATFORM_BLOKS_MESSENGER_REQUEST";
            case 372:
                return "MapConfigUpdateDispatchable";
            case 373:
                return "MessagingNotificationAccountSwitchIntentWrappernotification_redirect_source";
            case 374:
                return C4Dk.__redex_internal_original_name;
            case AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS /* 375 */:
                return "MobileConfig ";
            case 376:
                return "Network error";
            case 377:
                return "Overread allowed size end=";
            case 378:
                return "PERMISSION_DENIED";
            case 379:
                return "PageIncomingCallNotificationConstACCOUNT_SWITCH_AUTO_CONNECT_JSON_STRING";
            case 380:
                return "PageIncomingCallNotificationConstACCOUNT_SWITCH_AUTO_CONNECT_SOURCE_ORDINAL";
            case 381:
                return "PageIncomingCallNotificationConstACCOUNT_SWITCH_TARGAET_ACCOUNT_UI_INFO";
            case 382:
                return "PageIncomingCallNotificationConstACCOUNT_SWITCH_TARGAET_USER_ID";
            case 383:
                return "PageIncomingCallNotificationConstNOTIFICATION_PENDING_INTENT";
            case 384:
                return "Received intent: %s";
            case 385:
                return "Received null topic data";
            case 386:
                return "ResolveQRLinkMutation";
            case 387:
                return "SERVICE_INVALID";
            case 388:
                return "SERVICE_MISSING";
            case 389:
                return "START_RTC_ENGINE";
            case 390:
                return "START_RTC_ENGINE_ENABLED";
            case 391:
                return "SendFriendRequestIntentHandler";
            case 392:
                return "Sign-in succeeded with resolve account failure: ";
            case 393:
                return "Size read is invalid start=";
            case 394:
                return "Stopped listening for background";
            case 395:
                return "The JSON node is not textual or numeric";
            case 396:
                return "Token request succeed. Start to register with FB push server.";
            case 397:
                return "Unknown api response type";
            case 398:
                return "UploadServiceBus";
            case 399:
                return "We have received a community list of size: ";
            case 400:
                return "X-ZERO-INVALID-CARRIER";
            case 401:
                return "account_name";
            case 402:
                return "action_target";
            case 403:
                return "adContextInThreadWarningStatus";
            case 404:
                return "ad_account_id_val";
            case 405:
                return "android.intent.action.BATTERY_LOW";
            case 406:
                return "android.intent.action.BATTERY_OKAY";
            case 407:
                return "android.intent.category.DEFAULT";
            case 408:
                return "android.permission.ACCESS_BACKGROUND_LOCATION";
            case 409:
                return "android.title";
            case 410:
                return "android_api_level";
            case 411:
                return "app_switch_url";
            case 412:
                return "arg_booking_request_id";
            case 413:
                return "arg_calendar_status";
            case 414:
                return "arg_checkpoint_id";
            case 415:
                return "arg_provider";
            case 416:
                return "attribution_id_v2";
            case 417:
                return "background_job";
            case 418:
                return "background_job__protocol_remote_setting";
            case 419:
                return "banner_upgrade_mobile_plan";
            case 420:
                return "biim_chatbot_entity_ad_option";
            case 421:
                return "block_entry_point";
            case 422:
                return "block_source";
            case 423:
                return "bloks_screen";
            case 424:
                return "bloks_screen_params";
            case 425:
                return "bloks_screen_query";
            case 426:
                return "booking_request_id";
            case 427:
                return "broadcastchannelsdirectory";
            case 428:
                return "call_home_request";
            case 429:
                return "can_other_user_be_invited_to_messenger_kids_in_thread";
            case 430:
                return "can_viewer_only_activated_kid_account_connect_to_other_user_only_kid_account";
            case 431:
                return "cancelled_requested_playing";
            case 432:
                return "cant_get_overriden_viewer_context";
            case 433:
                return TraceEventType.CertVerification;
            case 434:
                return "channelSource";
            case 435:
                return "close_browser";
            case 436:
                return "com.bloks.www.biim.automation.settings";
            case 437:
                return "com.bloks.www.bmc.tas.chat.labels.screen";
            case 438:
                return "com.bloks.www.marketing.messages.optin";
            case 439:
                return "com.bloks.www.messenger.customer_information";
            case 440:
                return "com.bloks.www.p2m.review";
            case 441:
                return "com.bloks.www.page.call.hours";
            case 442:
                return "com.facebook.account.login.annotations.LoginViaBrowserComponentHelper";
            case 443:
                return "com.facebook.businessintegrity.gdpr.triggers.URL";
            case 444:
                return "com.facebook.growth.attribution.AttributionUriMapper";
            case 445:
                return "com.facebook.logginginfra.falco.GetQPLConfigDirective";
            case 446:
                return "com.facebook.logginginfra.falco.PrincipalSubject";
            case 447:
                return "com.facebook.logginginfra.falco.SetQPLConfigDirective";
            case 448:
                return "com.facebook.maps.GenericMapsUriMapHelper";
            case 449:
                return "com.facebook.messaging.accountswitch.TRIGGER_SSO";
            case 450:
                return "com.facebook.messaging.directshare.SHARE_TARGET_SHORTCUT";
            case 451:
                return "com.facebook.messaging.stella.plugins.interfaces.incomingmessageconfig.IncomingMessageConfigInterfaceSpec";
            case 452:
                return "com.facebook.messaging.stella.plugins.productionincomingmessage.StellaProductionincomingmessageKillSwitch";
            case 453:
                return "com.facebook.messaging.stella.plugins.productionincomingmessage.stella.StellaImplementation";
            case 454:
                return "com.facebook.pages.app.activity.helper.BizAppHideTitleBarComponentHelper";
            case 455:
                return "com.facebook.payments.checkout.intents.CheckoutActivityComponentHelper";
            case 456:
                return "com.facebook.payments.chromecustomtabs.CustomTabMainActivityComponentHelper";
            case 457:
                return "com.facebook.payments.receipt.PaymentsReceiptActivityComponentHelper";
            case 458:
                return "com.facebook.privacyflowtrigger.URL";
            case 459:
                return "com.facebook.quicksilver.QuicksilverActivity";
            case 460:
                return "com.facebook.timeline.componenthelper.TimelineUriMapHelper";
            case 461:
                return "com.facebook.zero.settings.MobileCenterURLHandler";
            case 462:
                return "community_admin_setup_general_chat";
            case 463:
                return "community_chats_unavailable";
            case 464:
                return "community_creation_entrypoint";
            case 465:
                return "composer_game_list_open";
            case 466:
                return "composer_initial_text_by_m_dot_me";
            case 467:
                return "composer_p2p_selected";
            case 468:
                return "compression_level";
            case 469:
                return "conditional_worker_event";
            case 470:
                return "connection_type";
            case 471:
                return "consent_flow_name";
            case 472:
                return "contact on messenger status for %s changed to %b";
            case 473:
                return "contact_upload_ccu_setting_check";
            case 474:
                return "conversion_type";
            case 475:
                return "create_community_button";
            case 476:
                return "dash.live_max_dash_segments_per_video_buffered";
            case 477:
                return "dash.live_num_segments_prefetch";
            case 478:
                return "destination_url";
            case 479:
                return "dialtone_not_in_region_flag";
            case 480:
                return "dialtone_wrong_carrier_flag";
            case 481:
                return "disabled_rt_verifier";
            case 482:
                return "dismiss_last_qp";
            case 483:
                return "drawer_main_content_component";
            case 484:
                return "eligibility_result";
            case 485:
                return "entry_point_val";
            case 486:
                return "error_source";
            case 487:
                return "expected fromKey <= toKey but %s > %s";
            case 488:
                return "expected padding character '";
            case 489:
                return "extra_account_switch_target_name";
            case 490:
                return "extra_account_switch_target_thread_id";
            case 491:
                return "extra_family_center_url";
            case 492:
                return "extra_launch_family_center";
            case 493:
                return "extra_params";
            case 494:
                return "extra_thread_view_source_string";
            case 495:
                return "extra_url_data";
            case 496:
                return "failed_disable_rt_verifier";
            case 497:
                return "failed_playing";
            case 498:
                return "failure_message";
            case 499:
                return "fb-messenger-secure://app_redirect_account_switch";
            case 500:
                return "fb-messenger-secure://marketing_message_push_reminder";
            case 501:
                return "fb-messenger-secure://messagesearch";
            case 502:
                return "fb-messenger-secure://rtc_join_call";
            case 503:
                return "fb-messenger://consumer_inbox_order_history";
            case 504:
                return "fb-messenger://inbox_bulk_thread_deletion";
            case 505:
                return "fb-messenger://montage";
            case 506:
                return "fb_messaging_entrypoint";
            case 507:
                return "fb_messaging_share_source";
            case 508:
                return "fb_messaging_surface";
            case 509:
                return "fb_messaging_surface_hierarchy";
            case 510:
                return "fb_sharing_logging_fbid";
            case 511:
                return "fb_sharing_logging_shareable_entity_audience";
            case 512:
                return "fbinternal://autoflex_new_res_optin";
            case 513:
                return "fbinternal://zero_flex_optin_reconsider";
            case 514:
                return "fetchZeroTokenRequestParams";
            case 515:
                return "finished_playing";
            case 516:
                return "focus_compose";
            case 517:
                return "fragment_type";
            case 518:
                return "friends_focus_subtab";
            case 519:
                return "group_invite_link_open_ts";
            case 520:
                return "hardware_address";
            case 521:
                return "headers_disabled";
            case 522:
                return "headwind_user_signal";
            case 523:
                return "https://m.me/v/";
            case 524:
                return "image_attachment";
            case 525:
                return "incoming_payment_message";
            case 526:
                return "initial_category_id";
            case 527:
                return "intent_handler_delegate_arg1";
            case 528:
                return "intent_handler_delegate_arg2";
            case 529:
                return "invite_community_id";
            case 530:
                return "invite_group_id";
            case 531:
                return "invite_message";
            case 532:
                return "is_logged_in";
            case 533:
                return TraceFieldType.IsPushRequest;
            case 534:
                return "is_viewer_admin";
            case 535:
                return "jewel_dedup_id";
            case 536:
                return "jumpstart_banner_control";
            case 537:
                return "last_cancel_all_time_ms";
            case 538:
                return "launch_thread_view_as_activity";
            case 539:
                return "log_message_body";
            case 540:
                return "m.facebook.com";
            case 541:
                return "mDatabase is null when calling Mailbox#getDatabase";
            case 542:
                return "m_dot_me_ref_param";
            case 543:
                return "marketing_message_push_reminder";
            case 544:
                return "meetup_third_party_intent";
            case 545:
                return "member_chat_suggestion";
            case 546:
                return "message_requests";
            case 547:
                return "message_send_failure";
            case 548:
                return "messagesearch";
            case 549:
                return "messaging.stella.incomingmessageconfig.IncomingMessageConfigInterfaceSpec";
            case 550:
                return "messaging.stella.productionincomingmessage.stella.StellaImplementation";
            case 551:
                return "messaging_commerce";
            case 552:
                return "messengerinboxfolderaction";
            case 553:
                return "mk_other_inviter_invite_days_since";
            case 554:
                return "msg_send_attempted";
            case 555:
                return "msg_send_waterfall";
            case 556:
                return "msgr_notif_delivery";
            case 557:
                return "msplit_contacts_import";
            case 558:
                return "mtouch_diode";
            case 559:
                return "neo_approved_user_id";
            case 560:
                return "next_alarm_manager_id";
            case 561:
                return "next_job_scheduler_id";
            case 562:
                return "no String-argument constructor/factory method to deserialize from String value ('%s')";
            case 563:
                return "notif_received_push";
            case 564:
                return "notif_seen_id";
            case 565:
                return "notification.message_id";
            case 566:
                return "notification.notificationId";
            case 567:
                return "notification_clicked_quick_action";
            case 568:
                return "null cannot be cast to non-null type com.facebook.litho.Component";
            case 569:
                return "null cannot be cast to non-null type com.facebook.pando.TreeJNI";
            case 570:
                return "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>";
            case 571:
                return "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>";
            case 572:
                return "obfuscated_id";
            case 573:
                return "onCollectionAvailable";
            case 574:
                return "on_launch_navigate_to";
            case 575:
                return "on_launch_navigation_data";
            case 576:
                return "open_link_from";
            case 577:
                return "open_link_from_app_version";
            case 578:
                return "open_search_dialog_on_start";
            case 579:
                return "orca_registration/account_recovery_id_version";
            case 580:
                return "outgoing_like_message";
            case 581:
                return "overflow, value cannot be represented as 16-bit value";
            case 582:
                return "overflow, value cannot be represented as 8-bit value";
            case 583:
                return "oxygen_map_static_map_view_impression";
            case 584:
                return "p2p_sync_delta";
            case 585:
                return "page_call_prompt_xma";
            case 586:
                return "partnership_name";
            case 587:
                return "payflows_back_click";
            case 588:
                return "payflows_cancel";
            case 589:
                return "payflows_done_click";
            case 590:
                return "payflows_field_focus";
            case 591:
                return "payflows_init";
            case 592:
                return "payflows_success";
            case 593:
                return "pdp_product_id";
            case 594:
                return "pdp_variant_product_item_id";
            case 595:
                return "pending_intent_post_switch_account";
            case 596:
                return "plain_instance_log_data";
            case 597:
                return "player_format_changed";
            case 598:
                return "prefer_chat_if_possible";
            case 599:
                return "prefill_amount";
            case 600:
                return "prefill_memo";
            case 601:
                return "privacy_settings";
            case 602:
                return "push_notif_id";
            case 603:
                return "pymk_location";
            case 604:
                return "pymk_position";
            case 605:
                return "pymk_signature";
            case 606:
                return "qp_sdk_clash";
            case 607:
                return "query_matches";
            case 608:
                return TraceFieldType.QuicClientCID;
            case 609:
                return TraceFieldType.QuicServerCID;
            case 610:
                return "recurring_notification";
            case 611:
                return "referral_source";
            case 612:
                return "registerPushTokenNoUserParams";
            case 613:
                return "registerPushTokenParams";
            case 614:
                return "reliabilities_serialization_failed";
            case 615:
                return "representation_ended";
            case 616:
                return "request_access";
            case 617:
                return "request_access_mustache";
            case 618:
                return TraceFieldType.ReqBodySize;
            case 619:
                return TraceFieldType.ReqHeaderSize;
            case 620:
                return "request_name";
            case 621:
                return "request_reason";
            case 622:
                return "request_type";
            case 623:
                return "requested_playing";
            case 624:
                return TraceFieldType.RspBodySize;
            case 625:
                return "response_code";
            case 626:
                return TraceFieldType.RspHeaderSize;
            case 627:
                return "screen_density";
            case 628:
                return "seen_in_group";
            case 629:
                return TraceFieldType.ServerDatetime;
            case 630:
                return "server_info_id";
            case 631:
                return "setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)";
            case 632:
                return "settings/privacy";
            case 633:
                return "settings/privacy/security_alerts";
            case 634:
                return "share_attachment_url";
            case 635:
                return "share_description";
            case 636:
                return "share_non_editable_text";
            case 637:
                return "share_return_to_fb4a";
            case 638:
                return "share_robotext";
            case 639:
                return "share_story_url";
            case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT /* 640 */:
                return "sim_carrier_name";
            case 641:
                return "started_playing";
            case 642:
                return "success_message";
            case 643:
                return "suggested_recipients";
            case 644:
                return "surface_nux_id";
            case 645:
                return "switch_accounts_text";
            case 646:
                return "sync_delta_handling";
            case 647:
                return "thread_view_source_for_settings";
            case 648:
                return "threads_properties";
            case 649:
                return "threadsettings";
            case 650:
                return "toggle_flex_banner_button_off";
            case 651:
                return "toggle_flex_banner_button_on";
            case 652:
                return "tokenRequestReason";
            case 653:
                return "unexpected state: ";
            case 654:
                return "updateIsMessengerUserParams";
            case 655:
                return "upgraded_from_group_thread_id";
            case 656:
                return "upload_succeeded";
            case 657:
                return "variant_product_item_id";
            case 658:
                return "watch_eligible_url";
            case 659:
                return "wifi_standard";
            case 660:
                return "xma_content_attribution_id";
            case 661:
                return "xma_content_creator";
            case 662:
                return "xma_content_creator_id";
            case 663:
                return "xma_content_id";
            case 664:
                return "xma_content_uri";
            case 665:
                return "xma_default_cta";
            case 666:
                return "xma_expiry_timestamp";
            case 667:
                return "xma_header_attribution_uri";
            case 668:
                return "xma_is_private";
            case 669:
                return "xma_layout_type";
            case 670:
                return "xma_main_title";
            case 671:
                return "xma_max_main_title_lines";
            case 672:
                return "xma_max_sub_title_lines";
            case 673:
                return "xma_preview_uri";
            case 674:
                return "xma_share_surface";
            case 675:
                return "xma_style_list";
            default:
                return "xma_sub_title";
        }
    }
}
