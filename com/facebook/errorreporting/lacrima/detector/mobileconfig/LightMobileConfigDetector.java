package com.facebook.errorreporting.lacrima.detector.mobileconfig;

import X.0fH;
import X.0gK;
import X.0iP;
import X.C0g6;
import X.C0gq;
import X.C0iO;
import X.C0il;
import X.C0iy;
import X.C0l0;
import X.C0qh;
import com.facebook.errorreporting.lacrima.detector.mobileconfig.LightMobileConfigDetector;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigCanaryChangeListener;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* loaded from: LightMobileConfigDetector.class */
public final class LightMobileConfigDetector implements C0iO {
    public final 0gK collectorManager;
    public HybridData mHybridData;
    public final String TAG = "MobileConfigDetector";
    public String lastValue = "[]";

    public LightMobileConfigDetector(0gK r302) {
        this.collectorManager = r302;
    }

    public static final /* synthetic */ void access$onUpdate(LightMobileConfigDetector lightMobileConfigDetector) {
        try {
            String allCanaryData = lightMobileConfigDetector.getAllCanaryData();
            if (allCanaryData == null) {
                C0iy.A00().Bwu("LightMCDetectorOnUpdate", null, null);
                0fH.A0n("MobileConfigDetector", "Unable to fetch data from getAllCanaryData().");
                return;
            }
            synchronized (lightMobileConfigDetector) {
                if (allCanaryData.length() != 0 && !allCanaryData.equals("[]") && !allCanaryData.equals(lightMobileConfigDetector.lastValue)) {
                    lightMobileConfigDetector.lastValue = allCanaryData;
                    C0qh A00 = C0qh.A00();
                    A00.A05(C0g6.A7G, allCanaryData);
                    lightMobileConfigDetector.collectorManager.A0A(A00, C0gq.CRITICAL_REPORT, lightMobileConfigDetector);
                    lightMobileConfigDetector.collectorManager.A0A(A00, C0gq.LARGE_REPORT, lightMobileConfigDetector);
                }
            }
        } catch (Throwable th) {
            C0iy.A02("MobileConfigDetector", "Light Mobile Config canary retrieval failed.", th).Bwu("LightMCCanaryFetch", th, null);
        }
    }

    private final native String getAllCanaryData();

    private final native HybridData initHybrid();

    private final native String setUpdateListener(MobileConfigCanaryChangeListener mobileConfigCanaryChangeListener);

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0I;
    }

    @Override // X.C0iO
    public void start() {
        try {
            C0il.A0B("lacrimamobileconfig-jni");
            this.mHybridData = initHybrid();
            String updateListener = setUpdateListener(new MobileConfigCanaryChangeListener() { // from class: X.0ho
                @Override // com.facebook.mobileconfig.MobileConfigCanaryChangeListener
                public final void onConfigChanged() {
                    LightMobileConfigDetector.access$onUpdate(LightMobileConfigDetector.this);
                }
            });
            if (updateListener == null) {
                C0iy.A00().Bwu("LightMCDetectorInstallListener", null, null);
                0fH.A0n("MobileConfigDetector", "Unable to fetch data from setUpdateListener().");
                return;
            }
            synchronized (this) {
                if (updateListener.length() != 0 && !updateListener.equals("[]")) {
                    this.lastValue = updateListener;
                    C0qh A00 = C0qh.A00();
                    A00.A05(C0g6.A7G, updateListener);
                    this.collectorManager.A0A(A00, C0gq.CRITICAL_REPORT, this);
                    this.collectorManager.A0A(A00, C0gq.LARGE_REPORT, this);
                }
            }
        } catch (UnsatisfiedLinkError e) {
            C0iy.A00().Bwu("MobileConfigDetectorLoader", e, null);
            0fH.A0v("MobileConfigDetector", "Unable to load liblacrimamobileconfig-jni.", e);
        }
    }
}
