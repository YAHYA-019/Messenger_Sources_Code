package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: X.4wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wi.class */
public final class C11444wi {
    public final C11424wg A00;
    public final C11384wc A01;

    public C11444wi(C11424wg c11424wg, C11384wc c11384wc) {
        this.A00 = c11424wg;
        this.A01 = c11384wc;
    }

    public static void A00(Bundle bundle, C11444wi c11444wi, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, java.util.Map map, boolean z) {
        LDF A00 = LDF.A00();
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        LinkedHashMap A1C = 1BK.A1C();
        03Y A1G = 1BK.A1G("used_logger_v2", "true");
        boolean z2 = false;
        C11424wg c11424wg = c11444wi.A00;
        11T.A0F(c11424wg, 0);
        A1C.putAll(4YW.A0A("family_device_id", "", A1G));
        if (map != null) {
            A1C.putAll(map);
        }
        03Y A1G2 = 1BK.A1G("action", "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION");
        03Y A1G3 = 1BK.A1G(JQw.A00(0), str);
        03Y A1G4 = 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        03Y A1G5 = 1BK.A1G("payment_credential_ids", str3);
        03Y A1G6 = 1BK.A1G(JQw.A00(358), String.valueOf(z));
        03Y A1G7 = 1BK.A1G("form_completion_duration", String.valueOf(l));
        03Y A1G8 = 1BK.A1G("event_times", String.valueOf(num2));
        03Y A1G9 = 1BK.A1G("time_spend", String.valueOf(l2));
        03Y A1G10 = 1BK.A1G("index", String.valueOf(num));
        03Y A1G11 = 1BK.A1G("enhanced_regex_new_fields_metadata", new JSONObject(A1C).toString());
        if (c11424wg.A0O.A00 == EnumC11364wa.A03) {
            z2 = true;
        }
        03Y A1G12 = 1BK.A1G(JQw.A00(300), String.valueOf(z2));
        03Y A1G13 = 1BK.A1G(JQw.A00(299), String.valueOf(7kQ.A00(c11424wg)));
        C11394wd c11394wd = c11424wg.A08;
        03Y A1G14 = 1BK.A1G("ad_id", c11394wd.A04);
        String str5 = c11394wd.A05;
        03Y A1G15 = 1BK.A1G(JQw.A00(2), str5);
        03Y A1G16 = 1BK.A1G(AnonymousClass000.A00(201), str5);
        JtD jtD = c11424wg.A03;
        03Y A1G17 = 1BK.A1G("selected_field_tag", jtD.A00);
        03Y A1G18 = 1BK.A1G("current_url", c11394wd.A01);
        03Y A1G19 = 1BK.A1G("form_session_id", c11424wg.A01.A04);
        03Y A1G20 = 1BK.A1G("experiments", new JSONObject(L9G.A00(c11424wg, c11444wi.A01)).toString());
        List list = (List) c11424wg.A0D.A00;
        11T.A0F(list, 0);
        A00.A0B(bundle, 04R.A09(new 03Y[]{A1G2, A1G3, A1G4, A1G5, A1G6, A1G7, A1G8, A1G9, A1G10, A1G11, A1G12, A1G13, A1G14, A1G15, A1G16, A1G17, A1G18, A1G19, A1G20, 1BK.A1G("user_credentials_status", LD5.A02(list).isEmpty() ? "credit_card_nux" : "credit_card_pux"), 1BK.A1G("has_helium", String.valueOf(false)), 1BK.A1G("all_fields", C7kP.A00(jtD.A03)), 1BK.A1G("origin_host", str4)}));
    }

    public static void A01(Bundle bundle, C11444wi c11444wi, String str, String str2, java.util.Map map) {
        A00(bundle, c11444wi, null, null, null, null, str, str2, null, null, map, false);
    }

    public final void A02(Bundle bundle, Integer num, String str, String str2) {
        A00(bundle, this, 0, null, null, null, 0Pz.A0W("BLOKS_REQUEST_PROMPT_", str), JQw.A00(num.intValue() != 0 ? 55 : 6), null, null, 4YW.A0A("prompt_session_id", str2, 1BK.A1G("is_bloks_screen", "true")), false);
    }

    public final void A03(Bundle bundle, String str, String str2, String str3, String str4, java.util.Map map, java.util.Map map2, Set set, boolean z) {
        11T.A0F(map, 3);
        4YV.A1M(set, 6, str4);
        LinkedHashMap A1C = 1BK.A1C();
        A1C.putAll(04R.A09(new 03Y[]{1BK.A1G("is_bloks_screen", "true"), 1BK.A1G("prompt_session_id", str4), 1BK.A1G("prompt_type", str2), 1BK.A1G(JQw.A00(281), 0QD.A0K(", ", "", "", 0QD.A0U(map.keySet()), (Function1) null, -1)), 1BK.A1G("has_cached_screen", String.valueOf(!set.isEmpty())), 1BK.A1G("cache_layers", 0Pz.A0L(0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, (Function1) null, -1), '[', ']'))}));
        A1C.putAll(map2);
        A00(bundle, this, 0, null, null, null, str, str3, null, null, A1C, z);
    }
}
