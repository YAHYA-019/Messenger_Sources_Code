package com.facebook.msys.cql.dataclasses;

import X.49J;
import X.5Ut;
import X.AnonymousClass001;
import X.C00j;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadataSerializer;

/* loaded from: ThreadMetadataAdapter.class */
public final class ThreadMetadataAdapter extends 49J {
    public static final 5Ut Companion = new Object();
    public static final ThreadMetadataAdapter INSTANCE = new 49J();

    public ThreadMetadata toAdaptedObject(String str) {
        if (str == null) {
            throw AnonymousClass001.A0Q("Trying to create ThreadMetadata from null string");
        }
        C00j.A05("ThreadMetadataAdapter.toAdaptedObject.Deserialize", 896616569);
        try {
            ThreadMetadata fromString = ThreadMetadataSerializer.fromString(str);
            if (fromString == null) {
                throw AnonymousClass001.A0Q("ThreadMetadata deserialization failed");
            }
            C00j.A01(2073494177);
            return fromString;
        } catch (Throwable th) {
            C00j.A01(1388633988);
            throw th;
        }
    }

    public ThreadMetadata toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        C00j.A05("ThreadMetadataAdapter.toNullableAdaptedObject.Deserialize", -1651333892);
        try {
            ThreadMetadata fromString = ThreadMetadataSerializer.fromString(str);
            C00j.A01(131500484);
            return fromString;
        } catch (Throwable th) {
            C00j.A01(837029235);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object toNullableRawObject(Object obj) {
        ThreadMetadata threadMetadata = (ThreadMetadata) obj;
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }

    public String toNullableRawObject(ThreadMetadata threadMetadata) {
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }

    public String toRawObject(ThreadMetadata threadMetadata) {
        String threadMetadataSerializer;
        if (threadMetadata == null || (threadMetadataSerializer = ThreadMetadataSerializer.toString(threadMetadata)) == null) {
            throw AnonymousClass001.A0Q("Trying to get string from null ThreadMetadata");
        }
        return threadMetadataSerializer;
    }
}
