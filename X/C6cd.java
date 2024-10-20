package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.List;

/* renamed from: X.6cd, reason: invalid class name */
/* loaded from: 6cd.class */
public final class C6cd implements C6ce {
    public 6TI A00;
    public final 6cV A01;

    public C6cd(6cV r302) {
        this.A01 = r302;
    }

    @Override // X.C6ce
    public int AUv() {
        6cV r0 = this.A01;
        return r0.A02().A01(r0.A02, r0.A06);
    }

    @Override // X.C6ce
    public int AUw() {
        GRS A05;
        6cV r0 = this.A01;
        int i = 0;
        if (r0.A02 != null) {
            GRX A02 = r0.A02();
            String str = r0.A06;
            PlayerOrigin playerOrigin = r0.A02;
            11T.A0D(playerOrigin);
            if (A02.A01.get() && (A05 = A02.A05(playerOrigin, str)) != null) {
                i = A05.A0i();
            }
        }
        return i;
    }

    @Override // X.C6ce
    public List AYM() {
        GRX A02 = this.A01.A02();
        6TI r0 = this.A00;
        return A02.A08(B3c(), r0 != null ? r0.A03() : null);
    }

    public int Afn() {
        6cV r0 = this.A01;
        return r0.A02().A02(r0.A02, r0.A06);
    }

    @Override // X.C6ce
    public int AtE() {
        GRS A05;
        6cV r0 = this.A01;
        GRX A02 = r0.A02();
        String str = r0.A06;
        PlayerOrigin playerOrigin = r0.A02;
        int i = 0;
        if (str != null && playerOrigin != null && (A05 = A02.A05(playerOrigin, str)) != null) {
            i = A05.A0j();
        }
        return i;
    }

    @Override // X.C6ce
    public int Au9() {
        GRS A05;
        GRX A02 = this.A01.A02();
        6TI r0 = this.A00;
        String A03 = r0 != null ? r0.A03() : null;
        PlayerOrigin B3c = B3c();
        int i = 0;
        if (A02.A01.get() && A03 != null && B3c != null && (A05 = A02.A05(B3c, A03)) != null) {
            i = A05.A0k();
        }
        return i;
    }

    public PlayerOrigin B3c() {
        PlayerOrigin playerOrigin = this.A01.A02;
        if (playerOrigin == null) {
            playerOrigin = PlayerOrigin.A0g;
        }
        return playerOrigin;
    }

    public 6UR B3e() {
        GRS A04;
        GRD A00 = 6cV.A00(this.A01);
        return (A00 == null || (A04 = A00.A04()) == null) ? 6UR.A0B : A04.B3e();
    }

    public 6TN B3f() {
        return this.A01.A01;
    }

    public int BJL() {
        6cV r0 = this.A01;
        return r0.A02().A03(r0.A02, r0.A06);
    }

    @Override // X.C6ce
    public int BJO() {
        return 0;
    }

    @Override // X.C6ce
    public JQP BJW() {
        return null;
    }

    @Override // X.C6ce
    public VideoPlayerParams BJX() {
        6TI r0 = this.A00;
        if (r0 != null) {
            return r0.A03;
        }
        return null;
    }

    @Override // X.C6ce
    public int BJY() {
        return 0;
    }

    @Override // X.C6ce
    public Integer BJc() {
        return null;
    }

    @Override // X.C6ce
    public int BJu() {
        return 0;
    }

    @Override // X.C6ce
    public boolean BTk() {
        6cV r0 = this.A01;
        return r0.A02().A09(r0.A02, r0.A06);
    }

    @Override // X.C6ce
    public boolean BUR() {
        6cV r0 = this.A01;
        if (r0.A02 == null) {
            return false;
        }
        GRX A02 = r0.A02();
        String str = r0.A06;
        PlayerOrigin playerOrigin = r0.A02;
        11T.A0D(playerOrigin);
        return A02.A0A(playerOrigin, str);
    }

    @Override // X.C6ce
    public boolean BUs() {
        return false;
    }

    @Override // X.C6ce
    public boolean BV3() {
        6cV r0 = this.A01;
        return r0.A02().A0C(r0.A02, r0.A06);
    }

    @Override // X.C6ce
    public boolean BWU() {
        return false;
    }

    @Override // X.C6ce
    public boolean BWa() {
        6cV r0 = this.A01;
        return r0.A02().A0D(r0.A02, r0.A06);
    }

    public void CWm(C52j c52j) {
        6U2 A07;
        6cV r0 = this.A01;
        11T.A0F(c52j, 0);
        GRD A00 = 6cV.A00(r0);
        if (A00 == null || (A07 = A00.A07()) == null) {
            return;
        }
        A07.A06(new 6U9(c52j));
    }

    public void CXU(C52j c52j) {
        throw 0Q8.createAndThrow();
    }

    public void CkD(C52j c52j, int i) {
        6U2 A07;
        6cV r0 = this.A01;
        11T.A0F(c52j, 1);
        GRD A00 = 6cV.A00(r0);
        if (A00 == null || (A07 = A00.A07()) == null) {
            return;
        }
        A07.A06(new 6UA(c52j, i));
    }

    @Override // X.C6ce
    public void CqB(boolean z) {
        GRS A04;
        GRD A00 = 6cV.A00(this.A01);
        if (A00 == null || (A04 = A00.A04()) == null) {
            return;
        }
        A04.A19(z);
    }

    @Override // X.C6ce
    public void CqC(C52j c52j, boolean z) {
    }

    @Override // X.C6ce
    public void Ctr(6dG r302) {
    }

    @Override // X.C6ce
    public void D8N(6UR r302, String str, String str2) {
    }

    public boolean isPlaying() {
        6cV r0 = this.A01;
        return r0.A02().A0B(r0.A02, r0.A06);
    }
}
