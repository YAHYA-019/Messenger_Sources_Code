package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.cameracore.fbspecific.voltron.FbVoltronModuleLoader;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Fcf.class */
public final class Fcf implements CallerContextable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager";
    public GEI A00;
    public String A01;
    public final F5l A04;
    public final ETX A05;
    public final FEZ A06;
    public final XplatEffectManager A08;
    public final EhV A09;
    public final EcP A0A;
    public final String A0B;
    public final ScheduledExecutorService A0C;
    public final List A0D;
    public final JHj A03 = new Fbo();
    public final GEI A02 = new Fbk();
    public final AREngineMaskEffectAdapter A07 = new Object();

    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, java.lang.Object] */
    public Fcf(Eyn eyn, F5l f5l, ETX etx, Ekr ekr, XplatEffectManager xplatEffectManager, EhV ehV, EcP ecP, FbVoltronModuleLoader fbVoltronModuleLoader, String str, List list, ScheduledExecutorService scheduledExecutorService) {
        this.A08 = xplatEffectManager;
        this.A0C = scheduledExecutorService;
        this.A05 = etx;
        this.A0D = list;
        this.A0B = str;
        this.A04 = f5l;
        this.A09 = ehV;
        this.A0A = ecP;
        this.A06 = new FEZ(eyn, etx, ekr, fbVoltronModuleLoader, scheduledExecutorService);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x046d, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0470, code lost:
    
        r0.add(r0);
        r334 = r334 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v315, types: [java.lang.Object, X.Eti] */
    /* JADX WARN: Type inference failed for: r0v327, types: [X.GEI] */
    /* JADX WARN: Type inference failed for: r0v328, types: [java.lang.Object, X.Eti] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.GEI A00(android.os.Handler r301, X.JHj r302, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter r303, X.Fcf r304, X.FEf r305, java.util.List r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 1657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fcf.A00(android.os.Handler, X.JHj, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, X.Fcf, X.FEf, java.util.List, boolean):X.GEI");
    }

    public static final void A01(JHj jHj, ERn eRn, Fcf fcf, FEf fEf) {
        F5l f5l = fcf.A04;
        if (!fEf.A02) {
            F5l.A00(f5l);
            JNI jni = f5l.A01;
            if (jni != null) {
                jni.endFail(jni.getInstanceIdWithString(16321564, fEf.A00), "ar_delivery", eRn.mType.ordinal(), 0Pz.A0W("Effect fetch failed, reason: ", eRn.getMessage() != null ? eRn.getMessage() : ""));
            }
        }
        jHj.BxX(eRn);
    }

    public void A02(JHj jHj, FEf fEf, List list) {
        1BK.A1M(list, fEf);
        A00(null, jHj, this.A07, this, fEf, list, false);
    }

    public void A03(String str) {
        GEI gei;
        11T.A0F(str, 0);
        if (!str.equals(this.A01) || (gei = this.A00) == null) {
            return;
        }
        gei.cancel();
        this.A00 = null;
        this.A01 = null;
    }

    public boolean A04(ARRequestAsset aRRequestAsset) {
        if (aRRequestAsset == null) {
            return false;
        }
        Preconditions.checkArgument(AnonymousClass001.A1W(aRRequestAsset.A02.A02, ARAssetType.EFFECT), "ARD operate publicly only at effect level", new Object[0]);
        return this.A08.isEffectCached(new XplatRemoteAsset(aRRequestAsset), false);
    }
}
