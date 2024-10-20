package com.instagram.common.bloks.componentquery.cache;

import X.11T;
import X.7zQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

/* loaded from: DiskCacheMetadata.class */
public final class DiskCacheMetadata implements Serializable {
    public final BloksComponentQueryResources resources;
    public final long responseCreatedTimestampMs;
    public final long serialVersionUID = 1;

    public DiskCacheMetadata(long j, BloksComponentQueryResources bloksComponentQueryResources) {
        this.responseCreatedTimestampMs = j;
        this.resources = bloksComponentQueryResources;
    }

    public static /* synthetic */ DiskCacheMetadata copy$default(DiskCacheMetadata diskCacheMetadata, long j, BloksComponentQueryResources bloksComponentQueryResources, int i, Object obj) {
        if ((i & 1) != 0) {
            j = diskCacheMetadata.responseCreatedTimestampMs;
        }
        if ((i & 2) != 0) {
            bloksComponentQueryResources = diskCacheMetadata.resources;
        }
        return new DiskCacheMetadata(j, bloksComponentQueryResources);
    }

    public final long component1() {
        return this.responseCreatedTimestampMs;
    }

    public final BloksComponentQueryResources component2() {
        return this.resources;
    }

    public final DiskCacheMetadata copy(long j, BloksComponentQueryResources bloksComponentQueryResources) {
        return new DiskCacheMetadata(j, bloksComponentQueryResources);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DiskCacheMetadata)) {
                return false;
            }
            DiskCacheMetadata diskCacheMetadata = (DiskCacheMetadata) obj;
            if (this.responseCreatedTimestampMs != diskCacheMetadata.responseCreatedTimestampMs || !11T.A0O(this.resources, diskCacheMetadata.resources)) {
                return false;
            }
        }
        return true;
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseCreatedTimestampMs() {
        return this.responseCreatedTimestampMs;
    }

    public int hashCode() {
        return 7zQ.A02(this.responseCreatedTimestampMs) + AnonymousClass001.A02(this.resources);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DiskCacheMetadata(responseCreatedTimestampMs=");
        A0k.append(this.responseCreatedTimestampMs);
        A0k.append(", resources=");
        return AnonymousClass002.A0K(this.resources, A0k);
    }
}
