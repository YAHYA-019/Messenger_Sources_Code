package com.facebook.rsys.metaaivoicestate.gen;

import X.2JQ;
import X.7zN;
import X.AnonymousClass001;
import X.C9rr;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MetaAiBotContent.class */
public class MetaAiBotContent {
    public static 2JQ CONVERTER = new C9rr(0);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;
    public final String llmResponseContents;

    public MetaAiBotContent(MetaAiCaption metaAiCaption, String str) {
        this.caption = metaAiCaption;
        this.llmResponseContents = str;
    }

    public static native MetaAiBotContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiBotContent)) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = (MetaAiBotContent) obj;
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = metaAiBotContent.caption;
            if (metaAiCaption == null) {
                if (metaAiCaption2 != null) {
                    return false;
                }
            } else if (!metaAiCaption.equals(metaAiCaption2)) {
                return false;
            }
            String str = this.llmResponseContents;
            String str2 = metaAiBotContent.llmResponseContents;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((527 + AnonymousClass001.A02(this.caption)) * 31) + 7zN.A05(this.llmResponseContents);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiBotContent{caption=");
        A0k.append(this.caption);
        A0k.append(",llmResponseContents=");
        A0k.append(this.llmResponseContents);
        return AnonymousClass001.A0d("}", A0k);
    }
}
