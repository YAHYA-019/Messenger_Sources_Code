package androidx.credentials.playservices.controllers.BeginSignIn;

import X.0CL;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.3F8;
import X.7zT;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C00m;
import X.C2971Jf0;
import X.C2972Jf1;
import X.C2977Jf6;
import X.C3o5;
import X.JQx;
import X.JfP;
import X.K2N;
import X.KQm;
import X.Kdv;
import X.Kdw;
import X.Kgc;
import X.Lc8;
import X.MI4;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CredentialProviderBeginSignInController.class */
public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignIn";
    public MI4 callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* loaded from: CredentialProviderBeginSignInController$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            11T.A0F(context, 0);
            return new CredentialProviderBeginSignInController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
        final Handler A07 = AnonymousClass001.A07();
        this.resultReceiver = new ResultReceiver(A07) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                11T.A0F(bundle, 1);
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
                if (credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderBeginSignInController.getExecutor(), CredentialProviderBeginSignInController.this.getCallback(), CredentialProviderBeginSignInController.this.cancellationSignal)) {
                    return;
                }
                CredentialProviderBeginSignInController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final C2977Jf6 createGoogleIdCredential(SignInCredential signInCredential) {
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = signInCredential.A02;
        11T.A0A(str5);
        String str6 = signInCredential.A07;
        11T.A0D(str6);
        11T.A0F(str6, 0);
        String str7 = signInCredential.A03;
        if (str7 != null) {
            str = str7;
        }
        String str8 = signInCredential.A04;
        if (str8 != null) {
            str3 = str8;
        }
        String str9 = signInCredential.A05;
        if (str9 != null) {
            str2 = str9;
        }
        String str10 = signInCredential.A08;
        if (str10 != null) {
            str4 = str10;
        }
        Uri uri2 = signInCredential.A00;
        if (uri2 != null) {
            uri = uri2;
        }
        return new C2977Jf6(uri, str5, str6, str, str2, str3, str4);
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        11T.A0F(context, 0);
        return new CredentialProviderBeginSignInController(context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public BeginSignInRequest convertRequestToPlayServices(Kgc kgc) {
        11T.A0F(kgc, 0);
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(kgc, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public Kdw convertResponseToCredentialManager(SignInCredential signInCredential) {
        Kdv c2971Jf0;
        11T.A0F(signInCredential, 0);
        String str = signInCredential.A06;
        if (str != null) {
            String str2 = signInCredential.A02;
            11T.A0A(str2);
            Bundle A05 = 1BK.A05();
            A05.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            A05.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            c2971Jf0 = new C2972Jf1(A05, str2, str);
        } else if (signInCredential.A07 != null) {
            c2971Jf0 = createGoogleIdCredential(signInCredential);
        } else {
            if (signInCredential.A01 == null) {
                Log.w(TAG, "Credential returned but no google Id or password or passkey found");
                throw JfP.A00("When attempting to convert get response, null credential found");
            }
            String assertPasskeyResponse = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(signInCredential);
            Bundle A052 = 1BK.A05();
            A052.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", assertPasskeyResponse);
            c2971Jf0 = new C2971Jf0(assertPasskeyResponse, A052);
        }
        return new Kdw(c2971Jf0);
    }

    public final MI4 getCallback() {
        MI4 mi4 = this.callback;
        if (mi4 != null) {
            return mi4;
        }
        11T.A0L("callback");
        throw 0Q8.createAndThrow();
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        11T.A0L("executor");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.Lc8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, boolean] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CancellationSignal cancellationSignal;
        C00m credentialProviderBeginSignInController$handleResponse$6;
        KQm kQm;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 0Pz.A0C(i3, i, "Returned request code ", " which  does not match what was given "));
            return;
        }
        ?? maybeReportErrorResultCodeGet = CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal);
        if (maybeReportErrorResultCodeGet == 0) {
            try {
                Context context = this.context;
                AbstractC00481b7.A02(context);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(new K2N(context, (Lc8) new Object()).A00(intent))));
            } catch (3F8 e) {
                ?? obj = new Object();
                ((0CL) obj).element = JfP.A00(e.getMessage());
                int i4 = e.mStatus.A00;
                if (i4 != 16) {
                    if (JQx.A1Y(CredentialProviderBaseController.retryables, i4)) {
                        kQm = new KQm("android.credentials.GetCredentialException.TYPE_INTERRUPTED", e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, obj));
                }
                kQm = new KQm("android.credentials.GetCredentialException.TYPE_USER_CANCELED", e.getMessage());
                ((0CL) obj).element = kQm;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, obj));
            } catch (KQm e2) {
                cancellationSignal = this.cancellationSignal;
                credentialProviderBeginSignInController$handleResponse$6 = new CredentialProviderBeginSignInController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderBeginSignInController$handleResponse$6);
            } catch (Throwable unused) {
                JfP A00 = JfP.A00(maybeReportErrorResultCodeGet.getMessage());
                cancellationSignal = this.cancellationSignal;
                credentialProviderBeginSignInController$handleResponse$6 = new CredentialProviderBeginSignInController$handleResponse$6(this, A00);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderBeginSignInController$handleResponse$6);
            }
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(Kgc kgc, MI4 mi4, Executor executor, CancellationSignal cancellationSignal) {
        7zT.A1S(kgc, mi4, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = mi4;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        BeginSignInRequest convertRequestToPlayServices = convertRequestToPlayServices(kgc);
        Intent A0D = C3o5.A0D(this.context, HiddenActivity.class);
        A0D.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, A0D, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        try {
            this.context.startActivity(A0D);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderBeginSignInController$invokePlayServices$1(this));
        }
    }

    public final void setCallback(MI4 mi4) {
        11T.A0F(mi4, 0);
        this.callback = mi4;
    }

    public final void setExecutor(Executor executor) {
        11T.A0F(executor, 0);
        this.executor = executor;
    }
}
