package com.mapbox.mapboxsdk.camera;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQx;
import X.JQz;
import X.JR1;
import android.graphics.Point;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Projection;
import com.mapbox.mapboxsdk.maps.UiSettings;
import java.util.Arrays;

/* loaded from: CameraUpdateFactory.class */
public final class CameraUpdateFactory {

    /* loaded from: CameraUpdateFactory$CameraBoundsUpdate.class */
    public final class CameraBoundsUpdate implements CameraUpdate {
        public LatLngBounds bounds;
        public int[] padding;

        public CameraBoundsUpdate(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
            this(latLngBounds, new int[]{i, i2, i3, i4});
        }

        public CameraBoundsUpdate(LatLngBounds latLngBounds, int[] iArr) {
            this.bounds = latLngBounds;
            this.padding = iArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CameraBoundsUpdate cameraBoundsUpdate = (CameraBoundsUpdate) obj;
            if (this.bounds.equals(cameraBoundsUpdate.bounds)) {
                return Arrays.equals(this.padding, cameraBoundsUpdate.padding);
            }
            return false;
        }

        public LatLngBounds getBounds() {
            return this.bounds;
        }

        @Override // com.mapbox.mapboxsdk.camera.CameraUpdate
        public CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            return mapboxMap.getCameraForLatLngBounds(this.bounds, this.padding);
        }

        public int[] getPadding() {
            return this.padding;
        }

        public int hashCode() {
            return 1BL.A03(this.bounds) + Arrays.hashCode(this.padding);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CameraBoundsUpdate{bounds=");
            A0k.append(this.bounds);
            A0k.append(", padding=");
            A0k.append(Arrays.toString(this.padding));
            return AnonymousClass001.A0f(A0k);
        }
    }

    /* loaded from: CameraUpdateFactory$CameraMoveUpdate.class */
    public final class CameraMoveUpdate implements CameraUpdate {
        public float x;
        public float y;

        public CameraMoveUpdate(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                CameraMoveUpdate cameraMoveUpdate = (CameraMoveUpdate) obj;
                if (Float.compare(cameraMoveUpdate.x, this.x) != 0) {
                    return false;
                }
                if (Float.compare(cameraMoveUpdate.y, this.y) != 0) {
                    z = false;
                }
            }
            return z;
        }

