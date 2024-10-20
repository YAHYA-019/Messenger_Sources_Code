package X;

import android.app.Activity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rtc.plugins.calllifecycle.fetchthreadmodel.FetchThreadModelCallLifecycle;
import com.facebook.rtc.plugins.calllifecycle.rooms2live.Rooms2LiveCallLifecycle;
import com.facebook.rtc.views.self.SelfOverlayContentView;
import com.google.common.collect.ImmutableMap;
import java.util.EnumMap;

/* loaded from: Gyu.class */
public final class Gyu extends 3Fu {
    public final int A00;
    public final Object A01;

    public Gyu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Gyu A00(Object obj, int i) {
        return new Gyu(obj, i);
    }

    public void A01() {
        GP5 A0K;
        FbUserSession fbUserSession;
        switch (this.A00) {
            case 12:
                IDo iDo = (IDo) this.A01;
                A0K = GOp.A0K(iDo.A0K);
                fbUserSession = iDo.A0C;
                break;
            case 18:
                I4A i4a = (I4A) this.A01;
                A0K = GOp.A0K(i4a.A06);
                fbUserSession = i4a.A03;
                break;
            default:
                return;
        }
        A0K.A04(fbUserSession);
    }

    public void A02() {
        HXX hxx;
        if (29 - this.A00 != 0 || (hxx = ((HzF) this.A01).A00) == null) {
            return;
        }
        I3s.A00(hxx.A00);
    }

    public void A03() {
        switch (this.A00) {
            case 5:
                GrN.A02(this.A01);
                return;
            case 7:
                GrQ.A03(this.A01);
                return;
            case 21:
                GrS grS = (GrS) this.A01;
                if (!GrS.A01(grS).A0M) {
                    if (GrS.A01(grS).A0T) {
                        return;
                    }
                    GrS.A09(grS);
                    return;
                } else {
                    JFq jFq = ((GS2) grS).A00;
                    if (AbM.A1a(jFq)) {
                        GQy gQy = (GQy) AbM.A0r(jFq);
                        GQy.A07(gQy);
                        GQy.A08(gQy);
                        return;
                    }
                    return;
                }
            case 22:
                C2476GeX c2476GeX = (C2476GeX) this.A01;
                C2476GeX.A01(c2476GeX, c2476GeX.A02);
                return;
            default:
                return;
        }
    }

    public void A04() {
        switch (this.A00) {
            case 4:
                GrV grV = (GrV) this.A01;
                I0g A0B = GrV.A0B(grV);
                A0B.A0O = GrV.A0N(grV);
                IZy.A00(A0B, grV);
                return;
            case 25:
                GrU grU = (GrU) this.A01;
                GrU.A0F(grU);
                GrU.A0B(grU);
                GrU.A0J(grU);
                return;
            default:
                return;
        }
    }

    public void A05() {
        if (26 - this.A00 == 0) {
            GrA.A01((GrA) this.A01);
        }
    }

