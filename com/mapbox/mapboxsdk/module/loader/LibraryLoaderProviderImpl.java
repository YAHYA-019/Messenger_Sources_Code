package com.mapbox.mapboxsdk.module.loader;

import X.C0il;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.LibraryLoaderProvider;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.log.Logger;

/* loaded from: LibraryLoaderProviderImpl.class */
public class LibraryLoaderProviderImpl implements LibraryLoaderProvider {
    public static final LibraryLoader DEFAULT;
    public static final String TAG = "Mbgl-LibraryLoader";
    public static boolean loaded;
    public static volatile LibraryLoader loader;

    /* loaded from: LibraryLoaderProviderImpl$SoLibraryLoader.class */
    public class SoLibraryLoader extends LibraryLoader {
        public SoLibraryLoader() {
        }

        @Override // com.mapbox.mapboxsdk.LibraryLoader
        public void load(String str) {
            try {
                if (!LibraryLoaderProviderImpl.loaded) {
                    LibraryLoaderProviderImpl.loader.load("mapbox-gl");
                }
                LibraryLoaderProviderImpl.loaded = true;
            } catch (UnsatisfiedLinkError e) {
                Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e);
                MapStrictMode.strictModeViolation("Failed to load native shared library.", e);
            }
        }
    }

    static {
        LibraryLoader libraryLoader = new LibraryLoader() { // from class: com.mapbox.mapboxsdk.module.loader.LibraryLoaderProviderImpl.1
            @Override // com.mapbox.mapboxsdk.LibraryLoader
            public void load(String str) {
                C0il.A0B(str);
            }
        };
        DEFAULT = libraryLoader;
        loader = libraryLoader;
    }

    @Override // com.mapbox.mapboxsdk.LibraryLoaderProvider
    public LibraryLoader getDefaultLibraryLoader() {
        return new SoLibraryLoader();
    }
}
