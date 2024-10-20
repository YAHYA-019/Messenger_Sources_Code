package X;

import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.3sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3sy.class */
public final class C01803sy implements C3sz {
    public ImmutableMap A00;

    private ImmutableMap A00() {
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            builder.put("profile_image_small_size", Integer.valueOf((AbstractC01653se.A00() * 40) / ActionId.OFFLINE));
            builder.put("profile_image_big_size", Integer.valueOf((AbstractC01653se.A00() * 94) / ActionId.OFFLINE));
            builder.put("scale", AbstractC01653se.A01());
            immutableMap = builder.build();
            this.A00 = immutableMap;
        }
        return immutableMap;
    }

    @Override // X.C3sz
    public ImmutableSet B1E() {
        return A00().keySet();
    }

    @Override // X.C3sz
    public Object B1F(2Jg r302, String str) {
        return A00().get(str);
    }
}
