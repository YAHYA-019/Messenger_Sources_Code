package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rtc.interfaces.WebrtcUiHandlerListenerParams;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: GrV.class */
public final class GrV extends Gqk {
    public int A00;
    public int A01;
    public Future A02;
    public C00m A03;
    public final Context A04;
    public final FbUserSession A05;
    public final HG5 A06;
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
    public final JLm A0l;
    public final HGB A0m;
    public final JFb A0n;
    public final HFZ A0o;
    public final HG1 A0p;
    public final 1qP A0q;
    public final HFr A0r;
    public final Ht3 A0s;
    public final 2Qn A0t;
    public final HFb A0u;
    public final JNq A0v;
    public final HFc A0w;
    public final JFn A0x;
    public final JIh A0y;
    public final IY8 A0z;
    public final 3Fu A10;
    public final 2Qe A11;
    public final 2QY A12;
    public final String A13;
    public final C01i A14;
    public final C01i A15;
    public final C01i A16;
    public final 1Br A17;
    public final 1Br A18;
    public final 1Br A19;
    public final Runnable A1A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrV(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        11T.A0F(fbUserSession, 1);
        11T.A0F(context, 3);
        this.A05 = fbUserSession;
        this.A13 = str;
        this.A04 = context;
        this.A07 = GOn.A0X(context, fbUserSession);
        this.A08 = GOn.A0Y(context, fbUserSession);
        this.A0B = GOn.A0a(context, fbUserSession);
        this.A0W = GOn.A0e(context, fbUserSession);
        this.A0O = 1HG.A00(context, 115775);
        this.A0g = GOn.A0W(context, fbUserSession);
        this.A0E = GOn.A0b(context, fbUserSession);
        this.A0D = 1Lm.A00(context, fbUserSession, 114848);
        this.A0F = GOn.A0Z(context, fbUserSession);
        this.A09 = GOn.A0U(context, fbUserSession);
        this.A19 = 1Bu.A01(context, 115692);
        this.A0i = GOn.A0P();
        this.A0M = GOn.A0d(context, fbUserSession);
        this.A17 = 1Bu.A01(context, 114802);
        this.A0Y = GOn.A0V(context, fbUserSession);
        this.A0j = GOn.A0T(context, fbUserSession);
        this.A0k = 1Bu.A01(context, 85079);
        this.A0A = GOn.A0c(context, fbUserSession);
        this.A0L = 1Bq.A00(115476);
        this.A0U = 1BK.A0C();
        this.A0R = 1Lm.A00(context, fbUserSession, 84176);
        this.A0c = 1Bu.A01(context, 115683);
        this.A0S = 1Lm.A00(context, fbUserSession, 114852);
        this.A0K = 1Lm.A00(context, fbUserSession, 98491);
        this.A0J = 1Bu.A01(context, 99980);
        this.A0d = 1Bu.A01(context, 115581);
        this.A0G = 1Lm.A00(context, fbUserSession, 114849);
        this.A0h = 1Lm.A00(context, fbUserSession, 85166);
        this.A0Q = 1Bu.A01(context, 115631);
        this.A0C = 1Lm.A00(context, fbUserSession, 99694);
        this.A0b = 1Lm.A00(context, fbUserSession, 114858);
        this.A0a = 1Bu.A01(context, 114938);
        this.A0Z = 1Lm.A00(context, fbUserSession, 114845);
        this.A0V = 1Bu.A01(context, 114936);
        this.A18 = 1Bu.A01(context, 115625);
        this.A0P = GOn.A0S(context);
        this.A0I = 1Bq.A00(115690);
        this.A0X = 1Lm.A00(context, fbUserSession, 114861);
        this.A0N = 1Bu.A01(context, 114878);
        this.A0e = 1Lm.A00(context, fbUserSession, 114859);
        this.A0H = 1Lm.A00(context, fbUserSession, 84181);
        this.A0T = 1Bq.A00(116389);
        C03i c03i = C03i.A02;
        this.A15 = J9u.A00(this, c03i, 26);
        this.A0f = 1Bq.A00(115668);
        this.A1A = new IrH(this);
        this.A0l = GpZ.A00(this, 3);
        this.A12 = Gys.A00(this, 4);
        this.A0n = new IYV(this);
        this.A14 = J9u.A00(this, c03i, 25);
        this.A0z = IY8.A01(this, 7);
        this.A10 = Gyu.A00(this, 4);
        this.A0s = new Gq8(this, 0);
        this.A0v = new GqC(this);
        this.A0o = new Gpt(this, 0);
        this.A0t = IYv.A00(this, 8);
        this.A0y = new IZB(this, 0);
        this.A0p = new Gpv(this, 0);
        this.A06 = new GgI(this, 7);
        this.A0m = new Gpl(this, 1);
        this.A0q = new Gpy(this, 0);
        this.A0x = new GqG(this, 0);
        this.A0w = new GqF(this, 0);
        this.A0r = new Gq0(this, 0);
        this.A0u = new GqB(this, 0);
        this.A11 = new Gyx(this, 1);
        this.A16 = J9u.A00(this, c03i, 27);
    }

