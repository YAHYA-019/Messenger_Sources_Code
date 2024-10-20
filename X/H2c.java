package X;

import java.util.List;
import org.json.JSONObject;

/* loaded from: H2c.class */
public class H2c extends 6TJ implements JNi {
    public int A00;
    public long A01;
    public final 6UF A02;

    public H2c(6UF r302) {
        this.A02 = r302;
    }

    public Class A04() {
        return 6UE.class;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        HBj hBj;
        6UE r0 = (6UE) r302;
        11T.A0F(r0, 0);
        6UR r02 = r0.A01;
        if (r02 != null) {
            String str = r0.A02;
            switch (r02.ordinal()) {
                case 0:
                    hBj = HBj.A0B;
                    break;
                case 1:
                    hBj = HBj.A0C;
                    break;
                case 2:
                    hBj = HBj.A09;
                    break;
                case 3:
                    hBj = HBj.A03;
                    break;
                case 4:
                    hBj = HBj.A08;
                    break;
                case 5:
                    hBj = HBj.A0A;
                    break;
                case 6:
                    hBj = HBj.A02;
                    break;
                case 7:
                    hBj = HBj.A06;
                    break;
                case 8:
                    hBj = HBj.A05;
                    break;
                case 9:
                    hBj = HBj.A07;
                    break;
                case 10:
                    hBj = HBj.A04;
                    break;
                default:
                    throw 1BK.A1F();
            }
            CCd(r0.A00, hBj, str);
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
    public /* synthetic */ void Bwb(HBL hbl, HCA hca, String str, String str2) {
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
    public void CCd(C52j c52j, HBj hBj, String str) {
        11T.A0F(hBj, 1);
        if (hBj == HBj.A03) {
            this.A02.BlF();
            return;
        }
        if (hBj == HBj.A08) {
            this.A02.CBx(this.A01);
            return;
        }
        if (hBj == HBj.A02) {
            6UF r0 = this.A02;
            if (c52j == null) {
                c52j = C52j.A2Y;
            }
            r0.BlE(c52j);
            return;
        }
        if (hBj == HBj.A07) {
            this.A02.CO0(new C6cu(this.A00));
        } else {
            if (hBj == HBj.A05 || hBj != HBj.A09) {
                return;
            }
            this.A02.CTd();
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
