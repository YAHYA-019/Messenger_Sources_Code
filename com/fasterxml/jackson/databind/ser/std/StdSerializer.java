package com.fasterxml.jackson.databind.ser.std;

import X.0Q8;
import X.24S;
import X.68U;
import X.AnonymousClass001;
import X.C25p;
import X.C25s;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* loaded from: StdSerializer.class */
public abstract class StdSerializer extends JsonSerializer implements Serializable {
    public static final Object A00 = new Object();
    public static final long serialVersionUID = 1;
    public final Class _handledType;

    public StdSerializer(24S r302) {
        this._handledType = r302._class;
    }

    public StdSerializer(StdSerializer stdSerializer) {
        this._handledType = stdSerializer._handledType;
    }

    public StdSerializer(Class cls) {
        this._handledType = cls;
    }

    public StdSerializer(Class cls, boolean z) {
        this._handledType = cls;
    }

    public static C25s A00(68U r301, C26c c26c, Class cls) {
        C25p c25p = c26c._config;
        return r301 != null ? r301.ASv(c25p, cls) : c25p.A00(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r301._config.A0G(X.26D.A09) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if ((r304 instanceof X.2LE) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C26c r301, java.lang.Object r302, java.lang.String r303, java.lang.Throwable r304) {
        /*
        L0:
            r0 = r304
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = r304
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L24
            r0 = r304
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r304 = r0
            goto L0
        L24:
            X.27F[] r0 = X.27C.A01
            r306 = r0
            r0 = r304
            boolean r0 = r0 instanceof java.lang.Error
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L75
            r0 = r301
            if (r0 == 0) goto L57
            X.26D r0 = X.26D.A09
            r307 = r0
            r0 = r301
            X.25p r0 = r0._config
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.A0G(r1)
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L5a
        L57:
            r0 = 1
            r308 = r0
        L5a:
            r0 = r304
            boolean r0 = r0 instanceof java.io.IOException
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7a
            r0 = r308
            if (r0 == 0) goto L75
            r0 = r304
            boolean r0 = r0 instanceof X.2LE
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L86
        L75:
            r0 = r304
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L7a:
            r0 = r308
            if (r0 != 0) goto L86
            r0 = r304
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.27C.A0H(r0)
        L86:
            r0 = r302
            r1 = r303
            r2 = r304
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.2cb r0 = X.C2cb.A02(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(X.26c, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r301._config.A0G(X.26D.A09) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if ((r303 instanceof X.2LE) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C26c r301, java.lang.Object r302, java.lang.Throwable r303, int r304) {
        /*
        L0:
            r0 = r303
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = r303
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L24
            r0 = r303
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r303 = r0
            goto L0
        L24:
            X.27F[] r0 = X.27C.A01
            r306 = r0
            r0 = r303
            boolean r0 = r0 instanceof java.lang.Error
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L75
            r0 = r301
            if (r0 == 0) goto L57
            X.26D r0 = X.26D.A09
            r307 = r0
            r0 = r301
            X.25p r0 = r0._config
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.A0G(r1)
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L5a
        L57:
            r0 = 1
            r308 = r0
        L5a:
            r0 = r303
            boolean r0 = r0 instanceof java.io.IOException
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7a
            r0 = r308
            if (r0 == 0) goto L75
            r0 = r303
            boolean r0 = r0 instanceof X.2LE
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L86
        L75:
            r0 = r303
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L7a:
            r0 = r308
            if (r0 != 0) goto L86
            r0 = r303
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.27C.A0H(r0)
        L86:
            r0 = r302
            r1 = r303
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = r304
            X.2cb r0 = X.C2cb.A03(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.26c, java.lang.Object, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e A[Catch: all -> 0x01b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x00d6, B:18:0x00dc, B:23:0x00ec, B:29:0x010b, B:30:0x0112, B:33:0x011e, B:36:0x0130, B:42:0x0144, B:43:0x014b, B:45:0x0153, B:48:0x0160, B:52:0x0173, B:53:0x0179, B:55:0x0183, B:58:0x019f), top: B:16:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0192 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A0C(X.68U r302, com.fasterxml.jackson.databind.JsonSerializer r303, X.C26c r304) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A0C(X.68U, com.fasterxml.jackson.databind.JsonSerializer, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public void A0D(C26c c26c, Object obj) {
        int i = C25p.A00;
        Class cls = this._handledType;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Cannot resolve PropertyFilter with id '");
        A0k.append(obj);
        c26c.A0E(AnonymousClass001.A0d("'; no FilterProvider configured", A0k), cls);
        throw 0Q8.createAndThrow();
    }
}