    public static final int A00(GrV grV) {
        int i = 2132279338;
        int i2 = 0;
        if (GOp.A0W(grV.A0M).A0P()) {
            i2 = 0 + grV.A04.getResources().getDimensionPixelSize(2132279320);
        } else if (GOp.A0Q(grV.A08).A03 == 2) {
            i = 2132279339;
        }
        return i2 + DKG.A01(grV.A04, i);
    }

    public static final int A01(GrV grV) {
        JFq jFq = ((GS2) grV).A00;
        if (AbM.A1a(jFq) && GOq.A1M(((JPK) AbM.A0r(jFq)).getContext())) {
            1Br.A0C(grV.A0P);
            return GOp.A0R(grV.A07).A07();
        }
        1Br r0 = grV.A08;
        if (GOp.A0Q(r0).A03 != 2 || GOp.A0Q(r0).A04 != 3) {
            return 0;
        }
        Context context = grV.A04;
        return context.getResources().getDimensionPixelSize(2132279344) + DKH.A02(context);
    }

    public static final int A02(GrV grV) {
        JFq jFq = ((GS2) grV).A00;
        int i = 0;
        if (!(!AbM.A1a(jFq) ? false : GOq.A1M(((JPK) AbM.A0r(jFq)).getContext()))) {
            1Br r0 = grV.A08;
            if (GOp.A0Q(r0).A03 == 2 && GOp.A0Q(r0).A04 == 4) {
                Context context = grV.A04;
                i = DKH.A02(context) + context.getResources().getDimensionPixelSize(2131165281);
            }
        }
        return i;
    }

