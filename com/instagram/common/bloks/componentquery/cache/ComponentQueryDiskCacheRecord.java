package com.instagram.common.bloks.componentquery.cache;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.CBQ;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

/* loaded from: ComponentQueryDiskCacheRecord.class */
public final class ComponentQueryDiskCacheRecord implements Serializable {
    public static final CBQ Companion = new Object();
    public final String payload;
    public final BloksComponentQueryResources resources;
    public final long responseTimestampMs;

    public ComponentQueryDiskCacheRecord(String str, long j, BloksComponentQueryResources bloksComponentQueryResources) {
        11T.A0F(str, 1);
        this.payload = str;
        this.responseTimestampMs = j;
        this.resources = bloksComponentQueryResources;
    }

    public static /* synthetic */ ComponentQueryDiskCacheRecord copy$default(ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord, String str, long j, BloksComponentQueryResources bloksComponentQueryResources, int i, Object obj) {
        if ((i & 1) != 0) {
            str = componentQueryDiskCacheRecord.payload;
        }
        if ((i & 2) != 0) {
            j = componentQueryDiskCacheRecord.responseTimestampMs;
        }
        if ((i & 4) != 0) {
            bloksComponentQueryResources = componentQueryDiskCacheRecord.resources;
        }
        return componentQueryDiskCacheRecord.copy(str, j, bloksComponentQueryResources);
    }

    public final String component1() {
        return this.payload;
    }

    public final long component2() {
        return this.responseTimestampMs;
    }

    public final BloksComponentQueryResources component3() {
        return this.resources;
    }

    public final ComponentQueryDiskCacheRecord copy(String str, long j, BloksComponentQueryResources bloksComponentQueryResources) {
        11T.A0F(str, 0);
        return new ComponentQueryDiskCacheRecord(str, j, bloksComponentQueryResources);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComponentQueryDiskCacheRecord)) {
                return false;
            }
            ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = (ComponentQueryDiskCacheRecord) obj;
            if (!11T.A0O(this.payload, componentQueryDiskCacheRecord.payload) || this.responseTimestampMs != componentQueryDiskCacheRecord.responseTimestampMs || !11T.A0O(this.resources, componentQueryDiskCacheRecord.resources)) {
                return false;
            }
        }
        return true;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseTimestampMs() {
        return this.responseTimestampMs;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.responseTimestampMs, 4YV.A02(this.payload)) + AnonymousClass001.A02(this.resources);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentQueryDiskCacheRecord(payload=");
        A0k.append(this.payload);
        A0k.append(", responseTimestampMs=");
        A0k.append(this.responseTimestampMs);
        A0k.append(", resources=");
        return AnonymousClass002.A0K(this.resources, A0k);
    }
}
