package com.facebook.breakpad;

import X.0fH;
import X.AnonymousClass001;
import X.C0il;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: UnwindstackStreamManager.class */
public class UnwindstackStreamManager {
    public static volatile boolean isRegistered;
    public static boolean isUnwindstackJniLoaded;

    static {
        try {
            C0il.A0B("unwindstack_stream");
            isUnwindstackJniLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            0fH.A0r("unwindstack", "Failed to load unwindstack jni library: ", e);
        }
    }

    public static native void nativeRegister(String str, String str2);

    public static native void nativeUnregister();

    public static boolean register() {
        String A03;
        boolean z;
        synchronized (UnwindstackStreamManager.class) {
            if (!isRegistered) {
                if (isUnwindstackJniLoaded) {
                    try {
                        A03 = C0il.A03("libunwindstack_binary.so");
                    } catch (IOException e) {
                        0fH.A0r("unwindstack", "Error registering unwindstack stream", e);
                    }
                    if (A03 == null) {
                        0fH.A0k("unwindstack", "Unable to find libunwindstack_binary.so");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("libunwindstack_binary.so");
                        ArrayList arrayList2 = new ArrayList();
                        File parentFile = new File(A03).getParentFile();
                        if (parentFile != null) {
                            arrayList2.add(parentFile.getCanonicalPath());
                        }
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            String str = (String) arrayList.get(i2);
                            ReentrantReadWriteLock reentrantReadWriteLock = C0il.A08;
                            reentrantReadWriteLock.readLock().lock();
                            try {
                                String[] strArr = null;
                                if (C0il.A0C != null) {
                                    int i3 = 0;
                                    do {
                                        if (i3 >= C0il.A0C.length) {
                                            break;
                                        }
                                        strArr = C0il.A0C[i3].A03(str);
                                        i3++;
                                    } while (strArr == null);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                if (strArr == null) {
                                    0fH.A17("unwindstack", "unable to find dependencies for %s, but it's okay for SystemLoadWrapperSoSource", new Object[]{arrayList.get(i2)});
                                } else {
                                    for (String str2 : strArr) {
                                        String A032 = C0il.A03(str2);
                                        if (A032 == null) {
                                            0fH.A17("unwindstack", "unable to find path for %s", new Object[]{str2});
                                        } else if (!arrayList.contains(str2) && !A032.startsWith("/system") && !A032.startsWith("/vendor") && !A032.startsWith("/apex") && !A032.startsWith("/odm")) {
                                            arrayList.add(str2);
                                            File parentFile2 = new File(A032).getParentFile();
                                            if (parentFile2 != null) {
                                                String canonicalPath = parentFile2.getCanonicalPath();
                                                if (!arrayList2.contains(canonicalPath)) {
                                                    arrayList2.add(canonicalPath);
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2 + 1;
                            } catch (Throwable th) {
                                AnonymousClass001.A1M(reentrantReadWriteLock);
                                throw th;
                            }
                        }
                        StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
                        int i4 = 1;
                        while (true) {
                            int i5 = i4;
                            if (i5 >= arrayList2.size()) {
                                break;
                            }
                            sb.append(":");
                            sb.append((String) arrayList2.get(i5));
                            i4 = i5 + 1;
                        }
                        String obj = sb.toString();
                        0fH.A0d(obj, A03, "unwindstack", "Register unwindstack stream with search path (%s) and binary path (%s)");
                        nativeRegister(A03, obj);
                        z = true;
                        isRegistered = z;
                    }
                } else {
                    0fH.A0k("unwindstack", "Loading unwindstack jni native library failed. Cannot register unwindstack stream to breakpad");
                }
                z = false;
                isRegistered = z;
            }
        }
        return isRegistered;
    }
}
