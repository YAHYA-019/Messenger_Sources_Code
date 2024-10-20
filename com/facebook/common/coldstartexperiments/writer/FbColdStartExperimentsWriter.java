package com.facebook.common.coldstartexperiments.writer;

import X.1CO;
import X.1Nq;
import X.C0t9;
import X.C1Ur;
import X.C48n;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.LogcatReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: FbColdStartExperimentsWriter.class */
public final class FbColdStartExperimentsWriter implements 1Nq {
    public final AtomicLong A00 = new AtomicLong(Long.MAX_VALUE);

    public static int A00(C0t9 c0t9) {
        String str = c0t9.A22;
        C0t9.A00(str);
        int i = 0;
        if (!"".equals(str)) {
            i = A01(str, 0);
        }
        String str2 = c0t9.A2H;
        C0t9.A00(str2);
        if (!"".equals(str2)) {
            i = A01(str2, i);
        }
        String str3 = c0t9.A2D;
        C0t9.A00(str3);
        if (!"".equals(str3)) {
            i = A01(str3, i);
        }
        String str4 = c0t9.A2L;
        C0t9.A00(str4);
        if (!"".equals(str4)) {
            i = A01(str4, i);
        }
        String str5 = c0t9.A2P;
        C0t9.A00(str5);
        if (!"".equals(str5)) {
            C0t9.A00(str5);
            i += str5.length() + 4;
        }
        String str6 = c0t9.A2S;
        C0t9.A00(str6);
        if (!"".equals(str6)) {
            i = A01(str6, i);
        }
        String str7 = c0t9.A2J;
        C0t9.A00(str7);
        if (!"".equals(str7)) {
            i = A01(str7, i);
        }
        String str8 = c0t9.A2F;
        C0t9.A00(str8);
        if (!"".equals(str8)) {
            i = A01(str8, i);
        }
        String str9 = c0t9.A2N;
        C0t9.A00(str9);
        if (!"".equals(str9)) {
            i = A01(str9, i);
        }
        String str10 = c0t9.A2R;
        C0t9.A00(str10);
        if (!"".equals(str10)) {
            C0t9.A00(str10);
            i += str10.length() + 4;
        }
        String str11 = c0t9.A2U;
        C0t9.A00(str11);
        if (!"".equals(str11)) {
            i = A01(str11, i);
        }
        String str12 = c0t9.A2I;
        C0t9.A00(str12);
        if (!"".equals(str12)) {
            i = A01(str12, i);
        }
        String str13 = c0t9.A2E;
        C0t9.A00(str13);
        if (!"".equals(str13)) {
            i = A01(str13, i);
        }
        String str14 = c0t9.A2M;
        C0t9.A00(str14);
        if (!"".equals(str14)) {
            i = A01(str14, i);
        }
        String str15 = c0t9.A2Q;
        C0t9.A00(str15);
        if (!"".equals(str15)) {
            C0t9.A00(str15);
            i += str15.length() + 4;
        }
        String str16 = c0t9.A2T;
        C0t9.A00(str16);
        if (!"".equals(str16)) {
            i = A01(str16, i);
        }
        String str17 = c0t9.A24;
        C0t9.A00(str17);
        if (!"".equals(str17)) {
            i = A01(str17, i);
        }
        String str18 = c0t9.A2G;
        C0t9.A00(str18);
        if (!"".equals(str18)) {
            i = A01(str18, i);
        }
        String str19 = c0t9.A2C;
        C0t9.A00(str19);
        if (!"".equals(str19)) {
            i = A01(str19, i);
        }
        String str20 = c0t9.A2K;
        C0t9.A00(str20);
        if (!"".equals(str20)) {
            i = A01(str20, i);
        }
        String str21 = c0t9.A2O;
        C0t9.A00(str21);
        if (!"".equals(str21)) {
            C0t9.A00(str21);
            i += str21.length() + 4;
        }
        String str22 = c0t9.A2B;
        C0t9.A00(str22);
        if (!"".equals(str22)) {
            i = A01(str22, i);
        }
        String str23 = c0t9.A23;
        C0t9.A00(str23);
        if (!"".equals(str23)) {
            i = A01(str23, i);
        }
        String str24 = c0t9.A27;
        C0t9.A00(str24);
        if (!"".equals(str24)) {
            i = A01(str24, i);
        }
        String str25 = c0t9.A21;
        C0t9.A00(str25);
        if (!"Set-Cookie".equals(str25)) {
            i = A01(str25, i);
        }
        String str26 = c0t9.A20;
        C0t9.A00(str26);
        if (!"facebook.com,workplace.com,fbpigeon.com,checkout.com".equals(str26)) {
            i = A01(str26, i);
        }
        String str27 = c0t9.A2V;
        C0t9.A00(str27);
        if (!"".equals(str27)) {
            C0t9.A00(str27);
            i += str27.length() + 4;
        }
        String str28 = c0t9.A25;
        C0t9.A00(str28);
        if (!"MQTT_SUBSCRIPTION".equals(str28)) {
            i = A01(str28, i);
        }
        String str29 = c0t9.A26;
        C0t9.A00(str29);
        if (!"MQTT_SUBSCRIPTION".equals(str29)) {
            i = A01(str29, i);
        }
        String str30 = c0t9.A2A;
        C0t9.A00(str30);
        if (!"".equals(str30)) {
            C0t9.A00(str30);
            i += str30.length() + 4;
        }
        String str31 = c0t9.A28;
        C0t9.A00(str31);
        if (!"".equals(str31)) {
            C0t9.A00(str31);
            i += str31.length() + 4;
        }
        String str32 = c0t9.A29;
        C0t9.A00(str32);
        if (!"".equals(str32)) {
            i = A01(str32, i);
        }
        String str33 = c0t9.A2W;
        C0t9.A00(str33);
        if (!"https://lookaside.facebook.com/ras/v2/?id=".equals(str33)) {
            C0t9.A00(str33);
            i += str33.length() + 4;
        }
        String str34 = c0t9.A2X;
        C0t9.A00(str34);
        if (!"\"[]\"".equals(str34)) {
            i = A01(str34, i);
        }
        String str35 = c0t9.A2Y;
        C0t9.A00(str35);
        if (!"video_upload_android:ta".equals(str35)) {
            i = A01(str35, i);
        }
        return i + 3297;
    }

    public static int A01(String str, int i) {
        C0t9.A00(str);
        return i + str.length() + 4;
    }

