package X;

import com.facebook.account.recovery.common.protocol.AccountRecoveryLaraEndpointMethod$Params;
import com.facebook.account.recovery.common.protocol.AccountRecoveryLaraEndpointMethod$Result;
import com.facebook.inject.FbInjector;
import java.util.HashMap;

/* loaded from: Fhd.class */
public final class Fhd implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoveryLaraEndpointMethod";
    public final C00i A01 = AbH.A0T();
    public final C00i A02 = DKD.A0O();
    public final C00i A00 = 1BQ.A02(49257);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AccountRecoveryLaraEndpointMethod$Params accountRecoveryLaraEndpointMethod$Params = (AccountRecoveryLaraEndpointMethod$Params) obj;
        HashMap A0u = AnonymousClass001.A0u();
        String str = accountRecoveryLaraEndpointMethod$Params.A00;
        A0u.put("cuid", str);
        A0u.put("device_id", AbJ.A0z(this.A01));
        A0u.put("sfdid", accountRecoveryLaraEndpointMethod$Params.A03);
        A0u.put("fdid", accountRecoveryLaraEndpointMethod$Params.A01);
        A0u.put("open_id_email", accountRecoveryLaraEndpointMethod$Params.A02);
        ETV A07 = AbM.A0n(this.A02).A07(4YV.A0C(FbInjector.A00()), "account_recovery_search");
        if (C08554nH.A00((C08554nH) this.A00.get())) {
            A0u.put("encrypted_msisdn", A07 != null ? A07.A02 : "");
        }
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "accountRecoveryLaraEndpoint");
        A0T.A0F = 0Pz.A0W(str, "/lara");
        A0T.A02();
        A0T.A06(A0u);
        A0T.A06 = 0S2.A0C;
        A0T.A0L = true;
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AccountRecoveryLaraEndpointMethod$Result.class);
    }
}
