package X;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: F8J.class */
public final class F8J {
    public BluetoothGattServer A00;
    public final BluetoothManager A01;
    public final Context A02;
    public final Executor A05;
    public static final UUID A08 = UUID.fromString("c2fc1204-bdbf-40ac-9b70-df64a14c43df");
    public static final UUID A07 = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public final Set A04 = 7zL.A15();
    public final byte[] A06 = new byte[2];
    public final PzP A03 = new PzP(this);

    public F8J(BluetoothManager bluetoothManager, Context context, Executor executor) {
        this.A02 = context;
        this.A01 = bluetoothManager;
        this.A05 = executor;
    }

    public final void A00(Function1 function1) {
        BluetoothGattServer bluetoothGattServer = this.A00;
        if (bluetoothGattServer == null) {
            function1.invoke(null);
            return;
        }
        this.A00 = null;
        try {
            bluetoothGattServer.close();
        } catch (Throwable th) {
            new 0DV(th);
        }
        function1.invoke(this);
    }
}
