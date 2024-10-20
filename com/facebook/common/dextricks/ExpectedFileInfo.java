package com.facebook.common.dextricks;

import X.AnonymousClass001;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexUnpacker;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: ExpectedFileInfo.class */
public class ExpectedFileInfo {
    public final boolean coldstart;
    public final DexManifest.Dex dex;
    public final File dexFile;
    public final String dexName;
    public final boolean extended;
    public CompilationType mCompType;
    public boolean mIsOptional;
    public final int ordinal;
    public final boolean primary;
    public final String rawFile;
    public final boolean scroll;

    /* loaded from: ExpectedFileInfo$CompilationType.class */
    public enum CompilationType {
        ALL("all"),
        PGO("pgo"),
        NONE("none"),
        UNKNOWN("unknown");

        public final String mFriendlyName;

        CompilationType(String str) {
            this.mFriendlyName = str;
        }

        public String getFriendlyName() {
            return this.mFriendlyName;
        }

        @Override // java.lang.Enum
        public String toString() {
            return getFriendlyName();
        }
    }

    public ExpectedFileInfo(DexManifest.Dex dex) {
        this(dex, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, CompilationType compilationType) {
        this(dex, dex != null ? dex.makeDexName() : null, compilationType);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str) {
        this(dex, str, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, CompilationType compilationType) {
        this(dex, str, null, null, compilationType);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, File file, String str2, CompilationType compilationType) {
        this(dex, str, file, str2, compilationType, -1, false, false, false, false, false);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, File file, String str2, CompilationType compilationType, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.dex = dex;
        this.dexName = str;
        this.dexFile = file;
        this.rawFile = str2;
        this.mCompType = checkIsValidCompType(compilationType);
        this.ordinal = i;
        this.primary = z;
        this.coldstart = z2;
        this.extended = z3;
        this.scroll = z4;
        this.mIsOptional = z5;
    }

    public ExpectedFileInfo(DexUnpacker.CopiedDexInfo copiedDexInfo) {
        this(copiedDexInfo.dex, null, copiedDexInfo.dexFile, null, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(String str) {
        this(null, null, null, str, CompilationType.NONE);
    }

    public static CompilationType checkIsValidCompType(CompilationType compilationType) {
        if (compilationType == null) {
            Mlog.w("Comp type cannot be null defaulting to unknown", AnonymousClass001.A1Z());
            compilationType = CompilationType.UNKNOWN;
        }
        return compilationType;
    }

    public static ExpectedFileInfo[] convertTo(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return expectedFileInfoArr;
            }
            String str = strArr[i2];
            expectedFileInfoArr[i2] = str != null ? new ExpectedFileInfo(str) : null;
            i = i2 + 1;
        }
    }

    public static String[] convertTo(ExpectedFileInfo[] expectedFileInfoArr) {
        if (expectedFileInfoArr == null) {
            return null;
        }
        int length = expectedFileInfoArr.length;
        String[] strArr = new String[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return strArr;
            }
            ExpectedFileInfo expectedFileInfo = expectedFileInfoArr[i2];
            strArr[i2] = expectedFileInfo != null ? expectedFileInfo.toExpectedFileString() : null;
            i = i2 + 1;
        }
    }

    public static ExpectedFileInfo makeOdexFrom(DexManifest.Dex dex) {
        return new ExpectedFileInfo(dex.makeOdexName());
    }

    public static ExpectedFileInfo makeOdexFromName(String str) {
        return new ExpectedFileInfo(str);
    }

    public static List setCompTypeIfUnknown(List list, CompilationType compilationType) {
        if (list == null) {
            list = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ExpectedFileInfo expectedFileInfo = (ExpectedFileInfo) it.next();
                if (expectedFileInfo.isCompilationTypeUnknown()) {
                    expectedFileInfo.setCompilationType(compilationType);
                }
            }
        }
        return list;
    }

