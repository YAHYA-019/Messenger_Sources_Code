package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.7zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zj.class */
public final class C12177zj {
    public final 1Br A00;
    public final 1De A01;
    public final InterfaceC12197zl A02;
    public final ImmutableMap A03;

    /* JADX WARN: Type inference failed for: r305v7, types: [X.7zn, java.lang.Object] */
    public C12177zj(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A02 = (InterfaceC12197zl) 1Bn.A0E((Context) null, r0, 67306);
        this.A00 = 1Bu.A03(r0, 67307);
        Set<5zK> set = (Set) 1Bn.A0E((Context) null, r0, ActionId.DISPLAYED);
        11T.A0A(set);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (5zK r02 : set) {
            if (!r02.A03) {
                C00i c00i = r02.A01;
                Object obj = c00i.get();
                C12217zn c12217zn = C12217zn.A00;
                C12217zn c12217zn2 = c12217zn;
                if (c12217zn == null) {
                    ?? obj2 = new Object();
                    C12217zn.A00 = obj2;
                    c12217zn2 = obj2;
                }
                if (obj != c12217zn2) {
                    builder.put(r02.A00, c00i);
                }
            }
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        this.A03 = build;
    }

    public final InterfaceC12197zl A00(5Pm r302, boolean z) {
        Object obj;
        6Ay BCm = r302.BCm();
        if (BCm != null) {
            if (z) {
                obj = (C9yy) this.A00.A00.get();
            } else {
                ImmutableList BDF = BCm.BDF();
                if (BDF != null) {
                    1Du it = BDF.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        ImmutableMap immutableMap = this.A03;
                        if (immutableMap.containsKey(next)) {
                            C00i c00i = (C00i) immutableMap.get(next);
                            if (c00i == null) {
                                return null;
                            }
                            obj = c00i.get();
                        }
                    }
                }
            }
            return (InterfaceC12197zl) obj;
        }
        0fH.A0n("SnippetGenerator", "null storyAttachment");
        return this.A02;
    }

    public final String A01(C12167zi c12167zi) {
        5Pm r0 = c12167zi.A01;
        boolean z = false;
        if (c12167zi.A00 != 0) {
            z = true;
        }
        InterfaceC12197zl A00 = A00(r0, z);
        if (A00 != null) {
            return A00.AKz(c12167zi);
        }
        return null;
    }
}