    public static long A02(int i) {
        switch (i) {
            case 0:
                return -2688148380454997863L;
            case 1:
                return 8401887318822129211L;
            case 2:
                return -210475169871049954L;
            case 3:
                return 6442496921193421486L;
            case 4:
                return 362257796799702598L;
            case 5:
                return 4306135787878922396L;
            case 6:
                return 2912210205304751019L;
            case 7:
                return 7077860196793471229L;
            case 8:
                return 339310710321788400L;
            case 9:
                return 2806836656890544475L;
            case 10:
                return -137829240979293785L;
            case 11:
                return -2932774146102555269L;
            case 12:
                return 8436837968335811150L;
            case 13:
                return -8756007993374065902L;
            case 14:
                return -2091725282598161141L;
            case 15:
                return -6933452518549216388L;
            case 16:
                return 2166252541612170206L;
            case 17:
                return 5969427746668099751L;
            case 18:
                return 9212957301116228287L;
            case 19:
                return -7634054336182311410L;
            case 20:
                return 4643125208563547763L;
            case 21:
                return 1006598025138116476L;
            case 22:
                return 2169649446685439159L;
            case 23:
                return -138942956339129109L;
            case 24:
                return 6688413800631501113L;
            case 25:
                return -1852141889462922943L;
            case 26:
                return -4926584315995591366L;
            case 27:
                return -1195792052354081993L;
            case 28:
                return -8406697211419845291L;
            case 29:
                return -1993978049231512059L;
            case 30:
                return 168466351560652875L;
            case 31:
                return -8599235174849672351L;
            case 32:
                return 3667787223719726744L;
            case 33:
                return 6768695677607307070L;
            case 34:
                return -8208891444177755247L;
            case 35:
                return 7922652166832625059L;
            case 36:
                return 7688435236467249480L;
            case 37:
                return -3334950860312101099L;
            case 38:
                return -2010733959948944942L;
            case 39:
                return 5478524062589969846L;
            case 40:
                return 1791048575969367842L;
            case 41:
                return -5468848175129591919L;
            case 42:
                return 7699390826305606268L;
            case 43:
                return 4509415096358105696L;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 8868251715536373361L;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 7905645201597302527L;
            case 46:
                return 110208638277501309L;
            case ActionId.ON_START_END /* 47 */:
                return 617187852622706769L;
            case ActionId.QUEUED /* 48 */:
                return 2502824363035215693L;
            case ActionId.IN_PROGRESS /* 49 */:
                return -2763298664258039798L;
            case 50:
                return -3419306254743647499L;
            case ActionId.UNKNOWN /* 51 */:
                return -7335396686563872899L;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return 8107811979339767379L;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return -5244197141553652749L;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return 6750773842625313555L;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return -8526140210461159865L;
            case ActionId.QUEUEING_FAIL /* 56 */:
                return 7673243548262305634L;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return 8433120198057474408L;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return 5755023788225615424L;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return -6190910616859713991L;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return 3724130296146789317L;
            case ActionId.COUNTER /* 61 */:
                return 4697116129133824366L;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return 7111078069183774173L;
            case 63:
                return 1043707389201318357L;
            case 64:
                return 823911319156274940L;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return 963434059746326141L;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return 7371491894232696642L;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return 8252203198974731712L;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return 4447257628074390407L;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return -513711639781500031L;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return 7438635554202058358L;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                return 3175039823633197477L;
            default:
                throw new RuntimeException("Error in mobile config indexes");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0t9, java.lang.Object] */
    public static C0t9 A03(1CO r301, 1CO r302, 1CO r303) {
        ?? obj = new Object();
        obj.A4B = r302.AZk(18302934413421744L);
        obj.A1f = r302.Auy(18584409390190934L);
        obj.A6m = r302.AZk(18302934412897451L);
        obj.A5d = r302.AZk(18302934413880498L);
        obj.A22 = r301.BCy(36875025835426230L);
        obj.A2v = r301.AZk(36312075882073944L);
        obj.A2w = r301.AZk(36311629205670956L);
        obj.A0N = C1Ur.A00(r301, 0, 36593104184542243L);
        obj.A0M = C1Ur.A00(r301, 0, 36593104184673316L);
        obj.A1e = r301.Auy(36593104185132069L);
        obj.A5X = r301.AZk(36326781849982792L);
        obj.A5s = r301.AZk(36317414527347953L);
        obj.A7y = r301.AZk(36317414528331004L);
        obj.A7q = r301.AZk(36317414528134393L);
        obj.A7u = r301.AZk(36317414528199930L);
        obj.A7a = r301.AZk(36317414527872245L);
        obj.A7e = r301.AZk(36317414527937782L);
        obj.A7l = r301.AZk(36317414528003319L);
        obj.A7i = r301.AZk(36317414528068856L);
        obj.A3R = r301.AZk(36317414527216880L);
        obj.A6C = r301.AZk(36317414527675635L);
        obj.A4l = r301.AZk(36317414526364901L);
        obj.A4x = r301.AZk(36317414526561512L);
        obj.A4p = r301.AZk(36317414526430438L);
        obj.A4h = r301.AZk(36317414526299364L);
        obj.A4t = r301.AZk(36317414526495975L);
        obj.A55 = r301.AZk(36317414526627049L);
        obj.A5O = r301.AZk(36317414526823660L);
        obj.A5E = r301.AZk(36317414526692586L);
        obj.A5J = r301.AZk(36317414526758123L);
        obj.A6j = r301.AZk(36317414529248514L);
        obj.A5v = r301.AZk(36317414527413490L);
        obj.A5T = r301.AZk(36317414526954734L);
        obj.A6V = r301.AZk(36317414528593150L);
        obj.A8X = r301.AZk(36317414529051904L);
        obj.A6R = r301.AZk(36317414528396541L);
        obj.A1O = C1Ur.A00(r301, 25, 36598889505165681L);
        obj.A1S = C1Ur.A00(r301, 5, 36598889505231218L);
        obj.A8n = r301.AZk(36317414529117441L);
        obj.A96 = r301.AZk(2342160423741959419L);
        obj.A6L = r301.AZk(36317414527806708L);
        obj.A0b = C1Ur.A00(r301, 2, 36598889504182638L);
        obj.A0f = C1Ur.A00(r301, 5, 36598889504248175L);
        obj.A0j = C1Ur.A00(r301, 10, 36598889504313712L);
        obj.A0V = C1Ur.A00(r301, 0, 36598889503723885L);
        obj.A2y = r301.AZk(36317414526889197L);
        obj.A6Z = r301.AZk(36317414528855295L);
        obj.A2H = r301.BCy(36880364482200558L);
        obj.A2D = r301.BCy(36880364482135021L);
        obj.A2L = r301.BCy(36880364482331631L);
        obj.A2P = r301.BCy(36880364482397168L);
        obj.A2S = r301.BCy(36880364482069484L);
        obj.A5t = r301.AZk(2342156094413084248L);
        obj.A3B = r301.AZk(36313085207189136L);
        obj.A6o = r301.AZk(36313085206075019L);
        obj.A6q = r301.AZk(36313085208106646L);
        obj.A15 = C1Ur.A00(r301, 0, 36594560185010317L);
        obj.A17 = C1Ur.A00(r301, 0, 36594560184879244L);
        obj.A8r = r301.AZk(36313085206599309L);
        obj.A80 = r301.AZk(2342156094413543006L);
        obj.A7s = r301.AZk(2342156094413411932L);
        obj.A0E = C1Ur.A00(r301, 0, 36594560183044227L);
        obj.A7w = r301.AZk(2342156094413477469L);
        obj.A0H = C1Ur.A00(r301, 0, 36594560182847616L);
        obj.A7c = r301.AZk(36313085200242276L);
        obj.A7g = r301.AZk(36313085199521369L);
        obj.A05 = C1Ur.A00(r301, 0, 36594560183240837L);
        obj.A7n = r301.AZk(36313085199652443L);
        obj.A08 = C1Ur.A00(r301, 0, 36594560182913153L);
        obj.A84 = r301.AZk(36313085206402700L);
        obj.A1M = C1Ur.A00(r301, 0, 36594560183175300L);
        obj.A7o = r301.AZk(36313085199586906L);
        obj.A0B = C1Ur.A00(r301, 0, 36594560182978690L);
        obj.A3T = r301.AZk(36313085200307813L);
        obj.A0t = C1Ur.A00(r301, 0, 36594560179767418L);
        obj.A6E = r301.AZk(36313085202994809L);
        obj.A0s = C1Ur.A00(r301, 0, 36594560179570809L);
        obj.A6H = r301.AZk(36313085202929272L);
        obj.A6F = r301.AZk(36313085203125882L);
        obj.A5Z = r301.AZk(36313085199324759L);
        obj.A4n = r301.AZk(36313085199980128L);
        obj.A4z = r301.AZk(36313085200176739L);
        obj.A4r = r301.AZk(36313085200045665L);
        obj.A4j = r301.AZk(36313085199914591L);
        obj.A4v = r301.AZk(36313085200111202L);
        obj.A57 = r301.AZk(36313085201290862L);
        obj.A5A = r301.AZk(36313085205288579L);
        obj.A5Q = r301.AZk(36313085201487473L);
        obj.A5G = r301.AZk(36313085201356399L);
        obj.A5L = r301.AZk(36313085201421936L);
        obj.A6l = r301.AZk(2342156094414067302L);
        obj.A5x = r301.AZk(36313085200504423L);
        obj.A5V = r301.AZk(36313085200569960L);
        obj.A6X = r301.AZk(36313085200766569L);
        obj.A8Z = r301.AZk(36313085200832106L);
        obj.A6T = r301.AZk(36313085200897643L);
        obj.A1Q = C1Ur.A00(r301, 25, 36594560177670259L);
        obj.A1U = C1Ur.A00(r301, 5, 36594560177735796L);
        obj.A8p = r301.AZk(36313085201094252L);
        obj.A98 = r301.AZk(2342156094414853741L);
        obj.A6N = r301.AZk(36313085201553010L);
        obj.A89 = r301.AZk(36313085201880691L);
        obj.A0d = C1Ur.A00(r301, 2, 36594560178653301L);
        obj.A0h = C1Ur.A00(r301, 5, 36594560178718838L);
        obj.A0l = C1Ur.A00(r301, 10, 36594560178784375L);
        obj.A4V = r301.AZk(36313085202273908L);
        obj.A0X = C1Ur.A00(r301, 0, 36594560179112056L);
        obj.A30 = r301.AZk(36313085202339445L);
        obj.A8l = r301.AZk(36313085202732662L);
        obj.A5k = r301.AZk(36313085202798199L);
        obj.A6b = r301.AZk(36313085203322491L);
        obj.A2J = r301.BCy(36876035157394010L);
        obj.A2F = r301.BCy(36876035157459547L);
        obj.A2N = r301.BCy(36876035156673111L);
        obj.A2R = r301.BCy(36876035156804184L);
        obj.A2U = r301.BCy(36876035156869721L);
        obj.A8c = r301.AZk(36313085203650172L);
        obj.A65 = r301.AZk(2342156094417868414L);
        obj.A67 = r301.AZk(36313085204239999L);
        obj.A1k = r301.Auy(36594560180815995L);
        obj.A0q = C1Ur.A00(r301, 0, 36594560181274748L);
        obj.A19 = C1Ur.A00(r301, 0, 36594560181340285L);
        obj.A1E = C1Ur.A00(r301, 30, 36594560181405822L);
        obj.A7B = r301.AZk(2342156094418589312L);
        obj.A3q = r301.AZk(36313085204960897L);
        obj.A6y = r301.AZk(36313085205223042L);
        obj.A79 = r301.AZk(36313085205354116L);
        obj.A2k = r301.AZk(36313085205419653L);
        obj.A2d = r301.AZk(36313085205550726L);
        obj.A2s = r301.AZk(36313085205681799L);
        obj.A8S = r301.AZk(36313085205747336L);
        obj.A0R = C1Ur.A00(r301, 0, 36594560182585471L);
        obj.A9A = r301.AZk(36313085205943945L);
        obj.A3v = r301.AZk(36313085206009482L);
        obj.A1c = C1Ur.A00(r301, 0, 36594560183437446L);
        obj.A94 = r301.AZk(36313085207320209L);
        obj.A8Q = r301.AZk(36313085207385746L);
        obj.A9l = r301.AZk(36313085207451283L);
        obj.A4H = r301.AZk(36313085207647893L);
        obj.A0o = C1Ur.A00(r301, 0, 36594560184289419L);
        obj.A9F = r301.AZk(36313085207516820L);
        obj.A7z = r301.AZk(36315563397358758L);
        obj.A7r = r301.AZk(36315563397162147L);
        obj.A0D = C1Ur.A00(r301, 0, 36597038376095112L);
        obj.A7v = r301.AZk(36315563397227684L);
        obj.A0G = C1Ur.A00(r301, 0, 36597038375898501L);
        obj.A7b = r301.AZk(36315563396899999L);
        obj.A7f = r301.AZk(36315563396965536L);
        obj.A04 = C1Ur.A00(r301, 0, 36597038376160649L);
        obj.A7m = r301.AZk(36315563397031073L);
        obj.A07 = C1Ur.A00(r301, 0, 36597038375964038L);
        obj.A7j = r301.AZk(36315563397096610L);
        obj.A0A = C1Ur.A00(r301, 0, 36597038376029575L);
        obj.A3S = r301.AZk(36315563396244635L);
        obj.A11 = C1Ur.A00(r301, 1, 36597038375570819L);
        obj.A6D = r301.AZk(36315563396703389L);
        obj.A4m = r301.AZk(36315563395458193L);
        obj.A4y = r301.AZk(36315563395654804L);
        obj.A4q = r301.AZk(36315563395523730L);
        obj.A4i = r301.AZk(36315563395392656L);
        obj.A4u = r301.AZk(36315563395589267L);
        obj.A56 = r301.AZk(36315563395785877L);
        obj.A59 = r301.AZk(36315563398800559L);
        obj.A5P = r301.AZk(36315563395982488L);
        obj.A5F = r301.AZk(36315563395851414L);
        obj.A5K = r301.AZk(36315563395916951L);
        obj.A6k = r301.AZk(36315563398145196L);
        obj.A5w = r301.AZk(36315563396441244L);
        obj.A5U = r301.AZk(36315563396113562L);
        obj.A5z = r301.AZk(36315563399521457L);
        obj.A6d = r301.AZk(36315563398079659L);
        obj.A6W = r301.AZk(36315563397620904L);
        obj.A8Y = r301.AZk(36315563397948585L);
        obj.A6S = r301.AZk(36315563397424295L);
        obj.A1P = C1Ur.A00(r301, 25, 36597038374194561L);
        obj.A1T = C1Ur.A00(r301, 5, 36597038374260098L);
        obj.A8o = r301.AZk(36315563398014122L);
        obj.A8k = r301.AZk(36315563399652530L);
        obj.A97 = r301.AZk(2342158572610987173L);
        obj.A6M = r301.AZk(36315563396834462L);
        obj.A0c = C1Ur.A00(r301, 2, 36597038373211518L);
        obj.A0g = C1Ur.A00(r301, 5, 36597038373277055L);
        obj.A0k = C1Ur.A00(r301, 10, 36597038373342592L);
        obj.A0W = C1Ur.A00(r301, 0, 36597038372883837L);
        obj.A2z = r301.AZk(36315563396048025L);
        obj.A6a = r301.AZk(36315563398210733L);
        obj.A2I = r301.BCy(36878513352016744L);
        obj.A2E = r301.BCy(36878513352082281L);
        obj.A2M = r301.BCy(36878513351689061L);
        obj.A2Q = r301.BCy(36878513351754598L);
        obj.A2T = r301.BCy(36878513351820135L);
        obj.A24 = r301.BCy(36878513352475498L);
        obj.A0T = C1Ur.A00(r301, 0, 36597038375701892L);
        obj.A5C = r301.AZk(36315563399128240L);
        obj.A4M = r301.AZk(2342155926909490324L);
        obj.A4L = r301.AZk(2342155926909424787L);
        obj.A4N = r301.AZk(36312917695927446L);
        obj.A4S = r301.AZk(36312917695861909L);
        obj.A4P = r301.AZk(36312917695992983L);
        obj.A0P = C1Ur.A00(r301, 1, 36594392672765953L);
        obj.A4J = r301.AZk(36312917696320665L);
        obj.A4K = r301.AZk(2342155926910080154L);
        obj.A4R = r301.AZk(2342155926910145691L);
        obj.A4Q = r301.AZk(2342155926910211228L);
        obj.A4O = r301.AZk(2342155926910276765L);
        obj.A4T = r301.AZk(2342155926910342302L);
        obj.A4I = r301.AZk(36312917696255128L);
        obj.A1Y = C1Ur.A00(r302, -1, 18593583439290271L);
        obj.A71 = r301.AZm(C48n.A00);
        obj.A5r = r301.AZk(2342155514592891466L);
        obj.A3A = r301.AZk(36312505391780523L);
        obj.A6n = r301.AZk(36312505389879971L);
        obj.A6p = r301.AZk(36312505392501429L);
        obj.A14 = C1Ur.A00(r301, 0, 36593980369471262L);
        obj.A16 = C1Ur.A00(r301, 0, 36593980369274653L);
        obj.A7x = r301.AZk(2342155514593350225L);
        obj.A7h = r301.AZk(36312505379394125L);
        obj.A09 = C1Ur.A00(r301, 0, 36593980367374099L);
        obj.A7p = r301.AZk(2342155514593219151L);
        obj.A0C = C1Ur.A00(r301, 0, 36593980367701783L);
        obj.A7t = r301.AZk(2342155514593284688L);
        obj.A0F = C1Ur.A00(r301, 0, 36593980367636246L);
        obj.A3Q = r301.AZk(36312505380115032L);
        obj.A7Z = r301.AZk(2342155514593743447L);
        obj.A7d = r301.AZk(36312505379328588L);
        obj.A03 = C1Ur.A00(r301, 0, 36593980367570709L);
        obj.A7k = r301.AZk(36312505379459662L);
        obj.A06 = C1Ur.A00(r301, 0, 36593980367243026L);
        obj.A83 = r301.AZk(36312505390076581L);
        obj.A1L = C1Ur.A00(r301, 0, 36593980367505172L);
        obj.A68 = r301.AZk(36312505384768123L);
        obj.A6A = r301.AZk(36312505384440441L);
        obj.A6B = r301.AZk(2342155514592957003L);
        obj.A6G = r301.AZk(2342155514597806710L);
        obj.A4k = r301.AZk(36312505379787347L);
        obj.A4w = r301.AZk(36312505379983958L);
        obj.A4o = r301.AZk(36312505379852884L);
        obj.A4g = r301.AZk(36312505379721810L);
        obj.A4s = r301.AZk(36312505379918421L);
        obj.A6i = r301.AZk(2342155514593940058L);
        obj.A6f = r301.AZk(36312505383981685L);
        obj.A6I = r301.AZk(36312505380180569L);
        obj.A5u = r301.AZk(36312505380573790L);
        obj.A2i = r301.AZk(36312505380311643L);
        obj.A9D = r301.AZk(36312505380377180L);
        obj.A8U = r301.AZk(36312505380442717L);
        obj.A5S = r301.AZk(36312505380639327L);
        obj.A6U = r301.AZk(36312505380835936L);
        obj.A54 = r301.AZk(36312505381229156L);
        obj.A58 = r301.AZk(36312505386930823L);
        obj.A5N = r301.AZk(36312505381360230L);
        obj.A5H = r301.AZk(2342155514605605549L);
        obj.A5D = r301.AZk(36312505381163619L);
        obj.A5I = r301.AZk(36312505381294693L);
        obj.A5B = r301.AZk(36312505386865286L);
        obj.A5M = r301.AZk(36312505387061897L);
        obj.A8T = r301.AZk(36312505380967009L);
        obj.A5l = r301.AZk(36312505381032546L);
        obj.A8j = r301.AZk(36312505381425767L);
        obj.A8i = r301.AZk(36312505392698038L);
        obj.A8W = r301.AZk(36312505381491304L);
        obj.A6Q = r301.AZk(36312505381556841L);
        obj.A1N = C1Ur.A00(r301, 25, 36593980358330101L);
        obj.A1R = C1Ur.A00(r301, 5, 36593980358395638L);
        obj.A8m = r301.AZk(36312505381753450L);
        obj.A95 = r301.AZk(36312505381818987L);
        obj.A3z = r301.AZk(36312505381950060L);
        obj.A6K = r301.AZk(36312505382015597L);
        obj.A5q = r301.AZk(36312505382146670L);
        obj.A5a = r301.AZk(36312505382277743L);
        obj.A1B = C1Ur.A00(r301, 200, 36593980359182071L);
        obj.A88 = r301.AZk(36312505382539888L);
        obj.A0a = C1Ur.A00(r301, 2, 36593980359378680L);
        obj.A0e = C1Ur.A00(r301, 5, 36593980359444217L);
        obj.A0i = C1Ur.A00(r301, 10, 36593980359509754L);
        obj.A5W = r301.AZk(36312505382933105L);
        obj.A0U = C1Ur.A00(r301, 120000, 36593980359706363L);
        obj.A2x = r301.AZk(2342155514596758130L);
        obj.A1m = r301.Auy(36593980359968508L);
        obj.A5p = r301.AZk(36312505383588467L);
        obj.A5o = r301.AZk(36312505385292414L);
        obj.A5j = r301.AZk(2342155514597479028L);
        obj.A0p = C1Ur.A00(r301, 0, 36593980360623870L);
        obj.A6Y = r301.AZk(36312505384571514L);
        obj.A2G = r301.BCy(36875455338906097L);
        obj.A2C = r301.BCy(36875455338971634L);
        obj.A2K = r301.BCy(36875455337923054L);
        obj.A2O = r301.BCy(36875455338054127L);
        obj.A2B = r301.BCy(36875455338119664L);
        obj.A18 = C1Ur.A00(r301, 0, 36593980361672449L);
        obj.A8H = r301.AZk(36312505385030268L);
        obj.A7A = r301.AZk(2342155514598855293L);
        obj.A2t = r301.AZk(36312505385357951L);
        obj.A02 = C1Ur.A00(r301, 30000, 36593980362327810L);
        obj.A64 = r301.AZk(2342155514599445120L);
        obj.A66 = r301.AZk(36312505386013313L);
        obj.A1j = r301.Auy(36593980362393347L);
        obj.A0y = C1Ur.A00(r301, 500, 36593980362524420L);
        obj.A01 = C1Ur.A00(r301, 30000, 36593980362589957L);
        obj.A9g = r301.AZk(36312505386078850L);
        obj.A8M = r301.AZk(36312505386209923L);
        obj.A1D = C1Ur.A00(r301, 30, 36593980362983174L);
        obj.A1K = C1Ur.A00(r301, 100, 36593980363179783L);
        obj.A8K = r301.AZk(36312505387324043L);
        obj.A8J = r301.AZk(36312505386734212L);
        obj.A2j = r301.AZk(36312505387192970L);
        obj.A2p = r301.AZk(36312505387520654L);
        obj.A2u = r301.AZk(36312505386799749L);
        obj.A8d = r301.AZk(36312505387389580L);
        obj.A5y = r301.AZk(36312505387455117L);
        obj.A0J = C1Ur.A00(r301, -4, 36593980364293896L);
        obj.A2e = r301.AZk(36312505387651727L);
        obj.A6v = r301.AZk(36312505387782800L);
        obj.A1g = r301.Auy(36593980364556041L);
        obj.A8L = r301.AZk(36312505387913873L);
        obj.A23 = r301.BCy(36875455341396467L);
        obj.A8s = r301.AZk(2342155514601738898L);
        obj.A8g = r301.AZk(36312505388110483L);
        obj.A0S = C1Ur.A00(r301, 0, 36593980364949258L);
        obj.A0Z = C1Ur.A00(r301, 0, 36593980365014795L);
        obj.A2q = r301.AZk(36312505388438165L);
        obj.A0z = C1Ur.A00(r301, 0, 36593980365211404L);
        obj.A8q = r301.AZk(36312505388569238L);
        obj.A82 = r301.AZk(36312505388634775L);
        obj.A9I = r301.AZk(36312505388700312L);
        obj.A8w = r301.AZk(36312505388765849L);
        obj.A0Y = C1Ur.A00(r301, 0, 36593980365539085L);
        obj.A8x = r301.AZk(36312505388896922L);
        obj.A90 = r301.AZk(36312505388962459L);
        obj.A92 = r301.AZk(36312505389027996L);
        obj.A9Q = r301.AZk(36312505388372628L);
        obj.A9Y = r301.AZk(36312505389093533L);
        obj.A2r = r301.AZk(36312505389159070L);
        obj.A8R = r301.AZk(36312505389224607L);
        obj.A0n = C1Ur.A00(r301, 0, 36593980365997838L);
        obj.A9E = r301.AZk(36312505389355680L);
        obj.A0r = C1Ur.A00(r301, 0, 36593980366128911L);
        obj.A8z = r301.AZk(36312505389486753L);
        obj.A0Q = C1Ur.A00(r301, 0, 36593980366325520L);
        obj.A1d = C1Ur.A00(r301, 2, 36593980366456593L);
        obj.A3u = r301.AZk(36312505389814434L);
        obj.A99 = r301.AZk(36312505389945508L);
        obj.A8P = r301.AZk(36312505391059622L);
        obj.A1b = C1Ur.A00(r301, 0, 36593980367832856L);
        obj.A9k = r301.AZk(36312505391256232L);
        obj.A9r = r301.AZk(36312505391321769L);
        obj.A4G = r301.AZk(36312505392042671L);
        obj.A93 = r301.AZk(36312505391846060L);
        obj.A3W = r301.AZk(36312505391977134L);
        obj.A9b = r301.AZk(36312505392108208L);
        obj.A4c = r301.AZk(36312505392173745L);
        obj.A4b = r301.AZk(36312505392239282L);
        obj.A8y = r301.AZk(36312505392304819L);
        obj.A9G = r301.AZk(36312505392370356L);
        obj.A3N = r301.AZk(36322920674445394L);
        obj.A3L = r301.AZk(36322920675035219L);
        obj.A9e = r301.AZk(36322920675428437L);
        obj.A3k = r302.AZk(18310257331687286L);
        obj.A3D = r302.AZk(18310257331752823L);
        obj.A8A = r302.AZk(18310257331818360L);
        obj.A5c = r301.AZk(2342160651374702135L);
        obj.A9a = r301.AZk(36317642162843203L);
        obj.A3e = r301.AZk(2342160651374439990L);
        obj.A47 = r301.AZk(2342160651376471618L);
        obj.A3j = r301.AZk(36317642163891789L);
        obj.A3t = r301.AZk(36317642163957326L);
        obj.A4A = r301.AZk(36317642164153936L);
        obj.A1a = C1Ur.A00(r301, 300, 36599490798424686L);
        obj.A9f = r301.AZk(36318015822114792L);
        obj.A1i = r301.Auy(36599490798621296L);
        obj.A0m = C1Ur.A00(r301, 3, 36599490798555759L);
        obj.A9H = r301.AZk(36318015822180329L);
        obj.A8h = r301.AZk(2342161025036005354L);
        obj.A12 = C1Ur.A00(r301, 5, 36599490798948977L);
        obj.A8v = r301.AZk(36318015822442475L);
        obj.A8t = r301.AZk(36318015822508012L);
        obj.A8u = r301.AZk(36318015822573549L);
        obj.A8f = r301.AZk(36318015822704623L);
        obj.A6h = r302.AZk(18304875737659245L);
        obj.A49 = r301.AZk(36322632911570665L);
        obj.A9n = r301.AZk(36322632912619243L);
        obj.A5i = r302.AZk(18309965273910903L);
        obj.A9W = r301.AZk(36316619965016376L);
        obj.A60 = r301.AZk(36320579917200923L);
        obj.A50 = r301.AZk(2342163589130960412L);
        obj.A4f = r301.AZk(36320579917331997L);
        obj.A3m = r301.AZk(36321013708898183L);
        obj.A75 = r301.AZk(36321013708963720L);
        obj.A73 = r301.AZk(36321013709029257L);
        obj.A77 = r301.AZk(36321013709094794L);
        obj.A3o = r301.AZk(36321013709488011L);
        obj.A9J = r301.AZk(36321013709684620L);
        obj.A3f = r301.AZk(2342160256236268613L);
        obj.A74 = r301.AZk(2342160256236465224L);
        obj.A72 = r301.AZk(2342160256236334150L);
        obj.A76 = r301.AZk(2342160256236530761L);
        obj.A3n = r301.AZk(36317247023754314L);
        obj.A9B = r301.AZk(36317247023885387L);
        obj.A2Z = r301.AZk(36317247023950924L);
        obj.A27 = r301.BCy(36876915622019835L);
        obj.A6u = r301.AZk(36314163236118064L);
        obj.A7G = r301.AZk(36316207640749903L);
        obj.A0x = C1Ur.A00(r301, LogcatReader.DEFAULT_WAIT_TIME, 36597682617519827L);
        obj.A0u = C1Ur.A00(r301, LogcatReader.DEFAULT_WAIT_TIME, 36597682617585364L);
        obj.A0v = C1Ur.A00(r301, LogcatReader.DEFAULT_WAIT_TIME, 36597682617650901L);
        obj.A0w = C1Ur.A00(r301, LogcatReader.DEFAULT_WAIT_TIME, 36597682617716438L);
        obj.A4W = r301.AZk(36316207641077584L);
        obj.A3x = r301.AZk(36320279272963306L);
        obj.A4a = r301.AZk(36314206185791245L);
        obj.A3Y = r301.AZk(36314206187167504L);
        obj.A8e = r301.AZk(36314206187233041L);
        obj.A46 = r301.AZk(36314206187364114L);
        obj.A6r = r301.AZk(36314206187495187L);
        obj.A3d = r301.AZk(36314206187626260L);
        obj.A7W = r301.AZk(36314206187757333L);
        obj.A9m = r301.AZk(36314206187822870L);
        obj.A9V = r301.AZk(36314206187888407L);
        obj.A9X = r301.AZk(36314206187953944L);
        obj.A9M = r301.AZk(36314206188019481L);
        obj.A7J = r301.AZk(36314206188085018L);
        obj.A4Z = r301.AZk(36314206188150555L);
        obj.A48 = r301.AZk(36314206188216092L);
        obj.A6z = r301.AZk(36313123854096139L);
        obj.A1H = C1Ur.A00(r301, 19, 36592249484870178L);
        obj.A9i = r301.AZk(36310774508291198L);
        obj.A6w = r301.AZk(2342153783722050687L);
        obj.A0K = C1Ur.A00(r301, 10, 36592249485132323L);
        obj.A1n = r301.Auy(36592249485197860L);
        obj.A1o = r301.Auy(36592249485263397L);
        obj.A1A = C1Ur.A00(r301, 0, 36592249485328934L);
        obj.A45 = r301.AZk(36310774508749952L);
        obj.A21 = r301.BCy(36884380274132421L);
        obj.A2b = r301.AZk(2342162554044233879L);
        obj.A7V = r301.AZk(2342162554043775125L);
        obj.A20 = r301.BCy(36882494783882378L);
        obj.A9P = r301.AZk(2342162554043971734L);
        obj.A3Z = r301.AZk(36314146056248864L);
        obj.A6J = r301.AZk(36321911357064109L);
        obj.A9h = r301.AZk(2342164920570889134L);
        obj.A8V = r301.AZk(2342164920570954671L);
        obj.A1z = r301.Auy(36603386334091421L);
        obj.A2V = r301.BCy(36881408157090870L);
        obj.A8b = r301.AZk(36316138921142060L);
        obj.A8a = r302.AZk(18301194950812869L);
        obj.A70 = r302.AZk(18312606678800292L);
        obj.A1h = r301.Auy(36605705616170237L);
        obj.A37 = r301.AZk(36326910699001723L);
        obj.A7E = r301.AZk(36326910699198332L);
        obj.A7F = r301.AZk(36326910699263869L);
        obj.A7L = r301.AZk(36321310061904063L);
        obj.A1J = C1Ur.A00(r301, 0, 36602785038669692L);
        obj.A1I = C1Ur.A00(r301, 0, 36602785039587199L);
        obj.A7K = r301.AZk(36321310062493888L);
        obj.A1v = r301.Auy(36602785039259517L);
        obj.A1x = r301.Auy(36602785039390590L);
        obj.A1y = r301.Auy(36602785039652736L);
        obj.A9L = r301.AZk(36315580575917248L);
        obj.A2h = r301.AZk(36315580575982785L);
        obj.A2g = r301.AZk(36315580575786175L);
        obj.A4e = r301.AZk(36315580576113858L);
        obj.A25 = r301.BCy(36876692283785962L);
        obj.A26 = r301.BCy(36876692283720425L);
        obj.A44 = r301.AZk(36319046613874241L);
        obj.A5e = r301.AZk(36319488995571813L);
        obj.A5f = r301.AZk(36319488995637350L);
        obj.A5g = r301.AZk(36319488995702887L);
        obj.A61 = r301.AZk(36319484700604511L);
        obj.A62 = r301.AZk(36319484700670048L);
        obj.A63 = r301.AZk(36319484700735585L);
        obj.A3r = r301.AZk(36319484700932194L);
        obj.A6P = r301.AZk(36319484700997731L);
        obj.A2a = r301.AZk(36319484701063268L);
        obj.A4E = r301.AZk(2342164276325859470L);
        obj.A4F = r301.AZk(2342164276325925007L);
        obj.A6t = r301.AZk(2342164276325990544L);
        obj.A78 = r301.AZk(2342164276326056081L);
        obj.A9N = r301.AZk(2342164276326121618L);
        obj.A9q = r301.AZk(2342164276326318227L);
        obj.A7X = r301.AZk(36322589962946249L);
        obj.A6e = r303.AZk(72339739029735520L);
        obj.A9d = r303.AZk(72339739029801057L);
        obj.A5h = r301.AZk(36311951328349959L);
        obj.A69 = r301.AZk(36311951328481032L);
        obj.A2A = r301.BCy(36874901281833390L);
        obj.A52 = r301.AZk(36311951328612105L);
        obj.A28 = r301.BCy(36874901282226607L);
        obj.A29 = r301.BCy(36874901282292144L);
        obj.A5Y = r301.AZk(36311951329398539L);
        obj.A1l = r301.Auy(36593426305844531L);
        obj.A10 = C1Ur.A00(r301, 3, 36593426305910068L);
        obj.A4U = r301.AZk(36311951329922830L);
        obj.A85 = r301.AZk(36311384393255716L);
        obj.A9C = r303.AZk(2378183843459961059L);
        obj.A5b = r301.AZk(36320558442364438L);
        obj.A3s = r301.AZk(36311865469308592L);
        obj.A6O = r301.AZk(36316083086436041L);
        obj.A53 = r301.AZk(36316083086698187L);
        obj.A5m = r301.AZk(36316083086763724L);
        obj.A9Z = r301.AZk(36316083086501578L);
        obj.A2l = r301.AZk(36321271411327125L);
        obj.A1V = C1Ur.A00(r301, 1800000, 36602746385012585L);
        obj.A1w = r301.Auy(36602746387896170L);
        obj.A7H = r301.AZk(36321271409426580L);
        obj.A2n = r301.AZk(36321271411589271L);
        obj.A3G = r301.AZk(36324690201169829L);
        obj.A4C = r301.AZk(36324690201431975L);
        obj.A4D = r301.AZk(36324690203004851L);
        obj.A6x = r301.AZk(36324690202546096L);
        obj.A31 = r301.AZk(36324690203987899L);
        obj.A8F = r301.AZk(36324690204774342L);
        obj.A32 = r301.AZk(36324690204184510L);
        obj.A33 = r301.AZk(36324690204446657L);
        obj.A7O = r301.AZk(36324690201563048L);
        obj.A91 = r301.AZk(36324690201628585L);
        obj.A7D = r301.AZk(36324690201956267L);
        obj.A9O = r301.AZk(36324690202021804L);
        obj.A2c = r301.AZk(36324690202087341L);
        obj.A6s = r301.AZk(36324690202349486L);
        obj.A9j = r301.AZk(36324690202480559L);
        obj.A7Y = r301.AZk(36324690202677170L);
        obj.A3O = r301.AZk(36324690203266996L);
        obj.A7P = r301.AZk(36324690203332533L);
        obj.A7Q = r301.AZk(36324690203398070L);
        obj.A2W = r301.BCy(36887640157325048L);
        obj.A7M = r301.AZk(36324690204053436L);
        obj.A2m = r301.AZk(36324690204315584L);
        obj.A2o = r301.AZk(36324690204118973L);
        obj.A6c = r301.AZk(36324690203529144L);
        obj.A8N = r301.AZk(36324690204250047L);
        obj.A7I = r301.AZk(2342167699418271683L);
        obj.A8D = r301.AZk(36324690204708805L);
        obj.A8C = r301.AZk(36324690204905416L);
        obj.A8E = r301.AZk(36324690205036490L);
        obj.A3i = r301.AZk(36323156898892061L);
        obj.A9T = r301.AZk(36323156898826524L);
        obj.A3X = r301.AZk(36323156899350814L);
        obj.A1C = C1Ur.A00(r301, 0, 36604631876115136L);
        obj.A7T = r301.AZk(36323156899612961L);
        obj.A7S = r301.AZk(36323156899547424L);
        obj.A7U = r301.AZk(36323156899481887L);
        obj.A9o = r301.AZk(36323156899678498L);
        obj.A0I = C1Ur.A00(r303, 0, 72622098771542511L);
        obj.A7N = r303.AZk(72340623792803726L);
        obj.A3a = r303.AZk(72340623795228582L);
        obj.A3b = r303.AZk(72340623796146099L);
        obj.A3c = r303.AZk(72340623796211636L);
        obj.A4Y = r303.AZk(72340623793000335L);
        obj.A36 = r303.AZk(72340623793196945L);
        obj.A9R = r303.AZk(72340623793065872L);
        obj.A9S = r303.AZk(72340623793393554L);
        obj.A81 = r303.AZk(72340623793590164L);
        obj.A9K = r303.AZk(72340623793852312L);
        obj.A35 = r303.AZk(72340623793721238L);
        obj.A8G = r303.AZk(72340623795097509L);
        obj.A8B = r303.AZk(72340623796277173L);
        obj.A8O = r303.AZk(72340623793917849L);
        obj.A39 = r303.AZk(72340623793983386L);
        obj.A3F = r303.AZk(72340623794048923L);
        obj.A4X = r303.AZk(72340623793786775L);
        obj.A9U = r303.AZk(72340623794114460L);
        obj.A7R = r303.AZk(72340623794769827L);
        obj.A0O = C1Ur.A00(r303, 0, 72622098771739121L);
        obj.A38 = r303.AZk(72340623795490730L);
        obj.A4d = r303.AZk(72340623795556267L);
        obj.A7C = r303.AZk(72340623795621804L);
        obj.A3M = r301.AZk(36322156173935748L);
        obj.A3J = r301.AZk(36322156174066822L);
        obj.A3K = r301.AZk(36322156174328968L);
        obj.A3U = r301.AZk(36322156174394505L);
        obj.A3I = r301.AZk(36322156174263431L);
        obj.A3H = r301.AZk(36322156174853258L);
        obj.A3E = r301.AZk(36323363056601616L);
        obj.A2f = r301.AZk(36323363056470543L);
        obj.A34 = r301.AZk(36323363056798225L);
        obj.A13 = C1Ur.A00(r301, 3, 36604838033890073L);
        obj.A41 = r301.AZk(36313540468349606L);
        obj.A9c = r301.AZk(36313540468284069L);
        obj.A1p = r301.Auy(36593220150297746L);
        obj.A1q = r301.Auy(36593220150363283L);
        obj.A1r = r301.Auy(36593220150428820L);
        obj.A1s = r301.Auy(36593220150494357L);
        obj.A1t = r301.Auy(36593220150559894L);
        obj.A1u = r301.Auy(36593220150625431L);
        obj.A9p = r301.AZk(36314030093180357L);
        obj.A1F = C1Ur.A00(r301, 100, 36607586811846431L);
        obj.A0L = C1Ur.A00(r301, 20, 36607586811780894L);
        obj.A1G = C1Ur.A00(r301, LogcatReader.DEFAULT_WAIT_TIME, 36600023374500702L);
        obj.A3V = r301.AZk(36318294995448144L);
        obj.A2X = r301.BCy(36873634291449998L);
        obj.A8I = r301.AZk(36310684334359486L);
        obj.A3l = r301.AZk(2342153693549167555L);
        obj.A3w = r301.AZk(36310684336128966L);
        obj.A86 = r301.AZk(36310684337439693L);
        obj.A43 = r301.AZk(36310684338553812L);
        obj.A1X = C1Ur.A00(r301, 0, 36593649644012996L);
        obj.A1Z = C1Ur.A00(r301, 15, 36593649644668357L);
        obj.A1W = C1Ur.A00(r301, 100, 36593649643685315L);
        obj.A00 = r301.Ai7(37156599598153971L);
        obj.A87 = r301.AZk(36312174668353678L);
        obj.A3C = r301.AZk(36312174668812431L);
        obj.A40 = r301.AZk(36312174668877968L);
        obj.A3P = r301.AZk(36326949353969549L);
        obj.A3h = r301.AZk(36312913401025675L);
        obj.A3p = r301.AZk(2342155922614850700L);
        obj.A3g = r301.AZk(2342155922614981774L);
        obj.A3y = r301.AZk(2342155922615243921L);
        obj.A42 = r301.AZk(2342155922614588554L);
        obj.A2Y = r301.BCy(36875863354507834L);
        obj.A6g = r301.AZk(36324776100253745L);
        obj.A5n = r301.AZk(36324776100319282L);
        obj.A51 = r301.AZk(36315726604281230L);
        obj.A5R = r301.AZk(36315726604412303L);
        return obj;
    }

    public static short A04(short[] sArr, int i) {
        short s = sArr[i];
        if (s == -1) {
            sArr[i] = sArr[72];
            sArr[72] = (short) (sArr[72] + 1);
            s = sArr[i];
        }
        return s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3420:0x8ffe, code lost:
    
        if (r323 != false) goto L3404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3423:0x900f, code lost:
    
        if (r310 != false) goto L3388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3427:0x9025, code lost:
    
        if (r323 != false) goto L3366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3430:0x9036, code lost:
    
        if (r323 != false) goto L3332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3433:0x9047, code lost:
    
        if (r320 != false) goto L3298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3436:0x9055, code lost:
    
        if (r305 != false) goto L3270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3439:0x9063, code lost:
    
        if (r305 != false) goto L3236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3442:0x9071, code lost:
    
        if (r305 != false) goto L3196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3445:0x907f, code lost:
    
        if (r308 != false) goto L3174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3448:0x9090, code lost:
    
        if (r321 != false) goto L3161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3451:0x90a1, code lost:
    
        if (r305 != false) goto L3136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3454:0x90af, code lost:
    
        if (r305 != false) goto L3117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3457:0x90bd, code lost:
    
        if (r325 != false) goto L3104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3460:0x90cb, code lost:
    
        if (r310 != false) goto L3085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3463:0x90db, code lost:
    
        if (r308 != false) goto L3075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3466:0x90ec, code lost:
    
        if (r308 != false) goto L3059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3469:0x90fd, code lost:
    
        if (r308 != false) goto L3037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3472:0x910e, code lost:
    
        if (r308 != false) goto L3021;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3475:0x911f, code lost:
    
        if (r308 != false) goto L2825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3478:0x9130, code lost:
    
        if (r308 != false) goto L2749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3481:0x9141, code lost:
    
        if (r308 != false) goto L2619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3484:0x9152, code lost:
    
        if (r310 != false) goto L2585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3487:0x9162, code lost:
    
        if (r310 != false) goto L2575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3490:0x9172, code lost:
    
        if (r310 != false) goto L2565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3493:0x9182, code lost:
    
        if (r308 != false) goto L2555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3496:0x9193, code lost:
    
        if (r308 != false) goto L2524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3499:0x91a4, code lost:
    
        if (r308 != false) goto L2508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3502:0x91b5, code lost:
    
        if (r310 != false) goto L2474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3505:0x91c5, code lost:
    
        if (r310 != false) goto L2464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3508:0x91d5, code lost:
    
        if (r308 != false) goto L2448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3511:0x91e6, code lost:
    
        if (r308 != false) goto L2414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3514:0x91f7, code lost:
    
        if (r308 != false) goto L2284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3517:0x9208, code lost:
    
        if (r308 != false) goto L2244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3520:0x9219, code lost:
    
        if (r308 != false) goto L2078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3523:0x922a, code lost:
    
        if (r310 != false) goto L2062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3526:0x923a, code lost:
    
        if (r308 != false) goto L2028;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3529:0x924b, code lost:
    
        if (r310 != false) goto L2000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3532:0x925b, code lost:
    
        if (r310 != false) goto L1987;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3535:0x926b, code lost:
    
        if (r310 != false) goto L1953;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3538:0x927b, code lost:
    
        if (r310 != false) goto L1919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3541:0x928b, code lost:
    
        if (r310 != false) goto L1900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3544:0x929b, code lost:
    
        if (r310 != false) goto L1878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3547:0x92ab, code lost:
    
        if (r310 != false) goto L1868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3550:0x92bb, code lost:
    
        if (r310 != false) goto L1843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3553:0x92cb, code lost:
    
        if (r310 != false) goto L1824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3556:0x92db, code lost:
    
        if (r308 != false) goto L1808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3559:0x92ec, code lost:
    
        if (r308 != false) goto L1789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3562:0x92fd, code lost:
    
        if (r310 != false) goto L1704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3565:0x930d, code lost:
    
        if (r321 != false) goto L1691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3568:0x931e, code lost:
    
        if (r308 != false) goto L1651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3571:0x932f, code lost:
    
        if (r310 != false) goto L1617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3574:0x933f, code lost:
    
        if (r310 != false) goto L1595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3577:0x934f, code lost:
    
        if (r308 != false) goto L1582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3580:0x9360, code lost:
    
        if (r308 != false) goto L1542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3583:0x9371, code lost:
    
        if (r310 != false) goto L1502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3586:0x9381, code lost:
    
        if (r310 != false) goto L1486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3589:0x9391, code lost:
    
        if (r326 != false) goto L1470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3592:0x93a1, code lost:
    
        if (r326 != false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3595:0x93b1, code lost:
    
        if (r321 != false) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3598:0x93c2, code lost:
    
        if (r326 != false) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3601:0x93d4, code lost:
    
        if (r321 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3604:0x93ee, code lost:
    
        if (r310 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(X.C0t9 r301, java.nio.ByteBuffer r302) {
        /*
            Method dump skipped, instructions count: 37893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.coldstartexperiments.writer.FbColdStartExperimentsWriter.A05(X.0t9, java.nio.ByteBuffer):void");
    }

    public static void A06(String str, ByteBuffer byteBuffer, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        byteBuffer.putInt(bytes.length);
        byteBuffer.put(bytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.coldstartexperiments.writer.FbColdStartExperimentsWriter.A07():void");
    }

    public int Adi() {
        return -1;
    }

    public void BqJ(int i) {
        if (SystemClock.elapsedRealtime() - this.A00.get() > 10000) {
            A07();
        }
    }
}
