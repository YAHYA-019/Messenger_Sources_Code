package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.extensions.common.ExtensionParams;
import java.util.HashMap;

/* renamed from: X.9v4, reason: invalid class name */
/* loaded from: 9v4.class */
public final class C9v4 implements AXn {
    public final /* synthetic */ AXn A00;
    public final /* synthetic */ 6Nz A01;
    public final /* synthetic */ 6Jd A02;

    public C9v4(AXn aXn, 6Nz r303, 6Jd r304) {
        this.A02 = r304;
        this.A01 = r303;
        this.A00 = aXn;
    }

    @Override // X.AXn
    public void onSuccess() {
        Fragment fragment = this.A01;
        ExtensionParams extensionParams = ((6Nz) fragment).A0G;
        if (extensionParams != null) {
            6Jf r0 = this.A02.A06;
            BP7 bp7 = extensionParams.A06;
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, bp7.name);
            6Jf.A00(r0, "messenger_mini_app_dismissed", A0u);
            r0.A00.A0H(bp7.name, null);
        }
        06Z r02 = this.A02.A02;
        if (!r02.A0B) {
            C06c A0G = 7zL.A0G(r02);
            A0G.A0I(fragment);
            A0G.A05();
        }
        AXn aXn = this.A00;
        if (aXn != null) {
            aXn.onSuccess();
        }
    }
}
