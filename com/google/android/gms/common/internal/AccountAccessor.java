package com.google.android.gms.common.internal;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;

/* loaded from: AccountAccessor.class */
public abstract class AccountAccessor extends zzb implements IAccountAccessor {
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.common.zza, com.google.android.gms.common.internal.IAccountAccessor] */
    public static IAccountAccessor A00(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        ?? zzaVar = new zza("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
        0FI.A09(1342352058, 0FI.A03(2075624599));
        return zzaVar;
    }
}
