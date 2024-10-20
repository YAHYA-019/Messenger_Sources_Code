package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashMap;
import java.util.List;

/* loaded from: I5o.class */
public final class I5o {
    public int A00;
    public int A01;
    public int A02;
    public GJJ A03;
    public I2f A04;
    public HAu A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public HashMap A0b;
    public List A0c;
    public java.util.Map A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;

    public I5o() {
        this.A0f = false;
        this.A0M = ConstantsKt.CAMERA_ID_FRONT;
        this.A0N = ConstantsKt.CAMERA_ID_FRONT;
        this.A0O = null;
        this.A0P = ConstantsKt.CAMERA_ID_FRONT;
        this.A05 = HAu.A01;
        this.A0g = true;
    }

    public I5o(I4D i4d) {
        this.A0f = false;
        this.A0M = ConstantsKt.CAMERA_ID_FRONT;
        this.A0N = ConstantsKt.CAMERA_ID_FRONT;
        this.A0O = null;
        this.A0P = ConstantsKt.CAMERA_ID_FRONT;
        this.A05 = HAu.A01;
        this.A0g = true;
        this.A0A = i4d.A0C;
        this.A0B = i4d.A0D;
        this.A0b = i4d.A0c;
        this.A06 = i4d.A08;
        this.A07 = i4d.A09;
        this.A0I = i4d.A0J;
        this.A0J = i4d.A0K;
        this.A0U = i4d.A0V;
        this.A0V = i4d.A0W;
        this.A0R = i4d.A0S;
        this.A0S = i4d.A0T;
        this.A0T = i4d.A0U;
        this.A0j = i4d.A0j;
        this.A0d = i4d.A0e;
        this.A0l = i4d.A0m;
        this.A0i = i4d.A0i;
        this.A0Z = i4d.A0a;
        this.A0a = i4d.A0b;
        this.A0X = i4d.A0Y;
        this.A0Y = i4d.A0Z;
        this.A0D = i4d.A0E;
        this.A02 = i4d.A05;
        this.A01 = i4d.A04;
        this.A00 = i4d.A03;
        this.A0e = i4d.A0f;
        this.A0f = i4d.A0g;
        this.A0M = i4d.A0N;
        this.A0N = i4d.A0O;
        this.A0O = i4d.A0P;
        this.A0P = i4d.A0Q;
        this.A0Q = i4d.A0R;
        this.A0h = i4d.A0h;
        this.A08 = i4d.A0A;
        this.A09 = i4d.A0B;
        this.A05 = i4d.A00;
        this.A04 = i4d.A07;
        this.A0K = i4d.A0L;
        this.A0L = i4d.A0M;
        this.A0H = i4d.A0I;
        this.A0W = i4d.A0X;
        this.A0F = i4d.A0G;
        this.A0G = i4d.A0H;
        this.A0c = i4d.A0d;
        this.A03 = i4d.A06;
        this.A0g = i4d.A02;
        this.A0C = i4d.A01;
        this.A0E = i4d.A0F;
        this.A0k = i4d.A0k;
    }

    public void A00(ModelPathsHolder modelPathsHolder) {
        HashMap hashMap;
        if (modelPathsHolder == null) {
            hashMap = AnonymousClass001.A0u();
        } else {
            String modelPath = modelPathsHolder.getModelPath(HC6.A07);
            String modelPath2 = modelPathsHolder.getModelPath(HC6.A05);
            String modelPath3 = modelPathsHolder.getModelPath(HC6.A06);
            String modelPath4 = modelPathsHolder.getModelPath(HC6.A08);
            HashMap A0u = AnonymousClass001.A0u();
            String[] strArr = HMd.A00;
            A0u.put(strArr[0], modelPath);
            A0u.put(strArr[1], modelPath2);
            A0u.put(strArr[2], modelPath3);
            A0u.put(strArr[3], modelPath4);
            hashMap = new HashMap(A0u);
        }
        this.A0b = hashMap;
    }

    public void A01(ModelPathsHolder modelPathsHolder) {
        if (modelPathsHolder != null) {
            this.A0F = modelPathsHolder.getModelPath(HC6.A0V);
        }
    }

    public void A02(ModelPathsHolder modelPathsHolder) {
        if (modelPathsHolder != null) {
            this.A0H = modelPathsHolder.getModelPath(HC6.A04);
        }
    }

    public void A03(ModelPathsHolder modelPathsHolder) {
        if (modelPathsHolder != null) {
            this.A0I = modelPathsHolder.getModelPath(HC6.A02);
            this.A0J = modelPathsHolder.getModelPath(HC6.A03);
            this.A0j = false;
        }
    }

    public void A04(ModelPathsHolder modelPathsHolder) {
        if (modelPathsHolder != null) {
            this.A0U = modelPathsHolder.getModelPath(HC6.A02);
            this.A0V = modelPathsHolder.getModelPath(HC6.A03);
            HC6 hc6 = HC6.A0M;
            if (modelPathsHolder.mModelPaths.containsKey(hc6)) {
                this.A0R = modelPathsHolder.getModelPath(hc6);
            }
            HC6 hc62 = HC6.A0N;
            if (modelPathsHolder.mModelPaths.containsKey(hc62)) {
                this.A0S = modelPathsHolder.getModelPath(hc62);
            }
            this.A0j = false;
        }
    }

    public void A05(String str) {
        if (str == null || str.isEmpty()) {
            str = ConstantsKt.CAMERA_ID_FRONT;
        }
        this.A0N = str;
    }

    public void A06(String str) {
        if (str == null || str.isEmpty()) {
            str = ConstantsKt.CAMERA_ID_FRONT;
        }
        this.A0P = str;
    }
}
