package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

/* loaded from: Hvk.class */
public abstract class Hvk {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, Gul gul, I1R i1r, String str, int i) {
        CaptureRequest.Key key;
        if (gul == null || i1r == null) {
            throw AnonymousClass001.A0N("Trying to update builder after camera closed.");
        }
        int i2 = 0;
        if (i != 0) {
            int A0D = GOq.A0D(I82.A0z, gul);
            float f = 0.0f / 0.0f;
            if (A0D == -1) {
                return A0D;
            }
            if (A0D == 1 && GOp.A1Y(I1R.A0H, i1r)) {
                i2 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            int A0D2 = GOq.A0D(I82.A0D, gul);
            if (A0D2 == 4) {
                if (GOp.A1Y(I1R.A0F, i1r)) {
                    i2 = 4;
                }
            } else if (A0D2 == 3) {
                if (GOp.A1Y(I1R.A0G, i1r)) {
                    i2 = 3;
                }
            } else if (A0D2 == 1) {
                if (GOp.A1Y(I1R.A0E, i1r)) {
                    i2 = 1;
                }
            } else if (A0D2 == 0 && GOp.A1Y(I1R.A0Q, i1r)) {
                Number number = (Number) GOo.A0q(I82.A0d, gul);
                float floatValue = number.floatValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                if (str == null) {
                    throw new RuntimeException("Camera ID must be provided to check supported modes.");
                }
                Object obj = HwT.A00(cameraManager, str).get(key2);
                obj.getClass();
                if (floatValue >= 7zM.A00(obj)) {
                    builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        GOo.A19(builder, key, i2);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0169, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0234, code lost:
    
        if (X.GOq.A0D(r0, r302) != 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028f, code lost:
    
        if (r0 != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02c5, code lost:
    
        if (X.GOq.A0D(r0, r302) != 3) goto L64;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0018. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r301, X.Gul r302, X.I1R r303, int r304) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hvk.A01(android.hardware.camera2.CaptureRequest$Builder, X.Gul, X.I1R, int):void");
    }
}
