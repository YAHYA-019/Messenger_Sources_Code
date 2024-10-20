package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8v2, reason: invalid class name */
/* loaded from: 8v2.class */
public final class C8v2 extends BJB {
    public static final String __redex_internal_original_name = "EncryptedBackupsSdkDebugFragment";
    public 9Vc A00;
    public FbUserSession A01;
    public 1Fv A02;
    public 9Iq A03;

    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        1Fv A0N = 7zQ.A0N();
        this.A02 = A0N;
        if (A0N == null) {
            str = "fbUserSessionManager";
        } else {
            this.A01 = A0N.A06(this);
            1Bn.A0A(147598);
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession != null) {
                this.A00 = new 9Vc(fbUserSession);
                this.A03 = new 9Iq(this);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            C9bw c9bw = new C9bw();
            c9bw.A04 = "EB SDK Jest-E2E Tests Buttons";
            By5 A00 = c9bw.A00();
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            9Iq r02 = this.A03;
            if (r02 == null) {
                11T.A0L("componentListener");
                throw 0Q8.createAndThrow();
            }
            lithoView.A0y(A1Z(new 8VT(r02, migColorScheme), r0, A00));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 272317544);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-1737720159, A04);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        9Vc r0 = this.A00;
        if (r0 != null) {
            7zT.A1C(this, new AJe(this, null, 15), r0.A06);
            9Vc r02 = this.A00;
            if (r02 != null) {
                7zT.A1C(this, new AJi(this, null, 18), r02.A05);
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }
}
