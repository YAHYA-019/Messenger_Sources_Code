package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.google.common.base.Optional;
import java.util.Iterator;

/* loaded from: GrQ.class */
public final class GrQ extends Gqk {
    public final Context A00;
    public final FbUserSession A01;
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
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 2JM A0N;
    public final JLm A0O;
    public final HG7 A0P;
    public final JFY A0Q;
    public final HGB A0R;
    public final JFb A0S;
    public final JFe A0T;
    public final HFZ A0U;
    public final 1qP A0V;
    public final HFr A0W;
    public final Ht3 A0X;
    public final JIh A0Y;
    public final JGM A0Z;
    public final 3Fu A0a;
    public final 2QY A0b;
    public final C01i A0c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrQ(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        7zR.A1O(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A02 = GOn.A0X(context, fbUserSession);
        this.A03 = GOn.A0Y(context, fbUserSession);
        this.A06 = 1Lm.A00(context, fbUserSession, 114848);
        this.A0L = 1Lm.A00(context, fbUserSession, 114852);
        this.A09 = GOn.A0d(context, fbUserSession);
        this.A0E = GOn.A0e(context, fbUserSession);
        this.A0I = GOn.A0b(context, fbUserSession);
        this.A0J = GOn.A0Z(context, fbUserSession);
        this.A04 = GOn.A0U(context, fbUserSession);
        this.A0K = GOn.A0W(context, fbUserSession);
        this.A0M = GOn.A0T(context, fbUserSession);
        this.A0F = 1Lm.A00(context, fbUserSession, 114861);
        this.A0G = GOn.A0V(context, fbUserSession);
        this.A0H = 1Lm.A00(context, fbUserSession, 67679);
        this.A0B = 1Lm.A00(context, fbUserSession, 82190);
        this.A07 = 1Bu.A01(context, 114982);
        this.A0c = J9s.A00(this, C03i.A02, 11);
        this.A08 = 1Lm.A00(context, fbUserSession, 115514);
        this.A0D = 1Bu.A01(context, 114936);
        this.A0A = GOn.A0S(context);
        this.A0C = 1BK.A0C();
        this.A05 = GOn.A0a(context, fbUserSession);
        this.A0R = new Gpl(this, 5);
        this.A0O = GpZ.A00(this, 12);
        this.A0W = new Gq0(this, 1);
        this.A0S = new IYW(this);
        this.A0U = new Gpt(this, 1);
        this.A0X = new Gq8(this, 1);
        this.A0b = Gys.A00(this, 7);
        this.A0N = IY8.A01(this, 13);
        this.A0a = Gyu.A00(this, 7);
        this.A0V = new Gpy(this, 4);
        this.A0Y = new IZB(this, 1);
        this.A0P = new Gpg(this, 1);
        this.A0T = new IYc(this);
        this.A0Q = new IYJ(this);
        this.A0Z = new If4(this, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0683, code lost:
    
        if (r0 == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x07d1, code lost:
    
        if (X.GOp.A0R(r0).A0B == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        if (((X.I4i) X.1Br.A0B(r301.A06)).A03() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02d1, code lost:
    
        if (X.IFr.A01(X.GOq.A0j(r0)) > 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0394, code lost:
    
        if (X.GOq.A0b(r301.A0E).A0H == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03f6, code lost:
    
        if (X.GOq.A0b(r301.A0E).A0H != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x049d, code lost:
    
        if (((X.GR1) X.1Br.A0B(r0)).A03 == 1) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x061c A[Catch: Exception -> 0x06e1, all -> 0x06fb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x06e1, blocks: (B:103:0x0598, B:104:0x059d, B:107:0x05a9, B:110:0x05b3, B:113:0x061c, B:114:0x0623, B:116:0x062c, B:117:0x0632, B:119:0x0640, B:120:0x0647, B:122:0x0658, B:123:0x065f, B:124:0x0666, B:125:0x066d, B:131:0x068b, B:136:0x06a8, B:138:0x06af, B:139:0x06b4, B:146:0x06a0, B:147:0x05bd, B:152:0x060b, B:152:0x060b, B:154:0x0610, B:155:0x05ce, B:157:0x05e0, B:165:0x0606, B:168:0x06cc, B:170:0x06d9, B:172:0x06e0), top: B:102:0x0598, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0754 A[Catch: all -> 0x089a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x089a, blocks: (B:95:0x055f, B:98:0x056b, B:100:0x0590, B:139:0x06b4, B:144:0x073c, B:178:0x06fd, B:179:0x0704, B:181:0x0724, B:183:0x072b, B:195:0x0743, B:196:0x0748, B:199:0x0754, B:201:0x0780, B:203:0x0790), top: B:94:0x055f }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x056b A[Catch: all -> 0x089a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x089a, blocks: (B:95:0x055f, B:98:0x056b, B:100:0x0590, B:139:0x06b4, B:144:0x073c, B:178:0x06fd, B:179:0x0704, B:181:0x0724, B:183:0x072b, B:195:0x0743, B:196:0x0748, B:199:0x0754, B:201:0x0780, B:203:0x0790), top: B:94:0x055f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C2644Gjy A00(X.GrQ r301, java.lang.Boolean r302, java.lang.Boolean r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 2219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrQ.A00(X.GrQ, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):X.Gjy");
    }

    public static final void A01(GrQ grQ) {
        grQ.A0Z(A00(grQ, null, null, null));
    }

    public static void A02(GrQ grQ, int i) {
        grQ.A0Z(A00(grQ, null, null, Integer.valueOf(i)));
    }

    public static void A03(Object obj) {
        A01((GrQ) obj);
    }

    private final boolean A08() {
        CallModel A0S = AbstractC2326GOr.A0S(this.A04);
        if (A0S == null) {
            return 1Br.A07(this.A0C).AZk(2342158727228892521L);
        }
        int i = A0S.inCallState;
        if (i == 2 || i == 0) {
            return false;
        }
        1Br r0 = this.A02;
        if (GOp.A0R(r0).A0D) {
            return false;
        }
        C00i c00i = this.A0J.A00;
        return (GOn.A0z(c00i).BUQ() || AbJ.A0j(c00i).A0T || GOp.A0W(this.A09).A02 != HAU.A07 || GOp.A0R(r0).A09 == 0S2.A0N || GOq.A1S(this.A0G)) ? false : true;
    }

    public void A0f(float f) {
        1Br r0 = this.A03;
        GR1 gr1 = (GR1) 1Br.A0B(r0);
        if (((GR1) 1Br.A0B(r0)).AVX() == 35) {
            f = 1.0f;
        }
        if (f != gr1.A00) {
            gr1.A00 = f;
            Iterator A01 = GR1.A01(gr1);
            while (A01.hasNext()) {
                GpZ gpZ = (JLm) A01.next();
                if (gpZ instanceof GpZ) {
                    GpZ gpZ2 = gpZ;
                    switch (gpZ2.A00) {
                        case 4:
                            C2400Gc2.A07((C2400Gc2) gpZ2.A01);
                            break;
                        case 12:
                            A03(gpZ2.A01);
                            break;
                        case 15:
                            ((Gqj) gpZ2.A01).A0d();
                            break;
                        case 18:
                            Gr4.A00((Gr4) gpZ2.A01);
                            break;
                        case 19:
                            GrB grB = (GrB) gpZ2.A01;
                            grB.A0Z(IDo.A01(grB));
                            break;
                        case 29:
                            IYp.A03((IYp) gpZ2.A01);
                            break;
                        case 31:
                            gpZ2.A01();
                            break;
                        case 38:
                            GrR.A09((GrR) gpZ2.A01);
                            break;
                    }
                }
            }
            GR1.A03(gr1);
        }
    }

    public void A0g(int i) {
        GR1 gr1 = (GR1) 1Br.A0B(this.A03);
        if (gr1.A02 != i) {
            gr1.A02 = i;
            Iterator A01 = GR1.A01(gr1);
            while (A01.hasNext()) {
                GpZ gpZ = (JLm) A01.next();
                if (gpZ instanceof GpZ) {
                    GpZ gpZ2 = gpZ;
                    if (30 - gpZ2.A00 == 0) {
                        Gr7 gr7 = (Gr7) gpZ2.A01;
                        Optional fromNullable = Optional.fromNullable(((GS2) gr7).A01);
                        C00i A0R = AbF.A0R(gr7.A09);
                        if (fromNullable.isPresent()) {
                            IZd iZd = (IZd) fromNullable.get();
                            iZd.getClass();
                            GjI gjI = iZd.A01;
                            int i2 = iZd.A00;
                            A0R.get();
                            gr7.A0Z(new IZd(gjI, i2, true));
                        }
                    }
                }
            }
            GR1.A03(gr1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0h(int r302, java.lang.String r303, int r304) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrQ.A0h(int, java.lang.String, int):void");
    }

    public void A0i(JOL jol, String str) {
        1Br r0 = this.A03;
        if (jol.equals(((GR1) 1Br.A0B(r0)).A08)) {
            ((GR1) 1Br.A0B(r0)).ChU(str);
        }
    }
}
