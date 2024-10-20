package com.facebook.rsys.metaaivoicestate.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MetaAiCaption.class */
public class MetaAiCaption {
    public static 2JQ CONVERTER = N6e.A00(40);
    public static long sMcfTypeId;
    public final String language;
    public final String text;

    public MetaAiCaption(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.language = str2;
    }

    public static native MetaAiCaption createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MetaAiCaption)) {
                return false;
            }
            MetaAiCaption metaAiCaption = (MetaAiCaption) obj;
            if (this.text.equals(metaAiCaption.text) && this.language.equals(metaAiCaption.language)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.text) + this.language.hashCode();
    }

    public String toString() {
        return 0Pz.A0z("MetaAiCaption{text=", this.text, ",language=", this.language, "}");
    }
}
