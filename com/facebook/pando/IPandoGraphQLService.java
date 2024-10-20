package com.facebook.pando;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3rz;
import X.GI4;
import java.util.concurrent.Executor;

/* loaded from: IPandoGraphQLService.class */
public interface IPandoGraphQLService {

    /* loaded from: IPandoGraphQLService$Result.class */
    public final class Result {
        public final Token cancelToken;
        public final Object tree;

        public Result(Object obj, Token token) {
            11T.A0F(token, 2);
            this.tree = obj;
            this.cancelToken = token;
        }

        public static /* synthetic */ Result copy$default(Result result, Object obj, Token token, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = result.tree;
            }
            if ((i & 2) != 0) {
                token = result.cancelToken;
            }
            11T.A0F(token, 1);
            return new Result(obj, token);
        }

        public final Object component1() {
            return this.tree;
        }

        public final Token component2() {
            return this.cancelToken;
        }

        public final Result copy(Object obj, Token token) {
            11T.A0F(token, 1);
            return new Result(obj, token);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                if (!11T.A0O(this.tree, result.tree) || !11T.A0O(this.cancelToken, result.cancelToken)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return 1BK.A03(this.cancelToken, AnonymousClass001.A02(this.tree) * 31);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Result(tree=");
            A0k.append(this.tree);
            A0k.append(", cancelToken=");
            return AnonymousClass002.A0K(this.cancelToken, A0k);
        }
    }

    /* loaded from: IPandoGraphQLService$Token.class */
    public interface Token extends C3rz {
    }

    PandoGraphQLConsistencyJNI graphQLConsistency();

    Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, GI4 gi4, Executor executor);
}
