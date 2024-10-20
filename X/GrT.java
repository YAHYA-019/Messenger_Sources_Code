package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.user.model.UserKey;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;

/* loaded from: GrT.class */
public final class GrT extends Gqk {
    public static final 8Jp A0Y = new 8Jp(2132279368, 2132279368, 2132279312, 2132279327, 0);
    public static final 8Jp A0Z = new 8Jp(2132279321, 2132279321, R.dimen.mapbox_eight_dp, 2132279310, 0);
    public int A00;
    public UserKey A01;
    public Hbb A02;
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
    public final HGB A0J;
    public final HFY A0K;
    public final HFa A0L;
    public final Ht3 A0M;
    public final 2Qn A0N;
    public final JDA A0O;
    public final JFo A0P;
    public final IY8 A0Q;
    public final 2Qe A0R;
    public final 2QY A0S;
    public final String A0T;
    public final Context A0U;
    public final FbUserSession A0V;
    public final 1Br A0W;
    public final I3j A0X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, X.HF6] */
    public GrT(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        7zR.A1O(fbUserSession, context);
        this.A0T = str;
        this.A0V = fbUserSession;
        this.A0U = context;
        this.A0H = 1Bu.A01(context, 1035);
        this.A0G = GOn.A0W(context, fbUserSession);
        this.A03 = GOn.A0X(context, fbUserSession);
        this.A05 = GOn.A0b(context, fbUserSession);
        this.A04 = GOn.A0a(context, fbUserSession);
        this.A0A = GOn.A0e(context, fbUserSession);
        this.A07 = 1Lm.A00(context, fbUserSession, 115519);
        this.A0D = GOn.A0V(context, fbUserSession);
        this.A06 = GOn.A0Z(context, fbUserSession);
        this.A09 = 1Lm.A00(context, fbUserSession, 99476);
        this.A0C = 1Lm.A00(context, fbUserSession, 114987);
        this.A0I = 1Bu.A01(context, 115052);
        this.A08 = GOn.A0S(context);
        this.A0F = GOn.A0U(context, fbUserSession);
        this.A0B = 1Lm.A00(context, fbUserSession, 115705);
        this.A0W = 1Bu.A00(115613);
        this.A0E = 1HG.A00(context, 67687);
        this.A0Q = IY8.A01(this, 50);
        this.A0J = new Gpl(this, 18);
        this.A0M = new Gq8(this, 14);
        this.A0S = Gys.A00(this, 29);
        this.A0R = new Gyx(this, 9);
        this.A0K = new Gps(this, 9);
        this.A0L = new Gq7(this, 7);
        this.A0O = new IYz(this, 4);
        this.A0N = IYv.A00(this, 37);
        this.A0P = new IZ8(this);
        C1F6 A0I = GOp.A0I(this.A0H);
        Hmh hmh = new Hmh(this);
        ?? obj = new Object();
        ((HF6) obj).A00 = 1000L;
        ((HF6) obj).A01 = 500L;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            I3j i3j = new I3j(hmh, obj);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0X = i3j;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.HkG, java.lang.Object] */
    public static final HkG A00(GrT grT) {
        JDB jdb = ((GS2) grT).A01;
        if (!AbM.A1a(jdb)) {
            HkG hkG = new HkG();
            boolean z = false;
            hkG.A09 = false;
            if (GOp.A0a(grT.A0A).A02 == 1) {
                z = true;
            }
            hkG.A07 = z;
            hkG.A06 = A0B(grT);
            return hkG;
        }
        IZw iZw = (IZw) AbM.A0r(jdb);
        ?? obj = new Object();
        ((HkG) obj).A05 = AnonymousClass001.A0v();
        iZw.getClass();
        ((HkG) obj).A06 = iZw.A06;
        ((HkG) obj).A07 = iZw.A07;
        ((HkG) obj).A08 = iZw.A08;
        ((HkG) obj).A09 = iZw.A09;
        ((HkG) obj).A0A = iZw.A0A;
        ((HkG) obj).A0B = iZw.A0B;
        ((HkG) obj).A01 = iZw.A01;
        ((HkG) obj).A02 = iZw.A02;
        ((HkG) obj).A03 = iZw.A03;
        ((HkG) obj).A0C = iZw.A0C;
        ((HkG) obj).A00 = iZw.A00;
        ((HkG) obj).A04 = iZw.A04;
        ((HkG) obj).A05 = AbF.A1E(iZw.A05);
        return obj;
    }

    public static final void A01(GrT grT) {
        int i;
        C00j.A05("RemoteVideoParticipantPresenter.maybeStartRenderingVideo", -1186373697);
        try {
            if (!GS2.A07(grT) || grT.A01 == null || grT.A00 == 0 || !GOp.A0R(grT.A03).A0G) {
                i = 149143260;
            } else {
                HkG A00 = A00(grT);
                A00.A0C = true;
                IZw.A00(A00, grT);
                if (GOq.A1Q(grT.A0E)) {
                    grT.A0X.A00();
                    if (grT.A02 == null) {
                        UserKey userKey = grT.A01;
                        if (userKey == null) {
                            throw 1BK.A0h();
                        }
                        long A03 = AbG.A03(userKey.id);
                        Object A05 = GS2.A05(grT);
                        11T.A0A(A05);
                        grT.A02 = new Hbb(grT.A0U, grT.A0V, (JPW) A05, A03);
                    }
                } else {
                    ((JKG) 1Br.A0B(grT.A0I)).D2N(grT.A0V, grT.A0X, grT.A01, Optional.fromNullable(((GS2) grT).A00), grT.A00);
                }
                i = 864434815;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1158743671);
            throw th;
        }
    }

    public static final void A02(GrT grT) {
        boolean z = true;
        if (grT.A01 == null) {
            HkG A00 = A00(grT);
            A00.A07 = true;
            A00.A06 = A0B(grT);
            IZw.A00(A00, grT);
        }
        HkG A002 = A00(grT);
        if (GOp.A0a(grT.A0A).A02 != 1) {
            z = false;
        }
        A002.A07 = z;
        A002.A06 = A0B(grT);
        IZw.A00(A002, grT);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.GrT r301) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrT.A03(X.GrT):void");
    }

    public static final void A08(GrT grT, String str) {
        int i;
        C00j.A05("RemoteVideoParticipantPresenter.maybeStopRenderingVideo", 2075663133);
        try {
            if (!GS2.A07(grT) || grT.A01 == null) {
                i = 27894377;
            } else {
                HkG A00 = A00(grT);
                A00.A0C = false;
                IZw.A00(A00, grT);
                if (GOq.A1Q(grT.A0E)) {
                    grT.A0X.A01();
                    Hbb hbb = grT.A02;
                    if (hbb != null) {
                        hbb.A01.A02(str);
                    }
                    grT.A02 = null;
                } else {
                    ((JKG) 1Br.A0B(grT.A0I)).D2x(str);
                }
                i = 1021902829;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1796552634);
            throw th;
        }
    }

    public static final void A09(GrT grT, boolean z) {
        JDB jdb = ((GS2) grT).A01;
        if (AbM.A1a(jdb) && ((IZw) AbM.A0r(jdb)).A0B == z) {
            return;
        }
        HkG A00 = A00(grT);
        A00.A0B = z;
        IZw.A00(A00, grT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0.BUm(r0) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0A() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.user.model.UserKey r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3b
            r0 = r302
            java.lang.String r0 = r0.id
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3b
            r0 = r301
            X.1Br r0 = r0.A0C
            X.JOG r0 = X.GOp.A0g(r0)
            r303 = r0
            r0 = r301
            com.facebook.user.model.UserKey r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L43
            r0 = r302
            java.lang.String r0 = r0.id
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r303
            r1 = r302
            boolean r0 = r0.BUm(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L40
        L3b:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L40:
            r0 = r305
            return r0
        L43:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrT.A0A():boolean");
    }

    public static final boolean A0B(GrT grT) {
        if (!grT.A0A() || GOq.A1S(grT.A0D)) {
            return false;
        }
        1Br r0 = grT.A0A;
        if (GOp.A0a(r0).A02 == 0) {
            return true;
        }
        if (GOp.A0a(r0).A0B.size() == 1 && grT.A01 != null) {
            ImmutableList immutableList = GOp.A0a(r0).A0B;
            UserKey userKey = grT.A01;
            if (userKey == null) {
                throw 1BK.A0h();
            }
            if (immutableList.contains(userKey.id) && GOp.A0a(r0).A02 == 2) {
                return true;
            }
        }
        if (GOp.A0a(r0).A0A.size() != 1 || grT.A01 == null) {
            return false;
        }
        ImmutableList immutableList2 = GOp.A0a(r0).A0A;
        UserKey userKey2 = grT.A01;
        if (userKey2 != null) {
            return immutableList2.contains(userKey2.id) && GOp.A0a(r0).A02 == 2;
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        if ((X.DKD.A1V(r0.width, r0.height) ^ X.4YV.A1W(X.GOp.A0a(r0).A04, 2)) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (X.IFr.A00(r0) != 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0C(X.GrT r301) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrT.A0C(X.GrT):boolean");
    }
}
