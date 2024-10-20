package com.facebook.acra.util;

import android.os.Environment;
import android.os.StatFs;

/* loaded from: StatFsUtil.class */
public class StatFsUtil {
    public static final long IN_BYTE = 1;
    public static final long IN_KILO_BYTE = 1024;
    public static final long IN_MEGA_BYTE = 1048576;

    /* loaded from: StatFsUtil$Api18Utils.class */
    public class Api18Utils {
        public static long getAvailableInternalStorageSpace(StatFs statFs) {
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }

        public static long getTotalInternalStorageSpace(StatFs statFs) {
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        }
    }

    public static long getAvailableInternalStorageSpace(long j) {
        try {
            return Api18Utils.getAvailableInternalStorageSpace(new StatFs(Environment.getDataDirectory().getPath())) / j;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static long getTotalInternalStorageSpace(long j) {
        try {
            return Api18Utils.getTotalInternalStorageSpace(new StatFs(Environment.getDataDirectory().getPath())) / j;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static long getUsedInternalStorageSpace(long j) {
        return (getTotalInternalStorageSpace(1L) - getAvailableInternalStorageSpace(1L)) / j;
    }
}
