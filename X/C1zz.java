package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.1zz, reason: invalid class name */
/* loaded from: 1zz.class */
public final class C1zz {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.201, java.lang.Object] */
    public static final AnonymousClass201 A00() {
        03W r0 = 03W.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0F(r0, 1);
        ?? obj = new Object();
        obj.A01 = r0;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.201, java.lang.Object] */
    public static final AnonymousClass201 A01(HeterogeneousMap heterogeneousMap) {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        java.util.Map map = heterogeneousMap.A00;
        11T.A0F(map, 1);
        ?? obj = new Object();
        obj.A01 = map;
        return obj;
    }

    public static final HeterogeneousMap A02() {
        HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
        11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
        return heterogeneousMap;
    }
}
