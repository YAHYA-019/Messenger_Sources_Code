package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.util.Log;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: LogcatReader.class */
public abstract class LogcatReader {
    public static final int DEFAULT_WAIT_TIME = 10000;
    public static final int GROUP_IDX_PID = 4;
    public static final int GROUP_IDX_TAG = 5;
    public static final int GROUP_IDX_TIMESTAMP = 1;
    public static final int GROUP_IDX_YEAR = 3;
    public static final Pattern LOGCAT_INFO_PARSER = Pattern.compile("^(((\\d{4})-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})\\s+(\\d+)\\s+\\d+\\s\\w\\s(\\w+)\\s:.*");
    public static final boolean MUST_PARSE_PID = false;
    public static final String TAG = "LogcatReader";
    public final String mTag;
    public final File mTmpDir;

    public LogcatReader(String str, File file) {
        this.mTag = str;
        this.mTmpDir = file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        throw 1;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readAndParseProcessFile(int r302, java.io.RandomAccessFile r303) {
        /*
            r301 = this;
            r0 = r303
            java.lang.String r0 = com.facebook.common.dextricks.Fs.readProgramOutputFile(r0)
            r304 = r0
            r0 = 0
            r305 = r0
            java.lang.String r0 = "LogcatReader"
            r306 = r0
            r0 = r304
            if (r0 != 0) goto L1a
            r0 = r306
            java.lang.String r1 = "Cannot find logcat file to parse"
            int r0 = android.util.Log.w(r0, r1)
            r0 = 0
            return r0
        L1a:
            java.io.StringReader r0 = new java.io.StringReader     // Catch: java.lang.Throwable -> L8c
            r307 = r0
            r0 = r307
            r1 = r304
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8c
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8c java.lang.Throwable -> L8c
            r308 = r0
            r0 = r308
            r1 = r307
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8c
            r0 = 1
            r309 = r0
        L34:
            r0 = r308
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L82
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L61
            r0 = r301
            java.lang.String r0 = r0.mTag     // Catch: java.lang.Throwable -> L82
            r307 = r0
            r0 = r302
            r1 = r307
            r2 = r310
            boolean r0 = shouldProcess(r0, r1, r2)     // Catch: java.lang.Throwable -> L82
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L5b
            r0 = r301
            r1 = r310
            r0.processLine(r1)     // Catch: java.lang.Throwable -> L82
        L5b:
            r0 = 1
            r305 = r0
            goto L34
        L61:
            r0 = r305
            if (r0 != 0) goto L7a
            java.lang.String r0 = "Could not read out any logs. \n Read: "
            r307 = r0
            r0 = r307
            r1 = r304
            java.lang.String r0 = X.0Pz.A0W(r0, r1)     // Catch: java.lang.Throwable -> L82
            r307 = r0
            r0 = r306
            r1 = r307
            int r0 = android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L82
        L7a:
            r0 = r308
            r0.close()
            r0 = r309
            return r0
        L82:
            r307 = move-exception
            r0 = r308
            r0.close()
            r0 = r307
            throw r0
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.LogcatReader.readAndParseProcessFile(int, java.io.RandomAccessFile):boolean");
    }

    public static boolean shouldProcess(int i, String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (!MUST_PARSE_PID) {
            return true;
        }
        Matcher matcher = LOGCAT_INFO_PARSER.matcher(str2);
        if (matcher == null || !matcher.matches()) {
            AnonymousClass001.A1F("Logcat line is not in the expected form. Line: %s", TAG, new Object[]{str2});
            return false;
        }
        String group = matcher.group(4);
        if (!matcher.group(5).equals(str)) {
            return false;
        }
        try {
            return Integer.parseInt(group) == i;
        } catch (NumberFormatException e) {
            Log.w(TAG, String.format("Could not process line since %s is not a number", group), e);
            return false;
        }
    }

    public abstract void processLine(String str);

    public final boolean readAndParseProcess(int i) {
        return readAndParseProcess(i, DEFAULT_WAIT_TIME);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean readAndParseProcess(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.LogcatReader.readAndParseProcess(int, int):boolean");
    }

    public abstract void reset();
}
