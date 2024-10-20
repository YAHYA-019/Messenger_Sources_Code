package androidx.graphics.path;

import com.facebook.acra.constants.ActionId;

/* loaded from: ConicConverter.class */
public final class ConicConverter {
    public float[] quadraticData = new float[ActionId.APP_DID_FINISH_LAUNCHING];

    private final native int internalConicToQuadratics(float[] fArr, int i, float[] fArr2, float f, float f2);
}
