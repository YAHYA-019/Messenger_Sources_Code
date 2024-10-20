package com.facebook.acra.util.minidump;

import X.0Ug;
import X.0fH;
import X.AnonymousClass001;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.HashSet;

/* loaded from: MinidumpReader.class */
public class MinidumpReader {
    public static final String ALT_STACK = "WriteThreadUnwindStream failed";
    public static final String CUSTOM_STREAM_GLOBAL = "global";
    public static final String LOG_TAG = "MinidumpReader";
    public static final int MD_FB_APP_CUSTOM_DATA = -87110918;
    public static final int MD_FB_APP_STATE_LOG = -87110452;
    public static final int MD_FB_APP_VERSION_CODE = -87110917;
    public static final int MD_FB_APP_VERSION_NAME = -87110916;
    public static final int MD_FB_DUMP_ERROR_LOG = -87110912;
    public static final int MD_FB_JAVA_STACK = -87110915;
    public static final int MD_FB_STREAM_MARKERS = -87162880;
    public static final long MD_FB_UNWIND_SYMBOLS_OFFSET = 17592186044416L;
    public static final int MD_HEADER_SIGNATURE = 1347241037;
    public static final int MD_LINUX_CMD_LINE = 1197932550;
    public static final int MD_MODULE_LIST_STREAM = 4;
    public static final int MD_MODULE_LIST_STREAM_OFFSET = 16;
    public static final int MD_THREAD_LIST_STREAM_OFFSET = 8;
    public static final int MODULE_FULL_SIZE = 108;
    public static final String MODULE_LIST = "WriteMappings failed";
    public static final int MODULE_LIST_OFFSET = 24;
    public static final String THREAD_LIST = "WriteThreadListStream failed";
    public RandomAccessFile mHandle;
    public int mStreamCount;
    public int mStreamsPos;

    /* loaded from: MinidumpReader$MDLocationDescription.class */
    public class MDLocationDescription {
        public int pos;
        public int size;

        public MDLocationDescription(int i, int i2) {
            this.pos = i;
            this.size = i2;
        }
    }

    /* loaded from: MinidumpReader$MinidumpMarkers.class */
    public class MinidumpMarkers {
        public long endMarker;
        public long startMarker;

        public MinidumpMarkers(long j, long j2) {
            this.startMarker = j;
            this.endMarker = j2;
        }
    }

    public MinidumpReader(RandomAccessFile randomAccessFile) {
        this.mHandle = randomAccessFile;
        randomAccessFile.seek(0L);
        if (readIntLE() != 1347241037) {
            throw AnonymousClass001.A0T("Invalid minidump signature");
        }
        this.mHandle.skipBytes(4);
        this.mStreamCount = readIntLE();
        this.mStreamsPos = readIntLE();
    }

