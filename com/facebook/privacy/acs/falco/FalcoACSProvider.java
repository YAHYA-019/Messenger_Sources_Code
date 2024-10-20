package com.facebook.privacy.acs.falco;

import X.01V;
import X.0fH;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1EZ;
import X.1Fi;
import X.1Fw;
import X.1OJ;
import X.1Vd;
import X.3bU;
import X.4CZ;
import X.C00i;
import X.C4Cb;
import X.C4Cc;
import X.C4S0;
import X.DKN;
import android.content.Context;
import android.util.Base64;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: FalcoACSProvider.class */
public class FalcoACSProvider implements 1OJ {
    public static final String ACS_TOKEN_FORMAT_STRING = "anon_cred.{\\\"config_id\\\":\\\"%s\\\",\\\"cred\\\":\\\"%s\\\",\\\"tag\\\":\\\"%s\\\"}";
    public static final String CONFIG_ID = "config_id";
    public static final String CREDENTIAL = "cred";
    public static final String LOG_TAG = "FalcoACSProvider";
    public static final String PROJECT_NAME = "LOG_Falco";
    public static final String TAG = "tag";
    public static final int TOKEN_FETCH_TIMEOUT = 5000;
    public static final byte[] sData = new byte[0];
    public 1BY _UL_mInjectionContext;
    public Context mContext;
    public C4Cc mFalcoAnonCredProvider;
    public C4S0 mRedeemableToken;
    public boolean mInit = false;
    public C00i mExecutorService = new 1BQ(16477);

    public FalcoACSProvider(Context context) {
        this.mContext = context;
    }

    private void reedemToken(CountDownLatch countDownLatch) {
        this.mFalcoAnonCredProvider.A00(new 3bU(this, countDownLatch), sData);
    }

    public String getClaim() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        reedemToken(countDownLatch);
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            0fH.A0u(LOG_TAG, "timeout when redeeming token", e);
        }
        C4S0 c4s0 = this.mRedeemableToken;
        if (c4s0 != null) {
            return String.format(ACS_TOKEN_FORMAT_STRING, c4s0.A02, Base64.encodeToString(c4s0.A04, 2), Base64.encodeToString(this.mRedeemableToken.A06, 2));
        }
        return null;
    }

    public void init() {
        if (this.mInit) {
            return;
        }
        1Fi r303 = null;
        try {
            r303 = new 01V(this.mContext.getApplicationContext()).A00().A00("falco_anon_cred_provider");
        } catch (IllegalStateException e) {
            0fH.A0u(LOG_TAG, "Failed to create LSP store.", e);
        }
        1Fw.A04((1EZ) 1Bn.A0E(this.mContext, (1BY) null, 16428));
        1Vd A02 = ((DKN) 1Bn.A0E(this.mContext, (1BY) null, 68643)).A02();
        C00i c00i = this.mExecutorService;
        c00i.getClass();
        4CZ r0 = new 4CZ(A02, (ExecutorService) c00i.get());
        1Vd A022 = ((DKN) 1Bn.A0E(this.mContext, (1BY) null, 68643)).A02();
        C00i c00i2 = this.mExecutorService;
        c00i2.getClass();
        C4Cb c4Cb = new C4Cb(A022, (ExecutorService) c00i2.get()) { // from class: X.4Ca
        };
        ((DKN) 1Bn.A0E(this.mContext, (1BY) null, 68643)).A02();
        C00i c00i3 = this.mExecutorService;
        c00i3.getClass();
        c00i3.get();
        this.mFalcoAnonCredProvider = new C4Cc(r303, c4Cb, r0, PROJECT_NAME);
        this.mInit = true;
    }

    public boolean isACSEnabled() {
        return true;
    }
}
