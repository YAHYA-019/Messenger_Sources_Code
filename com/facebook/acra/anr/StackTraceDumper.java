package com.facebook.acra.anr;

import X.AnonymousClass001;
import android.os.Looper;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* loaded from: StackTraceDumper.class */
public class StackTraceDumper {
    public static void dumpStackTraces(OutputStream outputStream) {
        dumpStackTraces(outputStream, null, null);
    }

    public static void dumpStackTraces(OutputStream outputStream, String str, String str2) {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (str != null) {
            printWriter.println(str);
            printWriter.println(str2);
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        Iterator A0y = AnonymousClass001.A0y(allStackTraces);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            printThread(printWriter, (Thread) A0z.getKey(), (StackTraceElement[]) A0z.getValue());
        }
        if (!allStackTraces.containsKey(thread)) {
            printThread(printWriter, thread, thread.getStackTrace());
        }
        printWriter.flush();
    }

    public static void printThread(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(" ");
        printWriter.print(thread.getState());
        printWriter.println(":");
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                printWriter.println();
                return;
            } else {
                printWriter.println(stackTraceElementArr[i2]);
                i = i2 + 1;
            }
        }
    }
}
