package com.facebook.cameracore.ardelivery.xplat.sparkvision;

import X.0QD;
import X.11T;
import X.1BK;
import X.1Du;
import X.1Fj;
import X.1Ve;
import X.2Jd;
import X.4YV;
import X.AnonymousClass001;
import X.C3s4;
import X.DKC;
import X.DKF;
import X.ENM;
import X.ExD;
import X.F1W;
import X.FEf;
import X.FfP;
import X.FfV;
import X.Ffi;
import X.GAa;
import X.GNW;
import X.GO0;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: SparkVisionMetadataDownloader.class */
public final class SparkVisionMetadataDownloader {
    public final 1Ve graphQLQueryExecutor;

    public SparkVisionMetadataDownloader(1Ve r302) {
        11T.A0F(r302, 1);
        this.graphQLQueryExecutor = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.GEs, X.Ffi] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Class, java.lang.Class<X.F1W>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    private final C3s4 makeQuery(ImmutableList immutableList) {
        GraphQlCallInput A0Q = DKC.A0Q();
        ImmutableList of = ImmutableList.of((Object) "TAR_BROTLI", (Object) "None");
        A0Q.A0A("bytecodeVersion", AnonymousClass001.A0s());
        A0Q.A0A("supportedCompressions", of);
        ?? r0 = F1W.class;
        try {
            r0 = (Ffi) DKF.A0n((Class) r0);
            GraphQlQueryParamSet graphQlQueryParamSet = r0.A01;
            graphQlQueryParamSet.A06("model_request_metadatas", immutableList);
            r0.A02 = AnonymousClass001.A1T(immutableList);
            graphQlQueryParamSet.A01(A0Q, "client_capability_metadata");
            C3s4 ACe = r0.ACe();
            11T.A0D(ACe);
            return ACe;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    private final ImmutableList makeRequest(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            2Jd A0Q = DKC.A0Q();
            A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0i);
            builder.m11011add((Object) A0Q);
        }
        return 1Fj.A01(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.Eti] */
    public final SparkVisionMetadataResponse parseResults(ImmutableList immutableList) {
        LinkedHashMap A1C = 1BK.A1C();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            GNW gnw = (GNW) it.next();
            String name = gnw != null ? gnw.getName() : null;
            ImmutableList AXV = gnw.AXV();
            11T.A0A(AXV);
            if (name == null || AXV.size() == 0 || AXV.size() > 1) {
                ?? obj = new Object();
                obj.A00 = ENM.A0F;
                throw obj.A00();
            }
            GO0 go0 = (GO0) 0QD.A0D(AXV);
            String id = go0.getId();
            if (id == null) {
                id = "";
            }
            A1C.put(name, new XplatRemoteAsset(ARRequestAsset.A00(ARRequestAsset.CompressionMethod.fromString(String.valueOf(go0.Adb())), null, null, "", go0.BIR(), name, id, go0.Avs(), null, go0.BBg(), null, null, null, go0.AmT(), 0L, false, false, false, false)));
        }
        return new SparkVisionMetadataResponse(A1C);
    }

    public final void downloadModelMetadata(List list, FEf fEf, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        4YV.A1N(list, sparkVisionMetadataCallback);
        C3s4 makeQuery = makeQuery(makeRequest(list));
        GAa gAa = new GAa(sparkVisionMetadataCallback, 18);
        FfP.A00(new FfV(0, sparkVisionMetadataCallback, gAa, this), this.graphQLQueryExecutor, makeQuery, gAa, 6);
    }

    public final void xplatDownloadModelMetadata(List list, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        11T.A0H(list, sparkVisionMetadataCallback);
        downloadModelMetadata(list, new ExD().A00(), sparkVisionMetadataCallback);
    }
}
