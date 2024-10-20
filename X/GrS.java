package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.rtc.incall.impl.screenshotnotifications.detector.CallScreenshotDetector;
import com.facebook.messaging.rtc.safetywarning.BlockedParticipantAddedDialogFragment;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rtc.interfaces.WebrtcUiHandlerListenerParams;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: GrS.class */
public final class GrS extends Gqk {
    public long A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final FbUserSession A06;
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
    public final 1Br A0l;
    public final 1Br A0m;
    public final 1Br A0n;
    public final 1Br A0o;
    public final 1Br A0p;
    public final 1Br A0q;
    public final 1Br A0r;
    public final JLm A0s;
    public final HGB A0t;
    public final JFe A0u;
    public final HFY A0v;
    public final HG1 A0w;
    public final HFr A0x;
    public final 2Qn A0y;
    public final Hmg A0z;
    public final HVW A10;
    public final HVX A11;
    public final 3Fu A12;
    public final 2Qe A13;
    public final Gyx A14;
    public final C01i A15;
    public final C01i A16;
    public final ScheduledExecutorService A17;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrS(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        11T.A0F(str, 1);
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A0U = 1BK.A0E();
        this.A0O = 1Bq.A00(115690);
        this.A0B = 1Bu.A01(context, 83913);
        this.A0G = GOn.A0a(context, fbUserSession);
        this.A0Q = 1Bu.A01(context, 114934);
        this.A0R = 1Bu.A01(context, 114873);
        this.A0g = 1Lm.A00(context, fbUserSession, 115765);
        this.A0b = GOn.A0e(context, fbUserSession);
        this.A0W = GOn.A0W(context, fbUserSession);
        this.A0S = GOn.A0d(context, fbUserSession);
        this.A07 = GOn.A0X(context, fbUserSession);
        this.A0m = 1Lm.A00(context, fbUserSession, 84032);
        this.A08 = GOn.A0Y(context, fbUserSession);
        this.A0C = 1Bu.A01(context, 115026);
        this.A0T = 1Lm.A00(context, fbUserSession, 83878);
        this.A0P = 1Lm.A00(context, fbUserSession, 98355);
        this.A0l = 1Bu.A01(context, 85074);
        this.A0a = 1BK.A0C();
        this.A0q = 1Bu.A01(context, 115682);
        this.A0r = 1Bu.A01(context, 85079);
        this.A0N = 1Lm.A00(context, fbUserSession, 115519);
        this.A0L = 1Lm.A00(context, fbUserSession, 115516);
        this.A0j = 1Lm.A00(context, fbUserSession, 114852);
        this.A0K = 1Lm.A00(context, fbUserSession, 115514);
        this.A0M = 1Lm.A00(context, fbUserSession, 115517);
        this.A15 = J9t.A00(this, C03i.A02, 13);
        this.A0p = 1Lm.A00(context, fbUserSession, 67965);
        this.A0h = 1Bu.A01(context, 115368);
        this.A0k = 1Bu.A01(context, 115685);
        this.A0Y = 1Bq.A00(83598);
        this.A09 = 1Bu.A01(context, 115670);
        this.A0A = 1Bu.A01(context, 115671);
        this.A0Z = 1Lm.A00(context, fbUserSession, 84176);
        this.A0e = 1Bu.A01(context, 115683);
        this.A16 = J9t.A01(this, 14);
        this.A0c = 1Bu.A01(context, 82460);
        this.A0o = 1Lm.A00(context, fbUserSession, 85166);
        this.A0J = GOn.A0Z(context, fbUserSession);
        this.A0i = 1Lm.A00(context, fbUserSession, 114999);
        this.A0F = 1Lm.A00(context, fbUserSession, 115649);
        this.A0D = GOn.A0c(context, fbUserSession);
        this.A0V = GOn.A0S(context);
        this.A0d = GOn.A0V(context, fbUserSession);
        this.A17 = (ScheduledExecutorService) 1Bi.A03(16461);
        this.A0H = 1Bu.A01(context, 114893);
        this.A0f = 1Lm.A00(context, fbUserSession, 114859);
        this.A0I = 1Bq.A00(115680);
        this.A0n = 1Bu.A01(context, 82129);
        this.A0X = 1Bq.A00(83610);
        this.A0E = 1Bu.A01(context, 68141);
        this.A12 = Gyu.A00(this, 21);
        this.A11 = new HVX(this);
        this.A13 = new Gyx(this, 6);
        this.A0v = new Gps(this, 7);
        this.A0u = new IYe(this);
        this.A0s = GpZ.A00(this, 31);
        this.A0x = new Gq0(this, 4);
        this.A0w = new Gpv(this, 3);
        this.A0t = new Gpl(this, 14);
        this.A0y = IYv.A00(this, 31);
        this.A0z = new Hmg(this);
        this.A10 = new HVW(this);
        this.A01 = "";
        this.A14 = new Gyx(this, 7);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.Hke, java.lang.Object] */
    public static final Hke A00(GrS grS) {
        JDB jdb = ((GS2) grS).A01;
        if (!AbM.A1a(jdb)) {
            return new Hke();
        }
        IYw iYw = (JPY) AbM.A0r(jdb);
        ?? obj = new Object();
        obj.A0B = AnonymousClass001.A0v();
        iYw.getClass();
        if (iYw instanceof IYw) {
            IYw iYw2 = iYw;
            obj.A02 = iYw2.A02;
            obj.A00 = iYw2.A00;
            obj.A05 = iYw2.A05;
            obj.A01 = iYw2.A01;
            obj.A09 = iYw2.A09;
            A0A(obj, iYw2);
            obj.A0A = iYw2.A0A;
            obj.A0J = iYw2.A0J;
            obj.A0K = iYw2.A0K;
            obj.A0L = iYw2.A0L;
            obj.A0M = iYw2.A0M;
            obj.A08 = iYw2.A08;
            obj.A0N = iYw2.A0N;
            obj.A06 = iYw2.A06;
            obj.A0B = AbF.A1E(iYw2.A0B);
        } else {
            IYw iYw3 = iYw;
            obj.A02 = iYw3.A02;
            obj.A00 = iYw3.A00;
            obj.A05 = iYw3.A05;
            obj.A01 = iYw3.A01;
            HDa Aat = iYw.Aat();
            obj.A09 = Aat;
            C1pq.A08("callScreenLayout", Aat);
            if (!obj.A0B.contains("callScreenLayout")) {
                HashSet A1E = AbF.A1E(obj.A0B);
                obj.A0B = A1E;
                A1E.add("callScreenLayout");
            }
            A0A(obj, iYw3);
            String str = iYw3.A0A;
            obj.A0A = str;
            C1pq.A08("selfProfileURL", str);
            obj.A0J = iYw3.A0J;
            obj.A0K = iYw3.A0K;
            obj.A0L = iYw3.A0L;
            obj.A0M = iYw3.A0M;
            obj.A08 = iYw3.A08;
            obj.A0N = iYw3.A0N;
            Rect BKp = iYw.BKp();
            obj.A06 = BKp;
            C1pq.A08("windowInsetsPadding", BKp);
            if (!obj.A0B.contains("windowInsetsPadding")) {
                HashSet A1E2 = AbF.A1E(obj.A0B);
                obj.A0B = A1E2;
                A1E2.add("windowInsetsPadding");
                return obj;
            }
        }
        return obj;
    }

