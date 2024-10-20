package com.facebook.rtc.expression.activities.effect;

import X.08W;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1De;
import X.1Du;
import X.1FX;
import X.1Lm;
import X.2QO;
import X.4YU;
import X.53C;
import X.54D;
import X.7zL;
import X.7zM;
import X.7zS;
import X.8LW;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AbR;
import X.C00i;
import X.C06z;
import X.C0k4;
import X.C15h;
import X.GOo;
import X.GzJ;
import X.H9U;
import X.HAl;
import X.HCR;
import X.HD5;
import X.HFU;
import X.HZt;
import X.HsJ;
import X.IEo;
import X.IPz;
import X.IRl;
import X.IgB;
import X.J5u;
import X.JCp;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.expression.effect.interactive.metadata.InteractiveEffectMetadata;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.rtcactivity.RtcActivity;
import com.facebook.rtcactivity.interfaces.Version;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: RtcEffectActivityBuilder.class */
public final class RtcEffectActivityBuilder {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new 08W(RtcEffectActivityBuilder.class, "effectActivityBroadcaster", "<v#0>")};
    public final C00i effectActivityProvider;
    public JCp interactiveEffectRequestCallback;
    public final 1De kinjector;
    public final C15h viewerContextUserIdProvider;

    public RtcEffectActivityBuilder(1De r302) {
        11T.A0F(r302, 1);
        this.kinjector = r302;
        this.viewerContextUserIdProvider = J5u.A03(this, 76);
        this.effectActivityProvider = 7zM.A0h(r302, 1031);
    }

    public static final /* synthetic */ HZt access$buildActivity$lambda$0(1Br r301) {
        return (HZt) 1Br.A0B(r301);
    }

    public static final HZt buildActivity$lambda$0(1Br r301) {
        return (HZt) 1Br.A0B(r301);
    }

    public static /* synthetic */ void getInteractiveEffectRequestCallback$annotations() {
    }

    public ListenableFuture buildActivity(String str, Version version, String str2, Map map) {
        EffectItem effectItem;
        11T.A0F(str, 0);
        7zS.A16(1, version, str2, map);
        FbUserSession A0D = AbK.A0D(this.kinjector.A00);
        53C r0 = (53C) 1De.A00(this.kinjector, 114745);
        1Br A0S = 7zL.A0S(A0D, this.kinjector, 114831);
        1FX A0j = 4YU.A0j();
        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C0k4.A00(obj);
        String str3 = (String) obj;
        String A1C = AbH.A1C("raw_effect_id", map);
        if (!53C.A00(r0)) {
            Exception exc = new Exception();
            ((HD5) exc).mResponseContext = "NO_CAMERA_CORE";
            A0j.setException(exc);
            return A0j;
        }
        Iterator it = ((IgB) 4YU.A0n(A0D, this.kinjector, 114905)).A00().iterator();
        while (it.hasNext()) {
            ((RtcActivity) it.next()).finish();
        }
        1Du it2 = IPz.A00((IPz) A0S.get()).A04().iterator();
        while (true) {
            if (!it2.hasNext()) {
                effectItem = null;
                break;
            }
            effectItem = (EffectItem) it2.next();
            String str4 = ((BaseItem) effectItem).A09;
            if ((str4 != null && str4.equals(A1C)) || 11T.A0O(effectItem.A0X, str3)) {
                break;
            }
        }
        if (!((2QO) 4YU.A0n(A0D, this.kinjector, 99977)).BTq()) {
            A0j.set((Object) null);
            return A0j;
        }
        Context A00 = FbInjector.A00();
        11T.A0D(A00);
        8LW A01 = new 54D(A0D, A00).A01();
        if (A01 != null && GOo.A1X(A01)) {
            A0j.set((Object) null);
            return A0j;
        }
        if (((IEo) 4YU.A0n(A0D, this.kinjector, 100046)).A0F()) {
            A0j.set((Object) null);
            return A0j;
        }
        1Br A0S2 = 7zL.A0S(A0D, this.kinjector, 115410);
        IPz iPz = (IPz) A0S.get();
        if (effectItem == null) {
            iPz.A07(new HsJ(HAl.A0B, H9U.A03, GOo.A0k(new EnumMap(HCR.class)), (Integer) null, A1C));
            HZt hZt = (HZt) 1Br.A0B(A0S2);
            Integer num = 0S2.A01;
            Iterator it3 = hZt.A01.iterator();
            while (it3.hasNext()) {
                ((HFU) it3.next()).A00(str, num, (String) null);
            }
            Exception exc2 = new Exception();
            ((HD5) exc2).mResponseContext = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
            A0j.setException(exc2);
            return A0j;
        }
        if (!iPz.A0D(effectItem)) {
            ((IPz) A0S.get()).A0B(HAl.A06, effectItem, true);
            HZt hZt2 = (HZt) 1Br.A0B(A0S2);
            Integer num2 = 0S2.A00;
            InteractiveEffectMetadata interactiveEffectMetadata = effectItem.A0F;
            if (interactiveEffectMetadata == null) {
                throw 1BK.A0h();
            }
            String str5 = interactiveEffectMetadata.A00;
            Iterator it4 = hZt2.A01.iterator();
            while (it4.hasNext()) {
                ((HFU) it4.next()).A00(str, num2, str5);
            }
            Exception exc3 = new Exception();
            ((HD5) exc3).mResponseContext = "AVAILABLE_NOT_DOWNLOADED";
            A0j.setException(exc3);
            return A0j;
        }
        IRl iRl = new IRl(A0D, A0S2, effectItem, this, A0j, str, str2, str3, A1C);
        this.interactiveEffectRequestCallback = iRl;
        1Lm.A07(A0D, this.kinjector.A00, 114790);
        effectItem.A03();
        HZt hZt3 = (HZt) 1Br.A0B(iRl.A01);
        EffectItem effectItem2 = iRl.A02;
        InteractiveEffectMetadata interactiveEffectMetadata2 = effectItem2.A0F;
        if (interactiveEffectMetadata2 == null) {
            throw 1BK.A0h();
        }
        11T.A0F(interactiveEffectMetadata2.A00, 0);
        Iterator it5 = hZt3.A01.iterator();
        while (it5.hasNext()) {
            it5.next();
        }
        SettableFuture settableFuture = iRl.A04;
        RtcEffectActivityBuilder rtcEffectActivityBuilder = iRl.A03;
        AbR abR = (AbR) rtcEffectActivityBuilder.effectActivityProvider.get();
        String str6 = iRl.A06;
        String str7 = (String) rtcEffectActivityBuilder.viewerContextUserIdProvider.get();
        String str8 = iRl.A05;
        String str9 = iRl.A07;
        String str10 = iRl.A08;
        FbUserSession fbUserSession = iRl.A00;
        Context A012 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            GzJ gzJ = new GzJ(fbUserSession, abR, effectItem2, str6, str7, str8, str9, str10);
            1Bn.A0K();
            FbInjector.A04(A012);
            settableFuture.set(gzJ);
            return A0j;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }
}
