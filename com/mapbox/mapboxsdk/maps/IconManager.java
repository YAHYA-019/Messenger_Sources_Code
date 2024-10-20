package com.mapbox.mapboxsdk.maps;

import X.1BK;
import X.AnonymousClass001;
import X.JQy;
import X.JQz;
import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import java.util.Iterator;
import java.util.Map;

/* loaded from: IconManager.class */
public class IconManager {
    public int highestIconHeight;
    public int highestIconWidth;
    public final Map iconMap = AnonymousClass001.A0u();
    public NativeMap nativeMap;

    public IconManager(NativeMap nativeMap) {
        this.nativeMap = nativeMap;
    }

    private void addIcon(Icon icon) {
        addIcon(icon, true);
    }

    private void addIcon(Icon icon, boolean z) {
        if (this.iconMap.keySet().contains(icon)) {
            Map map = this.iconMap;
            1BK.A1P(icon, map, JQy.A0F(icon, map) + 1);
        } else {
            1BK.A1P(icon, this.iconMap, 1);
            if (z) {
                loadIcon(icon);
            }
        }
    }

    private Icon loadDefaultIconForMarker(Marker marker) {
        Icon defaultMarker = IconFactory.getInstance(JQz.A0J()).defaultMarker();
        Bitmap bitmap = defaultMarker.getBitmap();
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight() / 2);
        marker.setIcon(defaultMarker);
        return defaultMarker;
    }

    private void loadIcon(Icon icon) {
        Bitmap bitmap = icon.getBitmap();
        this.nativeMap.addAnnotationIcon(icon.getId(), bitmap.getWidth(), bitmap.getHeight(), icon.getScale(), icon.toBytes());
    }

    private void remove(Icon icon) {
        this.nativeMap.removeAnnotationIcon(icon.getId());
        this.iconMap.remove(icon);
    }

    private void setTopOffsetPixels(Marker marker, MapboxMap mapboxMap, Icon icon) {
        Marker annotation;
        if (marker.getId() == -1 || (annotation = mapboxMap.getAnnotation(marker.getId())) == null || annotation.getIcon() == null || annotation.getIcon() != marker.getIcon()) {
            marker.setTopOffsetPixels(getTopOffsetPixelsForIcon(icon));
        }
    }

    private void updateHighestIconSize(int i, int i2) {
        if (i > this.highestIconWidth) {
            this.highestIconWidth = i;
        }
        if (i2 > this.highestIconHeight) {
            this.highestIconHeight = i2;
        }
    }

    private void updateHighestIconSize(Bitmap bitmap) {
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight());
    }

    private void updateHighestIconSize(Icon icon) {
        updateHighestIconSize(icon.getBitmap());
    }

    private void updateIconRefCounter(Icon icon, int i) {
        1BK.A1P(icon, this.iconMap, i);
    }

    public void ensureIconLoaded(Marker marker, MapboxMap mapboxMap) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        }
        addIcon(icon, true);
        setTopOffsetPixels(marker, mapboxMap, icon);
    }

    public int getHighestIconHeight() {
        return this.highestIconHeight;
    }

    public int getHighestIconWidth() {
        return this.highestIconWidth;
    }

    public int getTopOffsetPixelsForIcon(Icon icon) {
        return (int) (this.nativeMap.getTopOffsetPixelsForAnnotationSymbol(icon.getId()) * this.nativeMap.getPixelRatio());
    }

    public void iconCleanup(Icon icon) {
        Number A0o = 1BK.A0o(icon, this.iconMap);
        if (A0o != null) {
            int intValue = A0o.intValue() - 1;
            if (intValue == 0) {
                remove(icon);
            } else {
                updateIconRefCounter(icon, intValue);
            }
        }
    }

    public Icon loadIconForMarker(Marker marker) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        } else {
            updateHighestIconSize(icon);
        }
        addIcon(icon, true);
        return icon;
    }

    public void reloadIcons() {
        Iterator A1B = 1BK.A1B(this.iconMap);
        while (A1B.hasNext()) {
            loadIcon((Icon) A1B.next());
        }
    }
}
