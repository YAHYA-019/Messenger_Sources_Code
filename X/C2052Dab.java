package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dab, reason: case insensitive filesystem */
/* loaded from: Dab.class */
public final class C2052Dab extends XplatEffectManagerCompletionCallback {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ JHj A01;
    public final /* synthetic */ ARRequestAsset A02;
    public final /* synthetic */ AREngineMaskEffectAdapter A03;
    public final /* synthetic */ Fcf A04;
    public final /* synthetic */ FEf A05;
    public final /* synthetic */ ListenableFuture A06;

    public C2052Dab(Handler handler, JHj jHj, ARRequestAsset aRRequestAsset, AREngineMaskEffectAdapter aREngineMaskEffectAdapter, Fcf fcf, FEf fEf, ListenableFuture listenableFuture) {
        this.A06 = listenableFuture;
        this.A05 = fEf;
        this.A04 = fcf;
        this.A01 = jHj;
        this.A00 = handler;
        this.A03 = aREngineMaskEffectAdapter;
        this.A02 = aRRequestAsset;
    }

    public final void A00(XplatModelPaths xplatModelPaths, FEf fEf, File file, List list, List list2) {
        Object obj;
        if (!fEf.A02) {
            Fcf fcf = this.A04;
            fcf.A00 = null;
            fcf.A01 = null;
        }
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (obj2 != null && (obj = list2.get(i)) != null) {
                A0u.put(obj2, obj);
            }
            i = i2;
        }
        AREngineMaskEffectAdapter aREngineMaskEffectAdapter = this.A03;
        ARRequestAsset aRRequestAsset = this.A02;
        HOl hOl = new HOl(A0u);
        String str = fEf.A01;
        String str2 = fEf.A00;
        Hpi aREngineEffect = aREngineMaskEffectAdapter.toAREngineEffect(file, xplatModelPaths, hOl, aRRequestAsset, str, str2);
        F5l f5l = this.A04.A04;
        if (!fEf.A02) {
            F5l.A00(f5l);
            JNI jni = f5l.A01;
            if (jni != null) {
                jni.markPoint(jni.getInstanceIdWithString(16321564, str2), 1, str2);
            }
        }
        EUz.A00(this.A00, new G20(this.A01, aREngineEffect));
    }

    @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback
    public void onFail(String str) {
        EUz.A00(this.A00, new G4w(this.A01, this.A04, this.A05, str));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.Eti] */
    @Override // com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback
    public void onSuccess(String str, XplatModelPaths xplatModelPaths, List list, List list2) {
        List list3 = list2;
        List list4 = list;
        11T.A0H(str, xplatModelPaths);
        File A0E = AnonymousClass001.A0E(str);
        if (!A0E.exists()) {
            onFail("[ARD][%s] Effect file not found after successful xplat fetch completion.");
            return;
        }
        try {
            ListenableFuture listenableFuture = this.A06;
            if (listenableFuture.isDone()) {
                Object obj = listenableFuture.get();
                11T.A0A(obj);
                if (AnonymousClass001.A1V(obj)) {
                    if (list == null) {
                        list4 = C0ty.A00;
                    }
                    if (list2 == null) {
                        list3 = C0ty.A00;
                    }
                    A00(xplatModelPaths, this.A05, A0E, list4, list3);
                    return;
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Fcf fcf = this.A04;
            ScheduledExecutorService scheduledExecutorService = fcf.A0C;
            1Kd.A0F(new FwE(this.A00, this.A01, this, fcf, xplatModelPaths, this.A05, A0E, list4, list3), 1Kd.A09(listenableFuture, scheduledExecutorService, timeUnit, 20), scheduledExecutorService);
        } catch (InterruptedException | ExecutionException e) {
            Fcf fcf2 = this.A04;
            JHj jHj = this.A01;
            FEf fEf = this.A05;
            ?? obj2 = new Object();
            obj2.A00 = ENM.A0Q;
            obj2.A02 = e;
            Fcf.A01(jHj, obj2.A00(), fcf2, fEf);
        }
    }
}
