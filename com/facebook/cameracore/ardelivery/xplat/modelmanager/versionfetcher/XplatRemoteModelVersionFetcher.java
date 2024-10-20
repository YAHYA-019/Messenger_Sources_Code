package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.0Pz;
import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C01s;
import X.C0c4;
import X.C0ra;
import X.DKE;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: XplatRemoteModelVersionFetcher.class */
public final class XplatRemoteModelVersionFetcher {
    public final C01s errorReporter;
    public final RemoteModelVersionFetcher modelVersionFetcher;

    public XplatRemoteModelVersionFetcher(RemoteModelVersionFetcher remoteModelVersionFetcher, C01s c01s) {
        1BL.A1F(remoteModelVersionFetcher, c01s);
        this.modelVersionFetcher = remoteModelVersionFetcher;
        this.errorReporter = c01s;
    }

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        String str;
        11T.A0H(list, xplatRemoteModelVersionFetchCompletionCallback);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(DKE.A0F(it));
            if (fromXplatValue != null) {
                A0s.add(fromXplatValue);
            }
        }
        try {
            this.modelVersionFetcher.fetchServerPreferredVersions(A0s, xplatRemoteModelVersionFetchCompletionCallback);
        } catch (IllegalArgumentException e) {
            this.errorReporter.Cfx(C0c4.LOGGING, "ArDelivery", 0Pz.A0W("XplatRemoteModelVersionFetcher hits illegal argument exception: ", C0ra.A00(e)));
            str = "XplatRemoteModelVersionFetcher hits illegal argument exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (IllegalStateException e2) {
            this.errorReporter.Cfx(C0c4.LOGGING, "ArDelivery", 0Pz.A0W("XplatRemoteModelVersionFetcher hits illegal state exception: ", C0ra.A00(e2)));
            str = "XplatRemoteModelVersionFetcher hits illegal state exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (Exception e3) {
            this.errorReporter.Cfx(C0c4.LOGGING, "ArDelivery", 0Pz.A0W("XplatRemoteModelVersionFetcher hits exception: ", C0ra.A00(e3)));
            str = "XplatRemoteModelVersionFetcher hits exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        }
    }
}
