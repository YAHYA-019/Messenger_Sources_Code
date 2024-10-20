package androidx.credentials.playservices;

import X.0FI;
import X.0Pz;
import X.11T;
import X.1BK;
import X.28E;
import X.3F8;
import X.AbstractC00481b7;
import X.AnonymousClass289;
import X.C27w;
import X.C4Ez;
import X.C4F2;
import X.C4F3;
import X.C4F7;
import X.JQx;
import X.K2I;
import X.K2K;
import X.K2N;
import X.KdN;
import X.L2K;
import X.L7b;
import X.Lc7;
import X.Lc8;
import X.LcV;
import X.LcX;
import X.LcY;
import X.LcZ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: HiddenActivity.class */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Object();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    /* loaded from: HiddenActivity$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.Lc8, java.lang.Object] */
    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (beginSignInRequest == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
            return;
        }
        K2N k2n = new K2N(this, (Lc8) new Object());
        new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, true, false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.A01;
        AbstractC00481b7.A02(googleIdTokenRequestOptions);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.A04;
        AbstractC00481b7.A02(passwordRequestOptions);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.A03;
        AbstractC00481b7.A02(passkeysRequestOptions);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.A02;
        AbstractC00481b7.A02(passkeyJsonRequestOptions);
        BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, k2n.A00, beginSignInRequest.A00, beginSignInRequest.A06, beginSignInRequest.A07);
        L2K A00 = L7b.A00();
        A00.A03 = new Feature[]{JQx.A0g("auth_api_credentials_begin_sign_in", 8)};
        A00.A01 = new LcY(beginSignInRequest2, k2n);
        A00.A02 = false;
        C4Ez A002 = L2K.A00(k2n, A00, 1553, 0);
        final HiddenActivity$handleBeginSignIn$1$1 hiddenActivity$handleBeginSignIn$1$1 = new HiddenActivity$handleBeginSignIn$1$1(this, intExtra);
        C4F3 c4f3 = new C4F3() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
            @Override // X.C4F3
            public final void onSuccess(Object obj) {
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(Function1.this, obj);
            }
        };
        Executor executor = C4F7.A00;
        A002.A03(c4f3, executor);
        A002.A0A(new C4F2() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
            @Override // X.C4F2
            public final void onFailure(Exception exc) {
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(HiddenActivity.this, exc);
            }
        }, executor);
    }

    public static final void handleBeginSignIn$lambda$10$lambda$8(Function1 function1, Object obj) {
        11T.A0F(function1, 0);
        function1.invoke(obj);
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        11T.A0H(hiddenActivity, exc);
        String str = ((exc instanceof 3F8) && JQx.A1Y(CredentialProviderBaseController.retryables, ((3F8) exc).mStatus.A00)) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        11T.A0D(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, 0Pz.A1B("During begin sign in, failure response from one tap: ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Lc7, java.lang.Object] */
    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
            return;
        }
        K2K k2k = new K2K(this, (Lc7) new Object());
        SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.A01, k2k.A00, savePasswordRequest.A00);
        L2K A00 = L7b.A00();
        A00.A03 = new Feature[]{KdN.A04};
        A00.A01 = new LcX(savePasswordRequest2, k2k);
        A00.A02 = false;
        C4Ez A002 = L2K.A00(k2k, A00, 1536, 0);
        final HiddenActivity$handleCreatePassword$1$1 hiddenActivity$handleCreatePassword$1$1 = new HiddenActivity$handleCreatePassword$1$1(this, intExtra);
        C4F3 c4f3 = new C4F3() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
            @Override // X.C4F3
            public final void onSuccess(Object obj) {
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(Function1.this, obj);
            }
        };
        Executor executor = C4F7.A00;
        A002.A03(c4f3, executor);
        A002.A0A(new C4F2() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda7
            @Override // X.C4F2
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(HiddenActivity.this, exc);
            }
        }, executor);
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(Function1 function1, Object obj) {
        11T.A0F(function1, 0);
        function1.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        11T.A0H(hiddenActivity, exc);
        String str = ((exc instanceof 3F8) && JQx.A1Y(CredentialProviderBaseController.retryables, ((3F8) exc).mStatus.A00)) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        11T.A0D(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, 0Pz.A1B("During save password, found password failure response from one tap ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.28E, java.lang.Object] */
    private final void handleCreatePublicKeyCredential() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions == null) {
            Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
            return;
        }
        C27w c27w = new C27w((Activity) this, (AnonymousClass289) AnonymousClass289.A00, K2I.A00, (28E) new Object());
        L2K A00 = L7b.A00();
        A00.A01 = new LcV(c27w, publicKeyCredentialCreationOptions);
        A00.A00 = 5407;
        C4Ez A002 = C27w.A00(c27w, A00.A01(), 0);
        final HiddenActivity$handleCreatePublicKeyCredential$1$1 hiddenActivity$handleCreatePublicKeyCredential$1$1 = new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra);
        C4F3 c4f3 = new C4F3() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda0
            @Override // X.C4F3
            public final void onSuccess(Object obj) {
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(Function1.this, obj);
            }
        };
        Executor executor = C4F7.A00;
        A002.A03(c4f3, executor);
        A002.A0A(new C4F2() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
            @Override // X.C4F2
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity.this, exc);
            }
        }, executor);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(Function1 function1, Object obj) {
        11T.A0F(function1, 0);
        function1.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        11T.A0H(hiddenActivity, exc);
        String str = ((exc instanceof 3F8) && JQx.A1Y(CredentialProviderBaseController.retryables, ((3F8) exc).mStatus.A00)) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        11T.A0D(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, 0Pz.A1B("During create public key credential, fido registration failure: ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Lc8, java.lang.Object] */
    private final void handleGetSignInIntent() {
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
            return;
        }
        K2N k2n = new K2N(this, (Lc8) new Object());
        String str = getSignInIntentRequest.A01;
        AbstractC00481b7.A02(str);
        String str2 = getSignInIntentRequest.A04;
        GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, getSignInIntentRequest.A02, k2n.A00, str2, getSignInIntentRequest.A00, getSignInIntentRequest.A05);
        L2K A00 = L7b.A00();
        A00.A03 = new Feature[]{KdN.A05};
        A00.A01 = new LcZ(getSignInIntentRequest2, k2n);
        C4Ez A002 = L2K.A00(k2n, A00, 1555, 0);
        final HiddenActivity$handleGetSignInIntent$1$1 hiddenActivity$handleGetSignInIntent$1$1 = new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra);
        C4F3 c4f3 = new C4F3() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
            @Override // X.C4F3
            public final void onSuccess(Object obj) {
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(Function1.this, obj);
            }
        };
        Executor executor = C4F7.A00;
        A002.A03(c4f3, executor);
        A002.A0A(new C4F2() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
            @Override // X.C4F2
            public final void onFailure(Exception exc) {
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity.this, exc);
            }
        }, executor);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(Function1 function1, Object obj) {
        11T.A0F(function1, 0);
        function1.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        11T.A0H(hiddenActivity, exc);
        String str = ((exc instanceof 3F8) && JQx.A1Y(CredentialProviderBaseController.retryables, ((3F8) exc).mStatus.A00)) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        11T.A0D(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, 0Pz.A1B("During get sign-in intent, failure response from one tap: ", exc));
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle A05 = 1BK.A05();
        A05.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A05.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A05.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver.send((-1) >>> 1, A05);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A05 = 1BK.A05();
        A05.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A05.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A05.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i2, A05);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int A00 = 0FI.A00(836628341);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            i = 221249108;
        } else {
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                            handleBeginSignIn();
                            break;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                            handleCreatePublicKeyCredential();
                            break;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            handleCreatePassword();
                            break;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                            handleGetSignInIntent();
                            break;
                        }
                        break;
                }
                i = -2040202793;
            }
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
            i = -2040202793;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }
}
