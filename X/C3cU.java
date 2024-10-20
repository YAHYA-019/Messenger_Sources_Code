package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3cU, reason: invalid class name */
/* loaded from: 3cU.class */
public final class C3cU implements C3mM {
    public final long A00;
    public final long A01;
    public final C5hm A02;
    public final String A03;
    public final String A04;

    public C3cU(C5hm c5hm, String str, String str2, long j, long j2) {
        this.A02 = c5hm;
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j2;
    }

    @Override // X.InterfaceC04714br
    public boolean BTb(int i) {
        throw 0Q8.createAndThrow();
    }

    @Override // X.C3mM
    public boolean BVm(String str) {
        long j = this.A00;
        boolean z = false;
        if (j > 0 && (this.A01 + str.hashCode()) % j == 0) {
            z = true;
        }
        return z;
    }

    @Override // X.C3mM
    public void BsJ(String str, String str2, String str3) {
        if (BVm(str)) {
            C5hm c5hm = this.A02;
            c5hm.A03.execute(new SBw(new RO9(this.A03, this.A04, str, "__key_size", str3, 2), c5hm));
        }
    }

    @Override // X.InterfaceC04714br
    public void C0R(String str, int i, java.util.Map map) {
        if (BVm(str)) {
            C5hm c5hm = this.A02;
            c5hm.A03.execute(new SBw(new RO9(this.A03, this.A04, str, "__get", "", i), c5hm));
        }
    }

    @Override // X.InterfaceC04714br
    public void C1w(String str, int i, java.util.Map map) {
        if (BVm(str)) {
            String str2 = (i & 8) == 8 ? "refresh" : "";
            C5hm c5hm = this.A02;
            c5hm.A03.execute(new SBw(new RO9(this.A03, this.A04, str, "__insert", str2, i), c5hm));
        }
    }

    @Override // X.InterfaceC04714br
    public void CGM(int i, int i2, String str, java.util.Map map) {
        if (BVm(str)) {
            String A00 = i != 0 ? i != 2 ? i != 3 ? "unknown" : JQw.A00(18) : "stale" : PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            C5hm c5hm = this.A02;
            c5hm.A03.execute(new SBw(new RO9(this.A03, this.A04, str, "__remove", A00, i2), c5hm));
        }
    }
}
