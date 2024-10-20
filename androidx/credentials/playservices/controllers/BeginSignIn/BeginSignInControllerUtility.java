package androidx.credentials.playservices.controllers.BeginSignIn;

import X.11T;
import X.1BL;
import X.AbstractC00481b7;
import X.AbstractC2973Jf2;
import X.AnonymousClass001;
import X.C2975Jf4;
import X.C2976Jf5;
import X.Kgc;
import X.Kkm;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BeginSignInControllerUtility.class */
public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignInUtility";

    /* loaded from: BeginSignInControllerUtility$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(AbstractC2973Jf2 abstractC2973Jf2) {
            throw AnonymousClass001.A0Q("getFilterByAuthorizedAccounts");
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            11T.A0A(context.getPackageManager());
            return r0.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j) {
            boolean z = true;
            if (j >= BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING) {
                z = false;
            }
            return z;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(Kgc kgc, Context context) {
            boolean A1X = 1BL.A1X(kgc, context);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, A1X, false);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(null, null, false);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            boolean z = false;
            boolean z2 = false;
            for (Kkm kkm : kgc.A00) {
                if (kkm instanceof C2976Jf5) {
                    passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(A1X);
                    if (!z) {
                        z = false;
                        if (kkm.A04) {
                        }
                    }
                    z = true;
                } else if ((kkm instanceof C2975Jf4) && !z2) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context));
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    C2975Jf4 c2975Jf4 = (C2975Jf4) kkm;
                    if (needsBackwardsCompatibleRequest) {
                        passkeysRequestOptions = companion.convertToPlayAuthPasskeyRequest(c2975Jf4);
                        AbstractC00481b7.A02(passkeysRequestOptions);
                    } else {
                        passkeyJsonRequestOptions = companion.convertToPlayAuthPasskeyJsonRequest(c2975Jf4);
                        AbstractC00481b7.A02(passkeyJsonRequestOptions);
                    }
                    z2 = true;
                }
            }
            return new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, null, 0, z, false);
        }
    }
}
