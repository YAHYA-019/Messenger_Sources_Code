package androidx.work.multiprocess;

import X.0FI;
import X.AnonymousClass001;
import X.C4Ks;
import X.LG8;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import java.util.NoSuchElementException;

/* loaded from: RemoteCallback.class */
public class RemoteCallback extends IWorkManagerImplCallback.Stub {
    public IBinder A00;
    public final IBinder.DeathRecipient A01;
    public final C4Ks A02;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.4Ks] */
    public RemoteCallback() {
        int A03 = 0FI.A03(82497104);
        this.A00 = null;
        this.A02 = new Object();
        this.A01 = new LG8(this);
        0FI.A09(-1621771810, A03);
    }

    private void A01(Throwable th) {
        int A03 = 0FI.A03(433217085);
        this.A02.A07(th);
        int A032 = 0FI.A03(2045377316);
        IBinder iBinder = this.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        0FI.A09(901301854, A032);
        A02();
        0FI.A09(-332758699, A03);
    }

    public void A02() {
        0FI.A09(2104046337, 0FI.A03(1474174170));
    }

    public void A03(IBinder iBinder) {
        int A03 = 0FI.A03(-1341687036);
        this.A00 = iBinder;
        try {
            iBinder.linkToDeath(this.A01, 0);
        } catch (RemoteException e) {
            A01(e);
        }
        0FI.A09(-2147220116, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void Bxe(String str) {
        int A03 = 0FI.A03(-533476537);
        A01(AnonymousClass001.A0T(str));
        0FI.A09(-1795988118, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void COv(byte[] bArr) {
        int A03 = 0FI.A03(1096329657);
        this.A02.A06(bArr);
        int A032 = 0FI.A03(2045377316);
        IBinder iBinder = this.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        0FI.A09(901301854, A032);
        A02();
        0FI.A09(2141265685, A03);
    }
}
