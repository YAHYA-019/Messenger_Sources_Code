package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: GBu.class */
public final class GBu extends C00q implements Function2 {
    public final /* synthetic */ F99 $actionHelper;
    public final /* synthetic */ String $entrypoint;
    public final /* synthetic */ F76 $eventLogger;
    public final /* synthetic */ C00m $onLoginFinished;
    public final /* synthetic */ C00m $onLoginStarted;
    public final /* synthetic */ C2k6 $this_triggerCredentialManagerLogin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBu(C2k6 c2k6, F76 f76, F99 f99, String str, C00m c00m, C00m c00m2) {
        super(2);
        this.$onLoginStarted = c00m;
        this.$actionHelper = f99;
        this.$this_triggerCredentialManagerLogin = c2k6;
        this.$entrypoint = str;
        this.$onLoginFinished = c00m2;
        this.$eventLogger = f76;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        this.$onLoginStarted.invoke();
        F99 f99 = this.$actionHelper;
        Context A0L = 7zP.A0L(this.$this_triggerCredentialManagerLogin);
        11T.A0D(obj);
        11T.A0D(str);
        String str2 = this.$entrypoint;
        C00m c00m = this.$onLoginFinished;
        AKK akk = new AKK(c00m, 14);
        G9J g9j = new G9J(23, this.$eventLogger, c00m, this.$this_triggerCredentialManagerLogin);
        7zS.A16(1, obj, str, str2);
        f99.A03.invoke();
        LinkedHashMap A00 = F76.A00();
        A00.put("fblite_client_id", "");
        F3h.A00("login_smartlock_clicked", "login_smart_lock", "smartlock", "", A00);
        F99.A00("credential_manager", str2, 1);
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        BitSet A18 = 1BK.A18(1);
        A0u.put("family_device_id", FHQ.A01(A0L, A0u));
        A0u.put("contact_point", obj);
        A18.set(0);
        A0u.put("machine_id", FGU.A01());
        String A01 = FEg.A01((FEg) 1Bn.A0E(A0L, (1BY) null, 100112), str);
        11T.A0A(A01);
        A0u.put("encrypted_password", A01);
        A0u.put("from_native_screen", true);
        C2050DaD A002 = FGU.A00(A0L);
        Fww fww = new Fww(f99, akk, g9j, 4);
        if (A18.nextClearBit(0) < 1) {
            throw DKD.A0k();
        }
        C4O5.A01(fww, "com.bloks.www.bloks.caa.login.async.send_google_smartlock_login_request", A0u, A0u2).A00(A0L, A002);
        return 04S.A00;
    }
}
