package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;

/* loaded from: Ifz.class */
public final class Ifz implements NAr {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final Context A0I;
    public final 5Vt A0J;

    public Ifz(Context context, FbUserSession fbUserSession, 5Vt r304) {
        1BL.A1H(fbUserSession, context, r304);
        this.A00 = fbUserSession;
        this.A0I = context;
        this.A0J = r304;
        this.A08 = GOn.A0S(context);
        this.A0E = 1Bq.A00(115627);
        this.A06 = GOn.A0Z(context, fbUserSession);
        this.A03 = GOn.A0U(context, fbUserSession);
        this.A02 = GOn.A0Y(context, fbUserSession);
        this.A05 = GOn.A0a(context, fbUserSession);
        this.A0H = 1Lm.A00(context, fbUserSession, 83954);
        this.A0C = 1Bu.A01(context, 115092);
        this.A07 = 1Lm.A00(context, fbUserSession, 114849);
        this.A04 = GOn.A0c(context, fbUserSession);
        this.A0D = 1Lm.A00(context, fbUserSession, 99477);
        this.A0F = GOn.A0T(context, fbUserSession);
        this.A01 = GOn.A0X(context, fbUserSession);
        this.A0G = 1Bu.A01(context, 85079);
        this.A09 = 1Bu.A01(context, 115625);
        this.A0A = 1Bq.A00(115522);
        this.A0B = 1BK.A0C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        if (r0.isEmpty() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        r310 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017a, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018c, code lost:
    
        if (r0.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018f, code lost:
    
        r0 = (X.JOL) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a7, code lost:
    
        if (r0.getType() == 5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b3, code lost:
    
        if ((r0 instanceof X.JKD) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d1, code lost:
    
        if (r0.BSb(r0.A0G) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0174, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifz.A00():boolean");
    }

    @Override // X.NAr
    public Integer AVn() {
        State state = (State) GOn.A0v(this.A0J).A00(State.class);
        if (state != null && state.callState == 2) {
            C00i c00i = this.A06.A00;
            if (!AbJ.A0j(c00i).A0T && ((AbJ.A0j(c00i).A0V || ((D09) 1Br.A0B(this.A0H)).A03()) && (!1Br.A07(((HUl) 1Br.A0B(this.A09)).A00).AZk(36315709424936293L) || ((CJC) 1Br.A0B(this.A0G)).A07(this.A00)))) {
                return 0S2.A00;
            }
        }
        return 0S2.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r306 == null) goto L8;
     */
    @Override // X.NAr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer AXp() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            com.facebook.rsys.state.gen.State r0 = X.AbstractC2326GOr.A0T(r0)
            r302 = r0
            r0 = r301
            X.1Br r0 = r0.A0E
            r303 = r0
            r0 = r303
            boolean r0 = X.I29.A00(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L51
            r0 = 115727(0x1c40f, float:1.62168E-40)
            r305 = r0
            r0 = r301
            android.content.Context r0 = r0.A0I
            r1 = r305
            java.lang.Object r0 = X.1Bu.A06(r0, r1)
            X.Gw0 r0 = (X.Gw0) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r303
            X.HBP r0 = X.JOT.A00(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L3f
        L3a:
            X.HBP r0 = X.HBP.A03
            r306 = r0
        L3f:
            r0 = r302
            int r0 = r0.callState
            r305 = r0
            r0 = 2
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 == r1) goto L64
            java.lang.Integer r0 = X.0S2.A0C
            return r0
        L51:
            r0 = r301
            X.1Br r0 = r0.A05
            X.JOT r0 = X.GOq.A0r(r0)
            r303 = r0
            r0 = r303
            X.HBP r0 = r0.AfZ()
            r306 = r0
            goto L3f
        L64:
            X.HBP r0 = X.HBP.A02
            r303 = r0
            r0 = r306
            r1 = r303
            if (r0 == r1) goto L7c
            X.HBP r0 = X.HBP.A05
            r303 = r0
            r0 = r306
            r1 = r303
            if (r0 == r1) goto L7c
            java.lang.Integer r0 = X.0S2.A00
            return r0
        L7c:
            java.lang.Integer r0 = X.0S2.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifz.AXp():java.lang.Integer");
    }

    @Override // X.NAr
    public Integer Ajp() {
        return 0S2.A00;
    }

    @Override // X.NAr
    public Integer AoR() {
        return A00() ? 0S2.A00 : 0S2.A0C;
    }

    @Override // X.NAr
    public Integer Ayc() {
        C00i c00i = this.A03.A00;
        if (AbstractC2326GOr.A0T(c00i).callState != 2) {
            return 0S2.A0C;
        }
        CallModel A0V = AbL.A0V(c00i.get());
        return (A0V == null || IFr.A0F(A0V)) ? 0S2.A00 : 0S2.A01;
    }

    @Override // X.NAr
    public Integer B2S() {
        return 0S2.A00;
    }

    @Override // X.NAr
    public Integer B5u() {
        return AbstractC2326GOr.A0T(this.A03.A00).callState == 2 ? 0S2.A00 : 0S2.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (X.IMK.A00(r0) == X.0S2.A0Y) goto L8;
     */
    @Override // X.NAr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BAf() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Integer r0 = X.IMK.A00(r0)
            r303 = r0
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L37
            r0 = r302
            java.lang.Integer r0 = X.IMK.A00(r0)
            r303 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L37
            r0 = r302
            java.lang.Integer r0 = X.IMK.A00(r0)
            r302 = r0
            java.lang.Integer r0 = X.0S2.A0Y
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L3a
        L37:
            r0 = 1
            r305 = r0
        L3a:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifz.BAf():boolean");
    }

    @Override // X.NAr
    public Integer BE1() {
        JNg A00;
        int ordinal;
        1Br.A0C(this.A0C);
        if (!IFr.A0H((CallModel) 7zU.A0k(this.A0J)) || !GOp.A0s(this.A05).A1f.A01() || IEo.A05(this.A04) || ((A00 = Hn2.A00(((I2q) 1Br.A0B(this.A0A)).A05)) != null && A00.BQN())) {
            return 0S2.A0C;
        }
        H9F h9f = ((Hpr) 1Br.A0B(this.A07)).A00;
        return (h9f == null || (ordinal = h9f.ordinal()) == 0 || ordinal != 1) ? 0S2.A00 : 0S2.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (r304 == false) goto L24;
     */
    @Override // X.NAr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer BJo() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            com.facebook.rsys.call.gen.CallModel r0 = X.AbL.A0V(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lb9
            r0 = r303
            boolean r0 = X.IFr.A0H(r0)
            r304 = r0
        L1b:
            r0 = r302
            com.facebook.rsys.state.gen.State r0 = X.AbstractC2326GOr.A0T(r0)
            r303 = r0
            r0 = r303
            int r0 = r0.callState
            r305 = r0
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto Lc2
            r0 = r301
            X.1Br r0 = r0.A0D
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.IED r0 = (X.IED) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A08()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lbe
            r0 = r301
            X.1Br r0 = r0.A0F
            X.2Qb r0 = X.AbJ.A0X(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0H()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lbe
            r0 = r301
            X.1Br r0 = r0.A06
            X.2QN r0 = X.GOq.A0s(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0a
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lb1
            r0 = r301
            X.1Br r0 = r0.A09
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.HUl r0 = (X.HUl) r0
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1Br.A07(r0)
            r307 = r0
            r0 = 36315709424870756(0x8104f200092564, double:3.029539099688198E-306)
            r308 = r0
            r0 = r307
            r1 = r308
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb1
            r0 = r301
            X.1Br r0 = r0.A0G
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.CJC r0 = (X.CJC) r0
            r302 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.A07(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lbe
        Lb1:
            r0 = r304
            if (r0 != 0) goto Lc6
            java.lang.Integer r0 = X.0S2.A01
            return r0
        Lb9:
            r0 = 1
            r304 = r0
            goto L1b
        Lbe:
            r0 = r304
            if (r0 != 0) goto Lc6
        Lc2:
            java.lang.Integer r0 = X.0S2.A0C
            return r0
        Lc6:
            java.lang.Integer r0 = X.0S2.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifz.BJo():java.lang.Integer");
    }

    @Override // X.NAr
    public /* synthetic */ 8Lu D4H(Ig0 ig0, Integer num) {
        1BL.A1F(ig0, num);
        return new 8Lu(ig0, num);
    }
}
