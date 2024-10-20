package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.2cw, reason: invalid class name */
/* loaded from: 2cw.class */
public final class C2cw {
    public Long A00;
    public final 1Br A02 = 1Bq.A00(16705);
    public final 1Br A01 = 1Bq.A00(16520);

    public final void A00() {
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLogger) this.A02.A00.get()).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        }
    }

    public final void A01() {
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLogger) this.A02.A00.get()).flowEndSuccess(l.longValue());
        }
    }

    public final void A02(Integer num, Integer num2) {
        String str;
        int i = 766120930;
        switch (num.intValue()) {
            case 2:
                i = 766121014;
                break;
            case 3:
                i = 766121706;
                break;
            case 4:
                i = 766127047;
                break;
            case 5:
                i = 766117617;
                break;
            case 6:
                i = 766127578;
                break;
            case 7:
                i = 766117854;
                break;
            case 8:
                i = 766128147;
                break;
            case 9:
                i = 766128266;
                break;
            case 10:
                i = 766120745;
                break;
            case 11:
                i = 766118214;
                break;
            case 12:
                i = 766123018;
                break;
            case 13:
                i = 766125158;
                break;
            case 14:
                i = 766132033;
                break;
        }
        C00i c00i = this.A02.A00;
        long generateNewFlowId = ((UserFlowLogger) c00i.get()).generateNewFlowId(i);
        Long valueOf = Long.valueOf(generateNewFlowId);
        this.A00 = valueOf;
        if (valueOf != null) {
            UserFlowLogger userFlowLogger = (UserFlowLogger) c00i.get();
            switch (num2.intValue()) {
                case 0:
                    str = "ADMIN_MESSAGE";
                    break;
                case 1:
                    str = "APP_START";
                    break;
                case 2:
                    str = "APP_FOREGROUND";
                    break;
                case 3:
                    str = "EB_UPSELL";
                    break;
                case 4:
                    str = "ENABLING_MEDIA_EXP";
                    break;
                case 5:
                    str = "ENABLING_MESSAGE_EXP";
                    break;
                case 6:
                    str = "LOW_DISKSPACE_WARNING";
                    break;
                case 7:
                    str = "SETTINGS";
                    break;
                case 8:
                    str = "TRIGGER_EXPIRATION";
                    break;
                case 9:
                    str = "TRIGGER_EXPIRATION_DISABLE";
                    break;
                case 10:
                    str = "TRIGGER_EXPIRATION_ELIGIBILITY";
                    break;
                case 11:
                    str = "SOFT_BLOCK_FULLSCREEN_OPTED_OUT_USER";
                    break;
                case 12:
                    str = "SOFT_BLOCK_ME_REONBOARD_NEW_DEVICE";
                    break;
                case 13:
                    str = "INTERNAL_SETTINGS";
                    break;
                case 14:
                    str = "STATE_SYNC";
                    break;
                case 15:
                    str = "EB_STATUS";
                    break;
                case 16:
                    str = "APP_JOB";
                    break;
                case 17:
                    str = "LOCK_BOX_STORE_OPT_OUT_FLAG";
                    break;
                case 18:
                    str = "LOCK_BOX_STORE_TRIGGERED_FLAG";
                    break;
                case 19:
                    str = "LOCK_BOX_RETRIEVE_OPT_OUT_FLAG";
                    break;
                case 20:
                    str = "LOCK_BOX_RETRIEVE_TRIGGERED_FLAG";
                    break;
                case 21:
                    str = "ME_V2_EXPERIMENT";
                    break;
                case 22:
                    str = "MEDIA_EXP_TOMBSTONE";
                    break;
                default:
                    str = "ME_RESTORE_BANNER";
                    break;
            }
            userFlowLogger.flowStartIfNotOngoing(generateNewFlowId, new UserFlowConfig(str, false));
            A06("ENTRY_POINT", str);
        }
    }

    public final void A03(Integer num, String str) {
        int i = 766120745;
        if (num.intValue() != 1) {
            i = 766130369;
        }
        ((QuickPerformanceLogger) this.A01.A00.get()).markerPoint(i, str);
    }

    public final void A04(String str) {
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLogger) this.A02.A00.get()).flowEndFail(l.longValue(), str, null);
        }
    }

    public final void A05(String str) {
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLogger) this.A02.A00.get()).flowMarkPoint(l.longValue(), str);
        }
    }

    public final void A06(String str, String str2) {
        11T.A0F(str2, 1);
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLogger) this.A02.A00.get()).flowAnnotateWithCrucialData(l.longValue(), str, str2);
        }
    }
}
