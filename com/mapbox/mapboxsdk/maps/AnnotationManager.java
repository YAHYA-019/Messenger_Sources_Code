package com.mapbox.mapboxsdk.maps;

import X.1BK;
import X.7zO;
import X.AnonymousClass001;
import X.C00p;
import X.DKC;
import X.JQz;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: AnnotationManager.class */
public class AnnotationManager {
    public static final long NO_ANNOTATION_ID = 255;
    public static final String TAG = "Mbgl-AnnotationManager";
    public Annotations annotations;
    public final C00p annotationsArray;
    public final IconManager iconManager;
    public final MapView mapView;
    public MapboxMap mapboxMap;
    public Markers markers;
    public MapboxMap.OnMarkerClickListener onMarkerClickListener;
    public MapboxMap.OnPolygonClickListener onPolygonClickListener;
    public MapboxMap.OnPolylineClickListener onPolylineClickListener;
    public Polygons polygons;
    public Polylines polylines;
    public ShapeAnnotations shapeAnnotations;
    public final InfoWindowManager infoWindowManager = new InfoWindowManager();
    public final List selectedMarkers = AnonymousClass001.A0s();

    /* loaded from: AnnotationManager$MarkerHit.class */
    public class MarkerHit {
        public final List markers;
        public final RectF tapRect;

        public MarkerHit(RectF rectF, List list) {
            this.tapRect = rectF;
            this.markers = list;
        }

        public float getTapPointX() {
            return this.tapRect.centerX();
        }

        public float getTapPointY() {
            return this.tapRect.centerY();
        }
    }

    /* loaded from: AnnotationManager$MarkerHitResolver.class */
    public class MarkerHitResolver {
        public Bitmap bitmap;
        public int bitmapHeight;
        public int bitmapWidth;
        public PointF markerLocation;
        public final Projection projection;
        public View view;
        public Rect hitRectView = DKC.A0C();
        public RectF hitRectMarker = DKC.A0D();
        public RectF highestSurfaceIntersection = DKC.A0D();
        public long closestMarkerId = -1;
        public final int minimalTouchSize = (int) (7zO.A0I(JQz.A0J()).density * 32.0f);

        public MarkerHitResolver(MapboxMap mapboxMap) {
            this.projection = mapboxMap.projection;
        }

        private void hitTestMarker(MarkerHit markerHit, Marker marker, RectF rectF) {
            if (rectF.contains(markerHit.tapRect.centerX(), markerHit.tapRect.centerY())) {
                rectF.intersect(markerHit.tapRect);
                if (isRectangleHighestSurfaceIntersection(rectF)) {
                    this.highestSurfaceIntersection = new RectF(rectF);
                    this.closestMarkerId = marker.getId();
                }
            }
        }

        private boolean isRectangleHighestSurfaceIntersection(RectF rectF) {
            return AnonymousClass001.A1P(((rectF.width() * rectF.height()) > (this.highestSurfaceIntersection.width() * this.highestSurfaceIntersection.height()) ? 1 : ((rectF.width() * rectF.height()) == (this.highestSurfaceIntersection.width() * this.highestSurfaceIntersection.height()) ? 0 : -1)));
        }

        private void resolveForMarker(MarkerHit markerHit, Marker marker) {
            this.markerLocation = this.projection.nativeMapView.pixelForLatLng(marker.getPosition());
            Bitmap bitmap = marker.getIcon().getBitmap();
            this.bitmap = bitmap;
            int height = bitmap.getHeight();
            this.bitmapHeight = height;
            int i = this.minimalTouchSize;
            if (height < i) {
                this.bitmapHeight = i;
            }
            int width = this.bitmap.getWidth();
            this.bitmapWidth = width;
            int i2 = this.minimalTouchSize;
            if (width < i2) {
                this.bitmapWidth = i2;
                width = i2;
            }
            this.hitRectMarker.set(0.0f, 0.0f, width, this.bitmapHeight);
            RectF rectF = this.hitRectMarker;
            PointF pointF = this.markerLocation;
            rectF.offsetTo(pointF.x - (this.bitmapWidth / 2), pointF.y - (this.bitmapHeight / 2));
            hitTestMarker(markerHit, marker, this.hitRectMarker);
        }

