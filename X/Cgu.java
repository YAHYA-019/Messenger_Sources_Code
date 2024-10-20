package X;

import android.text.TextUtils;
import com.facebook.auth.protocol.ConfirmedMessengerOnlyUserCredentials;
import java.util.HashMap;

/* loaded from: Cgu.class */
public final class Cgu implements 1Ro {
    public static final String __redex_internal_original_name = "LoginBypassWithSoftmatchedMessengerOnlyUserMethod";
    public 1BY A00;
    public final EuM A01 = (EuM) 1Bn.A0B(100127);
    public final 1Oe A02 = (1Oe) 1Bi.A03(16617);
    public final C00i A04 = AbH.A0T();
    public final Kqg A03 = (Kqg) 1Bn.A0B(131243);

    public Cgu(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ConfirmedMessengerOnlyUserCredentials confirmedMessengerOnlyUserCredentials = (ConfirmedMessengerOnlyUserCredentials) obj;
        3MN r0 = (3MN) this.A03.A00("register_messenger_only_user").get();
        String A0z = AbJ.A0z(this.A04);
        String A04 = this.A02.A04(C1fe.A0j);
        String str = r0.A03;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("format", "json");
        A0u.put("encrypted_account_id", confirmedMessengerOnlyUserCredentials.A01);
        A0u.put("device_id", A0z);
        A0u.put("family_device_id", A04);
        A0u.put("secure_family_device_id", str);
        String str2 = confirmedMessengerOnlyUserCredentials.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0u.put("instagram_access_token", str2);
        }
        String str3 = confirmedMessengerOnlyUserCredentials.A00;
        if (!TextUtils.isEmpty(str3)) {
            A0u.put("drive_recovered_device_id", str3);
        }
        A0u.put(DKB.A00(364), 1Fw.A05(this.A00).A02);
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "bypassLoginWithConfirmedMessengerOnlyUser");
        c04083zw.A0F = "login_softmatched_messenger_only_user";
        c04083zw.A06(A0u);
        c04083zw.A06 = 0S2.A01;
        c04083zw.A02();
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return this.A01.A00(anonymousClass439.A01(), "", AnonymousClass001.A0X(this), false);
    }
}
