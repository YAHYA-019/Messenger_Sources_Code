package com.facebook.acra.util;

/* loaded from: ProcFileReader.class */
public abstract class ProcFileReader {
    public static final int CANNOT_DETERMINE_OPEN_FDS = 255;
    public static final int SECURITY_EXCEPTION = 254;

    /* loaded from: ProcFileReader$OpenFDLimits.class */
    public class OpenFDLimits {
        public final int hardLimit;
        public final int softLimit;

        public OpenFDLimits(int i, int i2) {
            this.softLimit = i;
            this.hardLimit = i2;
        }
    }

    public static ProcFileReader getProcFileReader() {
        return NativeProcFileReader.sReadyToUse.get() ? NativeProcFileReader.getInstance() : JavaProcFileReader.getInstance();
    }

    public abstract int getOpenFDCount();

    public abstract OpenFDLimits getOpenFDLimits();

    public abstract String getOpenFileDescriptors();
}
