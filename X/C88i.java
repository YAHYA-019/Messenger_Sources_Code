package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.88i, reason: invalid class name */
/* loaded from: 88i.class */
public final class C88i extends C1rj {
    public static final CallerContext A06 = CallerContext.A0B("MessageStickerComponentSpec");
    public static final 7Xf A07 = new 7Xf() { // from class: X.88k
        public String BCW(AnonymousClass622 anonymousClass622) {
            Message message = anonymousClass622.A03;
            if (message == null) {
                return null;
            }
            return message.A1m;
        }
    };
    public int A00;
    public 5zD A01;
    public 7Xf A02;
    public C63s A03;
    public C62h A04;
    public AnonymousClass622 A05;

    public C88i() {
        super("MessageStickerComponent");
        this.A00 = 255;
        this.A02 = A07;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A05, this.A03, Integer.valueOf(this.A00), this.A02, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0106, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0109, code lost:
    
        r0 = new X.89O();
        r0 = new X.C1rs(r0, r302, 0, 0);
        ((X.8O5) r0).A01 = r0;
        ((X.8O5) r0).A00 = r302;
        r0.A0A = r0;
        r0 = X.C88i.A06;
        r0 = !r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x013f, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0142, code lost:
    
        r317 = r0.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0149, code lost:
    
        r0 = new X.C6qc(r0, null, null, r317, null, r319, null, r0, r0.BFO(), true, r326, r0, r0, false, false);
        r0 = ((X.8O5) r0).A01;
        r0.A08 = r0;
        r0.A04 = X.InterfaceC07034in.A04;
        r0 = r0.ApT(X.C5yf.A02);
        r0 = ((X.8O5) r0).A01;
        r0.A02 = r0;
        r0.A07 = r0;
        r0.A05 = r0;
        r0 = r0.A02;
        r0.A01 = r0.A06(r0);
        ((X.8O5) r0).A01.A00 = r0.A06(r0);
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01fb, code lost:
    
        return ((X.8O5) r0).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01fc, code lost:
    
        r317 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0202, code lost:
    
        r0 = new X.AnonymousClass893(r302, new X.AnonymousClass892());
        r0 = r0.A01;
        r0.A04 = r0;
        r0.A02 = r0;
        r0 = r0.A02;
        r0.set(0);
        r0 = X.C88i.A06;
        r0 = !r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0248, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x024b, code lost:
    
        r308 = r0.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0252, code lost:
    
        r0.A03 = new X.C6qc(r0, null, null, r308, null, r319, null, r0, r0.BFO(), true, r326, r0, r0, false, false);
        r0.set(2);
        r0.A01 = r0;
        r0.set(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x02a3, code lost:
    
        if (r0.A00() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02a6, code lost:
    
        r0 = r0.A0Y;
        r0 = r0.AgN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02b8, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02bb, code lost:
    
        r311 = r0.A00(r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0318, code lost:
    
        r311 = r0.A01(r0, r0, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02c8, code lost:
    
        r0.A2S(r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02d2, code lost:
    
        if (r325 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02d5, code lost:
    
        r323 = r0.ApT(X.C5yf.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02e9, code lost:
    
        r0.A00 = r323;
        r0.A1r(X.1LI.A09(r302, X.C88i.class, "MessageStickerComponent", -1933296085));
        X.C1rs.A03(r0, r0.A03);
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0317, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0329, code lost:
    
        r308 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        if (r0.BN2() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00d0, code lost:
    
        if (X.6Bl.A04(r319) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00e7, code lost:
    
        r326 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ea, code lost:
    
        r0 = (java.lang.String) X.C7a0.A00.get(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00f7, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00fa, code lost:
    
        r319 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00fd, code lost:
    
        r0 = X.4YV.A0C(r0);
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(final X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88i.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i;
        int i2 = r302.A01;
        if (i2 != -1933296085) {
            4YV.A1G(r302, obj, i2);
            return null;
        }
        F5R f5r = (F5R) obj;
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        0Cs r04 = f5r.A01;
        View view = f5r.A00;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
        AnonymousClass622 anonymousClass622 = ((C88i) r02).A05;
        r04.A0a(view, accessibilityNodeInfoCompat);
        0Oe r05 = 0Oe.A08;
        boolean A04 = 6Bl.A04(anonymousClass622.A03.A1m);
        Resources A0E = 4YU.A0E(r03);
        if (A04) {
            i = 2131952154;
            if (anonymousClass622.A0Y) {
                i = 2131952153;
            }
        } else {
            i = 2131952155;
        }
        accessibilityNodeInfoCompat.A05(new 0Oe(16, A0E.getString(i)));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
    
        if (r0.A09.containsKey(r0) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            r301 = this;
            r0 = r303
            X.8pg r0 = (X.C8pg) r0
            r303 = r0
            r0 = r301
            X.622 r0 = r0.A05
            r304 = r0
            r0 = r301
            X.63s r0 = r0.A03
            r305 = r0
            r0 = r301
            X.62h r0 = r0.A04
            r306 = r0
            r0 = r301
            X.7Xf r0 = r0.A02
            r307 = r0
            r0 = 2131957338(0x7f13165a, float:1.9551257E38)
            r308 = r0
            r0 = r302
            r1 = r308
            java.lang.String r0 = r0.A0D(r1)
            r309 = r0
            r0 = r305
            if (r0 != 0) goto L38
            X.63s r0 = new X.63s
            r305 = r0
            r0 = r305
            r0.<init>()
        L38:
            r0 = r306
            if (r0 == 0) goto L8a
            r0 = r307
            if (r0 == 0) goto L8a
            r0 = r304
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r310 = r0
            r0 = r310
            java.lang.String r0 = r0.A1g
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L8a
            r0 = r307
            r1 = r304
            java.lang.String r0 = r0.BCW(r1)
            r310 = r0
            r0 = r310
            java.lang.Class r0 = r0.getClass()
            r0 = r310
            boolean r0 = X.6Bl.A04(r0)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L8a
            r0 = r306
            java.util.Map r0 = r0.A09
            r310 = r0
            r0 = r310
            r1 = r311
            boolean r0 = r0.containsKey(r1)
            r312 = r0
            r0 = 1
            r308 = r0
            r0 = r312
            if (r0 != 0) goto L90
        L8a:
            r0 = 0
            r308 = r0
            r0 = 0
            r310 = r0
        L90:
            r0 = r308
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r310 = r0
            r0 = r303
            r1 = r309
            r0.A01 = r1
            r0 = r303
            r1 = r305
            r0.A00 = r1
            r0 = r310
            boolean r0 = r0.booleanValue()
            r308 = r0
            r0 = r303
            r1 = r308
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88i.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
