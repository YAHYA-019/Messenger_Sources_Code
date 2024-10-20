package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import java.util.Comparator;

/* loaded from: B88.class */
public final class B88 extends BhE implements DIB, DEk {
    public static final Comparator A0I = new DAi(RrW.A00);
    public 1qH A00;
    public String A01;
    public final Context A02;
    public final FbUserSession A03;
    public final C00i A04;
    public final 53M A05;
    public final boolean A06;
    public final boolean A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C15h A0H;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00e2, code lost:
    
        if (X.AbJ.A0f(r0).AZk(36321322947264710L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B88(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.53M r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B88.<init>(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.53M, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0490, code lost:
    
        if (r309 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r316 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0426, code lost:
    
        if (r309 != null) goto L212;
     */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B88.B7q(X.ByH, java.lang.String):com.google.common.collect.ImmutableList");
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0E;
    }

    @Override // X.DEk
    public void CuT(String str) {
        if (1JF.A0C(str, this.A01)) {
            return;
        }
        this.A01 = str;
    }

    public String getFriendlyName() {
        return "LocalAllContactsSearchItemDataSource";
    }
}
