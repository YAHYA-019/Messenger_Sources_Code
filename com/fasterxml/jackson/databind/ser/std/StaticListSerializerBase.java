package com.fasterxml.jackson.databind.ser.std;

import X.C27r;

/* loaded from: StaticListSerializerBase.class */
public abstract class StaticListSerializerBase extends StdSerializer implements C27r {
    public final Boolean _unwrapSingle;

    public StaticListSerializerBase(StaticListSerializerBase staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this._unwrapSingle = bool;
    }

    public StaticListSerializerBase(Class cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.size() == 0) goto L6;
     */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean A0B(X.C26c r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r303
            java.util.Collection r0 = (java.util.Collection) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L17
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1a
        L17:
            r0 = 1
            r305 = r0
        L1a:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.A0B(X.26c, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
