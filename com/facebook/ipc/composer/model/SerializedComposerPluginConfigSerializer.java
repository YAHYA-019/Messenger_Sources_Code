package com.facebook.ipc.composer.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: SerializedComposerPluginConfigSerializer.class */
public class SerializedComposerPluginConfigSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), SerializedComposerPluginConfig.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        SerializedComposerPluginConfig serializedComposerPluginConfig = (SerializedComposerPluginConfig) obj;
        if (serializedComposerPluginConfig == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "persist_key", serializedComposerPluginConfig.persistenceKey);
        AbstractC11224vw.A0D(r302, "data", serializedComposerPluginConfig.data);
        r302.A0Y();
    }
}
