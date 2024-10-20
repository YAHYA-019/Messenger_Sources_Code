package com.google.android.exoplayer2.extractor.mp4;

import X.0Pz;
import X.4YT;
import X.4YU;
import X.5My;
import X.6DP;
import X.6Yl;
import X.6Zo;
import X.6Zr;
import X.6aJ;
import X.6aM;
import X.6aO;
import X.6aP;
import X.6aT;
import X.6aU;
import X.6aW;
import X.6aX;
import X.AnonymousClass001;
import X.C6a5;
import X.DKC;
import X.DKD;
import X.KLu;
import X.KjP;
import X.Kqz;
import X.KuK;
import X.KwS;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: FragmentedMp4Extractor2.class */
public final class FragmentedMp4Extractor2 implements 6aM {
    public static final 6Yl A0X;
    public static final byte[] A0Y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public 6Zo A0D;
    public KuK A0E;
    public 6aO A0F;
    public boolean A0G;
    public boolean A0H;
    public C6a5[] A0I;
    public C6a5[] A0J;
    public final int A0K;
    public final SparseArray A0L;
    public final C6a5 A0M;
    public final 6aT A0N;
    public final 6aO A0O;
    public final 6aO A0P;
    public final 6aO A0Q;
    public final 6aO A0R;
    public final 6aO A0S;
    public final ArrayDeque A0T;
    public final ArrayDeque A0U;
    public final List A0V;
    public final byte[] A0W;

    static {
        6Zr r0 = new 6Zr();
        r0.A0U = "application/x-emsg";
        A0X = new 6Yl(r0);
    }

    public FragmentedMp4Extractor2() {
        this(null, Collections.emptyList(), 0);
    }

