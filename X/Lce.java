package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzw;

/* loaded from: Lce.class */
public final /* synthetic */ class Lce implements MGB {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ K2M A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ Lce(Account account, Bundle bundle, K2M k2m, String str) {
        this.A02 = k2m;
        this.A00 = account;
        this.A03 = str;
        this.A01 = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        zza zzaVar = (zza) ((2AD) obj).A03();
        zzw zzwVar = new zzw((4FE) obj2);
        Account account = this.A00;
        String str = this.A03;
        Bundle bundle = this.A01;
        int A03 = 0FI.A03(1258638941);
        Parcel A00 = zzaVar.A00();
        JQx.A19(zzwVar, A00);
        L6j.A00(A00, account);
        A00.writeString(str);
        L6j.A00(A00, bundle);
        zzaVar.A02(A00, 1);
        0FI.A09(1270717686, A03);
    }
}
