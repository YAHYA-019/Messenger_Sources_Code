package com.mapbox.mapboxsdk.http;

import X.0Pz;
import X.JQz;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.log.Logger;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: LocalRequestTask.class */
public class LocalRequestTask extends AsyncTask {
    public static final String TAG = "Mbgl-LocalRequestTask";
    public OnLocalRequestResponse requestResponse;

    /* loaded from: LocalRequestTask$OnLocalRequestResponse.class */
    public interface OnLocalRequestResponse {
        void onResponse(byte[] bArr);
    }

    public LocalRequestTask(OnLocalRequestResponse onLocalRequestResponse) {
        this.requestResponse = onLocalRequestResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Exception, java.io.InputStream] */
    public static byte[] loadFile(AssetManager assetManager, String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                ?? open = assetManager.open(str);
                try {
                    byte[] bArr = new byte[open.available()];
                    open.read(bArr);
                    try {
                        open.close();
                        return bArr;
                    } catch (IOException unused) {
                        logFileError(open);
                        return bArr;
                    }
                } catch (IOException e) {
                    e = e;
                    inputStream = inputStream2;
                    inputStream2 = open;
                    logFileError(e);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                            return inputStream;
                        } catch (IOException e2) {
                            logFileError(e2);
                            return inputStream;
                        }
                    }
                    return inputStream;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = open;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                            throw th;
                        } catch (IOException e3) {
                            logFileError(e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void logFileError(Exception exc) {
        Logger.e(TAG, "Load file failed", exc);
        MapStrictMode.strictModeViolation("Load file failed", exc);
    }

    @Override // android.os.AsyncTask
    public byte[] doInBackground(String... strArr) {
        return loadFile(JQz.A0J().getAssets(), 0Pz.A0W("integration/", strArr[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(byte[] bArr) {
        OnLocalRequestResponse onLocalRequestResponse;
        super.onPostExecute((LocalRequestTask) bArr);
        if (bArr == null || (onLocalRequestResponse = this.requestResponse) == null) {
            return;
        }
        onLocalRequestResponse.onResponse(bArr);
    }
}