    public static 2QN A01(GrS grS) {
        return A02(grS);
    }

    public static final 2QO A02(GrS grS) {
        return GOp.A0w(grS.A0J);
    }

    public static final void A03(Context context, GrS grS) {
        grS.A02 = false;
        grS.A03 = false;
        grS.A12.A0D(-1, A01(grS).A00);
        grS.A0u.BpY();
        grS.A0x.A00();
        Hke A00 = A00(grS);
        1Br.A0B(grS.A08);
        A00.A0H = GOq.A1M(context);
        A00.A00 = 0.0f;
        C00i A0R = AbF.A0R(grS.A0V);
        A00.A0J = true;
        A0R.get();
        A00.A0G = AnonymousClass001.A1O(GOq.A1S(grS.A0d) ? 1 : 0);
        IYw.A00(A00, grS);
    }

    public static final void A08(EffectItem effectItem, GrS grS, Integer num, Integer num2, String str) {
        C00i c00i = grS.A0S.A00;
        GOo.A0U(c00i).A0H(HAU.A05);
        I5a i5a = (I5a) 1Br.A0B(grS.A0P);
        C1pq.A08("effectTrigger", num);
        i5a.A01(((Fragment) GS2.A05(grS)).requireContext(), new I3c(effectItem, num, num2, str, null));
        HCR hcr = (str == null || str.length() == 0) ? ((BaseItem) effectItem).A04 : HCR.A08;
        IML A0U = GOo.A0U(c00i);
        11T.A0D(hcr);
        A0U.A0I(hcr);
    }

