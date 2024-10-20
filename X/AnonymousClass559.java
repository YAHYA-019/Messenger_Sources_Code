package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* renamed from: X.559, reason: invalid class name */
/* loaded from: 559.class */
public final class AnonymousClass559 implements 55A {
    public final C2p1 A00;

    public AnonymousClass559(C2p1 c2p1) {
        this.A00 = c2p1;
    }

    public boolean BVg(55A r302) {
        boolean z = false;
        if (r302.getClass() == AnonymousClass559.class) {
            C2p1 c2p1 = this.A00;
            String str = c2p1.A03;
            C2p1 c2p12 = ((AnonymousClass559) r302).A00;
            if (Objects.equal(str, c2p12.A03) && Objects.equal(c2p1.A02, c2p12.A02)) {
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        C2p1 c2p1 = this.A00;
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c2p1.A03);
        return 4YV.A0s(stringHelper, c2p1.A02, "members");
    }
}