    public static boolean checkMinidumpErrLogStream(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains(MODULE_LIST)) {
            return true;
        }
        return str.contains(THREAD_LIST) && str.contains(ALT_STACK);
    }

    public static boolean checkMinidumpMarkerStream(long j) {
        return AnonymousClass001.A1N(((((long) 16) & j) > 0L ? 1 : ((((long) 16) & j) == 0L ? 0 : -1))) || (AnonymousClass001.A1N(((((long) 8) & j) > 0L ? 1 : ((((long) 8) & j) == 0L ? 0 : -1))) && AnonymousClass001.A1N(((j & MD_FB_UNWIND_SYMBOLS_OFFSET) > 0L ? 1 : ((j & MD_FB_UNWIND_SYMBOLS_OFFSET) == 0L ? 0 : -1))));
    }

    private MDLocationDescription findStream(int i) {
        this.mHandle.seek(this.mStreamsPos);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.mStreamCount) {
                return null;
            }
            int readIntLE = readIntLE();
            int readIntLE2 = readIntLE();
            int readIntLE3 = readIntLE();
            if (readIntLE == i) {
                return new MDLocationDescription(readIntLE3, readIntLE2);
            }
            i2 = i3 + 1;
        }
    }

    private Integer getInt(MDLocationDescription mDLocationDescription) {
        if (mDLocationDescription == null || mDLocationDescription.size != 4) {
            return null;
        }
        this.mHandle.seek(mDLocationDescription.pos);
        return Integer.valueOf(readIntLE());
    }

    private String getModuleString(MDLocationDescription mDLocationDescription) {
        this.mHandle.seek(mDLocationDescription.pos);
        int i = mDLocationDescription.size;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i / 2];
        this.mHandle.read(bArr);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= mDLocationDescription.size / 2) {
                return new String(bArr2);
            }
            bArr2[i3] = bArr[i3 * 2];
            i2 = i3 + 1;
        }
    }

    private String getString(MDLocationDescription mDLocationDescription) {
        if (mDLocationDescription == null) {
            return null;
        }
        this.mHandle.seek(mDLocationDescription.pos);
        byte[] bArr = new byte[mDLocationDescription.size];
        this.mHandle.read(bArr);
        return new String(bArr);
    }

    public static boolean isSystemModule(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("/system") || str.startsWith("/apex") || str.startsWith("/vendor") || str.startsWith("/odm")) {
            return str.endsWith(".so") || str.contains("app_process") || str.endsWith("linker");
        }
        return false;
    }

    private int readIntLE() {
        int readInt = this.mHandle.readInt();
        return ((readInt >> 24) & 255) | ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >> 8);
    }

    private long readLongIntLE() {
        long readLong = this.mHandle.readLong();
        return (((readLong >> 56) & 255) << 0) | (((readLong >> 0) & 255) << 56) | (((readLong >> 8) & 255) << 48) | (((readLong >> 16) & 255) << 40) | (((readLong >> 24) & 255) << 32) | (((readLong >> 32) & 255) << 24) | (((readLong >> 40) & 255) << 16) | (((readLong >> 48) & 255) << 8);
    }

    public static JsonReader retrieveJsonNode(JsonReader jsonReader, String str) {
        if (jsonReader == null) {
            return null;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek() != JsonToken.NULL) {
                if (nextName.equals(str)) {
                    return jsonReader;
                }
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return null;
    }

    public boolean checkIfMinidumpCorrupted() {
        MinidumpMarkers minidumpMarkers = getMinidumpMarkers();
        boolean z = false;
        boolean checkMinidumpMarkerStream = minidumpMarkers != null ? checkMinidumpMarkerStream(minidumpMarkers.startMarker ^ minidumpMarkers.endMarker) : false;
        boolean checkMinidumpErrLogStream = checkMinidumpErrLogStream(getErrorLogData());
        if (checkMinidumpMarkerStream || checkMinidumpErrLogStream) {
            z = true;
        }
        return z;
    }

    public String getCustomData(String str) {
        String str2;
        try {
            str2 = getString(MD_FB_APP_CUSTOM_DATA);
            if (str2 == null) {
                return null;
            }
            try {
                return getCustomDataFromJson(str2, str);
            } catch (Exception e) {
                e = e;
                0fH.A0z(LOG_TAG, "getCustomData error: %s", e, new Object[]{str2});
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
        }
    }

    public String getCustomDataFromJson(String str, String str2) {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            JsonReader retrieveJsonNode = retrieveJsonNode(retrieveJsonNode(jsonReader, CUSTOM_STREAM_GLOBAL), str2);
            String nextString = retrieveJsonNode != null ? retrieveJsonNode.nextString() : null;
            jsonReader.close();
            return nextString;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    public String getErrorLogData() {
        try {
            return getString(MD_FB_DUMP_ERROR_LOG);
        } catch (IOException e) {
            0fH.A0z(LOG_TAG, "getErrorLogData error: %s", e, new Object[]{""});
            return null;
        }
    }

    public Integer getInt(int i) {
        return getInt(findStream(i));
    }

    public String getJavaStack() {
        try {
            return getString(MD_FB_JAVA_STACK);
        } catch (IOException e) {
            0fH.A0s(LOG_TAG, "getJavaStack error", e);
            return null;
        }
    }

    public MinidumpMarkers getMinidumpMarkers() {
        try {
            if (findStream(MD_FB_STREAM_MARKERS) == null) {
                return null;
            }
            this.mHandle.seek(r0.pos);
            return new MinidumpMarkers(readLongIntLE(), readLongIntLE());
        } catch (IOException e) {
            0fH.A0s(LOG_TAG, "getMinidumpMarkers failed to read", e);
            return null;
        }
    }

    public HashSet getModuleList() {
        try {
            MDLocationDescription findStream = findStream(4);
            if (findStream == null) {
                0fH.A0k(LOG_TAG, "Stream is Null");
                return null;
            }
            this.mHandle.seek(findStream.pos);
            int readIntLE = readIntLE();
            HashSet A0v = AnonymousClass001.A0v();
            int i = findStream.pos;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readIntLE) {
                    return A0v;
                }
                this.mHandle.seek(i + 24);
                this.mHandle.seek(readIntLE());
                String moduleString = getModuleString(new MDLocationDescription((int) this.mHandle.getFilePointer(), readIntLE()));
                if (isSystemModule(moduleString)) {
                    A0v.add(moduleString);
                }
                i += 108;
                i2 = i3 + 1;
            }
        } catch (IOException e) {
            0fH.A0s(LOG_TAG, "getModuleList failed to read", e);
            return null;
        }
    }

    public String getString(int i) {
        String string = getString(findStream(i));
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        return string;
    }
}
