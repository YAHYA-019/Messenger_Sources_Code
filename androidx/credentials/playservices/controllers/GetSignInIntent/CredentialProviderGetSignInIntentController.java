package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.0CL;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.3F8;
import X.7zT;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C00m;
import X.C2977Jf6;
import X.JQx;
import X.JfL;
import X.JfP;
import X.K2N;
import X.KQm;
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
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CredentialProviderGetSignInIntentController.class */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "GetSignInIntent";
    public MI4 callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* loaded from: CredentialProviderGetSignInIntentController$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            11T.A0F(context, 0);
            return new CredentialProviderGetSignInIntentController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
        final Handler A07 = AnonymousClass001.A07();
        this.resultReceiver = new ResultReceiver(A07) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                11T.A0F(bundle, 1);
                CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
                if (credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderGetSignInIntentController.getExecutor(), CredentialProviderGetSignInIntentController.this.getCallback(), CredentialProviderGetSignInIntentController.this.cancellationSignal)) {
                    return;
                }
                CredentialProviderGetSignInIntentController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        11T.A0F(context, 0);
        return new CredentialProviderGetSignInIntentController(context);
    }

    public GetSignInIntentRequest convertRequestToPlayServices(Kgc kgc) {
        11T.A0F(kgc, 0);
        List list = kgc.A00;
        if (list.size() != 1) {
            throw new KQm("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", "GetSignInWithGoogleOption cannot be combined with other options.");
        }
        11T.A0I(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        throw AnonymousClass001.A0Q("getServerClientId");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((Kgc) obj);
        throw 0Q8.createAndThrow();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public Kdw convertResponseToCredentialManager(SignInCredential signInCredential) {
        11T.A0F(signInCredential, 0);
        if (signInCredential.A07 != null) {
            return new Kdw(createGoogleIdCredential(signInCredential));
        }
        Log.w(TAG, "Credential returned but no google Id found");
        throw JfP.A00("When attempting to convert get response, null credential found");
    }

    public final C2977Jf6 createGoogleIdCredential(SignInCredential signInCredential) {
        11T.A0F(signInCredential, 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = signInCredential.A02;
        11T.A0A(str5);
        try {
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
        } catch (Exception unused) {
            throw JfP.A00("When attempting to convert get response, null Google ID Token found");
        }
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
        C00m credentialProviderGetSignInIntentController$handleResponse$6;
        KQm kQm;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 0Pz.A0C(i3, i, "Returned request code ", " which  does not match what was given "));
            return;
        }
        ?? maybeReportErrorResultCodeGet = CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal);
        if (maybeReportErrorResultCodeGet == 0) {
            try {
                Context context = this.context;
                AbstractC00481b7.A02(context);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new K2N(context, (Lc8) new Object()).A00(intent))));
            } catch (3F8 e) {
                ?? obj = new Object();
                ((0CL) obj).element = JfP.A00(e.getMessage());
                int i4 = e.mStatus.A00;
                if (i4 != 16) {
                    if (JQx.A1Y(CredentialProviderBaseController.retryables, i4)) {
                        kQm = new KQm("android.credentials.GetCredentialException.TYPE_INTERRUPTED", e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, obj));
                }
                kQm = new KQm("android.credentials.GetCredentialException.TYPE_USER_CANCELED", e.getMessage());
                ((0CL) obj).element = kQm;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, obj));
            } catch (KQm e2) {
                cancellationSignal = this.cancellationSignal;
                credentialProviderGetSignInIntentController$handleResponse$6 = new CredentialProviderGetSignInIntentController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderGetSignInIntentController$handleResponse$6);
            } catch (Throwable unused) {
                JfP A00 = JfP.A00(maybeReportErrorResultCodeGet.getMessage());
                cancellationSignal = this.cancellationSignal;
                credentialProviderGetSignInIntentController$handleResponse$6 = new CredentialProviderGetSignInIntentController$handleResponse$6(this, A00);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderGetSignInIntentController$handleResponse$6);
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
        try {
            convertRequestToPlayServices(kgc);
            throw 0Q8.createAndThrow();
        } catch (Exception e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, e instanceof JfL ? new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e) : new CredentialProviderGetSignInIntentController$invokePlayServices$2(this));
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
