package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView;

/* loaded from: Hvc.class */
public abstract class Hvc {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r302 != 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(android.view.View r301, int r302) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L64
            r0 = 3
            r303 = r0
            r0 = 3
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2e
            r0 = 0
            r306 = r0
            r0 = 4
            r307 = r0
            r0 = 4
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r307
            if (r0 == r1) goto L32
        L2e:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L32:
            r0 = r301
            org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView r0 = (org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView) r0
            r301 = r0
            r0 = r306
            if (r0 != 0) goto L43
            r0 = r303
            if (r0 != 0) goto L43
            r0 = 0
            r305 = r0
        L43:
            r0 = r301
            r1 = r305
            r0.setZOrderMediaOverlay(r1)
            r0 = r303
            if (r0 == 0) goto L64
            r0 = 1065353216(0x3f800000, float:1.0)
            r307 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r308 = r0
            r0 = 1039516303(0x3df5c28f, float:0.12)
            r303 = r0
            r0 = 1039516303(0x3df5c28f, float:0.12)
            r304 = r0
            r0 = r301
            r1 = r304
            r2 = r304
            r3 = r304
            r4 = r308
            r0.setGlClearColor(r1, r2, r3, r4)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hvc.A00(android.view.View, int):void");
    }

    public static final void A01(View view, IZw iZw) {
        if ((view instanceof ViEAndroidGLES20TextureView) && iZw.A0A) {
            ViEAndroidGLES20TextureView viEAndroidGLES20TextureView = (ViEAndroidGLES20TextureView) view;
            viEAndroidGLES20TextureView.setScaleType(1);
            viEAndroidGLES20TextureView.setGlClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            8Jp r0 = iZw.A03;
            if (r0 != null) {
                Resources resources = viEAndroidGLES20TextureView.getResources();
                viEAndroidGLES20TextureView.setRoundedCornerRadius(7zL.A01(resources, r0.A03));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) GOp.A0C(viEAndroidGLES20TextureView);
                int dimensionPixelSize = resources.getDimensionPixelSize(r0.A02);
                marginLayoutParams.rightMargin = dimensionPixelSize;
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                ((ViewGroup.LayoutParams) marginLayoutParams).width = resources.getDimensionPixelSize(r0.A04);
                ((ViewGroup.LayoutParams) marginLayoutParams).height = resources.getDimensionPixelSize(r0.A01);
                viEAndroidGLES20TextureView.setLayoutParams(marginLayoutParams);
            }
        }
        view.setVisibility(DKG.A00(iZw.A0A ? 1 : 0));
    }
}
