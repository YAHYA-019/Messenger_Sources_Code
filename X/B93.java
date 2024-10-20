package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import java.util.List;

/* loaded from: B93.class */
public final class B93 extends BJB {
    public static final String __redex_internal_original_name = "ProModeBusinessToolsSettingsFragment";
    public 1xP A00;
    public Boolean A01;
    public final RG4 A02 = new RG4(this);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if (r0.booleanValue() == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1c() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L8d
            r0 = r301
            com.facebook.litho.LithoView r0 = r0.A00
            r303 = r0
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L8d
            r0 = r304
            if (r0 == 0) goto L8d
            r0 = r301
            r0.A1b()
            X.9bw r0 = new X.9bw
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = 2131963890(0x7f132ff2, float:1.9564546E38)
            r306 = r0
            r0 = r305
            r1 = r306
            r0.A01 = r1
            r0 = r305
            X.By5 r0 = r0.A00()
            r307 = r0
            r0 = r304
            X.1Iw r0 = X.7zL.A0W(r0)
            r308 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = X.7zS.A0j(r0)
            r309 = r0
            r0 = r301
            java.lang.Boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L5e
            r0 = r302
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = 1
            r310 = r0
            r0 = r306
            if (r0 != 0) goto L63
        L5e:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L63:
            X.RJQ r0 = new X.RJQ
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r309
            r0.<init>(r1, r2)
            X.AxF r0 = new X.AxF
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = r309
            r3 = r310
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r302
            r2 = r308
            r3 = r307
            X.Duz r0 = r0.A1Z(r1, r2, r3)
            r302 = r0
            r0 = r303
            r1 = r302
            r0.A0y(r1)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B93.A1c():void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1905149319);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-784432174, A04);
        return A0J;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(966598912);
        super/*X.DZJ*/.onDestroy();
        1xP r0 = this.A00;
        if (r0 == null) {
            11T.A0L("proModeStateManager");
            throw 0Q8.createAndThrow();
        }
        RG4 rg4 = this.A02;
        11T.A0F(rg4, 0);
        List list = r0.A05;
        list.remove(rg4);
        if (list.isEmpty()) {
            C21S.A01(r0.A04, AbI.A0f(r0.A02));
        }
        0FI.A08(-637825561, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        FbUserSession A01 = 1BM.A01(this);
        1UG A08 = 1BK.A08(1Br.A02(((BgV) 1Bn.A0A(83290)).A00), 1BJ.A00(1652));
        if (A08.isSampled()) {
            1UG.A02(A08, "promode_enablement_flow");
            AbO.A0T(new 0DA(), A08, "settings");
        }
        1xP r0 = (1xP) 7zN.A0n(this, A01, 33149);
        this.A00 = r0;
        if (r0 != null) {
            RG4 rg4 = this.A02;
            11T.A0F(rg4, 0);
            List list = r0.A05;
            list.add(rg4);
            if (list.size() == 1) {
                C21S.A00(r0.A04, AbI.A0f(r0.A02));
            }
            1xP r02 = this.A00;
            if (r02 != null) {
                r02.A00();
                return;
            }
        }
        11T.A0L("proModeStateManager");
        throw 0Q8.createAndThrow();
    }
}
