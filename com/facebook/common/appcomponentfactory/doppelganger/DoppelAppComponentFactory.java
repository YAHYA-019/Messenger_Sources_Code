package com.facebook.common.appcomponentfactory.doppelganger;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.Log;
import dalvik.system.PathClassLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: DoppelAppComponentFactory.class */
public abstract class DoppelAppComponentFactory extends AppComponentFactory {
    public static String cachedProcessName;
    public static AppComponentFactory delegate;

    static {
        Log.w("DoppelAppComponentFact", "Loading libappcomponentfactory-jni.so");
        System.loadLibrary("appcomponentfactory-jni");
        Log.w("DoppelAppComponentFact", "libappcomponentfactory-jni.so is loaded");
    }

    private ClassLoader createSplitClassLoader(String str, ClassLoader classLoader, ApplicationInfo applicationInfo) {
        String splitApkPath = getSplitApkPath(applicationInfo, str);
        if (splitApkPath == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("SplitApk not found for");
            sb.append(str);
            Log.w("DoppelAppComponentFact", sb.toString());
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Found splitApk at ");
        sb2.append(splitApkPath);
        Log.w("DoppelAppComponentFact", sb2.toString());
        doDistractHook();
        setMadviseFileForRangeEnabled(false);
        PathClassLoader pathClassLoader = new PathClassLoader(splitApkPath, applicationInfo.nativeLibraryDir, classLoader);
        setMadviseFileForRangeEnabled(true);
        unhook();
        return pathClassLoader;
    }

    private native void doDistractHook();

    private boolean ensureDelegateInitialized(ClassLoader classLoader) {
        boolean z = true;
        if (delegate != null) {
            return true;
        }
        if (shouldSkipAppComponenFactory()) {
            Log.w("DoppelAppComponentFact", "Using IsolatedProcessAppComponentFactory for isolated process.");
            delegate = new IsolatedProcessAppComponentFactory();
            return true;
        }
        Log.w("DoppelAppComponentFact", "Delegate not initialized yet, fallback loading.");
        loadActualAppComponentFactory(classLoader);
        if (delegate == null) {
            z = false;
        }
        return z;
    }

    public static String getProcessNameByPid(int i) {
        String str;
        synchronized (DoppelAppComponentFactory.class) {
            String str2 = cachedProcessName;
            if (str2 != null) {
                return str2;
            }
            Log.w("DoppelAppComponentFact", "Enter slow path of getProcessNameByPid");
            str = "";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("/proc/");
                sb.append(i);
                sb.append("/cmdline");
                File file = new File(sb.toString());
                if (file.exists() && file.canRead()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    String readLine = bufferedReader.readLine();
                    str = readLine != null ? readLine.trim() : "";
                    bufferedReader.close();
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get process name for pid from /proc");
                sb2.append(i);
                Log.w("DoppelAppComponentFact", sb2.toString(), e);
            }
            cachedProcessName = str;
            return str;
        }
    }

    private String getSplitApkPath(ApplicationInfo applicationInfo, String str) {
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("split_");
        sb.append(str);
        sb.append(".apk");
        String obj = sb.toString();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].endsWith(obj)) {
                return strArr[i];
            }
        }
        return null;
    }

    public static boolean isAppZygoteProcess(int i) {
        String processName = Application.getProcessName();
        if (processName != null) {
            logProcessInfo(processName);
            return processName.contains("_zygote");
        }
        String processNameByPid = getProcessNameByPid(i);
        logProcessInfo(processNameByPid);
        return processNameByPid.contains("_zygote");
    }

    private void loadActualAppComponentFactory(ClassLoader classLoader) {
        try {
            delegate = (AppComponentFactory) classLoader.loadClass(actualAppComponentFactoryName()).getConstructor(new Class[0]).newInstance(new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("Delegate factory has been initialized ");
            sb.append(delegate);
            Log.w("DoppelAppComponentFact", sb.toString());
        } catch (Exception e) {
            Log.e("DoppelAppComponentFact", "Failed to load delegate class", e);
        }
    }

    private void logDelegateNotInitialized(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Delegate not initialized for ");
        sb.append(str);
        Log.e("DoppelAppComponentFact", sb.toString());
    }

    public static void logProcessInfo(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("uid:");
        sb.append(Process.myUid());
        sb.append(" pid:");
        sb.append(Process.myPid());
        sb.append(" tid:");
        sb.append(Process.myTid());
        sb.append(" name:");
        sb.append(str);
        Log.w("DoppelAppComponentFact", sb.toString());
    }

    private native void setMadviseFileForRangeEnabled(boolean z);

    private native void unhook();

    public abstract String actualAppComponentFactoryName();

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        if (ensureDelegateInitialized(classLoader)) {
            return delegate.instantiateActivity(classLoader, str, intent);
        }
        logDelegateNotInitialized("instantiateActivity");
        return super.instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        if (ensureDelegateInitialized(classLoader)) {
            return delegate.instantiateApplication(classLoader, str);
        }
        logDelegateNotInitialized("instantiateApplication");
        return super.instantiateApplication(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        Log.w("DoppelAppComponentFact", "Enter instantiateClassLoader");
        if (shouldSkipAppComponenFactory()) {
            Log.w("DoppelAppComponentFact", "Skipping instantiateClassLoader for non-main processes.");
            return super.instantiateClassLoader(classLoader, applicationInfo);
        }
        ClassLoader createSplitClassLoader = createSplitClassLoader("d_longtail_raw_v11", classLoader, applicationInfo);
        if (createSplitClassLoader == null) {
            Log.w("DoppelAppComponentFact", "Could not create split class loader for d_longtail_raw_v11");
            return super.instantiateClassLoader(classLoader, applicationInfo);
        }
        loadActualAppComponentFactory(createSplitClassLoader);
        return createSplitClassLoader;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        if (ensureDelegateInitialized(classLoader)) {
            return delegate.instantiateProvider(classLoader, str);
        }
        logDelegateNotInitialized("instantiateProvider");
        return super.instantiateProvider(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        if (ensureDelegateInitialized(classLoader)) {
            return delegate.instantiateReceiver(classLoader, str, intent);
        }
        logDelegateNotInitialized("instantiateReceiver");
        return super.instantiateReceiver(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        if (ensureDelegateInitialized(classLoader)) {
            return delegate.instantiateService(classLoader, str, intent);
        }
        logDelegateNotInitialized("instantiateService");
        return super.instantiateService(classLoader, str, intent);
    }

    public boolean shouldSkipAppComponenFactory() {
        if (Process.isIsolated()) {
            Log.w("DoppelAppComponentFact", "Is current process isolated true.");
            return true;
        }
        Log.w("DoppelAppComponentFact", "Is current process isolated false.");
        return isAppZygoteProcess(Process.myPid());
    }
}