        @Override // com.mapbox.mapboxsdk.camera.CameraUpdate
        public CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            UiSettings uiSettings = mapboxMap.uiSettings;
            Projection projection = mapboxMap.projection;
            float width = uiSettings.getWidth();
            float height = uiSettings.getHeight();
            float A0M = width - JQx.A0M(r0);
            float f = mapboxMap.projection.contentPadding[1];
            LatLng A0h = JR1.A0h(projection, ((A0M + f) / 2.0f) + this.x, (((height + f) - r0[3]) / 2.0f) + this.y);
            CameraPosition A0Z = JQz.A0Z(mapboxMap);
            CameraPosition.Builder builder = new CameraPosition.Builder();
            builder.target = A0h;
            builder.zoom = A0Z.zoom;
            builder.tilt(A0Z.tilt);
            builder.bearing(A0Z.bearing);
            return builder.build();
        }

        public int hashCode() {
            float f = this.x;
            int i = 0;
            int A06 = JR1.A06((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f) * 31;
            float f2 = this.y;
            if (f2 != 0.0f) {
                i = Float.floatToIntBits(f2);
            }
            return A06 + i;
        }

        public String toString() {
            return 0Pz.A0a("CameraMoveUpdate{x=", ", y=", '}', this.x, this.y);
        }
    }

    /* loaded from: CameraUpdateFactory$CameraPositionUpdate.class */
    public final class CameraPositionUpdate implements CameraUpdate {
        public final double bearing;
        public final LatLng target;
        public final double tilt;
        public final double zoom;

        public CameraPositionUpdate(double d, LatLng latLng, double d2, double d3) {
            this.bearing = d;
            this.target = latLng;
            this.tilt = d2;
            this.zoom = d3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                CameraPositionUpdate cameraPositionUpdate = (CameraPositionUpdate) obj;
                if (Double.compare(cameraPositionUpdate.bearing, this.bearing) != 0 || Double.compare(cameraPositionUpdate.tilt, this.tilt) != 0 || Double.compare(cameraPositionUpdate.zoom, this.zoom) != 0) {
                    return false;
                }
                LatLng latLng = this.target;
                LatLng latLng2 = cameraPositionUpdate.target;
                if (latLng != null) {
                    z = latLng.equals(latLng2);
                } else if (latLng2 != null) {
                    return false;
                }
            }
            return z;
        }

        public double getBearing() {
            return this.bearing;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.mapbox.mapboxsdk.camera.CameraPosition$Builder, com.mapbox.mapboxsdk.camera.CameraPosition] */
        /* JADX WARN: Type inference failed for: r0v6, types: [com.mapbox.mapboxsdk.geometry.LatLng, com.mapbox.mapboxsdk.camera.CameraPosition$Builder] */
        @Override // com.mapbox.mapboxsdk.camera.CameraUpdate
        public CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            CameraPosition.Builder builder;
            JQz.A0Z(mapboxMap);
            if (this.target == null) {
                ?? r0 = new CameraPosition.Builder(this).target;
                r0.target = r0;
                builder = r0;
            } else {
                builder = new CameraPosition.Builder(this);
            }
            return builder.build();
        }

        public LatLng getTarget() {
            return this.target;
        }

        public double getTilt() {
            return this.tilt;
        }

        public double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return AnonymousClass002.A03(Double.doubleToLongBits(this.zoom), AnonymousClass002.A03(Double.doubleToLongBits(this.tilt), (AnonymousClass002.A01(Double.doubleToLongBits(this.bearing)) + AnonymousClass002.A04(this.target)) * 31) * 31);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CameraPositionUpdate{bearing=");
            A0k.append(this.bearing);
            A0k.append(", target=");
            A0k.append(this.target);
            A0k.append(", tilt=");
            A0k.append(this.tilt);
            A0k.append(", zoom=");
            A0k.append(this.zoom);
            return AnonymousClass001.A0f(A0k);
        }
    }

    /* loaded from: CameraUpdateFactory$ZoomUpdate.class */
    public final class ZoomUpdate implements CameraUpdate {
        public static final int ZOOM_BY = 2;
        public static final int ZOOM_IN = 0;
        public static final int ZOOM_OUT = 1;
        public static final int ZOOM_TO = 3;
        public static final int ZOOM_TO_POINT = 4;
        public final int type;
        public float x;
        public float y;
        public final double zoom;

        public ZoomUpdate(double d, float f, float f2) {
            this.type = 4;
            this.zoom = d;
            this.x = f;
            this.y = f2;
        }

        public ZoomUpdate(int i) {
            this.type = i;
            this.zoom = 0.0d;
        }

        public ZoomUpdate(int i, double d) {
            this.type = i;
            this.zoom = d;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ZoomUpdate zoomUpdate = (ZoomUpdate) obj;
                if (this.type != zoomUpdate.type || Double.compare(zoomUpdate.zoom, this.zoom) != 0 || Float.compare(zoomUpdate.x, this.x) != 0) {
                    return false;
                }
                if (Float.compare(zoomUpdate.y, this.y) != 0) {
                    z = false;
                }
            }
            return z;
        }

        @Override // com.mapbox.mapboxsdk.camera.CameraUpdate
        public CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            CameraPosition.Builder builder;
            CameraPosition A0Z = JQz.A0Z(mapboxMap);
            if (this.type != 4) {
                builder = new CameraPosition.Builder(A0Z);
                builder.zoom = transformZoom(A0Z.zoom);
            } else {
                builder = new CameraPosition.Builder(A0Z);
                builder.zoom = transformZoom(A0Z.zoom);
                builder.target = JR1.A0h(mapboxMap.projection, this.x, this.y);
            }
            return builder.build();
        }

        public int getType() {
            return this.type;
        }

        public float getX() {
            return this.x;
        }

        public float getY() {
            return this.y;
        }

        public double getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            int A02 = AnonymousClass002.A02(Double.doubleToLongBits(this.zoom), this.type * 31);
            float f = this.x;
            int i = 0;
            int A06 = (A02 + JR1.A06((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f)) * 31;
            float f2 = this.y;
            if (f2 != 0.0f) {
                i = Float.floatToIntBits(f2);
            }
            return A06 + i;
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("ZoomUpdate{type=");
            A0k.append(this.type);
            A0k.append(", zoom=");
            A0k.append(this.zoom);
            A0k.append(", x=");
            A0k.append(this.x);
            A0k.append(", y=");
            A0k.append(this.y);
            return AnonymousClass001.A0f(A0k);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        
            if (r0 != 4) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public double transformZoom(double r302) {
            /*
                r301 = this;
                r0 = r301
                int r0 = r0.type
                r304 = r0
                r0 = 0
                r305 = r0
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r307 = r0
                r0 = r304
                if (r0 == 0) goto L59
                r0 = 1
                r309 = r0
                r0 = r304
                r1 = r309
                if (r0 == r1) goto L37
                r0 = 2
                r309 = r0
                r0 = r304
                r1 = r309
                if (r0 == r1) goto L4e
                r0 = 3
                r309 = r0
                r0 = r304
                r1 = r309
                if (r0 == r1) goto L49
                r0 = 4
                r309 = r0
                r0 = r304
                r1 = r309
                if (r0 == r1) goto L4e
            L35:
                r0 = r302
                return r0
            L37:
                r0 = r302
                r1 = r307
                double r0 = r0 - r1
                r302 = r0
                r0 = r302
                r1 = r305
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r309 = r0
                r0 = r309
                if (r0 >= 0) goto L35
                r0 = 0
                return r0
            L49:
                r0 = r301
                double r0 = r0.zoom
                return r0
            L4e:
                r0 = r301
                double r0 = r0.zoom
                r310 = r0
                r0 = r302
                r1 = r310
                double r0 = r0 + r1
                return r0
            L59:
                r0 = r302
                r1 = r307
                double r0 = r0 + r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.camera.CameraUpdateFactory.ZoomUpdate.transformZoom(double):double");
        }
    }

    public static CameraUpdate bearingTo(double d) {
        return new CameraPositionUpdate(d, null, -1.0d, -1.0d);
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        return new CameraPositionUpdate(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        return new CameraPositionUpdate(-1.0d, latLng, -1.0d, -1.0d);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        return newLatLngBounds(latLngBounds, i, i, i, i);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        return new CameraBoundsUpdate(latLngBounds, i, i2, i3, i4);
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, double d) {
        return new CameraPositionUpdate(-1.0d, latLng, -1.0d, d);
    }

    public static CameraUpdate tiltTo(double d) {
        return new CameraPositionUpdate(-1.0d, null, d, -1.0d);
    }

    public static CameraUpdate zoomBy(double d) {
        return new ZoomUpdate(2, d);
    }

    public static CameraUpdate zoomBy(double d, Point point) {
        return new ZoomUpdate(d, point.x, point.y);
    }

    public static CameraUpdate zoomIn() {
        return new ZoomUpdate(0);
    }

    public static CameraUpdate zoomOut() {
        return new ZoomUpdate(1);
    }

    public static CameraUpdate zoomTo(double d) {
        return new ZoomUpdate(3, d);
    }
}
