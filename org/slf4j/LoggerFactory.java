package org.slf4j;

import X.0Pz;
import X.2Ak;
import X.AnonymousClass001;
import X.C29Z;
import X.C29a;
import X.C29c;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: LoggerFactory.class */
public final class LoggerFactory {
    public static int A00;
    public static C29Z A02 = new C29Z();
    public static C29c A01 = new Object();
    public static final String[] A03 = {"1.6", "1.7"};

    public static final void A00(String str) {
        System.err.println(0Pz.A0W("SLF4J: ", str));
    }

    public static void A01(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    public static 2Ak getLogger(String str) {
        C29a c29a;
        String[] strArr;
        if (A00 == 0) {
            A00 = 1;
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = LoggerFactory.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    A01("Error getting resources from path", e);
                }
                if (linkedHashSet.size() > 1) {
                    A00("Class path contains multiple SLF4J bindings.");
                    for (Object obj : linkedHashSet) {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Found binding in [");
                        A0k.append(obj);
                        A00(AnonymousClass001.A0d("]", A0k));
                    }
                    A00("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                }
                StaticLoggerBinder.getSingleton();
                A00 = 3;
                if (linkedHashSet.size() > 1) {
                    A00(0Pz.A0j("Actual binding is of type [", StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr(), "]"));
                }
                C29Z c29z = A02;
                ArrayList A0s = AnonymousClass001.A0s();
                List list = c29z.A00;
                synchronized (list) {
                    A0s.addAll(list);
                }
                if (A0s.size() != 0) {
                    A00("The following loggers will not work because they were created");
                    A00("during the default configuration phase of the underlying logging system.");
                    A00("See also http://www.slf4j.org/codes.html#substituteLogger");
                    int i = 0;
                    while (true) {
                        if (i >= A0s.size()) {
                            break;
                        }
                        A00((String) A0s.get(i));
                        i++;
                    }
                }
            } catch (Exception e2) {
                A00 = 2;
                A01("Failed to instantiate SLF4J LoggerFactory", e2);
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                String message = e3.getMessage();
                if (message == null || (message.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && message.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1)) {
                    A00 = 2;
                    A01("Failed to instantiate SLF4J LoggerFactory", e3);
                    throw e3;
                }
                A00 = 4;
                A00("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                A00("Defaulting to no-operation (NOP) logger implementation");
                A00("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                    A00 = 2;
                    A00("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    A00("Your binding is version 1.5.5 or earlier.");
                    A00("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
            if (A00 == 3) {
                try {
                    String str2 = StaticLoggerBinder.REQUESTED_API_VERSION;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        strArr = A03;
                        if (i2 >= 2) {
                            break;
                        }
                        if (str2.startsWith(strArr[i2])) {
                            z = true;
                        }
                        i2++;
                    }
                    if (!z) {
                        A00(0Pz.A0v("The requested version ", str2, " by your slf4j binding is not compatible with ", Arrays.asList(strArr).toString()));
                        A00("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    A01("Unexpected problem occured during version sanity check", th);
                }
            }
        }
        int i3 = A00;
        if (i3 == 1) {
            c29a = A02;
        } else {
            if (i3 == 2) {
                throw AnonymousClass001.A0N("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i3 == 3) {
                c29a = StaticLoggerBinder.getSingleton().getLoggerFactory();
            } else {
                if (i3 != 4) {
                    throw AnonymousClass001.A0N("Unreachable code");
                }
                c29a = A01;
            }
        }
        return c29a.Aug(str);
    }
}
