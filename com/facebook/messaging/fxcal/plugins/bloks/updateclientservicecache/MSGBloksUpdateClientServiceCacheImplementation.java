package com.facebook.messaging.fxcal.plugins.bloks.updateclientservicecache;

import X.02J;
import X.11T;
import X.1BK;
import X.1Lm;
import X.7zL;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C0ty;
import X.C1A3;
import X.DKC;
import X.DKc;
import X.ETx;
import X.EUl;
import X.FA0;
import X.FEK;
import X.FGT;
import X.FGb;
import X.FHh;
import X.GJj;
import X.Rax;
import X.Rb0;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksUpdateClientServiceCacheImplementation.class */
public final class MSGBloksUpdateClientServiceCacheImplementation {
    public final Context A00;
    public final CallerContext A01;

    public MSGBloksUpdateClientServiceCacheImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = CallerContext.A0B("MSGBloksUpdateClientServiceCacheImplementation");
    }

    public final Object A00(FHh fHh, DKc dKc) {
        IllegalStateException A0g;
        boolean z;
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        11T.A0I(A10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List<Map> list = (List) A10;
        GJj A02 = FGb.A02(dKc.A00, 1);
        ETx eTx = (ETx) 1Lm.A05(this.A00, EUl.A00(fHh), 82330);
        try {
            11T.A0F(list, 0);
            int A00 = 02J.A00(C1A3.A1D(list, 10));
            if (A00 < 16) {
                A00 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
            for (Map map : list) {
                String A002 = AnonymousClass000.A00(273);
                Object obj = map.get(A002);
                if ((obj instanceof String) && 7zL.A1V((CharSequence) obj)) {
                    if (11T.A0O(map.keySet(), 11T.A04(A002))) {
                        z = false;
                    } else {
                        Object obj2 = map.get("service_status");
                        if ((obj2 instanceof String) && 7zL.A1V((CharSequence) obj2)) {
                            Object obj3 = map.get("identity_mapping_with_obid");
                            if (!(obj3 instanceof Map)) {
                                throw AnonymousClass001.A0N("Check failed.");
                            }
                            Object obj4 = map.get("extra_client_cache_data");
                            if (!(obj4 instanceof Map)) {
                                throw AnonymousClass001.A0N("Check failed.");
                            }
                            String str = (String) obj2;
                            Map map2 = (Map) obj3;
                            ArrayList A0t = AnonymousClass001.A0t(map2.size());
                            Iterator A0y = AnonymousClass001.A0y(map2);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                Object key = A0z.getKey();
                                Object value = A0z.getValue();
                                if (!(key instanceof Long)) {
                                    throw AnonymousClass001.A0N("Check failed.");
                                }
                                if (!(value instanceof Map)) {
                                    throw AnonymousClass001.A0N("Check failed.");
                                }
                                String valueOf = String.valueOf(AnonymousClass001.A05(key));
                                Map map3 = (Map) value;
                                ArrayList A0t2 = AnonymousClass001.A0t(map3.size());
                                Iterator A0y2 = AnonymousClass001.A0y(map3);
                                while (A0y2.hasNext()) {
                                    Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                                    Object value2 = A0z2.getValue();
                                    11T.A0I(value2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                    Map map4 = (Map) value2;
                                    String valueOf2 = String.valueOf(A0z2.getKey());
                                    Object obj5 = map4.get("identity_type");
                                    String A17 = DKC.A17(obj5);
                                    String str2 = (String) obj5;
                                    Object obj6 = map4.get("obfuscated_identity_id");
                                    11T.A0I(obj6, A17);
                                    A0t2.add(new Rb0(valueOf2, str2, (String) obj6, C0ty.A00));
                                }
                                A0t.add(new Rax(valueOf, A0t2));
                            }
                            Map map5 = (Map) obj4;
                            HashMap A0u = AnonymousClass001.A0u();
                            Iterator A0y3 = AnonymousClass001.A0y(map5);
                            while (A0y3.hasNext()) {
                                Map.Entry A0z3 = AnonymousClass001.A0z(A0y3);
                                Object key2 = A0z3.getKey();
                                String A172 = DKC.A17(key2);
                                Object value3 = A0z3.getValue();
                                11T.A0I(value3, A172);
                                A0u.put(key2, value3);
                            }
                            new FA0(str, A0u, A0t, System.currentTimeMillis());
                        } else {
                            A0g = AnonymousClass001.A0N("Check failed.");
                        }
                    }
                    linkedHashMap.put(obj, z);
                } else {
                    A0g = 1BK.A0g();
                }
                throw A0g;
            }
            CallerContext callerContext = this.A01;
            11T.A09(callerContext);
            eTx.A06(callerContext, "msgr_android_service_cache_fx_internal", linkedHashMap);
            FEK.A00(fHh, DKc.A01, A02);
            return null;
        } catch (IllegalStateException e) {
            FGT.A03("bk.fx.action.UpdateClientServiceCache", e);
            return null;
        }
    }
}
