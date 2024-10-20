package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.presence.DefaultPresenceManager;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rtc.activities.integrityprecall.MinorSafetyNoticeActivity;
import com.facebook.rtc.interfaces.RtcCallStartParams;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.5V0, reason: invalid class name */
/* loaded from: 5V0.class */
public final class C5V0 {
    public final 1De A00;
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
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 5VC A0O;
    public final 5V4 A0P;

    public C5V0(1De r302) {
        this.A00 = r302;
        1Br A00 = 1Bq.A00(49755);
        this.A0M = A00;
        this.A0P = ((C5V1) A00.A00.get()).A00();
        this.A05 = 1Bq.A00(16449);
        this.A0I = 1Bq.A00(116294);
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 83719);
        this.A0H = 1Bq.A00(6);
        this.A0J = 1Bq.A00(67637);
        this.A0A = 1Bq.A00(65723);
        this.A06 = 1Bq.A00(33013);
        this.A02 = 1Bu.A03(r0, 84458);
        this.A07 = 1Bq.A00(16922);
        this.A0G = 1Bu.A03(r0, 115449);
        this.A0L = 1Bu.A03(r0, 99982);
        this.A08 = 1Bu.A03(r0, 68337);
        this.A0B = 1Bq.A00(115641);
        this.A0K = 1Bq.A00(16432);
        this.A0E = 1Bu.A03(r0, 82140);
        this.A0D = 1Bu.A03(r0, 82591);
        this.A0F = 1Bu.A03(r0, 115685);
        this.A0C = 1Bu.A03(r0, 115368);
        this.A01 = 1Bu.A03(r0, 115769);
        this.A0N = 1Bq.A00(16923);
        this.A09 = 1Bq.A00(16385);
        this.A04 = 1Bq.A00(115633);
        this.A0O = new 5VB(this);
    }

    public static final long A00(FbUserSession fbUserSession, RtcCallStartParams rtcCallStartParams) {
        ThreadKey threadKey = rtcCallStartParams.A01;
        if (threadKey != null && threadKey.A18()) {
            return 1L;
        }
        String str = ((1G1) fbUserSession).A02;
        new HashSet(rtcCallStartParams.A04).remove(str);
        return r0.size();
    }

    private final 1FX A01(Context context, FbUserSession fbUserSession, RtcCallStartParams rtcCallStartParams) {
        I7M.A01((I7M) this.A0F.A00.get()).BGd(rtcCallStartParams.A09).Bct("RtcLauncher_startMultiwayCallInternal", (String) null);
        CHU chu = (CHU) 1Lo.A04(context, fbUserSession, (1BY) null, 83871);
        ImmutableList immutableList = rtcCallStartParams.A04;
        11T.A0A(immutableList);
        ThreadKey threadKey = rtcCallStartParams.A01;
        if (!chu.A01(threadKey, immutableList)) {
            return A02(context, fbUserSession, this, rtcCallStartParams);
        }
        4zI.A03.A05("RtcLauncherImpl", "getFutureForMultiwayCallInternalForJoinerTransparency", AnonymousClass001.A1Z());
        SettableFuture A0j = 4YU.A0j();
        BvP bvP = new BvP(context, fbUserSession, this, rtcCallStartParams, A0j);
        CHU chu2 = (CHU) 1Lo.A04(context, fbUserSession, (1BY) null, 83871);
        String str = rtcCallStartParams.A0H;
        11T.A0A(str);
        if (!chu2.A01(threadKey, immutableList)) {
            A0j.setFuture(A02(context, fbUserSession, this, rtcCallStartParams));
            return A0j;
        }
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        if (threadKey.A15()) {
            ((F8z) 1Bi.A03(98521)).A02(context, new AmV(threadKey, bvP, chu2), new DqI("com.bloks.www.rp_wellbeing.precall_interstitial.router", 4, 04R.A09(new 03Y[]{1BK.A1G("thread_id", String.valueOf(threadKey.A04)), 1BK.A1G("thread_type", String.valueOf(ThreadKey.A00(threadKey.A06))), 1BK.A1G("entry_point", CBN.A00(str)), 1BK.A1G("location", CBN.A01(str)), 1BK.A1G("is_playground", "false"), 1BK.A1G("has_seen_pw", String.valueOf(CHU.A00(chu2.A02, threadKey, chu2)))})), 04R.A0G());
            return A0j;
        }
        chu2.A01 = 4YU.A0z(threadKey);
        chu2.A00 = bvP;
        C08d A06 = ((08O) 1Br.A0B(chu2.A07)).A06();
        new FbFragmentActivity();
        Intent putExtra = C3o5.A0D(context, MinorSafetyNoticeActivity.class).putExtra("thread_key", threadKey).putExtra("trigger", str).putExtra("has_seen_pw", CHU.A00(chu2.A02, threadKey, chu2));
        11T.A0A(putExtra);
        A06.A0A(context, putExtra);
        return A0j;
    }

    public static final 2eH A02(Context context, FbUserSession fbUserSession, C5V0 c5v0, RtcCallStartParams rtcCallStartParams) {
        4zI.A03.A05("RtcLauncherImpl", "getFutureForMultiwayCallInternal", new Object[0]);
        2JS A01 = ((2JN) 1Lm.A05(context, fbUserSession, 33088)).A01();
        2JQ r0 = CallModel.CONVERTER;
        11T.A0B(r0);
        CallModel callModel = (CallModel) A01.A02(r0);
        if (callModel == null || callModel.inCallState != 2) {
            c5v0.A08(fbUserSession, rtcCallStartParams);
        }
        1Br A00 = 1Lm.A00(context, fbUserSession, 115096);
        ImmutableList immutableList = rtcCallStartParams.A04;
        11T.A0A(immutableList);
        String str = rtcCallStartParams.A0E;
        11T.A0A(str);
        boolean A0A = A0A(c5v0, A06(immutableList));
        boolean A07 = ((5SR) c5v0.A0J.A00.get()).A07(immutableList);
        I9T i9t = (I9T) 1Lm.A07(fbUserSession, c5v0.A00.A00, 115096);
        i9t.A05(str, 14, A0A);
        i9t.A05(str, 13, A07);
        return 2FP.A00(new InA(context, fbUserSession, A00, c5v0, rtcCallStartParams), A05(fbUserSession, rtcCallStartParams.A01, (CEf) 1Lm.A05(context, fbUserSession, 82767), rtcCallStartParams), (Executor) c5v0.A0K.A00.get());
    }

    public static final ListenableFuture A03(Context context, FbUserSession fbUserSession, C5V0 c5v0, RtcCallStartParams rtcCallStartParams) {
        I7M.A01((I7M) c5v0.A0F.A00.get()).BGd(rtcCallStartParams.A09).Bct("RtcLauncher_startDirectCallForResult", (String) null);
        I9T i9t = (I9T) 1Lm.A05(context, fbUserSession, 115096);
        String str = rtcCallStartParams.A0E;
        11T.A0A(str);
        i9t.A03(str, 5);
        i9t.A05(str, 18, rtcCallStartParams.A0M);
        Bvt bvt = (Bvt) c5v0.A02.A00.get();
        long j = rtcCallStartParams.A00;
        ((Executor) bvt.A04.A00.get()).execute(new D9m(fbUserSession, bvt, ThreadKey.A0S(rtcCallStartParams.A01) ? "ARMADILLO_RTC" : "RTC", j));
        ImmutableList of = ImmutableList.of((Object) String.valueOf(j));
        I4B i4b = new I4B(rtcCallStartParams);
        i4b.A04 = of;
        C1pq.A08("allParticipants", of);
        i4b.A06 = of;
        C1pq.A08(GOm.A00(317), of);
        return A04(context, fbUserSession, c5v0, new RtcCallStartParams(i4b));
    }

    public static final ListenableFuture A04(Context context, FbUserSession fbUserSession, C5V0 c5v0, RtcCallStartParams rtcCallStartParams) {
        JMR jmr;
        if (rtcCallStartParams.A0K || rtcCallStartParams.A00() == 0S2.A00) {
            jmr = null;
            Long l = rtcCallStartParams.A09;
            if (l != null) {
                jmr = I7M.A01((I7M) c5v0.A0F.A00.get()).BGd(l);
                jmr.Bct("RtcLauncher_startMultiwayCall", (String) null);
            }
        } else {
            1Br.A0C(c5v0.A0C);
            JOY A01 = I7M.A01((I7M) 1Br.A0B(c5v0.A0F));
            11T.A0F(A01, 0);
            jmr = A01.D23(true, (String) null, true, rtcCallStartParams.A0M);
            I4B i4b = new I4B(rtcCallStartParams);
            i4b.A09 = Long.valueOf(jmr.BGc());
            rtcCallStartParams = new RtcCallStartParams(i4b);
        }
        String str = rtcCallStartParams.A0E;
        11T.A0A(str);
        IEA iea = (IEA) 1Lo.A04(context, fbUserSession, (1BY) null, 115612);
        iea.A05(rtcCallStartParams.A01, rtcCallStartParams.A0M);
        IZI izi = (JOJ) 1Lo.A04(context, fbUserSession, (1BY) null, 83902);
        String str2 = rtcCallStartParams.A0H;
        11T.A0A(str2);
        Integer A00 = rtcCallStartParams.A00();
        11T.A0A(A00);
        ImmutableList immutableList = rtcCallStartParams.A04;
        11T.A0A(immutableList);
        boolean A0A = A0A(c5v0, A06(immutableList));
        boolean A07 = ((5SR) c5v0.A0J.A00.get()).A07(immutableList);
        IZI izi2 = izi;
        ImmutableMap A002 = IZI.A00(A00, str2, A0A, A07);
        IZI.A01(izi2);
        IZI.A02(izi2, "ENGINE", "START_OUTGOING_MWS_CALL", A002);
        IZI.A02(izi2, "MWS", "START_OUTGOING_MWS_CALL", A002);
        c5v0.A08(fbUserSession, rtcCallStartParams);
        1FX A012 = c5v0.A01(context, fbUserSession, rtcCallStartParams);
        1Kd.A0F(new InM(1Lm.A00(context, fbUserSession, 115096), iea, jmr, str), A012, (Executor) c5v0.A0K.A00.get());
        return A012;
    }

    public static final ListenableFuture A05(FbUserSession fbUserSession, ThreadKey threadKey, CEf cEf, RtcCallStartParams rtcCallStartParams) {
        2eH A00;
        int i = 2;
        11T.A0F(cEf, 2);
        String str = ((1G1) fbUserSession).A02;
        String str2 = rtcCallStartParams.A0D;
        if (threadKey == null) {
            long j = rtcCallStartParams.A00;
            if (j > 0) {
                threadKey = ThreadKey.A0H(j, Long.parseLong(str));
            } else {
                if (str2 == null) {
                    ListenableFuture listenableFuture = 1hM.A01;
                    11T.A0D(listenableFuture);
                    return listenableFuture;
                }
                threadKey = ThreadKey.A08(Long.parseLong(str2));
            }
        }
        if (CEf.A00(threadKey, cEf)) {
            if (ThreadKey.A0j(threadKey)) {
                A00 = ((C87) cEf.A00.A00.get()).A01(threadKey.A02);
            } else if (ThreadKey.A0f(threadKey)) {
                A00 = ((C87) 1Br.A0B(cEf.A00)).A00(threadKey.A04);
                i = 3;
            }
            return 2FP.A00(new D40(threadKey, i), A00, 1JU.A01);
        }
        return new 1hM(threadKey);
    }

    public static final ArrayList A06(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new UserKey(1Js.A03, (String) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x03b4, code lost:
    
        if (r0.A0c == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(com.facebook.auth.usersession.FbUserSession r301, X.C5V0 r302, com.facebook.rtc.interfaces.RtcCallStartParams r303) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5V0.A07(com.facebook.auth.usersession.FbUserSession, X.5V0, com.facebook.rtc.interfaces.RtcCallStartParams):void");
    }

    private final void A08(FbUserSession fbUserSession, RtcCallStartParams rtcCallStartParams) {
        ((1GU) 1Bi.A03(16458)).Ciz(new J1A(1Lm.A03(fbUserSession, this.A00.A00, 115096), rtcCallStartParams, A00(fbUserSession, rtcCallStartParams)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r0.A04() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A09(X.C5V0 r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r302 = r0
            r0 = r302
            boolean r0 = X.4vY.A01(r0)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L48
            r0 = r301
            X.1Br r0 = r0.A0I
            X.00i r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.1qC r0 = (X.1qC) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4a
            r0 = r302
            int r0 = r0.A04()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4a
        L48:
            r0 = 0
            r304 = r0
        L4a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5V0.A09(X.5V0):boolean");
    }

    public static final boolean A0A(C5V0 c5v0, List list) {
        1XZ r0 = (1XZ) c5v0.A0A.A00.get();
        11T.A0I(list, "null cannot be cast to non-null type kotlin.collections.Collection<com.facebook.user.model.UserKey>");
        DefaultPresenceManager defaultPresenceManager = (DefaultPresenceManager) r0;
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (defaultPresenceManager.BX3((UserKey) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x036a, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v253, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture A0B(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.C9b r304) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5V0.A0B(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.C9b):com.google.common.util.concurrent.ListenableFuture");
    }

    public void A0C() {
        ((6No) this.A0L.A00.get()).A01();
    }

    public void A0D(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ImmutableList immutableList, String str, String str2, String str3, String str4, boolean z) {
        4zJ r314;
        Object[] objArr;
        String str5;
        String str6 = str;
        boolean A1X = 1BL.A1X(context, threadKey);
        11T.A0F(fbUserSession, 8);
        if (ThreadKey.A0X(threadKey)) {
            if (str == null) {
                str6 = 1BK.A0w(threadKey);
            }
            Integer num = 0S2.A0C;
            if (immutableList != null) {
                JQN D1o = I7M.A01((I7M) 1Br.A0B(this.A0F)).D1o(Boolean.valueOf(A1X), z);
                IEA iea = (IEA) 1Lo.A04(context, fbUserSession, (1BY) null, 115612);
                iea.A05(threadKey, z);
                I4B i4b = new I4B();
                String A0t = 1BK.A0t();
                i4b.A0E = A0t;
                C1pq.A08("loggingTraceId", A0t);
                i4b.A0H = str3;
                C1pq.A08("trigger", str3);
                i4b.A0M = z;
                i4b.A0D = str6;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) immutableList);
                i4b.A04 = copyOf;
                C1pq.A08("allParticipants", copyOf);
                i4b.A00(num);
                i4b.A0G = str2;
                i4b.A0F = str4;
                i4b.A01(BXo.A00(str3));
                i4b.A09 = Long.valueOf(D1o.BGc());
                i4b.A01 = threadKey;
                RtcCallStartParams rtcCallStartParams = new RtcCallStartParams(i4b);
                IZI izi = (JOJ) 1Lo.A04(context, fbUserSession, (1BY) null, 83902);
                HashMap A00 = HKp.A00(new String[]{"trigger", str3, "videoCall", String.valueOf(z)});
                IZI izi2 = izi;
                IZI.A01(izi2);
                IZI.A02(izi2, "ENGINE", "JOIN_CALL", A00);
                IZI.A02(izi2, "MWS", "JOIN_CALL", A00);
                1Br.A0D(this.A0K, new Ine(iea, D1o, 3), A01(context, fbUserSession, rtcCallStartParams));
                return;
            }
            r314 = 4zI.A03;
            objArr = new Object[0];
            str5 = "Cannot join multiway call due to null participants list";
        } else {
            r314 = 4zI.A03;
            objArr = new Object[]{threadKey.A0u()};
            str5 = "Ignoring startGroupCallFlow because threadKey is not a group thread key: %s";
        }
        r314.A06("RtcLauncherImpl", str5, objArr);
    }

    public void A0E(FbUserSession fbUserSession, RtcCallStartParams rtcCallStartParams) {
        int i;
        11T.A0F(rtcCallStartParams, 0);
        11T.A0F(fbUserSession, 1);
        I7M.A01((I7M) this.A0F.A00.get()).BGd(rtcCallStartParams.A09).Bct("RtcLauncher_startMultiwayAfterZeroRatingCheck", (String) null);
        IDc iDc = (IDc) 1Lo.A04((Context) null, fbUserSession, this.A00.A00, 85223);
        if (!iDc.A08) {
            A07(fbUserSession, this, rtcCallStartParams);
            return;
        }
        IfQ ifQ = new IfQ(fbUserSession, this, rtcCallStartParams);
        boolean z = rtcCallStartParams.A0M;
        String str = rtcCallStartParams.A0E;
        11T.A0A(str);
        IDO ido = IDO.A00;
        IDO.A01(GOm.A00(ActionId.APP_DID_ENTER_BACKGROUND), "startOutgoingCall");
        IDc.A01(iDc);
        String A0t = 1BK.A0t();
        11T.A0A(A0t);
        iDc.A05 = ifQ;
        IDc.A02(str, false);
        String str2 = (String) iDc.A0F.invoke(str, A0t);
        I9W i9w = iDc.A03;
        if (i9w == null) {
            11T.A0L("selfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        PhoneAccountHandle phoneAccountHandle = iDc.A02;
        if (phoneAccountHandle == null) {
            throw 1BK.A0h();
        }
        11T.A0F(str2, 0);
        TelecomManager telecomManager = i9w.A00;
        if (telecomManager.isOutgoingCallPermitted(phoneAccountHandle)) {
            Uri fromParts = Uri.fromParts("fb-messenger", A0t, null);
            Bundle A05 = 1BK.A05();
            if (z) {
                A05.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
            }
            Bundle A052 = 1BK.A05();
            A052.putString("call_id", str2);
            A052.putString("CALL_APP", "rp_parties");
            A052.putInt("UI_CAPABILITY_BITMASK", 7);
            A05.putParcelable("android.telecom.extra.OUTGOING_CALL_EXTRAS", A052);
            A05.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
            telecomManager.placeCall(fromParts, A05);
            ido.A03(GOm.A00(43), "Placed call through Telecom Manager", (Throwable) null);
            i = 0;
        } else {
            IDO.A01(GOm.A00(43), 0Pz.A0W("Outgoing call not permitted for this Phone Account Handle: ", phoneAccountHandle.getId()));
            i = 1;
        }
        IDc.A00(ifQ, iDc, str2, str, i, false);
    }

    public void A0F(FbUserSession fbUserSession, RtcCallStartParams rtcCallStartParams) {
        11T.A0F(rtcCallStartParams, 0);
        11T.A0F(fbUserSession, 1);
        4zI.A03.A05("RtcLauncherImpl", "startMultiwayCallAfterPermissionCheck -> shouldEnableAsyncForTLCThreadKeyResolution start", new Object[0]);
        CEf cEf = (CEf) 1Lo.A04((Context) null, fbUserSession, this.A00.A00, 82767);
        this.A03.A00.get();
        1Kd.A0F(new Inc(2, rtcCallStartParams, fbUserSession, this), A05(fbUserSession, rtcCallStartParams.A01, cEf, rtcCallStartParams), (Executor) this.A0K.A00.get());
    }

    public void A0G(FbUserSession fbUserSession, String str, boolean z) {
        11T.A0F(fbUserSession, 2);
        1BY r0 = this.A00.A00;
        2JS A01 = ((2JN) 1Lo.A04((Context) null, fbUserSession, r0, 33088)).A01();
        2JQ r02 = State.CONVERTER;
        11T.A0B(r02);
        ((IRF) 1Lo.A04((Context) null, fbUserSession, r0, 99979)).A0u(((State) A01.A01(r02)).localCallId, z, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (A09(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0H(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0I(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1a
            r0 = r301
            boolean r0 = A09(r0)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5V0.A0H(com.facebook.auth.usersession.FbUserSession):boolean");
    }

    public boolean A0I(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        boolean z = false;
        if (((2QO) 1Lo.A04((Context) null, fbUserSession, this.A00.A00, 99977)).A00 != 0) {
            z = true;
        }
        return z;
    }
}
