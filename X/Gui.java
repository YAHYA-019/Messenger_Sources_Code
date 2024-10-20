package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: Gui.class */
public final class Gui extends I1R {
    public int A00;
    public final CameraExtensionCharacteristics A01;
    public final I1R A02;
    public final List A03;
    public final java.util.Map A05 = AnonymousClass001.A0u();
    public final java.util.Map A08 = AnonymousClass001.A0u();
    public final java.util.Map A07 = AnonymousClass001.A0u();
    public final java.util.Map A06 = AnonymousClass001.A0u();
    public final java.util.Map A04 = AnonymousClass001.A0u();

    public Gui(CameraExtensionCharacteristics cameraExtensionCharacteristics, I1R i1r) {
        this.A00 = -1;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        this.A02 = i1r;
        this.A01 = cameraExtensionCharacteristics;
        AnonymousClass001.A1J(A0s, -1);
        this.A00 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    private List A00(CameraExtensionCharacteristics cameraExtensionCharacteristics, HX6 hx6, int i, int i2, int i3) {
        List emptyList;
        HashSet A1E;
        ArrayList A0t;
        if (cameraExtensionCharacteristics == null) {
            A0t = Collections.emptyList();
        } else {
            List<Size> extensionSupportedSizes = i == 1 ? cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2) : cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
            if (extensionSupportedSizes == null || extensionSupportedSizes.isEmpty()) {
                emptyList = Collections.emptyList();
            } else {
                int size = extensionSupportedSizes.size();
                ArrayList A0t2 = AnonymousClass001.A0t(size);
                for (int i4 = 0; i4 < size; i4++) {
                    A0t2.add(new IBB(extensionSupportedSizes.get(i4).getWidth(), extensionSupportedSizes.get(i4).getHeight()));
                }
                emptyList = Collections.unmodifiableList(A0t2);
            }
            List A1H = GOn.A1H(hx6, this.A02);
            if (A1H.size() < emptyList.size()) {
                A1E = AbF.A1E(A1H);
                A1H = emptyList;
            } else {
                A1E = AbF.A1E(emptyList);
            }
            int size2 = A1H.size();
            int size3 = A1E.size();
            A0t = AnonymousClass001.A0t(size3);
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = A1H.get(i5);
                if (A1E.contains(obj)) {
                    A0t.add(obj);
                    if (A0t.size() == size3) {
                        return A0t;
                    }
                }
            }
        }
        return A0t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (r0.contains(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        if (X.GOp.A1Y(X.I1R.A0g, r301.A02) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A02(X.HX6 r302) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gui.A02(X.HX6):java.lang.Object");
    }

    public void A03(int i) {
        this.A00 = i;
        if (i != -1) {
            java.util.Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                return;
            }
            map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
        }
    }
}
