package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.log.Logger;

/* loaded from: LibraryLoader.class */
public abstract class LibraryLoader {
    public static final LibraryLoader DEFAULT;
    public static final String TAG = "Mbgl-LibraryLoader";
    public static boolean loaded;
    public static volatile LibraryLoader loader;

    static {
        LibraryLoader defaultLibraryLoader = Mapbox.getModuleProvider().createLibraryLoaderProvider().getDefaultLibraryLoader();
        DEFAULT = defaultLibraryLoader;
        loader = defaultLibraryLoader;
    }

    public static void load() {
        try {
            if (loaded) {
                return;
            }
            loaded = true;
            loader.load("mapbox-gl");
        } catch (UnsatisfiedLinkError e) {
            loaded = false;
            Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e);
            MapStrictMode.strictModeViolation("Failed to load native shared library.", e);
        }
    }

    public static void setLibraryLoader(LibraryLoader libraryLoader) {
        loader = libraryLoader;
    }

    public abstract void load(String str);
}
