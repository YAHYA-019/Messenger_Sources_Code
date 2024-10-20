package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.reactions.gen.EmojiModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsParticipantModel;
import com.facebook.rtc.views.omnigrid.GridItemSize;
import com.facebook.user.model.UserKey;
import com.google.common.base.Optional;
import kotlin.jvm.functions.Function1;

/* loaded from: GrU.class */
public final class GrU extends Gqk {
    public int A00;
    public int A01;
    public GestureDetector A02;
    public N1W A03;
    public DqA A04;
    public JL8 A05;
    public UserKey A06;
    public C00m A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final FbUserSession A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final 1Br A0X;
    public final 1Br A0Y;
    public final 1Br A0Z;
    public final 1Br A0a;
    public final 1Br A0b;
    public final 1Br A0c;
    public final 1Br A0d;
    public final 1Br A0e;
    public final 1Br A0f;
    public final 1Br A0g;
    public final 1Br A0h;
    public final 1Br A0i;
    public final 1Br A0j;
    public final 1Br A0k;
    public final 1Br A0l;
    public final HGB A0m;
    public final JKF A0n;
    public final 1qP A0o;
    public final Ht3 A0p;
    public final HIp A0q;
    public final 2Qn A0r;
    public final JDA A0s;
    public final HVg A0t;
    public final HVh A0u;
    public final HVi A0v;
    public final HVj A0w;
    public final JFo A0x;
    public final IY8 A0y;
    public final 3Fu A0z;
    public final 2QY A10;
    public final C01i A11;
    public final C01i A12;
    public final C01i A13;
    public final Function1 A14;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrU(Context context, FbUserSession fbUserSession, String str, int i) {
        super(str);
        1BK.A1K(fbUserSession, 3, context);
        this.A0D = fbUserSession;
        this.A0C = context;
        this.A0G = GOn.A0b(context, fbUserSession);
        this.A0O = 1Lm.A00(context, fbUserSession, 114863);
        this.A0X = 1Bu.A01(context, 115684);
        this.A13 = J9t.A01(this, 25);
        this.A0g = 1Bu.A01(context, 82159);
        this.A0b = 1Bu.A01(context, 115428);
        this.A0W = 1Bu.A01(context, 1032);
        this.A11 = J9t.A01(this, 23);
        this.A12 = J9t.A01(this, 24);
        this.A0P = 1Bu.A01(context, 83436);
        this.A0Z = 1Bq.A00(115725);
        this.A0i = 1BK.A0E();
        this.A0T = 1Bu.A01(context, 115687);
        this.A0e = 1Bu.A01(context, 114920);
        this.A0j = 1Lm.A00(context, fbUserSession, 115589);
        this.A0K = GOn.A0d(context, fbUserSession);
        this.A0k = GOn.A0T(context, fbUserSession);
        this.A0E = GOn.A0X(context, fbUserSession);
        this.A0R = GOn.A0e(context, fbUserSession);
        this.A0U = 1Lm.A00(context, fbUserSession, 114987);
        this.A0I = 1Lm.A00(context, fbUserSession, 115519);
        this.A0V = GOn.A0V(context, fbUserSession);
        this.A0M = 1HG.A00(context, 115775);
        this.A0f = 1Lm.A00(context, fbUserSession, 114911);
        this.A0a = GOn.A0U(context, fbUserSession);
        this.A0N = GOn.A0S(context);
        this.A0J = 1Lm.A00(context, fbUserSession, 98491);
        this.A0S = 1Lm.A00(context, fbUserSession, 115705);
        this.A0l = 1Lm.A00(context, fbUserSession, 67965);
        this.A0d = GOn.A0W(context, fbUserSession);
        this.A0Q = 1Lm.A00(context, fbUserSession, 114855);
        this.A0H = GOn.A0Z(context, fbUserSession);
        this.A0h = 1Lm.A00(context, fbUserSession, 114851);
        this.A0F = GOn.A0a(context, fbUserSession);
        this.A0Y = 1Lm.A00(context, fbUserSession, 114859);
        this.A0c = 1Lm.A00(context, fbUserSession, 114999);
        this.A0L = 1Bq.A00(115036);
        1Bu.A00(115688).get();
        this.A0q = (HIp) 1Bn.A0A(115689);
        this.A01 = i;
        this.A0o = new Gpy(this, 9);
        this.A0x = new IZ7(this);
        this.A0y = IY8.A01(this, 47);
        this.A14 = new AV2(this, 6);
        this.A0z = Gyu.A00(this, 25);
        this.A10 = Gys.A00(this, 28);
        this.A0v = new HVi(this);
        this.A0m = new Gpl(this, 17);
        this.A0p = new Gq8(this, 13);
        this.A0s = new IYz(this, 3);
        this.A0t = new HVg(this);
        this.A0r = IYv.A00(this, 35);
        this.A0w = new HVj(this);
        this.A0n = new IYk(this);
        this.A0u = new HVh(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        if (r0.BUm(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrU.A00():int");
    }

    public static final JOM A01(GrU grU) {
        return GOp.A0a(grU.A0R);
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.Hka, java.lang.Object] */
    public static final Hka A02(GrU grU) {
        JDB jdb = ((GS2) grU).A01;
        if (!AbM.A1a(jdb)) {
            Boolean A03 = A03(grU);
            Hka hka = new Hka();
            hka.A0D = grU.A08;
            UserKey userKey = grU.A06;
            if (userKey == null) {
                throw 1BK.A0h();
            }
            hka.A07 = userKey;
            hka.A03 = grU.A01;
            hka.A0B = A03 != null ? A03.booleanValue() : false;
            hka.A0H = grU.A0B;
            hka.A02 = grU.A00();
            return hka;
        }
        IZv iZv = (IZv) AbM.A0r(jdb);
        ?? obj = new Object();
        iZv.getClass();
        obj.A08 = iZv.A08;
        obj.A05 = iZv.A05;
        obj.A00 = iZv.A00;
        obj.A01 = iZv.A01;
        obj.A06 = iZv.A06;
        obj.A02 = iZv.A02;
        obj.A0A = iZv.A0A;
        obj.A0B = iZv.A0B;
        obj.A0C = iZv.A0C;
        obj.A0D = iZv.A0D;
        obj.A0E = iZv.A0E;
        obj.A0F = iZv.A0F;
        obj.A07 = iZv.A07;
        obj.A09 = iZv.A09;
        obj.A03 = iZv.A03;
        obj.A04 = iZv.A04;
        obj.A0G = iZv.A0G;
        obj.A0H = iZv.A0H;
        obj.A0I = iZv.A0I;
        obj.A0J = iZv.A0J;
        obj.A0K = iZv.A0K;
        obj.A0L = iZv.A0L;
        obj.A0H = grU.A0B;
        return obj;
    }

    public static final Boolean A03(GrU grU) {
        ParticipantMediaState participantMediaState;
        if (grU.A08 || grU.A06 == null) {
            return null;
        }
        boolean z = true;
        Boolean bool = true;
        boolean equals = bool.equals(GOp.A0a(grU.A0R).A0E.get(grU.A06));
        CallModel A0S = AbstractC2326GOr.A0S(grU.A0a);
        if (A0S == null) {
            return false;
        }
        UserKey userKey = grU.A06;
        if (userKey == null) {
            throw 1BK.A0h();
        }
        String str = userKey.id;
        11T.A0A(str);
        CallParticipant A04 = IFr.A04(A0S, str);
        boolean A01 = (A04 == null || (participantMediaState = A04.mediaState) == null) ? false : Hvo.A01(participantMediaState);
        if ((!grU.A08 && grU.A01 == 3) || grU.A00 == 2 || GOp.A0w(grU.A0H).BUQ() || equals || !A01) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A08(GrU grU) {
        boolean z = false;
        boolean A00 = 9Dz.A00(GOp.A0n(((Gqk) grU).A00)).A00();
        if (grU.A08) {
            Hka A02 = A02(grU);
            if ((grU.A08 || grU.A01 != 3) && !A00 && GOp.A0w(grU.A0H).A0A == 0S2.A00) {
                z = true;
            }
            A02.A0B = z;
            A02.A0E = A00;
            IZv.A00(A02, grU);
        }
    }

    public static final void A09(GrU grU) {
        Hka A02 = A02(grU);
        A02.A02 = grU.A00();
        IZv.A00(A02, grU);
    }

    public static final void A0A(GrU grU) {
        grU.A0z.A0F(0S2.A0N, GOp.A0w(grU.A0H).A0A);
        2QY r0 = grU.A10;
        r0.CAp();
        r0.CAr();
        r0.CAo();
        GrU grU2 = grU.A0v.A00;
        A0F(grU2);
        A0G(grU2);
        grU.A0m.A01();
        Ht3 ht3 = grU.A0p;
        ht3.A01();
        A0E(grU.A0t.A00);
        grU.A0o.A0H();
        A09(grU);
        ht3.A02();
        grU.A0r.CBi();
        A0I(grU);
        HVh hVh = grU.A0u;
        1Br.A0C(grU.A0T);
        A0C(hVh.A00);
    }

    public static final void A0B(GrU grU) {
        GridItemSize gridItemSize;
        UserKey userKey = grU.A06;
        if (userKey != null) {
            IYp A0a = GOp.A0a(grU.A0R);
            String str = userKey.id;
            11T.A0A(str);
            boolean contains = A0a.A0G.contains(str);
            1Br.A0C(grU.A0N);
            int i = 5;
            JFq jFq = ((GS2) grU).A00;
            if (AbM.A1a(jFq) && 4YU.A0B(((JPT) AbM.A0r(jFq)).getContext()).orientation == 2) {
                C00i c00i = grU.A0S.A00;
                if ((((I1m) c00i.get()).A01().size() <= 0 || (gridItemSize = (GridItemSize) ((I1m) c00i.get()).A01().get(userKey.id)) == null || gridItemSize.height <= gridItemSize.width) && !I4j.A00(grU.A0Y)) {
                    i = 4;
                }
            }
            Hka A02 = A02(grU);
            A02.A01 = i;
            A02.A0F = contains;
            IZv.A00(A02, grU);
        }
    }

    public static final void A0C(GrU grU) {
        EmojiReactionsParticipantModel A00;
        EmojiModel emojiModel;
        I8n i8n = (I8n) grU.A11.getValue();
        EmojiReactionsModel emojiReactionsModel = i8n.A01;
        String str = null;
        if (emojiReactionsModel != null && (A00 = I8n.A00(emojiReactionsModel, i8n.A02)) != null && (A00.emojiExpiryTime * 1000) - 1Br.A00(i8n.A03) > 0 && (emojiModel = A00.emoji) != null) {
            str = emojiModel.emojiId;
        }
        boolean z = ((HzV) 1Br.A0B(grU.A0T)).A02;
        DqA dqA = grU.A04;
        boolean z2 = true;
        if (dqA == null || !dqA.A04) {
            z2 = false;
        }
        int A002 = IYp.A00(grU);
        C00i c00i = grU.A0V.A00;
        boolean A1P = GOq.A1P(c00i);
        Integer num = 0S2.A0C;
        JDB jdb = ((GS2) grU).A01;
        if (AbM.A1a(jdb)) {
            Optional fromNullable = Optional.fromNullable(jdb);
            if (!((IZv) fromNullable.get()).A0D && ((IZv) fromNullable.get()).A03 == 1 && !GOq.A1P(c00i) && GOp.A0a(grU.A0R).A07 <= 2) {
                num = 0S2.A01;
            }
        }
        grU.A04 = new DqA(num, str, A002, z, z2, A1P, grU.A09);
        Hka A02 = A02(grU);
        A02.A06 = grU.A04;
        IZv.A00(A02, grU);
    }

    public static final void A0D(GrU grU) {
        Hka A02;
        String str;
        UserKey userKey = grU.A06;
        if (userKey != null) {
            boolean z = false;
            if (grU.A01 != 1) {
                A02 = A02(grU);
                A02.A0K = false;
            } else {
                boolean z2 = GOp.A0w(grU.A0H).B4w().A02;
                2QU A0t = GOp.A0t(grU.A0G);
                String str2 = userKey.id;
                11T.A0A(str2);
                I9O B1U = A0t.B1U(str2);
                String str3 = null;
                if (z2 && B1U != null && (str = B1U.A07) != null && str.length() > 0) {
                    str3 = str;
                }
                A02 = A02(grU);
                if (z2 && str3 != null) {
                    z = true;
                }
                A02.A0K = z;
                A02.A09 = str3;
            }
            IZv.A00(A02, grU);
        }
    }

    public static final void A0E(GrU grU) {
        if (!GS2.A07(grU) || grU.A05 == null) {
            return;
        }
        Hka A02 = A02(grU);
        JL8 jl8 = grU.A05;
        if (jl8 == null) {
            throw 1BK.A0h();
        }
        A02.A08 = jl8.AV7(((JPT) GS2.A05(grU)).getContext());
        IZv.A00(A02, grU);
    }

    public static final void A0F(GrU grU) {
        Boolean A03 = A03(grU);
        if (A03 != null) {
            boolean booleanValue = A03.booleanValue();
            Hka A02 = A02(grU);
            A02.A0B = booleanValue;
            IZv.A00(A02, grU);
        }
    }

    public static final void A0G(GrU grU) {
        Hka A02;
        if (grU.A08 || grU.A06 == null) {
            return;
        }
        boolean z = false;
        if (grU.A01 != 1) {
            A02 = A02(grU);
            A02.A0A = false;
        } else {
            2QU A0t = GOp.A0t(grU.A0G);
            UserKey userKey = grU.A06;
            if (userKey == null) {
                throw 1BK.A0h();
            }
            String str = userKey.id;
            11T.A0A(str);
            I9O B1U = A0t.B1U(str);
            if (B1U == null) {
                return;
            }
            if (AbL.A1b(GOp.A0w(grU.A0H).B4w().A05()) && !AbJ.A0X(grU.A0k).A0I() && !GOp.A0a(grU.A0R).Cz5()) {
                z = true;
            }
            A02 = A02(grU);
            A02.A0A = z;
            A02.A0C = B1U.A03.A06;
        }
        IZv.A00(A02, grU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (X.AbL.A1b(X.GOp.A0w(r0).B4w().A05()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0H(X.GrU r301) {
        /*
            r0 = r301
            boolean r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L75
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 != r1) goto L75
            r0 = r301
            X.Hka r0 = A02(r0)
            r304 = r0
            r0 = r301
            X.1Br r0 = r0.A0H
            r305 = r0
            r0 = r305
            X.2QO r0 = X.GOp.A0w(r0)
            X.2QN r0 = (X.2QN) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0U
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r305
            X.2QO r0 = X.GOp.A0w(r0)
            X.2QQ r0 = r0.B4w()
            X.15h r0 = r0.A05()
            r306 = r0
            r0 = r306
            boolean r0 = X.AbL.A1b(r0)
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L54
        L4f:
            r0 = 0
            r302 = r0
            r0 = 0
            r306 = r0
        L54:
            r0 = r304
            r1 = r302
            r0.A0A = r1
            r0 = r305
            X.2QO r0 = X.GOp.A0w(r0)
            X.2QN r0 = (X.2QN) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0W
            r1 = 1
            r0 = r0 ^ r1
            r302 = r0
            r0 = r304
            r1 = r302
            r0.A0C = r1
            r0 = r304
            r1 = r301
            X.IZv.A00(r0, r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrU.A0H(X.GrU):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (X.2yD.A03(X.1Br.A07(((X.Bmc) X.1Br.A0B(r301.A0g)).A01), 2342155089391259482L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0I(X.GrU r301) {
        /*
            r0 = r301
            X.Hka r0 = A02(r0)
            r302 = r0
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = 4
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L41
            r0 = 5
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L41
            r0 = r301
            X.1Br r0 = r0.A0g
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Bmc r0 = (X.Bmc) r0
            X.1Br r0 = r0.A01
            r305 = r0
            r0 = r305
            X.2yD r0 = X.1Br.A07(r0)
            r306 = r0
            r0 = 2342155089391259482(0x208101a5000a0f5a, double:4.058870542632635E-152)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = X.2yD.A03(r0, r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L46
        L41:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L46:
            r0 = r302
            r1 = r304
            r0.A0L = r1
            r0 = r302
            r1 = r301
            X.IZv.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrU.A0I(X.GrU):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (X.11T.A0O(r0 != null ? r0.A00 : null, X.Gvg.A00) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if (X.IYp.A00(r301) != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        if (X.IFr.A0L(r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (X.IFr.A01(r0) <= 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0J(X.GrU r301) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrU.A0J(X.GrU):void");
    }

    public static final boolean A0K(MotionEvent motionEvent, GrU grU) {
        UserKey userKey = grU.A06;
        IYp A0a = GOp.A0a(grU.A0R);
        IMK A0R = GOp.A0R(grU.A0E);
        IDo A0V = GOp.A0V(grU.A0I);
        1BL.A1H(A0a, A0R, A0V);
        JFq jFq = ((GS2) grU).A00;
        if (!AbM.A1a(jFq)) {
            return false;
        }
        Object A0r = AbM.A0r(jFq);
        GOn.A1X(A0r);
        View view = (View) A0r;
        11T.A0F(view, 5);
        int bottom = view.getBottom();
        if (userKey != null) {
            String str = userKey.id;
            11T.A0A(str);
            if (A0a.A0F.contains(str)) {
                bottom = (bottom - A0R.A07.bottom) - view.getResources().getDimensionPixelSize(2132279344);
            }
        }
        float y = motionEvent.getY() / (bottom - view.getY());
        float f = 0.39999998f;
        if (A0V.A06) {
            f = 0.7f;
        }
        return y > f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c6, code lost:
    
        if ((r313 ^ r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0f() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrU.A0f():void");
    }
}
