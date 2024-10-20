package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.video.heroplayer.service.HeroKeepAliveService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.51a, reason: invalid class name */
/* loaded from: 51a.class */
public final class C51a {
    public static C51a A05;
    public static volatile boolean A06;
    public final Context A00;
    public volatile Intent A02;
    public volatile Boolean A04;
    public volatile ServiceConnection A03 = new ServiceConnection() { // from class: X.51d
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C51f.A01("HeroKeepAliveService.Client", "Service Connected", new Object[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C51f.A01("HeroKeepAliveService.Client", "Service Disconnected", AnonymousClass001.A1Z());
        }
    };
    public final AtomicLong A01 = new AtomicLong();

    public C51a(Context context) {
        this.A00 = context;
        this.A02 = new Intent(context, (Class<?>) HeroKeepAliveService.class);
    }
}
