package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.media.upload.photo.MultiStepResumeJob;
import com.facebook.places.checkin.protocol.PlacePickerFetcher;
import com.facebook.tagging.graphql.data.HashtagTaggingTypeaheadDataSource;

/* renamed from: X.4vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vo.class */
public abstract class AbstractC11154vo {
    public static Object A00(int i, 1BO r302, Object obj) {
        switch ((i >> 7) & 15) {
            case 0:
                return A01(i, r302, obj);
            case 1:
                return A02(i, r302, obj);
            case 2:
                return A03(i, r302, obj);
            case 3:
                return A04(i, r302, obj);
            case 4:
                return A05(i, r302, obj);
            case 5:
                return A06(i, r302, obj);
            case 6:
                return A07(i, r302, obj);
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
        }
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        Oct A01;
        switch ((i >> 0) & 127) {
            case 0:
                A01 = NXh.A01();
                break;
            case 1:
            case 2:
            case 3:
            case 21:
            case 24:
            case 25:
            case 28:
            case 32:
            case 37:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case 46:
            case ActionId.ON_START_END /* 47 */:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case ActionId.PHOTO_CAPTURED /* 59 */:
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
            case 63:
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
            case ActionId.ACTIVITY_PAUSED /* 75 */:
            case ActionId.FRAGMENT_CREATED /* 78 */:
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
            case ActionId.MARKER_SWAPPED /* 84 */:
            case ActionId.NETWORK_RESPONSE /* 98 */:
            case 100:
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
            case 4:
                A01 = NXL.A00();
                break;
            case 5:
                A01 = NXL.A01(r302);
                break;
            case 6:
                return new 1C5(r302, 1C4.A0z);
            case 7:
                A01 = NXx.A00();
                break;
            case 8:
                A01 = NYi.A02();
                break;
            case 9:
                A01 = NYY.A00();
                break;
            case 10:
                A01 = NYY.A01();
                break;
            case 11:
                A01 = NXQ.A01();
                break;
            case 12:
                A01 = NWl.A00();
                break;
            case 13:
                A01 = NYh.A00();
                break;
            case 14:
                A01 = NYh.A01();
                break;
            case 15:
                A01 = NYh.A04();
                break;
            case 16:
                throw AnonymousClass001.A0N("CameraRollSceneXProcessor not implemented.");
            case 17:
                A01 = NTY.A00();
                break;
            case 18:
                A01 = NTZ.A00();
                break;
            case 19:
                A01 = NTd.A00();
                break;
            case 20:
                A01 = NWm.A00();
                break;
            case 22:
                A01 = NTf.A00();
                break;
            case 23:
                A01 = NTj.A00();
                break;
            case 26:
                A01 = NTn.A00();
                break;
            case 27:
                A01 = NTo.A00();
                break;
            case 29:
                A01 = NTv.A00();
                break;
            case 30:
                A01 = NTw.A00();
                break;
            case 31:
                A01 = NTx.A00();
                break;
            case 33:
                A01 = NUW.A00();
                break;
            case 34:
                A01 = NUe.A00();
                break;
            case 35:
                A01 = NUf.A00();
                break;
            case 36:
                A01 = NUg.A00();
                break;
            case 38:
                A01 = NUi.A00();
                break;
            case 39:
                A01 = NUj.A00();
                break;
            case 40:
                A01 = NXa.A00();
                break;
            case 41:
                A01 = NXa.A01();
                break;
            case 42:
                A01 = NUk.A00();
                break;
            case 43:
                A01 = NUl.A00();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A01 = NUm.A00();
                break;
            case ActionId.QUEUED /* 48 */:
                A01 = NUn.A00();
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A01 = NUo.A00();
                break;
            case 50:
                A01 = NUp.A00();
                break;
            case ActionId.UNKNOWN /* 51 */:
                A01 = NUq.A00();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A01 = NX4.A00();
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A01 = NVT.A00();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A01 = NWN.A00();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A01 = NWZ.A00();
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A01 = NX3.A00();
                break;
            case ActionId.COUNTER /* 61 */:
                A01 = NX5.A00();
                break;
            case 64:
                A01 = NX6.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A01 = NX7.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A01 = NX8.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A01 = NY0.A00();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A01 = NY0.A01();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A01 = NV5.A00();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                Object A0B = 1Bn.A0B(116443);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(A0B);
                A01 = AnonymousClass001.A0d("_exact", A0k);
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A01 = NWs.A00();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A01 = NWv.A00();
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A01 = NWu.A00();
                break;
            case 80:
                A01 = NWy.A00();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A01 = NWJ.A00();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A01 = NTL.A00();
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A01 = NYQ.A02();
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A01 = NYQ.A03();
                break;
            case ActionId.ERROR /* 87 */:
                A01 = NYQ.A00();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A01 = NYQ.A01();
                break;
            case ActionId.FINALLY /* 89 */:
                A01 = NY5.A01();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A01 = NTN.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A01 = NY5.A00();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A01 = NXS.A01();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A01 = NWa.A00();
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A01 = NTp.A00();
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A01 = 1BK.A0d();
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A01 = NYP.A01();
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A01 = NY1.A00();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A01 = NY1.A01(r302);
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A01 = NYh.A03();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A01 = NY8.A00();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                A01 = NY8.A02();
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A01 = NXS.A00();
                break;
            case ActionId.ABORTED /* 105 */:
                A01 = NTz.A00();
                break;
            case ActionId.QUERY_READY /* 106 */:
                A01 = NXT.A00();
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A01 = NWD.A00();
                break;
            case 108:
                A01 = NYA.A01();
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A01 = NYA.A02();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A01 = NVU.A00();
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                A01 = NYA.A00();
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A01 = NXi.A00();
                break;
            case ActionId.TIMEOUT /* 113 */:
                A01 = NWc.A00();
                break;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A01 = NWj.A00();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return new NSN(r302);
            case ActionId.VIDEO_PLAYING /* 116 */:
                A01 = NU4.A00();
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A01 = NU5.A00(r302);
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A01 = NYI.A01(obj);
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A01 = NVJ.A00();
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A01 = NXi.A01();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A01 = NYI.A00();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A01 = NXm.A00(obj);
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A01 = NXm.A01();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A01 = NV2.A00();
                break;
            case 125:
                A01 = NXC.A00();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A01 = NXF.A00();
                break;
            case 127:
                A01 = NY8.A01();
                break;
        }
        return A01;
    }

