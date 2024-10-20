package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.acra.util.HttpRequest;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.000, reason: invalid class name */
/* loaded from: 000.class */
public abstract class AnonymousClass000 {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "null cannot be cast to non-null type kotlin.Int";
            case 1:
                return "Nested Switch Binding Exception: ";
            case 2:
                return "application/octet-stream";
            case 3:
                return "extra_thread_view_message_to_show";
            case 4:
                return "android.permission.READ_EXTERNAL_STORAGE";
            case 5:
                return "call to 'resume' before 'invoke' with coroutine";
            case 6:
                return "null cannot be cast to non-null type android.app.Application";
            case 7:
                return "android.permission.WRITE_EXTERNAL_STORAGE";
            case 8:
                return "multiple_thread_keys";
            case 9:
                return "stack_trace";
            case 10:
                return "android.permission.READ_CONTACTS";
            case 11:
                return "android.permission.READ_SMS";
            case 12:
                return "An operation is not implemented.";
            case 13:
                return "Failed requirement.";
            case 14:
                return "android.intent.extra.STREAM";
            case 15:
                return "android.permission.CALL_PHONE";
            case 16:
                return "android.permission.WRITE_CONTACTS";
            case 17:
                return "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED";
            case 18:
                return " is not supported";
            case 19:
                return "BrowserLiteIntent.EXTRA_LOGCAT";
            case 20:
                return "No start tag found";
            case 21:
                return "Optional.get() cannot be called on an absent value";
            case 22:
                return "access_token";
            case 23:
                return "airplane_mode_on";
            case 24:
                return "android.intent.action.SEND";
            case 25:
                return "android.intent.extra.TEXT";
            case 26:
                return "android.permission.ACCESS_COARSE_LOCATION";
            case 27:
                return "android.permission.ACCESS_NETWORK_STATE";
            case 28:
                return "android.permission.POST_NOTIFICATIONS";
            case 29:
                return OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER;
            case 30:
                return "com.facebook.";
            case 31:
                return "com.facebook.auth.login";
            case 32:
                return "instant_games";
            case 33:
                return "module_name";
            case 34:
                return "navigation_module";
            case 35:
                return TraceFieldType.NetworkType;
            case 36:
                return "torch-code-gen";
            case 37:
                return " AND ";
            case 38:
                return "AppContext.set has not been invoked";
            case 39:
                return "Char sequence is empty.";
            case 40:
                return "Must add a clock to the object pool builder";
            case 41:
                return "Unknown error";
            case 42:
                return "android.intent.action.BATTERY_CHANGED";
            case 43:
                return "android.intent.action.CLOSE_SYSTEM_DIALOGS";
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return "android.intent.action.MAIN";
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return "android.media.action.IMAGE_CAPTURE";
            case 46:
                return "android.os.SystemProperties";
            case ActionId.ON_START_END /* 47 */:
                return "android.permission.ACCESS_FINE_LOCATION";
            case ActionId.QUEUED /* 48 */:
                return "android.permission.RECORD_AUDIO";
            case ActionId.IN_PROGRESS /* 49 */:
                return "app_package_name";
            case 50:
                return HttpRequest.POST_CONTENT_TYPE_FORM_URLENCODED;
            case ActionId.UNKNOWN /* 51 */:
                return "com.facebook.katana";
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return "com.facebook.messenger";
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return "com.facebook.orca.ACTION_MULTIPLE_THREADS_READ_FOR_UI";
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return "com.whatsapp";
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return "duration_ms";
            case ActionId.QUEUEING_FAIL /* 56 */:
                return "dynamic_pytorch_impl";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return "extra_thread_view_source";
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return "http://schemas.android.com/apk/res/android";
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return "pytorch_jni_lite";
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return TraceFieldType.RetryCount;
            case ActionId.COUNTER /* 61 */:
                return "thread_view_messages_init_params";
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return " thrown from get()]";
            case 63:
                return "%s (%s) must be less than size (%s)";
            case 64:
                return ", found: ";
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return ", instanceKey=";
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return ", right=";
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return ".fbcdn.net";
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return "/proc/self/status";
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return "ACTION_MQTT_NO_AUTH";
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return "Android";
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return "BrowserLiteIntent.JS_BRIDGE";
            case ActionId.INTENT_MAPPED /* 73 */:
                return "CONNECTIVITY_CHANGED";
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return "Exception thrown from implementation: ";
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return "Expected size ";
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return "FAILURE, cause=[";
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                return "Optional.absent()";
            case ActionId.FRAGMENT_CREATED /* 78 */:
                return "Optional.of(";
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                return "RtiGracefulSystemMethodHelper";
            case 80:
                return "SUCCESS, result=[";
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                return "Success";
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return "UNKNOWN, cause=[";
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                return "UTF-8 not supported";
            case ActionId.MARKER_SWAPPED /* 84 */:
                return "added_time_ms";
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                return "android.intent.action.BOOT_COMPLETED";
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                return "android.intent.action.MY_PACKAGE_REPLACED";
            case ActionId.ERROR /* 87 */:
                return "android.intent.action.SCREEN_ON";
            case ActionId.METHOD_INVOKE /* 88 */:
                return "android.intent.action.SEND_MULTIPLE";
            case ActionId.FINALLY /* 89 */:
                return "android.intent.category.LAUNCHER";
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return "android.os.action.POWER_SAVE_MODE_CHANGED";
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                return "android.permission.GET_ACCOUNTS";
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION;
            case ActionId.ANIMATION_END /* 93 */:
                return "application/gzip";
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return "aten_vulkan";
            case ActionId.MAIN_COMPLETE /* 95 */:
                return "audience";
            case ActionId.INTERRUPTED /* 96 */:
                return "blocking_gc_count";
            case ActionId.NETWORK_FAILED /* 97 */:
                return "client_event";
            case ActionId.NETWORK_RESPONSE /* 98 */:
                return "com.facebook.bishop";
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                return "com.facebook.orca";
            case 100:
                return "com.facebook.orca.ACTION_MONTAGE_THREAD_LIST_UPDATED_FOR_UI";
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                return "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED";
            case ActionId.DATA_LOAD_START /* 102 */:
                return "com.instagram.android";
            case ActionId.LEGACY_MARKER /* 103 */:
                return "custom_data";
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return "dest_module_class";
            case ActionId.ABORTED /* 105 */:
                return "device_model";
            case ActionId.QUERY_READY /* 106 */:
                return "display_name";
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                return "features";
            case 108:
                return "generic";
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                return "geo_location";
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                return "input_method";
            case ActionId.NEW_START_FOUND /* 111 */:
                return "instantgames";
            case ActionId.MISSED_EVENT /* 112 */:
                return "log_out_reason";
            case ActionId.TIMEOUT /* 113 */:
                return "member";
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                return "message_received";
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return "mobile";
            case ActionId.VIDEO_PLAYING /* 116 */:
                return "null cannot be cast to non-null type android.app.ActivityManager";
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return "null cannot be cast to non-null type libraries.access.src.main.base.logging.logger.AccessLibraryLogger";
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                return "quicksilver";
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return ErrorReportingConstants.SOFT_ERROR_OCCURRENCE_COUNT;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return "session_expired";
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return "spreadtrum";
            case ActionId.CARD_DATA_LOADED /* 122 */:
                return "targetClass";
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                return "thread_count";
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                return "thread_name";
            case 125:
                return " UNION ALL ";
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                return " not supported";
            case 127:
                return " size: ";
            case 128:
                return "%s (%s) must not be negative";
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                return ", count=";
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                return ",height=";
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                return "/sys/devices/system/cpu/present";
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                return "374e60f8b9bb6b8cbb30f78030438895";
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                return "4_frame_drop_uncapped";
            case ActionId.APP_MAIN /* 134 */:
                return "<unknown>";
            case ActionId.MQTT_CONNECTING /* 135 */:
                return "Already resumed";
            case ActionId.MQTT_CONNECTED /* 136 */:
                return "Android SDK built for x86";
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                return "COLLAPSED";
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                return "CONNECT";
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                return "ChatHeadService";
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                return "Content-Encoding";
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                return "Context cannot be null";
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                return "Emulator";
            case ActionId.ACTIVITY_RESUME /* 143 */:
                return "EndToEnd-Test";
            case ActionId.ACTIVITY_START /* 144 */:
                return "Error: ";
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                return "Exception";
            case ActionId.END_START_ACTIVITY /* 146 */:
                return "FRAGMENT_CREATED";
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                return "Future.cancel() was called.";
            case ActionId.FORMAT_ERROR /* 148 */:
                return "INVALID_SENDER";
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                return "INVISIBLE";
            case 150:
                return "JOB_SCHEDULER";
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                return "LOCAL_CALL_ID";
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                return "Missing ";
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                return "NoNetwork";
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                return "Operation is not supported for read-only collection";
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                return "PUBLISH_";
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                return "REMOTE_EXCEPTION";
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                return "SCREEN_ON";
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                return "SELECT * FROM ";
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                return "SUCCEEDED";
            case ActionId.OFFLINE /* 160 */:
                return "SecureUriParser";
            case ActionId.ASNYC_FAILED /* 161 */:
                return "Unsupported type ";
            case ActionId.ASYNC_FAIL /* 162 */:
                return "account";
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                return "add_source";
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                return "algorithm";
            case ActionId.DISPLAYED /* 165 */:
                return "android";
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                return "android.os.BinderProxy";
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                return "android.webkit.WebViewUpdateService";
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                return "android_id";
            case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                return "annotation";
            case ActionId.VIDEO_DISPLAYED /* 170 */:
                return "app_name";
            case ActionId.VIDEO_REQUESTED_PLAYING /* 171 */:
                return ErrorReportingConstants.ASL_APP_IN_FOREGROUND_V2;
            case 172:
                return "attachment_index";
            case 173:
                return "avatar_id";
            case 174:
                return "build_id";
            case 175:
                return "call_trigger";
            case 176:
                return "callsite";
            case 177:
                return "categories";
            case 178:
                return "chunked";
            case 179:
                return "client_id";
            case 180:
                return OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME;
            case 181:
                return "cold_start";
            case 182:
                return "collapse_key";
            case 183:
                return "com.facebook";
            case 184:
                return "com.facebook.rti.mqtt.intent.ACTION_WAKEUP";
            case 185:
                return "components";
            case 186:
                return "connection_quality";
            case 187:
                return "contact_relationship_status";
            case 188:
                return "context_pop_out_selected";
            case 189:
                return "declaringClass";
            case 190:
                return "device_id";
            case 191:
                return "display";
            case 192:
                return "effect_id";
            case 193:
                return TraceFieldType.ErrorDomain;
            case 194:
                return ErrorReportingConstants.FACEBOOK_APP_ID_KEY;
            case 195:
                return "fbinternal";
            case 196:
                return "filename";
            case 197:
                return "getCurrentWebViewPackageName";
            case 198:
                return "google_sdk";
            case 199:
                return "healthstats";
            case 200:
                return "hisilicon";
            case 201:
                return "iab_session_id";
            case 202:
                return "identity";
            case 203:
                return "is_memorialized";
            case 204:
                return "is_viewer_managing_parent";
            case 205:
                return "link_type";
            case 206:
                return "local_call_id";
            case 207:
                return "mAppThread";
            case 208:
                return "maxSize <= 0";
            case 209:
                return "meetups";
            case 210:
                return "network_state";
            case 211:
                return "network_subtype";
            case 212:
                return "notifications";
            case 213:
                return "nt_context";
            case 214:
                return "onStartCommand: %s";
            case 215:
                return "opengl_version";
            case 216:
                return "org.chromium.arc.device_management";
            case 217:
                return "payload_size";
            case 218:
                return "process_id";
            case 219:
                return "raw_phone_number";
            case 220:
                return "remaining delay=[";
            case 221:
                return "report_source";
            case 222:
                return "rtc_group_call";
            case 223:
                return "sapienz";
            case 224:
                return "schema_version";
            case 225:
                return "selector";
            case 226:
                return "succeeded";
            case 227:
                return "trace_id";
            case 228:
                return "ui_components";
            case 229:
                return "viewer_ig_follow_status";
            case 230:
                return "webview_version";
            case 231:
                return "workplace.com";
            case 232:
                return "year_class";
            case 233:
                return " with executor ";
            case 234:
                return HttpRequestMultipart.CONTENT_TYPE;
            case 235:
                return "RuntimeException while executing runnable ";
            case 236:
                return "SERVER_FETCH";
            case 237:
                return "SHA256withRSA";
            case 238:
                return "accessibility";
            case 239:
                return "account_switcher_data";
            case 240:
                return "activity_name";
            case 241:
                return "android.permission.READ_PHONE_STATE";
            case 242:
                return "art.gc.blocking-gc-count";
            case 243:
                return "art.gc.blocking-gc-time";
            case 244:
                return "art.gc.gc-count";
            case 245:
                return "art.gc.gc-time";
            case 246:
                return "avatar_preview_uri";
            case 247:
                return "com.facebook.appmanager";
            case 248:
                return "com.facebook.lite";
            case 249:
                return "com.facebook.mlite";
            case 250:
                return "com.facebook.orca.ACTION_INBOX_BADGE_COUNT_UPDATED";
            case Process.SD_STDOUT /* 251 */:
                return "com.facebook.pages.app";
            case Process.SD_PIPE /* 252 */:
                return "com.facebook.stella";
            case Process.SD_BLACK_HOLE /* 253 */:
                return "com.facebook.stella_debug";
            case 254:
                return "com.facebook.wakizashi";
            case 255:
                return "com.facebook.workchat";
            case 256:
                return "com.google.android.gms";
            case 257:
                return "com.instagram.lite";
            case 258:
                return "com.oculus.twilight";
            case 259:
                return "connection_state";
            case 260:
                return "effect_session_id";
            case 261:
                return ErrorReportingConstants.APP_ERROR_REPORTING_DIR_NAME;
            case 262:
                return "is_avatar_public_and_usable_by_viewer";
            case 263:
                return "is_low_memory";
            case 264:
                return "is_messenger_user";
            case 265:
                return "linkToDeath failed";
            case 266:
                return "manufacturer";
            case 267:
                return "message_type";
            case 268:
                return "mobileconfig";
            case 269:
                return "network_info";
            case 270:
                return "notification";
            case 271:
                return "process_name";
            case 272:
                return "product_name";
            case 273:
                return "service_name";
            case 274:
                return "shared_call_id";
            case 275:
                return "translationY";
            default:
                return "unregistered";
        }
    }
}
