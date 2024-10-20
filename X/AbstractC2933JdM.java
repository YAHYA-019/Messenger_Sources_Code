package X;

import android.view.KeyEvent;
import java.util.Iterator;

/* renamed from: X.JdM, reason: case insensitive filesystem */
/* loaded from: JdM.class */
public abstract class AbstractC2933JdM extends AbstractC2887Jc8 implements MNZ, MNa, MNX, MNO, MNQ {
    public static final KTs A0H = new Object();
    public MMr A00;
    public LMt A01;
    public MMs A02;
    public MMs A03;
    public LMz A04;
    public MNb A05;
    public MBc A06;
    public C00m A07;
    public boolean A08;
    public boolean A09;
    public ExZ A0B;
    public String A0C;
    public final C2934JdN A0E;
    public final Object A0F;
    public final JcA A0D = new LPR();
    public final java.util.Map A0G = 1BK.A1C();
    public long A0A = 0;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0076, code lost:
    
        if (r301.A00 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2933JdM(X.MMr r302, X.MMs r303, X.ExZ r304, java.lang.String r305, X.C00m r306, boolean r307) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r305
            r0.A0C = r1
            r0 = r301
            r1 = r304
            r0.A0B = r1
            r0 = r301
            r1 = r307
            r0.A08 = r1
            r0 = r301
            r1 = r306
            r0.A07 = r1
            X.JcA r0 = new X.JcA
            r308 = r0
            r0 = r308
            r0.<init>()
            r0 = r301
            r1 = r308
            r0.A0D = r1
            X.JdN r0 = new X.JdN
            r308 = r0
            r0 = r308
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            r1 = r308
            r0.A0E = r1
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A0G = r1
            r0 = 0
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A0A = r1
            r0 = r301
            X.MMs r0 = r0.A02
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A03 = r1
            r0 = r308
            if (r0 != 0) goto L79
            r0 = r301
            X.MMr r0 = r0.A00
            r311 = r0
            r0 = 1
            r312 = r0
            r0 = r311
            if (r0 != 0) goto L7f
        L79:
            r0 = 0
            r312 = r0
            r0 = 0
            r308 = r0
        L7f:
            r0 = r301
            r1 = r312
            r0.A09 = r1
            X.KTs r0 = X.AbstractC2933JdM.A0H
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A0F = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2933JdM.<init>(X.MMr, X.MMs, X.ExZ, java.lang.String, X.00m, boolean):void");
    }

