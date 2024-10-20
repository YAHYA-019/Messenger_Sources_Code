package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.DKC;
import X.JQx;
import X.JQy;
import X.JR1;
import android.graphics.PointF;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.geometry.VisibleRegion;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Projection.class */
public class Projection {
    public int[] contentPadding = {0, 0, 0, 0};
    public final MapView mapView;
    public final NativeMap nativeMapView;

    public Projection(NativeMap nativeMap, MapView mapView) {
        this.nativeMapView = nativeMap;
        this.mapView = mapView;
    }

    public static double bearing(LatLng latLng, LatLng latLng2) {
        double degreesToRadians = degreesToRadians(latLng.longitude);
        double degreesToRadians2 = degreesToRadians(latLng2.longitude);
        double degreesToRadians3 = degreesToRadians(latLng.latitude);
        double degreesToRadians4 = degreesToRadians(latLng2.latitude);
        double d = degreesToRadians2 - degreesToRadians;
        double sin = Math.sin(d);
        double cos = Math.cos(degreesToRadians4);
        return radiansToDegrees(Math.atan2(sin * cos, (Math.cos(degreesToRadians3) * Math.sin(degreesToRadians4)) - ((Math.sin(degreesToRadians3) * cos) * Math.cos(d))));
    }

    public static double degreesToRadians(double d) {
        return JQy.A00(d % 360.0d);
    }

    public static double getLongitudeSpan(double d, double d2) {
        double A01 = JQx.A01(d, d2);
        return d > d2 ? A01 : 360.0d - A01;
    }

    public static double radiansToDegrees(double d) {
        return ((d % 6.283185307179586d) * 180.0d) / 3.141592653589793d;
    }

    public double calculateZoom(float f) {
        return this.nativeMapView.getZoom() + (Math.log(f) / Math.log(2.0d));
    }

    public LatLng fromScreenLocation(PointF pointF) {
        return this.nativeMapView.latLngForPixel(pointF);
    }

    public int[] getContentPadding() {
        return this.contentPadding;
    }

    public float getHeight() {
        return DKC.A03(this.mapView);
    }

    public LatLng getLatLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return this.nativeMapView.latLngForProjectedMeters(projectedMeters);
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return this.nativeMapView.getMetersPerPixelAtLatitude(d);
    }

    public ProjectedMeters getProjectedMetersForLatLng(LatLng latLng) {
        return this.nativeMapView.projectedMetersForLatLng(latLng);
    }

    public VisibleRegion getVisibleRegion() {
        return getVisibleRegion(true);
    }

    public VisibleRegion getVisibleRegion(boolean z) {
        float f;
        float f2;
        float height;
        float f3 = 0.0f;
        if (z) {
            f = DKC.A02(this.mapView);
            height = DKC.A03(this.mapView);
            f2 = 0.0f;
        } else {
            f3 = JQx.A0M(this.contentPadding);
            int width = this.mapView.getWidth();
            int[] iArr = this.contentPadding;
            f = width - iArr[2];
            f2 = iArr[1];
            height = this.mapView.getHeight() - this.contentPadding[3];
        }
        LatLng A0h = JR1.A0h(this, ((f - f3) / 2.0f) + f3, ((height - f2) / 2.0f) + f2);
        LatLng A0h2 = JR1.A0h(this, f3, f2);
        LatLng A0h3 = JR1.A0h(this, f, f2);
        LatLng A0h4 = JR1.A0h(this, f, height);
        LatLng A0h5 = JR1.A0h(this, f3, height);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(A0h3);
        A0s.add(A0h4);
        A0s.add(A0h5);
        A0s.add(A0h2);
        Iterator it = A0s.iterator();
        double d = -90.0d;
        double d2 = 90.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        while (it.hasNext()) {
            LatLng latLng = (LatLng) it.next();
            if (bearing(A0h, latLng) >= 0.0d) {
                double d7 = latLng.longitude;
                double longitudeSpan = getLongitudeSpan(d7, A0h.longitude);
                if (longitudeSpan > d4) {
                    d5 = d7;
                    d4 = longitudeSpan;
                }
            } else {
                double d8 = A0h.longitude;
                double d9 = latLng.longitude;
                double longitudeSpan2 = getLongitudeSpan(d8, d9);
                if (longitudeSpan2 > d3) {
                    d6 = d9;
                    d3 = longitudeSpan2;
                }
            }
            double d10 = latLng.latitude;
            if (d < d10) {
                d = d10;
            }
            if (d2 > d10) {
                d2 = d10;
            }
        }
        if (d5 < d6) {
            d5 += 360.0d;
        }
        return new VisibleRegion(A0h2, A0h3, A0h5, A0h4, LatLngBounds.from(d, d5, d2, d6));
    }

    public float getWidth() {
        return DKC.A02(this.mapView);
    }

    public void invalidateContentPadding() {
        setContentPadding(this.contentPadding);
    }

    public void setContentPadding(int[] iArr) {
        this.contentPadding = iArr;
        int length = iArr.length;
        float[] fArr = new float[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.nativeMapView.setContentPadding(fArr);
                return;
            } else {
                fArr[i2] = iArr[i2];
                i = i2 + 1;
            }
        }
    }

    public PointF toScreenLocation(LatLng latLng) {
        return this.nativeMapView.pixelForLatLng(latLng);
    }
}
