package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: Evw.class */
public final class Evw {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(Integer num, Integer num2) {
        A01(num, num2, null, null);
    }

    public final void A01(Integer num, Integer num2, Integer num3, String str) {
        String str2;
        String str3;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1436));
        int A05 = 7zR.A05(num3);
        Long A0e = str != null ? 0CW.A0e(str) : null;
        if (A08.isSampled()) {
            switch (num2.intValue()) {
                case 0:
                    str2 = "click";
                    break;
                case 1:
                    str2 = "impression";
                    break;
                case 2:
                    str2 = "dismiss";
                    break;
                case 3:
                    str2 = "retry_click";
                    break;
                case 4:
                    str2 = "intent_error_data_is_null";
                    break;
                case 5:
                    str2 = "intent_error_threadkey_is_null";
                    break;
                case 6:
                    str2 = "intent_error_hooks_is_null";
                    break;
                default:
                    str2 = "intent_error_incorrect_deeplink";
                    break;
            }
            AbF.A1L(A08, str2);
            A08.A7R("content_position", String.valueOf(A05));
            switch (num.intValue()) {
                case 0:
                    str3 = "messenger_discovery_game_card";
                    break;
                case 1:
                    str3 = "messenger_discovery_grid";
                    break;
                case 2:
                    str3 = "messenger_discovery_error_section";
                    break;
                case 3:
                    str3 = "composer_button";
                    break;
                default:
                    str3 = "intent_handler";
                    break;
            }
            A08.A7R(TraceFieldType.ContentType, str3);
            A08.A7R("funnel_session_key", (String) null);
            A08.A6H("game_id", A0e);
            A08.BZL();
        }
    }
}