    public static final int A03(GrV grV) {
        Resources resources = grV.A04.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2132279342);
        IMJ A0F = GOp.A0F(grV.A0K);
        return dimensionPixelSize + (((A0F.A0B() || A0F.A0C()) && GOp.A0W(grV.A0M).A0O()) ? resources.getDimensionPixelSize(2132279346) : 0);
    }

    public static final int A08(GrV grV) {
        if (GOp.A0Q(grV.A08).A03 == 2 && GOp.A0W(grV.A0M).A0P()) {
            return grV.A04.getResources().getDimensionPixelSize(2132279333);
        }
        return 0;
    }

    public static final int A09(GrV grV) {
        if (!GOp.A0R(grV.A07).A0A) {
            return grV.A04.getResources().getDimensionPixelSize(2132279335);
        }
        Hoy hoy = (Hoy) 1Br.A0B(grV.A0C);
        Context context = grV.A04;
        return hoy.A00(context) + context.getResources().getDimensionPixelSize(2132279412);
    }

    public static final C1u3 A0A(GrV grV) {
        C1u3 c1u3 = null;
        if (grV.A01 == 2 && !GOp.A0X(grV.A0R).A0A && !(!((I4x) 1Br.A0B(grV.A0b)).A01.isEmpty()) && A0T(grV, true)) {
            c1u3 = C1u3.A48;
        }
        return c1u3;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [X.I0g, java.lang.Object] */
    public static final I0g A0B(GrV grV) {
        boolean z;
        JDB jdb = ((GS2) grV).A01;
        if (!AbM.A1a(jdb)) {
            I0g i0g = new I0g();
            if (GOp.A0s(grV.A0B).A0y()) {
                1Br.A0C(grV.A0P);
            }
            i0g.A0h = false;
            1Br r0 = grV.A0P;
            1Br.A0C(r0);
            i0g.A0U = true;
            i0g.A00 = A00(grV);
            i0g.A0i = A0S(grV);
            int i = 2132279340;
            int i2 = 0;
            if (GOp.A0W(grV.A0M).A0P()) {
                i2 = grV.A04.getResources().getDimensionPixelSize(2132279320);
            } else if (GOp.A0Q(grV.A08).A03 == 2) {
                i = 2132279339;
            }
            Context context = grV.A04;
            i0g.A0C = i2 + DKG.A01(context, i);
            Hoy hoy = (Hoy) 1Br.A0B(grV.A0C);
            11T.A0F(context, 0);
            i0g.A0A = hoy.A00(context) - ((IMK) hoy.A00.get()).A07();
            int i3 = 2131957567;
            if (GOq.A0s(grV.A0F).A0V) {
                i3 = 2131957568;
            }
            i0g.A07 = i3;
            1Br.A0C(r0);
            i0g.A0B = GOp.A0R(grV.A07).A07.left;
            i0g.A09 = A09(grV);
            HDa hDa = GOp.A0f(grV.A0e).A00;
            i0g.A0H = hDa;
            C1pq.A08("callScreenLayout", hDa);
            I0g.A00(i0g, "callScreenLayout");
            return i0g;
        }
        IZy iZy = (IZy) AbM.A0r(jdb);
        ?? obj = new Object();
        obj.A0N = AnonymousClass001.A0v();
        iZy.getClass();
        obj.A0O = iZy.A0O;
        obj.A0H = iZy.A0H;
        obj.A00 = iZy.A00;
        obj.A01 = iZy.A01;
        obj.A0J = iZy.A0J;
        obj.A02 = iZy.A02;
        obj.A03 = iZy.A03;
        obj.A04 = iZy.A04;
        obj.A0P = iZy.A0P;
        obj.A05 = iZy.A05;
        obj.A06 = iZy.A06;
        obj.A07 = iZy.A07;
        obj.A0G = iZy.A0G;
        obj.A0K = iZy.A0K;
        obj.A0I = iZy.A0I;
        obj.A0Q = iZy.A0Q;
        obj.A0R = iZy.A0R;
        obj.A0S = iZy.A0S;
        obj.A0T = iZy.A0T;
        obj.A0U = iZy.A0U;
        obj.A0V = iZy.A0V;
        obj.A0W = iZy.A0W;
        obj.A0X = iZy.A0X;
        obj.A0Y = iZy.A0Y;
        obj.A0Z = iZy.A0Z;
        obj.A0a = iZy.A0a;
        obj.A0b = iZy.A0b;
        obj.A0c = iZy.A0c;
        obj.A0d = iZy.A0d;
        obj.A0e = iZy.A0e;
        obj.A0f = iZy.A0f;
        obj.A0g = iZy.A0g;
        obj.A0h = iZy.A0h;
        obj.A0L = iZy.A0L;
        obj.A0E = iZy.A0E;
        obj.A08 = iZy.A08;
        obj.A09 = iZy.A09;
        obj.A0M = iZy.A0M;
        obj.A0A = iZy.A0A;
        obj.A0i = iZy.A0i;
        obj.A0B = iZy.A0B;
        obj.A0C = iZy.A0C;
        obj.A0D = iZy.A0D;
        obj.A0F = iZy.A0F;
        obj.A0N = AbF.A1E(iZy.A0N);
        if (((Hmf) 1Br.A0B(grV.A0V)).A00(grV.A05) && !GOp.A0t(grV.A0E).Aas(2QW.A0C).isEmpty() && GOp.A0R(grV.A07).A09 == 0S2.A00) {
            1Br.A0C(grV.A0P);
            z = true;
        } else {
            z = false;
        }
        obj.A0V = z;
        1Br.A0C(grV.A0P);
        obj.A0B = GOp.A0R(grV.A07).A07.left;
        return obj;
    }

    public static final JOS A0C(GrV grV) {
        return GOp.A0Q(grV.A08);
    }

    public static final IMK A0D(GrV grV) {
        return GOp.A0R(grV.A07);
    }

    public static final C2p1 A0E(GrV grV) {
        C00i c00i = grV.A0j.A00;
        VideoChatLink videoChatLink = AbG.A0m(c00i).A06;
        String str = videoChatLink != null ? videoChatLink.A0Q : null;
        if (GOq.A0s(grV.A0F).A05 == null && GOq.A1N(c00i) && str != null) {
            1Lo.A09(grV.A05, ((CJC) 1Br.A0B(grV.A0k)).A00, 49772);
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.m11011add((Object) str);
            return new 5Xv((ParticipantInfo) null, builder.build(), (String) null, -1);
        }
        String str2 = ((Gqk) grV).A00;
        if (IFr.A0L((CallModel) GOp.A0n(str2).A00(CallModel.class)) || IFr.A0B((CallModel) GOp.A0n(str2).A00(CallModel.class))) {
            return ((CNb) 1Br.A0B(grV.A0h)).A00;
        }
        return null;
    }

    public static final String A0F(GrV grV) {
        Context context;
        int i;
        String str = null;
        if (grV.A01 == 2) {
            C00i c00i = grV.A0R.A00;
            if (((I5k) c00i.get()).A0A) {
                str = 1BK.A0v(grV.A04, ((EuS) 1Bi.A03(99806)).A00(((I5k) c00i.get()).A00), 2131965149);
            } else if (!1BK.A1Y(((I4x) 1Br.A0B(grV.A0b)).A01)) {
                if (A0T(grV, true)) {
                    context = grV.A04;
                    i = 2131964984;
                } else {
                    CallModel callModel = (CallModel) 7zU.A0k(GS2.A04(grV));
                    if (callModel != null && callModel.connectionQuality == 1) {
                        context = grV.A04;
                        i = 2131968091;
                    }
                }
                return context.getString(i);
            }
        }
        return str;
    }

    public static final String A0G(GrV grV) {
        Context context;
        int i;
        Object[] objArr;
        String str = "";
        if (GOp.A0X(grV.A0R).A0A) {
            C00i c00i = grV.A0b.A00;
            if (!((I4x) c00i.get()).A01.isEmpty()) {
                str = String.valueOf(((I4x) c00i.get()).A01.size());
            }
        } else {
            ImmutableList A00 = ((Hrd) 1Br.A0B(grV.A0a)).A00(grV.A05);
            int size = A00.size();
            if (size != 0) {
                if (size != 1) {
                    context = grV.A04;
                    i = 2131964990;
                    if (size != 2) {
                        i = 2131964989;
                        objArr = AnonymousClass001.A1b(I6L.A00((I9O) A00.get(0)), A00.size() - 1);
                        return AbG.A17(context, objArr, i);
                    }
                } else {
                    context = grV.A04;
                    i = 2131964992;
                }
                objArr = new Object[]{I6L.A00((I9O) A00.get(0))};
                return AbG.A17(context, objArr, i);
            }
        }
        return str;
    }

    public static void A0H(ActiveCallControls activeCallControls) {
        GrV grV = (GrV) activeCallControls.A1D.getValue();
        A0C(grV).Cgs();
        A0C(grV).D0D(2);
    }

    public static final void A0I(GrV grV) {
        I0g A0B = A0B(grV);
        A0B.A0O = A0N(grV);
        A0B.A03 = A01(grV);
        A0B.A04 = A02(grV);
        A0B.A00 = A00(grV);
        A0B.A06 = A08(grV);
        A0B.A0e = A0Q(grV);
        A0B.A0d = A0R(grV);
        1Br.A0C(grV.A0P);
        A0B.A0f = false;
        A0B.A05 = A03(grV);
        int i = GOp.A0Q(grV.A08).A03;
        Resources resources = grV.A04.getResources();
        int i2 = 2132279320;
        if (i != 2) {
            i2 = 2132279298;
        }
        A0B.A01 = resources.getDimensionPixelSize(i2);
        A0B.A0i = A0S(grV);
        IZy.A00(A0B, grV);
    }

    public static final void A0J(GrV grV) {
        if (grV.A02 == null) {
            grV.A02 = GOp.A1H(grV.A0i).schedule(grV.A1A, 5000L, TimeUnit.MILLISECONDS);
        }
    }

    public static final void A0K(GrV grV) {
        View view;
        JNg A00 = Hn2.A00(grV.A0T);
        if (A00 == null || A00.BQq()) {
            return;
        }
        Object A05 = GS2.A05(grV);
        if (!(A05 instanceof View) || (view = (View) A05) == null) {
            return;
        }
        view.post(new IrI(grV));
    }

    public static final void A0L(GrV grV) {
        I0g A0B = A0B(grV);
        A0B.A0I = A0E(grV);
        A0B.A0K = A0F(grV);
        A0B.A0G = A0A(grV);
        A0B.A0M = A0G(grV);
        IZy.A00(A0B, grV);
    }

    public static final void A0M(GrV grV) {
        1Br r0 = grV.A07;
        if (!IMK.A06(GOp.A0R(r0), false)) {
            GOo.A1R(grV.A02);
            grV.A02 = null;
        } else if (GOp.A0R(r0).A09 == 0S2.A00) {
            A0J(grV);
        }
    }

    public static final boolean A0N(GrV grV) {
        if (GOo.A1X(GOp.A0n(((Gqk) grV).A00))) {
            return false;
        }
        return ((GOp.A0W(grV.A0M).A0P() && GOp.A0p(grV.A0J).A01.AZk(36316813231073780L)) || GOp.A0Q(grV.A08).A04 == 4 || IFr.A0K((CallModel) 7zU.A0k(GS2.A04(grV)))) ? false : true;
    }

    public static final boolean A0O(GrV grV) {
        CallModel callModel = (CallModel) 7zU.A0k(GS2.A04(grV));
        boolean z = false;
        if (callModel != null && callModel.callConnectedTimestampMs > 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.GOp.A0R(r0).A09 == X.0S2.A0Y) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0P(X.GrV r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A07
            r301 = r0
            r0 = r301
            X.IMK r0 = X.GOp.A0R(r0)
            java.lang.Integer r0 = r0.A09
            r302 = r0
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2b
            r0 = r301
            X.IMK r0 = X.GOp.A0R(r0)
            r303 = r0
            r0 = r303
            java.lang.Integer r0 = r0.A09
            r301 = r0
            java.lang.Integer r0 = X.0S2.A0Y
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r301
            r1 = r302
            if (r0 != r1) goto L2f
        L2b:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L2f:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrV.A0P(X.GrV):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (X.GOq.A0b(r301.A0W).A0H != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0Q(X.GrV r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A0X
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.I3q r0 = (X.I3q) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L34
            r0 = r301
            X.1Br r0 = r0.A0P
            r302 = r0
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r301
            X.1Br r0 = r0.A0W
            X.IYp r0 = X.GOq.A0b(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0H
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L38
        L34:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L38:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrV.A0Q(X.GrV):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        if (X.GOq.A0b(r301.A0W).A0H == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0R(X.GrV r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A0X
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.I3q r0 = (X.I3q) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L52
            r0 = r301
            X.1Br r0 = r0.A0P
            r302 = r0
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r302
            X.1Br.A0C(r0)
            r0 = r301
            X.1Br r0 = r0.A07
            X.IMK r0 = X.GOp.A0R(r0)
            java.lang.Integer r0 = r0.A09
            r304 = r0
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L52
            r0 = r301
            X.1Br r0 = r0.A0W
            X.IYp r0 = X.GOq.A0b(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0H
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L56
        L52:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L56:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrV.A0R(X.GrV):boolean");
    }

    public static final boolean A0S(GrV grV) {
        if (GOp.A0Q(grV.A08).A03 != 1 || grV.A01 != 2) {
            return false;
        }
        C00i c00i = grV.A09.A00;
        2JS A0o = GOq.A0o(c00i);
        11T.A0F(A0o, 0);
        if (IFr.A0D(GOq.A0j(A0o)) || GOp.A0Y(grV.A0S).A02 || GOp.A0W(grV.A0M).A0P() || GOq.A1S(grV.A0Y)) {
            return false;
        }
        if (!GOq.A0s(grV.A0F).A0V || !((I3N) 1Br.A0B(grV.A0Q)).A02()) {
            2JS A0o2 = GOq.A0o(c00i);
            11T.A0F(A0o2, 0);
            if (IFr.A0N(GOq.A0j(A0o2)).length <= 2) {
                return false;
            }
        }
        return ((I3N) 1Br.A0B(grV.A0Q)).A01();
    }

    public static final boolean A0T(GrV grV, boolean z) {
        CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) GOp.A0n(((Gqk) grV).A00).A00(CryptoE2eeModel.class);
        if (cryptoE2eeModel == null || cryptoE2eeModel.mode != 2) {
            return false;
        }
        if (z) {
            return 7zQ.A1a(grV.A15);
        }
        1Br.A0C(grV.A0P);
        return false;
    }

    public void A0b() {
        GOp.A0w(this.A0F).Cf7(this.A10);
        GOp.A0O(this.A09).A02(this.A0z);
        GOp.A0a(this.A0W).CeX(this.A0s);
        GOp.A0u(this.A0E).CeZ(this.A12);
        ((I4i) 1Br.A0B(this.A0D)).A02(this.A0n);
        ((I9M) 1Br.A0B(this.A0O)).A02(this.A0v);
        GOp.A0W(this.A0M).A0L(this.A0o);
        GOp.A0R(this.A07).A0A(this.A0m);
        GOp.A0Q(this.A08).CeV(this.A0l);
        GOp.A0e(this.A0Y).A03(this.A0t);
        GOp.A0X(this.A0R).A04(this.A0p);
        ILS A0Y = GOp.A0Y(this.A0S);
        HFr hFr = this.A0r;
        11T.A0F(hFr, 0);
        A0Y.A0B.remove(hFr);
        ((I3q) 1Br.A0B(this.A0X)).A02(this.A0y);
        GOp.A0F(this.A0K).A09(this.A06);
        2Qb A0X = AbJ.A0X(this.A0j);
        A0X.A0V.remove(this.A0q);
        ((CNb) 1Br.A0B(this.A0h)).A03(this.A0x);
        ((I4x) 1Br.A0B(this.A0b)).A02(this.A0u);
        GOp.A0s(this.A0B).A0k(this.A11);
        GOp.A0f(this.A0e).A02(this.A0w);
        JNg A00 = Hn2.A00(this.A0T);
        if (A00 != null) {
            A00.Cee("ActiveCallControlsPresenter");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            GOp.A0o(this.A0f).A0A((Function1) this.A14.getValue());
        }
        GOo.A1R(this.A02);
        this.A02 = null;
        C00m c00m = this.A03;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        C00i c00i = this.A0F.A00;
        2QO A0z = GOn.A0z(c00i);
        3Fu r0 = this.A10;
        A0z.A7G(r0);
        C00i c00i2 = this.A09.A00;
        2JN A0R = GOo.A0R(c00i2);
        IY8 iy8 = this.A0z;
        A0R.A03(iy8, AnonymousClass001.A0v());
        JOM A0a = GOp.A0a(this.A0W);
        Ht3 ht3 = this.A0s;
        A0a.A62(ht3);
        2QT A0u = GOp.A0u(this.A0E);
        2QY r02 = this.A12;
        A0u.A67(r02);
        I4i i4i = (I4i) 1Br.A0B(this.A0D);
        JFb jFb = this.A0n;
        i4i.A01(jFb);
        ((I9M) 1Br.A0B(this.A0O)).A03(this.A0v, 100);
        IML A0W = GOp.A0W(this.A0M);
        HFZ hfz = this.A0o;
        A0W.A0K(hfz);
        IMK A0R2 = GOp.A0R(this.A07);
        HGB hgb = this.A0m;
        A0R2.A09(hgb);
        JOS A0Q = GOp.A0Q(this.A08);
        JLm jLm = this.A0l;
        A0Q.A60(jLm);
        GOp.A0e(this.A0Y).A02(this.A0t);
        I3q i3q = (I3q) 1Br.A0B(this.A0X);
        JIh jIh = this.A0y;
        i3q.A01(jIh);
        I5k A0X = GOp.A0X(this.A0R);
        HG1 hg1 = this.A0p;
        A0X.A03(hg1);
        ILS A0Y = GOp.A0Y(this.A0S);
        HFr hFr = this.A0r;
        11T.A0F(hFr, 0);
        A0Y.A0B.add(hFr);
        GOp.A0F(this.A0K).A08(this.A06);
        GOn.A1V(AbJ.A0X(this.A0j), this.A0q);
        ((CNb) 1Br.A0B(this.A0h)).A02(this.A0x);
        ((I4x) 1Br.A0B(this.A0b)).A01(this.A0u);
        IRF A0s = GOp.A0s(this.A0B);
        2Qe r03 = this.A11;
        A0s.A0l(r03, (WebrtcUiHandlerListenerParams) null);
        I4j A0f = GOp.A0f(this.A0e);
        HFc hFc = this.A0w;
        A0f.A01(hFc);
        JNg A00 = Hn2.A00(this.A0T);
        if (A00 != null) {
            A00.A6O((HGE) this.A16.getValue(), "ActiveCallControlsPresenter");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            GOp.A0o(this.A0f).A09((Function1) this.A14.getValue());
        }
        this.A03 = GS2.A04(this).A01(new J9x(this, 0), true);
        r0.A08();
        r0.A0F(0S2.A0N, AbJ.A0j(c00i).A0A);
        IY8.A03(c00i2, iy8);
        ht3.A01();
        r02.CAo();
        jFb.BmK();
        hfz.A00();
        hgb.A01();
        hgb.A05();
        jLm.BvC();
        hg1.A02();
        hFr.A01();
        jIh.CLK();
        r03.A01();
        hFc.A00();
    }

    public final void A0f() {
        1Br r0 = this.A07;
        if (GOp.A0R(r0).A09 == 0S2.A0N) {
            GOp.A0R(r0).A0B(0S2.A00);
        }
    }

    public final void A0g() {
        1Br.A0C(this.A0P);
        A0f();
        1Br r0 = this.A07;
        if (GOp.A0R(r0).A09 == 0S2.A00 && IMK.A06(GOp.A0R(r0), false)) {
            GOo.A1R(this.A02);
            this.A02 = null;
            A0J(this);
        }
    }

    public final void A0h() {
        GOo.A1R(this.A02);
        this.A02 = null;
        Integer num = 0S2.A00;
        EffectItem effectItem = GOp.A0F(this.A0K).A00;
        if (effectItem == null || !effectItem.A13) {
            1Br r0 = this.A07;
            if (IMK.A06(GOp.A0R(r0), false)) {
                1Br r02 = this.A08;
                JOL B3j = GOp.A0Q(r02).B3j(GOp.A0Q(r02).AVX());
                if ((B3j == null || !B3j.BT9()) && (GOp.A0R(r0).A09.intValue() != 0 || GOp.A0R(r0).A0H || ((IZy) AbM.A0r(((GS2) this).A01)).A0P)) {
                    A0J(this);
                } else {
                    num = 0S2.A01;
                }
            }
        }
        1Br r03 = this.A0M;
        GOp.A0W(r03).A0M("CONTROLS_SWITCH");
        GOp.A0W(r03).A0H(HAU.A07);
        GOp.A0R(this.A07).A0B(num);
    }

    public final void A0i(String str) {
        A0f();
        IZI A0c = GOq.A0c(this.A0g);
        AbN.A0X(A0c).A02(A0c.A01, new Ifc(str, ImmutableMap.of((Object) "action_type", (Object) str)), "CALL_SETTINGS_TAP", "IN_CALL_HEADER");
        GOp.A0Q(this.A08).D0D(24);
    }

    public final void A0j(boolean z) {
        Integer num = (GOp.A0T(this.A0A).A07 || z) ? 0S2.A00 : 0S2.A01;
        1Br r0 = this.A07;
        if (GOp.A0R(r0).A09 != num) {
            GOp.A0R(r0).A0B(num);
            A0M(this);
        }
    }
}
