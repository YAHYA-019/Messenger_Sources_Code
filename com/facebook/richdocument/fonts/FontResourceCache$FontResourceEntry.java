package com.facebook.richdocument.fonts;

import X.4YU;
import java.util.List;

/* loaded from: FontResourceCache$FontResourceEntry.class */
public class FontResourceCache$FontResourceEntry {
    public final List mFonts;
    public final String mName;
    public final String mVersion;

    public FontResourceCache$FontResourceEntry(String str, String str2, List list) {
        this.mName = str;
        this.mVersion = str2;
        this.mFonts = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (com.google.common.base.Objects.equal(r301.mFonts, r0.mFonts) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.richdocument.fonts.FontResourceCache$FontResourceEntry
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5b
            r0 = r302
            com.facebook.richdocument.fonts.FontResourceCache$FontResourceEntry r0 = (com.facebook.richdocument.fonts.FontResourceCache$FontResourceEntry) r0
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.mName
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.mName
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r301
            java.lang.String r0 = r0.mVersion
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.mVersion
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r301
            java.util.List r0 = r0.mFonts
            r304 = r0
            r0 = r302
            java.util.List r0 = r0.mFonts
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L59
        L54:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L59:
            r0 = r303
            return r0
        L5b:
            r0 = r301
            r1 = r302
            boolean r0 = super.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.richdocument.fonts.FontResourceCache$FontResourceEntry.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 4YU.A04(this.mName, this.mVersion, this.mFonts);
    }
}
