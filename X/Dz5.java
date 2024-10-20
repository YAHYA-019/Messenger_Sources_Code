package X;

import com.facebook.acra.constants.ActionId;
import java.util.BitSet;

/* loaded from: Dz5.class */
public final class Dz5 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dz5() {
        super("NTToggleButtonComponent");
    }

    public static void A00(1Iw r301, boolean z, boolean z2) {
        if (r301.A02 != null) {
            r301.A0H(new C2l4(7zN.A1b(Boolean.valueOf(z), z2), 0), "updateState:NTToggleButtonComponent.onUpdateState");
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        GHz A06;
        QNs A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = A0P.A00;
        boolean z2 = A0P.A01;
        int i = 72;
        if (z2) {
            i = 56;
        }
        GL7 Ay2 = gl7.Ay2(i);
        FIJ A04 = Ay2 != null ? FJ9.A04(Ay2, fyG) : null;
        float Amm = gl7.Amm(65, 13.0f);
        boolean z3 = gl7.getBoolean(62, true);
        String string = gl7.getString(70);
        String string2 = gl7.getString(76);
        String string3 = gl7.getString(78);
        String string4 = gl7.getString(59);
        int i2 = -16777216;
        if (fyG.A05) {
            i2 = -1;
        }
        int Ad0 = gl7.Ad0(fyG, 79, ActionId.RTMP_PACKET_RECEIVED, i2);
        int Ad02 = gl7.Ad0(fyG, 77, ActionId.QUERY_READY, Ad0);
        int i3 = Ad0;
        if (z2) {
            i3 = Ad02;
        }
        int Ad03 = gl7.Ad0(fyG, 71, ActionId.ABORTED, i3);
        int i4 = Ad0;
        if (z2) {
            i4 = Ad02;
        }
        int Ad04 = gl7.Ad0(fyG, 61, ActionId.ACTION_BAR_COMPLETE, i4);
        if (!z3) {
            if (!z2) {
                string2 = string3;
            }
            String[] strArr = {string4, string2, string3};
            int i5 = 0;
            while (true) {
                str = strArr[i5];
                if (str != null) {
                    break;
                }
                i5++;
                if (i5 >= 3) {
                    str = "";
                    break;
                }
            }
            int i6 = 55;
            if (z2) {
                i6 = 74;
            }
            int[] iArr = {57, i6, 55};
            int i7 = 0;
            while (true) {
                GL7 Ay22 = gl7.Ay2(iArr[i7]);
                if (Ay22 != null) {
                    A06 = FJ9.A06(Ay22, fyG);
                    break;
                }
                i7++;
                if (i7 >= 3) {
                    A06 = null;
                    break;
                }
            }
            Ad0 = Ad04;
        } else if (z) {
            if (!z2) {
                string2 = string3;
            }
            String[] strArr2 = {string, string2, string3};
            int i8 = 0;
            while (true) {
                str = strArr2[i8];
                if (str != null) {
                    break;
                }
                i8++;
                if (i8 >= 3) {
                    str = "";
                    break;
                }
            }
            int i9 = 55;
            if (z2) {
                i9 = 74;
            }
            int[] iArr2 = {68, i9, 55};
            int i10 = 0;
            while (true) {
                GL7 Ay23 = gl7.Ay2(iArr2[i10]);
                if (Ay23 != null) {
                    A06 = FJ9.A06(Ay23, fyG);
                    break;
                }
                i10++;
                if (i10 >= 3) {
                    A06 = null;
                    break;
                }
            }
            Ad0 = Ad03;
        } else if (z2) {
            String[] strArr3 = {string2, string3};
            int i11 = 0;
            while (true) {
                str = strArr3[i11];
                if (str != null) {
                    break;
                }
                i11++;
                if (i11 >= 2) {
                    str = "";
                    break;
                }
            }
            int[] iArr3 = {74, 55};
            int i12 = 0;
            while (true) {
                GL7 Ay24 = gl7.Ay2(iArr3[i12]);
                if (Ay24 != null) {
                    A06 = FJ9.A06(Ay24, fyG);
                    break;
                }
                i12++;
                if (i12 >= 2) {
                    A06 = null;
                    break;
                }
            }
            Ad0 = Ad02;
        } else {
            str = new String[]{string3}[0];
            if (str == null) {
                str = "";
            }
            GL7 Ay25 = gl7.Ay2(55);
            A06 = Ay25 != null ? FJ9.A06(Ay25, fyG) : null;
        }
        QDh qDh = new QDh(r302, new QIn());
        QIn qIn = qDh.A01;
        qIn.A02 = str;
        BitSet bitSet = qDh.A02;
        bitSet.set(0);
        qIn.A01 = qDh.A02.A03(Amm);
        bitSet.set(2);
        qIn.A00 = Ad0;
        bitSet.set(1);
        C1rs.A05(bitSet, qDh.A03, 3);
        qDh.A0J();
        DtL A00 = F29.A00(qIn, r302, A06, z3);
        if (z3) {
            A00.A1s(1LI.A0C(r302, Dz5.class, "NTToggleButtonComponent", 7zN.A1b(A04, z2), -1336101728));
        }
        A00.A0F("android.widget.ToggleButton");
        return A00.A2V();
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r0 == 3) goto L23;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.A01
            r304 = r0
            r0 = -1336101728(0xffffffffb05cb4a0, float:-8.029222E-10)
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L26
            r0 = -1048037474(0xffffffffc188379e, float:-17.027157)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = r306
            if (r0 != r1) goto L24
            r0 = r302
            r1 = r303
            X.1LI.A0J(r0, r1)
        L24:
            r0 = 0
            return r0
        L26:
            r0 = r303
            X.3xE r0 = (X.3xE) r0
            r303 = r0
            r0 = r302
            X.1Iv r0 = r0.A00
            X.1Iw r0 = r0.A00
            r308 = r0
            r0 = r303
            android.view.MotionEvent r0 = r0.A00
            r309 = r0
            r0 = r303
            android.view.View r0 = r0.A01
            r310 = r0
            r0 = r302
            java.lang.Object[] r0 = r0.A03
            r307 = r0
            r0 = r307
            r1 = 0
            r0 = r0[r1]
            X.FIJ r0 = (X.FIJ) r0
            r311 = r0
            r0 = 1
            r312 = r0
            r0 = r307
            r1 = r312
            boolean r0 = X.7zO.A1Z(r0, r1)
            r304 = r0
            r0 = r309
            int r0 = r0.getActionMasked()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L74
            r0 = r308
            r1 = r312
            r2 = r304
            A00(r0, r1, r2)
        L6e:
            r0 = r312
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L74:
            r0 = r306
            r1 = r312
            if (r0 != r1) goto La3
            r0 = r310
            r1 = r309
            boolean r0 = X.F29.A01(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lad
            r0 = r304
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = r308
            r1 = 0
            r2 = r305
            A00(r0, r1, r2)
            r0 = r311
            if (r0 == 0) goto L6e
            r0 = r311
            r0.A07()
            goto L6e
        La3:
            r0 = 3
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L6e
        Lad:
            r0 = r308
            r1 = 0
            r2 = r304
            A00(r0, r1, r2)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz5.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNs qNs = (QNs) r303;
        Boolean A03 = GL7.A03(this.A00, 73);
        qNs.A00 = false;
        qNs.A01 = A03.booleanValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
