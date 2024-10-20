package androidx.room;

import X.1BK;
import X.JWh;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

/* loaded from: MultiInstanceInvalidationService.class */
public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final Map A02 = 1BK.A1C();
    public final RemoteCallbackList A01 = new JWh(this);
    public final MultiInstanceInvalidationService$binder$1 A03 = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A03;
    }
}
