package com.facebook.securedaction;

import X.1BY;
import X.1Bn;
import X.1Lo;
import X.1iF;
import X.9rP;
import X.AbF;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.AnonymousClass243;
import X.C1io;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.securedaction.challenges.SecuredActionChallengeData;
import java.io.IOException;

/* loaded from: SecuredActionChallengeActivity.class */
public class SecuredActionChallengeActivity extends FbFragmentActivity implements C1io {
    public AnonymousClass243 A00;
    public SecuredActionChallengeData A01;
    public 9rP A02;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(627446925311111L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        isFinishing();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("intent_extra_fragment_factory") && intent.hasExtra("intent_extra_challenge_data")) {
            intent.getParcelableExtra("intent_extra_fragment_factory");
            try {
                this.A01 = (SecuredActionChallengeData) this.A00.A0V(intent.getStringExtra("intent_extra_challenge_data"), SecuredActionChallengeData.class);
            } catch (IOException unused) {
                finish();
            }
            setContentView(2132541683);
            throw AnonymousClass001.A0Q("createFragmentForChallengeType");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = (AnonymousClass243) 1Bn.A0A(68334);
        this.A02 = (9rP) 1Lo.A04(this, A08, (1BY) null, 68164);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        IBinder windowToken;
        InputMethodManager A06 = AbI.A06(this);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
            A06.hideSoftInputFromWindow(windowToken, 0);
        }
        super.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }
}
