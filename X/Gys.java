package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rtc.plugins.calllifecycle.rooms2live.Rooms2LiveCallLifecycle;
import com.facebook.rtcactivity.interfaces.DataSender;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: Gys.class */
public final class Gys extends 2Qc {
    public final int A00;
    public final Object A01;

    public Gys(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Gys A00(Object obj, int i) {
        return new Gys(obj, i);
    }

    public void CAo() {
        String str;
        ThreadKey threadKey;
        1Ql A08;
        switch (this.A00) {
            case 0:
                I2x i2x = (I2x) this.A01;
                1Du it = GOp.A0t(i2x.A09).Aaq().iterator();
                int i = 0;
                while (it.hasNext()) {
                    I9O A13 = GOn.A13(it);
                    if (I6L.A02(A13)) {
                        1Br.A0C(i2x.A0A);
                        if (I6L.A01(HBQ.A08, A13)) {
                            i++;
                        }
                    }
                }
                ImmutableList A0a = 1BL.A0a(IFr.A06(AbstractC2326GOr.A0S(i2x.A07)));
                if (i != i2x.A00) {
                    if (GOp.A0F(i2x.A0B).A04().size() > 0) {
                        if (i > i2x.A00) {
                            if (i2x.A02 == null) {
                                ((Hon) 1Br.A0B(i2x.A0F)).A00(i2x.A05, ((IMH) 1Br.A0B(i2x.A0E)).A01(), null);
                            } else {
                                ArrayList A0s = AnonymousClass001.A0s();
                                1Du it2 = A0a.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    ImmutableList immutableList = i2x.A02;
                                    if (immutableList == null || !immutableList.contains(next)) {
                                        A0s.add(next);
                                    }
                                }
                                ((Hon) 1Br.A0B(i2x.A0F)).A00(i2x.A05, ((IMH) 1Br.A0B(i2x.A0E)).A01(), A0s);
                            }
                        }
                    }
                    i2x.A02 = A0a;
                    i2x.A00 = i;
                    ImmutableList immutableList2 = i2x.A01;
                    if (immutableList2 == null) {
                        I2x.A00(i2x, immutableList2);
                        immutableList2 = ImmutableList.of();
                    }
                    I2x.A00(i2x, immutableList2);
                    return;
                }
                return;
            case 1:
                HashSet A0v = AnonymousClass001.A0v();
                Hzc hzc = (Hzc) this.A01;
                List A09 = IFr.A09(AbstractC2326GOr.A0S(hzc.A00));
                Set set = hzc.A04;
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (!A09.contains(next2)) {
                        A0v.add(next2);
                        it3.remove();
                    }
                }
                set.addAll(A09);
                synchronized (hzc) {
                    Iterator A0y = AnonymousClass001.A0y(hzc.A03);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        Set set2 = (Set) A0z.getValue();
                        set2.removeAll(A0v);
                        if (set2.isEmpty()) {
                            A0y.remove();
                            Hzc.A00(hzc, AnonymousClass001.A05(A0z.getKey()));
                        }
                    }
                }
                return;
            case 2:
                ICN icn = (ICN) this.A01;
                if (1Br.A0B(icn.A0B) != null) {
                    ImmutableSet A07 = ImmutableSet.A07(IFr.A09(AbstractC2326GOr.A0S(icn.A0A)));
                    11T.A0D(A07);
                    LinkedHashMap linkedHashMap = icn.A0G;
                    Set keySet = linkedHashMap.keySet();
                    11T.A0A(keySet);
                    for (String str2 : 0QD.A0h(keySet, A07)) {
                        11T.A0D(str2);
                        Number A15 = GOn.A15(str2, linkedHashMap);
                        if (A15 == null) {
                            A15 = 4YV.A0i();
                        }
                        ICN.A02(icn, str2, 2, A15.longValue(), -1);
                    }
                    return;
                }
                return;
            case 3:
                I0A.A00((I0A) this.A01);
                return;
            case 4:
                GrV grV = (GrV) this.A01;
                CallModel A01 = GS1.A01(grV.A09);
                if (!GOp.A0Y(grV.A0S).A02) {
                    1Br r0 = grV.A07;
                    if (GOp.A0R(r0).A09 == 0S2.A01 && !IFr.A0D(A01)) {
                        GOp.A0R(r0).A0B(0S2.A00);
                    }
                }
                I0g A0B = GrV.A0B(grV);
                1Br r02 = grV.A0P;
                1Br.A0C(r02);
                A0B.A0f = false;
                A0B.A0i = GrV.A0S(grV);
                if (GOp.A0s(grV.A0B).A0y()) {
                    1Br.A0C(r02);
                }
                A0B.A0h = false;
                A0B.A08 = IFr.A00(A01);
                IZy.A00(A0B, grV);
                GrV.A0M(grV);
                return;
            case 5:
                GrN.A02(this.A01);
                return;
            case 6:
            case 29:
            default:
                super.CAo();
                return;
            case 7:
                GrQ grQ = (GrQ) this.A01;
                if (1Br.A07(grQ.A0C).AZk(36317466065906971L)) {
                    GrQ.A02(grQ, 3);
                    return;
                } else {
                    GrQ.A01(grQ);
                    return;
                }
            case 8:
                IAC iac = (IAC) this.A01;
                ImmutableList copyOf = ImmutableList.copyOf((Iterable) 2Ri.A03(new Imz(iac, 1), ((2Qb) 1Lo.A04((Context) null, iac.A02, iac.A00, 17016)).A09()));
                ImmutableList copyOf2 = ImmutableList.copyOf((Iterable) 2Ri.A03(new Imz(iac, 0), copyOf));
                if (copyOf2 != null && !copyOf2.isEmpty() && !iac.A01 && IAC.A02(iac)) {
                    IAC.A01(iac, copyOf2, true);
                    return;
                }
                if (copyOf == null || copyOf.isEmpty() || iac.A01 || !IAC.A02(iac)) {
                    IAC.A00(iac);
                    return;
                } else {
                    IAC.A01(iac, copyOf, false);
                    return;
                }
            case 9:
                I4i.A00((I4i) this.A01);
                return;
            case 10:
                Gr4.A00((Gr4) this.A01);
                return;
            case 11:
                IAh iAh = (IAh) this.A01;
                boolean isEmpty = IAh.A01(iAh).isEmpty();
                if (isEmpty != iAh.A00) {
                    iAh.A00 = isEmpty;
                    Iterator it4 = iAh.A0A.iterator();
                    while (it4.hasNext()) {
                        ((JFe) it4.next()).BpY();
                    }
                    return;
                }
                return;
            case 12:
                I46 i46 = (I46) this.A01;
                if (i46.A03 != null) {
                    ImmutableList B6o = GOp.A0t(i46.A0C).B6o();
                    State A0T = AbstractC2326GOr.A0T(i46.A04.A00);
                    if (i46.A03 == null || A0T.callState == 0 || B6o.isEmpty() || ((I9O) 1BK.A0r(B6o)).A04.isEmpty()) {
                        return;
                    }
                    if (IAh.A02(i46.A06)) {
                        String str3 = i46.A03;
                        11T.A0D(str3);
                        i46.A01(str3, i46.A02, i46.A01);
                    } else {
                        GP5.A01(GOp.A0K(i46.A05), "cowatch_promo_call_failed", "peer_not_capable");
                        Iterator it5 = GOp.A0V(i46.A08).A0d.iterator();
                        while (it5.hasNext()) {
                            Gps gps = (Gps) ((HFY) it5.next());
                            if (10 - gps.A00 == 0) {
                                CoWatchNotificationFeature coWatchNotificationFeature = (CoWatchNotificationFeature) gps.A01;
                                I8a i8a = ((HEt) coWatchNotificationFeature).A00;
                                if (i8a != null) {
                                    DKI.A0d(i8a, HBr.A0Q, 1BK.A0u(coWatchNotificationFeature.A01, 2131955168));
                                }
                            }
                        }
                    }
                    i46.A00(null, null, null);
                    return;
                }
                return;
            case 13:
                IDo iDo = (IDo) this.A01;
                ThreadKey A00 = IDo.A00(iDo);
                if (A00 != null && (threadKey = iDo.A03) != null && !11T.A0O(1BK.A0w(threadKey), 1BK.A0w(A00))) {
                    IAh.A01((IAh) 1Br.A0B(iDo.A0L)).isEmpty();
                    CaN caN = (CaN) 1Br.A0B(iDo.A0Q);
                    ThreadKey threadKey2 = iDo.A03;
                    if (threadKey2 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = caN.A07;
                    Iterator it6 = copyOnWriteArrayList.iterator();
                    while (it6.hasNext()) {
                        Reference reference = (Reference) it6.next();
                        DEy dEy = (DEy) reference.get();
                        if (dEy != null) {
                            CaN.A00(dEy, caN, threadKey2);
                            copyOnWriteArrayList.remove(reference);
                            caN.A03(dEy, true);
                        }
                    }
                    iDo.A03 = A00;
                }
                ImmutableList A0a2 = 1BL.A0a(IFr.A06(AbstractC2326GOr.A0S(iDo.A0G)));
                if (iDo.A05 != null && iDo.A09) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    1Du it7 = A0a2.iterator();
                    while (it7.hasNext()) {
                        Object next3 = it7.next();
                        if (!iDo.A0c.contains(next3)) {
                            A0s2.add(next3);
                        }
                    }
                    String str4 = iDo.A05;
                    if (str4 != null) {
                        try {
                            str = AnonymousClass001.A12().put("lr_id", str4).toString();
                        } catch (JSONException e) {
                            0fH.A0r("RtcDataChannelConstants", "Failed to parse JSON", e);
                            str = null;
                        }
                        if (7zM.A1b(A0s2) && str != null) {
                            ((DataSender) 4YU.A0n(iDo.A0C, iDo.A0E, 114904)).sendDataMessageToPeers("cw_exist", DKC.A1a(str, C03r.A05), A0s2);
                        }
                    }
                }
                Set set3 = iDo.A0c;
                set3.clear();
                set3.addAll(A0a2);
                return;
            case 14:
                Gr3.A00((Gr3) this.A01);
                return;
            case 15:
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
            case 16:
                IML iml = (IML) this.A01;
                CallModel A0S = AbstractC2326GOr.A0S(iml.A0d);
                if (iml.A01 <= 1 && IFr.A01(A0S) >= 2) {
                    C00i c00i = iml.A0h.A00;
                    I8A.A01(c00i).AZk(36315876928005671L);
                    I8A.A01(c00i).AZk(36319145398187634L);
                    I8A.A01(c00i).AZk(36320734536154790L);
                }
                if (iml.A0D() == HCR.A0L || iml.A0D() == HCR.A0D) {
                    IML.A03(iml.A0D(), iml);
                }
                iml.A01 = IFr.A01(A0S);
                return;
            case 17:
                CP1.A01((CP1) this.A01);
                return;
            case 18:
                Gqy.A00((Gqy) this.A01);
                return;
            case 19:
                IYp iYp = (IYp) this.A01;
                iYp.A05();
                IYp.A03(iYp);
                String str5 = iYp.A0D;
                if (str5 != null) {
                    iYp.A09(str5);
                    return;
                }
                return;
            case 20:
                I8j i8j = (I8j) this.A01;
                7zS.A1H(i8j.A03);
                0AE r04 = i8j.A01;
                int A002 = r04.A00();
                for (int i2 = 0; i2 < A002; i2++) {
                    int A02 = r04.A02(i2);
                    HeU heU = (HeU) r04.A05(i2);
                    if (heU != null) {
                        Set set4 = heU.A01;
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        Iterator it8 = set4.iterator();
                        while (it8.hasNext()) {
                            I9O B1U = ((2QU) 4YU.A0n(1Br.A03(i8j.A05), i8j.A02, 99981)).B1U(AnonymousClass001.A0i(it8));
                            if (B1U != null) {
                                A0s3.add(B1U);
                            }
                        }
                        if (I8j.A01(A0s3)) {
                            I8j.A00(i8j, A02, true);
                        }
                    }
                }
                return;
            case 21:
                IYs.A00((IYs) this.A01);
                return;
            case 22:
                Iterator it9 = ((I4x) this.A01).A0A.iterator();
                while (it9.hasNext()) {
                    ((HFb) it9.next()).A00();
                }
                return;
            case 23:
                C2473GeU.A00((C2473GeU) this.A01);
                return;
            case 24:
                IED ied = (IED) this.A01;
                CallModel A0S2 = AbstractC2326GOr.A0S(ied.A04);
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(IFr.A06(A0S2));
                if (7zM.A1b(copyOnWriteArraySet)) {
                    IZ0 A0g = GOp.A0g(ied.A0J);
                    Object obj = A0g.A0H.get();
                    11T.A0A(obj);
                    byte[] A003 = IZ0.A00(A0g, (String) obj);
                    if (A003 != null) {
                        ((DataSender) 4YU.A0n(A0g.A03, A0g.A04, 114910)).sendDataMessageToPeersTransacted("kMNScreenShareDataStartScreenSharing", A003, copyOnWriteArraySet);
                    }
                }
                if (A0S2 != null) {
                    if (A0S2.selfParticipant.userProfile.contactTypeExact != 4) {
                        ArrayList arrayList = A0S2.remoteParticipants;
                        11T.A09(arrayList);
                        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                            return;
                        }
                        Iterator it10 = arrayList.iterator();
                        while (it10.hasNext()) {
                            if (GOn.A0w(it10).userProfile.contactTypeExact == 4) {
                            }
                        }
                        return;
                    }
                    ied.A07(0S2.A0u);
                    return;
                }
                return;
            case 25:
                IZ0 iz0 = (IZ0) this.A01;
                Set set5 = iz0.A0G;
                Iterator it11 = new CopyOnWriteArraySet(set5).iterator();
                while (it11.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it11);
                    2QU A0t = GOp.A0t(iz0.A05);
                    11T.A0D(A0i);
                    I9O B1U2 = A0t.B1U(A0i);
                    if (B1U2 != null && !I6L.A02(B1U2)) {
                        set5.remove(A0i);
                    }
                }
                return;
            case 26:
                C2475GeW.A00((C2475GeW) this.A01);
                return;
            case 27:
                GrR grR = (GrR) this.A01;
                GrR.A03(grR);
                GrR.A08(grR);
                GrR.A09(grR);
                return;
            case 28:
                GrU grU = (GrU) this.A01;
                GrU.A0D(grU);
                GrU.A0G(grU);
                return;
            case 30:
                HXX hxx = ((HzF) this.A01).A00;
                if (hxx != null) {
                    I3s.A00(hxx.A00);
                    return;
                }
                return;
            case 31:
                IgB igB = (IgB) this.A01;
                igB.A02.updateParticipants(igB.A01.Aaq());
                return;
            case 32:
                IRF irf = (IRF) this.A01;
                2QN r05 = irf.A1e;
                if (r05.A0S) {
                    IRF.A0I(irf);
                }
                if (r05.Ai6() == null) {
                    I9O ASg = irf.A1i.ASg();
                    r05.A09(ASg == null ? null : ASg.A03.A03);
                }
                if (IFr.A0N(GS1.A00(irf.A0Y)).length == 2) {
                    2QS r06 = irf.A1i;
                    if (r06.B6o().size() == 1) {
                        I7h i7h = (I7h) 1Br.A0B(irf.A1K);
                        1G2 A004 = 1G3.A00(51K.A0Y, String.valueOf(r05.A03));
                        A08 = 1Br.A08(i7h.A04);
                        A08.Cdj(A004);
                    } else {
                        1Du it12 = r06.Aar().iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                2QW A005 = ((I9O) AbH.A15(it12)).A03.A00();
                                11T.A0A(A005);
                                if (A005 == 2QW.A0E) {
                                    if (!irf.A0D) {
                                        irf.A0D = true;
                                        I7h i7h2 = (I7h) 1Br.A0B(irf.A1K);
                                        String valueOf = String.valueOf(r05.A03);
                                        ThreadKey threadKey3 = r05.A05;
                                        if (threadKey3 == null) {
                                            threadKey3 = ThreadKey.A0H(Long.parseLong(valueOf), AbG.A03(((1EZ) 1Br.A0B(i7h2.A09)).ChJ().mUserId));
                                        }
                                        if (!I7h.A01(threadKey3, i7h2, valueOf)) {
                                            1G2 A006 = 1G3.A00(51K.A0Y, valueOf);
                                            List A007 = I7h.A00(i7h2, valueOf);
                                            A08 = 1Br.A08(i7h2.A04);
                                            A08.CaL(A006, 4YV.A0t(", ", 0QD.A0c(A007, Math.min(4, A007.size())), (Function1) null));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    A08.commit();
                }
                1Du A0l = GOo.A0l(irf);
                while (A0l.hasNext()) {
                    ((2Qe) AbH.A15(A0l)).A05();
                }
                return;
            case 33:
                ((GS4) this.A01).A0d();
                return;
        }
    }

    public void CAp() {
        int i;
        switch (this.A00) {
            case 3:
                I0A.A00((I0A) this.A01);
                return;
            case 7:
                GrQ.A03(this.A01);
                return;
            case 9:
                I4i.A00((I4i) this.A01);
                return;
            case 17:
                CP1.A01((CP1) this.A01);
                return;
            case 19:
                IYp iYp = (IYp) this.A01;
                iYp.A05();
                IYp.A03(iYp);
                return;
            case 21:
                IYs.A00((IYs) this.A01);
                return;
            case 26:
                C2475GeW.A00((C2475GeW) this.A01);
                return;
            case 27:
                GrR grR = (GrR) this.A01;
                GrR.A08(grR);
                GrR.A09(grR);
                return;
            case 28:
                GrU.A0G((GrU) this.A01);
                return;
            case 29:
                GrT.A01((GrT) this.A01);
                return;
            case 31:
                IgB igB = (IgB) this.A01;
                igB.A02.updateParticipants(igB.A01.Aaq());
                return;
            case 32:
                IRF irf = (IRF) this.A01;
                2QN r0 = irf.A1e;
                if (r0.BQe(false) && r0.A0a && ((i = r0.A00) == 4 || i == 3)) {
                    JOT jot = irf.A06;
                    if (jot == null) {
                        throw 1BK.A0h();
                    }
                    jot.D5O();
                }
                1Du A0l = GOo.A0l(irf);
                while (A0l.hasNext()) {
                    11T.A0A(A0l.next());
                }
                return;
            case 34:
                ((RQx) ((Rooms2LiveCallLifecycle) this.A01).A0C.getValue()).A00();
                return;
            default:
                super.CAp();
                return;
        }
    }

    public void CAr() {
        switch (this.A00) {
            case 3:
                I0A.A00((I0A) this.A01);
                return;
            case 4:
                GrV grV = (GrV) this.A01;
                CallModel A01 = GS1.A01(grV.A09);
                I0g A0B = GrV.A0B(grV);
                1Br.A0C(grV.A0P);
                A0B.A0f = false;
                A0B.A0i = GrV.A0S(grV);
                A0B.A08 = IFr.A00(A01);
                IZy.A00(A0B, grV);
                return;
            case 5:
                GrN.A02(this.A01);
                return;
            case 6:
                ((GrI) this.A01).A0f((8LW) null, (Boolean) null);
                return;
            case 10:
                Gr4.A00((Gr4) this.A01);
                return;
            case 14:
                Gr3.A00((Gr3) this.A01);
                return;
            case 17:
                CP1.A01((CP1) this.A01);
                return;
            case 18:
                Gqy.A00((Gqy) this.A01);
                return;
            case 19:
                IYp iYp = (IYp) this.A01;
                iYp.A05();
                IYp.A03(iYp);
                return;
            case 26:
                C2475GeW.A00((C2475GeW) this.A01);
                return;
            case 28:
                GrU grU = (GrU) this.A01;
                1Br.A0C(grU.A0N);
                CallModel A0S = AbstractC2326GOr.A0S(grU.A0a);
                Hka A02 = GrU.A02(grU);
                int i = 1;
                if (IFr.A00(A0S) > 2) {
                    i = 4;
                }
                A02.A00 = i;
                IZv.A00(A02, grU);
                GrU.A0D(grU);
                GrU.A0G(grU);
                GrU.A0B(grU);
                GrU.A0J(grU);
                return;
            case 30:
                HXX hxx = ((HzF) this.A01).A00;
                if (hxx != null) {
                    I3s.A00(hxx.A00);
                    return;
                }
                return;
            case 32:
                IRF irf = (IRF) this.A01;
                if (irf.A1e.A0S) {
                    IRF.A0I(irf);
                    return;
                }
                return;
            case 33:
                ((GS4) this.A01).A0d();
                return;
            default:
                super.CAr();
                return;
        }
    }
}
