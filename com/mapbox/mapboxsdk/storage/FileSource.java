package com.mapbox.mapboxsdk.storage;

import X.0Pz;
import X.JQz;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.utils.FileUtils;
import com.mapbox.mapboxsdk.utils.ThreadUtils;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: FileSource.class */
public class FileSource {
    public static FileSource INSTANCE;
    public static final String MAPBOX_SHARED_PREFERENCE_RESOURCES_CACHE_PATH = "fileSourceResourcesCachePath";
    public static final String TAG = "Mbgl-FileSource";
    public static String internalCachePath;
    public static String resourcesCachePath;
    public static boolean sPersistCacheAcrossLogouts;
    public long nativePtr;
    public static final Lock resourcesCachePathLoaderLock = new ReentrantLock();
    public static final Lock internalCachePathLoaderLock = new ReentrantLock();

    /* loaded from: FileSource$FileDirsPathsTask.class */
    public class FileDirsPathsTask extends AsyncTask {
        public FileDirsPathsTask() {
        }

        public /* synthetic */ FileDirsPathsTask(AnonymousClass1 anonymousClass1) {
        }

        @Override // android.os.AsyncTask
        public String[] doInBackground(Context... contextArr) {
            return new String[]{FileSource.getCachePath(contextArr[0]), contextArr[0].getCacheDir().getAbsolutePath()};
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            FileSource.unlockPathLoaders();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String[] strArr) {
            FileSource.resourcesCachePath = strArr[0];
            FileSource.internalCachePath = strArr[1];
            FileSource.unlockPathLoaders();
        }
    }

    /* loaded from: FileSource$ResourceTransformCallback.class */
    public interface ResourceTransformCallback {
        String onURL(int i, String str);
    }

    /* loaded from: FileSource$ResourcesCachePathChangeCallback.class */
    public interface ResourcesCachePathChangeCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public FileSource(String str, AssetManager assetManager) {
        Mapbox.validateMapbox();
        initialize(Mapbox.INSTANCE.accessToken, str, assetManager);
    }

