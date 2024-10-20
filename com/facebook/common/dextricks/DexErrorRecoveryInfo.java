package com.facebook.common.dextricks;

import X.AnonymousClass001;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: DexErrorRecoveryInfo.class */
public final class DexErrorRecoveryInfo {
    public static volatile boolean sDeoptTaint;
    public static DexErrorRecoveryInfo sMainStoreLoadInformation;
    public String dex2oatCmdLine;
    public boolean dexoptDuringColdStart;
    public Throwable fallbackCause;
    public int hacksDesired;
    public int hacksInstalled;
    public long loadAllTime;
    public int loadResult;
    public long odexLastModified;
    public String odexSchemeName;
    public long odexSize;
    public Throwable regenRetryCause;
    public int storageKind;
    public String storeRegenFilename;
    public long vdexLastModified;
    public long vdexSize;
    public Throwable xdexFailureCause;

    public static boolean deoptTaint() {
        return sDeoptTaint;
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        synchronized (DexErrorRecoveryInfo.class) {
            dexErrorRecoveryInfo = sMainStoreLoadInformation;
            if (dexErrorRecoveryInfo == null) {
                throw AnonymousClass001.A0J("main dex store not yet loaded");
            }
        }
        return dexErrorRecoveryInfo;
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformationNoThrow() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        synchronized (DexErrorRecoveryInfo.class) {
            dexErrorRecoveryInfo = sMainStoreLoadInformation;
        }
        return dexErrorRecoveryInfo;
    }

    public static void printExOrNull(PrintWriter printWriter, String str, Throwable th) {
        CharSequence charSequence;
        printWriter.format(" %s=", str);
        if (th == null) {
            charSequence = "null";
        } else {
            printWriter.append((CharSequence) "[");
            th.printStackTrace(printWriter);
            charSequence = "]";
        }
        printWriter.append(charSequence);
    }

    public static void setDeoptTaint(boolean z) {
        sDeoptTaint = z;
    }

    public static void setMainDexStoreLoadInformation(DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        synchronized (DexErrorRecoveryInfo.class) {
            sMainStoreLoadInformation = dexErrorRecoveryInfo;
        }
    }

    public long getLastCompilationTime() {
        String str = this.storeRegenFilename;
        if (str == null) {
            return 0L;
        }
        return AnonymousClass001.A0E(str).lastModified();
    }

    public boolean getRegenerated() {
        boolean z = true;
        if ((this.loadResult & 1) == 0) {
            z = false;
        }
        return z;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    printWriter.append((CharSequence) "<DexErrorRecoveryInfo");
                    printWriter.format(" loadResult=%x", Integer.valueOf(this.loadResult));
                    printWriter.format(" odexSchemeName=%s", this.odexSchemeName);
                    printWriter.format(" dexoptDuringColdStart=%b", Boolean.valueOf(this.dexoptDuringColdStart));
                    printWriter.format(" odexSize=%d", Long.valueOf(this.odexSize));
                    printWriter.format(" odexLastModified=%d", Long.valueOf(this.odexLastModified));
                    printWriter.format(" dex2oatCmdLine=%s", this.dex2oatCmdLine);
                    printWriter.format(" vdexSize=%d", Long.valueOf(this.vdexSize));
                    printWriter.format(" vdexLastModified=%d", Long.valueOf(this.vdexLastModified));
                    printWriter.format(" hacksDesired=%d", Integer.valueOf(this.hacksDesired));
                    printWriter.format(" hacksInstalled=%d", Integer.valueOf(this.hacksInstalled));
                    printExOrNull(printWriter, "regenRetryCause", this.regenRetryCause);
                    printExOrNull(printWriter, "fallbackCause", this.fallbackCause);
                    printExOrNull(printWriter, "xdexFailureCause", this.xdexFailureCause);
                    printWriter.append((CharSequence) ">");
                    printWriter.flush();
                    String obj = stringWriter.toString();
                    printWriter.close();
                    stringWriter.close();
                    return obj;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
