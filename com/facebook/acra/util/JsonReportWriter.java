package com.facebook.acra.util;

import X.0Ug;
import X.0fH;
import X.AnonymousClass001;
import android.util.JsonWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: JsonReportWriter.class */
public class JsonReportWriter {
    public static String LOG_TAG = "JsonReportWriter";

    public static void writeGzipJsonReport(Map map, Map map2, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            writeJsonReport(map, map2, gZIPOutputStream);
            gZIPOutputStream.close();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    public static boolean writeGzipJsonReport(Map map, Map map2, File file) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                writeGzipJsonReport(map, map2, fileOutputStream);
                fileOutputStream.close();
                0fH.A0d(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), AnonymousClass001.A0P(file), LOG_TAG, "Gzip %s ms %s bytes");
                return true;
            } finally {
            }
        } catch (IOException e) {
            0fH.A0z(LOG_TAG, "Could not write report %s", e, new Object[]{file.getPath()});
            return false;
        }
    }

    public static void writeJsonReport(Map map, Map map2, OutputStream outputStream) {
        JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (A0z.getValue() == null) {
                0fH.A14(LOG_TAG, "Ignoring NULL Field %s", new Object[]{A0z.getKey()});
            } else {
                jsonWriter.name(AnonymousClass001.A0j(A0z)).value((String) A0z.getValue());
            }
        }
        Iterator A0y2 = AnonymousClass001.A0y(map2);
        while (A0y2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
            0fH.A0d(A0z2.getKey(), A0z2.getValue(), LOG_TAG, "Field %s -> %s");
            InputStreamField inputStreamField = (InputStreamField) A0z2.getValue();
            InputStream inputStream = inputStreamField.mInputStream;
            if (inputStream instanceof FileInputStream) {
                ((FileInputStream) inputStream).getChannel().position(0L);
            }
            try {
                String loadAttachment = AttachmentUtil.loadAttachment(inputStream, (int) inputStreamField.mLength);
                jsonWriter.name(AnonymousClass001.A0j(A0z2)).value(loadAttachment);
                0fH.A0d(Long.valueOf(inputStreamField.mLength), Integer.valueOf(loadAttachment.length()), LOG_TAG, "Attachment ori len %d -> encoded len %d");
            } catch (Throwable th) {
                jsonWriter.name(AnonymousClass001.A0j(A0z2)).value("");
                0fH.A11(LOG_TAG, "Attachment skipped len %d ", th, new Object[]{Long.valueOf(inputStreamField.mLength)});
            }
        }
        jsonWriter.endObject();
        jsonWriter.close();
    }
}
