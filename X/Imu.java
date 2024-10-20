package X;

import com.google.common.base.Function;

/* loaded from: Imu.class */
public final class Imu implements Function {
    public static final Imu A00 = new Imu();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0077, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        r310 = X.1BL.A0z(r0);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if (r0.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        r310.add(X.7zL.A0P(r0).A0K(237144788, X.2JX.class, -974634807));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        return X.1BK.A1G(r308, r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        r310 = X.AnonymousClass001.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r308 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        r0 = X.1BK.A0B(r0, X.2JX.class, -148042565, 692110035);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r0 = r0.A0c(100526016, X.2JX.class, -762115105);
     */
    @Override // com.google.common.base.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.4mh r0 = (X.AbstractC08294mh) r0
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.A03
            X.2JY r0 = (X.2JY) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            java.lang.Class<X.2JX> r0 = X.2JX.class
            r304 = r0
            r0 = -148042565(0xfffffffff72d0cbb, float:-3.5098655E33)
            r305 = r0
            r0 = 692110035(0x2940c2d3, float:4.2801547E-14)
            r306 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            r3 = r306
            X.2JY r0 = X.1BK.A0B(r0, r1, r2, r3)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3e
            r0 = 1060506683(0x3f360c3b, float:0.7111241)
            r306 = r0
            r0 = r307
            r1 = r306
            java.lang.String r0 = r0.A0r(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L46
        L3e:
            java.lang.String r0 = ""
            r308 = r0
            r0 = r303
            if (r0 == 0) goto Lbb
        L46:
            java.lang.Class<X.2JX> r0 = X.2JX.class
            r309 = r0
            r0 = -148042565(0xfffffffff72d0cbb, float:-3.5098655E33)
            r305 = r0
            r0 = 692110035(0x2940c2d3, float:4.2801547E-14)
            r306 = r0
            r0 = r303
            r1 = r309
            r2 = r305
            r3 = r306
            X.2JY r0 = X.1BK.A0B(r0, r1, r2, r3)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lbb
            r0 = 100526016(0x5fde7c0, float:2.3877137E-35)
            r305 = r0
            r0 = -762115105(0xffffffffd2930bdf, float:-3.1577968E11)
            r306 = r0
            r0 = r304
            r1 = r305
            r2 = r309
            r3 = r306
            com.google.common.collect.ImmutableList r0 = r0.A0c(r1, r2, r3)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lbb
            r0 = r307
            java.util.ArrayList r0 = X.1BL.A0z(r0)
            r310 = r0
            r0 = r307
            java.util.Iterator r0 = r0.iterator()
            r311 = r0
        L88:
            r0 = r311
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc0
            r0 = r311
            X.2JY r0 = X.7zL.A0P(r0)
            r303 = r0
            r0 = 237144788(0xe228ad4, float:2.0034885E-30)
            r312 = r0
            r0 = -974634807(0xffffffffc5e840c9, float:-7432.098)
            r305 = r0
            r0 = r303
            r1 = r312
            r2 = r309
            r3 = r305
            com.facebook.graphservice.tree.TreeJNI r0 = r0.A0K(r1, r2, r3)
            r307 = r0
            r0 = r310
            r1 = r307
            boolean r0 = r0.add(r1)
            goto L88
        Lbb:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r310 = r0
        Lc0:
            r0 = r308
            r1 = r310
            X.03Y r0 = X.1BK.A1G(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Imu.apply(java.lang.Object):java.lang.Object");
    }
}
