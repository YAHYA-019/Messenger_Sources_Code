package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.7zT;
import X.AnonymousClass001;
import X.C00m;
import X.C2965Jeu;
import X.C2969Jey;
import X.C3002Jfq;
import X.C3005Jft;
import X.C3o5;
import X.JfU;
import X.KQl;
import X.Kdu;
import X.MI4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController.class */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePublicKey";
    public MI4 callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* loaded from: CredentialProviderCreatePublicKeyCredentialController$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            11T.A0F(context, 0);
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
        final Handler A07 = AnonymousClass001.A07();
        this.resultReceiver = new ResultReceiver(A07) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                String str;
                11T.A0F(bundle, 1);
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor == null) {
                    str = "executor";
                } else {
                    MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
                    if (mi4 != null) {
                        if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, mi4, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
                            return;
                        }
                        CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
                        return;
                    }
                    str = "callback";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3005Jft JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        return (message == null || message.length() <= 0) ? C3005Jft.A00(new JfU(), "Unknown error") : C3005Jft.A00(new JfU(), message);
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        11T.A0F(context, 0);
        return new CredentialProviderCreatePublicKeyCredentialController(context);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        11T.A0F(credentialProviderCreatePublicKeyCredentialController, 0);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(C3005Jft.A00(new C3002Jfq(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C2965Jeu c2965Jeu) {
        11T.A0F(c2965Jeu, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(c2965Jeu);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public Kdu convertResponseToCredentialManager(PublicKeyCredential publicKeyCredential) {
        11T.A0F(publicKeyCredential, 0);
        try {
            String A02 = publicKeyCredential.A02();
            11T.A0A(A02);
            Bundle A05 = 1BK.A05();
            A05.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", A02);
            return new C2969Jey(A02, A05);
        } catch (Throwable th) {
            throw new KQl("android.credentials.CreateCredentialException.TYPE_UNKNOWN", 0Pz.A1B("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal;
        C00m credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
        C00m c00m;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 0Pz.A0C(i3, i, "Returned request code ", " does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor == null) {
                11T.A0L("executor");
                throw 0Q8.createAndThrow();
            }
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) SafeParcelableSerializer.A00(PublicKeyCredential.CREATOR, byteArrayExtra);
        11T.A0A(publicKeyCredential);
        KQl publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(publicKeyCredential);
        if (publicKeyCredentialResponseContainsError == null) {
            try {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredential)));
                return;
            } catch (JSONException e) {
                cancellationSignal = this.cancellationSignal;
                credentialProviderCreatePublicKeyCredentialController$handleResponse$7 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                c00m = credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, c00m);
            } catch (Throwable th) {
                cancellationSignal = this.cancellationSignal;
                credentialProviderCreatePublicKeyCredentialController$handleResponse$7 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                c00m = credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, c00m);
            }
        }
        cancellationSignal = this.cancellationSignal;
        c00m = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, c00m);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C2965Jeu c2965Jeu, MI4 mi4, Executor executor, CancellationSignal cancellationSignal) {
        C00m credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2;
        7zT.A1S(c2965Jeu, mi4, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = mi4;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convert = PublicKeyCredentialControllerUtility.Companion.convert(c2965Jeu);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent A0D = C3o5.A0D(this.context, HiddenActivity.class);
            A0D.putExtra(CredentialProviderBaseController.REQUEST_TAG, convert);
            generateHiddenActivityIntent(this.resultReceiver, A0D, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(A0D);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
            }
        } catch (JSONException e) {
            credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2);
        } catch (Throwable th) {
            credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2);
        }
    }
}
