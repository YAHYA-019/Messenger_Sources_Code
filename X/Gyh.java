package X;

import android.telecom.Connection;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.view.gen.ViewProxy;
import kotlin.jvm.functions.Function1;

/* loaded from: Gyh.class */
public final class Gyh extends ViewProxy {
    public JFs A00;
    public 5Vt A01;
    public Integer A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FbUserSession A06;
    public final 1De A07;
    public final 1Br A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile 2JS A0B;
    public volatile java.util.Map A0C;
    public volatile boolean A0D;

    public Gyh(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = fbUserSession;
        this.A08 = AbG.A0M();
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 114844);
        this.A04 = 1Lm.A03(fbUserSession, r0, 85223);
        this.A05 = GOn.A0g(fbUserSession, r0);
        this.A09 = 1BK.A0L(16385).AZk(36323521970457233L);
        this.A0A = 1BK.A0L(16385).AZk(36326068885411083L);
    }

    public static final void A00(Gyh gyh, 2JS r302, java.util.Map map) {
        boolean z = gyh.A09;
        1Br r0 = gyh.A05;
        if (z) {
            GOp.A0O(r0).A05(r302);
        } else {
            2JN A0O = GOp.A0O(r0);
            A0O.A05(((HmZ) 1Br.A0B(A0O.A02)).A00(A0O.A01, map));
        }
    }

    @Override // com.facebook.rsys.view.gen.ViewProxy
    public void handleModels(java.util.Map map) {
        IDc iDc;
        String str;
        Function1 function1;
        String str2;
        11T.A0F(map, 0);
        this.A0C = map;
        GyN gyN = this.A0A ? new GyN(map) : ((HmZ) 1Br.A0B(this.A03)).A00(this.A06, map);
        this.A0B = gyN;
        State A0m = GOq.A0m(gyN);
        5Vt r310 = this.A01;
        if (r310 == null && (str2 = A0m.localCallId) != null) {
            r310 = C9lt.A00(str2);
            this.A01 = r310;
        }
        int i = A0m.callState;
        Integer num = this.A02;
        if (num == null || num.intValue() != i) {
            this.A02 = Integer.valueOf(i);
            GOn.A1W(4zI.A03, "ViewProxyImpl", 0Pz.A0E(i, "CallState transition: ", " for ", r310 != null ? r310.A02 : null));
        }
        5Vt r0 = this.A01;
        if (r0 != null && r0.equals(C9lt.A01)) {
            4zJ r02 = 4zI.A03;
            CallModel A0j = GOq.A0j(gyN);
            r02.A08("ViewProxyImpl", 0Cc.A0k(0Pz.A0o("RpStore finalized, but new rsys models received. \n            |CallState: ", " | \n            |InCallState: ", "\n            |\"", i, A0j != null ? A0j.inCallState : 0)), new Object[0]);
        }
        5Vt r03 = this.A01;
        if (r03 != null && (function1 = r03.A00) != null) {
            function1.invoke(gyN);
        }
        C00i c00i = this.A04.A00;
        if (((IDc) c00i.get()).A08 && (str = (iDc = (IDc) c00i.get()).A07) != null) {
            2JQ r04 = State.CONVERTER;
            11T.A0B(r04);
            State state = (State) gyN.A01(r04);
            CallModel A0j2 = GOq.A0j(gyN);
            if (A0j2 != null) {
                String str3 = state.localCallId;
                java.util.Map map2 = iDc.A0C;
                if (11T.A0O(str3, map2.get(iDc.A07)) && state.isActive) {
                    Integer num2 = iDc.A06;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        IDO.A00.A03("ConnectionServiceCoordinatorImpl", 0Pz.A0T("setting pre connect audio route: ", intValue), (Throwable) null);
                        I9W i9w = iDc.A03;
                        if (i9w != null) {
                            i9w.A08(str, intValue);
                            iDc.A06 = null;
                        }
                        11T.A0L("selfManagedConnectionManager");
                        throw 0Q8.createAndThrow();
                    }
                    if (state.callState == 4) {
                        I9W i9w2 = iDc.A03;
                        if (i9w2 != null) {
                            i9w2.A05(str);
                            map2.remove(str);
                            iDc.A07 = null;
                            iDc.A09 = false;
                        }
                        11T.A0L("selfManagedConnectionManager");
                        throw 0Q8.createAndThrow();
                    }
                    int i2 = iDc.A00;
                    int i3 = A0j2.inCallState;
                    if (i2 != i3 && (i3 == 5 || i3 == 7)) {
                        int i4 = A0j2.initialDirection;
                        I9W i9w3 = iDc.A03;
                        if (i4 != 1) {
                            if (i9w3 != null) {
                                Connection connection = (Connection) i9w3.A01.get(str);
                                if (connection != null) {
                                    IDO.A00("onOutgoingCallActive");
                                    connection.setActive();
                                }
                            }
                            11T.A0L("selfManagedConnectionManager");
                            throw 0Q8.createAndThrow();
                        }
                        if (i9w3 != null) {
                            GTT gtt = (GTT) i9w3.A01.get(str);
                            if (gtt != null) {
                                int state2 = gtt.getState();
                                IDO.A00("onAnswerFromApp");
                                gtt.setActive();
                                gtt.setAudioModeIsVoip(true);
                                if (state2 != 4) {
                                    gtt.A00.A06(gtt.A01, 1);
                                }
                            }
                        }
                        11T.A0L("selfManagedConnectionManager");
                        throw 0Q8.createAndThrow();
                    }
                    iDc.A00 = A0j2.inCallState;
                }
            }
        }
        if (!this.A0D) {
            4zI.A03.A05("ViewProxyImpl", "Ignoring models for inactive call", new Object[0]);
            return;
        }
        A00(this, gyN, map);
        JFs jFs = this.A00;
        if (jFs != null) {
            jFs.C8s(gyN);
        }
    }
}
