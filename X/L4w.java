package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: L4w.class */
public final class L4w {
    public KpD A00;
    public RRi A01;
    public RRo A02;
    public RRX A03;
    public RRZ A04;
    public ROq A05;
    public RRp A06;
    public L3N A07;
    public RRq A08;
    public RRj A09;
    public ROr A0A;
    public RRa A0B;
    public RRf A0C;
    public RRb A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final java.util.Map A0G = AnonymousClass001.A0u();
    public final java.util.Map A0H;
    public final java.util.Map A0I;
    public final java.util.Map A0J;
    public final Set A0K;

    public L4w() {
        HandlerThread A0E = GOo.A0E("TAArrowLoggerHandlerThread", 10);
        this.A0F = A0E;
        A0E.start();
        this.A0E = new Handler(A0E.getLooper());
        this.A0K = Collections.synchronizedSet(AnonymousClass001.A0v());
        this.A0J = DKD.A13();
        this.A0I = DKD.A13();
        this.A0H = DKD.A13();
        this.A0C = new RRf(this);
        this.A0D = new RRb(this);
        this.A0A = new ROr(this);
        this.A03 = new RRX(this);
        this.A0B = new RRa(this);
        this.A04 = new RRZ(this);
        this.A08 = new RRq(this);
        this.A06 = new RRp(this);
        this.A07 = new L3N(this);
        this.A09 = new RRj(this);
        this.A01 = new RRi(this);
        this.A02 = new RRo(this);
        this.A05 = new ROq(this);
        if (this.A00 == null) {
            LinkedHashMap A1C = 1BK.A1C();
            RRf rRf = this.A0C;
            A00(rRf.A05, rRf.A06, A1C);
            RRb rRb = this.A0D;
            A00(rRb.A04, rRb.A05, A1C);
            ROr rOr = this.A0A;
            A00(rOr.A03, rOr.A04, A1C);
            RRX rrx = this.A03;
            A00(rrx.A02, rrx.A04, A1C);
            RRa rRa = this.A0B;
            A00(rRa.A03, rRa.A05, A1C);
            RRZ rrz = this.A04;
            A00(rrz.A02, rrz.A05, A1C);
            RRq rRq = this.A08;
            A00(rRq.A0W, rRq.A0g, A1C);
            RRp rRp = this.A06;
            A00(rRp.A0A, rRp.A0N, A1C);
            L3N l3n = this.A07;
            A00(l3n.A08, l3n.A0C, A1C);
            RRj rRj = this.A09;
            A00(rRj.A06, rRj.A07, A1C);
            RRi rRi = this.A01;
            A00(rRi.A04, rRi.A07, A1C);
            RRo rRo = this.A02;
            A00(rRo.A0F, rRo.A0H, A1C);
            ROq rOq = this.A05;
            A00(rOq.A03, rOq.A04, A1C);
            this.A00 = new KpD(A1C);
        }
    }

    public static void A00(Object obj, Object obj2, java.util.Map map) {
        map.put(obj2, Collections.singletonList(obj));
    }

    public KpD A01() {
        KpD kpD;
        synchronized (this) {
            kpD = this.A00;
        }
        return kpD;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4w.A02():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x0456, code lost:
    
        r0.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0462, code lost:
    
        r0 = r0.A00 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0475, code lost:
    
        if ((r0 % r0) != 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x049d, code lost:
    
        r0.A08.add(new X.LTf(r0, r334 + 4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x053a, code lost:
    
        new java.lang.Exception("Body length not a multiple of 8");
     */
    /* JADX WARN: Type inference failed for: r0v301, types: [X.LTd, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.C3188Jlt r302) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4w.A03(X.Jlt):void");
    }

    public void A04(String str) {
        synchronized (this) {
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                java.util.Map map = this.A0G;
                if (map.containsKey(A0i)) {
                    JQx.A12(A0i, map).add(str);
                } else {
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(str);
                    map.put(A0i, A0s);
                }
            }
        }
    }
}
