package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.jvm.functions.Function2;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.class */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$1 extends C00q implements Function2 {
    public static final CredentialProviderCreatePublicKeyCredentialController$handleResponse$1 INSTANCE = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$1();

    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (C00m) obj2);
        return 04S.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, C00m c00m) {
        11T.A0F(c00m, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, c00m);
    }
}