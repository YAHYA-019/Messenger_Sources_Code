package X;

import org.tukaani.xz.lz.LZEncoder;

/* renamed from: X.12p, reason: invalid class name */
/* loaded from: 12p.class */
public final class C12p extends LZEncoder {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C12y A04;
    public final C0yk A05;
    public final int[] A06;

    public C12p(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        this.A00 = -1;
        int i6 = i + 1;
        this.A02 = i6;
        this.A01 = i6;
        this.A04 = new C12y(i);
        this.A06 = new int[i6 * 2];
        this.A05 = new C0yk(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r305 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A02() {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12p.A02():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        if (r0[r0 - r0] == r0[r0]) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if (r315 != r302) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        r0 = r0 + r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        if (r0[r0 - r0] == r0[r0]) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r0 = r301.A06;
        r0[r306] = r0[r0];
        r0[r307] = r0[r0 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00da, code lost:
    
        r0 = r0 + r315;
        r0 = r0[r0 - r0] & 255;
        r0 = r0[r0] & 255;
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0108, code lost:
    
        if (r0 >= r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010b, code lost:
    
        r0[r306] = r303;
        r306 = r0 + 1;
        r303 = r0[r306];
        r309 = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0127, code lost:
    
        r0[r307] = r303;
        r303 = r0[r0];
        r307 = r0;
        r308 = r315;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12p.A03(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0267, code lost:
    
        if (r0[r0 - r0] == r0[r0]) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026a, code lost:
    
        r322 = r322 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0274, code lost:
    
        if (r322 >= r309) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0277, code lost:
    
        r0 = r0 + r322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0297, code lost:
    
        if (r0[r0 - r0] == r0[r0]) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02a2, code lost:
    
        if (r322 <= r324) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a5, code lost:
    
        r0.A02[r306] = r322;
        r0.A01[r306] = r0 - 1;
        r306 = r306 + 1;
        r0.A00 = r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02d5, code lost:
    
        if (r322 < r310) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0300, code lost:
    
        r324 = r322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02d8, code lost:
    
        r0 = r301.A06;
        r0[r321] = r0[r0];
        r0[r327] = r0[r0 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02ff, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0304, code lost:
    
        r0 = r0 + r322;
        r0 = r0[r0 - r0] & 255;
        r0 = r0[r0] & 255;
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0336, code lost:
    
        if (r0 >= r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0339, code lost:
    
        r0[r321] = r319;
        r321 = r0 + 1;
        r319 = r0[r321];
        r329 = r322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0357, code lost:
    
        r0[r327] = r319;
        r319 = r0[r0];
        r327 = r0;
        r328 = r322;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.tukaani.xz.lz.LZEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0yk A05() {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12p.A05():X.0yk");
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void A06(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int i3 = this.A07;
            int A02 = A02();
            if (A02 < i3) {
                if (A02 != 0) {
                    i3 = A02;
                } else {
                    i = i2;
                }
            }
            C12y c12y = this.A04;
            c12y.A01(this.A08, super.A02);
            int i4 = c12y.A05[c12y.A02];
            c12y.A00(this.A01);
            A03(i3, i4);
            i = i2;
        }
    }
}