        private void resolveForMarkers(MarkerHit markerHit) {
            Iterator it = markerHit.markers.iterator();
            while (it.hasNext()) {
                resolveForMarker(markerHit, (Marker) it.next());
            }
        }

        public long execute(MarkerHit markerHit) {
            resolveForMarkers(markerHit);
            return this.closestMarkerId;
        }
    }

    /* loaded from: AnnotationManager$ShapeAnnotationHit.class */
    public class ShapeAnnotationHit {
        public final RectF tapPoint;

        public ShapeAnnotationHit(RectF rectF) {
            this.tapPoint = rectF;
        }
    }

    /* loaded from: AnnotationManager$ShapeAnnotationHitResolver.class */
    public class ShapeAnnotationHitResolver {
        public ShapeAnnotations shapeAnnotations;

        public ShapeAnnotationHitResolver(ShapeAnnotations shapeAnnotations) {
            this.shapeAnnotations = shapeAnnotations;
        }

        public Annotation execute(ShapeAnnotationHit shapeAnnotationHit) {
            List obtainAllIn = this.shapeAnnotations.obtainAllIn(shapeAnnotationHit.tapPoint);
            if (obtainAllIn.size() > 0) {
                return (Annotation) 1BK.A0r(obtainAllIn);
            }
            return null;
        }
    }

    public AnnotationManager(MapView mapView, C00p c00p, IconManager iconManager, Annotations annotations, Markers markers, Polygons polygons, Polylines polylines, ShapeAnnotations shapeAnnotations) {
        this.mapView = mapView;
        this.annotationsArray = c00p;
        this.iconManager = iconManager;
        this.annotations = annotations;
        this.markers = markers;
        this.polygons = polygons;
        this.polylines = polylines;
        this.shapeAnnotations = shapeAnnotations;
    }

    private MarkerHit getMarkerHitFromTouchArea(PointF pointF) {
        IconManager iconManager = this.iconManager;
        int i = (int) (iconManager.highestIconHeight * 1.5d);
        int i2 = (int) (iconManager.highestIconWidth * 1.5d);
        float f = pointF.x;
        float f2 = i;
        float f3 = f - f2;
        float f4 = pointF.y;
        float f5 = i2;
        RectF rectF = new RectF(f3, f4 - f5, f + f2, f4 + f5);
        return new MarkerHit(rectF, this.markers.obtainAllIn(rectF));
    }

    private ShapeAnnotationHit getShapeAnnotationHitFromTap(PointF pointF) {
        float dimension = JQz.A0J().getResources().getDimension(R.dimen.mapbox_eight_dp);
        float f = pointF.x;
        float f2 = f - dimension;
        float f3 = pointF.y;
        return new ShapeAnnotationHit(new RectF(f2, f3 - dimension, f + dimension, f3 + dimension));
    }

