package com.facebook.oauthaccountlinking;

import X.0FI;
import X.0S2;
import X.11T;
import X.1Kd;
import X.5Dh;
import X.7zQ;
import X.7zR;
import X.AbF;
import X.AnonymousClass001;
import X.DKE;
import X.F1X;
import X.FgS;
import X.FwK;
import X.JQw;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.lang.reflect.InvocationTargetException;

/* loaded from: OAuthAccountLinkingActivity.class */
public class OAuthAccountLinkingActivity extends OAuthAccountLinkingActivityBase {
    public boolean A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r305 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r305 == null) goto L8;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        11T.A0F(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("code");
        String stringExtra2 = intent.getStringExtra("state");
        String stringExtra3 = intent.getStringExtra("error");
        if (stringExtra3 != null || stringExtra == null || stringExtra2 == null) {
            setResult(0, AbF.A05().putExtra("error", stringExtra3));
            OAuthAccountLinkingActivityBase.A00(this, 0S2.A0N, null, stringExtra3, null);
            finish();
        } else if (this.A02 != null) {
            FgS fgS = F1X.class;
            try {
                fgS = (FgS) DKE.A0p(fgS, "create", 0);
                GraphQlQueryParamSet graphQlQueryParamSet = fgS.A00;
                graphQlQueryParamSet.A05("authCode", stringExtra);
                fgS.A01 = true;
                graphQlQueryParamSet.A05("state", stringExtra2);
                fgS.A02 = true;
                graphQlQueryParamSet.A05("surface", this.A02 != null ? "FB" : null);
                5Dh A00 = FgS.A00(fgS);
                A00.setMaxToleratedCacheAgeMs(0L);
                A00.setEnsureCacheWrite(false);
                FwK A01 = FwK.A01(this, 11);
                7zQ.A0N().A05(this);
                1Kd.A0F(A01, 7zR.A0n(getApplicationContext(), A00), 7zQ.A14());
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                throw AnonymousClass001.A0U(fgS);
            }
        }
        this.A00 = true;
    }

    @Override // android.app.Activity
    public void onRestart() {
        int A00 = 0FI.A00(-367084873);
        super.onRestart();
        this.A01 = true;
        0FI.A07(330901793, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1096345688);
        super.onResume();
        if (this.A01 && !this.A00) {
            setResult(0, AbF.A05().putExtra("error", JQw.A00(ActionId.CONNECTIVITY_CHANGED)));
            finish();
        }
        0FI.A07(-487490173, A00);
    }
}
