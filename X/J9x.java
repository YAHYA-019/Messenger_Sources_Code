package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.videoqualitypicker.gen.VideoQualityPickerApi;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: J9x.class */
public final class J9x extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9x(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v764, types: [androidx.fragment.app.Fragment, com.facebook.messaging.rtc.incall.impl.dialog.RtcAudioSelectorDialog] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C2cm c2cm;
        C26z c26z;
        Object obj2;
        Object obj3;
        int A01;
        A31 a31;
        int i;
        Iex iex;
        C00m c00m;
        7B9 r0;
        MediaResource mediaResource;
        Uri uri;
        0D2 r306;
        Ifu ifu;
        HCk hCk;
        switch (this.A00) {
            case 0:
                a31 = (A31) obj;
                11T.A0F(a31, 0);
                J8N j8n = J8N.A00;
                Object obj4 = this.A01;
                AW4 aw4 = new AW4(obj4, 39);
                C00j.A05("SubscriptionInitializerV3.selectProperty", 686503135);
                try {
                    Iev iev = new Iev(aw4, 0);
                    C04r c04r = a31.A01;
                    C04r A0D = AbstractC2327GOs.A0D(a31, j8n, iev, (List) 7zV.A0Y(CallModel.class, c04r));
                    C00j.A01(1707931625);
                    JBk jBk = new C06w() { // from class: X.JBk
                        @Override // X.C06w, X.AnonymousClass070
                        public Object get(Object obj5) {
                            return Integer.valueOf(((CallModel) obj5).connectionQuality);
                        }
                    };
                    C00j.A05("SubscriptionInitializerV3.selectProperty", -225722585);
                    try {
                        C00j.A05("SubscriptionInitializerV3.selectProperty", 397123312);
                        try {
                            7zV.A15(7zV.A0Y(CallModel.class, c04r), jBk, (Object) null, A0D);
                            C00j.A01(-1362485060);
                            C00j.A01(-2126330047);
                            J8O j8o = J8O.A00;
                            C00j.A05("SubscriptionInitializerV3.selectProperty", -1551701075);
                            try {
                                C00j.A05("SubscriptionInitializerV3.selectProperty", 867267623);
                                try {
                                    7zV.A15(7zV.A0Y(CallModel.class, c04r), j8o, (Object) null, A0D);
                                    C00j.A01(1653146043);
                                    C00j.A01(-379464460);
                                    JBl jBl = new C06w() { // from class: X.JBl
                                        @Override // X.C06w, X.AnonymousClass070
                                        public Object get(Object obj5) {
                                            return GOp.A13(obj5);
                                        }
                                    };
                                    AW4 aw42 = new AW4(obj4, 40);
                                    C00j.A05("SubscriptionInitializerV3.selectProperty", -1047246973);
                                    try {
                                        7zV.A15(7zV.A0Y(8LL.class, c04r), jBl, new Iev(aw42, 1), A0D);
                                        C00j.A01(-1272516526);
                                        iex = new Iex(obj4, 0);
                                        if (a31.A00 != null) {
                                            throw AnonymousClass001.A0N("afterCallbacks already.  Overriding afterCallbacks is not supported and will lead to unpredictable behavior.");
                                        }
                                        a31.A00 = iex;
                                        return 04S.A00;
                                    } catch (Throwable th) {
                                        th = th;
                                        i = 1968792539;
                                        C00j.A01(i);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    C00j.A01(-1117194648);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i = -1410577039;
                            }
                        } catch (Throwable th4) {
                            C00j.A01(1357944930);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i = 986184037;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i = -1548212498;
                }
            case 1:
                return C2cn.A00(AnonymousClass001.A03(obj) / 2.0f, 0, 7zQ.A0m(((Ify) this.A01).A05).B4f());
            case 2:
                a31 = (A31) obj;
                11T.A0F(a31, 0);
                JBm jBm = new C06w() { // from class: X.JBm
                    @Override // X.C06w, X.AnonymousClass070
                    public Object get(Object obj5) {
                        return Integer.valueOf(((State) obj5).callState);
                    }
                };
                GrN grN = (GrN) this.A01;
                GC5 gc5 = new GC5(grN, 9);
                C00j.A05("SubscriptionInitializerV3.selectProperty", -617426218);
                try {
                    A2z a2z = new A2z(gc5, 0);
                    C04r c04r2 = a31.A01;
                    C04r A0D2 = AbstractC2327GOs.A0D(a31, jBm, a2z, (List) 7zV.A0Y(State.class, c04r2));
                    C00j.A01(2127099288);
                    J8P j8p = J8P.A00;
                    C00j.A05("SubscriptionInitializerV3.selectProperty", -1376386256);
                    try {
                        C00j.A05("SubscriptionInitializerV3.selectProperty", -336643795);
                        try {
                            7zV.A15(7zV.A0Y(CallModel.class, c04r2), j8p, (Object) null, A0D2);
                            C00j.A01(2013052051);
                            C00j.A01(188486627);
                            JBn jBn = new C06w() { // from class: X.JBn
                                @Override // X.C06w, X.AnonymousClass070
                                public Object get(Object obj5) {
                                    return Integer.valueOf(((CallModel) obj5).inCallState);
                                }
                            };
                            C00j.A05("SubscriptionInitializerV3.selectProperty", 1938982206);
                            try {
                                C00j.A05("SubscriptionInitializerV3.selectProperty", -1484658904);
                                try {
                                    7zV.A15(7zV.A0Y(CallModel.class, c04r2), jBn, (Object) null, A0D2);
                                    C00j.A01(-382025618);
                                    C00j.A01(-531571168);
                                    if (1Br.A07(grN.A0G).AZk(36326369533122058L)) {
                                        J8Q j8q = J8Q.A00;
                                        C00j.A05("SubscriptionInitializerV3.selectProperty", -887210862);
                                        try {
                                            C00j.A05("SubscriptionInitializerV3.selectProperty", 233538232);
                                            try {
                                                7zV.A15(7zV.A0Y(CallModel.class, c04r2), j8q, (Object) null, A0D2);
                                                C00j.A01(-1151852404);
                                                C00j.A01(831837984);
                                                J8R j8r = J8R.A00;
                                                C00j.A05("SubscriptionInitializerV3.selectProperty", -920675689);
                                                try {
                                                    C00j.A05("SubscriptionInitializerV3.selectProperty", -816182188);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    i = 916270603;
                                                }
                                                try {
                                                    7zV.A15(7zV.A0Y(CallModel.class, c04r2), j8r, (Object) null, A0D2);
                                                    C00j.A01(-1210412291);
                                                    C00j.A01(579345295);
                                                    J8S j8s = J8S.A00;
                                                    AW4 aw43 = new AW4(grN, 41);
                                                    C00j.A05("SubscriptionInitializerV3.selectProperty", -463779852);
                                                    try {
                                                        7zV.A15(7zV.A0Y(CallModel.class, c04r2), j8s, new Iev(aw43, 2), A0D2);
                                                        C00j.A01(-2102877540);
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        i = -1343594751;
                                                        C00j.A01(i);
                                                        throw th;
                                                    }
                                                } catch (Throwable th9) {
                                                    C00j.A01(-164557077);
                                                    throw th9;
                                                }
                                            } catch (Throwable th10) {
                                                C00j.A01(-2002975737);
                                                throw th10;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            i = -1854473619;
                                        }
                                    }
                                    JBo jBo = new C06w() { // from class: X.JBo
                                        @Override // X.C06w, X.AnonymousClass070
                                        public Object get(Object obj5) {
                                            return GOp.A13(obj5);
                                        }
                                    };
                                    C00j.A05("SubscriptionInitializerV3.selectProperty", 866439374);
                                    try {
                                        C00j.A05("SubscriptionInitializerV3.selectProperty", -1929430684);
                                        try {
                                            7zV.A15(7zV.A0Y(8LL.class, c04r2), jBo, (Object) null, A0D2);
                                            C00j.A01(-1421546437);
                                            C00j.A01(-1514884289);
                                            iex = new Iex(grN, 1);
                                            if (a31.A00 != null) {
                                                throw AnonymousClass001.A0N("afterCallbacks already.  Overriding afterCallbacks is not supported and will lead to unpredictable behavior.");
                                            }
                                            a31.A00 = iex;
                                            return 04S.A00;
                                        } catch (Throwable th12) {
                                            C00j.A01(-260777982);
                                            throw th12;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i = -969443372;
                                        C00j.A01(i);
                                        throw th;
                                    }
                                } catch (Throwable th14) {
                                    C00j.A01(51946625);
                                    throw th14;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                i = 960348786;
                            }
                        } catch (Throwable th16) {
                            C00j.A01(-1084728343);
                            throw th16;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        i = 648990712;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    i = 1629261181;
                }
            case 3:
                throw AnonymousClass001.A0Q("_lastViewState");
            case 4:
                11T.A0F(obj, 0);
                throw AnonymousClass001.A0Q("_lastViewState");
            case 5:
                c00m = ((8cE) this.A01).A04;
                c00m.invoke();
                return 04S.A00;
            case 6:
                c00m = ((8hG) this.A01).A05;
                c00m.invoke();
                return 04S.A00;
            case 7:
                c00m = ((8hG) this.A01).A04;
                c00m.invoke();
                return 04S.A00;
            case 8:
                7B9 r02 = (6Sh) obj;
                11T.A0F(r02, 0);
                if ((r02 instanceof 7B9) && (r0 = r02) != null && (mediaResource = r0.A01.A01) != null && (uri = mediaResource.A0E) != null) {
                    C9Oq c9Oq = ((8cF) this.A01).A01;
                    String A02 = 11T.A02(uri);
                    8iN r03 = c9Oq.A00;
                    1Br.A0C(r03.A06);
                    HvX.A00(c9Oq.A01, A02, 3, 3);
                    GOp.A0Q(r03.A00).Cgp();
                }
                return 04S.A00;
            case 9:
                11T.A0F(obj, 0);
                ((C2lh) this.A01).A02(obj);
                return 04S.A00;
            case 10:
                JFW jfw = ((8Zd) this.A01).A00;
                if (jfw != null) {
                    jfw.CFJ();
                }
                return 04S.A00;
            case 11:
                a31 = 7zU.A0a(obj);
                GpX gpX = (GpX) this.A01;
                if (7zQ.A1a(gpX.A0b)) {
                    JBp jBp = new C06w() { // from class: X.JBp
                        @Override // X.C06w, X.AnonymousClass070
                        public Object get(Object obj5) {
                            return Integer.valueOf(((CryptoE2eeModel) obj5).mode);
                        }
                    };
                    C00j.A05("SubscriptionInitializerV3.selectProperty", -1053333275);
                    try {
                        C00j.A05("SubscriptionInitializerV3.selectProperty", 1193340558);
                        try {
                            List list = (List) 7zV.A0Y(CryptoE2eeModel.class, a31.A01);
                            C0B7.A04(jBp, 1);
                            list.add(jBp);
                            C04r c04r3 = a31.A03;
                            C0B7.A04(jBp, 1);
                            c04r3.put(jBp, null);
                            C00j.A01(1880470358);
                            C00j.A01(1665293633);
                        } catch (Throwable th19) {
                            C00j.A01(919061062);
                            throw th19;
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        i = -610149728;
                        C00j.A01(i);
                        throw th;
                    }
                }
                JBq jBq = new C06w() { // from class: X.JBq
                    @Override // X.C06w, X.AnonymousClass070
                    public Object get(Object obj5) {
                        return Integer.valueOf(((State) obj5).callState);
                    }
                };
                C00j.A05("SubscriptionInitializerV3.selectProperty", -981491140);
                try {
                    C00j.A05("SubscriptionInitializerV3.selectProperty", 495737189);
                    try {
                        List list2 = (List) 7zV.A0Y(State.class, a31.A01);
                        C0B7.A04(jBq, 1);
                        list2.add(jBq);
                        C04r c04r4 = a31.A03;
                        C0B7.A04(jBq, 1);
                        c04r4.put(jBq, null);
                        C00j.A01(216403157);
                        C00j.A01(-1658119365);
                        iex = new Iex(gpX, 2);
                        if (a31.A00 != null) {
                            throw AnonymousClass001.A0N("afterCallbacks already.  Overriding afterCallbacks is not supported and will lead to unpredictable behavior.");
                        }
                        a31.A00 = iex;
                        return 04S.A00;
                    } catch (Throwable th21) {
                        C00j.A01(-1483569247);
                        throw th21;
                    }
                } catch (Throwable th22) {
                    th = th22;
                    i = 276288580;
                    C00j.A01(i);
                    throw th;
                }
            case 12:
                GpY.A08((GpY) this.A01);
                return 04S.A00;
            case 13:
                3xC r04 = (3xC) obj;
                11T.A0F(r04, 0);
                ((QHE) this.A01).A01.onClick(r04.A00);
                return 04S.A00;
            case 14:
                8LW r05 = (8LW) obj;
                11T.A0F(r05, 0);
                B7V b7v = (B7V) this.A01;
                C1797At6 c1797At6 = b7v.A00;
                CallModel callModel = (CallModel) r05.A00(CallModel.class);
                boolean z2 = false;
                if (callModel != null && callModel.inCallState == 6) {
                    z2 = true;
                }
                B7V.A03(C1797At6.A00(null, c1797At6, null, null, null, null, B7V.A02(b7v), 0, 32479, false, false, false, false, z2, false, false), b7v);
                return 04S.A00;
            case 15:
                B7b b7b = (B7b) this.A01;
                b7b.A02.postValue(Boolean.valueOf(B7b.A01(b7b)));
                return 04S.A00;
            case 16:
                8Lb r06 = (8Lb) obj;
                11T.A0F(r06, 0);
                LobbyRootView lobbyRootView = (LobbyRootView) this.A01;
                ((I8G) 1Br.A0B(lobbyRootView.A0R)).A02(lobbyRootView.A04, lobbyRootView.A06, r06.A00, r06.A01);
                return 04S.A00;
            case 17:
                HyA.A00("Face Expression Fitting Version", 4YV.A0u(obj));
                return 04S.A00;
            case 18:
            case 19:
                C8hm c8hm = (C8hm) this.A01;
                long j = C8hm.A06;
                z = !c8hm.A03;
                return Boolean.valueOf(z);
            case 20:
                8Xq r07 = (8Xq) this.A01;
                HgH hgH = r07.A01;
                HBP hbp = r07.A00.A00;
                11T.A0F(hbp, 0);
                if (7zQ.A1a(hgH.A00.A03)) {
                    AudioApi audioApi = (AudioApi) 1Bn.A0A(115726);
                    if (audioApi != null) {
                        audioApi.setAudioOutputRoute(Hvn.A00(hbp));
                    }
                } else {
                    JOT jot = (JOT) hgH.A03.element;
                    if (jot != null) {
                        jot.AEW(hbp);
                    }
                }
                if (hbp != hgH.A02) {
                    ?? r08 = hgH.A01;
                    94S r09 = MigBottomSheetDialogFragment.A01;
                    FbUserSession fbUserSession = r08.A00;
                    if (fbUserSession == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    ((JOJ) 7zN.A0m((Fragment) r08, fbUserSession, 83902)).BZn("AUDIO_OUTPUT_CHANGED");
                    ((I5D) 1Bi.A03(115690)).A01().A00(AnonymousClass001.A0Z(hbp, "manual audio route selected to ", AnonymousClass001.A0k()));
                }
                r306 = hgH.A01;
                r306.A0o();
                return 04S.A00;
            case 21:
                c2cm = (C2cm) obj;
                11T.A0F(c2cm, 0);
                c2cm.A2a(((C9Ot) this.A01).A00);
                c26z = C26z.START;
                c2cm.A25(c26z, 8.0f);
                return c2cm;
            case 22:
            case 24:
                c2cm = (C2cm) obj;
                11T.A0F(c2cm, 0);
                c2cm.A2a(((C1u2) this.A01).A03(C1u3.A1U));
                c26z = C26z.END;
                c2cm.A25(c26z, 8.0f);
                return c2cm;
            case 23:
                QGb qGb = (QGb) this.A01;
                HgI hgI = qGb.A01;
                int i2 = qGb.A00.A00;
                if (i2 != hgI.A00) {
                    1Br r010 = hgI.A01;
                    94S r011 = MigBottomSheetDialogFragment.A01;
                    VideoQualityPickerApi videoQualityPickerApi = (VideoQualityPickerApi) 1Br.A0B(r010);
                    if (videoQualityPickerApi != null) {
                        videoQualityPickerApi.setPreferredVideoQuality(i2);
                    }
                    ((HqI) 1Br.A0B(hgI.A02)).A00(i2 != 1 ? i2 != 2 ? HCL.A1Q : HCL.A0n : HCL.A0H);
                }
                r306 = hgI.A03;
                r306.A0o();
                return 04S.A00;
            case 25:
                Gr3.A00((Gr3) this.A01);
                return 04S.A00;
            case 26:
                if (GOo.A1X(7zO.A0e(obj))) {
                    ((IML) this.A01).A0H(HAU.A07);
                }
                return 04S.A00;
            case 27:
            case 29:
                8hH r012 = (8hH) this.A01;
                JFg jFg = r012.A03;
                if (jFg != null) {
                    jFg.Bvp(r012.A05);
                }
                return 04S.A00;
            case 28:
            case 30:
                F5R f5r = (F5R) obj;
                8hH r013 = (8hH) this.A01;
                11T.A0D(f5r);
                f5r.A01.A0a(f5r.A00, f5r.A02);
                if (r013.A03 != null) {
                    f5r.A02.A06(0Oe.A08);
                    f5r.A02.A02.setScreenReaderFocusable(true);
                    f5r.A02.A0C(false);
                }
                return 04S.A00;
            case 31:
                String str = (String) obj;
                11T.A0F(str, 0);
                H5G h5g = ((HVl) this.A01).A00;
                JFp jFp = H5G.A0W;
                GrU A0V = GOo.A0V(h5g);
                DqA dqA = A0V.A04;
                if (dqA != null && str.equals(dqA.A02)) {
                    A0V.A09 = true;
                    GrU.A0C(A0V);
                }
                return 04S.A00;
            case 32:
                c00m = ((QHF) this.A01).A02;
                c00m.invoke();
                return 04S.A00;
            case 33:
                c00m = ((QHF) this.A01).A03;
                c00m.invoke();
                return 04S.A00;
            case 34:
                c00m = ((QHF) this.A01).A04;
                c00m.invoke();
                return 04S.A00;
            case 35:
            case 36:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            default:
                c00m = (C00m) this.A01;
                c00m.invoke();
                return 04S.A00;
            case 37:
                c00m = ((C8cv) this.A01).A01;
                c00m.invoke();
                return 04S.A00;
            case 38:
                8LW r014 = (8LW) obj;
                11T.A0F(r014, 0);
                boolean A1X = GOo.A1X(r014);
                Hu8 hu8 = (Hu8) this.A01;
                if (!A1X) {
                    I7Z i7z = (I7Z) 1Br.A0B(hu8.A0A);
                    boolean A1W = AnonymousClass001.A1W(hu8.A01, HA2.A03);
                    1Br r015 = i7z.A03;
                    7zP.A0e(r015).markerStart(209979636);
                    7zP.A0e(r015).markerAnnotate(209979636, "floor_stolen", A1W);
                    7zP.A0e(r015).markerEnd(209979636, (short) 2);
                    if (hu8.A02()) {
                        4zI.A03.A05("ScreenshareFloorControlStateImpl", "releaseFloor", new Object[0]);
                        ifu = (Ifu) 1Br.A0B(hu8.A04);
                        hCk = HCk.A02;
                        ifu.A00(hCk);
                    }
                } else if (hu8.A02()) {
                    4zI.A03.A05("ScreenshareFloorControlStateImpl", "requestFloor", new Object[0]);
                    ifu = (Ifu) 1Br.A0B(hu8.A04);
                    hCk = HCk.A03;
                    ifu.A00(hCk);
                }
                return 04S.A00;
            case 39:
            case 40:
                QIC qic = (QIC) this.A01;
                CallerContext callerContext = QIC.A02;
                C2604Git c2604Git = qic.A00;
                String str2 = c2604Git.A05;
                String str3 = c2604Git.A06;
                if (str2 != null && str3 != null) {
                    qic.A01.invoke(str2, str3);
                }
                return 04S.A00;
            case 41:
                C8fl c8fl = (C8fl) this.A01;
                2lO r016 = C8fl.A03;
                Iterator it = GOp.A0Y(((GrO) c8fl.A00.A09.getValue()).A09).A0B.iterator();
                while (it.hasNext()) {
                    Gq0 gq0 = (Gq0) ((HFr) it.next());
                    if (gq0.A00 == 0) {
                        ((GrV) gq0.A01).A0h();
                    }
                }
                return 04S.A00;
            case 42:
                C8fl c8fl2 = (C8fl) this.A01;
                2lO r017 = C8fl.A03;
                GVb gVb = c8fl2.A00;
                Iterator it2 = gVb.A03.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (11T.A0O(((GjV) obj2).A02, gVb.A02)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                GjV gjV = (GjV) obj2;
                if (gjV != null) {
                    String str4 = gjV.A02;
                    PlayerOrigin playerOrigin = (PlayerOrigin) gjV.A00.A03;
                    1BL.A1F(str4, playerOrigin);
                    gVb.postDelayed(new SBR(playerOrigin, str4), 0L);
                }
                z = true;
                return Boolean.valueOf(z);
            case 43:
                3xE r018 = (3xE) obj;
                z = false;
                11T.A0F(r018, 0);
                if (r018.A00.getAction() == 1) {
                    C8fl c8fl3 = (C8fl) this.A01;
                    2lO r019 = C8fl.A03;
                    GVb gVb2 = c8fl3.A00;
                    Iterator it3 = gVb2.A03.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (11T.A0O(((GjV) obj3).A02, gVb2.A02)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    GjV gjV2 = (GjV) obj3;
                    if (gjV2 != null) {
                        I7y.A00(gVb2, (PlayerOrigin) gjV2.A00.A03, null, gjV2.A02);
                    }
                }
                return Boolean.valueOf(z);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                ((C2lh) this.A01).A04(JAY.A00);
                return 04S.A00;
            case 46:
                return Boolean.valueOf(((2Qa) this.A01).A05());
            case ActionId.ON_START_END /* 47 */:
                float A00 = 7zM.A00(obj);
                A01 = A00 <= 0.3f ? 9dQ.A01(A00, 0.0f, 0.3f, 0, 255) : 9dQ.A01(A00, 0.7f, 1.0f, 255, 0);
                return Integer.valueOf(A01);
            case ActionId.QUEUED /* 48 */:
                float A002 = 7zM.A00(obj);
                Rr7 rr7 = (Rr7) this.A01;
                int i3 = rr7.A01;
                int i4 = rr7.A00;
                double d = A002 - 1.0f;
                return Integer.valueOf(GOn.A03(i4 - i3, (float) (1.0d + ((1.0d + 2.5d) * ((float) Math.pow(d, 3.0d))) + (((float) Math.pow(d, 2.0d)) * 2.5d))) + i3);
            case ActionId.IN_PROGRESS /* 49 */:
                float A003 = 7zM.A00(obj);
                A01 = GOn.A03((GOo.A01(r0) / 2) - r0, A003) + (((Rr7) this.A01).A02.getResources().getDimensionPixelSize(2132279312) / 2);
                return Integer.valueOf(A01);
        }
    }
}
