package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0cO;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* loaded from: DexManifest.class */
public final class DexManifest {
    public static final String DEX_EXT = ".dex";
    public static final String ODEX_EXT = ".odex";
    public final Dex[] dexes;
    public final String id;
    public final boolean isArtMainStore;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;
    public final C0cO superpackExtension;
    public final int superpackFiles;

    /* loaded from: DexManifest$Dex.class */
    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }

        public String makeDexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.DEX_EXT);
        }

        public String makeOdexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.ODEX_EXT);
        }

        public String toString() {
            return String.format("<Dex assetName:[%s]>", this.assetName);
        }
    }

    public DexManifest() {
        this.dexes = (Dex[]) AnonymousClass001.A0s().toArray(new Dex[0]);
        this.rootRelative = false;
        this.locators = false;
        this.superpackFiles = 0;
        this.superpackExtension = C0cO.NONE;
        this.id = DexStoreUtils.MAIN_DEX_STORE_ID;
        this.requires = (String[]) AnonymousClass001.A0s().toArray(new String[0]);
        this.isArtMainStore = true;
    }

    public DexManifest(InputStream inputStream) {
        ArrayList A0s = AnonymousClass001.A0s();
        C0cO c0cO = C0cO.NONE;
        String str = DexStoreUtils.MAIN_DEX_STORE_ID;
        ArrayList A0s2 = AnonymousClass001.A0s();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    this.rootRelative = z;
                    this.locators = z2;
                    this.superpackFiles = i;
                    this.superpackExtension = c0cO;
                    this.id = str;
                    this.requires = AnonymousClass002.A0b(A0s2);
                    this.dexes = (Dex[]) A0s.toArray(new Dex[A0s.size()]);
                    this.isArtMainStore = false;
                    return;
                }
                if (readLine.length() != 0) {
                    Mlog.v("Secondary program dex metadata: [%s]", readLine);
                    if (readLine.equals(".root_relative")) {
                        z = true;
                    } else if (readLine.equals(".locators")) {
                        z2 = true;
                    } else if (readLine.startsWith(".superpack_files")) {
                        i = Integer.parseInt(readLine.split(" ")[1]);
                    } else if (readLine.startsWith(".superpack_extension")) {
                        String str2 = readLine.split(" ")[1];
                        if (!str2.isEmpty()) {
                            if (str2.equalsIgnoreCase("xz")) {
                                c0cO = C0cO.XZ;
                            } else if (str2.equalsIgnoreCase("zst") || str2.equalsIgnoreCase("zstd")) {
                                c0cO = C0cO.ZST;
                            } else if (str2.equalsIgnoreCase("spo")) {
                                c0cO = C0cO.OB;
                            }
                        }
                        c0cO = c0cO;
                    } else if (readLine.startsWith(".id")) {
                        str = readLine.split(" ")[1];
                    } else if (readLine.startsWith(".requires")) {
                        A0s2.add(readLine.split(" ")[1]);
                    } else if (readLine.startsWith(".")) {
                        Mlog.w("ignoring dex metadata pragma [%s]", readLine);
                    } else {
                        String[] split = readLine.split(" ");
                        A0s.add(new Dex(split[0], split[1], split[2]));
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }
    }

    public static DexManifest loadManifestFrom(ResProvider resProvider, String str, boolean z) {
        InputStream open = resProvider.open(str);
        try {
            DexManifest dexManifest = new DexManifest(open);
            if (open != null) {
                open.close();
            }
            if (z && dexManifest.rootRelative) {
                resProvider.markRootRelative();
            }
            return dexManifest;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static String makeCompileUnitNameFromHashAndExtension(String str, String str2) {
        if (!str2.startsWith(".")) {
            str2 = 0Pz.A0W(".", str2);
        }
        return 0Pz.A0j("prog-", str, str2);
    }

    public static String makeDexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, DEX_EXT);
    }

    public static String makeOdexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, ODEX_EXT);
    }

    public boolean canLoadCanaryClass() {
        if (this.isArtMainStore) {
            Mlog.w("Art main store, not checking canary class", new Object[0]);
            return true;
        }
        Dex[] dexArr = this.dexes;
        if (dexArr.length == 0) {
            return false;
        }
        String str = dexArr[0].canaryClass;
        try {
            Mlog.v("attempting to detect built-in ART multidex by classloading %s", str);
            Class.forName(this.dexes[0].canaryClass);
            Mlog.i("ART native multi-dex in use: found %s", str);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            Mlog.i("ART multi-dex not in use: cannot load %s", str);
            return false;
        }
    }

    public boolean isArtMainStore() {
        return this.isArtMainStore;
    }

    public void verifyCanaryClasses() {
        int i = 0;
        if (this.isArtMainStore) {
            Mlog.w("Art main store, not verifying canary class", new Object[0]);
            return;
        }
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i >= dexArr.length) {
                return;
            }
            Class.forName(dexArr[i].canaryClass);
            i++;
        }
    }
}
