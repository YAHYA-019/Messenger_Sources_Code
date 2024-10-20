package com.facebook.rsys.metaaivoicestate.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MetaAiUserContent.class */
public class MetaAiUserContent {
    public static 2JQ CONVERTER = N6e.A00(42);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;

    public MetaAiUserContent(MetaAiCaption metaAiCaption) {
        this.caption = metaAiCaption;
    }

    public static native MetaAiUserContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiUserContent)) {
                return false;
            }
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = ((MetaAiUserContent) obj).caption;
            if (metaAiCaption == null) {
                if (metaAiCaption2 != null) {
                    return false;
                }
            } else if (!metaAiCaption.equals(metaAiCaption2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass001.A02(this.caption);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiUserContent{caption=");
        return AbstractC2327GOs.A0U(this.caption, A0k);
    }
}
