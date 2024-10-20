package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.2v7, reason: invalid class name */
/* loaded from: 2v7.class */
public final class C2v7 {
    public final Context A00;
    public final C2ta A01;
    public final C2uz A02;
    public final Set A03 = new HashSet();
    public final Executor A04;
    public final ConnectivityManager A05;
    public final 2vA A06;
    public final C2v3 A07;
    public final C00a A08;
    public final Collection A09;

    public C2v7(Context context, 1Fe r303, C2ta c2ta, C2v2 c2v2, C2uz c2uz, C2v3 c2v3, C00a c00a, Collection collection, Executor executor) {
        this.A01 = c2ta;
        this.A08 = c00a;
        this.A02 = c2uz;
        this.A04 = executor;
        this.A00 = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A05 = connectivityManager;
        this.A07 = c2v3;
        if (connectivityManager == null) {
            0fH.A0o("AppModuleManager", "Failed to get ConnectivityManager");
        }
        this.A09 = collection;
        collection.add(new C2v8(r303, c2v2));
        collection.add(new C2v9(true));
        this.A06 = new 2vA(context, (ConnectivityManager) context.getSystemService("connectivity"), c2ta, c00a);
        00Y A00 = 00Y.A00();
        A00.A05(new 2vB(r303, this, A00), this.A04);
    }

    public final 2vD A00(2vC r302) {
        return new 2vD(this.A06, this, r302, this.A07, this.A09);
    }
}
