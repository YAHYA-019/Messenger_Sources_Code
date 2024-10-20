package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.dsp.core.ColorData;

/* renamed from: X.1pE, reason: invalid class name */
/* loaded from: 1pE.class */
public final class C1pE implements C1pF {
    public static final C1pE A00 = new Object();

    @Override // X.C1pF
    public 8Ji A8A(Integer num) {
        11T.A0F(num, 0);
        switch (num.intValue()) {
            case 1:
                return new 8Ji(0.8f, -0.4f, 0.3f);
            case 2:
                return new 8Ji(0.15f, 1.0f, 0.4f);
            case 3:
                return new 8Ji(0.45f, 0.1f, 0.2f);
            case 4:
            default:
                return new 8Ji(0.3f, 0.1f, 0.0f);
            case 5:
                return new 8Ji(0.0f, 0.0f, 1.0f);
            case 6:
                return new 8Ji(0.2f, 0.12f, 0.0f);
            case 7:
                return new 8Ji(0.48f, 0.2f, 0.3f);
        }
    }

    @Override // X.C1pF
    public 8JT A8B(Integer num) {
        int i;
        int i2;
        11T.A0F(num, 0);
        int i3 = 350;
        switch (num.intValue()) {
            case 0:
                return new 8JT(0, 0);
            case 1:
                return new 8JT(400, 350);
            case 2:
                i2 = 800;
                return new 8JT(i2, i2);
            case 3:
                i = 300;
                break;
            case 4:
                i3 = 240;
                i = 200;
                break;
            case 5:
                i3 = 180;
                i = 140;
                break;
            default:
                i2 = 100;
                return new 8JT(i2, i2);
        }
        return new 8JT(i3, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1pF
    public ColorData AGe(C1p9 c1p9) {
        int i;
        int i2;
        switch (c1p9.ordinal()) {
            case 0:
            case 17:
            case 24:
            case 25:
            case 39:
            case ActionId.QUEUEING_FAIL /* 56 */:
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                i = -16089857;
                i2 = -12412161;
                return new ColorData(i, i2);
            case 1:
                i = -657931;
                i2 = -14540254;
                return new ColorData(i, i2);
            case 2:
                i = -1;
                i2 = -13619152;
                return new ColorData(i, i2);
            case 3:
            case 20:
            case 23:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                i = 2139524761;
                i2 = 2140905640;
                return new ColorData(i, i2);
            case 4:
                i = -1;
                i2 = -14540254;
                return new ColorData(i, i2);
            case 5:
            case 10:
            case 35:
            case 41:
                i = 167772160;
                i2 = 822083583;
                return new ColorData(i, i2);
            case 6:
            case 12:
            case ActionId.QUEUED /* 48 */:
            case ActionId.INTERRUPTED /* 96 */:
                i = 855638016;
                i2 = 822083583;
                return new ColorData(i, i2);
            case 7:
                i = 503316480;
                i2 = 822083583;
                return new ColorData(i, i2);
            case 8:
                i = -921103;
                i2 = -13619152;
                return new ColorData(i, i2);
            case 9:
            case 14:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                i = -1;
                i2 = -16777216;
                return new ColorData(i, i2);
            case 11:
                i = -657931;
                i2 = -14737633;
                return new ColorData(i, i2);
            case 13:
                i = 251658240;
                i2 = 603979775;
                return new ColorData(i, i2);
            case 15:
                i = -1;
                i2 = 352321535;
                return new ColorData(i, i2);
            case 16:
                i = -657931;
                i2 = -16777216;
                return new ColorData(i, i2);
            case 18:
            case 36:
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
            case ActionId.QUERY_READY /* 106 */:
                i = -13513658;
                i2 = -12200360;
                return new ColorData(i, i2);
            case 19:
            case ActionId.FRAGMENT_CREATED /* 78 */:
                i = -16777216;
                i2 = 822083583;
                return new ColorData(i, i2);
            case 21:
                i = 506580038;
                i2 = 759551576;
                return new ColorData(i, i2);
            case 22:
            case 34:
            case ActionId.ACTIVITY_STARTED /* 76 */:
            case ActionId.FINALLY /* 89 */:
            case ActionId.ABORTED /* 105 */:
                i = -50637;
                i2 = -46782;
                return new ColorData(i, i2);
            case 26:
                i = -956696071;
                i2 = -970644187;
                return new ColorData(i, i2);
            case 27:
                i = -956301313;
                i2 = -973078528;
                return new ColorData(i, i2);
            case 28:
                i = -436207617;
                i2 = -452984832;
                return new ColorData(i, i2);
            case 29:
                i = -1711276033;
                i2 = -1728053248;
                return new ColorData(i, i2);
            case 30:
                i = 1627389951;
                i2 = 1610612736;
                return new ColorData(i, i2);
            case 31:
                i = -16773575;
                i2 = -13088923;
                return new ColorData(i, i2);
            case 32:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                i = 1442840576;
                i2 = 1442840576;
                return new ColorData(i, i2);
            case 33:
                i = -1379330;
                i2 = -15917254;
                return new ColorData(i, i2);
            case 37:
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                i = -1291845633;
                i2 = -1291845633;
                return new ColorData(i, i2);
            case 38:
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
            case ActionId.ERROR /* 87 */:
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                i = -1;
                i2 = -1;
                return new ColorData(i, i2);
            case 40:
                i = 822083583;
                i2 = 822083583;
                return new ColorData(i, i2);
            case 42:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
            case ActionId.NETWORK_FAILED /* 97 */:
                i = -1081700711;
                i2 = -1080319832;
                return new ColorData(i, i2);
            case 43:
                i = -1291845633;
                i2 = 822083583;
                return new ColorData(i, i2);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                i = 167772160;
                i2 = (-1) >>> 4;
                return new ColorData(i, i2);
            case 46:
                i = 251658240;
                i2 = 352321535;
                return new ColorData(i, i2);
            case ActionId.ON_START_END /* 47 */:
                i = 503316480;
                i2 = 603979775;
                return new ColorData(i, i2);
            case ActionId.IN_PROGRESS /* 49 */:
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                i = 1442840576;
                i2 = 1241513983;
                return new ColorData(i, i2);
            case 50:
            case 108:
            case ActionId.NEW_START_FOUND /* 111 */:
                i = 2130706432;
                i2 = 1845493759;
                return new ColorData(i, i2);
            case ActionId.UNKNOWN /* 51 */:
            case ActionId.ANIMATION_END /* 93 */:
            case ActionId.MAIN_COMPLETE /* 95 */:
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                i = -16777216;
                i2 = -1;
                return new ColorData(i, i2);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.LEGACY_MARKER /* 103 */:
                i = -16777216;
                i2 = -16777216;
                return new ColorData(i, i2);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                i = 1610612736;
                i2 = 1610612736;
                return new ColorData(i, i2);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                i = -357922;
                i2 = -1667889;
                return new ColorData(i, i2);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                i = -36777;
                i2 = -1346722;
                return new ColorData(i, i2);
            case ActionId.COUNTER /* 61 */:
                i = -16721024;
                i2 = -15939719;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                i = -657931;
                i2 = -15856114;
                return new ColorData(i, i2);
            case 63:
                i = -921103;
                i2 = -15527149;
                return new ColorData(i, i2);
            case 64:
                i = -2039584;
                i2 = -14540254;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                i = -3355444;
                i2 = -13619152;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                i = -5723992;
                i2 = -11908534;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                i = -8421505;
                i2 = -9671572;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                i = -19712;
                i2 = -1332978;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                i = -16725761;
                i2 = -16725761;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                i = -45929;
                i2 = -1354605;
                return new ColorData(i, i2);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                i = -15127041;
                i2 = -14338325;
                return new ColorData(i, i2);
            case ActionId.INTENT_MAPPED /* 73 */:
                i = -6196225;
                i2 = -6391573;
                return new ColorData(i, i2);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                i = -21888;
                i2 = -1333628;
                return new ColorData(i, i2);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                i = -6278145;
                i2 = -5683201;
                return new ColorData(i, i2);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                i = -52962;
                i2 = -1361366;
                return new ColorData(i, i2);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                i = -15090945;
                i2 = -14307349;
                return new ColorData(i, i2);
            case 80:
                i = -10055681;
                i2 = -9662741;
                return new ColorData(i, i2);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                i = 0;
                i2 = 0;
                return new ColorData(i, i2);
            case ActionId.MARKER_SWAPPED /* 84 */:
                i = 167772160;
                i2 = 503316480;
                return new ColorData(i, i2);
            case ActionId.METHOD_INVOKE /* 88 */:
                i = 1442840576;
                i2 = 1929379839;
                return new ColorData(i, i2);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                i = -4933415;
                i2 = -10460557;
                return new ColorData(i, i2);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                i = 642468943;
                i2 = 872415231;
                return new ColorData(i, i2);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                i = -1;
                i2 = -12697534;
                return new ColorData(i, i2);
            case 100:
                i = -1313281;
                i2 = 857572860;
                return new ColorData(i, i2);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                i = -1;
                i2 = -11842481;
                return new ColorData(i, i2);
            case ActionId.DATA_LOAD_START /* 102 */:
                i = -14979033;
                i2 = -13513658;
                return new ColorData(i, i2);
            case ActionId.MISSED_EVENT /* 112 */:
                i = -1308622848;
                i2 = -1291845633;
                return new ColorData(i, i2);
            case ActionId.TIMEOUT /* 113 */:
                i = 1442840576;
                i2 = 1845493759;
                return new ColorData(i, i2);
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                i = -11190017;
                i2 = -11122709;
                return new ColorData(i, i2);
            case ActionId.VIDEO_PLAYING /* 116 */:
                i = -16777216;
                i2 = -13750738;
                return new ColorData(i, i2);
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                i = -5723992;
                i2 = -11053225;
                return new ColorData(i, i2);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                i = -657931;
                i2 = -9671572;
                return new ColorData(i, i2);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                i = -5723992;
                i2 = -9671572;
                return new ColorData(i, i2);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                i = -973078528;
                i2 = -956301313;
                return new ColorData(i, i2);
            default:
                throw 1BK.A1F();
        }
    }

    @Override // X.C1pF
    public int AIM(Integer num) {
        11T.A0F(num, 0);
        switch (num.intValue()) {
            case 1:
                return 16;
            case 2:
                return 12;
            case 3:
                return 8;
            case 4:
                return 24;
            default:
                return 4;
        }
    }

    @Override // X.C1pF
    public float D17(Integer num) {
        11T.A0F(num, 0);
        switch (num.intValue()) {
            case 0:
                return 16.0f;
            case 1:
                return 12.0f;
            case 2:
                return 8.0f;
            case 3:
                return 20.0f;
            case 4:
                return 4.0f;
            default:
                return 28.0f;
        }
    }

    @Override // X.C1pF
    public 2KP D5R(Integer num) {
        float f;
        Integer num2;
        2KN r310;
        11T.A0F(num, 0);
        int intValue = num.intValue();
        float f2 = 18.0f;
        2KL r0 = 2KL.A03;
        switch (intValue) {
            case 0:
                num2 = 0S2.A00;
                r310 = new 2KN(18.0f);
                f = 14.0f;
                break;
            case 1:
                f = 14.0f;
                num2 = 0S2.A01;
                r310 = new 2KN(f2);
                break;
            case 2:
                num2 = 0S2.A00;
                r310 = new 2KN(16.0f);
                f = 12.0f;
                break;
            case 3:
            case 4:
                num2 = 0S2.A01;
                r310 = new 2KN(16.0f);
                f = 12.0f;
                break;
            case 5:
                f = 28.0f;
                num2 = 0S2.A0N;
                f2 = 33.0f;
                r310 = new 2KN(f2);
                break;
            case 6:
                f = 24.0f;
                num2 = 0S2.A0N;
                f2 = 28.0f;
                r310 = new 2KN(f2);
                break;
            case 7:
                f = 20.0f;
                num2 = 0S2.A01;
                f2 = 24.0f;
                r310 = new 2KN(f2);
                break;
            case 8:
                f = 16.0f;
                num2 = 0S2.A00;
                r310 = new 2KN(20.0f);
                break;
            case 9:
                f = 12.0f;
                num2 = 0S2.A00;
                r310 = new 2KN(f2);
                break;
            case 10:
                num2 = 0S2.A00;
                r310 = new 2KN(16.0f);
                f = 10.0f;
                break;
            case 11:
            case 13:
            default:
                f = 16.0f;
                num2 = 0S2.A01;
                r310 = new 2KN(20.0f);
                break;
            case 12:
                f = 16.0f;
                num2 = 0S2.A0N;
                r310 = new 2KN(20.0f);
                break;
            case 14:
                f = 14.0f;
                num2 = 0S2.A0N;
                r310 = new 2KN(f2);
                break;
        }
        return new 2KP(r310, num2, r0, f, 0.0f);
    }
}
