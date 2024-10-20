package X;

/* loaded from: L9z.class */
public final class L9z {
    public final Lii A00;

    public L9z(Lii lii) {
        this.A00 = lii;
    }

    public static float A00(L3x l3x, L3x l3x2, L9z l9z) {
        int i = (int) l3x.A00;
        int i2 = (int) l3x.A01;
        int i3 = (int) l3x2.A00;
        int i4 = (int) l3x2.A01;
        float A02 = A02(l9z, i, i2, i3, i4);
        float A022 = A02(l9z, i3, i4, i, i2);
        return Float.isNaN(A02) ? A022 / 7.0f : Float.isNaN(A022) ? A02 / 7.0f : (A02 + A022) / 14.0f;
    }

    public static float A01(L9z l9z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3;
        int i8 = i;
        boolean z = false;
        int i9 = i2;
        int i10 = i4;
        if (GOn.A05(i4, i2) > GOn.A05(i3, i)) {
            z = true;
            i9 = i;
            i8 = i2;
            i10 = i3;
            i7 = i4;
        }
        int A05 = GOn.A05(i7, i8);
        int i11 = i10 - i9;
        int abs = Math.abs(i11);
        int i12 = (-A05) / 2;
        int i13 = i8 < i7 ? 1 : -1;
        int i14 = i9 < i10 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i9;
        int i17 = 0;
        for (int i18 = i8; i18 != i15; i18 += i13) {
            int i19 = i18;
            int i20 = i16;
            if (z) {
                i19 = i16;
                i20 = i18;
            }
            if (AnonymousClass001.A1Q(i17, 1) == l9z.A00.A03(i19, i20)) {
                if (i17 == 2) {
                    int i21 = i18 - i8;
                    int i22 = i16 - i9;
                    i5 = i21 * i21;
                    i6 = i22 * i22;
                    break;
                }
                i17++;
            }
            i12 += abs;
            if (i12 > 0) {
                if (i16 == i10) {
                    break;
                }
                i16 += i14;
                i12 -= A05;
            }
        }
        if (i17 != 2) {
            return 0.0f / 0.0f;
        }
        int i23 = i15 - i8;
        i5 = i23 * i23;
        i6 = i11 * i11;
        return (float) Math.sqrt(i5 + i6);
    }

