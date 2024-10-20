package androidx.credentials.playservices;

import X.11T;
import X.1BL;
import X.7zR;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C00m;
import X.C2965Jeu;
import X.C2966Jev;
import X.C4Ez;
import X.C4F2;
import X.C4F3;
import X.C4F7;
import X.K2N;
import X.KRC;
import X.Kgc;
import X.Kjv;
import X.KoU;
import X.Lc8;
import X.MI4;
import X.MKe;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CredentialProviderPlayServicesImpl.class */
public final class CredentialProviderPlayServicesImpl implements MKe {
    public static final Companion Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public GoogleApiAvailability googleApiAvailability;

    /* loaded from: CredentialProviderPlayServicesImpl$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, C00m c00m) {
            11T.A0F(c00m, 1);
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            c00m.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(Kgc kgc) {
            11T.A0F(kgc, 0);
            Iterator it = kgc.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        11T.A0F(context, 1);
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        11T.A0A(googleApiAvailability);
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.A04(context, MIN_GMS_APK_VERSION);
    }

    public static final void onClearCredential$lambda$0(Function1 function1, Object obj) {
        11T.A0F(function1, 0);
        function1.invoke(obj);
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, MI4 mi4, Exception exc) {
        1BL.A11(2, executor, mi4, exc);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, mi4));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // X.MKe
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z = true;
        if (isGooglePlayServicesAvailable != 0) {
            z = false;
            Log.w(TAG, AnonymousClass001.A0Z(new ConnectionResult(isGooglePlayServicesAvailable), "Connection with Google Play Services was not successful. Connection result is: ", AnonymousClass001.A0k()));
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.Lc8, java.lang.Object] */
    @Override // X.MKe
    public void onClearCredential(KRC krc, final CancellationSignal cancellationSignal, final Executor executor, final MI4 mi4) {
        7zR.A1O(executor, mi4);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        AbstractC00481b7.A02(context);
        C4Ez A01 = new K2N(context, (Lc8) new Object()).A01();
        final CredentialProviderPlayServicesImpl$onClearCredential$1 credentialProviderPlayServicesImpl$onClearCredential$1 = new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, mi4);
        C4F3 c4f3 = new C4F3() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // X.C4F3
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(Function1.this, obj);
            }
        };
        Executor executor2 = C4F7.A00;
        A01.A03(c4f3, executor2);
        A01.A0A(new C4F2() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // X.C4F2
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, mi4, exc);
            }
        }, executor2);
    }

    @Override // X.MKe
    public void onCreateCredential(Context context, Kjv kjv, CancellationSignal cancellationSignal, Executor executor, MI4 mi4) {
        11T.A0F(context, 0);
        1BL.A11(1, kjv, executor, mi4);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (kjv instanceof C2966Jev) {
            new CredentialProviderCreatePasswordController(context).invokePlayServices((C2966Jev) kjv, mi4, executor, cancellationSignal);
        } else {
            if (!(kjv instanceof C2965Jeu)) {
                throw AnonymousClass001.A0q("Create Credential request is unsupported, not password or publickeycredential");
            }
            new CredentialProviderCreatePublicKeyCredentialController(context).invokePlayServices((C2965Jeu) kjv, mi4, executor, cancellationSignal);
        }
    }

    @Override // X.MKe
    public void onGetCredential(Context context, Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4) {
        11T.A0F(context, 0);
        1BL.A11(1, kgc, executor, mi4);
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        companion.isGetSignInIntentRequest$credentials_play_services_auth_release(kgc);
        new CredentialProviderBeginSignInController(context).invokePlayServices(kgc, mi4, executor, cancellationSignal);
    }

    @Override // X.MKe
    public /* synthetic */ void onGetCredential(Context context, KoU koU, CancellationSignal cancellationSignal, Executor executor, MI4 mi4) {
    }

    @Override // X.MKe
    public /* synthetic */ void onPrepareCredential(Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4) {
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        11T.A0F(googleApiAvailability, 0);
        this.googleApiAvailability = googleApiAvailability;
    }
}
