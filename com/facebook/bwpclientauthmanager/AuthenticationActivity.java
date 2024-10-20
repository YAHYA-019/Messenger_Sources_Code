package com.facebook.bwpclientauthmanager;

import X.04J;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1FV;
import X.1Kd;
import X.1Vd;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.AbF;
import X.AnonymousClass001;
import X.C00i;
import X.C3s4;
import X.DKH;
import X.F0g;
import X.F0h;
import X.FEz;
import X.Ffa;
import X.Ffn;
import X.Fw8;
import X.InX;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* loaded from: AuthenticationActivity.class */
public final class AuthenticationActivity extends FbFragmentActivity {
    public FbUserSession A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1Br A05 = 1BK.A0D();
    public Bundle A00 = new Bundle(0);
    public final 1Br A07 = 1Bq.A00(98571);
    public final 1Br A06 = 1BK.A0C();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
        this.A02 = true;
        String stringExtra = intent.getStringExtra("code");
        String stringExtra2 = intent.getStringExtra("state");
        String stringExtra3 = intent.getStringExtra("error");
        if (stringExtra3 != null || stringExtra == null || stringExtra2 == null) {
            if (11T.A0O(stringExtra3, "access_denied")) {
                setResult(0, AbF.A05().putExtra("error", "LOGIN_CANCELED_BY_USER"));
                FEz.A00.A01(this.A00, 1Br.A02(this.A05), 0S2.A0Y, (String) null, (String) null, (String) null);
            } else {
                setResult(0, AbF.A05().putExtra("error", stringExtra3));
                FEz.A00.A01(this.A00, 1Br.A02(this.A05), 0S2.A0j, stringExtra3, (String) null, (String) null);
            }
            finish();
            return;
        }
        FEz fEz = FEz.A00;
        C00i c00i = this.A05.A00;
        fEz.A01(this.A00, (04J) c00i.get(), 0S2.A0C, (String) null, (String) null, (String) null);
        if (this.A01 == null) {
            7zL.A1C();
            e = 0Q8.createAndThrow();
        } else {
            1Vd A0K = 7zM.A0K(getApplicationContext());
            11T.A0A(A0K);
            Executor A14 = 7zQ.A14();
            try {
                Object A0k = DKH.A0k((Object) null, F0g.class, "create");
                11T.A0I(A0k, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpAccessTokenQuery.BuilderForAuthCode");
                Ffn ffn = (Ffn) A0k;
                GraphQlQueryParamSet graphQlQueryParamSet = ffn.A01;
                graphQlQueryParamSet.A05("auth_code", stringExtra);
                ffn.A02 = true;
                graphQlQueryParamSet.A05("state", stringExtra2);
                ffn.A03 = true;
                graphQlQueryParamSet.A01(FEz.A00(this.A00), "extra_data");
                C3s4 ACe = ffn.ACe();
                ACe.setMaxToleratedCacheAgeMs(0L);
                ACe.setEnsureCacheWrite(false);
                1FV A09 = A0K.A09(ACe);
                Object obj = c00i.get();
                Bundle bundle = this.A00;
                Object A0B = 1Br.A0B(this.A07);
                boolean z = this.A04;
                11T.A0G(obj, 1, bundle);
                1Kd.A0F(new InX(0, A0B, bundle, this, obj, z), A09, A14);
                return;
            } catch (Exception e) {
                e = e;
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw AnonymousClass001.A0U(e);
                }
            }
        }
        throw e;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = DKH.A0H(this);
        Bundle bundleExtra = getIntent().getBundleExtra("iab_session_params");
        if (bundleExtra == null) {
            bundleExtra = new Bundle(0);
        }
        this.A00 = bundleExtra;
        if (this.A01 == null) {
            7zL.A1C();
            e = 0Q8.createAndThrow();
        } else {
            1Vd A0K = 7zM.A0K(getApplicationContext());
            11T.A0A(A0K);
            try {
                Object A0k = DKH.A0k((Object) null, F0h.class, "create");
                11T.A0I(A0k, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpLoginUrlQuery.Builder");
                Ffa ffa = (Ffa) A0k;
                ffa.A01.A01(FEz.A00(this.A00), "extra_data");
                C3s4 ACe = ffa.ACe();
                ACe.setMaxToleratedCacheAgeMs(0L);
                boolean z = false;
                ACe.setEnsureCacheWrite(false);
                1FV A09 = A0K.A09(ACe);
                C00i c00i = this.A06.A00;
                boolean AZk = 1BK.A0M(c00i).AZk(36325459000185584L);
                boolean AZk2 = 1BK.A0M(c00i).AZk(36325459000316658L);
                Intent intent = (Intent) getIntent().getParcelableExtra("iab_browser_intent");
                if (intent == null) {
                    z = true;
                }
                this.A04 = z;
                04J A02 = 1Br.A02(this.A05);
                Bundle bundle2 = this.A00;
                7zR.A1N(A02, bundle2);
                1Kd.A0F(new Fw8(intent, bundle2, this, A02, AZk2, AZk), A09, 7zQ.A14());
                return;
            } catch (Exception e) {
                e = e;
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw AnonymousClass001.A0U(e);
                }
            }
        }
        throw e;
    }

    @Override // android.app.Activity
    public void onRestart() {
        int A00 = 0FI.A00(-1567072400);
        super.onRestart();
        this.A03 = true;
        0FI.A07(-1617499659, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1558318034);
        super.onResume();
        if (this.A03 && !this.A02) {
            setResult(0, AbF.A05().putExtra("error", "LOGIN_CANCELED_BY_USER"));
            FEz.A00.A01(this.A00, 1Br.A02(this.A05), 0S2.A0Y, (String) null, (String) null, (String) null);
            finish();
        }
        0FI.A07(-811609585, A00);
    }
}
