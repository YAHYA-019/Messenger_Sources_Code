package com.mapbox.mapboxsdk.maps;

import X.0C9;
import X.1BL;
import X.4YW;
import X.7zO;
import X.AnonymousClass002;
import X.JR2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.util.Arrays;

/* loaded from: MapboxMapOptions.class */
public class MapboxMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.maps.MapboxMapOptions.1
        @Override // android.os.Parcelable.Creator
        public MapboxMapOptions createFromParcel(Parcel parcel) {
            return new MapboxMapOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            MapboxMapOptions mapboxMapOptions = new MapboxMapOptions(parcel);
            synchronized (0C9.A00) {
            }
            return mapboxMapOptions;
        }

        @Override // android.os.Parcelable.Creator
        public MapboxMapOptions[] newArray(int i) {
            return new MapboxMapOptions[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MapboxMapOptions[i];
        }
    };
    public static final float FOUR_DP = 4.0f;
    public static final int LIGHT_GRAY = 15788513;
    public static final float NINETY_TWO_DP = 92.0f;
    public static final int UNDEFINED_COLOR = 255;
    public String apiBaseUri;
    public boolean attributionEnabled;
    public int attributionGravity;
    public int[] attributionMargins;
    public int attributionTintColor;
    public CameraPosition cameraPosition;
    public boolean compassEnabled;
    public int compassGravity;
    public Drawable compassImage;
    public int[] compassMargins;
    public boolean crossSourceCollisions;
    public boolean debugActive;
    public boolean doubleTapGesturesEnabled;
    public boolean fadeCompassFacingNorth;
    public int foregroundLoadColor;
    public String localIdeographFontFamily;
    public boolean logoEnabled;
    public int logoGravity;
    public int[] logoMargins;
    public double maxZoom;
    public double minZoom;
    public float pixelRatio;
    public boolean prefetchesTiles;
    public boolean quickZoomGesturesEnabled;
    public boolean rotateGesturesEnabled;
    public boolean scrollGesturesEnabled;
    public boolean textureMode;
    public boolean tiltGesturesEnabled;
    public boolean translucentTextureSurface;
    public boolean zMediaOverlay;
    public boolean zoomGesturesEnabled;

    public MapboxMapOptions() {
        JR2.A0j(this);
        this.zMediaOverlay = false;
        this.localIdeographFontFamily = "sans-serif";
        this.crossSourceCollisions = true;
    }

    public MapboxMapOptions(Parcel parcel) {
        boolean z = true;
        JR2.A0j(this);
        boolean z2 = false;
        this.zMediaOverlay = false;
        this.localIdeographFontFamily = "sans-serif";
        this.crossSourceCollisions = true;
        this.cameraPosition = (CameraPosition) 1BL.A0C(parcel, CameraPosition.class);
        this.debugActive = 4YW.A0K(parcel);
        this.compassEnabled = 4YW.A0K(parcel);
        this.compassGravity = parcel.readInt();
        this.compassMargins = parcel.createIntArray();
        this.fadeCompassFacingNorth = 4YW.A0K(parcel);
        Bitmap bitmap = (Bitmap) 1BL.A0C(parcel, getClass());
        if (bitmap != null) {
            this.compassImage = new BitmapDrawable(bitmap);
        }
        this.logoEnabled = 4YW.A0K(parcel);
        this.logoGravity = parcel.readInt();
        this.logoMargins = parcel.createIntArray();
        this.attributionEnabled = 4YW.A0K(parcel);
        this.attributionGravity = parcel.readInt();
        this.attributionMargins = parcel.createIntArray();
        this.attributionTintColor = parcel.readInt();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.rotateGesturesEnabled = 4YW.A0K(parcel);
        this.scrollGesturesEnabled = 4YW.A0K(parcel);
        this.tiltGesturesEnabled = 4YW.A0K(parcel);
        this.zoomGesturesEnabled = 4YW.A0K(parcel);
        this.doubleTapGesturesEnabled = 4YW.A0K(parcel);
        this.quickZoomGesturesEnabled = 4YW.A0K(parcel);
        this.apiBaseUri = parcel.readString();
        this.textureMode = 4YW.A0K(parcel);
        this.translucentTextureSurface = 4YW.A0K(parcel);
        this.prefetchesTiles = 4YW.A0K(parcel);
        this.zMediaOverlay = parcel.readByte() != 0 ? true : z2;
        this.localIdeographFontFamily = parcel.readString();
        this.pixelRatio = parcel.readFloat();
        this.foregroundLoadColor = parcel.readInt();
        this.crossSourceCollisions = parcel.readByte() == 0 ? false : z;
    }

    public static MapboxMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        MapboxMapOptions mapboxMapOptions = new MapboxMapOptions();
        float f = 7zO.A0I(context).density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mapbox_MapView, 0, 0);
        try {
            mapboxMapOptions.cameraPosition = new CameraPosition.Builder(obtainStyledAttributes).build();
            mapboxMapOptions.apiBaseUri = obtainStyledAttributes.getString(1);
            String string = obtainStyledAttributes.getString(0);
            if (!TextUtils.isEmpty(string)) {
                mapboxMapOptions.apiBaseUri = string;
            }
            mapboxMapOptions.zoomGesturesEnabled = obtainStyledAttributes.getBoolean(43, true);
            mapboxMapOptions.scrollGesturesEnabled = obtainStyledAttributes.getBoolean(41, true);
            mapboxMapOptions.rotateGesturesEnabled = obtainStyledAttributes.getBoolean(40, true);
            mapboxMapOptions.tiltGesturesEnabled = obtainStyledAttributes.getBoolean(42, true);
            mapboxMapOptions.doubleTapGesturesEnabled = obtainStyledAttributes.getBoolean(32, true);
            mapboxMapOptions.quickZoomGesturesEnabled = obtainStyledAttributes.getBoolean(39, true);
            mapboxMapOptions.maxZoom = obtainStyledAttributes.getFloat(7, 25.5f);
            mapboxMapOptions.minZoom = obtainStyledAttributes.getFloat(8, 0.0f);
            mapboxMapOptions.compassEnabled = obtainStyledAttributes.getBoolean(24, true);
            mapboxMapOptions.compassGravity = obtainStyledAttributes.getInt(27, 8388661);
            float f2 = 4.0f * f;
            mapboxMapOptions.compassMargins = new int[]{(int) obtainStyledAttributes.getDimension(29, f2), (int) obtainStyledAttributes.getDimension(31, f2), (int) obtainStyledAttributes.getDimension(30, f2), (int) obtainStyledAttributes.getDimension(28, f2)};
            mapboxMapOptions.fadeCompassFacingNorth = obtainStyledAttributes.getBoolean(26, true);
            Drawable drawable = obtainStyledAttributes.getDrawable(25);
            if (drawable == null) {
                drawable = context.getResources().getDrawable(2132345653, null);
            }
            mapboxMapOptions.compassImage = drawable;
            mapboxMapOptions.logoEnabled = obtainStyledAttributes.getBoolean(33, true);
            mapboxMapOptions.logoGravity = obtainStyledAttributes.getInt(34, 8388691);
            mapboxMapOptions.logoMargins = new int[]{(int) obtainStyledAttributes.getDimension(36, f2), (int) obtainStyledAttributes.getDimension(38, f2), (int) obtainStyledAttributes.getDimension(37, f2), (int) obtainStyledAttributes.getDimension(35, f2)};
            float f3 = 0.0f / 0.0f;
            mapboxMapOptions.attributionTintColor = obtainStyledAttributes.getColor(23, -1);
            mapboxMapOptions.attributionEnabled = obtainStyledAttributes.getBoolean(17, true);
            mapboxMapOptions.attributionGravity = obtainStyledAttributes.getInt(18, 8388691);
            mapboxMapOptions.attributionMargins = new int[]{(int) obtainStyledAttributes.getDimension(20, f * 92.0f), (int) obtainStyledAttributes.getDimension(22, f2), (int) obtainStyledAttributes.getDimension(21, f2), (int) obtainStyledAttributes.getDimension(19, f2)};
            mapboxMapOptions.textureMode = obtainStyledAttributes.getBoolean(15, false);
            mapboxMapOptions.translucentTextureSurface = obtainStyledAttributes.getBoolean(16, false);
            mapboxMapOptions.prefetchesTiles = obtainStyledAttributes.getBoolean(10, true);
            mapboxMapOptions.zMediaOverlay = obtainStyledAttributes.getBoolean(11, false);
            mapboxMapOptions.localIdeographFontFamily = obtainStyledAttributes.getString(13);
            mapboxMapOptions.pixelRatio = obtainStyledAttributes.getFloat(14, 0.0f);
            float f4 = 0.0f / 0.0f;
            mapboxMapOptions.foregroundLoadColor = obtainStyledAttributes.getInt(12, -988703);
            mapboxMapOptions.crossSourceCollisions = obtainStyledAttributes.getBoolean(9, true);
            return mapboxMapOptions;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public MapboxMapOptions apiBaseUri(String str) {
        this.apiBaseUri = str;
        return this;
    }

    public MapboxMapOptions apiBaseUrl(String str) {
        this.apiBaseUri = str;
        return this;
    }

    public MapboxMapOptions attributionEnabled(boolean z) {
        this.attributionEnabled = z;
        return this;
    }

    public MapboxMapOptions attributionGravity(int i) {
        this.attributionGravity = i;
        return this;
    }

    public MapboxMapOptions attributionMargins(int[] iArr) {
        this.attributionMargins = iArr;
        return this;
    }

    public MapboxMapOptions attributionTintColor(int i) {
        this.attributionTintColor = i;
        return this;
    }

    public MapboxMapOptions camera(CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }

    public MapboxMapOptions compassEnabled(boolean z) {
        this.compassEnabled = z;
        return this;
    }

    public MapboxMapOptions compassFadesWhenFacingNorth(boolean z) {
        this.fadeCompassFacingNorth = z;
        return this;
    }

    public MapboxMapOptions compassGravity(int i) {
        this.compassGravity = i;
        return this;
    }

    public MapboxMapOptions compassImage(Drawable drawable) {
        this.compassImage = drawable;
        return this;
    }

    public MapboxMapOptions compassMargins(int[] iArr) {
        this.compassMargins = iArr;
        return this;
    }

    public MapboxMapOptions crossSourceCollisions(boolean z) {
        this.crossSourceCollisions = z;
        return this;
    }

    public MapboxMapOptions debugActive(boolean z) {
        this.debugActive = z;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MapboxMapOptions doubleTapGesturesEnabled(boolean z) {
        this.doubleTapGesturesEnabled = z;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r0.equals(r0) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapboxMapOptions.equals(java.lang.Object):boolean");
    }

    public MapboxMapOptions foregroundLoadColor(int i) {
        this.foregroundLoadColor = i;
        return this;
    }

    public String getApiBaseUri() {
        return this.apiBaseUri;
    }

    public String getApiBaseUrl() {
        return this.apiBaseUri;
    }

    public boolean getAttributionEnabled() {
        return this.attributionEnabled;
    }

    public int getAttributionGravity() {
        return this.attributionGravity;
    }

    public int[] getAttributionMargins() {
        return this.attributionMargins;
    }

    public int getAttributionTintColor() {
        return this.attributionTintColor;
    }

    public CameraPosition getCamera() {
        return this.cameraPosition;
    }

    public boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public boolean getCompassFadeFacingNorth() {
        return this.fadeCompassFacingNorth;
    }

    public int getCompassGravity() {
        return this.compassGravity;
    }

    public Drawable getCompassImage() {
        return this.compassImage;
    }

    public int[] getCompassMargins() {
        return this.compassMargins;
    }

    public boolean getCrossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public boolean getDebugActive() {
        return this.debugActive;
    }

    public boolean getDoubleTapGesturesEnabled() {
        return this.doubleTapGesturesEnabled;
    }

    public int getForegroundLoadColor() {
        return this.foregroundLoadColor;
    }

    public String getLocalIdeographFontFamily() {
        return this.localIdeographFontFamily;
    }

    public boolean getLogoEnabled() {
        return this.logoEnabled;
    }

    public int getLogoGravity() {
        return this.logoGravity;
    }

    public int[] getLogoMargins() {
        return this.logoMargins;
    }

    public double getMaxZoomPreference() {
        return this.maxZoom;
    }

    public double getMinZoomPreference() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public boolean getPrefetchesTiles() {
        return this.prefetchesTiles;
    }

    public boolean getQuickZoomGesturesEnabled() {
        return this.quickZoomGesturesEnabled;
    }

    public boolean getRenderSurfaceOnTop() {
        return this.zMediaOverlay;
    }

    public boolean getRotateGesturesEnabled() {
        return this.rotateGesturesEnabled;
    }

    public boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public boolean getTextureMode() {
        return this.textureMode;
    }

    public boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public boolean getTranslucentTextureSurface() {
        return this.translucentTextureSurface;
    }

    public boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (((((((((((((((((((((AnonymousClass002.A02(Double.doubleToLongBits(this.maxZoom), AnonymousClass002.A03(Double.doubleToLongBits(this.minZoom), ((((((((((((((((((((((((((AnonymousClass002.A04(this.cameraPosition) * 31) + (this.debugActive ? 1 : 0)) * 31) + (this.compassEnabled ? 1 : 0)) * 31) + (this.fadeCompassFacingNorth ? 1 : 0)) * 31) + this.compassGravity) * 31) + AnonymousClass002.A04(this.compassImage)) * 31) + Arrays.hashCode(this.compassMargins)) * 31) + (this.logoEnabled ? 1 : 0)) * 31) + this.logoGravity) * 31) + Arrays.hashCode(this.logoMargins)) * 31) + this.attributionTintColor) * 31) + (this.attributionEnabled ? 1 : 0)) * 31) + this.attributionGravity) * 31) + Arrays.hashCode(this.attributionMargins)) * 31) * 31) + (this.rotateGesturesEnabled ? 1 : 0)) * 31) + (this.scrollGesturesEnabled ? 1 : 0)) * 31) + (this.tiltGesturesEnabled ? 1 : 0)) * 31) + (this.zoomGesturesEnabled ? 1 : 0)) * 31) + (this.doubleTapGesturesEnabled ? 1 : 0)) * 31) + (this.quickZoomGesturesEnabled ? 1 : 0)) * 31) + 1BL.A06(this.apiBaseUri)) * 31) + (this.textureMode ? 1 : 0)) * 31) + (this.translucentTextureSurface ? 1 : 0)) * 31) + (this.prefetchesTiles ? 1 : 0)) * 31) + (this.zMediaOverlay ? 1 : 0)) * 31;
        String str = this.localIdeographFontFamily;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A02 + i) * 31) + ((int) this.pixelRatio)) * 31) + (this.crossSourceCollisions ? 1 : 0);
    }

    public MapboxMapOptions localIdeographFontFamily(String str) {
        this.localIdeographFontFamily = str;
        return this;
    }

    public MapboxMapOptions logoEnabled(boolean z) {
        this.logoEnabled = z;
        return this;
    }

    public MapboxMapOptions logoGravity(int i) {
        this.logoGravity = i;
        return this;
    }

    public MapboxMapOptions logoMargins(int[] iArr) {
        this.logoMargins = iArr;
        return this;
    }

    public MapboxMapOptions maxZoomPreference(double d) {
        this.maxZoom = d;
        return this;
    }

    public MapboxMapOptions minZoomPreference(double d) {
        this.minZoom = d;
        return this;
    }

    public MapboxMapOptions pixelRatio(float f) {
        this.pixelRatio = f;
        return this;
    }

    public MapboxMapOptions quickZoomGesturesEnabled(boolean z) {
        this.quickZoomGesturesEnabled = z;
        return this;
    }

    public void renderSurfaceOnTop(boolean z) {
        this.zMediaOverlay = z;
    }

    public MapboxMapOptions rotateGesturesEnabled(boolean z) {
        this.rotateGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions scrollGesturesEnabled(boolean z) {
        this.scrollGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions setPrefetchesTiles(boolean z) {
        this.prefetchesTiles = z;
        return this;
    }

    public MapboxMapOptions textureMode(boolean z) {
        this.textureMode = z;
        return this;
    }

    public MapboxMapOptions tiltGesturesEnabled(boolean z) {
        this.tiltGesturesEnabled = z;
        return this;
    }

    public MapboxMapOptions translucentTextureSurface(boolean z) {
        this.translucentTextureSurface = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.cameraPosition, i);
        parcel.writeByte(this.debugActive ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.compassEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.compassGravity);
        parcel.writeIntArray(this.compassMargins);
        parcel.writeByte(this.fadeCompassFacingNorth ? (byte) 1 : (byte) 0);
        Drawable drawable = this.compassImage;
        parcel.writeParcelable(drawable != null ? BitmapUtils.getBitmapFromDrawable(drawable) : null, i);
        parcel.writeByte(this.logoEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.logoGravity);
        parcel.writeIntArray(this.logoMargins);
        parcel.writeByte(this.attributionEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.attributionGravity);
        parcel.writeIntArray(this.attributionMargins);
        parcel.writeInt(this.attributionTintColor);
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeByte(this.rotateGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.scrollGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.tiltGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zoomGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.doubleTapGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.quickZoomGesturesEnabled ? (byte) 1 : (byte) 0);
        parcel.writeString(this.apiBaseUri);
        parcel.writeByte(this.textureMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.translucentTextureSurface ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.prefetchesTiles ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zMediaOverlay ? (byte) 1 : (byte) 0);
        parcel.writeString(this.localIdeographFontFamily);
        parcel.writeFloat(this.pixelRatio);
        parcel.writeInt(this.foregroundLoadColor);
        parcel.writeByte(this.crossSourceCollisions ? (byte) 1 : (byte) 0);
    }

    public MapboxMapOptions zoomGesturesEnabled(boolean z) {
        this.zoomGesturesEnabled = z;
        return this;
    }
}
