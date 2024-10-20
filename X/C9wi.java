package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.9wi, reason: invalid class name */
/* loaded from: 9wi.class */
public final class C9wi implements C7yh {
    public final 1Br A01 = 7zM.A0U();
    public final 1Br A00 = 1Bu.A00(68347);
    public final MfU A02 = MfU.A0i;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9Zq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.AYf, java.lang.Object] */
    @Override // X.C7yh
    public C9c2 AKN(5vW r302) {
        ?? obj = new Object();
        obj.A00((AYf) new Object());
        MfU mfU = this.A02;
        ((9Zq) obj).A05 = mfU;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mfU);
        ((9Zq) obj).A03 = 2131959612;
        ((9Zq) obj).A00 = 2130971610;
        ((9Zq) obj).A02 = 7zP.A0S(this.A01).A03(C1u3.A6V);
        return new C9c2(obj);
    }

    @Override // X.C7yh
    public MfU BHV() {
        return this.A02;
    }

    @Override // X.C7yh
    public boolean BRz(Capabilities capabilities, C5fv c5fv) {
        8Nt AxW;
        11T.A0F(c5fv, 0);
        C9K3 c9k3 = (C9K3) 1Br.A0B(this.A00);
        if (!(c5fv instanceof C5n8)) {
            return false;
        }
        C5fu c5fu = (C5fu) c5fv;
        boolean z = false;
        if (c5fu == null || (AxW = c5fu.AxW(C5kq.A00)) == null) {
            return false;
        }
        if (AxW.A01 != null) {
            z = 7zR.A1W(1Br.A07(c9k3.A00), 36324909244305606L);
        }
        return z;
    }
}
