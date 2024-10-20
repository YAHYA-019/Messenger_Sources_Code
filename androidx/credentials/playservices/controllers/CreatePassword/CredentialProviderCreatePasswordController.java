package androidx.credentials.playservices.controllers.CreatePassword;

import X.04S;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.7zT;
import X.AnonymousClass001;
import X.C2966Jev;
import X.C2968Jex;
import X.C3o5;
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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CredentialProviderCreatePasswordController.class */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePassword";
    public MI4 callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* loaded from: CredentialProviderCreatePasswordController$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            11T.A0F(context, 0);
            return new CredentialProviderCreatePasswordController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
        final Handler A07 = AnonymousClass001.A07();
        this.resultReceiver = new ResultReceiver(A07) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                String str;
                11T.A0F(bundle, 1);
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = credentialProviderCreatePasswordController.executor;
                if (executor == null) {
                    str = "executor";
                } else {
                    MI4 mi4 = credentialProviderCreatePasswordController.callback;
                    if (mi4 != null) {
                        if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, mi4, credentialProviderCreatePasswordController.cancellationSignal)) {
                            return;
                        }
                        CredentialProviderCreatePasswordController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
                        return;
                    }
                    str = "callback";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        11T.A0F(context, 0);
        return new CredentialProviderCreatePasswordController(context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SavePasswordRequest convertRequestToPlayServices(C2966Jev c2966Jev) {
        11T.A0F(c2966Jev, 0);
        return new SavePasswordRequest(new SignInPassword(c2966Jev.A00, c2966Jev.A01), null, 0);
    }

    public Kdu convertResponseToCredentialManager(04S r302) {
        return new C2968Jex();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new C2968Jex();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, 0Pz.A0C(i3, i, "Returned request code ", " which does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new C2968Jex()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C2966Jev c2966Jev, MI4 mi4, Executor executor, CancellationSignal cancellationSignal) {
        7zT.A1S(c2966Jev, mi4, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = mi4;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        SavePasswordRequest convertRequestToPlayServices = convertRequestToPlayServices(c2966Jev);
        Intent A0D = C3o5.A0D(this.context, HiddenActivity.class);
        A0D.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, A0D, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        try {
            this.context.startActivity(A0D);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePasswordController$invokePlayServices$1(this));
        }
    }
}
