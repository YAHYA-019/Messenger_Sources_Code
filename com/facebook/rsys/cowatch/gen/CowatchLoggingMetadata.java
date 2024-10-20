package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchLoggingMetadata.class */
public class CowatchLoggingMetadata {
    public static 2JQ CONVERTER = IR0.A00(72);
    public static long sMcfTypeId;
    public final String promotionSource;
    public final int sectionItemRenderingStyle;
    public final int sectionRenderingStyle;
    public final String tabLoggingName;

    public CowatchLoggingMetadata(String str, String str2, int i, int i2) {
        this.tabLoggingName = str;
        this.promotionSource = str2;
        this.sectionRenderingStyle = i;
        this.sectionItemRenderingStyle = i2;
    }

    public static native CowatchLoggingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingMetadata)) {
                return false;
            }
            CowatchLoggingMetadata cowatchLoggingMetadata = (CowatchLoggingMetadata) obj;
            String str = this.tabLoggingName;
            String str2 = cowatchLoggingMetadata.tabLoggingName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.promotionSource;
            String str4 = cowatchLoggingMetadata.promotionSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.sectionRenderingStyle != cowatchLoggingMetadata.sectionRenderingStyle || this.sectionItemRenderingStyle != cowatchLoggingMetadata.sectionItemRenderingStyle) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(1BL.A05(this.tabLoggingName)) + 7zN.A05(this.promotionSource)) * 31) + this.sectionRenderingStyle) * 31) + this.sectionItemRenderingStyle;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchLoggingMetadata{tabLoggingName=");
        A0k.append(this.tabLoggingName);
        A0k.append(",promotionSource=");
        A0k.append(this.promotionSource);
        A0k.append(",sectionRenderingStyle=");
        A0k.append(this.sectionRenderingStyle);
        A0k.append(",sectionItemRenderingStyle=");
        return AbstractC2327GOs.A0W(A0k, this.sectionItemRenderingStyle);
    }
}
