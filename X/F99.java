package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.BitSet;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: F99.class */
public final class F99 {
    public final F76 A00;
    public final Exp A01;
    public final java.util.Map A02;
    public final C00m A03;
    public final C00m A04;
    public final Function1 A05;

    public F99(F76 f76, Exp exp, java.util.Map map, C00m c00m, C00m c00m2, Function1 function1) {
        11T.A0F(exp, 1);
        1BL.A1G(f76, map);
        this.A01 = exp;
        this.A03 = c00m;
        this.A04 = c00m2;
        this.A05 = function1;
        this.A00 = f76;
        this.A02 = map;
    }

    public static final void A00(String str, String str2, int i) {
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 7T1.A00.get();
        11T.A0A(quickPerformanceLogger);
        quickPerformanceLogger.markerStart(2293785);
        quickPerformanceLogger.markerAnnotate(2293785, "fallback_triggered", true);
        quickPerformanceLogger.markerAnnotate(2293785, "is_native_screen", true);
        quickPerformanceLogger.markerAnnotate(2293785, "login_flow", "caa");
        quickPerformanceLogger.markerAnnotate(2293785, "login_type", "Password");
        quickPerformanceLogger.markerAnnotate(2293785, "login_source", "Login");
        quickPerformanceLogger.markerAnnotate(2293785, "credential_type", str);
        quickPerformanceLogger.markerAnnotate(2293785, "login_request_try_num", i);
        quickPerformanceLogger.markerAnnotate(2293785, "entry_point", str2);
    }

    public final void A01(Context context, Eyw eyw, C00m c00m, C00m c00m2) {
        11T.A0F(eyw, 1);
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("user_id", eyw.A02);
        C01i c01i = FGU.A00;
        Object A02 = ((1H2) 1Bi.A03(33032)).A02();
        11T.A0A(A02);
        A12.put("device_id", A02);
        A12.put("family_device_id", ((FHQ) 1Bn.A0E(context, (1BY) null, 83979)).A05());
        A12.put("waterfall_id", FGU.A02());
        A12.put("machine_id", FGU.A01());
        A12.put("login_source", "AccountsYouMayHave");
        A12.put("from_native_screen", true);
        JSONArray jSONArray = new JSONArray();
        for (EyC eyC : eyw.A03) {
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("credential_type", eyC.A00);
            A122.put("token", eyC.A01);
            jSONArray.put(A122);
        }
        A12.put("credentials", jSONArray);
        C2050DaD A00 = FGU.A00(context);
        11T.A0A(A00);
        Eul A002 = EYM.A00("com.bloks.www.bloks.caa.login.async.auth_login_request");
        String obj = A12.toString();
        StringBuilder A0o = AnonymousClass001.A0o("{");
        if (obj != null) {
            A0o.append("\"");
            AnonymousClass001.A1D("client_input_params", "\":", obj, A0o);
        }
        A0o.append("}");
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("params", A0o.toString());
        A002.A02 = A0u;
        A002.A00 = new Fww(this, c00m, c00m2, 1);
        A002.A00(context, A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public final void A02(Context context, String str, C00m c00m, C00m c00m2) {
        ?? A1X = 1BL.A1X(context, str);
        this.A03.invoke();
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        BitSet A18 = 1BK.A18(A1X == true ? 1 : 0);
        A0u.put("family_device_id", FHQ.A01(context, A0u));
        A0u.put(1BJ.A00(1971), "login_home_native_integration_point");
        A18.set(0);
        A0u.put("is_caa_perf_enabled", Boolean.valueOf((boolean) A1X));
        A0u.put("nested_nta_variant", "control");
        A0u.put("waterfall_id", FGU.A02());
        A0u.put("calling_screen_id", this.A01.A00);
        A0u.put("entrypoint", str);
        C2050DaD A00 = FGU.A00(context);
        Fww fww = new Fww(this, c00m, c00m2, 3);
        if (A18.nextClearBit(0) < A1X) {
            throw DKD.A0k();
        }
        C4O5.A01(fww, "com.bloks.www.bloks.caa.reg.aymh_create_account_button.async", A0u, A0u2).A00(context, A00);
    }
}
