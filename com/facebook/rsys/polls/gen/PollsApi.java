package com.facebook.rsys.polls.gen;

import X.2JQ;
import X.Kag;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: PollsApi.class */
public abstract class PollsApi {
    public static 2JQ CONVERTER = LVi.A00(47);

    /* loaded from: PollsApi$CProxy.class */
    public final class CProxy extends PollsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            Kag.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native PollsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void closeActivity();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void createTextPoll(String str, ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PollsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void removePoll(String str);

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void removeVote(String str);

        @Override // com.facebook.rsys.polls.gen.PollsApi
        public native void vote(String str);
    }

    public abstract void closeActivity();

    public abstract void createTextPoll(String str, ArrayList arrayList);

    public abstract void removePoll(String str);

    public abstract void removeVote(String str);

    public abstract void vote(String str);
}
