package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p001authapi.zba;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: K31.class */
public final class K31 extends 2AC {
    public final GoogleSignInOptions A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Scope[], X.L2d] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Set, java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.L2d, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Set, boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, boolean] */
    public K31(Context context, Looper looper, GoogleSignInOptions googleSignInOptions, 2A4 r305, 2A6 r306, 2A9 r307) {
        super(context, looper, r305, r306, r307, 91);
        if (googleSignInOptions != null) {
            new L2d(googleSignInOptions);
        } else {
            new L2d();
        }
        ?? A00 = Kxc.A00();
        A00.A02 = A00;
        L2d isEmpty = r307.A06.isEmpty();
        if (isEmpty == 0) {
            Iterator it = isEmpty.iterator();
            while (true) {
                isEmpty = it.hasNext();
                if (isEmpty == 0) {
                    break;
                }
                isEmpty.next();
                ?? r0 = new Scope[0].A03;
                r0.add(r0);
                ?? asList = Arrays.asList(r0);
                asList.addAll(asList);
                it = asList;
            }
        }
        this.A00 = isEmpty.A00();
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            if (!(queryLocalInterface instanceof zbs)) {
                zba zbaVar = new zba("com.google.android.gms.auth.api.signin.internal.ISignInService", iBinder);
                0FI.A09(-681929767, 0FI.A03(-1295379807));
                return zbaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final Intent BB1() {
        return L9Z.A00(((2AD) this).A0F, this.A00);
    }

    public final boolean CZl() {
        return true;
    }
}
