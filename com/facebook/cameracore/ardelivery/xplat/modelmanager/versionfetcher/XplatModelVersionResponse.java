package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.1BL;
import X.AnonymousClass001;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: XplatModelVersionResponse.class */
public final class XplatModelVersionResponse {
    public final List forcedDownloadFlags;
    public final List jVersionedCapabilities;
    public final List versionedCapabilities;
    public final List versions;

    public XplatModelVersionResponse(List list, List list2, List list3) {
        1BL.A1H(list, list2, list3);
        this.forcedDownloadFlags = list;
        this.jVersionedCapabilities = list2;
        this.versions = list3;
        ArrayList A0z = 1BL.A0z(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass001.A1J(A0z, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.versionedCapabilities = A0z;
    }

    public final List getForcedDownloadFlags() {
        return this.forcedDownloadFlags;
    }

    public final List getVersionedCapabilities() {
        return this.versionedCapabilities;
    }

    public final List getVersions() {
        return this.versions;
    }
}
