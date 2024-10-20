package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.11T;
import X.ExD;
import X.Fbp;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.List;

/* loaded from: XplatModelMetadataFetcher.class */
public final class XplatModelMetadataFetcher {
    public ARModelMetadataDownloader modelMetadataDownloader;

    public XplatModelMetadataFetcher(ARModelMetadataDownloader aRModelMetadataDownloader) {
        11T.A0F(aRModelMetadataDownloader, 1);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }

    public final void executeRequests(List list, XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        11T.A0H(list, xplatModelMetadataCompletionCallback);
        this.modelMetadataDownloader.downloadModelMetadata(list, new ExD().A00(), new Fbp(xplatModelMetadataCompletionCallback));
    }

    public final ARModelMetadataDownloader getModelMetadataDownloader() {
        return this.modelMetadataDownloader;
    }

    public final void setModelMetadataDownloader(ARModelMetadataDownloader aRModelMetadataDownloader) {
        11T.A0F(aRModelMetadataDownloader, 0);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }
}
