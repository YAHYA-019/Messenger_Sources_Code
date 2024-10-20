package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5tt, reason: invalid class name */
/* loaded from: 5tt.class */
public abstract class C5tt {
    public static final Capabilities A00;
    public static final Capabilities A01;
    public static final Capabilities A02;
    public static final Capabilities A03;
    public static final Capabilities A04;
    public static final Capabilities A05;
    public static final Capabilities A06;
    public static final Capabilities A07;
    public static final Capabilities A08;
    public static final Capabilities A09;
    public static final Capabilities A0A;
    public static final Capabilities A0B;
    public static final Capabilities A0C;

    static {
        1M7 r0 = Capabilities.A01;
        A02 = r0.A02(new int[]{27, 199, 180, 246, 182, 181, 183, 187, 239, 240, 242, 243, 244, 64, ActionId.ASYNC_FAIL, ActionId.NEW_START_FOUND, 14, 10, 16, ActionId.RTMP_CONNECTION_INTERCEPTED, 29, ActionId.APP_DID_BECOME_ACTIVE, 12, 1, 89, 72, ActionId.MQTT_CONNECTED, 6, ActionId.RTMP_STREAM_PREPARED, ActionId.MISSED_EVENT, ActionId.HEADER_DATA_LOADED, ActionId.VIDEO_SET_RENDERER_CONTEXT, ActionId.ASYNC_ACTION_FAIL, ActionId.APP_DID_ENTER_BACKGROUND, 35, 54, 47, 49, 38, 37, 7, ActionId.CONTROLLER_INITIATED, 17, 33, 39, ActionId.FUTURE_LISTENERS_COMPLETE, ActionId.PRIVACY_VIOLATION, 4, 1401, 5, 247, ActionId.VIEW_DID_APPEAR_BEGIN, ActionId.DISPLAYED, 92, 32, 205, ActionId.MESSENGER_THREAD_LIST_DISPLAYED, 179, ActionId.VIEW_WILL_APPEAR_BEGIN, 22, 28, 31, 245, 80, 71, 2, 26, 66, 43, 76, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 21, ActionId.CARD_DATA_LOADED, 13, 172, ActionId.SERVICE_ON_START_COMMAND, 19, 9, 30, 53, 0, ActionId.APPLY_FINISHED_LIST_AGAIN, 73, ActionId.QUERY_READY, 36, 87, ActionId.NOTIFY_SUBSCRIBERS, ActionId.FAIL_FILE_TOO_LARGE, 59, 18, ActionId.APP_FIRST_VIEW_CONTROLLER, ActionId.MESSENGER_DELTA_REQUEST, 85, 55, 200, 24, 25, 99, 34, 11, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 58, 84, 96, 15, 40, 3, ActionId.ASYNC_ACTION_SUCCESS, 195, 206, 63, 81, 23, 74, 41, 8, 108, 50, 60, 61, 196, ActionId.ACTIVITY_START, 83, 93, 88, 178, 188, 193, 192, 194, 9999, 213});
        A0A = r0.A02(new int[]{27, 14, 10, 16, 1, 89, 72, 6, 49, 7, 4, 28, 31, 2, 26, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 19, 73, 25, 15, 3, 23, 74, 60});
        A04 = r0.A02(new int[]{27, 64, 14, 10, 16, 1, 89, 6, 35, 54, 49, 37, 7, 17, 39, 4, 32, 22, 28, 2, 26, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 21, 19, 36, 87, ActionId.NOTIFY_SUBSCRIBERS, ActionId.FAIL_FILE_TOO_LARGE, 59, 18, 55, 24, 25, 85, 20, 34, 84, 15, 40, 3, 23, 74, 41, 50, 60, 61, 43});
        A07 = r0.A02(new int[]{64, 14, 10, 1, 89, ActionId.MQTT_CONNECTED, 47, 49, 17, 4, 1401, 28, 31, 2, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 21, ActionId.SERVICE_ON_START_COMMAND, 19, 53, 18, ActionId.APP_FIRST_VIEW_CONTROLLER, 200, 24, 25, 34, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 3, 23, 74, 8, 188});
        A08 = r0.A02(new int[]{27, 64, 14, 10, 16, 1, 89, 6, 35, 49, 7, 17, 22, 28, 2, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 26, 42, 13, 19, 24, 25, 34, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 15, 3, 23, 74});
        A0B = r0.A02(new int[]{ActionId.ASYNC_FAIL, 14, 10, 1, 89, 49, 38, 17, 22, 2, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 19, 18, 4, 73, 25, 11, 20, 3, 23, 74, 8});
        A00 = r0.A02(new int[]{27, 64, ActionId.ASYNC_FAIL, 14, 10, 1, 89, 6, 35, 49, 38, 7, 17, ActionId.FUTURE_LISTENERS_COMPLETE, 4, 22, 28, 80, 2, ActionId.DATA_LOAD_START, 43, 76, ActionId.LEGACY_MARKER, 42, ActionId.CARD_DATA_LOADED, 19, 26, 9, 16, ActionId.RTMP_CONNECTION_INTERCEPTED, 18, 73, ActionId.QUERY_READY, 85, 25, 24, 11, 20, 96, 3, 34, 23, 74, 8, 60, 61, 9999});
        A03 = r0.A02(new int[]{64, ActionId.ASYNC_FAIL, 14, 10, 1, 89, 49, 38, 17, 22, 2, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 15, 19, 34, 9, 32, 18, 7, 6, 85, 25, 24, 35, 11, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 5, 3, 4, 23, 74, 8});
        A06 = r0.A02(new int[]{64, 14, 10, 1, 89, 49, 17, 4, 32, 2, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 19, 53, 34, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 15, 3, 23, 74});
        A0C = r0.A02(new int[]{27, 64, 14, 10, 1, 89, 6, 35, 49, 7, 17, 4, 5, 32, ActionId.MESSENGER_THREAD_LIST_DISPLAYED, 28, 31, 2, 26, 43, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 21, 19, 36, 87, ActionId.NOTIFY_SUBSCRIBERS, ActionId.FAIL_FILE_TOO_LARGE, 18, 24, 25, 34, 20, 15, 3, 23, 74, 8, 60, 61});
        A09 = r0.A02(new int[]{27, 64, ActionId.ASYNC_FAIL, ActionId.NEW_START_FOUND, 14, 10, 16, 12, 1, 89, 6, ActionId.RTMP_STREAM_PREPARED, ActionId.MISSED_EVENT, ActionId.HEADER_DATA_LOADED, ActionId.VIDEO_SET_RENDERER_CONTEXT, ActionId.APP_DID_ENTER_BACKGROUND, 54, 47, 49, 38, 37, 7, 39, 17, 4, 32, 22, 28, 31, 80, 2, 26, 43, ActionId.LEGACY_MARKER, ActionId.DATA_LOAD_START, 42, 21, ActionId.SERVICE_ON_START_COMMAND, 19, 9, 0, ActionId.APPLY_FINISHED_LIST_AGAIN, 36, 87, ActionId.NOTIFY_SUBSCRIBERS, ActionId.FAIL_FILE_TOO_LARGE, 59, 18, ActionId.APP_FIRST_VIEW_CONTROLLER, 55, 24, 25, ActionId.MESSENGER_THREAD_LIST_LOADED, 20, 34, 15, 40, 3, 23, 74, 41, 108, 50, 8, 81, 60, 61, 93, 88});
        A01 = r0.A02(new int[]{64, 89, 54, 37, 42, 19, 18, ActionId.APP_FIRST_VIEW_CONTROLLER, 34, 23, ActionId.QUERY_READY, 84, 187, 246});
        A05 = r0.A02(new int[]{14, 10, 1, 37, 17, 22, 2, 19, 23, 74});
    }
}
