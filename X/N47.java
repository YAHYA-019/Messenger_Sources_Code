package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.photos.imageprocessing.FiltersEngine;

/* loaded from: N47.class */
public abstract class N47 {
    public static Object A00(int i, 1BO r302, Object obj) {
        int i2 = (i >> 7) & 15;
        if (i2 == 0) {
            return A01(i, r302, obj);
        }
        if (i2 == 1) {
            return A02(i, r302, obj);
        }
        if (i2 == 2) {
            return A03(i, r302, obj);
        }
        if (i2 == 3) {
            return A04(i, r302, obj);
        }
        throw MRl.A0J();
    }

    public static Object A01(int i, 1BO r302, Object obj) {
        SeO A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = SX7.A00();
                break;
            case 1:
                A00 = SX7.A01();
                break;
            case 2:
            case 3:
            case 4:
            case 9:
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
            case ActionId.NEW_START_FOUND /* 111 */:
            case ActionId.CONTROLLER_INITIATED /* 114 */:
            case ActionId.VIDEO_PLAYING /* 116 */:
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
            default:
                throw MRl.A0J();
            case 5:
                A00 = SX1.A00();
                break;
            case 6:
                A00 = SX1.A01();
                break;
            case 7:
                A00 = SVO.A00();
                break;
            case 8:
                A00 = SVP.A00();
                break;
            case 10:
                A00 = SVg.A00();
                break;
            case 11:
                A00 = SXS.A00();
                break;
            case 12:
                A00 = SXS.A01(r302);
                break;
            case 13:
                A00 = SVe.A00();
                break;
            case 14:
                A00 = SXa.A00();
                break;
            case 15:
                A00 = SW3.A00();
                break;
            case 16:
                A00 = SVU.A00();
                break;
            case 17:
                A00 = SXr.A02();
                break;
            case 18:
                A00 = SXr.A00();
                break;
            case 19:
                A00 = SXr.A04();
                break;
            case 20:
                A00 = SXr.A03();
                break;
            case 21:
                A00 = SVb.A00();
                break;
            case 22:
                A00 = SXH.A00();
                break;
            case 23:
                A00 = SXr.A01();
                break;
            case 24:
                A00 = SWH.A00();
                break;
            case 25:
                A00 = SXu.A03();
                break;
            case 26:
                A00 = SVA.A00();
                break;
            case 27:
                A00 = SXt.A03();
                break;
            case 28:
                A00 = SXH.A01(obj);
                break;
            case 29:
                A00 = SVz.A00();
                break;
            case 30:
                A00 = SW2.A00();
                break;
            case 31:
                A00 = SWp.A00();
                break;
            case 32:
                A00 = SXJ.A00();
                break;
            case 33:
                A00 = SY0.A00();
                break;
            case 34:
                A00 = SY0.A0C();
                break;
            case 35:
                A00 = SY0.A01();
                break;
            case 36:
                A00 = SY0.A0D();
                break;
            case 37:
                A00 = SY0.A06();
                break;
            case 38:
                A00 = SY0.A05();
                break;
            case 39:
                A00 = SXW.A01();
                break;
            case 40:
                A00 = SVm.A00();
                break;
            case 41:
                A00 = SXs.A04();
                break;
            case 42:
                A00 = SWj.A00();
                break;
            case 43:
                A00 = SXT.A01();
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = SXs.A01(obj);
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = SWi.A00();
                break;
            case 46:
                A00 = SWk.A00();
                break;
            case ActionId.ON_START_END /* 47 */:
                A00 = SXT.A00();
                break;
            case ActionId.QUEUED /* 48 */:
                return new SV9(r302);
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = SXi.A02(obj);
                break;
            case 50:
                A00 = SY0.A0A();
                break;
            case ActionId.UNKNOWN /* 51 */:
                A00 = SW8.A00();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A00 = SXd.A00();
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = SXW.A02();
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A00 = SWE.A00();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A00 = SXd.A01();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A00 = SXg.A01();
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A00 = SVI.A00();
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                SXc.A02();
                throw null;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A00 = SXg.A00();
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = SWq.A00();
                break;
            case ActionId.COUNTER /* 61 */:
                A00 = SVZ.A00();
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = SWm.A00();
                break;
            case 63:
                A00 = SX4.A01(obj);
                break;
            case 64:
                A00 = SW1.A00(r302);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = SXE.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = SWn.A00(obj);
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = SWT.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = SY0.A0B(obj);
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = SXv.A03();
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return new SUj(r302);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A00 = SXW.A00(r302);
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A00 = SVh.A00();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = SXb.A02();
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A00 = SVD.A00();
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A00 = SX9.A00();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A00 = SX9.A01();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = SWs.A01();
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A00 = SVw.A00();
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A00 = SVr.A00();
                break;
            case 80:
                A00 = SVu.A00(obj);
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = SXI.A00();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return new SUl(r302);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A00 = SVy.A00(obj);
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A00 = SW0.A00();
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = SXb.A00(r302);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A00 = SXz.A01();
                break;
            case ActionId.ERROR /* 87 */:
                A00 = SXz.A02();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A00 = SXz.A00(obj);
                break;
            case ActionId.FINALLY /* 89 */:
                A00 = SXz.A07();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A00 = SXz.A09();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A00 = SXz.A0B();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A00 = SVR.A00();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A00 = SXz.A06(obj);
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A00 = SVB.A00();
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A00 = SXz.A0A(obj);
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A00 = SXv.A05();
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A00 = SWP.A00();
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = SW9.A00();
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = SWQ.A00();
                break;
            case 100:
                A00 = SXi.A00(obj);
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = SXi.A03();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A00 = SXj.A00();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                A00 = SXj.A01();
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A00 = SXj.A02();
                break;
            case ActionId.ABORTED /* 105 */:
                A00 = SXl.A02(obj);
                break;
            case ActionId.QUERY_READY /* 106 */:
                A00 = SW5.A00();
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A00 = SXj.A03(obj);
                break;
            case 108:
                A00 = SXu.A00();
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A00 = SWu.A00();
                break;
            case ActionId.TIMEOUT /* 113 */:
                A00 = SXt.A05();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A00 = SXt.A02();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A00 = SWO.A00();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = SXZ.A01(obj);
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A00 = SXZ.A02(obj);
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A00 = SXo.A03(r302);
                break;
            case 125:
                A00 = SXo.A01();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = SXo.A02();
                break;
            case 127:
                A00 = SWG.A00();
                break;
        }
        return A00;
    }

    public static Object A02(int i, 1BO r302, Object obj) {
        SgZ A02;
        switch ((i >> 0) & 127) {
            case 0:
                A02 = SXL.A00();
                break;
            case 1:
                A02 = SXx.A01();
                break;
            case 2:
                A02 = SXn.A02();
                break;
            case 3:
                A02 = SXn.A00();
                break;
            case 4:
                A02 = SXo.A00(obj);
                break;
            case 5:
                A02 = SXn.A03();
                break;
            case 6:
                A02 = SXx.A03();
                break;
            case 7:
                A02 = SXx.A06();
                break;
            case 8:
                A02 = SXL.A01();
                break;
            case 9:
            case 29:
            case 32:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
            case ActionId.NETWORK_RESPONSE /* 98 */:
            case ActionId.TIMEOUT /* 113 */:
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
            case ActionId.VIDEO_PLAYING /* 116 */:
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
            default:
                throw MRl.A0J();
            case 10:
                A02 = SVl.A00(obj);
                break;
            case 11:
                A02 = SXK.A00();
                break;
            case 12:
                A02 = FiltersEngine._UL__ULSEP_com_facebook_photos_imageprocessing_FiltersEngine_ULSEP_FACTORY_METHOD(i, r302, obj);
                break;
            case 13:
                A02 = SXw.A04();
                break;
            case 14:
                A02 = SXw.A00();
                break;
            case 15:
                A02 = SXw.A01(r302);
                break;
            case 16:
                A02 = SY0.A07();
                break;
            case 17:
                A02 = SXl.A03();
                break;
            case 18:
                A02 = SXw.A02();
                break;
            case 19:
                A02 = SWr.A00();
                break;
            case 20:
                A02 = SY0.A09();
                break;
            case 21:
                A02 = SXK.A01();
                break;
            case 22:
                A02 = SXu.A02();
                break;
            case 23:
                A02 = SXJ.A01();
                break;
            case 24:
                A02 = SXO.A00();
                break;
            case 25:
                A02 = SX0.A01(obj);
                break;
            case 26:
                A02 = SX3.A00();
                break;
            case 27:
                throw AnonymousClass001.A0N("Unsupported feature in Inspiration editor");
            case 28:
                A02 = SXX.A02();
                break;
            case 30:
                A02 = SXU.A00();
                break;
            case 31:
                A02 = SXX.A01();
                break;
            case 33:
                A02 = SXc.A00();
                break;
            case 34:
                A02 = SXV.A00();
                break;
            case 35:
                A02 = SXU.A01(obj);
                break;
            case 36:
                A02 = SXy.A01();
                break;
            case 37:
                A02 = SXy.A03();
                break;
            case 38:
                A02 = SXy.A04();
                break;
            case 39:
                A02 = SXy.A00();
                break;
            case 40:
                A02 = SXy.A06();
                break;
            case 41:
                A02 = SXy.A08();
                break;
            case 42:
                A02 = SVK.A00();
                break;
            case 43:
                A02 = SVs.A00(obj);
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return new SV1(r302);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return new SUz(r302);
            case 46:
                return new SV0(r302);
            case ActionId.ON_START_END /* 47 */:
                return new SUr(r302);
            case ActionId.QUEUED /* 48 */:
                return new SUs(r302);
            case ActionId.IN_PROGRESS /* 49 */:
                A02 = SXY.A01();
                break;
            case 50:
                A02 = SXY.A02();
                break;
            case ActionId.UNKNOWN /* 51 */:
                A02 = SVS.A00();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A02 = SXQ.A01();
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A02 = SqE.A00(r302);
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A02 = SXi.A01();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A02 = SXQ.A00();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A02 = SXk.A02(r302);
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A02 = SXk.A03(obj);
                break;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A02 = SVV.A00();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A02 = SXk.A00();
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A02 = SXm.A01(r302);
                break;
            case ActionId.COUNTER /* 61 */:
                A02 = SXy.A02();
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A02 = SXq.A02();
                break;
            case 63:
                A02 = SXq.A03();
                break;
            case 64:
                A02 = SX8.A00(r302);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A02 = SXq.A00();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A02 = SXd.A02();
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A02 = SWe.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A02 = SVf.A00(r302);
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                throw AnonymousClass001.A0N("Unsupported feature in Inspiration editor");
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A02 = SXX.A00();
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A02 = SVJ.A00(obj);
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A02 = SWz.A01(obj);
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A02 = SWx.A01(obj);
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A02 = SWw.A01(obj);
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A02 = SWx.A00(obj);
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A02 = SWv.A01(obj);
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A02 = SWw.A00(obj);
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A02 = SVq.A00();
                break;
            case 80:
                A02 = SXG.A00(obj);
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A02 = SWv.A00(obj);
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A02 = SXE.A01();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A02 = SXF.A01(obj);
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A02 = SXG.A01(obj);
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A02 = SXF.A00(obj);
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A02 = SXV.A01();
                break;
            case ActionId.ERROR /* 87 */:
                A02 = SVG.A00();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A02 = SWo.A00();
                break;
            case ActionId.FINALLY /* 89 */:
                A02 = SWy.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A02 = SXc.A01();
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A02 = SXn.A01();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A02 = SXu.A04();
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A02 = SXh.A01(r302, obj);
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A02 = SXh.A02(r302);
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A02 = SXh.A03();
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A02 = SXh.A00(r302);
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A02 = SX3.A01();
                break;
            case 100:
                A02 = SVM.A00();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A02 = SVQ.A00(r302, obj);
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                return new SUx(r302);
            case ActionId.LEGACY_MARKER /* 103 */:
                A02 = SWy.A01();
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A02 = SVH.A00();
                break;
            case ActionId.ABORTED /* 105 */:
                A02 = SWt.A00();
                break;
            case ActionId.QUERY_READY /* 106 */:
                A02 = SXf.A02(r302);
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A02 = SWu.A01();
                break;
            case 108:
                A02 = SXf.A00();
                break;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A02 = SWt.A01();
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A02 = SXe.A00();
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                A02 = SXe.A02(r302, obj);
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A02 = SVF.A00();
                break;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A02 = SVE.A00(r302);
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A02 = SXf.A01();
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A02 = SXf.A03();
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A02 = SXt.A04();
                break;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A02 = SXe.A03(r302);
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A02 = SX2.A00();
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A02 = SVN.A00(r302, obj);
                break;
            case 125:
                A02 = SXw.A03(r302);
                break;
            case 127:
                A02 = SXg.A02();
                break;
        }
        return A02;
    }

    public static Object A03(int i, 1BO r302, Object obj) {
        ShG A00;
        switch ((i >> 0) & 127) {
            case 0:
                A00 = SX0.A00();
                break;
            case 1:
                A00 = SXg.A03();
                break;
            case 2:
            case ActionId.TIMEOUT /* 113 */:
            default:
                throw MRl.A0J();
            case 3:
                A00 = SXv.A04();
                break;
            case 4:
                A00 = SVp.A00();
                break;
            case 5:
                A00 = SXD.A01();
                break;
            case 6:
                A00 = SXB.A01(r302);
                break;
            case 7:
                A00 = SVo.A00();
                break;
            case 8:
                A00 = SXC.A00(obj);
                break;
            case 9:
                A00 = SXC.A01(obj);
                break;
            case 10:
                A00 = SXD.A00();
                break;
            case 11:
                A00 = SXB.A00(r302, obj);
                break;
            case 12:
                A00 = SVa.A00();
                break;
            case 13:
                A00 = SVn.A00();
                break;
            case 14:
                A00 = SXM.A01(obj);
                break;
            case 15:
                A00 = SXN.A00(obj);
                break;
            case 16:
                A00 = SXN.A01(obj);
                break;
            case 17:
                A00 = SWD.A00();
                break;
            case 18:
                A00 = SWJ.A00(r302);
                break;
            case 19:
                A00 = SWg.A00();
                break;
            case 20:
                A00 = SWY.A00();
                break;
            case 21:
                A00 = SXs.A02(r302);
                break;
            case 22:
                A00 = SWB.A00();
                break;
            case 23:
                A00 = SWC.A00();
                break;
            case 24:
                A00 = SWc.A00();
                break;
            case 25:
                A00 = SWb.A00();
                break;
            case 26:
                A00 = SWZ.A00();
                break;
            case 27:
                A00 = SXs.A03();
                break;
            case 28:
                A00 = SWa.A00();
                break;
            case 29:
                A00 = SWf.A00(r302);
                break;
            case 30:
                return new SUw(r302);
            case 31:
                A00 = SWh.A00();
                break;
            case 32:
                A00 = SX5.A01();
                break;
            case 33:
                return new SUy(r302);
            case 34:
                A00 = SVW.A00();
                break;
            case 35:
                A00 = SXp.A03();
                break;
            case 36:
                A00 = SWA.A00(obj);
                break;
            case 37:
                return new SV8(r302);
            case 38:
                A00 = SWd.A00(r302);
                break;
            case 39:
                A00 = SX6.A00();
                break;
            case 40:
                A00 = SWV.A00();
                break;
            case 41:
                return new SV7(r302);
            case 42:
                A00 = SXp.A00();
                break;
            case 43:
                A00 = SXp.A01();
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A00 = SXp.A02();
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A00 = SWR.A00();
                break;
            case 46:
                A00 = SY0.A03();
                break;
            case ActionId.ON_START_END /* 47 */:
                A00 = SXb.A01();
                break;
            case ActionId.QUEUED /* 48 */:
                A00 = SXM.A00();
                break;
            case ActionId.IN_PROGRESS /* 49 */:
                A00 = SX5.A00();
                break;
            case 50:
                A00 = SVT.A00();
                break;
            case ActionId.UNKNOWN /* 51 */:
                A00 = SXl.A01();
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A00 = SXy.A07();
                break;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A00 = SX6.A01();
                break;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A00 = SXz.A08();
                break;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A00 = SXv.A00();
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                return new SUh(r302);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return new SUi(r302);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A00 = SXv.A06();
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A00 = SXz.A03();
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A00 = SXz.A05();
                break;
            case ActionId.COUNTER /* 61 */:
                A00 = SVc.A00();
                break;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A00 = SXv.A01(r302);
                break;
            case 63:
                A00 = SWl.A00();
                break;
            case 64:
                A00 = SX2.A01(r302);
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A00 = SY0.A04();
                break;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A00 = SVi.A00(obj);
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A00 = SWF.A00();
                break;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A00 = SXR.A00(r302);
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A00 = SXl.A00(obj);
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A00 = SVx.A00(obj);
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A00 = SXI.A01(obj);
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A00 = SWU.A00();
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                A00 = SWz.A00(obj);
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A00 = SXv.A02();
                break;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A00 = SY0.A08();
                break;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A00 = SW6.A00();
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A00 = SXa.A01();
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A00 = SVk.A00();
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A00 = SXt.A00();
                break;
            case 80:
                A00 = SXt.A01();
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A00 = SX8.A01();
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A00 = SWM.A00();
                break;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A00 = SWN.A00();
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A00 = SVj.A00();
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A00 = SXA.A00();
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A00 = SXe.A01();
                break;
            case ActionId.ERROR /* 87 */:
                A00 = SXw.A05();
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                A00 = SVt.A00(r302);
                break;
            case ActionId.FINALLY /* 89 */:
                A00 = SW4.A00();
                break;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A00 = SWL.A00();
                break;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A00 = SVX.A00(r302);
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A00 = SVv.A00();
                break;
            case ActionId.ANIMATION_END /* 93 */:
                A00 = SXu.A01();
                break;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A00 = SXx.A05();
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A00 = SXx.A04(obj);
                break;
            case ActionId.INTERRUPTED /* 96 */:
                A00 = SWS.A00(r302);
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                A00 = SWI.A00();
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A00 = SXs.A00(obj);
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A00 = SXx.A00();
                break;
            case 100:
                A00 = SXm.A02();
                break;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A00 = SXm.A03();
                break;
            case ActionId.DATA_LOAD_START /* 102 */:
                A00 = SWK.A00();
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                return new SUm(r302);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                return new SUn(r302);
            case ActionId.ABORTED /* 105 */:
                return new SUo(r302);
            case ActionId.QUERY_READY /* 106 */:
                return new SUp(r302);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                return new SUq(r302);
            case 108:
                return new SUt(r302);
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                return new SV2(r302);
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A00 = SXk.A01(r302);
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                A00 = SXx.A07();
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A00 = SXR.A01();
                break;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A00 = SXy.A05();
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A00 = SVC.A00();
                break;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A00 = SWs.A00();
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A00 = SXm.A00();
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                return new SV3(r302);
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A00 = SXx.A02();
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return new SUk(r302);
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return new 1C5(r302, 1C4.A1r);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A00 = SXw.A06();
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A00 = SXO.A01(obj);
                break;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A00 = SXu.A05();
                break;
            case 125:
                A00 = SXZ.A00();
                break;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A00 = SXY.A00();
                break;
            case 127:
                A00 = SW7.A00();
                break;
        }
        return A00;
    }

    public static Object A04(int i, 1BO r302, Object obj) {
        Ser A01;
        switch ((i >> 0) & 127) {
            case 0:
                A01 = SXa.A02();
                break;
            case 1:
                A01 = SVL.A00();
                break;
            case 2:
                return new SUu(r302);
            case 3:
                A01 = SWW.A00();
                break;
            case 4:
                A01 = SX4.A00();
                break;
            case 5:
                A01 = SXz.A04();
                break;
            case 6:
                return new SUg(r302);
            case 7:
                return new SUv(r302);
            case 8:
                return new SV5(r302);
            case 9:
                return new SV6(r302);
            case 10:
                A01 = SY0.A02();
                break;
            case 11:
                A01 = SVd.A00();
                break;
            case 12:
                A01 = SXA.A01();
                break;
            case 13:
                return new SV4(r302);
            case 14:
                A01 = SVY.A00();
                break;
            case 15:
                A01 = SXq.A01();
                break;
            case 16:
                A01 = SWX.A00(r302);
                break;
            case 17:
                A01 = SXP.A00();
                break;
            case 18:
                A01 = SXP.A01();
                break;
            default:
                throw MRl.A0J();
        }
        return A01;
    }
}
