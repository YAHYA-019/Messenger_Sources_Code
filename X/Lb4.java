package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: Lb4.class */
public final class Lb4 implements 6Zm, 6YW {
    public 6YW A00;
    public 6YO A02;
    public final 6Zm[] A04;
    public final MCl A05;
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final HashMap A07 = AnonymousClass001.A0u();
    public 6Zn A01 = new LbH(new 6Zn[0]);
    public final IdentityHashMap A08 = new IdentityHashMap();
    public 6Zm[] A03 = new 6Zm[0];

    public Lb4(MCl mCl, long[] jArr, 6Zm... r304) {
        this.A05 = mCl;
        this.A04 = r304;
        int i = 0;
        do {
            long j = jArr[i];
            if (j != 0) {
                this.A04[i] = new Lb3(r304[i], j);
            }
            i++;
        } while (i < 2);
    }

    public void AEE(long j) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            this.A01.AEE(j);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((6Zn) arrayList.get(i2)).AEE(j);
            i = i2 + 1;
        }
    }

    public boolean AHs(long j, long j2) {
        boolean AHs;
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            AHs = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                ((6Zm) arrayList.get(i2)).AHs(j, j2);
                i = i2 + 1;
            }
        } else {
            AHs = this.A01.AHs(j, j2);
        }
        return AHs;
    }

    public /* synthetic */ boolean AHt(KjS kjS) {
        return AHs(kjS.A01, kjS.A00);
    }

    public void ANV(long j, boolean z) {
        6Zm[] r0 = this.A03;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].ANV(j, z);
            i = i2 + 1;
        }
    }

    public long AW2(6Vl r302, long j) {
        6Zm[] r305 = this.A03;
        if (r305.length <= 0) {
            r305 = this.A04;
        }
        return r305[0].AW2(r302, j);
    }

    public long AaC(long j) {
        return this.A01.AaC(j);
    }

    public long AaF() {
        return this.A01.AaF();
    }

    public long AzC() {
        return this.A01.AzC();
    }

    public 6YO BGj() {
        6YO r0 = this.A02;
        r0.getClass();
        return r0;
    }

    public boolean BTn() {
        return this.A01.BTn();
    }

    public void Bdl() {
        6Zm[] r0 = this.A04;
        int i = 0;
        do {
            r0[i].Bdl();
            i++;
        } while (i < 2);
    }

    public /* bridge */ /* synthetic */ void Brb(6Zn r302) {
        6YW r0 = this.A00;
        r0.getClass();
        r0.Brb(this);
    }

    public void CDa(6Zm r302) {
        ArrayList arrayList = this.A06;
        arrayList.remove(r302);
        if (arrayList.isEmpty()) {
            6Zm[] r0 = this.A04;
            int i = 0;
            int i2 = 0;
            do {
                i2 += r0[i].BGj().A01;
                i++;
            } while (i < 2);
            6YP[] r02 = new 6YP[i2];
            int i3 = 0;
            int i4 = 0;
            do {
                6YO BGj = r0[i3].BGj();
                int i5 = BGj.A01;
                int i6 = 0;
                while (i6 < i5) {
                    6YP r03 = (6YP) BGj.A02.get(i6);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append(i3);
                    A0k.append(":");
                    6YP r04 = new 6YP(AnonymousClass001.A0d(r03.A03, A0k), r03.A04);
                    this.A07.put(r04, r03);
                    r02[i4] = r04;
                    i6++;
                    i4++;
                }
                i3++;
            } while (i3 < 2);
            this.A02 = new 6YO(r02);
            6YW r05 = this.A00;
            r05.getClass();
            r05.CDa(this);
        }
    }

    public long CYF(long j) {
        return 0L;
    }

    public void CYa(6YW r302, long j) {
        this.A00 = r302;
        ArrayList arrayList = this.A06;
        6Zm[] r0 = this.A04;
        Collections.addAll(arrayList, r0);
        int i = 0;
        do {
            r0[i].CYa(this, j);
            i++;
        } while (i < 2);
    }

    public long Cb0() {
        6Zm r0;
        6Zm[] r02 = this.A03;
        int length = r02.length;
        long j = -9223372036854775807L;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return j;
            }
            6Zm r03 = r02[i2];
            long Cb0 = r03.Cb0();
            if (Cb0 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    6Zm[] r04 = this.A03;
                    int length2 = r04.length;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= length2 || (r0 = r04[i4]) == r03) {
                            break;
                        }
                        if (r0.CkG(Cb0, false) != Cb0) {
                            throw AnonymousClass001.A0N("Unexpected child seekToUs result.");
                        }
                        i3 = i4 + 1;
                    }
                    j = Cb0;
                } else if (Cb0 != j) {
                    throw AnonymousClass001.A0N("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && r03.CkG(j, false) != j) {
                throw AnonymousClass001.A0N("Unexpected child seekToUs result.");
            }
            i = i2 + 1;
        }
    }

    public void Cbp(long j) {
        this.A01.Cbp(j);
    }

    public long CkG(long j, boolean z) {
        long CkG = this.A03[0].CkG(j, z);
        int i = 1;
        while (true) {
            int i2 = i;
            6Zm[] r0 = this.A03;
            if (i2 >= r0.length) {
                return CkG;
            }
            if (r0[i2].CkG(CkG, z) != CkG) {
                throw AnonymousClass001.A0N("Unexpected child seekToUs result.");
            }
            i = i2 + 1;
        }
    }

    public long CkN(6Zf[] r302, 6Y9[] r303, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = j;
        int length = r303.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            6Zf r0 = r302[i2];
            Number number = r0 != null ? (Number) this.A08.get(r0) : null;
            int i3 = -1;
            iArr[i2] = number == null ? -1 : number.intValue();
            6Y9 r02 = r303[i2];
            if (r02 != null) {
                String str = r02.BGi().A03;
                i3 = JR0.A0P(str, 0, str.indexOf(":"));
            }
            iArr2[i2] = i3;
            i2++;
        }
        IdentityHashMap identityHashMap = this.A08;
        identityHashMap.clear();
        6Zf[] r03 = new 6Zf[length];
        6Zf[] r04 = new 6Zf[length];
        6Y9[] r05 = new 6Y9[length];
        6Zm[] r06 = this.A04;
        ArrayList A0t = AnonymousClass001.A0t(2);
        do {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= length) {
                    break;
                }
                r04[i5] = iArr[i5] == i ? r302[i5] : null;
                if (iArr2[i5] == i) {
                    6Y9 r07 = r303[i5];
                    r07.getClass();
                    Object obj = this.A07.get(r07.BGi());
                    obj.getClass();
                    r05[i5] = new LbY((6YP) obj, r07);
                } else {
                    r05[i5] = null;
                }
                i4 = i5 + 1;
            }
            long CkN = r06[i].CkN(r04, r05, zArr, zArr2, j2);
            if (i == 0) {
                j2 = CkN;
            } else if (CkN != j2) {
                throw AnonymousClass001.A0N("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < length; i6++) {
                if (iArr2[i6] == i) {
                    6Zf r08 = r04[i6];
                    r08.getClass();
                    r03[i6] = r04[i6];
                    AnonymousClass001.A1A(r08, identityHashMap, i);
                    z = true;
                } else if (iArr[i6] == i) {
                    6DP.A04(r04[i6] == null);
                }
            }
            if (z) {
                A0t.add(r06[i]);
            }
            i++;
        } while (i < 2);
        System.arraycopy(r03, 0, r302, 0, length);
        6Zm[] r09 = (6Zm[]) A0t.toArray(new 6Zm[0]);
        this.A03 = r09;
        this.A01 = new LbH(r09);
        return j2;
    }

    public void Csi(boolean z) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            this.A01.Csi(z);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((6Zn) arrayList.get(i2)).Csi(z);
            i = i2 + 1;
        }
    }

    public boolean D4i(long j) {
        return false;
    }

    public boolean D4j() {
        return false;
    }

    public boolean D4k(long j) {
        return false;
    }

    public void D4l() {
    }

    public void D7G(byte b, boolean z) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            this.A01.D7G(b, z);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((6Zn) arrayList.get(i2)).D7G(b, z);
            i = i2 + 1;
        }
    }
}