    public void A06() {
        switch (this.A00) {
            case 5:
                GrN grN = (GrN) this.A01;
                if (1Br.A07(grN.A0G).AZk(36326369533122058L)) {
                    return;
                }
                GrN.A01(grN);
                I5D.A00(grN.A0C).markerPoint(887558797, "button_updated");
                return;
            case 8:
                B7c b7c = (B7c) this.A01;
                1Br.A0C(b7c.A0D);
                b7c.A00.postValue(b7c.A04());
                return;
            case 19:
                IYt iYt = (IYt) this.A01;
                boolean z = !GOq.A0s(iYt.A07).A0W;
                if (z != iYt.A01) {
                    iYt.A01 = z;
                    HVg hVg = iYt.A00;
                    if (hVg != null) {
                        GrU.A0E(hVg.A00);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                GeK.A03((GeK) this.A01);
                return;
            case 25:
                GrU.A0H((GrU) this.A01);
                return;
            case 32:
                ((RQx) ((Rooms2LiveCallLifecycle) this.A01).A0C.getValue()).A00();
                return;
            case 33:
                SelfOverlayContentView.A00((SelfOverlayContentView) this.A01);
                return;
            default:
                return;
        }
    }

    public void A07() {
        switch (this.A00) {
            case 10:
                IMK.A04((IMK) this.A01);
                return;
            case 24:
                GrR grR = (GrR) this.A01;
                GrR.A08(grR);
                GrR.A09(grR);
                return;
            case 25:
                GrU.A0F((GrU) this.A01);
                return;
            default:
                return;
        }
    }

    public void A08() {
        switch (this.A00) {
            case 23:
                CNb.A01((CNb) this.A01);
                return;
            case 24:
                GrR.A08((GrR) this.A01);
                return;
            default:
                return;
        }
    }

    public void A09() {
        switch (this.A00) {
            case 10:
                IMK.A04((IMK) this.A01);
                return;
            case 24:
                GrR grR = (GrR) this.A01;
                GrR.A08(grR);
                GrR.A09(grR);
                return;
            default:
                return;
        }
    }

    public void A0A() {
        if (31 - this.A00 == 0) {
            FetchThreadModelCallLifecycle.A00((FetchThreadModelCallLifecycle) this.A01);
        }
    }

    public void A0B() {
        switch (this.A00) {
            case 23:
                CNb.A01((CNb) this.A01);
                return;
            case 25:
                GrU.A0J((GrU) this.A01);
                return;
            default:
                return;
        }
    }

    public void A0C() {
        switch (this.A00) {
            case 27:
                IEA.A02((IEA) this.A01);
                return;
            case 28:
                4zI.A03.A05("RtcAppDeathObserver", "onLocalCallIdChanged", AnonymousClass001.A1Z());
                I8S i8s = (I8S) this.A01;
                C00i c00i = i8s.A04.A00;
                if (!(!"".equals(AbJ.A0j(c00i).A0r)) || !GOn.A0z(c00i).BQN()) {
                    i8s.A02();
                    return;
                } else {
                    0WB.A00(i8s.A06);
                    I8S.A01(C0g8.A01, i8s, AbJ.A0j(c00i).A0r);
                    return;
                }
            default:
                return;
        }
    }

    public void A0D(int i, int i2) {
        Hke A00;
        switch (this.A00) {
            case 21:
                GrS grS = (GrS) this.A01;
                boolean z = GrS.A01(grS).A0Y || i != -1 || (1Br.A07(grS.A0a).AZk(36326653001029392L) && i2 == 4);
                int i3 = 3;
                if (i2 == 2) {
                    boolean z2 = false;
                    if (AbL.A1H(grS.A0X) && 1Br.A09(grS.A0U).AZn(5Jq.A0W, false) && GS2.A07(grS) && 1Br.A07(grS.A0a).AZk(36311259838286528L)) {
                        IZI A0c = GOq.A0c(grS.A0W);
                        AbN.A0X(A0c).A03(A0c.A01, "AUTO_ANSWER");
                        if (GOp.A0w(grS.A0J).BQN() && IRF.A0Y((Activity) null, GOp.A0s(grS.A0G), GrS.A01(grS).A0a)) {
                            ((Hrj) 1Br.A0B(grS.A0B)).A00(((1pK) GS2.A05(grS)).A1P(), grS.A06, 0S2.A01, GrS.A01(grS).A0a);
                        } else {
                            z2 = true;
                        }
                        ((C5V0) 1Br.A0B(grS.A0g)).A0G(grS.A06, "CallPresenter", z2);
                        return;
                    }
                    HXS A002 = HK1.A00(GS2.A04(grS));
                    Hke A003 = GrS.A00(grS);
                    if (!(A002 instanceof Gvi) && !(A002 instanceof Gvh)) {
                        i3 = 2;
                        if (((I2V) 1Br.A0B(grS.A0m)).A00()) {
                            i3 = 9;
                        }
                    }
                    A003.A03 = i3;
                    IYw.A00(A003, grS);
                    return;
                }
                if (i2 == 0) {
                    z = ((Hhf) grS.A16.getValue()).A01;
                    if (i != 2 || 11T.A0O(GrS.A01(grS).A0D, AbE.A00(293))) {
                        if (!GrS.A01(grS).A0Y) {
                            Hke A004 = GrS.A00(grS);
                            A004.A03 = 4;
                            A004.A0D = grS.A03;
                            A004.A0M = false;
                            IYw.A00(A004, grS);
                            if (GrS.A01(grS).A01 != 22) {
                                JFq jFq = ((GS2) grS).A00;
                                if (AbM.A1a(jFq) && !((GQy) AbM.A0r(jFq)).A0W) {
                                    GQy.A09((GQy) AbM.A0r(jFq), "call_ended", 2000L);
                                }
                            }
                        }
                        GrS.A09(grS);
                    } else {
                        JFq jFq2 = ((GS2) grS).A00;
                        if (AbM.A1a(jFq2)) {
                            GQy gQy = (GQy) AbM.A0r(jFq2);
                            GQy.A07(gQy);
                            GQy.A08(gQy);
                        }
                    }
                } else {
                    if (i2 == 3 || i2 == 4 || (i2 == 1 && GrS.A01(grS).A0X)) {
                        if (((I2V) 1Br.A0B(grS.A0m)).A00()) {
                            A00 = GrS.A00(grS);
                            A00.A03 = 9;
                        }
                        GrS.A09(grS);
                    } else {
                        A00 = GrS.A00(grS);
                        A00.A03 = 1;
                    }
                    IYw.A00(A00, grS);
                }
                if (z) {
                    Hhf hhf = (Hhf) grS.A16.getValue();
                    FbUserSession fbUserSession = grS.A06;
                    11T.A0F(fbUserSession, 0);
                    if (hhf.A01) {
                        return;
                    }
                    hhf.A01 = true;
                    if (hhf.A02) {
                        1Od.A02((1Od) 1Br.A0B(hhf.A04));
                    }
                    2QN r0 = (2QO) 1Lm.A05(hhf.A03, fbUserSession, 99977);
                    Activity activity = hhf.A00;
                    if (!r0.A0N || activity == null) {
                        return;
                    }
                    ((1Od) 1Br.A0B(hhf.A04)).A0D(activity);
                    return;
                }
                return;
            case 30:
                IAA.A01((IAA) this.A01);
                return;
            default:
                return;
        }
    }

    public void A0E(long j) {
        if (28 - this.A00 == 0) {
            I8S i8s = (I8S) this.A01;
            if (j == 0) {
                I8S.A00(C0g8.A02, i8s);
            } else {
                I8S.A01(C0g8.A02, i8s, String.valueOf(j));
            }
        }
    }

    public void A0F(Integer num, Integer num2) {
        Integer num3;
        switch (this.A00) {
            case 0:
                IP4 ip4 = (IP4) this.A01;
                IMJ A0F = GOp.A0F(ip4.A09);
                if (A0F.A0B() || A0F.A0C()) {
                    2QN A0s = GOq.A0s(ip4.A08);
                    if (A0s.A0U || !(A0s.A0A == 0S2.A0C || A0s.BTq())) {
                        ip4.BO6();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                IMH imh = (IMH) this.A01;
                if (GOq.A1T(imh.A0B) || !imh.A04()) {
                    return;
                }
                I5a i5a = (I5a) 1Br.A0B(imh.A05);
                Integer num4 = 0S2.A05;
                JNe A00 = I2h.A00(i5a.A03);
                if (A00 != null) {
                    A00.Cdz(num4);
                    return;
                }
                return;
            case 2:
                11T.A0H(num, num2);
                Hzs hzs = (Hzs) this.A01;
                Long l = hzs.A01;
                if (l != null) {
                    long longValue = l.longValue();
                    Integer num5 = 0S2.A01;
                    if (num2 == num5 || num2 == (num3 = 0S2.A0C)) {
                        Hzs.A00(hzs);
                        return;
                    }
                    if ((num == num5 || num == num3) && num2 == 0S2.A00) {
                        1Br.A0C(hzs.A06);
                        VideoEffectCommunicationApi A002 = HvW.A00();
                        if (A002 != null) {
                            A002.participantModuleInitialize(longValue);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                0fH.A0j("EffectListQueryManagerImpl", "onLocalVideoStateChanged");
                Hop hop = (Hop) this.A01;
                HAl hAl = HAl.A05;
                hop.A00(hAl);
                1BY r0 = hop.A01.A00;
                if (GOp.A0v(AbK.A0D(r0), r0).BTq() && GOq.A1U(hop.A02)) {
                    0fH.A0g("CALL_START", "EffectListQueryManagerImpl", "maybe fetch touch up effect with appContext %s");
                    IPz iPz = (IPz) 1Lm.A07(AbK.A0D(r0), r0, 114831);
                    11T.A0A(ImmutableMap.copyOf((java.util.Map) new EnumMap(HCR.class)));
                    if (GOp.A0p(iPz.A0F).A01.AZk(36316813230942707L) && IPz.A01(iPz).A01 == null) {
                        GgF ggF = (GgF) 1Br.A0B(iPz.A0T);
                        FbUserSession fbUserSession = iPz.A04;
                        11T.A0F(hAl, 1);
                        ggF.A02(fbUserSession, hAl, (CxL) 1Br.A0B(ggF.A01), null, ggF.A05, ggF.A04);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                GrV grV = (GrV) this.A01;
                boolean A1T = GOq.A1T(grV.A0F);
                1Br r02 = grV.A07;
                Integer num6 = GOp.A0R(r02).A09;
                GrV.A0M(grV);
                GOp.A0R(r02).A0B(num6);
                I0g A0B = GrV.A0B(grV);
                A0B.A0c = A1T;
                A0B.A0Q = GrV.A0P(grV);
                IZy.A00(A0B, grV);
                QuickPerformanceLogger A003 = I5D.A00(grV.A0I);
                A003.markerPoint(887568194, "button_updated");
                A003.markerEnd(887568194, (short) 2);
                return;
            case 5:
            case 7:
            case 8:
            case 12:
            case 18:
            case 21:
            case 22:
            case 23:
            default:
                return;
            case 6:
                ((GrI) this.A01).A0f((8LW) null, (Boolean) null);
                return;
            case 9:
                Gqa gqa = (Gqa) this.A01;
                C2637Gjr c2637Gjr = gqa.A00;
                Gqa.A00(c2637Gjr.A00, c2637Gjr, gqa, GOq.A1T(gqa.A06), c2637Gjr.A03);
                return;
            case 10:
                IMK.A04((IMK) this.A01);
                return;
            case 11:
                4zI.A03.A05("AvatarInRtcController", "onLocalVideoStateChanged", AnonymousClass001.A1Z());
                IF3.A06((IF3) this.A01);
                return;
            case 13:
                Gr3.A00((Gr3) this.A01);
                return;
            case 14:
                I7r i7r = (I7r) this.A01;
                2QO r03 = i7r.A07;
                if (r03 == null) {
                    11T.A0L("callState");
                    throw 0Q8.createAndThrow();
                }
                if (r03.BTq()) {
                    I7r.A00(i7r);
                    return;
                }
                return;
            case 15:
                I7s.A01((I7s) this.A01);
                return;
            case 16:
                IML.A06((IML) this.A01);
                return;
            case 17:
                GrD.A0A(this.A01);
                return;
            case 19:
                IYt.A00((IYt) this.A01);
                return;
            case 20:
                GeK.A03((GeK) this.A01);
                return;
            case 24:
                GrR.A08((GrR) this.A01);
                return;
            case 25:
                GrU grU = (GrU) this.A01;
                GrU.A08(grU);
                GrU.A0H(grU);
                return;
            case 26:
                GrA.A01((GrA) this.A01);
                return;
        }
    }

    public void A0G(String str) {
        if (28 - this.A00 == 0) {
            int length = str.length();
            Object obj = this.A01;
            if (length == 0) {
                I8S.A00(C0g8.A04, (I8S) obj);
            } else {
                I8S.A01(C0g8.A04, (I8S) obj, str);
            }
        }
    }
}
