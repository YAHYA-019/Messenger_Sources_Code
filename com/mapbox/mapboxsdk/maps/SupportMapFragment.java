package com.mapbox.mapboxsdk.maps;

import X.0FI;
import X.AnonymousClass001;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.mapbox.mapboxsdk.maps.MapFragment;
import com.mapbox.mapboxsdk.utils.MapFragmentUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: SupportMapFragment.class */
public class SupportMapFragment extends Fragment implements OnMapReadyCallback {
    public MapView map;
    public final List mapReadyCallbackList = AnonymousClass001.A0s();
    public MapFragment.OnMapViewReadyCallback mapViewReadyCallback;
    public MapboxMap mapboxMap;

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(MapboxMapOptions mapboxMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        supportMapFragment.setArguments(MapFragmentUtils.createFragmentArgs(mapboxMapOptions));
        return supportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap == null) {
            this.mapReadyCallbackList.add(onMapReadyCallback);
        } else {
            onMapReadyCallback.onMapReady(mapboxMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MapFragment.OnMapViewReadyCallback) {
            this.mapViewReadyCallback = (MapFragment.OnMapViewReadyCallback) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(586665428);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        MapView mapView = new MapView(context, MapFragmentUtils.resolveArgs(context, this.mArguments));
        this.map = mapView;
        0FI.A08(88964951, A02);
        return mapView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = 0FI.A02(299011919);
        super.onDestroy();
        this.mapReadyCallbackList.clear();
        0FI.A08(-43933926, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = 0FI.A02(19409873);
        super.onDestroyView();
        this.map.onDestroy();
        0FI.A08(-973150359, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        setArguments(MapFragmentUtils.createFragmentArgs(MapboxMapOptions.createFromAttributes(context, attributeSet)));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        MapView mapView = this.map;
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.OnMapReadyCallback
    public void onMapReady(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        Iterator it = this.mapReadyCallbackList.iterator();
        while (it.hasNext()) {
            ((OnMapReadyCallback) it.next()).onMapReady(mapboxMap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = 0FI.A02(2070575031);
        super.onPause();
        0FI.A08(-809283341, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = 0FI.A02(-1281154979);
        super.onResume();
        0FI.A08(1748582181, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        MapView mapView = this.map;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = 0FI.A02(-867120693);
        super.onStart();
        this.map.onStart();
        0FI.A08(-1156879522, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = 0FI.A02(251639696);
        super.onStop();
        this.map.onStop();
        0FI.A08(-1782978037, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.map.onCreate(bundle);
        this.map.getMapAsync(this);
        MapFragment.OnMapViewReadyCallback onMapViewReadyCallback = this.mapViewReadyCallback;
        if (onMapViewReadyCallback != null) {
            onMapViewReadyCallback.onMapViewReady(this.map);
        }
    }
}
