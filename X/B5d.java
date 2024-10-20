package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import java.util.Iterator;

/* loaded from: B5d.class */
public final class B5d extends HuQ {
    public 1BY A00;

    public Uri A00() {
        return BZF.A00;
    }

    public Iterator A01(Cursor cursor, LocalMediaLoaderParams localMediaLoaderParams) {
        C1F6 c1f6 = (C1F6) 1Bn.A0E((Context) null, this.A00, 472);
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

    public boolean A03(LocalMediaLoaderParams localMediaLoaderParams) {
        return localMediaLoaderParams.A06;
    }

    public String[] A04() {
        return BZF.A01;
    }
}
