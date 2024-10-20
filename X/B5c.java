package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import java.util.Iterator;

/* loaded from: B5c.class */
public final class B5c extends HuQ {
    public 1BY A00;

    public Uri A00() {
        return BZE.A00;
    }

    public Iterator A01(Cursor cursor, LocalMediaLoaderParams localMediaLoaderParams) {
        C1F6 c1f6 = (C1F6) 1Bn.A0E((Context) null, this.A00, 471);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            DAt dAt = new DAt(cursor, localMediaLoaderParams, (5HV) 1Bi.A03(49642));
            1Bn.A0K();
            FbInjector.A04(A01);
            return dAt;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302.A04 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(com.facebook.messaging.media.loader.LocalMediaLoaderParams r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L14
            r0 = r302
            boolean r0 = r0.A04
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5c.A03(com.facebook.messaging.media.loader.LocalMediaLoaderParams):boolean");
    }

    public String[] A04() {
        return BZE.A01;
    }
}
