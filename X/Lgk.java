package X;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import java.util.Iterator;

/* loaded from: Lgk.class */
public final class Lgk implements MJh {
    public java.util.Map A00;
    public final KgA A01;

    public Lgk(KgA kgA) {
        this.A01 = kgA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.location.LocationManager] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.location.Location] */
    @Override // X.MJh
    public void At5(MJ4 mj4) {
        if (mj4 == null) {
            throw AnonymousClass001.A0Q("callback == null");
        }
        LocationManager locationManager = this.A01.A00;
        Iterator<String> it = locationManager.getAllProviders().iterator();
        Location location = null;
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Object obj = locationManager;
            try {
                obj = 0QZ.A00((LocationManager) obj, A0i);
                if (obj != 0 && KYq.A00((Location) obj, location)) {
                    location = obj;
                }
            } catch (IllegalArgumentException unused) {
                android.util.Log.e("AndroidLocationEngine", obj.toString());
            }
        }
        if (location != null) {
            KzM.A00(mj4, location);
        } else {
            mj4.onFailure(new Exception("Last location unavailable"));
        }
    }

    @Override // X.MJh
    public void Cec(MJ4 mj4) {
        if (mj4 == null) {
            throw AnonymousClass001.A0Q("callback == null");
        }
        KgA kgA = this.A01;
        java.util.Map map = this.A00;
        LocationListener locationListener = (LocationListener) (map != null ? map.remove(mj4) : null);
        if (locationListener != null) {
            0QZ.A01(locationListener, kgA.A00);
        }
    }

    @Override // X.MJh
    public void Cgy(Looper looper, MJ4 mj4, Kzo kzo) {
        Looper looper2 = looper;
        if (kzo == null) {
            throw AnonymousClass001.A0Q("request == null");
        }
        if (mj4 == null) {
            throw AnonymousClass001.A0Q("callback == null");
        }
        KgA kgA = this.A01;
        java.util.Map map = this.A00;
        if (map == null) {
            map = JQx.A13();
            this.A00 = map;
        }
        Object obj = map.get(mj4);
        if (obj == null) {
            obj = new LFu(mj4);
        }
        this.A00.put(mj4, obj);
        if (looper == null) {
            looper2 = Looper.getMainLooper();
        }
        LocationListener locationListener = (LocationListener) obj;
        LocationManager locationManager = kgA.A00;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(3);
        String bestProvider = locationManager.getBestProvider(criteria, true);
        if (bestProvider == null) {
            bestProvider = "passive";
        }
        0QZ r0 = 0QZ.$redex_init_class;
        0HM.A00();
        locationManager.requestLocationUpdates(bestProvider, 1000L, 0.0f, locationListener, looper2);
    }
}
