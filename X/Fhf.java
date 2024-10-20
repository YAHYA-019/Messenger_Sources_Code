package X;

import com.facebook.auth.protocol.ConfirmedMessengerCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: Fhf.class */
public final class Fhf implements 1Ro {
    public static final String __redex_internal_original_name = "LoginBypassWithMessengerCredentialsMethod";
    public 1BY A00;
    public final C00i A02 = AbH.A0T();
    public final EuM A01 = (EuM) 1Bn.A0B(100127);

    public Fhf(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Ekg ekg = (Ekg) obj;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("format", "json");
        ConfirmedMessengerCredentials confirmedMessengerCredentials = ekg.A00;
        A0u.put("account_id", confirmedMessengerCredentials.A02);
        Calendar calendar = confirmedMessengerCredentials.A05;
        if (calendar != null) {
            A0u.put("birthday", new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar.getTime()));
        }
        A0u.put("device_id", AbJ.A0z(this.A02));
        if (ekg.A02) {
            A0u.put("generate_session_cookies", ConstantsKt.CAMERA_ID_BACK);
        }
        String str = ekg.A01;
        if (str != null) {
            A0u.put("machine_id", str);
        } else {
            A0u.put("generate_machine_id", ConstantsKt.CAMERA_ID_BACK);
        }
        A0u.put("code", confirmedMessengerCredentials.A01);
        A0u.put("account_recovery_id", confirmedMessengerCredentials.A00);
        String str2 = confirmedMessengerCredentials.A03;
        if (!1JF.A0B(str2)) {
            A0u.put("new_account_recovery_id", str2);
        }
        A0u.put("currently_logged_in_userid", 1Fw.A05(this.A00).A02);
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "loginBypassWithMessengerCredentials");
        A0T.A0F = "method/user.bypassLoginWithConfirmedMessengerCredentials";
        A0T.A06(A0u);
        A0T.A06 = 0S2.A01;
        A0T.A02();
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        Ekg ekg = (Ekg) obj;
        anonymousClass439.A03();
        String str = ekg.A00.A04;
        return this.A01.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), ekg.A02);
    }
}
