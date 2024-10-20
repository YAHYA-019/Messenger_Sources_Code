package com.facebook.messaging.msys.advancedcrypto.mobileconfig;

import X.11T;
import X.1CO;
import X.1GD;
import X.C21q;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.forker.Process;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: MEMMobileConfigPlatformMessengerAndroidPluginPremailbox.class */
public final class MEMMobileConfigPlatformMessengerAndroidPluginPremailbox extends Premailbox {
    public MEMMobileConfigPlatformMessengerAndroidPluginPremailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(messengerSessionedMCPContext);
    }

    private final 1GD GetMobileConfigOptions(boolean z) {
        1GD r303 = z ? 1GD.A06 : 1GD.A07;
        11T.A0C(r303);
        return r303;
    }

    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public String MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformCopyString(int i, String str, boolean z) {
        String str2;
        1CO mobileConfig;
        long j;
        switch (i) {
            case 567:
                str2 = "msgrMobile";
                break;
            case 568:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36887249312286424L;
                str2 = mobileConfig.BDC(GetMobileConfigOptions(z), "9&ITur@o#MI3uv38", j);
                break;
            case 569:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36886957255100103L;
                str2 = mobileConfig.BDC(GetMobileConfigOptions(z), "9&ITur@o#MI3uv38", j);
                break;
            case 570:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36886957255231176L;
                str2 = mobileConfig.BDC(GetMobileConfigOptions(z), "9&ITur@o#MI3uv38", j);
                break;
            case 571:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36889989501421414L;
                str2 = mobileConfig.BDC(GetMobileConfigOptions(z), "9&ITur@o#MI3uv38", j);
                break;
            case 572:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36889989501486951L;
                str2 = mobileConfig.BDC(GetMobileConfigOptions(z), "9&ITur@o#MI3uv38", j);
                break;
            default:
                str2 = str;
                break;
        }
        return !11T.A0O(str2, "9&ITur@o#MI3uv38") ? str2 : str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public boolean MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetBoolean(int i, boolean z, boolean z2) {
        1CO mobileConfig;
        long j;
        1CO mobileConfig2;
        long j2;
        1CO mobileConfig3;
        long j3;
        switch (i) {
            case 3:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317564862868919L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 4:
            case 7:
            case 9:
            case 16:
            case 17:
            case 19:
            case 20:
            case 25:
            case 36:
            case ActionId.FRAGMENT_CREATED /* 78 */:
            case ActionId.FRAGMENT_RESUMED /* 79 */:
            case 80:
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
            case ActionId.DATA_LOAD_START /* 102 */:
            case ActionId.ABORTED /* 105 */:
            case ActionId.TIMEOUT /* 113 */:
            case 128:
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
            case 150:
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
            case ActionId.VIDEO_DISPLAYED /* 170 */:
            case 180:
            case 187:
            case 190:
            case 192:
            case 197:
            case 207:
            case 214:
            case 218:
            case 226:
            case 230:
            case 235:
            case 245:
            case Process.SD_PIPE /* 252 */:
            case 255:
            case 263:
            case 264:
            case 265:
            case 286:
            case 293:
            case 294:
            case 295:
            case 296:
            case 297:
            case 298:
            case 299:
            case 300:
            case 301:
            case 302:
            case 303:
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
            case 316:
            case 317:
            case 318:
            case 322:
            case 327:
            case 345:
            case 353:
            case 356:
            case 371:
            case 372:
            case 373:
            case AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS /* 375 */:
            case 384:
            case 403:
            case 414:
            case 415:
            case 420:
            case 431:
            case 432:
            case 433:
            case 435:
            case 437:
            case 440:
            case 442:
            case 447:
            default:
                return z;
            case 5:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342168554113094462L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 6:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439569705027L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 8:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326489792206493L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 10:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730900362648L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 11:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317564862999993L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 12:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342157185348869776L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 13:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324630071431025L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 14:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324007303728516L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 15:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945427724L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 18:
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
            case 179:
            case 321:
            case 323:
            case 335:
            case 378:
                return false;
            case 21:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317259911867496L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 22:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324007303662979L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 23:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324007303466369L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 24:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324007303597442L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 26:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160269123202131L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 27:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326253569791357L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 28:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 72341353937637981L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 29:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564857757067L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 30:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case ActionId.QUERY_READY /* 106 */:
            case 108:
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
            case 194:
            case 239:
            case Process.SD_STDOUT /* 251 */:
            case 262:
            case 325:
            case 336:
            case 391:
            case 395:
            case 408:
            case 422:
                return true;
            case 31:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569942609651L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 32:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176143498959L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 33:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564857625994L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 34:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730901083551L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 35:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36323212732156249L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 37:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448795326662L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 38:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448796506325L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 39:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448796375251L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 40:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439582746836L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 41:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448795392199L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 42:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342159448795457736L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 43:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342159448795719884L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342159448795785421L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448794802370L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 46:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342159448794867907L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case ActionId.ON_START_END /* 47 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448793688243L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.QUEUED /* 48 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448795588810L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.IN_PROGRESS /* 49 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439581960395L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 50:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342159448793950390L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case ActionId.UNKNOWN /* 51 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342157185351032481L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448794671296L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448794409149L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326803324819277L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.QUEUEING_FAIL /* 56 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448793622706L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448794474686L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36322873431836718L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323809733332206L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.COUNTER /* 61 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176130195062L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342165289937945868L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 63:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142319296L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 64:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176142581443L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322280724972819L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317706584927872L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322280724776209L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317706584993409L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322280724514063L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315271339582098L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36322873431902255L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.INTENT_MAPPED /* 73 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569947393824L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325712403387290L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72340121281629213L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325712403190680L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325712403125143L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325901381751865L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MARKER_SWAPPED /* 84 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325901381817402L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569947459361L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324595714707283L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ERROR /* 87 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564859133334L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.METHOD_INVOKE /* 88 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176147169007L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FINALLY /* 89 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322873431181351L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324007302417789L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324007303269760L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324007302679934L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.ANIMATION_END /* 93 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324007301893500L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574073679263L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MAIN_COMPLETE /* 95 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574073613726L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.INTERRUPTED /* 96 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146579177L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.NETWORK_FAILED /* 97 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083886545127L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083886348516L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083884841183L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 100:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176145137372L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569948180266L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.LEGACY_MARKER /* 103 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730901018014L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141729465L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176144875225L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317259910687837L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176144416469L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.NEW_START_FOUND /* 111 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176128884332L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MISSED_EVENT /* 112 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176144809688L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 72341353937506908L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.VIDEO_PLAYING /* 116 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322753170720578L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946803993L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317354397019327L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317354397150400L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448793884853L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342165444557358618L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317006506240917L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160015718689675L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160015718755212L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 125:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176136289946L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342157185350049435L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 127:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439569967173L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439575734403L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439569049662L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439578486947L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.APP_MAIN /* 134 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439577438358L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MQTT_CONNECTING /* 135 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564862082480L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MQTT_CONNECTED /* 136 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564858019214L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146775788L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146710251L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146644714L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146448103L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36316426697320494L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.ACTIVITY_RESUME /* 143 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176140943024L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ACTIVITY_START /* 144 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36326429662729843L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176135306897L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.END_START_ACTIVITY /* 146 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141663928L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326528447108778L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.FORMAT_ERROR /* 148 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730900952477L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326528447239852L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141467318L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317354397347010L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176144940762L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.OFFLINE /* 160 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36326764670113603L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ASNYC_FAILED /* 161 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323676588690331L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ASYNC_FAIL /* 162 */:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176144350932L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325300086264402L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176143171274L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.DISPLAYED /* 165 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317006505585552L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176124821072L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142122686L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176124755535L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176125541972L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case ActionId.VIDEO_REQUESTED_PLAYING /* 171 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176139370153L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 172:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574069747081L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 173:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36323255682812350L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 174:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176145202909L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 175:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569947328287L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 176:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569948114729L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 177:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176143040200L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 178:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564859526553L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 181:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730900428185L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 182:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946214165L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 183:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141270707L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 184:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176146841325L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 185:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142843589L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 186:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141336244L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 188:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569944313603L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 189:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945034503L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 191:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176139042472L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 193:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945689871L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 195:
            case 389:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439578814629L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 196:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325849842144291L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 198:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176132488830L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 199:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322564192224923L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 200:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176129539697L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 201:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36323255681829301L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 202:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36323255682156984L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 203:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36323255682615740L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 204:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2378182529199900018L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 205:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564853104004L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 206:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142450370L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 208:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439578028190L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 209:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176147496689L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 210:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176129998453L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 211:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176143630033L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 212:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176127245919L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 213:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176129408623L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 215:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142974663L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 216:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176147562226L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 217:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176147627763L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 219:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176147300080L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 220:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176137141920L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 221:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564859854237L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 222:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564861230505L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 223:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72339511396336988L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 224:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176127573603L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 225:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176143957714L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 227:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943527162L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 228:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569942871796L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 229:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176147955444L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 231:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36317564862148017L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 232:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315511857488915L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 233:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176127966823L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 234:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141860539L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 236:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176143105737L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 237:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36326421073778284L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 238:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176129670770L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 240:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439582222543L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 241:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325493359792897L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 242:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943461625L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 243:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943854846L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 244:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324260704898618L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 246:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324260705422909L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 247:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 36324260705488446L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 248:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564858346896L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 249:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574072958359L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 250:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564858609042L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case Process.SD_BLACK_HOLE /* 253 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36326356648220148L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 254:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176141795002L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 256:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564861754798L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 257:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943723772L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 258:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574075121067L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 259:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943265015L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 260:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569944248066L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 261:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439574620281L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 266:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176137731749L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 267:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342157185345986173L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 268:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326850569459555L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 269:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326356648220148L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 270:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574073351579L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 271:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564858215823L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 272:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342167579158859529L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 273:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176131833468L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 274:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176146382566L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 275:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324630071365488L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 276:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342170048761911215L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 277:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36327039548151726L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 278:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326889224165232L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 279:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569947066141L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 280:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448785561690L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 281:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448785496153L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 282:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448786937963L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 283:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448787003500L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 284:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448785627227L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 285:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448785692764L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 287:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176145792740L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 288:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317259908983889L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 289:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943330552L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 290:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569944510212L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 291:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176135831189L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 292:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322306495432014L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 319:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342157185360207592L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 320:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569947000604L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 324:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322310789350782L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 326:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36315511858275356L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 328:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322310789088637L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 329:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564853890438L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 330:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569942019825L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 331:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569945296651L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 332:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945231114L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 333:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315511857816599L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 334:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159435904788471L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 337:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72339683195357168L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 338:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325845547701277L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 339:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324007303138687L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 340:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176140811950L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 341:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945886482L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 342:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946017556L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 343:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569945952019L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 344:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326270748874119L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 346:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323809733463280L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 347:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 72340473468948233L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 348:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946410774L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 349:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946476311L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 350:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564860247456L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 351:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574074138017L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 352:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564860509602L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 354:
            case 355:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72339477036664057L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 357:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342165444556899860L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 358:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322435343271445L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 359:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448785823838L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH /* 360 */:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342159448787069037L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 361:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439579011240L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 362:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439579076777L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 363:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342167604926172992L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 364:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324595712413503L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 365:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322830480066567L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 366:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36322830480132104L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 367:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 36324982258946290L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 368:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 36324982258880753L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 369:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325222778491366L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 370:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325222778556903L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 374:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325115402867035L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 376:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325115402735962L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 377:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325115402998108L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 379:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 72340842836725994L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 380:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36321567761777154L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 381:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72340366094962287L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 382:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 72340366094831214L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 383:
                mobileConfig3 = this.mAppContext.getMobileConfig();
                j3 = 2342165620651607780L;
                return mobileConfig3.AZs(GetMobileConfigOptions(z2), j3, true);
            case 385:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439577307285L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 386:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439577503895L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 387:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323809732807912L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 388:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36316439572785255L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 390:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324269294112327L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 392:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083884579037L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 393:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730900821403L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 394:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36322873431246888L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 396:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325493359858434L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 397:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325493359923971L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 398:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574072499603L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 399:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574073482652L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 400:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 2342160574073154968L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 401:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569947787044L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 402:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36325669453452162L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 404:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36322521244321416L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 405:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36322521244518025L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 406:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36313209754818466L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 407:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943920383L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 409:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569945558797L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 410:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317354397412547L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 411:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569941823215L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 412:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569947721507L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 413:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569946869530L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 416:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36315730900886940L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 417:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569948311340L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 418:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36314176145006299L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 419:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943789309L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 421:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36324569947655970L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 423:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36326511267501733L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 424:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176137076383L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 425:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083885431008L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 426:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569944116993L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 427:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569944051456L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 428:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083885627617L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 429:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083886479590L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 430:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36323083886086371L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 434:
                mobileConfig2 = this.mAppContext.getMobileConfig();
                j2 = 36326038820705449L;
                return mobileConfig2.AZs(GetMobileConfigOptions(z2), j2, false);
            case 436:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569943068406L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 438:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142909126L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 439:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36324569941888752L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 441:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176142384833L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 443:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146906862L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 444:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176136683166L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 445:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36317564858412433L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 446:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36325252841624055L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
            case 448:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 36314176146120421L;
                return mobileConfig.AZs(GetMobileConfigOptions(z2), j, z);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public double MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetDouble(int i, double d, boolean z) {
        1CO mobileConfig;
        long j;
        double d2;
        switch (i) {
            case 452:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37169540333306597L;
                d2 = 50.0d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            case 453:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37169540333372134L;
                d2 = 50.0d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            case 454:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37169540333044452L;
                d2 = 5.0d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            case 455:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37169540332782307L;
                d2 = 0.5d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            case 456:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37166946174501510L;
                d2 = 2048.0d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            case 457:
                mobileConfig = this.mAppContext.getMobileConfig();
                j = 37166946174567047L;
                d2 = 720.0d;
                return mobileConfig.AiG(GetMobileConfigOptions(z), d2, j);
            default:
                return d;
        }
    }

    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public int MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt32(int i, int i2, boolean z) {
        switch (i) {
            case 459:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278460603L, 0L));
            case 460:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701934430L, i2));
            case 461:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701279066L, i2));
            case 462:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701737820L, i2));
            case 463:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701541211L, i2));
            case 464:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701868893L, i2));
            case 465:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36607964768968606L, 5));
            case 466:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36592386927821526L, 600L));
            case 467:
            case 468:
            case 474:
            case 478:
            case 482:
            case 490:
            case 492:
            case 501:
            case 506:
            case 522:
            case 524:
            case 525:
            case 528:
            case 529:
            case 546:
            case 547:
            case 548:
            case 549:
            default:
                return i2;
            case 469:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651120925416L, 16));
            case 470:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651115813598L, i2));
            case 471:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36604348408076912L, 0L));
            case 472:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36604348408011375L, 10000L));
            case 473:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482280033483L, 2));
            case 475:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279771337L, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED));
            case 476:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279574726L, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED));
            case 477:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278657212L, 10));
            case 479:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279640263L, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED));
            case 480:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279443652L, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED));
            case 481:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278788286L, 30));
            case 483:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279705800L, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED));
            case 484:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482279509189L, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED));
            case 485:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278722749L, 20));
            case 486:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651119352548L, i2));
            case 487:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278067382L, i2));
            case 488:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278329530L, i2));
            case 489:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651102051022L, i2));
            case 491:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651108473558L, i2));
            case 493:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 72622828914016851L, 10));
            case 494:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 72622828914147925L, 30));
            case 495:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 72622828914082388L, 20));
            case 496:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 72622828913951314L, 30));
            case 497:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36608003423739814L, 0L));
            case 498:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36608003424001959L, 0L));
            case 499:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36603755701016921L, i2));
            case 500:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651118893795L, i2));
            case 502:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651103034066L, i2));
            case 503:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278853823L, i2));
            case 504:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651102444241L, i2));
            case 505:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651102378704L, i2));
            case 507:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606044919176519L, i2));
            case 508:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651117910754L, i2));
            case 509:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482280099020L, i2));
            case 510:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482280230093L, i2));
            case 511:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651124464366L, i2));
            case 512:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039829152149L, i2));
            case 513:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36597205877198361L, i2));
            case 514:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651117452000L, i2));
            case 515:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039836754366L, i2));
            case 516:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039836819903L, i2));
            case 517:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039837082049L, i2));
            case 518:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606457235512756L, 1000L));
            case 519:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606457235447219L, 100));
            case 520:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606590379761107L, 1000L));
            case 521:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606590379498962L, 0L));
            case 523:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651114961628L, i2));
            case 526:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651124136685L, i2));
            case 527:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651117189855L, i2));
            case 530:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651120401126L, i2));
            case 531:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651122236138L, i2));
            case 532:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651115354845L, i2));
            case 533:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651117714145L, i2));
            case 534:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482277870771L, i2));
            case 535:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651124071148L, i2));
            case 536:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651121777385L, 1L));
            case 537:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651124857583L, 12));
            case 538:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36598614627127491L, i2));
            case 539:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039835902395L, i2));
            case 540:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039835181497L, i2));
            case 541:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039836099005L, i2));
            case 542:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278001845L, i2));
            case 543:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651110636250L, i2));
            case 544:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36606044919897416L, i2));
            case 545:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651120532199L, 2000L));
            case 550:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278132919L, 20));
            case 551:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278263993L, i2));
            case 552:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36605482278198456L, i2));
            case 553:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36604558862195363L, i2));
            case 554:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36596986834259278L, i2));
            case 555:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651124923120L, i2));
            case 556:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651109784281L, i2));
            case 557:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36595651119418085L, 0L));
            case 558:
                return C21q.A00(this.mAppContext.getMobileConfig().Av8(GetMobileConfigOptions(z), 36599039835705786L, i2));
        }
    }

    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public long MEMMobileConfigPlatformMessengerAndroidImpl_MEMMobileConfigPlatformGetInt64(int i, long j, boolean z) {
        1CO mobileConfig;
        long j2;
        long j3 = j;
        switch (i) {
            case 560:
                mobileConfig = this.mAppContext.getMobileConfig();
                j2 = 36598481483272322L;
                j3 = 30;
                break;
            case 561:
                mobileConfig = this.mAppContext.getMobileConfig();
                j2 = 36595651122367211L;
                break;
            case 562:
                mobileConfig = this.mAppContext.getMobileConfig();
                j2 = 36595651102116559L;
                break;
            case 563:
            case 564:
            default:
                return j;
            case 565:
                mobileConfig = this.mAppContext.getMobileConfig();
                j2 = 36606044922191177L;
                break;
            case 566:
                mobileConfig = this.mAppContext.getMobileConfig();
                j2 = 36599039836033468L;
                break;
        }
        return mobileConfig.Av8(GetMobileConfigOptions(z), j2, j3);
    }

    @Override // com.facebook.messaging.msys.advancedcrypto.mobileconfig.Premailbox
    public void MEMMobileConfigPlatformMessengerAndroidPluginPremailboxExtensionsDestroy() {
    }
}
