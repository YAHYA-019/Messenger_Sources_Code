package X;

import java.util.List;
import org.json.JSONObject;

/* loaded from: H2d.class */
public final class H2d extends 6TJ implements JNi {
    public final int A00 = 0;
    public final Object A01;

    public H2d(6UF r302) {
        this.A01 = r302;
    }

    public H2d(Hzy hzy) {
        this.A01 = hzy;
    }

    private final void A06() {
        Hzy hzy = (Hzy) this.A01;
        Hzy hzy2 = Hzy.$redex_init_class;
        GRI gri = hzy.A06.A00;
        if (AnonymousClass001.A1V(gri.A00(I2H.A0D)) || AnonymousClass001.A1V(gri.A00(I2H.A06))) {
            hzy.A04.CBz(hzy.A07);
        } else {
            hzy.A04.Bij(hzy.A07);
        }
    }

    public Class A04() {
        return this.A00 != 0 ? 6UE.class : C6cn.class;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        if (this.A00 == 0) {
            C6cn c6cn = (C6cn) r302;
            11T.A0F(c6cn, 0);
            ((6UF) this.A01).BwO(c6cn);
        } else {
            6UE r0 = (6UE) r302;
            11T.A0F(r0, 0);
            if (r0.A01 == 6UR.A06) {
                A06();
            }
        }
    }

    @Override // X.JNi
    public /* synthetic */ void Bh7() {
    }

    @Override // X.JNi
    public /* synthetic */ void BiI() {
    }

    @Override // X.JNi
    public /* synthetic */ void Bij(String str) {
    }

    @Override // X.JNi
    public /* synthetic */ void Bk3(String str) {
    }

    @Override // X.JNi
    public /* synthetic */ void BkB(6Uz r302, 6Uz r303) {
    }

    @Override // X.JNi
    public /* synthetic */ void BkD(boolean z) {
    }

    @Override // X.JNi
    public /* synthetic */ void BsF(List list) {
    }

    @Override // X.JNi
    public /* synthetic */ void BsL(List list) {
    }

    @Override // X.JNi
    public void Bwb(HBL hbl, HCA hca, String str, String str2) {
        if (this.A00 == 0) {
            11T.A0H(str, hbl);
            11T.A0F(hca, 3);
            ((6UF) this.A01).BwO(new C6cn(hbl, hca, str, str2));
        }
    }

    @Override // X.JNi
    public /* synthetic */ void Byx() {
    }

    @Override // X.JNi
    public /* synthetic */ void Byy() {
    }

    @Override // X.JNi
    public /* synthetic */ void Byz() {
    }

    @Override // X.JNi
    public /* synthetic */ void C1D(IRA ira) {
    }

    @Override // X.JNi
    public /* synthetic */ void C22(byte[] bArr, long j, long j2) {
    }

    @Override // X.JNi
    public /* synthetic */ void C23(String str, JSONObject jSONObject) {
    }

    @Override // X.JNi
    public /* synthetic */ void C3c(boolean z) {
    }

    @Override // X.JNi
    public /* synthetic */ void C3e(boolean z) {
    }

    @Override // X.JNi
    public /* synthetic */ void C9Y(HBL hbl, HCA hca, boolean z) {
    }

    @Override // X.JNi
    public /* synthetic */ void CBz(String str) {
    }

    @Override // X.JNi
    public /* synthetic */ void CCd(C52j c52j, HBj hBj, String str) {
        if (this.A00 != 0) {
            11T.A0F(hBj, 1);
            if (hBj == HBj.A07) {
                A06();
            }
        }
    }

    @Override // X.JNi
    public /* synthetic */ void CDb() {
    }

    @Override // X.JNi
    public /* synthetic */ void CG9(C52j c52j) {
    }

    @Override // X.JNi
    public /* synthetic */ void CMh() {
    }

    @Override // X.JNi
    public /* synthetic */ void CNc(List list) {
    }

    @Override // X.JNi
    public /* synthetic */ void CNh() {
    }

    @Override // X.JNi
    public /* synthetic */ void CO5(String str) {
    }

    @Override // X.JNi
    public /* synthetic */ void CP9(String str) {
    }

    @Override // X.JNi
    public /* synthetic */ void CPG() {
    }

    @Override // X.JNi
    public /* synthetic */ void CPJ() {
    }

    @Override // X.JNi
    public /* synthetic */ void CU2() {
    }

    @Override // X.JNi
    public /* synthetic */ void CUN(int i, int i2, boolean z, boolean z2) {
    }

    @Override // X.JNi
    public /* synthetic */ void CUO(String str, String str2) {
    }
}
