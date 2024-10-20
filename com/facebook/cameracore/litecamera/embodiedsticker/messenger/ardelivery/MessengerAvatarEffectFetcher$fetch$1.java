package com.facebook.cameracore.litecamera.embodiedsticker.messenger.ardelivery;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0DT;
import X.0Ds;
import X.0Dt;
import X.0KU;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.7zL;
import X.7zT;
import X.AbI;
import X.AnonymousClass001;
import X.C2069Dau;
import X.CxJ;
import X.DKF;
import X.EoY;
import X.F0S;
import X.F1A;
import X.F5c;
import X.FEf;
import X.Fbs;
import X.Fcf;
import X.Ffp;
import X.IMv;
import X.JCh;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestEffect;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: MessengerAvatarEffectFetcher$fetch$1.class */
public final class MessengerAvatarEffectFetcher$fetch$1 extends 0DO implements Function2 {
    public final /* synthetic */ FEf $arAnalyticsInfo;
    public final /* synthetic */ JCh $callback;
    public final /* synthetic */ String $effectId;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ F5c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerAvatarEffectFetcher$fetch$1(FbUserSession fbUserSession, JCh jCh, F5c f5c, FEf fEf, String str, 0DR r307) {
        super(2, r307);
        this.this$0 = f5c;
        this.$effectId = str;
        this.$fbUserSession = fbUserSession;
        this.$callback = jCh;
        this.$arAnalyticsInfo = fEf;
    }

    public final 0DR create(Object obj, 0DR r303) {
        MessengerAvatarEffectFetcher$fetch$1 messengerAvatarEffectFetcher$fetch$1 = new MessengerAvatarEffectFetcher$fetch$1(this.$fbUserSession, this.$callback, this.this$0, this.$arAnalyticsInfo, this.$effectId, r303);
        messengerAvatarEffectFetcher$fetch$1.L$0 = obj;
        return messengerAvatarEffectFetcher$fetch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Class<X.F1A>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.GEs, X.Ffp] */
    public final Object invokeSuspend(Object obj) {
        ARRequestEffect aRRequestEffect;
        F5c f5c;
        String str;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            0fH.A0j(F5c.A03, "Effect fetch started");
            aRRequestEffect = (ARRequestEffect) this.this$0.A00.A02(this.$effectId);
            if (aRRequestEffect == null) {
                f5c = this.this$0;
                str = this.$effectId;
                EoY eoY = (EoY) 1Br.A0B(f5c.A01);
                this.L$0 = f5c;
                this.L$1 = str;
                this.label = 1;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 0KU.A01;
                0KU r02 = new 0KU(0DT.A02(this));
                if (str == null) {
                    throw 1BK.A0h();
                }
                ?? r03 = F1A.class;
                try {
                    r03 = (Ffp) DKF.A0n((Class) r03);
                    GraphQlQueryParamSet graphQlQueryParamSet = r03.A01;
                    graphQlQueryParamSet.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    r03.A03 = true;
                    graphQlQueryParamSet.A01(F0S.A00(7zL.A09(), (CxJ) 1Br.A0B(eoY.A00)), "device_capabilities");
                    r03.A02 = true;
                    AbI.A0o(eoY.A02).A04(new C2069Dau(eoY, r02, 2), 7zT.A09(eoY.A01).A09(r03.ACe()), "task key");
                    obj = r02.A00();
                    if (obj == r0) {
                        return r0;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    throw AnonymousClass001.A0U(r03);
                }
            }
            FbUserSession fbUserSession = this.$fbUserSession;
            JCh jCh = this.$callback;
            FEf fEf = this.$arAnalyticsInfo;
            Fcf Aiw = ((Fbs) 1Lm.A06(fbUserSession, 100284)).Aiw();
            ARRequestAsset aRRequestAsset = aRRequestEffect.A02;
            Aiw.A02(new IMv(aRRequestAsset, jCh), fEf, 11T.A03(aRRequestAsset));
            return 04S.A00;
        }
        if (i != 1) {
            throw AnonymousClass001.A0M();
        }
        str = this.L$1;
        f5c = (F5c) this.L$0;
        0Dt.A00(obj);
        aRRequestEffect = (ARRequestEffect) obj;
        String str2 = F5c.A03;
        f5c.A00.A04(str, aRRequestEffect);
        FbUserSession fbUserSession2 = this.$fbUserSession;
        JCh jCh2 = this.$callback;
        FEf fEf2 = this.$arAnalyticsInfo;
        Fcf Aiw2 = ((Fbs) 1Lm.A06(fbUserSession2, 100284)).Aiw();
        ARRequestAsset aRRequestAsset2 = aRRequestEffect.A02;
        Aiw2.A02(new IMv(aRRequestAsset2, jCh2), fEf2, 11T.A03(aRRequestAsset2));
        return 04S.A00;
    }
}
