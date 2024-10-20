package com.facebook.graphql.enums;

import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLISOCountryCode.class */
public final class GraphQLISOCountryCode {
    public static final /* synthetic */ GraphQLISOCountryCode[] A00;
    public static final GraphQLISOCountryCode A01;
    public final String serverValue;

    static {
        GraphQLISOCountryCode[] graphQLISOCountryCodeArr = new GraphQLISOCountryCode[Process.SD_PIPE];
        GraphQLISOCountryCode A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        System.arraycopy(new GraphQLISOCountryCode[]{A002, A00("AD", 1), A00("AE", 2), A00("AF", 3), A00("AG", 4), A00("AI", 5), A00("AL", 6), A00("AM", 7), A00("AN", 8), A00("AO", 9), A00("AQ", 10), A00("AR", 11), A00("AS", 12), A00("AT", 13), A00("AU", 14), A00("AW", 15), A00("AX", 16), A00("AZ", 17), A00("BA", 18), A00("BB", 19), A00("BD", 20), A00("BE", 21), A00("BF", 22), A00("BG", 23), A00("BH", 24), A00("BI", 25), A00("BJ", 26)}, 0, graphQLISOCountryCodeArr, 0, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("BL", 27), A00("BM", 28), A00("BN", 29), A00("BO", 30), A00("BQ", 31), A00("BR", 32), A00("BS", 33), A00("BT", 34), A00("BV", 35), A00("BW", 36), A00("BY", 37), A00("BZ", 38), A00("CA", 39), A00("CC", 40), A00("CD", 41), A00("CF", 42), A00("CG", 43), A00("CH", 44), A00("CI", 45), A00("CK", 46), A00("CL", 47), A00("CM", 48), A00("CN", 49), A00("CO", 50), A00("CR", 51), A00("CU", 52), A00("CV", 53)}, 0, graphQLISOCountryCodeArr, 27, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("CW", 54), A00("CX", 55), A00("CY", 56), A00("CZ", 57), A00("DE", 58), A00("DJ", 59), A00("DK", 60), A00("DM", 61), A00("DO", 62), A00("DZ", 63), A00("EC", 64), A00("EE", 65), A00("EG", 66), A00("EH", 67), A00("ER", 68), A00("ES", 69), A00("ET", 70), A00("FI", 71), A00("FJ", 72), A00("FK", 73), A00("FM", 74), A00("FO", 75), A00("FR", 76), A00("GA", 77), A00("GB", 78), A00("GD", 79), A00("GE", 80)}, 0, graphQLISOCountryCodeArr, 54, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("GF", 81), A00("GG", 82), A00("GH", 83), A00("GI", 84), A00("GL", 85), A00("GM", 86), A00("GN", 87), A00("GP", 88), A00("GQ", 89), A00("GR", 90), A00("GS", 91), A00("GT", 92), A00("GU", 93), A00("GW", 94), A00("GY", 95), A00("HK", 96), A00("HM", 97), A00("HN", 98), A00("HR", 99), A00("HT", 100), A00("HU", ActionId.ON_VIEW_CREATED_END), A00("ID", ActionId.DATA_LOAD_START), A00("IE", ActionId.LEGACY_MARKER), A00("IL", ActionId.ACTION_BAR_COMPLETE), A00("IM", ActionId.ABORTED), A00("IN", ActionId.QUERY_READY), A00("IO", ActionId.RTMP_PACKET_RECEIVED)}, 0, graphQLISOCountryCodeArr, 81, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("IQ", 108), A00("IR", ActionId.RTMP_CONNECTION_REQUESTED), A00("IS", ActionId.RTMP_CONNECTION_RELEASE), A00("IT", ActionId.NEW_START_FOUND), A00("JE", ActionId.MISSED_EVENT), A00("JM", ActionId.TIMEOUT), A00("JO", ActionId.CONTROLLER_INITIATED), A00("JP", ActionId.RTMP_STREAM_PREPARED), A00("KE", ActionId.VIDEO_PLAYING), A00("KG", ActionId.RTMP_CONNECTION_CONNECTED), A00("KH", ActionId.RTMP_CONNECTION_FAILED), A00("KI", ActionId.RTMP_CONNECTION_INTERCEPTED), A00("KM", ActionId.VIDEO_SET_RENDERER_CONTEXT), A00("KN", ActionId.HEADER_DATA_LOADED), A00("KP", ActionId.CARD_DATA_LOADED), A00("KR", ActionId.VIEW_WILL_APPEAR_BEGIN), A00("KW", ActionId.VIEW_DID_LOAD_BEGIN), A00("KY", 125), A00("KZ", ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES), A00("LA", 127), A00("LB", 128), A00("LC", ActionId.MESSENGER_QUEUE_CREATION), A00("LI", ActionId.APP_DID_FINISH_LAUNCHING), A00("LK", ActionId.APP_DID_BECOME_ACTIVE), A00("LR", ActionId.APP_WILL_ENTER_FOREGROUND), A00("LS", ActionId.APP_DID_ENTER_BACKGROUND), A00("LT", ActionId.APP_MAIN)}, 0, graphQLISOCountryCodeArr, 108, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("LU", ActionId.MQTT_CONNECTING), A00("LV", ActionId.MQTT_CONNECTED), A00("LY", ActionId.MQTT_DISCONNECTED), A00("MA", ActionId.MESSENGER_DELTA_REQUEST), A00("MC", ActionId.APP_FIRST_VIEW_CONTROLLER), A00("MD", ActionId.MESSENGER_THREAD_LIST_LOADED), A00("ME", ActionId.MESSENGER_THREAD_LIST_DISPLAYED), A00("MF", ActionId.PREV_ACTIVITY_PAUSE), A00("MG", ActionId.ACTIVITY_RESUME), A00("MH", ActionId.ACTIVITY_START), A00("MK", ActionId.BEGIN_START_ACTIVITY), A00("ML", ActionId.END_START_ACTIVITY), A00("MM", ActionId.FILE_SYSTEM_FAIL), A00("MN", ActionId.FORMAT_ERROR), A00("MO", ActionId.PRIVACY_VIOLATION), A00("MP", 150), A00("MQ", ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE), A00("MR", ActionId.APPLY_OPTIMISTICS), A00("MS", ActionId.APPLY_FINISHED_LIST), A00("MT", ActionId.APPLY_FINISHED_LIST_AGAIN), A00("MU", ActionId.FUTURE_LISTENERS_COMPLETE), A00("MV", ActionId.SERVICE_ON_START_COMMAND), A00("MW", ActionId.WAIT_FOR_BLOCKERS), A00("MX", ActionId.NOTIFY_SUBSCRIBERS), A00("MY", ActionId.FAIL_FILE_TOO_LARGE), A00("MZ", ActionId.OFFLINE), A00("NA", ActionId.ASNYC_FAILED)}, 0, graphQLISOCountryCodeArr, ActionId.MQTT_CONNECTING, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("NC", ActionId.ASYNC_FAIL), A00("NE", ActionId.ON_ATTACH_FRAGMENT), A00("NF", ActionId.VIEW_DID_APPEAR_BEGIN), A00("NG", ActionId.DISPLAYED), A00("NI", ActionId.DISPLAYED_ON_SCREEN), A00("NL", ActionId.ASYNC_ACTION_SUCCESS), A00("NO", ActionId.ASYNC_ACTION_FAIL), A00("NP", ActionId.CONNECTIVITY_CHANGED), A00("NR", ActionId.VIDEO_DISPLAYED), A00("NU", ActionId.VIDEO_REQUESTED_PLAYING), A00("NZ", 172), A00("OM", 173), A00("PA", 174), A00("PE", 175), A00("PF", 176), A00("PG", 177), A00("PH", 178), A00("PK", 179), A00("PL", 180), A00("PM", 181), A00("PN", 182), A00("PR", 183), A00("PS", 184), A00("PT", 185), A00("PW", 186), A00("PY", 187), A00("QA", 188)}, 0, graphQLISOCountryCodeArr, ActionId.ASYNC_FAIL, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("RE", 189), A00("RO", 190), A00("RS", 191), A00("RU", 192), A00("RW", 193), A00("SA", 194), A00("SB", 195), A00("SC", 196), A00("SD", 197), A00("SE", 198), A00("SG", 199), A00("SH", 200), A00("SI", 201), A00("SJ", 202), A00("SK", 203), A00("SL", 204), A00("SM", 205), A00("SN", 206), A00("SO", 207), A00("SR", 208), A00("SS", 209), A00("ST", 210), A00("SV", 211), A00("SX", 212), A00("SY", 213), A00("SZ", 214), A00("TC", 215)}, 0, graphQLISOCountryCodeArr, 189, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("TD", 216), A00("TF", 217), A00("TG", 218), A00("TH", 219), A00("TJ", 220), A00("TK", 221), A00("TL", 222), A00("TM", 223), A00("TN", 224), A00("TO", 225), A00("TR", 226), A00("TT", 227), A00("TV", 228), A00("TW", 229), A00("TZ", 230), A00("UA", 231), A00("UG", 232), A00("UM", 233), A00("US", 234), A00("UY", 235), A00("UZ", 236), A00("VA", 237), A00("VC", 238), A00("VE", 239), A00("VG", 240), A00("VI", 241), A00("VN", 242)}, 0, graphQLISOCountryCodeArr, 216, 27);
        System.arraycopy(new GraphQLISOCountryCode[]{A00("VU", 243), A00("WF", 244), A00("WS", 245), A00("XK", 246), A00("YE", 247), A00("YT", 248), A00("ZA", 249), A00("ZM", 250), A00("ZW", Process.SD_STDOUT)}, 0, graphQLISOCountryCodeArr, 243, 9);
        A00 = graphQLISOCountryCodeArr;
    }

    public GraphQLISOCountryCode(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLISOCountryCode A00(String str, int i) {
        return new GraphQLISOCountryCode(str, i, str);
    }

    public static GraphQLISOCountryCode valueOf(String str) {
        return (GraphQLISOCountryCode) Enum.valueOf(GraphQLISOCountryCode.class, str);
    }

    public static GraphQLISOCountryCode[] values() {
        return (GraphQLISOCountryCode[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
