package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cqd.class */
public final class Cqd implements DIB {
    public 1BY A00;
    public final 53M A03;
    public final C00i A02 = 1BV.A01((1BY) null, 99945);
    public final C00i A01 = 1BV.A01((1BY) null, 82623);

    public Cqd(1BO r302, 53M r303) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = r303;
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if (r0 == X.53M.A01) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r303
            java.lang.String r0 = (java.lang.String) r0
            r303 = r0
            r0 = r303
            boolean r0 = X.1JF.A0A(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L12
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        L12:
            r0 = r303
            java.lang.String r0 = r0.trim()
            r305 = r0
            r0 = r305
            boolean r0 = X.BXs.A00(r0)
            r0 = r301
            X.00i r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.CIM r0 = (X.CIM) r0
            r306 = r0
            r0 = r305
            boolean r0 = X.IJ6.A00(r0)
            r0 = r306
            com.google.common.collect.ImmutableList r0 = r0.A01()
            r307 = r0
            com.google.common.collect.ImmutableList$Builder r0 = X.4YU.A0h()
            r308 = r0
            r0 = r301
            X.53M r0 = r0.A03
            r305 = r0
            X.53M r0 = X.53M.A02
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L5f
            X.53M r0 = X.53M.A01
            r306 = r0
            r0 = 0
            r309 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L62
        L5f:
            r0 = 1
            r309 = r0
        L62:
            r0 = r307
            X.1Du r0 = r0.iterator()
            r310 = r0
        L69:
            r0 = r310
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lc1
            r0 = r310
            com.facebook.user.model.User r0 = X.AbG.A0t(r0)
            r311 = r0
            r0 = r309
            if (r0 == 0) goto L9e
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.7Yv r0 = (X.7Yv) r0
            r306 = r0
            r0 = r306
            r1 = r311
            boolean r0 = r0.A00(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L9e
            goto L69
        L9e:
            X.53N r0 = X.53N.A0X
            r307 = r0
            com.facebook.messaging.search.constants.ClientDataSourceIdentifier r0 = com.facebook.messaging.search.constants.ClientDataSourceIdentifier.A0h
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r1 = r305
            r2 = r307
            r3 = r311
            X.AcX r0 = X.AcX.A03(r0, r1, r2, r3)
            r306 = r0
            r0 = r308
            r1 = r306
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
            goto L69
        Lc1:
            r0 = r308
            com.google.common.collect.ImmutableList r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqd.B7q(X.ByH, java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public String getFriendlyName() {
        return "PhoneContactsSearchItemDataSource";
    }
}