    public static final void A00(AbstractC2933JdM abstractC2933JdM) {
        if (abstractC2933JdM.A06 != null || abstractC2933JdM.A00 == null) {
            return;
        }
        9qP r303 = abstractC2933JdM.A02;
        if (r303 == null) {
            r303 = new 9qP();
            abstractC2933JdM.A02 = r303;
        }
        abstractC2933JdM.A0E.A0J(r303);
        MMs mMs = abstractC2933JdM.A02;
        11T.A0D(mMs);
        JcG jcG = new JcG(mMs);
        abstractC2933JdM.A0H(jcG);
        abstractC2933JdM.A06 = jcG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0J(X.MNc r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2933JdM.A0J(X.MNc, X.0DR):java.lang.Object");
    }

    public final void A0K() {
        MMs mMs = this.A02;
        if (mMs != null) {
            LMz lMz = this.A04;
            if (lMz != null) {
                JQx.A1M(mMs, new LMy(lMz));
            }
            LMt lMt = this.A01;
            if (lMt != null) {
                JQx.A1M(mMs, new LMx(lMt));
            }
            Iterator A1A = 1BK.A1A(this.A0G);
            while (A1A.hasNext()) {
                JQx.A1M(mMs, new LMy((LMz) A1A.next()));
            }
        }
        this.A04 = null;
        this.A01 = null;
        this.A0G.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if (r301.A00 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
    
        if (r301.A06 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0101, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0106, code lost:
    
        if (r311 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        r301.A06 = null;
        A00(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0118, code lost:
    
        r301.A0E.A0J(r301.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        A0I(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        if (r310 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(X.MMr r302, X.MMs r303, X.ExZ r304, java.lang.String r305, X.C00m r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2933JdM.A0L(X.MMr, X.MMs, X.ExZ, java.lang.String, X.00m, boolean):void");
    }

    public final void A8y(MEV mev) {
        ExZ exZ = this.A0B;
        if (exZ != null) {
            mev.ClM(KdW.A0K, new ExZ(exZ.A00));
        }
        LPR.A07(KdT.A09, mev, this.A0C, M3K.A00(this, 4));
        if (this.A08) {
            this.A0E.A8y(mev);
        } else {
            mev.ClM(KdW.A03, 04S.A00);
        }
        if (this instanceof C2828Jak) {
            C2828Jak c2828Jak = (C2828Jak) this;
            if (c2828Jak.A02 != null) {
                LPR.A07(KdT.A0B, mev, c2828Jak.A00, M3K.A00(c2828Jak, 5));
            }
        }
    }

    public /* synthetic */ boolean BAh() {
        return false;
    }

    public final boolean BAo() {
        return true;
    }

    @Override // X.MNa
    public Object BGy() {
        return this.A0F;
    }

    public /* synthetic */ boolean BPq() {
        return false;
    }

    /* renamed from: Bmx, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void CUa() {
        LMt lMt;
        MMs mMs = this.A02;
        if (mMs != null && (lMt = this.A01) != null) {
            JQx.A1M(mMs, new LMx(lMt));
        }
        this.A01 = null;
        MNb mNb = this.A05;
        if (mNb != null) {
            mNb.Bmx();
        }
    }

    public final void BzI(MEI mei) {
        if (mei.BSp()) {
            A00(this);
        }
        if (this.A08) {
            this.A0E.BzI(mei);
        }
    }

    public final boolean C32(KeyEvent keyEvent) {
        int keyCode;
        int keyCode2;
        A00(this);
        boolean z = true;
        if (this.A08) {
            long j = KZL.A00;
            if (keyEvent.getAction() == 0 && ((keyCode2 = (int) ((keyEvent.getKeyCode() << 32) >> 32)) == 23 || keyCode2 == 66 || keyCode2 == 160)) {
                java.util.Map map = this.A0G;
                if (!map.containsKey(new L3u(keyEvent.getKeyCode() << 32))) {
                    LMz lMz = new LMz(this.A0A);
                    map.put(new L3u(keyEvent.getKeyCode() << 32), lMz);
                    if (this.A02 != null) {
                        2aK.A03((Integer) null, (0DE) null, new AJV(lMz, this, (0DR) null, 2), A08(), 3);
                        return true;
                    }
                    return z;
                }
                z = false;
                return z;
            }
        }
        if (this.A08) {
            long j2 = KZL.A00;
            int action = keyEvent.getAction();
            if (action != 0 && action == 1 && ((keyCode = (int) ((keyEvent.getKeyCode() << 32) >> 32)) == 23 || keyCode == 66 || keyCode == 160)) {
                Object remove = this.A0G.remove(new L3u(keyEvent.getKeyCode() << 32));
                if (remove != null && this.A02 != null) {
                    2aK.A03((Integer) null, (0DE) null, new AJV(remove, this, (0DR) null, 3), A08(), 3);
                }
                this.A07.invoke();
                return true;
            }
        }
        z = false;
        return z;
    }

    public final void CCi(KiX kiX, KMa kMa, long j) {
        2aI A08;
        int i;
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.A0A = KvH.A00((int) (j2 >> 32), (int) (j2 & 4294967295L));
        A00(this);
        if (this.A08 && kMa == KMa.A03) {
            int i2 = kiX.A00;
            if (i2 == 4) {
                A08 = A08();
                i = 0;
            } else if (i2 == 5) {
                A08 = A08();
                i = 1;
            }
            7zO.A1W(this, A08, i);
        }
        LPR lpr = this.A05;
        if (lpr == null) {
            AJV ajv = new AJV(this, null, 4);
            KiX kiX2 = KZg.A00;
            lpr = new C2904Jcq(null, ajv);
            A0H(lpr);
            this.A05 = lpr;
        }
        lpr.CCi(kiX, kMa, j);
    }

    public /* synthetic */ boolean Cx3() {
        return false;
    }
}
