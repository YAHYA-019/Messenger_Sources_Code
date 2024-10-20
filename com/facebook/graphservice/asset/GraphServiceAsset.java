package com.facebook.graphservice.asset;

import X.02W;
import X.0CC;
import X.0CG;
import X.0Pz;
import X.0QO;
import X.0Xe;
import X.0fH;
import X.1M9;
import X.2J9;
import X.2JA;
import X.2Jm;
import X.AnonymousClass001;
import X.C0gh;
import android.content.Context;
import com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: GraphServiceAsset.class */
public class GraphServiceAsset {
    public static Context sApplicationContext;
    public static final Map sAssets;
    public static String sDefaultConfigName;
    public final GraphQLServiceConfig mConfig;
    public final HybridData mHybridData;

    /* loaded from: GraphServiceAsset$GraphQLServiceConfig.class */
    public class GraphQLServiceConfig {
        public final String assetFilename;
        public final String cacheNamespace;
        public final String rootBuildConfigName;
        public final String serverEndpoint;

        public GraphQLServiceConfig(String str, String str2, String str3, String str4) {
            this.rootBuildConfigName = str;
            this.assetFilename = str2;
            this.cacheNamespace = str3;
            this.serverEndpoint = str4;
        }
    }

    static {
        C0gh.A02("fb");
        C0gh.A02("graphservice-jni-asset");
        sAssets = new 0QO(1);
    }

    public GraphServiceAsset(String str, GraphQLServiceConfig graphQLServiceConfig, boolean z) {
        0fH.A0g(str, "GraphServiceAsset", "Initializing GraphService asset from %s");
        this.mHybridData = initHybridData(graphQLServiceConfig.rootBuildConfigName, str, graphQLServiceConfig.serverEndpoint, z);
        this.mConfig = graphQLServiceConfig;
        GraphServiceNativeConfigLoader.loadNativeConfigs();
    }

    public static String getDefaultConfigName() {
        String str;
        synchronized (GraphServiceAsset.class) {
            str = sDefaultConfigName;
            if (str == null) {
                GraphServiceNativeConfigLoader.loadNativeConfigs();
                str = getDefaultConfigNameNative();
                sDefaultConfigName = str;
            }
        }
        return str;
    }

    public static native String getDefaultConfigNameNative();

    public static GraphServiceAsset getInstance() {
        GraphServiceAsset graphServiceAsset;
        synchronized (GraphServiceAsset.class) {
            graphServiceAsset = getInstance(getDefaultConfigName());
        }
        return graphServiceAsset;
    }

    public static GraphServiceAsset getInstance(String str) {
        GraphServiceAsset graphServiceAsset;
        synchronized (GraphServiceAsset.class) {
            Map map = sAssets;
            if (map.containsKey(str)) {
                graphServiceAsset = (GraphServiceAsset) map.get(str);
                graphServiceAsset.getClass();
            } else {
                try {
                    GraphServiceNativeConfigLoader.loadNativeConfigs();
                    GraphQLServiceConfig resolveBuildConfig = resolveBuildConfig(str);
                    if (!map.containsKey(resolveBuildConfig.rootBuildConfigName)) {
                        Context context = sApplicationContext;
                        if (context == null) {
                            context = 0Xe.A00();
                            sApplicationContext = context;
                        }
                        02W.A03("GraphServiceAsset unable to get the application context. Please initialize it manually by calling useContext.", context);
                        String str2 = resolveBuildConfig.assetFilename;
                        File file = new File(1M9.A00(context).AUq((2Jm) null, 709674273), resolveBuildConfig.cacheNamespace);
                        File file2 = new File(file, str2);
                        ArrayList arrayList = new ArrayList();
                        Executor executor = 0CC.A07;
                        arrayList.add(new 0CG(0Pz.A0W(str2, ".checksum"), 0Pz.A0j("uncompressed_", str2, ".checksum")));
                        arrayList.add(new 0CG(0Pz.A0W(str2, ".xzs"), str2));
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            0CG r0 = (0CG) arrayList.get(i);
                            r0.A00 = new File(file, r0.A01);
                            i++;
                        }
                        new 0CC(context, file, "GraphServiceUnpacker", arrayList, executor).A03();
                        try {
                            2JA<2J9> r02 = new 2JA(sApplicationContext, 3);
                            r02.A00 = 0;
                        } catch (NoClassDefFoundError unused) {
                        }
                        for (2J9 r03 : r02) {
                            if (r03 != null) {
                                synchronized (((2JA) r03).A03) {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                                int i2 = ((2JA) r03).A01 << 8;
                                if (i2 != 0) {
                                    th = 0Pz.A04("method not found: ", i2);
                                    throw th;
                                }
                                GraphServiceAsset graphServiceAsset2 = new GraphServiceAsset(file2.getCanonicalPath(), resolveBuildConfig, false);
                                map.put(str, graphServiceAsset2);
                                map.put(resolveBuildConfig.rootBuildConfigName, graphServiceAsset2);
                                return graphServiceAsset2;
                            }
                        }
                        throw AnonymousClass001.A0T("Found no IGraphServiceAssetSocket implementation");
                    }
                    map.put(str, (GraphServiceAsset) map.get(resolveBuildConfig.rootBuildConfigName));
                    graphServiceAsset = (GraphServiceAsset) map.get(str);
                    graphServiceAsset.getClass();
                } catch (IOException e) {
                    throw AnonymousClass001.A0U(e);
                }
            }
            return graphServiceAsset;
        }
    }

    public static native HybridData initHybridData(String str, String str2, String str3, boolean z);

    public static native GraphQLServiceConfig resolveBuildConfig(String str);

    public static void useContext(Context context) {
        synchronized (GraphServiceAsset.class) {
            if (sApplicationContext == null) {
                sApplicationContext = context.getApplicationContext();
            }
        }
    }
}
