package com.facebook.rsys.metaaivoicestate.gen;

import X.2JQ;
import X.N0C;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MetaAiMediaStatsProxy.class */
public abstract class MetaAiMediaStatsProxy {
    public static 2JQ CONVERTER = N6e.A00(41);

    /* loaded from: MetaAiMediaStatsProxy$CProxy.class */
    public final class CProxy extends MetaAiMediaStatsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0C.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MetaAiMediaStatsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiMediaStatsProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy
        public native void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy
        public native void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);
    }

    public abstract void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

    public abstract void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);
}
