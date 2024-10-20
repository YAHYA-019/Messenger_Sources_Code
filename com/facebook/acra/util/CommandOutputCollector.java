package com.facebook.acra.util;

import X.AnonymousClass001;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.InputStreamReader;

/* loaded from: CommandOutputCollector.class */
public class CommandOutputCollector {
    public static String collect(String... strArr) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Process start = new ProcessBuilder(strArr).redirectErrorStream(true).start();
        try {
            if (start.getOutputStream() != null) {
                start.getOutputStream().close();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(start.getInputStream());
            try {
                char[] cArr = new char[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
                while (true) {
                    int read = inputStreamReader.read(cArr, 0, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                    if (read == -1) {
                        break;
                    }
                    A0k.append(cArr, 0, read);
                }
                inputStreamReader.close();
                try {
                    start.waitFor();
                } catch (InterruptedException unused) {
                    AnonymousClass001.A13();
                }
                start.destroy();
                return A0k.toString();
            } finally {
            }
        } catch (Throwable th) {
            start.destroy();
            throw th;
        }
    }
}
