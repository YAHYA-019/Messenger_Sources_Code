package com.mapbox.mapboxsdk.style.sources;

import X.AnonymousClass001;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.HashMap;
import java.util.Map;

/* loaded from: TileSet.class */
public class TileSet {
    public String attribution;
    public Float[] bounds;
    public Float[] center;
    public String[] data;
    public String description;
    public String encoding;
    public String[] grids;
    public String legend;
    public Float maxZoom;
    public Float minZoom;
    public String name;
    public String scheme;
    public String template;
    public final String tilejson;
    public final String[] tiles;
    public String version;

    public TileSet(String str, String... strArr) {
        this.tilejson = str;
        this.tiles = strArr;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Float[] getBounds() {
        return this.bounds;
    }

    public Float[] getCenter() {
        return this.center;
    }

    public String[] getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public String[] getGrids() {
        return this.grids;
    }

    public String getLegend() {
        return this.legend;
    }

    public float getMaxZoom() {
        return this.maxZoom.floatValue();
    }

    public float getMinZoom() {
        return this.minZoom.floatValue();
    }

    public String getName() {
        return this.name;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getTemplate() {
        return this.template;
    }

    public String getTilejson() {
        return this.tilejson;
    }

    public String[] getTiles() {
        return this.tiles;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAttribution(String str) {
        this.attribution = str;
    }

    public void setBounds(Float... fArr) {
        this.bounds = fArr;
    }

    public void setCenter(LatLng latLng) {
        this.center = new Float[]{Float.valueOf((float) latLng.longitude), Float.valueOf((float) latLng.latitude)};
    }

    public void setCenter(Float... fArr) {
        this.center = fArr;
    }

    public void setData(String... strArr) {
        this.data = strArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setGrids(String... strArr) {
        this.grids = strArr;
    }

    public void setLegend(String str) {
        this.legend = str;
    }

    public void setMaxZoom(float f) {
        this.maxZoom = Float.valueOf(f);
    }

    public void setMinZoom(float f) {
        this.minZoom = Float.valueOf(f);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public Map toValueObject() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("tilejson", this.tilejson);
        A0u.put("tiles", this.tiles);
        String str = this.name;
        if (str != null) {
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        String str2 = this.description;
        if (str2 != null) {
            A0u.put("description", str2);
        }
        String str3 = this.version;
        if (str3 != null) {
            A0u.put(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, str3);
        }
        String str4 = this.attribution;
        if (str4 != null) {
            A0u.put("attribution", str4);
        }
        String str5 = this.template;
        if (str5 != null) {
            A0u.put("template", str5);
        }
        String str6 = this.legend;
        if (str6 != null) {
            A0u.put("legend", str6);
        }
        String str7 = this.scheme;
        if (str7 != null) {
            A0u.put("scheme", str7);
        }
        String[] strArr = this.grids;
        if (strArr != null) {
            A0u.put("grids", strArr);
        }
        String[] strArr2 = this.data;
        if (strArr2 != null) {
            A0u.put("data", strArr2);
        }
        Float f = this.minZoom;
        if (f != null) {
            A0u.put("minzoom", f);
        }
        Float f2 = this.maxZoom;
        if (f2 != null) {
            A0u.put("maxzoom", f2);
        }
        Float[] fArr = this.bounds;
        if (fArr != null) {
            A0u.put("bounds", fArr);
        }
        Float[] fArr2 = this.center;
        if (fArr2 != null) {
            A0u.put("center", fArr2);
        }
        String str8 = this.encoding;
        if (str8 != null) {
            A0u.put("encoding", str8);
        }
        return A0u;
    }
}
