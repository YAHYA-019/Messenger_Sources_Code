package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import java.util.List;

/* loaded from: RemoteModelVersionFetcher.class */
public interface RemoteModelVersionFetcher {
    void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback);
}
