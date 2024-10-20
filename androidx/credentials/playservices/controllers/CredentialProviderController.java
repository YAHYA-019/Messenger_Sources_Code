package androidx.credentials.playservices.controllers;

import X.0CL;
import X.0Pz;
import X.11T;
import X.1BL;
import X.7zR;
import X.C00m;
import X.JfP;
import X.KQl;
import X.KQm;
import X.MI4;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CredentialProviderController.class */
public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Object();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    /* loaded from: CredentialProviderController$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C00m c00m) {
            11T.A0F(c00m, 1);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            c00m.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return 0Pz.A0d("activity with result code: ", " indicating not RESULT_OK", i);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.0CL] */
        public final boolean maybeReportErrorResultCodeCreate(int i, Function2 function2, Function1 function1, CancellationSignal cancellationSignal) {
            11T.A0G(function2, 1, function1);
            if (i == -1) {
                return false;
            }
            ?? obj = new Object();
            ((0CL) obj).element = new KQl("android.credentials.CreateCredentialException.TYPE_UNKNOWN", 0Pz.A0d("activity with result code: ", " indicating not RESULT_OK", i));
            if (i == 0) {
                ((0CL) obj).element = new KQl("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
            }
            function2.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(function1, obj));
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.0CL] */
        public final boolean maybeReportErrorResultCodeGet(int i, Function2 function2, Function1 function1, CancellationSignal cancellationSignal) {
            11T.A0G(function2, 1, function1);
            if (i == -1) {
                return false;
            }
            ?? obj = new Object();
            ((0CL) obj).element = JfP.A00(0Pz.A0d("activity with result code: ", " indicating not RESULT_OK", i));
            if (i == 0) {
                ((0CL) obj).element = new KQm("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
            }
            function2.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(function1, obj));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C00m c00m) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, c00m);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, Function2 function2, Function1 function1, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, function2, function1, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, Function2 function2, Function1 function1, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, function2, function1, cancellationSignal);
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, MI4 mi4, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, Function2 function2, Executor executor, MI4 mi4, CancellationSignal cancellationSignal) {
        boolean A1X = 1BL.A1X(bundle, function2);
        7zR.A1O(executor, mi4);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, mi4, function2.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return A1X;
    }
}
