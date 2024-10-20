package android.view;

import X.0FI;
import X.0Q8;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: IRotationWatcher.class */
public interface IRotationWatcher extends IInterface {

    /* loaded from: IRotationWatcher$Stub.class */
    public abstract class Stub extends Binder implements IRotationWatcher {

        /* loaded from: IRotationWatcher$Stub$Proxy.class */
        public class Proxy implements IRotationWatcher {
            public Proxy(IBinder iBinder) {
                0FI.A09(875279929, 0FI.A03(851862653));
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                0FI.A09(1166090037, 0FI.A03(2136751874));
                return null;
            }

            public String getInterfaceDescriptor() {
                0FI.A09(1597013778, 0FI.A03(540220819));
                return null;
            }

            @Override // android.view.IRotationWatcher
            public void onRotationChanged(int i) {
                0FI.A09(-1896582477, 0FI.A03(1888122664));
            }
        }

        public Stub() {
            throw 0Q8.createAndThrow();
        }

        public static IRotationWatcher asInterface(IBinder iBinder) {
            return null;
        }

        @Override // android.os.IInterface
        public abstract IBinder asBinder();

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw 0Q8.createAndThrow();
        }
    }

    void onRotationChanged(int i);
}
