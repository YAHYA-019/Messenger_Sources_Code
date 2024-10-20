package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: CollectionName.class */
public class CollectionName {
    public final HybridData mHybridData;

    /* loaded from: CollectionName$Builder.class */
    public final class Builder {
        public final HybridData mHybridData;

        static {
            C0il.A0B("omnistore");
        }

        public Builder(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        private native void addDeviceIdNative();

        private native void addSegmentNative(String str);

        public Builder addDeviceId() {
            addDeviceIdNative();
            return this;
        }

        public Builder addSegment(String str) {
            addSegmentNative(str);
            return this;
        }

        public native CollectionName build();
    }

    static {
        C0il.A0B("omnistore");
    }

    public CollectionName(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CollectionName)) {
            return false;
        }
        return this == obj || equalsNative((CollectionName) obj);
    }

    public native boolean equalsNative(CollectionName collectionName);

    public native String getLabel();

    public native QueueIdentifier getQueueIdentifier();

    public int hashCode() {
        return toString().hashCode();
    }

    public native String toString();
}