    public static float A02(L9z l9z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float A01 = A01(l9z, i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = l9z.A00.A02;
            if (i5 >= i7) {
                f = (r0 - i) / (i5 - i);
                i5 = i7 - 1;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i8 = (int) (f4 - ((i4 - i2) * f));
        if (i8 < 0) {
            f3 = i2 - i8;
        } else {
            int i9 = l9z.A00.A00;
            if (i8 < i9) {
                i6 = i8;
                f2 = 1.0f;
                return (A01 + A01(l9z, i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
            }
            i6 = i9 - 1;
            f4 = i6 - i2;
            f3 = i8 - i2;
        }
        f2 = f4 / f3;
        return (A01 + A01(l9z, i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x06a6, code lost:
    
        if (r0 != 3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0a2e, code lost:
    
        if (r0[1] > r0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a45, code lost:
    
        if (r0.A03(r0, r375) != false) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0a4a, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0a52, code lost:
    
        if (r0 > r0) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0a5e, code lost:
    
        r0[0] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0a63, code lost:
    
        r375 = r375 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0a69, code lost:
    
        if (r375 < 0) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0a79, code lost:
    
        if (r0[0] <= r0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0a7f, code lost:
    
        r370 = r370 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0a89, code lost:
    
        if (r370 >= r0) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0a9d, code lost:
    
        if (r0.A03(r0, r370) == false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0aa2, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0aab, code lost:
    
        if (r0 > r0) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0129, code lost:
    
        if (r0 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0ab8, code lost:
    
        r0[1] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0ac2, code lost:
    
        if (r370 == r0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0ad0, code lost:
    
        if (r0[1] <= r0) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0ada, code lost:
    
        if (r370 >= r0) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0aee, code lost:
    
        if (r0.A03(r0, r370) != false) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0af3, code lost:
    
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0afc, code lost:
    
        if (r0 > r0) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0b09, code lost:
    
        r0[2] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0b0e, code lost:
    
        r370 = r370 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0b17, code lost:
    
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0b20, code lost:
    
        if (r0 > r0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0b25, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0b2b, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0b53, code lost:
    
        if ((X.GOn.A05((r0 + r0) + r0, r0) * 5) >= (r0 * 2)) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0b56, code lost:
    
        r312 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0b72, code lost:
    
        if (X.JR0.A03(r0, r0, r312) >= r0) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0b75, code lost:
    
        r312 = r312 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0b7f, code lost:
    
        if (r312 < 3) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0b82, code lost:
    
        r347 = (r370 - r0) - (r0 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0eb6, code lost:
    
        if (java.lang.Float.isNaN(r347) != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0ed4, code lost:
    
        r0 = ((r0[0] + r0[1]) + r0[2]) / 3.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0ee3, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0ef5, code lost:
    
        if (r0.hasNext() == false) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0f01, code lost:
    
        r0 = (X.KJt) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0f1b, code lost:
    
        if (r0.A00(r0, r347, r0) == false) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0f25, code lost:
    
        r322 = (r0.A00 + r0) / 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0f32, code lost:
    
        r325 = (r0.A01 + r347) / 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0f3f, code lost:
    
        r314 = r0.A00 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0f75, code lost:
    
        r0.add(new X.KJt(r0, r347, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0ba0, code lost:
    
        r347 = 0.0f / 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0bcd, code lost:
    
        r371 = 2.0f;
        r0 = r0 / 2.0f;
        r312 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0bf4, code lost:
    
        if (X.JR0.A03(r0, r0, r312) >= r0) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0bf7, code lost:
    
        r312 = r312 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0c01, code lost:
    
        if (r312 < 3) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0c06, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0c0c, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0c1f, code lost:
    
        r0 = (r0 + r0) + r0[2];
        r0 = (r0 - r0) - (r0 / 2.0f);
        r0 = (int) r0;
        r0 = r0 * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0c4f, code lost:
    
        r0[0] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0c55, code lost:
    
        r0[1] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0c5b, code lost:
    
        r0[2] = 0;
        r0 = r369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0c61, code lost:
    
        r336 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0c63, code lost:
    
        if (r336 < 0) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0c76, code lost:
    
        if (r0.A03(r0, r336) == false) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0c7b, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0c84, code lost:
    
        if (r0 > r0) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0c91, code lost:
    
        r0[1] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0c96, code lost:
    
        r0 = r336 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ca8, code lost:
    
        if (r0[1] <= r0) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0cbe, code lost:
    
        if (r0.A03(r0, r336) != false) goto L693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0cc3, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0ccb, code lost:
    
        if (r0 > r0) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0cd7, code lost:
    
        r0[0] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0cdc, code lost:
    
        r336 = r336 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0ce2, code lost:
    
        if (r336 < 0) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0cf2, code lost:
    
        if (r0[0] <= r0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0cf8, code lost:
    
        r369 = r369 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0d02, code lost:
    
        if (r369 >= r0) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0d15, code lost:
    
        if (r0.A03(r0, r369) == false) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0d1a, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0d23, code lost:
    
        if (r0 > r0) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0d30, code lost:
    
        r0[1] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0d3a, code lost:
    
        if (r369 == r0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0d48, code lost:
    
        if (r0[1] <= r0) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0d52, code lost:
    
        if (r369 >= r0) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0d65, code lost:
    
        if (r0.A03(r0, r369) != false) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0d6a, code lost:
    
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0d73, code lost:
    
        if (r0 > r0) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0d80, code lost:
    
        r0[2] = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0d85, code lost:
    
        r369 = r369 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0d8e, code lost:
    
        r0 = r0[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0d97, code lost:
    
        if (r0 > r0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0d9c, code lost:
    
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0da2, code lost:
    
        r0 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0dc6, code lost:
    
        if ((X.GOn.A05((r0 + r0) + r0, r0) * 5) >= (r0 * 2)) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0dc9, code lost:
    
        r312 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0de5, code lost:
    
        if (X.JR0.A03(r0, r0, r312) >= r0) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0de8, code lost:
    
        r312 = r312 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0df2, code lost:
    
        if (r312 < 3) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0df5, code lost:
    
        r330 = (r369 - r0) - (r0 / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0e25, code lost:
    
        if (java.lang.Float.isNaN(r330) != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0e43, code lost:
    
        r0 = ((r0[0] + r0[1]) + r0[2]) / 3.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0e52, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0e62, code lost:
    
        if (r0.hasNext() == false) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0e6d, code lost:
    
        r0 = (X.KJt) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0e83, code lost:
    
        if (r0.A00(r0, r330, r0) == false) goto L705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0e8d, code lost:
    
        r322 = (r0.A00 + r0) / 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0e9a, code lost:
    
        r325 = (r0.A01 + r330) / 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0ea7, code lost:
    
        r314 = r0.A00 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0fb8, code lost:
    
        r0.add(new X.KJt(r0, r330, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0fbf, code lost:
    
        r367 = r367 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e13, code lost:
    
        r330 = 0.0f / 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x06eb, code lost:
    
        if (r0 < r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        if (r302.containsKey(X.KNn.A04) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:606:0x153c  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x1552  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x15fe  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1615  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.KiE A03(java.util.Map r302) {
        /*
            Method dump skipped, instructions count: 6040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9z.A03(java.util.Map):X.KiE");
    }
}
