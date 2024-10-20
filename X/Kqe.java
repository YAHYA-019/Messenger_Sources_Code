package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;

/* loaded from: Kqe.class */
public final class Kqe {
    public int A05;
    public LatLng A06;
    public LatLngBounds A07;
    public float A01 = -2.1474836E9f;
    public float A02 = -2.1474836E9f;
    public float A03 = -2.1474836E9f;
    public float A04 = -2.1474836E9f;
    public float A00 = -2.1474836E9f;

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("{mLatLng=");
        A10.append(this.A06);
        A10.append(", mZoom=");
        A10.append(this.A01);
        A10.append(", mZoomBy=");
        A10.append(this.A02);
        A10.append(", mZoomX=");
        A10.append(this.A03);
        A10.append(", mZoomY=");
        A10.append(this.A04);
        A10.append(", mXPixel=");
        A10.append(-2.1474836E9f);
        A10.append(", mYPixel=");
        A10.append(-2.1474836E9f);
        A10.append(", mRotation = ");
        A10.append(this.A00);
        A10.append(", mRendererBounds=");
        A10.append(this.A07);
        A10.append(", mWidth=");
        A10.append(0);
        A10.append(", mHeight=");
        A10.append(0);
        A10.append(", mPadding=");
        return AbstractC2327GOs.A0W(A10, this.A05);
    }
}
