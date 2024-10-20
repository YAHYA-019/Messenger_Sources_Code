package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: I98.class */
public final class I98 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final LinkedBlockingQueue A06;
    public final FbUserSession A07;
    public final 1BP A08;
    public final 1De A09;

    public I98(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        this.A07 = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Bu.A03(r0, 115492);
        this.A05 = 1Bu.A03(r0, 16430);
        this.A08 = FbInjector.A00;
        this.A00 = 1Bq.A00(98707);
        this.A03 = 1BK.A0E();
        this.A01 = 7zM.A0d();
        this.A02 = 1Bu.A03(r0, 82592);
        this.A06 = new LinkedBlockingQueue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.I4D A00(X.GJJ r301, X.I2f r302, X.HAu r303, X.I98 r304, com.facebook.messaging.montage.model.art.EffectItem r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I98.A00(X.GJJ, X.I2f, X.HAu, X.I98, com.facebook.messaging.montage.model.art.EffectItem, java.lang.String):X.I4D");
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public static final void A01(I98 i98) {
        ?? A0j;
        HhQ hhQ = (HhQ) i98.A06.peek();
        EffectItem effectItem = hhQ.A02;
        Inh inh = new Inh(4, effectItem, i98, hhQ.A01);
        H9C h9c = effectItem.A0G;
        if (h9c == null || h9c.ordinal() != 0) {
            return;
        }
        Hq5 hq5 = (Hq5) 1Br.A0B(i98.A04);
        JCf jCf = hhQ.A00;
        boolean z = hhQ.A04;
        String str = hhQ.A03;
        FbUserSession fbUserSession = i98.A07;
        synchronized (hq5) {
            boolean A00 = GOp.A0N(hq5.A01).A00(fbUserSession);
            if (effectItem.A04(A00) == null) {
                throw AnonymousClass001.A0L("The effect is not a mask.");
            }
            String str2 = ((BaseItem) effectItem).A09;
            11T.A0A(str2);
            A0j = 4YU.A0j();
            hq5.A04.put(str2, HAR.A03);
            ((HqD) 1Br.A0B(hq5.A00)).A00(new IMq(jCf, hq5, effectItem, (SettableFuture) A0j, str, str2, z, A00));
        }
        1Kd.A0E(inh, (ListenableFuture) A0j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ab, code lost:
    
        if (r303 != X.HAR.A02) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.HAR A02(com.facebook.messaging.montage.model.art.EffectItem r302) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I98.A02(com.facebook.messaging.montage.model.art.EffectItem):X.HAR");
    }

    public final void A03(JCf jCf, I2f i2f, HAu hAu, JIU jiu, EffectItem effectItem, String str) {
        Fcf fcf;
        1Ql A08 = 1Br.A08(this.A03);
        A08.CaH(IQp.A0F, 1Br.A00(this.A01));
        A08.commit();
        ImmutableList A04 = effectItem.A04(GOp.A0N(this.A02).A00(this.A07));
        boolean z = effectItem.A0n;
        if (z || !(A04 == null || A04.isEmpty())) {
            if (effectItem.A0D == null) {
                if (A04 == null || A04.isEmpty()) {
                    return;
                }
                ((Hq5) 1Br.A0B(this.A04)).A00(jCf, new IN0(i2f, hAu, jiu, this, effectItem, str), A04, str, z);
                return;
            }
            HfW hfW = ((Hq5) 1Br.A0B(this.A04)).A06;
            if (hfW == null || (fcf = hfW.A02) == null) {
                throw AnonymousClass001.A0N("CameraCoreEffectManager should have been initialized.");
            }
            I4D A00 = A00(new Fbi(fcf), i2f, hAu, this, effectItem, str);
            if (A00 != null) {
                jiu.Bve(effectItem, A00);
            } else {
                jiu.Bvc("MsqrdConfig is not created.");
            }
        }
    }

    public final boolean A04(JCf jCf, JIT jit, EffectItem effectItem, String str, boolean z) {
        int ordinal = A02(effectItem).ordinal();
        if (ordinal == 4) {
            Hq5 hq5 = (Hq5) 1Br.A0B(this.A04);
            IWC iwc = new IWC(jCf, jit, this, effectItem, str, z);
            synchronized (hq5) {
                if (hq5.A06 != null) {
                    iwc.Bzy();
                } else {
                    hq5.A03.add(iwc);
                }
            }
            return false;
        }
        if (ordinal != 0) {
            if (ordinal != 3) {
                return false;
            }
            DKE.A0K(this.A05).post(new IwO(jit, effectItem));
            return false;
        }
        if (effectItem == null) {
            throw 1BK.A0h();
        }
        HhQ hhQ = new HhQ(jCf, jit, effectItem, str, z);
        LinkedBlockingQueue linkedBlockingQueue = this.A06;
        linkedBlockingQueue.add(hhQ);
        if (linkedBlockingQueue.size() == 1) {
            A01(this);
        }
        return true;
    }
}
