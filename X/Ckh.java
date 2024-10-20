package X;

/* loaded from: Ckh.class */
public final class Ckh implements C1t5 {
    public final int A00;
    public final Object A01;

    public Ckh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1t5
    public void BzZ() {
        String str;
        switch (this.A00) {
            case 0:
                InterfaceC00713oe interfaceC00713oe = ((B4e) this.A01).A07;
                if (interfaceC00713oe != null) {
                    interfaceC00713oe.Bef(0S2.A01);
                    return;
                }
                return;
            case 3:
                7EL r0 = (7EL) 1Bn.A0A(82497);
                1G1 r02 = ((C1541Aku) this.A01).A00;
                if (r02 != null) {
                    1Br.A0C(r0.A00);
                    if (4YV.A1U((int) 1BL.A0Q().Av9(1GD.A07, 36596986834259278L))) {
                        1Ql.A01(1Br.A08(r0.A01), 1G9.A05(7Ko.A02, r02.A02), true);
                    }
                    1Ql A08 = 1Br.A08(r0.A01);
                    String str2 = r02.A02;
                    1Ql.A01(A08.putBoolean(1G9.A05(7Ko.A04, str2), true), 1G9.A05(7Ko.A05, str2), true);
                    return;
                }
                str = "fbUserSession";
                break;
            case 4:
                AlW alW = (AlW) this.A01;
                B3w b3w = alW.A05;
                if (b3w != null) {
                    b3w.A02(alW.A0G);
                    return;
                }
                return;
            case 6:
                BBc bBc = (BBc) this.A01;
                int i = BBc.A09;
                BiA biA = bBc.A00;
                if (biA != null) {
                    CFo cFo = biA.A00.A00;
                    int A00 = 1BK.A00();
                    1YC r03 = cFo.A0L;
                    r03.A08("com.facebook.messaging.threadsettings.plugins.interfaces.lifecycle.ThreadSettingsLifecycleInterfaceSpec", "messaging.threadsettings.lifecycle.ThreadSettingsLifecycleInterfaceSpec", "onInvisible", A00);
                    r03.A06("messaging.threadsettings.lifecycle.ThreadSettingsLifecycleInterfaceSpec", "onInvisible", A00);
                    return;
                }
                str = "lifecycleInterface";
                break;
            default:
                return;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0529 A[Catch: Exception -> 0x0610, all -> 0x0624, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0610, blocks: (B:206:0x04a3, B:207:0x04a8, B:210:0x04b4, B:213:0x04be, B:218:0x05e4, B:222:0x0529, B:224:0x0534, B:226:0x053d, B:227:0x0544, B:228:0x054b, B:229:0x0552, B:231:0x0560, B:233:0x056d, B:234:0x0574, B:237:0x058a, B:238:0x0591, B:239:0x0598, B:241:0x05a2, B:243:0x05ab, B:245:0x05b4, B:247:0x05bf, B:250:0x05cc, B:252:0x05d3, B:253:0x05d9, B:254:0x05de, B:254:0x05de, B:256:0x04c8, B:261:0x050e, B:261:0x050e, B:263:0x0513, B:264:0x04d9, B:266:0x04ea, B:274:0x0509, B:281:0x05fc, B:283:0x0608, B:285:0x060f), top: B:205:0x04a3, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d A[Catch: Exception -> 0x0171, all -> 0x018a, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0171, blocks: (B:21:0x00f9, B:22:0x00fe, B:25:0x010a, B:28:0x0114, B:31:0x012d, B:32:0x0133, B:33:0x0139, B:35:0x0142, B:36:0x0148, B:37:0x014d, B:37:0x014d, B:40:0x015b, B:41:0x0160, B:47:0x0155, B:49:0x0121), top: B:20:0x00f9, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155 A[Catch: Exception -> 0x0171, all -> 0x018a, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0171, blocks: (B:21:0x00f9, B:22:0x00fe, B:25:0x010a, B:28:0x0114, B:31:0x012d, B:32:0x0133, B:33:0x0139, B:35:0x0142, B:36:0x0148, B:37:0x014d, B:37:0x014d, B:40:0x015b, B:41:0x0160, B:47:0x0155, B:49:0x0121), top: B:20:0x00f9, outer: #6 }] */
    @Override // X.C1t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bzd() {
        /*
            Method dump skipped, instructions count: 2111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ckh.Bzd():void");
    }
}