    public static String getCachePath(Context context) {
        String string = context.getSharedPreferences(MapboxConstants.MAPBOX_SHARED_PREFERENCES, 0).getString(MAPBOX_SHARED_PREFERENCE_RESOURCES_CACHE_PATH, null);
        if (!isPathWritable(string)) {
            string = getDefaultCachePath(context);
            context.getSharedPreferences(MapboxConstants.MAPBOX_SHARED_PREFERENCES, 0).edit().remove(MAPBOX_SHARED_PREFERENCE_RESOURCES_CACHE_PATH).apply();
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r303 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDefaultCachePath(android.content.Context r301) {
        /*
            r0 = r301
            boolean r0 = isExternalStorageConfiguration(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            boolean r0 = isExternalStorageReadable()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
        L1d:
            r0 = r303
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L22:
            boolean r0 = com.mapbox.mapboxsdk.storage.FileSource.sPersistCacheAcrossLogouts
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r301
            java.lang.String r1 = "mapbox"
            r2 = 0
            java.io.File r0 = r0.getDir(r1, r2)
            r303 = r0
            goto L1d
        L35:
            r0 = r301
            java.io.File r0 = r0.getFilesDir()
            r303 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.storage.FileSource.getDefaultCachePath(android.content.Context):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x002e: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:com.mapbox.mapboxsdk.storage.FileSource) from 0x002b: SPUT (r303v2 ?? I:com.mapbox.mapboxsdk.storage.FileSource) A[Catch: all -> 0x0032] com.mapbox.mapboxsdk.storage.FileSource.INSTANCE com.mapbox.mapboxsdk.storage.FileSource
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.mapbox.mapboxsdk.storage.FileSource getInstance(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x002e: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:com.mapbox.mapboxsdk.storage.FileSource) from 0x002b: SPUT (r303v2 ?? I:com.mapbox.mapboxsdk.storage.FileSource) A[Catch: all -> 0x0032] com.mapbox.mapboxsdk.storage.FileSource.INSTANCE com.mapbox.mapboxsdk.storage.FileSource
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public static String getInternalCachePath(Context context) {
        Lock lock = internalCachePathLoaderLock;
        lock.lock();
        try {
            String str = internalCachePath;
            if (str == null) {
                str = context.getCacheDir().getAbsolutePath();
                internalCachePath = str;
            }
            lock.unlock();
            return str;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static String getResourcesCachePath(Context context) {
        Lock lock = resourcesCachePathLoaderLock;
        lock.lock();
        try {
            String str = resourcesCachePath;
            if (str == null) {
                str = getCachePath(context);
                resourcesCachePath = str;
            }
            lock.unlock();
            return str;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private native void initialize(String str, String str2, AssetManager assetManager);

    public static void initializeFileDirsPaths(Context context) {
        ThreadUtils.checkThread(TAG);
        lockPathLoaders();
        if (resourcesCachePath == null || internalCachePath == null) {
            new AsyncTask().execute(context);
        }
    }

    public static void internalSetResourcesCachePath(Context context, String str, final ResourcesCachePathChangeCallback resourcesCachePathChangeCallback) {
        FileSource fileSource = getInstance(context);
        fileSource.setResourceCachePath(str, new ResourcesCachePathChangeCallback() { // from class: com.mapbox.mapboxsdk.storage.FileSource.2
            @Override // com.mapbox.mapboxsdk.storage.FileSource.ResourcesCachePathChangeCallback
            public void onError(String str2) {
                FileSource.this.deactivate();
                resourcesCachePathChangeCallback.onError(str2);
            }

            @Override // com.mapbox.mapboxsdk.storage.FileSource.ResourcesCachePathChangeCallback
            public void onSuccess(String str2) {
                FileSource.this.deactivate();
                Lock lock = FileSource.resourcesCachePathLoaderLock;
                lock.lock();
                FileSource.resourcesCachePath = str2;
                lock.unlock();
                resourcesCachePathChangeCallback.onSuccess(str2);
            }
        });
        fileSource.activate();
    }

    public static boolean isExternalStorageConfiguration(Context context) {
        String str;
        try {
            Bundle bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
            if (bundle != null) {
                return bundle.getBoolean(MapboxConstants.KEY_META_DATA_SET_STORAGE_EXTERNAL, false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = "Failed to read the package metadata: ";
            Logger.e(TAG, str, e);
            MapStrictMode.strictModeViolation(e);
            return false;
        } catch (Exception e2) {
            e = e2;
            str = "Failed to read the storage key: ";
            Logger.e(TAG, str, e);
            MapStrictMode.strictModeViolation(e);
            return false;
        }
    }

    public static boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        Logger.w(TAG, "External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).");
        return false;
    }

    public static boolean isPathWritable(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return new File(str).canWrite();
    }

    public static void lockPathLoaders() {
        internalCachePathLoaderLock.lock();
        resourcesCachePathLoaderLock.lock();
    }

    private native void setResourceCachePath(String str, ResourcesCachePathChangeCallback resourcesCachePathChangeCallback);

    public static void setResourcesCachePath(Context context, String str, ResourcesCachePathChangeCallback resourcesCachePathChangeCallback) {
        setResourcesCachePath(str, resourcesCachePathChangeCallback);
    }

    public static void setResourcesCachePath(final String str, final ResourcesCachePathChangeCallback resourcesCachePathChangeCallback) {
        final Context A0J = JQz.A0J();
        if (getInstance(A0J).isActivated()) {
            Logger.w(TAG, "Cannot set path, file source is activated. Make sure that the map or a resources download is not running.");
            resourcesCachePathChangeCallback.onError("Cannot set path, file source is activated. Make sure that the map or a resources download is not running.");
        } else if (str.equals(getResourcesCachePath(A0J))) {
            resourcesCachePathChangeCallback.onSuccess(str);
        } else {
            new FileUtils.CheckFileWritePermissionTask(new FileUtils.OnCheckFileWritePermissionListener() { // from class: com.mapbox.mapboxsdk.storage.FileSource.1
                @Override // com.mapbox.mapboxsdk.utils.FileUtils.OnCheckFileWritePermissionListener
                public void onError() {
                    String A0W = 0Pz.A0W("Path is not writable: ", str);
                    Logger.e(FileSource.TAG, A0W);
                    resourcesCachePathChangeCallback.onError(A0W);
                }

                @Override // com.mapbox.mapboxsdk.utils.FileUtils.OnCheckFileWritePermissionListener
                public void onWritePermissionGranted() {
                    SharedPreferences.Editor edit = A0J.getSharedPreferences(MapboxConstants.MAPBOX_SHARED_PREFERENCES, 0).edit();
                    edit.putString(FileSource.MAPBOX_SHARED_PREFERENCE_RESOURCES_CACHE_PATH, str);
                    edit.apply();
                    FileSource.internalSetResourcesCachePath(A0J, str, resourcesCachePathChangeCallback);
                }
            }).execute(new File(str));
        }
    }

    public static void unlockPathLoaders() {
        resourcesCachePathLoaderLock.unlock();
        internalCachePathLoaderLock.unlock();
    }

    public native void activate();

    public native void deactivate();

    public native void finalize();

    public native String getAccessToken();

    public native boolean isActivated();

    public native void setAccessToken(String str);

    public native void setApiBaseUrl(String str);

    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);
}
