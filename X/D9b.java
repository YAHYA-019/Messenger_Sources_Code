package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: D9b.class */
public final class D9b implements Runnable {
    public static final String __redex_internal_original_name = "VideoAutoplaySettingsServerMigrationHelper$getAndUpdateEffectiveSettingFromServer$runnable$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FbSharedPreferences A01;
    public final /* synthetic */ 6V8 A02;

    public D9b(FbUserSession fbUserSession, FbSharedPreferences fbSharedPreferences, 6V8 r304) {
        this.A02 = r304;
        this.A00 = fbUserSession;
        this.A01 = fbSharedPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6V8 r0 = this.A02;
        C6bj c6bj = (C6bj) 1Br.A0B(r0.A04);
        FbUserSession fbUserSession = this.A00;
        Object obj = r0.A00.get();
        11T.A0A(obj);
        Context context = (Context) obj;
        11T.A0H(fbUserSession, context);
        C30G A0H = AbF.A0H(ActionId.MQTT_DISCONNECTED);
        A0H.A03("input", c6bj.A00.A02());
        C3sa A0C = AbL.A0C(A0H);
        1Vd A02 = AbK.A0K(context).A02();
        4YU.A1J(A0C, 900907473652242L);
        C03713yu A04 = A02.A04(A0C);
        D3H d3h = D3H.A00;
        1JU r02 = 1JU.A01;
        1Kd.A0F(new D4o(this.A01, r0, 14), 2FP.A02(d3h, A04, r02), r02);
    }
}
