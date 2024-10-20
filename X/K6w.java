package X;

import android.app.PendingIntent;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* loaded from: K6w.class */
public final class K6w extends K7w {
    public final /* synthetic */ PendingIntent A00;
    public final /* synthetic */ LocationRequest A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K6w(PendingIntent pendingIntent, 28M r303, LocationRequest locationRequest) {
        super(LocationServices.A01, r303);
        this.A01 = locationRequest;
        this.A00 = pendingIntent;
    }
}
