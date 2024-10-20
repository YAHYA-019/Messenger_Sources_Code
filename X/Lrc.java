package X;

import android.os.RemoteException;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteWorkManagerImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import java.util.List;

/* loaded from: Lrc.class */
public final class Lrc implements Runnable {
    public static final String A01 = 4IS.A01("ListenableCallbackRbl");
    public static final String __redex_internal_original_name = "ListenableCallback$ListenableCallbackRunnable";
    public final Kih A00;

    public Lrc(Kih kih) {
        this.A00 = kih;
    }

    public static void A00(IWorkManagerImplCallback iWorkManagerImplCallback, Throwable th) {
        try {
            iWorkManagerImplCallback.Bxe(th.getMessage());
        } catch (RemoteException e) {
            4IS.A00();
            android.util.Log.e(A01, "Unable to notify failures in operation", e);
        }
    }

    public static void A01(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        try {
            iWorkManagerImplCallback.COv(bArr);
        } catch (RemoteException e) {
            4IS.A00();
            android.util.Log.e(A01, "Unable to notify successful operation", e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            JjQ jjQ = this.A00;
            A01(jjQ.A00, 7 - jjQ.A00 != 0 ? RemoteWorkManagerImpl.A01 : KvZ.A01(new ParcelableWorkInfos((List) jjQ.A01.get())));
        } catch (Throwable th) {
            A00(this.A00.A00, th);
        }
    }
}
