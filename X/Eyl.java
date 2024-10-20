package X;

import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import java.util.Collections;
import java.util.Set;

/* loaded from: Eyl.class */
public final class Eyl {
    public static volatile GraphQLInstantGameContextType A03;
    public final String A00;
    public final GraphQLInstantGameContextType A01;
    public final Set A02;

    public Eyl(EuL euL) {
        this.A00 = euL.A01;
        this.A01 = euL.A00;
        this.A02 = Collections.unmodifiableSet(euL.A02);
    }

    public GraphQLInstantGameContextType A00() {
        if (this.A02.contains("contextType")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = GraphQLInstantGameContextType.SOLO;
                }
            }
        }
        return A03;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyl)) {
                return false;
            }
            Eyl eyl = (Eyl) obj;
            if (!11T.A0O(this.A00, eyl.A00) || A00() != eyl.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A032 = C1pq.A03(this.A00);
        return (A032 * 31) + C3o5.A03(A00());
    }
}
