package com.mapbox.mapboxsdk.utils;

import X.0Pz;
import android.os.AsyncTask;
import com.mapbox.mapboxsdk.log.Logger;
import java.io.File;

/* loaded from: FileUtils.class */
public class FileUtils {
    public static final String TAG = "Mbgl-FileUtils";

    /* loaded from: FileUtils$CheckFileReadPermissionTask.class */
    public class CheckFileReadPermissionTask extends AsyncTask {
        public final OnCheckFileReadPermissionListener listener;

        public CheckFileReadPermissionTask(OnCheckFileReadPermissionListener onCheckFileReadPermissionListener) {
            this.listener = onCheckFileReadPermissionListener;
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(File... fileArr) {
            try {
                return Boolean.valueOf(fileArr[0].canRead());
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            this.listener.onError();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            OnCheckFileReadPermissionListener onCheckFileReadPermissionListener = this.listener;
            if (booleanValue) {
                onCheckFileReadPermissionListener.onReadPermissionGranted();
            } else {
                onCheckFileReadPermissionListener.onError();
            }
        }
    }

    /* loaded from: FileUtils$CheckFileWritePermissionTask.class */
    public class CheckFileWritePermissionTask extends AsyncTask {
        public final OnCheckFileWritePermissionListener listener;

        public CheckFileWritePermissionTask(OnCheckFileWritePermissionListener onCheckFileWritePermissionListener) {
            this.listener = onCheckFileWritePermissionListener;
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(File... fileArr) {
            try {
                return Boolean.valueOf(fileArr[0].canWrite());
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            this.listener.onError();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            OnCheckFileWritePermissionListener onCheckFileWritePermissionListener = this.listener;
            if (booleanValue) {
                onCheckFileWritePermissionListener.onWritePermissionGranted();
            } else {
                onCheckFileWritePermissionListener.onError();
            }
        }
    }

    /* loaded from: FileUtils$OnCheckFileReadPermissionListener.class */
    public interface OnCheckFileReadPermissionListener {
        void onError();

        void onReadPermissionGranted();
    }

    /* loaded from: FileUtils$OnCheckFileWritePermissionListener.class */
    public interface OnCheckFileWritePermissionListener {
        void onError();

        void onWritePermissionGranted();
    }

    public static void deleteFile(final String str) {
        new Thread(new Runnable() { // from class: com.mapbox.mapboxsdk.utils.FileUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.delete()) {
                            Logger.d(FileUtils.TAG, 0Pz.A0W("File deleted to save space: ", str));
                        } else {
                            Logger.e(FileUtils.TAG, 0Pz.A0W("Failed to delete file: ", str));
                        }
                    }
                } catch (Exception e) {
                    Logger.e(FileUtils.TAG, "Failed to delete file: ", e);
                }
            }
        }).start();
    }
}
