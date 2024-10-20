package X;

import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4np, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4np.class */
public abstract class AbstractC08704np {
    public static ImmutableList A00(ImmutableList immutableList, Enum r302) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) EnumHelper.A00(r302, (String) it.next()));
        }
        return builder.build();
    }
}
