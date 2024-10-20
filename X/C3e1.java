package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.pando.TreeJNI;
import java.util.Set;

/* renamed from: X.3e1, reason: invalid class name */
/* loaded from: 3e1.class */
public final class C3e1 implements 1K9 {
    public Class A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final 1K9 A05;
    public final Class A06;
    public final String A07;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r302.A0A == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3e1(X.2Jf r302, X.1K9 r303, java.lang.Class r304) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3e1.<init>(X.2Jf, X.1K9, java.lang.Class):void");
    }

    public void onFailure(Throwable th) {
        this.A05.onFailure(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        GraphQLResult graphQLResult = (GraphQLResult) obj;
        TreeJNI treeJNI = (TreeJNI) ((AbstractC08294mh) graphQLResult).A03;
        treeJNI.getClass();
        GraphServiceAsset graphServiceAsset = GraphServiceAsset.getInstance();
        Class cls = this.A06;
        long j = this.A04;
        int i = this.A03;
        com.facebook.graphservice.tree.TreeJNI fromPando = com.facebook.graphservice.tree.TreeJNI.fromPando(graphServiceAsset, treeJNI, cls, j, i, this.A07);
        fromPando.getClass();
        String str = this.A01;
        if (str != null) {
            boolean z = this.A02;
            Class cls2 = this.A00;
            fromPando = z ? fromPando.getTreeList(str, cls2, i) : fromPando.getTree(str, cls2, i);
        }
        EnumC08284mf enumC08284mf = ((AbstractC08294mh) graphQLResult).A01;
        long j2 = ((AbstractC08294mh) graphQLResult).A00;
        Set set = graphQLResult.A01;
        java.util.Map map = graphQLResult.A06;
        java.util.Map map2 = graphQLResult.A05;
        long j3 = graphQLResult.A09;
        long j4 = graphQLResult.A0A;
        boolean z2 = graphQLResult.A07;
        this.A05.onSuccess(new GraphQLResult(graphQLResult.A00, enumC08284mf, ((AbstractC08294mh) graphQLResult).A02, fromPando, graphQLResult.A03, graphQLResult.A02, graphQLResult.A04, map, map2, set, j2, j4, j3, z2));
    }
}
