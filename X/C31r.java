package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.mapbox.mapboxsdk.style.layers.Property;
import kotlin.jvm.functions.Function1;

/* renamed from: X.31r, reason: invalid class name */
/* loaded from: 31r.class */
public final /* synthetic */ class C31r implements Function1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2Xo A01;

    public /* synthetic */ C31r(2Xo r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        2Xo r0 = this.A01;
        int i = this.A00;
        java.util.Map map = (java.util.Map) obj;
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1BK.A0j(r0));
        map.put(Property.SYMBOL_Z_ORDER_SOURCE, 3GP.A00(i));
        boolean z = true;
        if (i != 1 && i != 3) {
            z = false;
        }
        map.put("async", Boolean.valueOf(z));
        return 04S.A00;
    }
}