    public FragmentedMp4Extractor2(C6a5 c6a5, List list, int i) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0V = Collections.unmodifiableList(list);
        this.A0M = c6a5;
        this.A0N = new 6aT();
        this.A0O = new 6aO(16);
        this.A0R = new 6aO(6aP.A01);
        this.A0Q = new 6aO(5);
        this.A0P = new 6aO();
        byte[] bArr = new byte[16];
        this.A0W = bArr;
        this.A0S = new 6aO(bArr);
        this.A0T = new ArrayDeque();
        this.A0U = new ArrayDeque();
        this.A0L = DKC.A0E();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0D = 6Zo.A00;
        this.A0J = new C6a5[0];
        this.A0I = new C6a5[0];
    }

    public static DrmInitData A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            6aX r0 = (6aX) list.get(i);
            if (((6aW) r0).A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                byte[] bArr = r0.A00.A02;
                KjP A00 = KwS.A00(bArr);
                if (A00 == null) {
                    5My.A04("FragmentedMp4Extractor", 4YT.A00(763));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(null, "video/mp4", A00.A01, bArr));
                }
            }
        }
        return arrayList != null ? new DrmInitData(null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false) : null;
    }

    public static void A01(Kqz kqz, 6aO r302, int i) {
        int A02 = 4YU.A02(r302, i + 8) & 16777215;
        if ((A02 & 1) != 0) {
            throw KLu.A00(4YT.A00(727));
        }
        boolean A1N = AnonymousClass001.A1N(A02 & 2);
        int A09 = r302.A09();
        if (A09 == 0) {
            Arrays.fill(kqz.A0E, 0, kqz.A00, false);
            return;
        }
        int i2 = kqz.A00;
        if (A09 != i2) {
            throw KLu.A02(0Pz.A0C(A09, i2, "Senc sample count ", " is different from fragment sample count"), (Throwable) null);
        }
        Arrays.fill(kqz.A0E, 0, A09, A1N);
        int i3 = r302.A00 - r302.A01;
        6aO r0 = kqz.A0G;
        r0.A0N(i3);
        kqz.A07 = true;
        kqz.A09 = true;
        r302.A0S(r0.A02, 0, r0.A00);
        r0.A0P(0);
        kqz.A09 = false;
    }

    public void BOq(6Zo r302) {
        int i;
        this.A0D = r302;
        this.A02 = 0;
        this.A00 = 0;
        C6a5[] c6a5Arr = new C6a5[2];
        this.A0J = c6a5Arr;
        C6a5 c6a5 = this.A0M;
        int i2 = 0;
        if (c6a5 != null) {
            c6a5Arr[0] = c6a5;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.A0K & 4) != 0) {
            c6a5Arr[i] = r302.D4h(100, 5);
            i++;
            i3 = 101;
        }
        C6a5[] c6a5Arr2 = this.A0J;
        6DP.A03(DKD.A1V(i, c6a5Arr2.length));
        C6a5[] c6a5Arr3 = (C6a5[]) Arrays.copyOf(c6a5Arr2, i);
        this.A0J = c6a5Arr3;
        for (C6a5 c6a52 : c6a5Arr3) {
            c6a52.ATn(A0X);
        }
        List list = this.A0V;
        C6a5[] c6a5Arr4 = new C6a5[list.size()];
        this.A0I = c6a5Arr4;
        while (i2 < c6a5Arr4.length) {
            C6a5 D4h = this.A0D.D4h(i3, 3);
            D4h.ATn((6Yl) list.get(i2));
            c6a5Arr4 = this.A0I;
            c6a5Arr4[i2] = D4h;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0ed1, code lost:
    
        if ((r0 & 1) == 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0fef, code lost:
    
        if (r375 == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x2227, code lost:
    
        throw X.KLu.A02(r306.toString(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x21f4, code lost:
    
        r306.append(r304);
        r306.append(r369);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x1b10, code lost:
    
        r301.A02 = 0;
        r301.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x05e1, code lost:
    
        if (r0 == 1701671783) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x21af, code lost:
    
        throw X.KLu.A02(X.4YT.A00(r347), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1bad, code lost:
    
        if (r301.A02 != 3) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x1bb9, code lost:
    
        if (r310.A06 != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x1bbc, code lost:
    
        r322 = r310.A05.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x1bc6, code lost:
    
        r0 = r310.A01;
        r0 = r322[r0];
        r301.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x1be5, code lost:
    
        if (r0 >= r310.A03) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x1be8, code lost:
    
        r302.D0m(r0);
        r0 = r310.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x1bfa, code lost:
    
        if (r0 == null) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x1bfd, code lost:
    
        r0 = r310.A08;
        r0 = r0.A0G;
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x1c14, code lost:
    
        if (r0 == 0) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x1c17, code lost:
    
        r0.A0Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x1c1e, code lost:
    
        r0 = r310.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x1c2e, code lost:
    
        if (r0.A07 == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x1c41, code lost:
    
        if (r0.A0E[r0] == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x1c44, code lost:
    
        r0.A0Q(r0.A0A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x1c5e, code lost:
    
        if (r310.A03() != false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x1c61, code lost:
    
        r301.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x1c6c, code lost:
    
        r301.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x1c77, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x1c9a, code lost:
    
        if (r310.A05.A03.A02 != 1) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x1c9d, code lost:
    
        r301.A06 = r0 - 8;
        r302.D0m(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x1cb7, code lost:
    
        r0 = "audio/ac4".equals(r310.A05.A03.A07.A0W);
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x1cdd, code lost:
    
        if (r0 == false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1ce0, code lost:
    
        r301.A04 = r310.A00(r0, 7);
        r0 = r301.A06;
        r0 = r301.A0S;
        X.L9Y.A02(r0, r0);
        r310.A07.Cj9(r0, 7);
        r305 = r301.A04 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x1d27, code lost:
    
        r301.A04 = r305;
        r301.A06 += r305;
        r301.A02 = 4;
        r301.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x1fa3, code lost:
    
        r305 = r310.A00(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x1c78, code lost:
    
        r322 = r310.A08.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x1d47, code lost:
    
        r0 = r310.A05;
        r0 = r0.A03;
        r0 = r310.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x1d65, code lost:
    
        if (r310.A06 != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x1d68, code lost:
    
        r328 = r0.A07[r310.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x1d7d, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x1d86, code lost:
    
        if (r0 == 0) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x1d89, code lost:
    
        r0 = r301.A0Q;
        r0 = r0.A02;
        r0[0] = 0;
        r0[1] = 0;
        r0[2] = 0;
        r0 = r0 + 1;
        r0 = 4 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x1db3, code lost:
    
        r0 = r301.A04;
        r340 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x1dc3, code lost:
    
        if (r0 >= r340) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x1dc6, code lost:
    
        r0 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x1dce, code lost:
    
        if (r0 != 0) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x1ecb, code lost:
    
        if (r301.A0H == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x1ece, code lost:
    
        r0 = r301.A0P;
        r0.A0N(r0);
        r302.readFully(r0.A02, 0, r0);
        r0.Cj9(r0, r301.A05);
        r309 = r301.A05;
        r0 = X.6aP.A00(r0.A02, r0.A00);
        r0.A0P("video/hevc".equals(r0.A07.A0W) ? 1 : 0);
        r0.A0O(r0);
        X.KwR.A00(r0, r301.A0I, r328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x1f51, code lost:
    
        r301.A04 += r309;
        r301.A05 -= r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x1f72, code lost:
    
        r309 = r0.CjE(r302, r0, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x1dd1, code lost:
    
        r302.readFully(r0, r0, r0);
        r0 = X.4YU.A02(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x1df2, code lost:
    
        if (r0 < 1) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1df5, code lost:
    
        r301.A05 = r0 - 1;
        r0 = r301.A0R;
        r0.A0P(0);
        r0.Cj9(r0, 4);
        r0.Cj9(r0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x1e30, code lost:
    
        if (r301.A0I.length <= 0) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1e33, code lost:
    
        r0 = r0.A07.A0W;
        r0 = r0[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1e54, code lost:
    
        if ("video/avc".equals(r0) == false) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1e66, code lost:
    
        if ((r0 & 31) == 6) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x1e91, code lost:
    
        r340 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1e94, code lost:
    
        r301.A0H = r340;
        r301.A04 += 5;
        r301.A06 += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1e79, code lost:
    
        if ("video/hevc".equals(r0) == false) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x1e8e, code lost:
    
        if (((r0 & 126) >> 1) != 39) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1eba, code lost:
    
        r340 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x2199, code lost:
    
        r347 = 646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1ff4, code lost:
    
        if (r310.A06 != false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1ff7, code lost:
    
        r354 = r310.A05.A04[r310.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x2013, code lost:
    
        r0 = r310.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x201c, code lost:
    
        if (r0 == null) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x201f, code lost:
    
        r354 = r354 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x202d, code lost:
    
        if (r0 == null) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x2030, code lost:
    
        r320 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x2037, code lost:
    
        r0 = r301.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x203f, code lost:
    
        if (r0 == null) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x2062, code lost:
    
        if ("application/x-mp4-vtt".equals(r0.A05.A03.A07.A0W) == false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x2065, code lost:
    
        r354 = r354 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x206b, code lost:
    
        r0.CjG(r320, r354, r340, 0, r328);
        r301.A0A = r328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x2094, code lost:
    
        r0 = r301.A0U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x20a3, code lost:
    
        if (r0.isEmpty() != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x20a6, code lost:
    
        r0 = (X.KjO) r0.removeFirst();
        r0 = r301.A03;
        r0 = r0.A00;
        r301.A03 = r0 - r0;
        r326 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x20da, code lost:
    
        if (r0.A02 == false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x20dd, code lost:
    
        r326 = r326 + r328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x20e4, code lost:
    
        r0 = r301.A0J;
        r0 = r0.length;
        r319 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x20f9, code lost:
    
        if (r319 >= r0) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x20fc, code lost:
    
        r0[r319].CjG(null, 1, r0, r301.A03, r326);
        r319 = r319 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x2170, code lost:
    
        if (r310.A03() != false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x2173, code lost:
    
        r301.A0E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x2138, code lost:
    
        r320 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x2141, code lost:
    
        r354 = X.AnonymousClass001.A1N(r310.A08.A0F[r310.A01] ? 1 : 0) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1fb0, code lost:
    
        r0 = r301.A04;
        r340 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1fc0, code lost:
    
        if (r0 >= r340) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1fc3, code lost:
    
        r301.A04 += r0.CjE(r302, r340 - r0, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1f84, code lost:
    
        r328 = r310.A08.A0C[r310.A01];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0407 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Cap(X.6aJ r302, X.6aB r303) {
        /*
            Method dump skipped, instructions count: 8755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.Cap(X.6aJ, X.6aB):int");
    }

    public void Ck6(long j, long j2) {
        SparseArray sparseArray = this.A0L;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A0U.clear();
                this.A03 = 0;
                this.A0B = j2;
                this.A0T.clear();
                this.A02 = 0;
                this.A00 = 0;
                return;
            }
            ((KuK) sparseArray.valueAt(i2)).A02();
            i = i2 + 1;
        }
    }

    public boolean D0t(6aJ r302) {
        return 6aU.A00(r302, true);
    }
}
