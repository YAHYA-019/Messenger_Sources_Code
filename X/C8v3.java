package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8v3, reason: invalid class name */
/* loaded from: 8v3.class */
public final class C8v3 extends BJB {
    public static final String __redex_internal_original_name = "EncryptedBackupsAutoSyncFragment";
    public C9a5 A00;
    public C5ic A01;
    public FbUserSession A02;
    public final C01i A03;
    public final C01i A04;

    public C8v3() {
        C03i c03i = C03i.A02;
        this.A04 = C01g.A00(c03i, AQo.A01(this, 17));
        this.A03 = C01g.A00(c03i, AQo.A01(this, 16));
    }

    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A02 = A01;
        String str = "fbUserSession";
        if (A01 != null) {
            this.A00 = (C9a5) 7zN.A0m(this, A01, 68868);
            this.A01 = 7zQ.A0l();
            FbUserSession fbUserSession = this.A02;
            if (fbUserSession != null) {
                C1wv c1wv = (C1wv) 7zN.A0m(this, fbUserSession, 68883);
                C9a5 c9a5 = this.A00;
                if (c9a5 != null) {
                    11T.A0F(c1wv, 1);
                    C1wv.A04(c1wv);
                    C9qq.A01(this, c1wv.A02, c9a5, 61);
                    return;
                }
                str = "viewData";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1c() {
        String str;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            C9a5 c9a5 = this.A00;
            if (c9a5 == null) {
                str = "viewData";
            } else {
                Object value = c9a5.A01.getValue();
                8tW r0 = 8tW.A00;
                C87p c87p = new C87p(11T.A0O(value, r0), 3);
                RFS rfs = (RFS) this.A04.getValue();
                C9a5 c9a52 = this.A00;
                str = "viewData";
                if (c9a52 != null) {
                    boolean A0O = 11T.A0O(c9a52.A01.getValue(), 8tV.A00);
                    C9a5 c9a53 = this.A00;
                    if (c9a53 != null) {
                        boolean A0O2 = 11T.A0O(c9a53.A01.getValue(), r0);
                        C9a5 c9a54 = this.A00;
                        if (c9a54 != null) {
                            8Lp r02 = new 8Lp(3, c9a54.A00.getValue(), A0O, A0O2);
                            9Ir r03 = (9Ir) this.A03.getValue();
                            MigColorScheme migColorScheme = ((BJB) this).A01;
                            11T.A0A(migColorScheme);
                            lithoView.A0y(new C8ao(c87p, r02, r03, rfs, migColorScheme));
                            return;
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1452481424);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(183975943, A04);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        C9a5 c9a5 = this.A00;
        if (c9a5 != null) {
            C9qq.A00(this, c9a5.A01, 59);
            C9a5 c9a52 = this.A00;
            if (c9a52 != null) {
                C9qq.A00(this, c9a52.A00, 60);
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }
}