    public static final void A09(GrS grS) {
        int i = 3;
        if (A01(grS).A0T) {
            i = 7;
        }
        Hke A00 = A00(grS);
        A00.A03 = i;
        A00.A0L = AbL.A1H(grS.A0Y);
        A00.A08 = A01(grS).A05;
        A00.A0M = AnonymousClass001.A1Q(i, 3);
        IYw.A00(A00, grS);
    }

    public static void A0A(Hke hke, IYw iYw) {
        hke.A03 = iYw.A03;
        hke.A04 = iYw.A04;
        hke.A07 = iYw.A07;
        hke.A0C = iYw.A0C;
        hke.A0D = iYw.A0D;
        hke.A0E = iYw.A0E;
        hke.A0F = iYw.A0F;
        hke.A0G = iYw.A0G;
        hke.A0H = iYw.A0H;
        hke.A0I = iYw.A0I;
    }

    public void A0b() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        String str;
        CEI cei = (CEI) 1Br.A0B(this.A0l);
        BlockedParticipantAddedDialogFragment blockedParticipantAddedDialogFragment = cei.A00;
        if (blockedParticipantAddedDialogFragment != null) {
            blockedParticipantAddedDialogFragment.A00 = null;
            cei.A00 = null;
        }
        GOp.A0w(this.A0J).Cf7(this.A12);
        C00i c00i = this.A0G.A00;
        ((IRF) c00i.get()).A0k(this.A13);
        ((IRF) c00i.get()).A0k(this.A14);
        2QP r0 = (IYp) 1Br.A0B(this.A0b);
        int i = ((IYp) r0).A01 - 1;
        ((IYp) r0).A01 = i;
        if (i <= 0) {
            GOp.A0Q(((IYp) r0).A0P).CeV(((IYp) r0).A0h);
            GOp.A0u(((IYp) r0).A0S).CeZ(((IYp) r0).A0l);
            GOp.A0e(((IYp) r0).A0a).A03(((IYp) r0).A0k);
            ILS A0Y = GOp.A0Y(((IYp) r0).A0Y);
            Gq0 gq0 = ((IYp) r0).A0j;
            11T.A0F(gq0, 0);
            A0Y.A0B.remove(gq0);
            ((Hu8) 1Br.A0B(((IYp) r0).A0e)).A01(((IYp) r0).A0i);
            GOp.A0F(((IYp) r0).A0U).A09(((IYp) r0).A0N);
            ((C4zR) 1Br.A0B(((IYp) r0).A0Q)).A05(r0);
            RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
            11T.A0A(regularImmutableSet);
            ((IYp) r0).A0F = regularImmutableSet;
            ((IYp) r0).A0G = regularImmutableSet;
            r0.A08(1BK.A0b());
            r0.A07(1BK.A0b());
            ((IYp) r0).A0B = 1BK.A0b();
            ((IYp) r0).A06 = ((IYp) r0).A0L;
            r0.A06((UserKey) null);
            r0.Cos(1.0f);
            Integer num = 0S2.A00;
            11T.A0F(num, 0);
            if (((IYp) r0).A0C != num) {
                ((IYp) r0).A0C = num;
                Iterator A01 = IYp.A01(r0);
                while (A01.hasNext()) {
                    A01.next();
                }
            }
            ((IYp) r0).A0J = false;
            ((IYp) r0).A0I = false;
            ((IYp) r0).A0K = false;
            r0.CsL(1BK.A1C());
        }
        I7r i7r = (I7r) 1Br.A0B(this.A0Q);
        if (i7r.A01 != null) {
            int i2 = i7r.A00 - 1;
            i7r.A00 = i2;
            if (i2 <= 0) {
                i7r.A00 = 0;
                IMJ imj = i7r.A03;
                if (imj == null) {
                    str = "effectSharedState";
                } else {
                    imj.A09(i7r.A09);
                    2QT r02 = i7r.A06;
                    if (r02 == null) {
                        str = "rtcCallParticipantsStateReader";
                    } else {
                        r02.CeZ(i7r.A0F);
                        2QO r03 = i7r.A07;
                        if (r03 == null) {
                            str = "callState";
                        } else {
                            r03.Cf7(i7r.A0E);
                            IPz iPz = i7r.A02;
                            if (iPz == null) {
                                str = "videoExpressionLoader";
                            } else {
                                HVD hvd = i7r.A0D;
                                11T.A0F(hvd, 0);
                                ((GgF) 1Br.A0B(iPz.A0T)).A03.remove(hvd);
                            }
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        Hop hop = (Hop) 1Br.A0B(this.A0R);
        int i3 = hop.A00 - 1;
        hop.A00 = i3;
        if (i3 <= 0) {
            hop.A00 = 0;
            1BY r04 = hop.A01.A00;
            GOp.A0v(AbK.A0D(r04), r04).Cf7(hop.A03);
        }
        I2V i2v = (I2V) 1Br.A0B(this.A0m);
        HVX hvx = this.A11;
        11T.A0F(hvx, 0);
        i2v.A02.remove(hvx);
        ((IAh) 1Br.A0B(this.A0K)).A04(this.A0u);
        C00i c00i2 = this.A0N.A00;
        ((IDo) c00i2.get()).A07(this.A0v);
        HkF hkF = (HkF) 1Br.A0B(this.A0L);
        int i4 = hkF.A00 - 1;
        hkF.A00 = i4;
        if (i4 <= 0) {
            hkF.A00 = 0;
            GOp.A0O(hkF.A02).A02(hkF.A05);
            GOp.A0Q(hkF.A01).CeV(hkF.A04);
        }
        1Br r05 = this.A08;
        ((GR1) 1Br.A0B(r05)).CeV(this.A0s);
        JFq jFq = ((GS2) this).A00;
        if (!AbM.A1a(jFq)) {
            throw 1BK.A0g();
        }
        Context requireContext = ((Fragment) AbM.A0r(jFq)).requireContext();
        GR1 gr1 = (GR1) 1Br.A0B(r05);
        if (11T.A0O(gr1.A0A.get(), requireContext)) {
            gr1.A0A.clear();
            gr1.A03 = 0;
        }
        ComponentCallbacks2 A1P = ((1pK) GS2.A05(this)).A1P();
        if (A1P != null) {
            I46 i46 = (I46) 1Br.A0B(this.A0M);
            if (A1P == i46.A00) {
                GOp.A0O(i46.A04).A02(i46.A0E);
                GOp.A0u(i46.A0C).CeZ(i46.A0F);
                i46.A00 = null;
                I46.A0I.removeCallbacksAndMessages(null);
            }
            IDo iDo = (IDo) c00i2.get();
            if (iDo.A01 == A1P) {
                iDo.A01 = null;
            }
            IF3 if3 = (IF3) 1Br.A0B(GOp.A0T(this.A0D).A0G);
            if (11T.A0O(if3.A02.get(), A1P)) {
                if3.A02.clear();
            }
            LifecycleObserver A0Y2 = GOp.A0Y(this.A0j);
            if (11T.A0O(((ILS) A0Y2).A00, A1P)) {
                C00i c00i3 = ((ILS) A0Y2).A06.A00;
                I4A i4a = (I4A) c00i3.get();
                GOp.A0w(i4a.A0G).Cf7(i4a.A0J);
                GOp.A0O(i4a.A0F).A02(i4a.A0H);
                C00i c00i4 = ((ILS) A0Y2).A05.A00;
                ((FAb) c00i4.get()).A01();
                GOp.A0V(((ILS) A0Y2).A04).A07(((ILS) A0Y2).A09);
                ((I4A) c00i3.get()).A02(((ILS) A0Y2).A0A);
                ((FAb) c00i4.get()).A06(((ILS) A0Y2).A08);
                ILS.A01(A0Y2, false);
                if ((A1P instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) A1P) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(A0Y2);
                }
                ((ILS) A0Y2).A00 = null;
            }
            HkH hkH = (HkH) 1Br.A0B(this.A0H);
            if (7zQ.A1a(hkH.A0A) && 11T.A0O(hkH.A00, A1P)) {
                GOp.A0e(hkH.A06).A03(hkH.A09);
                ILh iLh = hkH.A01;
                if (iLh != null) {
                    iLh.A01(hkH.A03);
                }
                hkH.A00 = null;
                hkH.A02 = null;
            }
        }
        GOp.A0X(this.A0Z).A04(this.A0w);
        GOp.A0R(this.A07).A0A(this.A0t);
        ILS A0Y3 = GOp.A0Y(this.A0j);
        HFr hFr = this.A0x;
        11T.A0F(hFr, 0);
        A0Y3.A0B.remove(hFr);
        GOp.A0e(this.A0d).A03(this.A0y);
        CallScreenshotDetector callScreenshotDetector = (CallScreenshotDetector) 1Br.A0B(this.A0I);
        HVW hvw = this.A10;
        11T.A0F(hvw, 0);
        callScreenshotDetector.A00.remove(hvw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Object, X.0CL] */
    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        String str;
        1pK r0 = (1pK) jFq;
        11T.A0F(r0, 0);
        GOp.A0w(this.A0J).A7G(this.A12);
        C00i c00i = this.A0G.A00;
        ((IRF) c00i.get()).A0l(this.A13, (WebrtcUiHandlerListenerParams) null);
        ((IRF) c00i.get()).A0l(this.A14, (WebrtcUiHandlerListenerParams) null);
        IYp iYp = (IYp) 1Br.A0B(this.A0b);
        int i = iYp.A01;
        boolean A1P = AnonymousClass001.A1P(i);
        iYp.A01 = i + 1;
        if (!A1P) {
            GOp.A0Q(iYp.A0P).A60(iYp.A0h);
            GOp.A0u(iYp.A0S).A67(iYp.A0l);
            GOp.A0e(iYp.A0a).A02(iYp.A0k);
            ILS A0Y = GOp.A0Y(iYp.A0Y);
            Gq0 gq0 = iYp.A0j;
            11T.A0F(gq0, 0);
            A0Y.A0B.add(gq0);
            C00i c00i2 = iYp.A0e.A00;
            ((Hu8) c00i2.get()).A00(iYp.A0i);
            GOp.A0F(iYp.A0U).A08(iYp.A0N);
            GOq.A1G(iYp.A0Q, iYp);
            iYp.A05();
            IYp.A03(iYp);
            IYp.A04(iYp);
            if (((Hu8) c00i2.get()).A02() && ((Hu8) c00i2.get()).A01 == HA2.A03) {
                iYp.A09(((Hu8) c00i2.get()).A02);
            }
        }
        I7r i7r = (I7r) 1Br.A0B(this.A0Q);
        FbUserSession fbUserSession = this.A06;
        11T.A0F(fbUserSession, 0);
        if (i7r.A00 == 0) {
            i7r.A01 = fbUserSession;
            1BY r02 = i7r.A0A.A00;
            i7r.A07 = (2QO) 1Lo.A04((Context) null, fbUserSession, r02, 99977);
            i7r.A06 = (2QT) 1Lo.A04((Context) null, fbUserSession, r02, 99981);
            i7r.A05 = (2JN) 1Lo.A04((Context) null, fbUserSession, r02, 33088);
            i7r.A02 = (IPz) 1Lo.A04((Context) null, fbUserSession, r02, 114831);
            i7r.A03 = (IMJ) 1Lo.A04((Context) null, fbUserSession, r02, 98491);
            i7r.A04 = (C2777Gnu) 1Lo.A04((Context) null, fbUserSession, r02, 115496);
            2QO r03 = i7r.A07;
            if (r03 == null) {
                str = "callState";
            } else {
                r03.A7G(i7r.A0E);
                IMJ imj = i7r.A03;
                if (imj == null) {
                    str = "effectSharedState";
                } else {
                    imj.A08(i7r.A09);
                    2QT r04 = i7r.A06;
                    if (r04 == null) {
                        str = "rtcCallParticipantsStateReader";
                    } else {
                        r04.A67(i7r.A0F);
                        IPz iPz = i7r.A02;
                        if (iPz == null) {
                            str = "videoExpressionLoader";
                        } else {
                            HVD hvd = i7r.A0D;
                            11T.A0F(hvd, 0);
                            ((GgF) 1Br.A0B(iPz.A0T)).A03.add(hvd);
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        i7r.A00++;
        Hop hop = (Hop) 1Br.A0B(this.A0R);
        if (hop.A00 == 0) {
            1BY r05 = hop.A01.A00;
            GOp.A0v(AbK.A0D(r05), r05).A7G(hop.A03);
            0fH.A0j("EffectListQueryManagerImpl", "addListeners");
            hop.A00(HAl.A05);
        }
        hop.A00++;
        I2V i2v = (I2V) 1Br.A0B(this.A0m);
        HVX hvx = this.A11;
        11T.A0F(hvx, 0);
        i2v.A02.add(hvx);
        ((IAh) 1Br.A0B(this.A0K)).A03(this.A0u);
        1Br r06 = this.A08;
        ((GR1) 1Br.A0B(r06)).A0A = 7zL.A14(r0.requireContext());
        ((GR1) 1Br.A0B(r06)).A60(this.A0s);
        GOp.A0X(this.A0Z).A03(this.A0w);
        GOp.A0R(this.A07).A09(this.A0t);
        GOp.A0e(this.A0d).A02(this.A0y);
        Activity A1P2 = r0.A1P();
        if (A1P2 != 0) {
            I46 i46 = (I46) 1Br.A0B(this.A0M);
            if (!(!(A1P2 instanceof Application))) {
                throw AnonymousClass001.A0L("Must use an activity context");
            }
            i46.A00 = A1P2;
            2JN A0O = GOp.A0O(i46.A04);
            2JM r07 = i46.A0E;
            C0uA c0uA = C0uA.A00;
            A0O.A03(r07, c0uA);
            GOp.A0u(i46.A0C).A67(i46.A0F);
            C00i c00i3 = this.A0N.A00;
            IDo iDo = (IDo) c00i3.get();
            Activity A1P3 = r0.A1P();
            11T.A0I(A1P3, 7zK.A00(2));
            11T.A0F(A1P3, 0);
            if (!(!(A1P3 instanceof Application))) {
                throw AnonymousClass001.A0L("Must use an activity context");
            }
            iDo.A01 = A1P3;
            ((IDo) c00i3.get()).A06(this.A0v);
            IF3 if3 = (IF3) 1Br.A0B(GOp.A0T(this.A0D).A0G);
            if3.A02 = 7zL.A14(A1P2);
            EffectItem effectItem = if3.A00;
            if (effectItem != null) {
                IF3.A04(effectItem, if3);
                if3.A00 = null;
            }
            C00i c00i4 = this.A0j.A00;
            LifecycleObserver lifecycleObserver = (ILS) c00i4.get();
            if (!((Hne) 1Bn.A0E(A1P2, (1BY) null, 83981)).A00(((ILS) lifecycleObserver).A03)) {
                ((ILS) lifecycleObserver).A00 = A1P2;
                C00i c00i5 = ((ILS) lifecycleObserver).A06.A00;
                I4A i4a = (I4A) c00i5.get();
                GOp.A0O(i4a.A0F).A03(i4a.A0H, c0uA);
                GOp.A0w(i4a.A0G).A7G(i4a.A0J);
                C00i c00i6 = ((ILS) lifecycleObserver).A05.A00;
                ((FAb) c00i6.get()).A03();
                GOp.A0V(((ILS) lifecycleObserver).A04).A06(((ILS) lifecycleObserver).A09);
                ((I4A) c00i5.get()).A01(((ILS) lifecycleObserver).A0A);
                ((FAb) c00i6.get()).A05(((ILS) lifecycleObserver).A08);
                if ((A1P2 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) A1P2) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.addObserver(lifecycleObserver);
                }
            }
            ILS ils = (ILS) c00i4.get();
            HFr hFr = this.A0x;
            11T.A0F(hFr, 0);
            ils.A0B.add(hFr);
            HkH hkH = (HkH) 1Br.A0B(this.A0H);
            Hmg hmg = this.A0z;
            11T.A0F(hmg, 1);
            if (7zQ.A1a(hkH.A0A)) {
                ILh iLh = new ILh(JO3.A00.A00(A1P2));
                hkH.A01 = iLh;
                hkH.A00 = A1P2;
                iLh.A00(A1P2, hkH.A03, 4YV.A11(hkH.A07));
                hkH.A02 = hmg;
                GOp.A0e(hkH.A06).A02(hkH.A09);
            }
        }
        HkF hkF = (HkF) 1Br.A0B(this.A0L);
        if (hkF.A00 == 0) {
            C00i c00i7 = hkF.A02.A00;
            2JN A0R = GOo.A0R(c00i7);
            IY8 iy8 = hkF.A05;
            GOn.A1U(iy8, A0R);
            GOp.A0Q(hkF.A01).A60(hkF.A04);
            IY8.A03(c00i7, iy8);
        }
        hkF.A00++;
        A03(r0.requireContext(), this);
        C00i c00i8 = this.A0C.A00;
        53B r08 = (53B) c00i8.get();
        if (GOq.A1U(r08.A01)) {
            53B.A00(r08).Ba9(36314296380301136L);
        }
        53B r09 = (53B) c00i8.get();
        if (GOq.A1U(r09.A01)) {
            53B.A00(r09).Ba9(36320889155174159L);
        }
        C00i c00i9 = this.A0I.A00;
        ((5FE) c00i9.get()).init();
        CallScreenshotDetector callScreenshotDetector = (CallScreenshotDetector) c00i9.get();
        HVW hvw = this.A10;
        11T.A0F(hvw, 0);
        callScreenshotDetector.A00.add(hvw);
        ((5FE) c00i9.get()).A04();
        ((5FE) c00i9.get()).A01();
        if (7zQ.A1a(this.A15)) {
            ?? obj = new Object();
            ((0CL) obj).element = A0e(new 83U((Object) obj, this, 14), false);
        }
        ?? obj2 = new Object();
        ((0CL) obj2).element = A0e(new 83U((Object) obj2, this, 15), true);
    }

    public void A0f(Context context, boolean z) {
        String str = super.A00;
        State state = (State) GOp.A0n(str).A00(State.class);
        CallModel callModel = (CallModel) 7zU.A0k(C9lt.A00(str));
        String str2 = null;
        if (!GS2.A07(this)) {
            HCL hcl = HCL.A02;
            String str3 = state != null ? state.localCallId : null;
            if (callModel != null) {
                str2 = callModel.sharedCallId;
            }
            I6E.A00(hcl, str3, str2, 1BK.A1D("abort_reason", "view not present"));
            return;
        }
        if (callModel != null) {
            1Br.A0C(this.A0h);
            ((2QN) 1Lm.A05(context, this.A06, 99978)).A0B = Long.valueOf(Hvr.A00(callModel, GOp.A0w(this.A0J), I7M.A00(this.A0k)).BGc());
        }
        if (A01(this).A0V) {
            AbM.A0b(this.A0p).A0N(AbE.A00(703), (String) null, "notification");
        }
        C00i c00i = this.A0W.A00;
        ((JOJ) c00i.get()).BZo("ACCEPT_CALL", ImmutableMap.of((Object) AbE.A00(749), (Object) AbE.A00(291)));
        boolean z2 = true;
        ((JOJ) c00i.get()).Bbk(new String[]{"call_accepted_from_notification"});
        if (!A01(this).A0a || z) {
            z2 = false;
        }
        ((Hrj) 1Br.A0B(this.A0B)).A00(((1pK) GS2.A05(this)).A1P(), this.A06, z ? 0S2.A0j : 0S2.A01, z2);
    }

    public void A0g(EffectItem effectItem, Integer num, Integer num2, String str) {
        11T.A0F(num, 1);
        if (str == null) {
            A08(effectItem, this, num, num2, null);
        } else {
            this.A17.schedule((Runnable) new J3P((Hoq) 1Bu.A06(this.A05, 115459), effectItem, this, num, num2, str), 1000L, TimeUnit.MILLISECONDS);
        }
    }
}
