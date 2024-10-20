package com.google.android.gms.dynamic;

import X.0FI;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;

/* loaded from: IObjectWrapper.class */
public interface IObjectWrapper extends IInterface {

    /* loaded from: IObjectWrapper$Stub.class */
    public abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            0FI.A09(315065025, 0FI.A03(369804989));
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.common.zza] */
        public static IObjectWrapper A01(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            ?? zzaVar = new zza("com.google.android.gms.dynamic.IObjectWrapper", iBinder);
            0FI.A09(-187073898, 0FI.A03(1047145825));
            return zzaVar;
        }
    }
}
