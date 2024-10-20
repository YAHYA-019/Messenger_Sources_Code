package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.5nk, reason: invalid class name */
/* loaded from: 5nk.class */
public final class C5nk {
    public static final /* synthetic */ C5nk A00 = new Object();

    public static final ImmutableList A00(5nX r301) {
        5nW r0 = (5nW) r301;
        C5fr c5fr = r0.A08;
        if (c5fr == null) {
            return r0.A0A;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) c5fr);
        builder.addAll(r0.A0A);
        ImmutableList build = builder.build();
        11T.A0D(build);
        return build;
    }
}
