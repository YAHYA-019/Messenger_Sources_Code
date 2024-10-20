package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.79g, reason: invalid class name */
/* loaded from: 79g.class */
public abstract class C79g {
    /* JADX WARN: Type inference failed for: r0v12, types: [X.79h] */
    public static final C79h A00(C78z c78z, C78z... c78zArr) {
        11T.A0F(c78z, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) c78z);
        for (C78z c78z2 : c78zArr) {
            if (c78z2 != null) {
                builder.m11011add((Object) c78z2);
            }
        }
        final ImmutableList build = builder.build();
        11T.A0D(build);
        return new C78z(build) { // from class: X.79h
            public final ImmutableList A00;

            {
                11T.A0F(build, 1);
                this.A00 = build;
            }

            @Override // X.C78z
            public void CfW(Capabilities capabilities, C77n c77n, 6RU r304) {
                11T.A0F(r304, 0);
                11T.A0F(c77n, 1);
                11T.A0F(capabilities, 2);
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    ((C78z) it.next()).CfW(capabilities, c77n, r304);
                }
            }

            @Override // X.C78z
            public void Cfg(Capabilities capabilities, C77n c77n, 6RU r304) {
                11T.A0F(r304, 0);
                11T.A0F(c77n, 1);
                11T.A0F(capabilities, 2);
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    ((C78z) it.next()).Cfg(capabilities, c77n, r304);
                }
            }
        };
    }
}