    private boolean handleClickForShapeAnnotation(Annotation annotation) {
        MapboxMap.OnPolylineClickListener onPolylineClickListener;
        MapboxMap.OnPolygonClickListener onPolygonClickListener;
        if ((annotation instanceof Polygon) && (onPolygonClickListener = this.onPolygonClickListener) != null) {
            onPolygonClickListener.onPolygonClick((Polygon) annotation);
            return true;
        }
        if (!(annotation instanceof Polyline) || (onPolylineClickListener = this.onPolylineClickListener) == null) {
            return false;
        }
        onPolylineClickListener.onPolylineClick((Polyline) annotation);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r301.annotationsArray.A01(r302.getId()) <= (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isAddedToMap(com.mapbox.mapboxsdk.annotations.Annotation r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r302
            long r0 = r0.getId()
            r303 = r0
            r0 = -1
            long r0 = (long) r0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3a
            r0 = r301
            X.00p r0 = r0.annotationsArray
            r308 = r0
            r0 = r302
            long r0 = r0.getId()
            r309 = r0
            r0 = r308
            r1 = r309
            int r0 = r0.A01(r1)
            r311 = r0
            r0 = -1
            r312 = r0
            r0 = 1
            r307 = r0
            r0 = r311
            r1 = r312
            if (r0 > r1) goto L3d
        L3a:
            r0 = 0
            r307 = r0
        L3d:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.AnnotationManager.isAddedToMap(com.mapbox.mapboxsdk.annotations.Annotation):boolean");
    }

    private boolean isClickHandledForMarker(long j) {
        Marker marker = (Marker) this.annotations.obtainBy(j);
        if (onClickMarker(marker)) {
            return true;
        }
        toggleMarkerSelectionState(marker);
        return true;
    }

    private void logNonAdded(Annotation annotation) {
        Logger.w(TAG, String.format("Attempting to update non-added %s with value %s", annotation.getClass().getCanonicalName(), annotation));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.onMarkerClick(r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onClickMarker(com.mapbox.mapboxsdk.annotations.Marker r302) {
        /*
            r301 = this;
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapboxMap$OnMarkerClickListener r0 = r0.onMarkerClickListener
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L18
            r0 = r303
            r1 = r302
            boolean r0 = r0.onMarkerClick(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L18:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.AnnotationManager.onClickMarker(com.mapbox.mapboxsdk.annotations.Marker):boolean");
    }

    private void toggleMarkerSelectionState(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            deselectMarker(marker);
        } else {
            selectMarker(marker);
        }
    }

    public Marker addMarker(BaseMarkerOptions baseMarkerOptions, MapboxMap mapboxMap) {
        return this.markers.addBy(baseMarkerOptions, mapboxMap);
    }

    public List addMarkers(List list, MapboxMap mapboxMap) {
        return this.markers.addBy(list, mapboxMap);
    }

    public Polygon addPolygon(PolygonOptions polygonOptions, MapboxMap mapboxMap) {
        return this.polygons.addBy(polygonOptions, mapboxMap);
    }

    public List addPolygons(List list, MapboxMap mapboxMap) {
        return this.polygons.addBy(list, mapboxMap);
    }

    public Polyline addPolyline(PolylineOptions polylineOptions, MapboxMap mapboxMap) {
        return this.polylines.addBy(polylineOptions, mapboxMap);
    }

    public List addPolylines(List list, MapboxMap mapboxMap) {
        return this.polylines.addBy(list, mapboxMap);
    }

    public void adjustTopOffsetPixels(MapboxMap mapboxMap) {
        int A00 = this.annotationsArray.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                break;
            }
            Marker marker = (Annotation) this.annotationsArray.A05(i2);
            if (marker instanceof Marker) {
                Marker marker2 = marker;
                marker2.setTopOffsetPixels(this.iconManager.getTopOffsetPixelsForIcon(marker2.getIcon()));
            }
            i = i2 + 1;
        }
        for (Marker marker3 : this.selectedMarkers) {
            if (marker3.isInfoWindowShown()) {
                marker3.hideInfoWindow();
                marker3.showInfoWindow(mapboxMap, this.mapView);
            }
        }
    }

    public AnnotationManager bind(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        return this;
    }

    public void deselectMarker(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            if (marker.isInfoWindowShown()) {
                marker.hideInfoWindow();
            }
            this.selectedMarkers.remove(marker);
        }
    }

    public void deselectMarkers() {
        if (this.selectedMarkers.isEmpty()) {
            return;
        }
        for (Marker marker : this.selectedMarkers) {
            if (marker != null && marker.isInfoWindowShown()) {
                marker.hideInfoWindow();
            }
        }
        this.selectedMarkers.clear();
    }

    public Annotation getAnnotation(long j) {
        return this.annotations.obtainBy(j);
    }

    public List getAnnotations() {
        return this.annotations.obtainAll();
    }

    public InfoWindowManager getInfoWindowManager() {
        return this.infoWindowManager;
    }

    public List getMarkers() {
        return this.markers.obtainAll();
    }

    public List getMarkersInRect(RectF rectF) {
        return this.markers.obtainAllIn(rectF);
    }

    public List getPolygons() {
        return this.polygons.obtainAll();
    }

    public List getPolylines() {
        return this.polylines.obtainAll();
    }

    public List getSelectedMarkers() {
        return this.selectedMarkers;
    }

    public boolean onTap(PointF pointF) {
        long execute = new MarkerHitResolver(this.mapboxMap).execute(getMarkerHitFromTouchArea(pointF));
        if (execute != -1) {
            isClickHandledForMarker(execute);
            return true;
        }
        Annotation execute2 = new ShapeAnnotationHitResolver(this.shapeAnnotations).execute(getShapeAnnotationHitFromTap(pointF));
        return execute2 != null && handleClickForShapeAnnotation(execute2);
    }

    public void reloadMarkers() {
        this.markers.reload();
    }

    public void removeAnnotation(long j) {
        this.annotations.removeBy(j);
    }

    public void removeAnnotation(Annotation annotation) {
        if (annotation instanceof Marker) {
            Marker marker = (Marker) annotation;
            marker.hideInfoWindow();
            if (this.selectedMarkers.contains(marker)) {
                this.selectedMarkers.remove(marker);
            }
            this.iconManager.iconCleanup(marker.getIcon());
        }
        this.annotations.removeBy(annotation);
    }

    public void removeAnnotations() {
        int A00 = this.annotationsArray.A00();
        this.selectedMarkers.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                this.annotations.removeAll();
                return;
            }
            Marker marker = (Annotation) this.annotationsArray.A05(this.annotationsArray.A02(i2));
            if (marker instanceof Marker) {
                Marker marker2 = marker;
                marker2.hideInfoWindow();
                this.iconManager.iconCleanup(marker2.getIcon());
            }
            i = i2 + 1;
        }
    }

    public void removeAnnotations(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Marker marker = (Annotation) it.next();
            if (marker instanceof Marker) {
                Marker marker2 = marker;
                marker2.hideInfoWindow();
                if (this.selectedMarkers.contains(marker2)) {
                    this.selectedMarkers.remove(marker2);
                }
                this.iconManager.iconCleanup(marker2.getIcon());
            }
        }
        this.annotations.removeBy(list);
    }

    public void selectMarker(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            return;
        }
        if (!this.infoWindowManager.allowConcurrentMultipleInfoWindows) {
            deselectMarkers();
        }
        if (this.infoWindowManager.isInfoWindowValidForMarker(marker) || this.infoWindowManager.infoWindowAdapter != null) {
            this.infoWindowManager.add(marker.showInfoWindow(this.mapboxMap, this.mapView));
        }
        this.selectedMarkers.add(marker);
    }

    public void setOnMarkerClickListener(MapboxMap.OnMarkerClickListener onMarkerClickListener) {
        this.onMarkerClickListener = onMarkerClickListener;
    }

    public void setOnPolygonClickListener(MapboxMap.OnPolygonClickListener onPolygonClickListener) {
        this.onPolygonClickListener = onPolygonClickListener;
    }

    public void setOnPolylineClickListener(MapboxMap.OnPolylineClickListener onPolylineClickListener) {
        this.onPolylineClickListener = onPolylineClickListener;
    }

    public void update() {
        this.infoWindowManager.update();
    }

    public void updateMarker(Marker marker, MapboxMap mapboxMap) {
        if (isAddedToMap(marker)) {
            this.markers.update(marker, mapboxMap);
        } else {
            logNonAdded(marker);
        }
    }

    public void updatePolygon(Polygon polygon) {
        if (isAddedToMap(polygon)) {
            this.polygons.update(polygon);
        } else {
            logNonAdded(polygon);
        }
    }

    public void updatePolyline(Polyline polyline) {
        if (isAddedToMap(polyline)) {
            this.polylines.update(polyline);
        } else {
            logNonAdded(polyline);
        }
    }
}
