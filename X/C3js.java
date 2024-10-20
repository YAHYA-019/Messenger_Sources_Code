package X;

import com.facebook.acra.constants.ActionId;
import com.google.android.gms.common.Feature;

/* renamed from: X.3js, reason: invalid class name */
/* loaded from: 3js.class */
public final class C3js extends UnsupportedOperationException {
    public final Feature zza;

    public C3js(Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AnonymousClass000.A00(ActionId.APPLY_OPTIMISTICS).concat(String.valueOf(String.valueOf(this.zza)));
    }
}
