package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;

/* loaded from: G2f.class */
public final class G2f implements Runnable {
    public static final String __redex_internal_original_name = "PhotosUploadAuthOperationHandler$onAuthCompleteInternal$1";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ EnC A01;

    public G2f(AuthenticationResult authenticationResult, EnC enC) {
        this.A00 = authenticationResult;
        this.A01 = enC;
    }

    @Override // java.lang.Runnable
    public void run() {
        1Bq r0 = 1Bq.A00;
        ((GIN) 1Bq.A01(180573)).AB4(this.A00, this.A01);
    }
}
