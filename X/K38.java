package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* loaded from: K38.class */
public final class K38 extends 2AC implements MQg {
    public final Integer A00;
    public final Bundle A01;
    public final 2A9 A02;

    public K38(Context context, Bundle bundle, Looper looper, 2A4 r305, 2A6 r306, 2A9 r307) {
        super(context, looper, r305, r306, r307, 44);
        this.A02 = r307;
        this.A01 = bundle;
        this.A00 = r307.A00;
    }

    public final Bundle A02() {
        String str = this.A02.A02;
        if (!((2AD) this).A0F.getPackageName().equals(str)) {
            this.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.A01;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (!(queryLocalInterface instanceof zaf)) {
                zaa zaaVar = new zaa("com.google.android.gms.signin.internal.ISignInService", iBinder);
                0FI.A09(1700845582, 0FI.A03(-1717546403));
                return zaaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String A06() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean ChO() {
        return true;
    }

    @Override // X.MQg
    public final void DBc(zae zaeVar) {
        try {
            String A00 = 1BJ.A00(633);
            Account account = new Account(A00, "com.google");
            GoogleSignInAccount A04 = A00.equals(account.name) ? LCo.A00(((2AD) this).A0F).A04() : null;
            Integer num = this.A00;
            AbstractC00481b7.A02(num);
            zat zatVar = new zat(account, A04, 2, num.intValue());
            zaa zaaVar = (zaa) A03();
            zai zaiVar = new zai(zatVar, 1);
            int A03 = 0FI.A03(2108055427);
            Parcel A002 = zaaVar.A00();
            A002.writeInt(1);
            zaiVar.writeToParcel(A002, 0);
            JQx.A19(zaeVar, A002);
            zaaVar.A02(A002, 12);
            0FI.A09(-1036543505, A03);
        } catch (RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.DBZ(new zak(new ConnectionResult(8, null), null, 1));
            } catch (RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