    public static Object A02(int i, 1BO r302, Object obj) {
        ODF A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = NWt.A00(obj);
                break;
            case 1:
                A00 = NTM.A00();
                break;
            case 2:
                A00 = NTR.A00();
                break;
            case 3:
                A00 = NTO.A00(obj);
                break;
            case 4:
                A00 = NTQ.A00(r302);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 20:
            case 31:
            case 43:
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
            case ActionId.METHOD_INVOKE /* 88 */:
            case ActionId.UDP_REQUEST_SEND /* 94 */:
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
            case 10:
                A00 = NXX.A00();
                break;
            case 11:
                A00 = NXh.A00();
                break;
            case 13:
                A00 = NYM.A00(obj);
                break;
            case 14:
                A00 = NYM.A02();
                break;
            case 15:
                A00 = NTJ.A00();
                break;
            case 16:
                A00 = NWd.A00();
                break;
            case 17:
                A00 = NYd.A01();
                break;
            case 18:
                A00 = NYd.A02();
                break;
            case 19:
                A00 = OK9.A01();
                break;
            case 21:
                A00 = NDx.A00();
                break;
            case 22:
                A00 = OFx.A00(r302);
                break;
            case 23:
                A00 = O6O.A00(r302);
                break;
            case 24:
                A00 = OFO.A00();
                break;
            case 25:
                A00 = OTP.A00(r302, obj);
                break;
            case 26:
                A00 = OGB.A00(r302);
                break;
            case 27:
                A00 = OHD.A00(r302);
                break;
            case 28:
                A00 = OFP.A00();
                break;
            case 29:
                A00 = OFS.A00();
                break;
            case 30:
                A00 = NoE.A01();
                break;
            case 32:
                A00 = OGs.A00();
                break;
            case 33:
                A00 = OFh.A00();
                break;
            case 34:
                A00 = OIz.A00();
                break;
            case 35:
                A00 = NY2.A01();
                break;
            case 36:
                A00 = NTC.A00();
                break;
            case 37:
                A00 = NWM.A00();
                break;
            case 38:
                A00 = NXg.A00();
                break;
            case 39:
                A00 = NXg.A01();
                break;
            case 40:
                A00 = NY9.A00();
                break;
            case 41:
                A00 = NXJ.A01();
                break;
            case 42:
                A00 = NTS.A00(obj);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = NXK.A00();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = NTF.A00();
                break;
            case 46:
                A00 = NXK.A01();
                break;
            case ActionId.ON_START_END /* 47 */:
                return new NSd(r302);
            case ActionId.QUEUED /* 48 */:
                return new NSe(r302);
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = NWY.A00();
                break;
            case 50:
                A00 = NTq.A00(r302);
                break;
            case ActionId.UNKNOWN /* 51 */:
                return new NSc(r302);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return new NSg(r302);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = NTr.A00(r302);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return new NSf(r302);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return new NTA(r302);
            case ActionId.QUEUEING_FAIL /* 56 */:
                A00 = NXO.A01(r302);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A00 = NXv.A01();
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A00 = OEL.A00();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A00 = NYO.A02(r302);
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = NXv.A00(r302);
                break;
            case ActionId.COUNTER /* 61 */:
                A00 = NYO.A00(r302);
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = NXw.A01();
                break;
            case 63:
                A00 = NXu.A01();
                break;
            case 64:
                A00 = NWr.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = NXu.A00(obj);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = NYR.A01();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = NTX.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = NYR.A03();
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = NYR.A00();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A00 = NYR.A02();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A00 = NYS.A03(obj);
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = NYS.A00();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A00 = NYS.A02();
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A00 = NYS.A01();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return null;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = NWh.A00();
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                return new NTB(r302);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                return new NSs(r302);
            case 80:
                return new NSt(r302);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = NX2.A00(r302);
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A00 = NXO.A00();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A00 = NYX.A02(r302);
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A00 = NYX.A03(r302);
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = NX1.A00(r302);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A00 = NYX.A00(r302);
                break;
            case ActionId.ERROR /* 87 */:
                A00 = NXM.A01(r302, obj);
                break;
            case ActionId.FINALLY /* 89 */:
                A00 = NUB.A00();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A00 = NXd.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A00 = NXZ.A00();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A00 = NUZ.A00();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A00 = NXW.A01(r302);
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A00 = NUX.A00(r302);
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A00 = NUc.A00(obj);
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A00 = NWX.A00();
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = NXR.A01();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = OF3.A00();
                break;
            case 100:
                A00 = NXR.A00();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = OGF.A00(obj);
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A00 = ORZ.A00();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                A00 = NTl.A00(obj);
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A00 = NWx.A00();
                break;
            case ActionId.ABORTED /* 105 */:
                A00 = NyD.A00(obj);
                break;
            case ActionId.QUERY_READY /* 106 */:
                A00 = NTI.A00();
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A00 = NTh.A00();
                break;
            case 108:
                A00 = NTk.A00();
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A00 = NTu.A00();
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                A00 = NYj.A00();
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A00 = NYj.A01();
                break;
            case ActionId.TIMEOUT /* 113 */:
                A00 = NYj.A02();
                break;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A00 = NYj.A03();
                break;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A00 = NYj.A04();
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A00 = NYj.A05();
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A00 = NXz.A00(r302);
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A00 = NYO.A01(r302);
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A00 = NXw.A00();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A00 = NYX.A01();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = NXz.A01();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A00 = NXx.A01();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A00 = NYi.A00();
                break;
            case 125:
                A00 = NYi.A03();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = NY5.A02();
                break;
            case 127:
                A00 = NTP.A00(r302);
                break;
        }
        return A00;
    }

    public static Object A03(int i, 1BO r302, Object obj) {
        Object A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = NYi.A01();
                break;
            case 1:
                A00 = NYi.A04();
                break;
            case 2:
                A00 = NYi.A05();
                break;
            case 3:
                return new NRo(r302);
            case 4:
                A00 = NYY.A04();
                break;
            case 5:
                A00 = NXQ.A00();
                break;
            case 6:
                A00 = OK2.A02(r302);
                break;
            case 7:
                A00 = NYp.A06();
                break;
            case 8:
                A00 = NYp.A00(r302);
                break;
            case 9:
                A00 = NYp.A01(r302);
                break;
            case 10:
                A00 = NYp.A02(r302);
                break;
            case 11:
                A00 = NYp.A03(r302);
                break;
            case 12:
                A00 = NYp.A04(r302);
                break;
            case 13:
                A00 = NYp.A05(r302);
                break;
            case 14:
                A00 = NXy.A00();
                break;
            case 15:
                A00 = NXy.A01();
                break;
            case 16:
                A00 = NYY.A02();
                break;
            case 17:
                A00 = NXN.A00();
                break;
            case 18:
                A00 = NXN.A01();
                break;
            case 19:
                A00 = NTV.A00();
                break;
            case 20:
                A00 = NWf.A00();
                break;
            case 21:
                A00 = NWw.A00();
                break;
            case 22:
                A00 = NX0.A00(r302);
                break;
            case 23:
                A00 = NV6.A00(r302);
                break;
            case 24:
                A00 = NU1.A00(r302);
                break;
            case 25:
                A00 = OEH.A00();
                break;
            case 26:
                A00 = NXo.A01(r302);
                break;
            case 27:
                A00 = NYd.A03();
                break;
            case 28:
                A00 = NYo.A00();
                break;
            case 29:
                A00 = NYo.A01();
                break;
            case 30:
                A00 = NYo.A02();
                break;
            case 31:
                A00 = NYo.A03();
                break;
            case 32:
                A00 = NYo.A04();
                break;
            case 33:
                A00 = NYo.A05(r302);
                break;
            case 34:
                A00 = NWp.A00();
                break;
            case 35:
                A00 = NTc.A00();
                break;
            case 36:
                return new NSb(r302);
            case 37:
                A00 = NXp.A00();
                break;
            case 38:
                A00 = NYd.A04();
                break;
            case 39:
                A00 = NWg.A00();
                break;
            case 40:
                A00 = NWn.A00();
                break;
            case 41:
                A00 = OFi.A00();
                break;
            case 42:
                A00 = NYP.A00();
                break;
            case 43:
                A00 = NXs.A00();
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = NXs.A01();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = OHJ.A00(r302);
                break;
            case 46:
                A00 = OJ7.A00(r302);
                break;
            case ActionId.ON_START_END /* 47 */:
                A00 = OGT.A00(r302);
                break;
            case ActionId.QUEUED /* 48 */:
                A00 = NYo.A06(r302);
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = NYd.A00(r302);
                break;
            case 50:
                A00 = OLG.A04(r302);
                break;
            case ActionId.UNKNOWN /* 51 */:
                A00 = NWL.A00();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A00 = NXo.A00(r302);
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = Ogo.A00(r302);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A00 = NXp.A01();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A00 = OF7.A00();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A00 = NWo.A00(r302);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A00 = NWz.A00(r302);
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A00 = NXr.A00();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A00 = NXr.A01();
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = NXt.A00();
                break;
            case ActionId.COUNTER /* 61 */:
            case ActionId.UDP_REQUEST_SEND /* 94 */:
            case ActionId.MAIN_COMPLETE /* 95 */:
            case ActionId.INTERRUPTED /* 96 */:
            case 100:
            case ActionId.LEGACY_MARKER /* 103 */:
            case ActionId.QUERY_READY /* 106 */:
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
            case ActionId.TIMEOUT /* 113 */:
            case ActionId.CONTROLLER_INITIATED /* 114 */:
            case ActionId.HEADER_DATA_LOADED /* 121 */:
            default:
                throw new IllegalArgumentException("Invalid Static DI binding id");
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = NYN.A00();
                break;
            case 63:
                A00 = NYN.A02();
                break;
            case 64:
                A00 = NYr.A07(r302);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = NYr.A08();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = NYr.A09();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = NYr.A00(r302);
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = NYr.A01(r302);
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = NYr.A0B(r302);
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A00 = NWK.A00(r302);
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A00 = NYr.A04();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return new NSh(r302);
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = NYN.A01();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A00 = NYr.A02(r302);
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A00 = NYr.A05();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A00 = NYr.A06();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = NYr.A0E(r302);
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A00 = NYP.A02();
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A00 = NYr.A03(r302);
                break;
            case 80:
                A00 = NYr.A0C();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = NYr.A0A();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return new NSi(r302);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A00 = NYr.A0D();
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A00 = NYh.A02();
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = NYh.A05(r302);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A00 = NWb.A00();
                break;
            case ActionId.ERROR /* 87 */:
                A00 = NWe.A00();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A00 = NWi.A00();
                break;
            case ActionId.FINALLY /* 89 */:
                A00 = NWk.A00(r302);
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A00 = NyC.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A00 = NXt.A01();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A00 = 1Bi.A03(180564);
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A00 = 1Bi.A03(180561);
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A00 = NXM.A00();
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = NYY.A03();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = MultiStepResumeJob.A00();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = NXB.A00();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A00 = NTa.A00(r302);
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A00 = NWW.A00();
                break;
            case ActionId.ABORTED /* 105 */:
                A00 = NTE.A00(r302);
                break;
            case 108:
                A00 = Nns.A00(obj);
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A00 = OGv.A00();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A00 = NY2.A00();
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                A00 = Nnq.A00(r302);
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A00 = NYM.A01();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A00 = NX9.A00(obj);
                break;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A00 = NXP.A00();
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A00 = NXP.A01();
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A00 = NY6.A00();
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A00 = NY6.A02();
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A00 = NTK.A00();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = NY7.A00();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A00 = NY6.A01();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A00 = NY7.A01();
                break;
            case 125:
                A00 = NY7.A02();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = NTW.A00(r302);
                break;
        }
        return A00;
    }

    public static Object A04(int i, 1BO r302, Object obj) {
        Object A03;
        switch ((i >> 0) & 127) {
            case 0:
                A03 = NUR.A00(r302);
                break;
            case 1:
                A03 = NV4.A00();
                break;
            case 2:
                A03 = OYb.A00();
                break;
            case 3:
            case 6:
            case 40:
            case 41:
            case ActionId.ON_START_END /* 47 */:
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
            case 108:
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
            case 4:
                A03 = NU0.A00();
                break;
            case 5:
                A03 = NYe.A00();
                break;
            case 7:
                A03 = NYe.A02();
                break;
            case 8:
                A03 = NYe.A03();
                break;
            case 9:
                A03 = NXH.A00();
                break;
            case 10:
                A03 = 1Bi.A03(83605);
                break;
            case 11:
                A03 = NXI.A00();
                break;
            case 12:
                A03 = NYe.A01();
                break;
            case 13:
                A03 = NYk.A00();
                break;
            case 14:
                A03 = NYk.A01();
                break;
            case 15:
                A03 = NYk.A02();
                break;
            case 16:
                A03 = NYk.A03();
                break;
            case 17:
                A03 = NYk.A04(r302);
                break;
            case 18:
                A03 = OIv.A01(r302);
                break;
            case 19:
                return new NSu(r302);
            case 20:
                A03 = Nnt.A00(r302);
                break;
            case 21:
                A03 = Nnp.A00(r302);
                break;
            case 22:
                A03 = NY3.A00();
                break;
            case 23:
                A03 = OES.A00();
                break;
            case 24:
                A03 = NEk.A01(r302);
                break;
            case 25:
                A03 = NY4.A01(r302);
                break;
            case 26:
                A03 = NXA.A00();
                break;
            case 27:
                return new NSw(r302);
            case 28:
                return new NSx(r302);
            case 29:
                return new NSy(r302);
            case 30:
                return new NSz(r302);
            case 31:
                A03 = NY4.A00();
                break;
            case 32:
                A03 = OTM.A00(r302);
                break;
            case 33:
                return new NSv(r302);
            case 34:
                A03 = OER.A00();
                break;
            case 35:
                A03 = OET.A00();
                break;
            case 36:
                A03 = NYk.A05(r302);
                break;
            case 37:
                A03 = HashtagTaggingTypeaheadDataSource.A00();
                break;
            case 38:
                A03 = Nnu.A00(r302);
                break;
            case 39:
                A03 = NXG.A00(obj);
                break;
            case 42:
                A03 = NY3.A01();
                break;
            case 43:
                A03 = NUF.A00();
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A03 = NTe.A00(obj);
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A03 = NV3.A00(obj);
                break;
            case 46:
                A03 = OEP.A00();
                break;
            case ActionId.QUEUED /* 48 */:
                A03 = Nz3.A00();
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A03 = NYf.A00();
                break;
            case 50:
                A03 = NVI.A00(r302, obj);
                break;
            case ActionId.UNKNOWN /* 51 */:
                A03 = NU7.A00(obj);
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A03 = NV9.A00();
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return new NSH(r302);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A03 = NWA.A00();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A03 = NWB.A00();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A03 = NWC.A00();
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A03 = NYc.A01(obj);
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A03 = NVP.A00();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A03 = NU2.A00();
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A03 = NYI.A02(r302);
                break;
            case ActionId.COUNTER /* 61 */:
                return new NSP(r302);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A03 = NYc.A02();
                break;
            case 63:
                A03 = NYc.A03();
                break;
            case 64:
                A03 = NVQ.A00(r302);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return new NT8(r302);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A03 = NYC.A00();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A03 = NUs.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A03 = NTi.A00();
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A03 = NTm.A00();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A03 = NYB.A02();
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A03 = NUw.A00();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A03 = NWE.A00();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A03 = NWF.A00();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A03 = NWG.A00();
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A03 = NXE.A00();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A03 = NUE.A00();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A03 = NXD.A00();
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A03 = NUG.A00();
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A03 = NXT.A01(r302);
                break;
            case 80:
                A03 = NUN.A00();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A03 = NTy.A00();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A03 = NV0.A00();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A03 = NTT.A00();
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A03 = NW3.A00();
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A03 = NTG.A00(r302);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A03 = NTg.A00();
                break;
            case ActionId.ERROR /* 87 */:
                A03 = NYZ.A02();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A03 = NU9.A00();
                break;
            case ActionId.FINALLY /* 89 */:
                A03 = OFT.A00();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return new NSr(r302);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A03 = OEO.A00();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A03 = NXW.A00();
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A03 = NUY.A00();
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A03 = NVK.A00(obj);
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A03 = NVV.A00(obj);
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A03 = NYE.A01();
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A03 = NWH.A00();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A03 = NYJ.A00();
                break;
            case 100:
                A03 = NYJ.A01();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A03 = NYJ.A02();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A03 = NVF.A00();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                A03 = NYl.A06();
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A03 = NYC.A02();
                break;
            case ActionId.ABORTED /* 105 */:
                A03 = NU8.A00(r302);
                break;
            case ActionId.QUERY_READY /* 106 */:
                A03 = NUA.A00();
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A03 = NUO.A00();
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A03 = NYF.A00();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                return new NRz(r302);
            case ActionId.NEW_START_FOUND /* 111 */:
                return new NS0(r302);
            case ActionId.MISSED_EVENT /* 112 */:
                return new NS4(r302);
            case ActionId.TIMEOUT /* 113 */:
                return new NS5(r302);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A03 = NYF.A02();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return new NS3(r302);
            case ActionId.VIDEO_PLAYING /* 116 */:
                A03 = NUQ.A00(obj);
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A03 = NYn.A04();
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A03 = NYn.A05();
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A03 = NXj.A00();
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A03 = NYW.A02();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A03 = NYW.A00(obj);
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A03 = NTb.A00();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A03 = NVW.A00();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A03 = NYn.A00(r302);
                break;
            case 125:
                A03 = NYn.A01();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A03 = NYn.A02(r302);
                break;
            case 127:
                A03 = NYn.A03(r302);
                break;
        }
        return A03;
    }

    public static Object A05(int i, 1BO r302, Object obj) {
        Nc2 A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = NYn.A06(r302);
                break;
            case 1:
                A00 = NVX.A00();
                break;
            case 2:
                A00 = NVY.A00();
                break;
            case 3:
                A00 = NVZ.A00();
                break;
            case 4:
                A00 = NVa.A00();
                break;
            case 5:
                A00 = NVb.A00();
                break;
            case 6:
                A00 = NXj.A01();
                break;
            case 7:
                A00 = NVd.A00();
                break;
            case 8:
                return new NSQ(r302);
            case 9:
                A00 = NYW.A01();
                break;
            case 10:
                A00 = NYW.A03();
                break;
            case 11:
                A00 = NVe.A00();
                break;
            case 12:
                A00 = NVf.A00();
                break;
            case 13:
                A00 = NVg.A00();
                break;
            case 14:
                A00 = NVh.A00();
                break;
            case 15:
                A00 = NVi.A00();
                break;
            case 16:
                return new NSR(r302);
            case 17:
                A00 = NVj.A00();
                break;
            case 18:
                A00 = NVk.A00();
                break;
            case 19:
                A00 = NVl.A00();
                break;
            case 20:
                A00 = NVm.A00();
                break;
            case 21:
                A00 = NVn.A00();
                break;
            case 22:
                A00 = NVo.A00();
                break;
            case 23:
                A00 = NVp.A00();
                break;
            case 24:
                A00 = NVq.A00();
                break;
            case 25:
                A00 = NVr.A00();
                break;
            case 26:
                A00 = NVs.A00();
                break;
            case 27:
                A00 = NVt.A00();
                break;
            case 28:
                A00 = NVu.A00();
                break;
            case 29:
                A00 = NVv.A00();
                break;
            case 30:
                A00 = NVw.A00();
                break;
            case 31:
                A00 = NWU.A00();
                break;
            case 32:
                return new NT9(r302);
            case 33:
                A00 = NY9.A01();
                break;
            case 34:
                A00 = NUV.A00();
                break;
            case 35:
                A00 = NUS.A00();
                break;
            case 36:
                A00 = NYa.A03();
                break;
            case 37:
                A00 = NYa.A04();
                break;
            case 38:
                return new NSL(r302);
            case 39:
                A00 = NXZ.A01(r302);
                break;
            case 40:
                A00 = NYB.A00();
                break;
            case 41:
                A00 = NUz.A00();
                break;
            case 42:
                A00 = NY9.A02();
                break;
            case 43:
                A00 = NUy.A00();
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = NUx.A00();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = NV1.A00();
                break;
            case 46:
                A00 = NXe.A00();
                break;
            case ActionId.ON_START_END /* 47 */:
                A00 = NXe.A01(r302);
                break;
            case ActionId.QUEUED /* 48 */:
                A00 = NW8.A00(obj);
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = NVc.A00();
                break;
            case 50:
                A00 = NUv.A00();
                break;
            case ActionId.UNKNOWN /* 51 */:
                A00 = NVz.A00(obj);
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A00 = NW1.A00(obj);
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = NW5.A00();
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return new NSU(r302);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A00 = NYl.A04();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A00 = NYl.A05();
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A00 = NYD.A01(r302);
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return new NRy(r302);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return new NT2(r302);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = NVG.A00();
                break;
            case ActionId.COUNTER /* 61 */:
                A00 = NYZ.A01();
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = NYZ.A03();
                break;
            case 63:
                A00 = NYZ.A04();
                break;
            case 64:
                A00 = NYD.A02();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = NYE.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = NYf.A02();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = NYf.A03();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = NYa.A00();
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = NYa.A01();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A00 = NUT.A00();
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A00 = NYT.A00();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A00 = NYT.A01();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = NYT.A02();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A00 = NYT.A03();
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return new NSF(r302);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return new NSG(r302);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = NVC.A00();
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                return new NSJ(r302);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A00 = NXf.A00();
                break;
            case 80:
                A00 = NXf.A01();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = NYc.A00();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return new NRx(r302);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A00 = NVR.A00();
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A00 = NYV.A00(obj);
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = NYV.A02();
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A00 = NYV.A03(obj);
                break;
            case ActionId.ERROR /* 87 */:
                A00 = NYV.A01(obj);
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                return new NSS(r302);
            case ActionId.FINALLY /* 89 */:
                A00 = NXl.A01();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return new NSj(r302);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                return new NSl(r302);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return new NSm(r302);
            case ActionId.ANIMATION_END /* 93 */:
                return new NSn(r302);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return new NSo(r302);
            case ActionId.MAIN_COMPLETE /* 95 */:
                return new NSp(r302);
            case ActionId.INTERRUPTED /* 96 */:
                return new NSk(r302);
            case ActionId.NETWORK_FAILED /* 97 */:
                return new NSq(r302);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = OEN.A00();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = NWq.A00();
                break;
            case 100:
                A00 = Nyl.A00();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = NXU.A00(r302);
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                return new NT4(r302);
            case ActionId.LEGACY_MARKER /* 103 */:
                return new NS6(r302);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return new NS7(r302);
            case ActionId.ABORTED /* 105 */:
                A00 = OJM.A01(r302);
                break;
            case ActionId.QUERY_READY /* 106 */:
                A00 = OKB.A00();
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A00 = OKO.A00(r302);
                break;
            case 108:
                A00 = PlacePickerFetcher.A00(r302);
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A00 = NVA.A00();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A00 = NVL.A00();
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                return new NRn(r302);
            case ActionId.MISSED_EVENT /* 112 */:
                return new NSY(r302);
            case ActionId.TIMEOUT /* 113 */:
                return new NSZ(r302);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                return new NSa(r302);
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A00 = NYC.A01();
                break;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A00 = NYD.A00(obj);
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return new NRq(r302);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A00 = NYf.A04();
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return new NS2(r302);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A00 = NYa.A02();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A00 = NWI.A00();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = NUI.A00();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                return new NRu(r302);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                return new NRv(r302);
            case 125:
                return new NRw(r302);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = NVS.A00();
                break;
            case 127:
                A00 = NUK.A00();
                break;
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
        }
        return A00;
    }

    public static Object A06(int i, 1BO r302, Object obj) {
        Nva A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = NUL.A00();
                break;
            case 1:
                A00 = NUM.A00();
                break;
            case 2:
                A00 = NYm.A00(r302);
                break;
            case 3:
            case 50:
            case ActionId.NEW_START_FOUND /* 111 */:
            default:
                throw new IllegalArgumentException("Invalid Static DI binding id");
            case 4:
                A00 = NYm.A05();
                break;
            case 5:
                A00 = NYm.A03();
                break;
            case 6:
                A00 = NYm.A04();
                break;
            case 7:
                return new NT7(r302);
            case 8:
                A00 = NUP.A00();
                break;
            case 9:
                return new NS8(r302);
            case 10:
                return new NS9(r302);
            case 11:
                return new NS1(r302);
            case 12:
                A00 = NUC.A00();
                break;
            case 13:
                A00 = NXX.A01();
                break;
            case 14:
                A00 = NUu.A00(obj);
                break;
            case 15:
                A00 = NTH.A00(r302);
                break;
            case 16:
                A00 = NV8.A00(r302);
                break;
            case 17:
                return new NSE(r302);
            case 18:
                A00 = NYH.A02(r302);
                break;
            case 19:
                A00 = NYL.A01();
                break;
            case 20:
                A00 = NYL.A02();
                break;
            case 21:
                return new NRp(r302);
            case 22:
                A00 = NYb.A00();
                break;
            case 23:
                A00 = NYb.A03();
                break;
            case 24:
                A00 = NYb.A04();
                break;
            case 25:
                A00 = NUb.A00();
                break;
            case 26:
                return new NST(r302);
            case 27:
                A00 = NYL.A00(r302);
                break;
            case 28:
                A00 = NYb.A01();
                break;
            case 29:
                return new NSB(r302);
            case 30:
                return new NSD(r302);
            case 31:
                A00 = NYG.A00();
                break;
            case 32:
                A00 = NU3.A00(obj);
                break;
            case 33:
                A00 = NYG.A01();
                break;
            case 34:
                A00 = NW7.A00();
                break;
            case 35:
                A00 = NUD.A00();
                break;
            case 36:
                A00 = NXY.A00();
                break;
            case 37:
                A00 = NYU.A02();
                break;
            case 38:
                A00 = NYU.A01();
                break;
            case 39:
                A00 = NVM.A00();
                break;
            case 40:
                return new NSI(r302);
            case 41:
                A00 = NVB.A00();
                break;
            case 42:
                A00 = NXc.A01(r302);
                break;
            case 43:
                A00 = NXc.A00(r302);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = NVD.A00();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = NVx.A00();
                break;
            case 46:
                A00 = NVy.A00(obj);
                break;
            case ActionId.ON_START_END /* 47 */:
                A00 = NW0.A00(obj);
                break;
            case ActionId.QUEUED /* 48 */:
                A00 = NW2.A00(obj);
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = NW6.A00(obj);
                break;
            case ActionId.UNKNOWN /* 51 */:
                A00 = NXn.A01();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A00 = NXn.A00();
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = NTD.A00();
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A00 = NYg.A03(r302);
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A00 = NYc.A04();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A00 = NYl.A00();
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A00 = NYl.A01();
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A00 = NYl.A02();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return new NT0(r302);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = NUJ.A00();
                break;
            case ActionId.COUNTER /* 61 */:
                A00 = NUa.A00();
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = NYb.A02();
                break;
            case 63:
                return new NSV(r302);
            case 64:
                return new NSW(r302);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = NYl.A03();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = NYF.A01();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = NXU.A01();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = NXV.A00();
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = NXV.A01();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A00 = NYU.A00();
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A00 = NYH.A01();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A00 = NYg.A02();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = NXb.A00();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return new NSM(r302);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A00 = NVN.A00();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A00 = NW9.A00();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = NTU.A00(r302);
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A00 = OFg.A00(r302);
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A00 = NU6.A00();
                break;
            case 80:
                A00 = NUH.A00();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = NYE.A02();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A00 = NYf.A05();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                return new NT3(r302);
            case ActionId.MARKER_SWAPPED /* 84 */:
                return new NT5(r302);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = NXY.A01();
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                return new NSC(r302);
            case ActionId.ERROR /* 87 */:
                A00 = NXb.A01();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                return new NT6(r302);
            case ActionId.FINALLY /* 89 */:
                return new NSK(r302);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A00 = NVE.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A00 = NVH.A00();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return new NSO(r302);
            case ActionId.ANIMATION_END /* 93 */:
                A00 = NVO.A00();
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A00 = NXk.A00();
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A00 = NXk.A01();
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A00 = NXl.A00();
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                return new NSX(r302);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = NUd.A00();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = NYG.A02();
                break;
            case 100:
                A00 = NYU.A03();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = NW4.A00();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A00 = NYB.A01();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                A00 = NYZ.A00();
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return new NT1(r302);
            case ActionId.ABORTED /* 105 */:
                return new NRs(r302);
            case ActionId.QUERY_READY /* 106 */:
                return new NRt(r302);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A00 = NUU.A00();
                break;
            case 108:
                A00 = NUh.A00();
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A00 = NYH.A00();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A00 = NUr.A00();
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                return new NSA(r302);
            case ActionId.TIMEOUT /* 113 */:
                A00 = NYg.A01();
                break;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A00 = NYg.A05();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A00 = NXd.A01();
                break;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A00 = NYm.A01();
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A00 = NYm.A02();
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A00 = NYm.A06();
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return new NRr(r302);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A00 = NYf.A01();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A00 = NYg.A00(obj);
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = NYg.A04();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A00 = NUt.A00();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A00 = NXJ.A00(r302);
                break;
            case 125:
                A00 = NTs.A00();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = NTt.A00();
                break;
            case 127:
                A00 = NYq.A00();
                break;
        }
        return A00;
    }

    public static Object A07(int i, 1BO r302, Object obj) {
        NdI A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = NYq.A01();
                break;
            case 1:
                A00 = NYq.A02();
                break;
            case 2:
                A00 = NYq.A03();
                break;
            case 3:
                A00 = NYq.A04();
                break;
            case 4:
                A00 = NYq.A05();
                break;
            case 5:
                A00 = NYq.A06();
                break;
            case 6:
                A00 = NYq.A07();
                break;
            case 7:
                A00 = NYq.A08();
                break;
            case 8:
                A00 = NYq.A09();
                break;
            case 9:
                A00 = NYq.A0A();
                break;
            case 10:
                A00 = NYe.A04();
                break;
            case 11:
                A00 = NV7.A00();
                break;
            case 12:
            case 13:
            case 14:
            case 16:
            case 21:
            case 26:
            default:
                throw AnonymousClass001.A0L("Invalid Static DI binding id");
            case 15:
                A00 = NWR.A00();
                break;
            case 17:
                A00 = NYK.A01();
                break;
            case 18:
                A00 = NYK.A02();
                break;
            case 19:
                A00 = NWO.A00();
                break;
            case 20:
                A00 = NWP.A00();
                break;
            case 22:
                A00 = NXq.A01();
                break;
            case 23:
                A00 = NXq.A00();
                break;
            case 24:
                A00 = NWQ.A00();
                break;
            case 25:
                A00 = NYK.A00();
                break;
            case 27:
                A00 = NWS.A00();
                break;
            case 28:
                A00 = NWT.A00();
                break;
            case 29:
                A00 = NWV.A00();
                break;
        }
        return A00;
    }
}
