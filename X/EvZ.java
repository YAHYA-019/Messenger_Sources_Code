package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.effectmetadatamanager.models.EffectAssetMetadata;
import com.facebook.cameracore.ardelivery.effectmetadatamanager.models.EffectAssetMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.effectmetadatamanager.models.EffectAssetMetadataWithLastFetchTimestamp;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: EvZ.class */
public final class EvZ {
    public final long A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final C0dp A03;
    public final 1Ve A04;
    public final GKc A05;
    public final Gson A06 = new Gson();
    public final java.util.Map A07 = DKD.A13();
    public final Executor A08;
    public final ETX A09;

    public EvZ(Context context, ETX etx, C0dp c0dp, 1Ve r305, GKc gKc, Executor executor) {
        this.A01 = context;
        this.A04 = r305;
        this.A08 = executor;
        this.A03 = c0dp;
        this.A09 = etx;
        this.A05 = gKc;
        this.A02 = context.getSharedPreferences("asset_metadata_sharedpref_key", 0);
        this.A00 = ((C2051Daa) etx).A01.Auy(36598039099543418L);
        SharedPreferences sharedPreferences = this.A02;
        java.util.Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long now = this.A03.now();
        Iterator A0y = AnonymousClass001.A0y(all);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object A04 = this.A06.A04(1BK.A16(A0z), EffectAssetMetadataWithLastFetchTimestamp.class);
            A04.getClass();
            if (((EffectAssetMetadataWithLastFetchTimestamp) A04).lastFetchTimestamp + this.A00 <= now) {
                edit.remove(AnonymousClass001.A0j(A0z));
            } else {
                this.A07.put(A0z.getKey(), A04);
            }
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.Ffo] */
    public void A00(EffectAssetMetadataCompletionCallback effectAssetMetadataCompletionCallback, String str) {
        ImmutableList of = ImmutableList.of((Object) str);
        F4l f4l = new F4l(this, effectAssetMetadataCompletionCallback);
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0v = AnonymousClass001.A0v();
        1Du it = of.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            EffectAssetMetadataWithLastFetchTimestamp effectAssetMetadataWithLastFetchTimestamp = (EffectAssetMetadataWithLastFetchTimestamp) this.A07.get(next);
            if (effectAssetMetadataWithLastFetchTimestamp == null || effectAssetMetadataWithLastFetchTimestamp.lastFetchTimestamp + this.A00 <= this.A03.now()) {
                A0v.add(next);
            } else {
                A0s.add(effectAssetMetadataWithLastFetchTimestamp.assetMetadata);
            }
        }
        0fH.A0a(1BK.A0k(of), 1BK.A0k(A0s), 1BK.A0k(A0v), "GraphqlMetadataManager", "total #: %d cacheHit #: %d cacheMiss #: %d");
        if (A0v.isEmpty()) {
            boolean isEmpty = A0s.isEmpty();
            EffectAssetMetadataCompletionCallback effectAssetMetadataCompletionCallback2 = f4l.A01;
            if (isEmpty) {
                effectAssetMetadataCompletionCallback2.onFail("result list is empty");
                return;
            } else {
                effectAssetMetadataCompletionCallback2.onSuccess((EffectAssetMetadata) 1BK.A0r(A0s));
                return;
            }
        }
        ?? r0 = F17.class;
        try {
            r0 = (Ffo) DKE.A0p((Class) r0, "create", 0);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0v);
            GraphQlQueryParamSet graphQlQueryParamSet = r0.A01;
            graphQlQueryParamSet.A06("ids", copyOf);
            r0.A03 = AnonymousClass001.A1T(copyOf);
            graphQlQueryParamSet.A01(F0S.A00(this.A01, this.A05), "device_capabilities");
            r0.A02 = true;
            C3s4 ACe = r0.ACe();
            FfO ffO = new FfO(this, f4l, 0);
            this.A04.ARJ(ffO, new FfW(0, f4l, this, A0s, ffO), ACe, this.A08);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }
}
