package com.facebook.papaya.client.engine.impl;

import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.C0il;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: EngineFactory.class */
public final class EngineFactory extends IEngineFactory {
    public EngineFactory(Context context, Map map, Bundle bundle, Map map2, List list, ITransport iTransport, IModelLoader iModelLoader) {
        11T.A0F(context, 1);
        11T.A0F(map, 2);
        11T.A0F(bundle, 3);
        11T.A0F(map2, 4);
        11T.A0F(list, 5);
        11T.A0F(iTransport, 6);
        C0il.A0B("papaya-engine");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0il.A0C(AnonymousClass001.A0i(it), 16);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            hashMap.put(entry.getKey(), ((PapayaRestrictions) entry.getValue()).A00());
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (Map.Entry entry2 : map.entrySet()) {
            String str = (String) entry2.getKey();
            try {
                builder.put(str, (IExecutorFactory) ((Class) entry2.getValue()).getConstructor(Context.class, Bundle.class).newInstance(context, bundle.getBundle(str)));
                0fH.A0h(str, "PapayaEngineFactory", "Registered executor factory: %s");
            } catch (Exception e) {
                0fH.A0s("PapayaEngineFactory", "Failed to instantiate ExecutorFactory implementation", e);
            }
        }
        Map build = builder.build();
        11T.A0A(build);
        initHybrid(iTransport, build, hashMap, iModelLoader);
    }

    private final native void initHybrid(ITransport iTransport, Map map, Map map2, IModelLoader iModelLoader);
}
