package com.facebook.cameracore.ardelivery.xplat.async;

import X.11T;
import X.4YU;
import X.7zT;
import X.AnonymousClass001;
import X.C3s4;
import X.C3sb;
import X.DKD;
import X.DKE;
import X.EMT;
import X.Ere;
import X.F0S;
import X.F16;
import X.Fbd;
import X.FfP;
import X.FfX;
import X.Ffs;
import X.GAa;
import X.GCS;
import X.Hwu;
import X.RMK;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: XplatAsyncMetadataFetcher.class */
public final class XplatAsyncMetadataFetcher {
    public GCS metadataDownloader;

    public XplatAsyncMetadataFetcher(GCS gcs) {
        11T.A0F(gcs, 1);
        this.metadataDownloader = gcs;
    }

    public final void clearMetadataCache() {
        ((Fbd) this.metadataDownloader).A03.clear();
    }

    public final void fetchAsyncAssetMetadata(String str, String str2, XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback) {
        7zT.A1S(str, str2, xplatAsyncMetadataCompletionCallback);
        GCS gcs = this.metadataDownloader;
        Ere ere = new Ere(xplatAsyncMetadataCompletionCallback);
        Fbd fbd = (Fbd) gcs;
        synchronized (fbd) {
            RMK rmk = (RMK) fbd.A03.get(str);
            if (rmk != null) {
                ere.A00(rmk);
            }
            try {
                Ffs ffs = (Ffs) DKE.A0p(F16.class, "create", 0);
                ImmutableList of = ImmutableList.of((Object) str);
                GraphQlQueryParamSet graphQlQueryParamSet = ffs.A01;
                graphQlQueryParamSet.A06("block_ids", of);
                ffs.A02 = AnonymousClass001.A1T(of);
                graphQlQueryParamSet.A01(F0S.A00(fbd.A00, fbd.A02), "device_capabilities");
                boolean z = true;
                ffs.A03 = true;
                ImmutableList of2 = ImmutableList.of((Object) "ZIP", (Object) "TAR_BROTLI");
                graphQlQueryParamSet.A06("supported_compression_types", of2);
                if (of2 == null) {
                    z = false;
                }
                ffs.A04 = z;
                ImmutableList.Builder A0h = 4YU.A0h();
                Map A00 = Hwu.A00();
                Boolean bool = Boolean.TRUE;
                if (DKD.A1Y("etc2_compression", bool, A00)) {
                    A0h.m11011add((Object) "ETC");
                }
                if (DKD.A1Y("pvr_compression", bool, A00)) {
                    A0h.m11011add((Object) "PVR");
                }
                if (DKD.A1Y("astc_compression", bool, A00)) {
                    A0h.m11011add((Object) "ASTC");
                }
                if (DKD.A1Y("none", bool, A00)) {
                    A0h.m11011add((Object) "UNCOMPRESSED");
                }
                ImmutableList build = A0h.build();
                graphQlQueryParamSet.A06("supported_texture_formats", build);
                ffs.A05 = AnonymousClass001.A1T(build);
                graphQlQueryParamSet.A05("effect_id", str2);
                C3s4 ACe = ffs.ACe();
                if (ACe instanceof C3sb) {
                    ((C3sb) ACe).A03 = 604800000L;
                }
                11T.A0D(ACe);
                GAa gAa = new GAa(ere, 16);
                FfP.A00(new FfX(fbd, ere, gAa, str, 0), fbd.A01, ACe, gAa, 0);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw AnonymousClass001.A0U(e);
            }
        }
    }

    public final XplatAsyncMetadataResponse fetchMetadataFromCache(String str) {
        11T.A0F(str, 0);
        RMK rmk = (RMK) ((Fbd) this.metadataDownloader).A03.get(str);
        if (rmk == null) {
            return null;
        }
        String str2 = rmk.A02;
        String str3 = rmk.A00;
        String str4 = rmk.A03;
        EMT xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(rmk.A01));
        11T.A0A(xplatCompressionType);
        return new XplatAsyncMetadataResponse(str2, str3, str4, xplatCompressionType);
    }

    public final GCS getMetadataDownloader() {
        return this.metadataDownloader;
    }

    public final void setMetadataDownloader(GCS gcs) {
        11T.A0F(gcs, 0);
        this.metadataDownloader = gcs;
    }
}
