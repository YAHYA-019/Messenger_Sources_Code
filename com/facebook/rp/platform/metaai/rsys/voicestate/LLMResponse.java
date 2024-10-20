package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.11T;
import X.9Dv;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;

/* loaded from: LLMResponse.class */
public final class LLMResponse extends C04v {
    public static final 9Dv Companion = new Object();
    public final GenAIViewModels genAIViewModels;

    public LLMResponse(GenAIViewModels genAIViewModels) {
        this.genAIViewModels = genAIViewModels;
    }

    public static /* synthetic */ LLMResponse copy$default(LLMResponse lLMResponse, GenAIViewModels genAIViewModels, int i, Object obj) {
        if ((i & 1) != 0) {
            genAIViewModels = lLMResponse.genAIViewModels;
        }
        return new LLMResponse(genAIViewModels);
    }

    public final GenAIViewModels component1() {
        return this.genAIViewModels;
    }

    public final LLMResponse copy(GenAIViewModels genAIViewModels) {
        return new LLMResponse(genAIViewModels);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LLMResponse) && 11T.A0O(this.genAIViewModels, ((LLMResponse) obj).genAIViewModels));
    }

    public final GenAIViewModels getGenAIViewModels() {
        return this.genAIViewModels;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.genAIViewModels);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LLMResponse(genAIViewModels=");
        return AnonymousClass002.A0K(this.genAIViewModels, A0k);
    }
}
