package com.facebook.acra.anr;

import X.0fH;
import X.AnonymousClass001;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: SigquitRecord.class */
public class SigquitRecord {
    public static final long ERROR_READING_TIME_INFO = 255;
    public static final String TAG = "SigquitRecord";
    public static final ArrayList sRecords = AnonymousClass001.A0s();
    public final long callbackUptimeMs;
    public final long sigquitUptimeMs;

    public SigquitRecord(long j, long j2) {
        this.callbackUptimeMs = j;
        this.sigquitUptimeMs = j2;
    }

    public static long convertRawBytesToLong(byte[] bArr) {
        int i = 0;
        long j = 0;
        int i2 = 0;
        do {
            j += (bArr[i] & 255) << i2;
            i2 += 8;
            i++;
        } while (i < 8);
        return j;
    }

    public static String getRecordsJson(Long l) {
        String str;
        synchronized (SigquitRecord.class) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = sRecords.iterator();
                while (it.hasNext()) {
                    SigquitRecord sigquitRecord = (SigquitRecord) it.next();
                    if (l != null && sigquitRecord.callbackUptimeMs > l.longValue()) {
                        break;
                    }
                    JSONObject A12 = AnonymousClass001.A12();
                    A12.put("callback_uptime_ms", sigquitRecord.callbackUptimeMs);
                    A12.put("sigquit_uptime_ms", sigquitRecord.sigquitUptimeMs);
                    jSONArray.put(A12);
                }
                str = jSONArray.toString();
                if (str == null) {
                    str = "";
                }
            } catch (JSONException unused) {
                str = "\"json error\"";
            }
        }
        return str;
    }

    public static long readSigquitUptimeMs(String str) {
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[8];
                if (fileInputStream.read(bArr) != 8) {
                    0fH.A17(TAG, "Corrupted file %s", new Object[]{str});
                    fileInputStream.close();
                    return j;
                }
                long convertRawBytesToLong = convertRawBytesToLong(bArr) / 1000000;
                fileInputStream.close();
                return convertRawBytesToLong;
            } finally {
            }
        } catch (IOException e) {
            0fH.A17(TAG, "Could not read from file %s", new Object[]{str, e});
            return j;
        }
    }

    public static void updateRecords(long j, String str) {
        if (str != null) {
            synchronized (SigquitRecord.class) {
                ArrayList arrayList = sRecords;
                if (arrayList.size() <= 0 || ((SigquitRecord) arrayList.get(arrayList.size() - 1)).callbackUptimeMs != j) {
                    arrayList.add(new SigquitRecord(j, readSigquitUptimeMs(str)));
                }
            }
        }
    }
}
