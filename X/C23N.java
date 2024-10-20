package X;

import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.23N, reason: invalid class name */
/* loaded from: 23N.class */
public final class C23N implements C23O, C1ty {
    public static final AtomicInteger A0e = new AtomicInteger(1);
    public 2JE A00;
    public 2JE A01;
    public 25P A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public 2AS A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final C00p A0E;
    public final 23S A0F;
    public final C26n A0G;
    public final C1tx A0H;
    public final C1tu A0I;
    public final C1tu A0J;
    public final C26r A0K;
    public final C1tv A0L;
    public final 1JX A0M = ComponentsSystrace.A00;
    public final ArrayList A0N;
    public final ArrayList A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final java.util.Map A0S;
    public final java.util.Map A0T;
    public final java.util.Map A0U;
    public final java.util.Map A0V;
    public final java.util.Map A0W;
    public final java.util.Map A0X;
    public final Set A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final C00p A0b;
    public final C1sr A0c;
    public final List A0d;

    public C23N(C26e c26e, C1tx c1tx, List list, java.util.Map map, int i, long j, boolean z) {
        this.A0H = c1tx;
        this.A0D = j;
        this.A08 = i;
        this.A0a = z;
        this.A0W = map;
        this.A03 = list;
        this.A0E = c26e.A0I;
        this.A0b = c26e.A0J;
        this.A0V = c26e.A0X;
        this.A0O = c26e.A0P;
        this.A0N = c26e.A0O;
        this.A0R = c26e.A0S;
        this.A0K = c26e.A06;
        this.A0L = c26e.A07;
        this.A0c = c26e.A03;
        this.A0F = c26e.A02;
        this.A0Q = c26e.A0Q;
        this.A0T = c26e.A0V;
        this.A0S = c26e.A0U;
        this.A0C = c26e.A01;
        this.A09 = c26e.A00;
        this.A0A = c26e.A0C;
        this.A0B = c26e.A0D;
        this.A0I = c26e.A05;
        this.A0P = c26e.A09;
        this.A0Z = c26e.A0A;
        this.A0G = c26e.A04;
        this.A0J = C1tt.A03(c1tx.A03);
        this.A0X = c26e.A0Y;
        this.A0d = c26e.A0T;
        this.A0Y = c26e.A0a;
        this.A0U = c26e.A0W;
        this.A04 = c26e.A0R;
        this.A02 = c26e.A08;
    }

    public int A00(long j) {
        Object A06 = this.A0b.A06(-1, j);
        if (A06 != null) {
            return ((Number) A06).intValue();
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final 2AS A01() {
        2AS r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        List list = this.A0Q;
        RenderTreeNode renderTreeNode = (RenderTreeNode) list.get(0);
        long A0I = renderTreeNode.A06.A0I();
        if (A0I != 0) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0h(AnonymousClass001.A0n("Root render unit has invalid id "), A0I));
        }
        int size = list.size();
        RenderTreeNode[] renderTreeNodeArr = new RenderTreeNode[size];
        for (int i = 0; i < size; i++) {
            renderTreeNodeArr[i] = list.get(i);
        }
        2AS r02 = new 2AS(this.A0b, renderTreeNode, (List) null, renderTreeNodeArr, this.A08, this.A0D);
        this.A07 = r02;
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            long r0 = r0.A0D
            r304 = r0
            r0 = r304
            int r0 = X.26N.A01(r0)
            r306 = r0
            r0 = r301
            int r0 = r0.A0C
            r307 = r0
            r0 = r306
            r1 = r302
            r2 = r307
            boolean r0 = X.2AR.A00(r0, r1, r2)
            r308 = r0
            r0 = r304
            int r0 = X.26N.A00(r0)
            r306 = r0
            r0 = r301
            int r0 = r0.A09
            r307 = r0
            r0 = r306
            r1 = r303
            r2 = r307
            boolean r0 = X.2AR.A00(r0, r1, r2)
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L3e
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L41
        L3e:
            r0 = 0
            r307 = r0
        L41:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23N.A02(int, int):boolean");
    }

    @Override // X.C23O
    public Set B6z() {
        return this.A0Y;
    }

    @Override // X.C23O
    public List BKO() {
        return this.A0d;
    }

    @Override // X.C1ty
    public boolean BUi() {
        return false;
    }

    @Override // X.C23O
    public boolean BV7() {
        return this.A06;
    }
}
