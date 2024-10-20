package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7z0, reason: invalid class name */
/* loaded from: 7z0.class */
public interface C7z0 extends C47t {
    void A7B(String str, String str2, TimeUnit timeUnit, long j);

    void ADA(GraphQLResult graphQLResult, String str);

    void ADB(Summary summary, String str, long j, boolean z);

    @Override // X.C47t
    void Bf9(String str, boolean z);

    void BfB(GraphQLResult graphQLResult, String str, boolean z);

    void BfC(Summary summary, String str, boolean z);

    void CYV(Summary summary, String str, long j, long j2, boolean z, boolean z2);
}