    public static List setCompTypeToPgoIfUnknown(List list) {
        return setCompTypeIfUnknown(list, CompilationType.PGO);
    }

    public CompilationType getCompilationType() {
        return this.mCompType;
    }

    public DexManifest.Dex getDex() {
        return this.dex;
    }

    public File getFile(DexStore dexStore) {
        return getFile(dexStore.root);
    }

    public File getFile(File file) {
        if (AnonymousClass001.A1T(this.rawFile) || isRootDex()) {
            return AnonymousClass001.A0D(file, toExpectedFileString());
        }
        if (isNonRootDex()) {
            return this.dexFile;
        }
        throw AnonymousClass001.A0T("Cannot generate file");
    }

    public File getFileFromAnotherRoot(File file) {
        String expectedFileString;
        if (AnonymousClass001.A1T(this.rawFile) || isRootDex()) {
            expectedFileString = toExpectedFileString();
        } else {
            if (!isNonRootDex()) {
                throw AnonymousClass001.A0T("Cannot generate file");
            }
            expectedFileString = this.dexFile.getName();
        }
        return AnonymousClass001.A0D(file, expectedFileString);
    }

    public boolean hasDex() {
        return AnonymousClass001.A1T(this.dex);
    }

    public boolean hasManifestData() {
        boolean z = false;
        if (this.ordinal != -1) {
            z = true;
        }
        return z;
    }

    public boolean isCompilationTypeMixedModeAll() {
        return CompilationType.ALL.equals(this.mCompType);
    }

    public boolean isCompilationTypePGO() {
        return CompilationType.PGO.equals(this.mCompType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (isCompilationTypeMixedModeAll() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isCompilationTypePgoOrMixedMode() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isCompilationTypePGO()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.isCompilationTypeMixedModeAll()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ExpectedFileInfo.isCompilationTypePgoOrMixedMode():boolean");
    }

    public boolean isCompilationTypeUnknown() {
        return CompilationType.UNKNOWN.equals(this.mCompType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.dexFile == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isNonRootDex() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.common.dextricks.DexManifest$Dex r0 = r0.dex
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            java.io.File r0 = r0.dexFile
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ExpectedFileInfo.isNonRootDex():boolean");
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public boolean isRawFile() {
        return AnonymousClass001.A1T(this.rawFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.dexName == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isRootDex() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.common.dextricks.DexManifest$Dex r0 = r0.dex
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            java.lang.String r0 = r0.dexName
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ExpectedFileInfo.isRootDex():boolean");
    }

    public void setCompilationType(CompilationType compilationType) {
        this.mCompType = checkIsValidCompType(compilationType);
    }

    public ExpectedFileInfo setIsOptional() {
        this.mIsOptional = true;
        return this;
    }

    public ExpectedFileInfo setIsOptional(boolean z) {
        this.mIsOptional = z;
        return this;
    }

    public String toExpectedFileString() {
        if (AnonymousClass001.A1T(this.rawFile)) {
            return this.rawFile;
        }
        if (isRootDex()) {
            return this.dexName;
        }
        throw AnonymousClass001.A0N("Cannot generated an expected string");
    }

    public String toString() {
        String str;
        String path;
        StringBuilder A0o = AnonymousClass001.A0o("[Expected File Info: ");
        if (!AnonymousClass001.A1T(this.rawFile)) {
            if (isRootDex()) {
                A0o.append("Dex Name: ");
                path = this.dexName;
            } else if (isNonRootDex()) {
                A0o.append("Dex File: ");
                path = this.dexFile.getPath();
            } else {
                str = "ERROR!";
            }
            A0o.append(path);
            A0o.append("Compilation Type: ");
            A0o.append(this.mCompType);
            return AnonymousClass001.A0d(" ]", A0o);
        }
        A0o.append("Raw File: ");
        str = this.rawFile;
        A0o.append(str);
        return AnonymousClass001.A0d(" ]", A0o);
    }
}
