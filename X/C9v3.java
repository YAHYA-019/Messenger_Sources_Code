package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.extensions.common.ExtensionParams;
import java.util.HashMap;

/* renamed from: X.9v3, reason: invalid class name */
/* loaded from: 9v3.class */
public final class C9v3 implements AXn {
    public final /* synthetic */ 6Jd A00;
    public final /* synthetic */ ExtensionParams A01;

    public C9v3(6Jd r302, ExtensionParams extensionParams) {
        this.A00 = r302;
        this.A01 = extensionParams;
    }

    @Override // X.AXn
    public void onSuccess() {
        ExtensionParams extensionParams = this.A01;
        if (!extensionParams.A0C) {
            6Jd r0 = this.A00;
            if (1XU.A00(r0.A01)) {
                Intent A00 = r0.A05.A00(r0.A01, extensionParams.A07);
                A00.putExtra("extra_extension_params", extensionParams);
                0LS.A0A(r0.A01, A00);
                return;
            }
        }
        6Jd r02 = this.A00;
        06Z r03 = r02.A02;
        if (r03 == null || r03.A0B) {
            return;
        }
        C06c A0G = 7zL.A0G(r03);
        int i = r02.A00;
        2KE r04 = 6Nz.A0b;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("params", extensionParams);
        6Nz r05 = new 6Nz();
        r05.setArguments(A05);
        A0G.A0Q(r05, "extension_container_fragment", i);
        A0G.A05();
        6Jf r06 = r02.A06;
        BP7 bp7 = extensionParams.A06;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, bp7.name);
        6Jf.A00(r06, "messenger_mini_app_opened", A0u);
    }
}
