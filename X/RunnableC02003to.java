package X;

import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import java.util.concurrent.Executor;

/* renamed from: X.3to, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3to.class */
public final class RunnableC02003to implements Runnable {
    public static final String __redex_internal_original_name = "BaseGraphServiceQueryExecutor$2";
    public final /* synthetic */ 1Vd A00;
    public final /* synthetic */ InterfaceC01753sq A01;
    public final /* synthetic */ InterfaceC01743sp A02;
    public final /* synthetic */ 2Jg A03;
    public final /* synthetic */ GraphQLQuery A04;
    public final /* synthetic */ GraphQLService A05;
    public final /* synthetic */ Executor A06;

    public RunnableC02003to(1Vd r302, InterfaceC01753sq interfaceC01753sq, InterfaceC01743sp interfaceC01743sp, 2Jg r305, GraphQLQuery graphQLQuery, GraphQLService graphQLService, Executor executor) {
        this.A00 = r302;
        this.A06 = executor;
        this.A05 = graphQLService;
        this.A04 = graphQLQuery;
        this.A03 = r305;
        this.A02 = interfaceC01743sp;
        this.A01 = interfaceC01753sq;
    }

    @Override // java.lang.Runnable
    public void run() {
        1JU r302 = this.A06;
        if (r302 == null) {
            r302 = 1JU.A01;
        }
        GraphQLService graphQLService = this.A05;
        GraphQLQuery graphQLQuery = this.A04;
        final 2Jg r0 = this.A03;
        final InterfaceC01743sp interfaceC01743sp = this.A02;
        final InterfaceC01753sq interfaceC01753sq = this.A01;
        1Vd r02 = this.A00;
        final C0dp A03 = r02.A03();
        final 1Wx A07 = r02.A07();
        final boolean isLiveQuery = graphQLQuery.isLiveQuery();
        final boolean z = false;
        graphQLService.handleQuery(graphQLQuery, new AbstractC04134a1(A03, interfaceC01753sq, interfaceC01743sp, r0, A07, z, isLiveQuery) { // from class: X.4Zx
            public final C0dp A00;
            public final InterfaceC01753sq A01;
            public final InterfaceC01743sp A02;
            public final 2Jg A03;
            public final 1Wx A04;
            public final boolean A05;
            public final boolean A06;

            {
                super(r0);
                this.A02 = interfaceC01743sp;
                this.A01 = interfaceC01753sq;
                this.A06 = z;
                this.A03 = r0;
                this.A00 = A03;
                this.A04 = A07;
                this.A05 = isLiveQuery;
            }

            @Override // X.AbstractC04134a1
            public void onError(Throwable th) {
                0fH.A0s("GraphServiceQueryExecutor", "query error", th);
                String str = this.A03.A08;
                Throwable th2 = th;
                if ((th instanceof C4Qa) && ((2yD) 1Bi.A03(16385)).AZk(36325759649862619L)) {
                    th2 = ((C4Qa) th).A00(str);
                }
                this.A01.BQ9(th2);
                TigonError tigonErrorFromException = GraphServicesExceptionMigrationAdapter.getTigonErrorFromException(th);
                if (tigonErrorFromException == null || tigonErrorFromException.domainErrorCode != 401) {
                    return;
                }
                this.A04.A04((String) null);
            }

            @Override // X.AbstractC04134a1
            public void onModelUpdate(Object obj, Summary summary) {
                EnumC08284mf A00 = 1Wu.A00(summary);
                if ((this.A05 && summary != null && summary.source.equals("network")) || this.A06 || summary == null || summary.isNetworkComplete) {
                    this.A02.BQ3(new GraphQLResult(A00, summary, obj, this.A00.now()));
                }
            }
        }, r302, null);
    }
}
