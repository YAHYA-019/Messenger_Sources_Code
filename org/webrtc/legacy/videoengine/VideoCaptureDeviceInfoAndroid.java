package org.webrtc.legacy.videoengine;

import X.0Pz;
import X.4YV;
import X.AnonymousClass001;
import X.GOn;
import android.hardware.Camera;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.Logging;

/* loaded from: VideoCaptureDeviceInfoAndroid.class */
public class VideoCaptureDeviceInfoAndroid {
    public static final String TAG = "VideoCaptureDeviceInfoAndroid";
    public static int mBackCameraId;
    public static String mCachedDeviceInfo;
    public static int mFrontCameraId;
    public static boolean mInitDeviceDone;

    public static int getBackCameraId() {
        return mBackCameraId;
    }

    public static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (RuntimeException e) {
            Logging.e(TAG, "Failed to get camera info", e);
            return null;
        }
    }

    public static String getCameraUniqueId(int i) {
        if (i < 0) {
            return null;
        }
        return 0Pz.A0T("Camera_", i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.String] */
    public static String getDeviceInfo() {
        ?? r0 = mCachedDeviceInfo;
        if (r0 != 0) {
            return r0;
        }
        initDevice();
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= Camera.getNumberOfCameras()) {
                    String jSONArray2 = jSONArray.toString(2);
                    mCachedDeviceInfo = jSONArray2;
                    return jSONArray2;
                }
                if (i2 == mFrontCameraId || i2 == mBackCameraId) {
                    Camera.CameraInfo cameraInfo = getCameraInfo(i2);
                    String cameraUniqueId = getCameraUniqueId(i2);
                    int[] iArr = {new int[]{HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT, 480}, new int[]{352, 288}, new int[]{320, 240}};
                    JSONArray jSONArray3 = new JSONArray();
                    for (int i3 = 0; i3 < 3; i3++) {
                        Object[] objArr = iArr[i3];
                        JSONObject A12 = AnonymousClass001.A12();
                        A12.put(Property.ICON_TEXT_FIT_WIDTH, (int) objArr[0]);
                        A12.put(Property.ICON_TEXT_FIT_HEIGHT, (int) objArr[1]);
                        jSONArray3.put(A12);
                    }
                    JSONArray jSONArray4 = new JSONArray();
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put("min_mfps", 15000);
                    A122.put("max_mfps", 30000);
                    jSONArray4.put(A122);
                    JSONObject A123 = AnonymousClass001.A12();
                    A123.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, cameraUniqueId).put("front_facing", 4YV.A1U(cameraInfo.facing)).put("orientation", cameraInfo.orientation).put("sizes", jSONArray3).put("mfpsRanges", jSONArray4);
                    jSONArray.put(A123);
                }
                i = i2 + 1;
            }
        } catch (JSONException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public static int getFrontCameraId() {
        return mFrontCameraId;
    }

    public static void initDevice() {
        synchronized (VideoCaptureDeviceInfoAndroid.class) {
            if (!mInitDeviceDone) {
                mFrontCameraId = -1;
                mBackCameraId = -1;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= Camera.getNumberOfCameras()) {
                        break;
                    }
                    Camera.CameraInfo cameraInfo = getCameraInfo(i2);
                    if (cameraInfo != null) {
                        String cameraUniqueId = getCameraUniqueId(i2);
                        if (mFrontCameraId < 0 && 4YV.A1U(cameraInfo.facing)) {
                            mFrontCameraId = i2;
                        }
                        if (mBackCameraId < 0 && !4YV.A1U(cameraInfo.facing)) {
                            mBackCameraId = i2;
                        }
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Added camera: ");
                        A0k.append(cameraUniqueId);
                        A0k.append(", id: ");
                        A0k.append(i2);
                        A0k.append(", front facing: ");
                        A0k.append(4YV.A1U(cameraInfo.facing));
                        A0k.append(", orientation: ");
                        Logging.d(TAG, GOn.A1B(A0k, cameraInfo.orientation));
                    }
                    i = i2 + 1;
                }
                mInitDeviceDone = true;
            }
        }
    }

    public static boolean isFrontFacing(Camera.CameraInfo cameraInfo) {
        return 4YV.A1U(cameraInfo.facing);
    }
}
