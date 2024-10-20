package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Fbq.class */
public final class Fbq implements ARModelMetadataDownloader {
    public final C00i A00 = AbH.A0E();
    public final C00i A01 = 1BV.A00(98883);
    public final C00i A03 = 1BQ.A02(98707);
    public final java.util.Map A02 = DKD.A13();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.common.util.concurrent.ListenableFuture] */
    @Override // com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader
    public void downloadModelMetadata(List list, FEf fEf, GEJ gej) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
            hashMap.put(aRModelMetadataRequest.mCapability, aRModelMetadataRequest);
            F6G f6g = ((Eyn) this.A03.get()).A00;
            String str = fEf.A01;
            boolean z = fEf.A02;
            String name = aRModelMetadataRequest.mCapability.name();
            int i = z ? 22413318 : 22413317;
            int A05 = AbM.A05(str, name);
            QuickPerformanceLogger quickPerformanceLogger = f6g.A02;
            if (quickPerformanceLogger.isMarkerOn(i, A05)) {
                quickPerformanceLogger.markerPoint(i, A05, "model_cache_metadata_download_start");
                quickPerformanceLogger.markerAnnotate(i, A05, "is_model_metadata_downloader_nmlml", Boolean.toString(true));
                F6d f6d = f6g.A00;
                if (!z) {
                    synchronized (f6d.A02) {
                        if (!str.equals(f6d.A00)) {
                            f6d.A00 = "";
                            f6d.A01.clear();
                            f6d.A08.clear();
                            f6d.A06.clear();
                            f6d.A07.clear();
                            f6d.A05.clear();
                            f6d.A03.clear();
                            f6d.A04.clear();
                            f6d.A00 = str;
                        }
                        java.util.Map map = f6d.A08;
                        if (!map.containsKey(aRModelMetadataRequest)) {
                            map.put(aRModelMetadataRequest, Collections.synchronizedList(AbF.A1F()));
                        }
                        ((List) DKC.A12(aRModelMetadataRequest, map)).add("model_cache_metadata_download_start");
                    }
                }
                F6G.A00("logModelCacheMetadataDownloadStart", "markerPoint", "model_cache_metadata_download_start", name, str, i);
            }
        }
        C00i c00i = this.A01;
        c00i.get();
        DKG.A1D(FbInjector.A00());
        Set<VersionedCapability> keySet = hashMap.keySet();
        SettableFuture A0j = 4YU.A0j();
        java.util.Map map2 = this.A02;
        synchronized (map2) {
            if (map2.containsKey(keySet)) {
                A0j = (ListenableFuture) map2.get(keySet);
            } else {
                map2.put(keySet, A0j);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                ArrayList A0s = AnonymousClass001.A0s();
                for (VersionedCapability versionedCapability : keySet) {
                    2Jd A0Q = DKC.A0Q();
                    A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, versionedCapability.name());
                    A0s.add(A0Q);
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
                A0M.A06("model_request_metadatas", copyOf);
                boolean A1T = AnonymousClass001.A1T(copyOf);
                2Jd A0Q2 = DKC.A0Q();
                A0Q2.A0A("bytecodeVersion", AnonymousClass001.A0s());
                A0Q2.A0A("supportedCompressions", ImmutableList.of((Object) ARRequestAsset.CompressionMethod.TAR_BROTLI.getCompressionMethod(), (Object) ARRequestAsset.CompressionMethod.NONE.getCompressionMethod()));
                A0M.A01(A0Q2, "client_capability_metadata");
                Preconditions.checkArgument(A1T);
                C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchCapabilityNMLMLMetadataQuery", (String) null, "fbandroid", 1632564438, 0, 3195605453L, 3195605453L, false, true));
                A0L.A0A(Math.round(C2051Daa.A00(c00i).Ai7(37155418481426564L) * 3600.0d));
                A0L.A09(Math.round(C2051Daa.A00(c00i).Ai7(37155418481426564L) * 3600.0d));
                1Vd A0K = 7zM.A0K(FbInjector.A00());
                4YU.A1J(A0L, 1433659610122556L);
                1Kd.A0D(this.A00, new Fw1(3, A0j, this, keySet), A0K.A04(A0L));
            }
        }
        1Kd.A0E(new Fw1(2, gej, this, list), A0j);
    }
}
