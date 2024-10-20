package com.facebook.rsys.metaaivoicestate.gen;

import X.2JQ;
import X.4YU;
import X.AnonymousClass001;
import X.C9rr;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MetaAiVoiceState.class */
public class MetaAiVoiceState {
    public static 2JQ CONVERTER = new C9rr(1);
    public static long sMcfTypeId;
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public MetaAiVoiceState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }

    public static native MetaAiVoiceState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiVoiceState)) {
                return false;
            }
            MetaAiVoiceState metaAiVoiceState = (MetaAiVoiceState) obj;
            if (this.state != metaAiVoiceState.state) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = this.botContent;
            MetaAiBotContent metaAiBotContent2 = metaAiVoiceState.botContent;
            if (metaAiBotContent == null) {
                if (metaAiBotContent2 != null) {
                    return false;
                }
            } else if (!metaAiBotContent.equals(metaAiBotContent2)) {
                return false;
            }
            MetaAiUserContent metaAiUserContent = this.userContent;
            MetaAiUserContent metaAiUserContent2 = metaAiVoiceState.userContent;
            if (metaAiUserContent == null) {
                if (metaAiUserContent2 != null) {
                    return false;
                }
            } else if (!metaAiUserContent.equals(metaAiUserContent2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.state) * 31) + AnonymousClass001.A02(this.botContent)) * 31) + 4YU.A03(this.userContent);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiVoiceState{state=");
        A0k.append(this.state);
        A0k.append(",botContent=");
        A0k.append(this.botContent);
        A0k.append(",userContent=");
        A0k.append(this.userContent);
        return AnonymousClass001.A0d("}", A0k);
    }
}
